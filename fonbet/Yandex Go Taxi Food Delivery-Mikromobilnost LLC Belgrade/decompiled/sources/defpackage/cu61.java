package defpackage;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Vector;
import ru.CryptoPro.JCP.KeyStore.MutexInterface;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class cu61 implements MutexInterface {
    public FileChannel a;
    public FileLock b;
    public final String c;
    public final ts61 d;
    public boolean e = false;

    public cu61(String str) {
        Vector vector;
        ts61 ts61Var;
        int i = 0;
        this.c = str;
        synchronized (ts61.b) {
            while (true) {
                try {
                    vector = ts61.b;
                    if (i >= vector.size()) {
                        i = -1;
                        break;
                    } else if (vector.elementAt(i).equals(str)) {
                        break;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i == -1) {
                i = vector.size();
                vector.add(str);
                ts61.c.add(new ts61());
            }
            ts61Var = (ts61) ts61.c.elementAt(i);
        }
        this.d = ts61Var;
    }

    public static String getDefault(Class cls, String[] strArr) {
        return new JCPPref(cls).get("UnixMutex_class_pathToLocks", strArr != null ? strArr[!Platform.isWindows() ? 1 : 0] : null);
    }

    public static boolean ifWrite(Class cls) {
        return nzs.u(cls);
    }

    public static void setDefault(Class cls, String str) {
        new JCPPref(cls).put("UnixMutex_class_pathToLocks", str);
    }

    public void fileLock() throws IOException {
        String str;
        if (this.b != null) {
            throw new EOFException("Double lock");
        }
        String str2 = this.c;
        File file = new File(str2);
        if (!file.exists()) {
            this.e = true;
        }
        try {
            this.a = new RandomAccessFile(file, "rws").getChannel();
        } catch (IOException e) {
            if (this.e) {
                throw e;
            }
            JCPLogger.thrown("Exception. Try to reopen mutex: ", e);
            for (int i = 0; i < 4; i++) {
                try {
                    this.a = FileChannel.open(Paths.get(str2, new String[0]), EnumSet.of(StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE), new FileAttribute[0]);
                    break;
                } catch (IOException e2) {
                    if (i == 3) {
                        throw e2;
                    }
                    JCPLogger.thrown("IOException. Try to reopen mutex: ", e2);
                    try {
                        Thread.sleep((1 << i) - 1);
                    } catch (InterruptedException e3) {
                        kbs.r(e3);
                        return;
                    }
                }
            }
        }
        if (this.e && !Platform.isWindows() && !Platform.isAndroid) {
            try {
                int waitFor = Runtime.getRuntime().exec("chmod a+rwx " + str2).waitFor();
                if (waitFor != 0) {
                    JCPLogger.warning("Chmod shell script failed. Returned code: ", Integer.valueOf(waitFor));
                }
                HashSet hashSet = new HashSet();
                hashSet.add(PosixFilePermission.OWNER_READ);
                hashSet.add(PosixFilePermission.OWNER_WRITE);
                hashSet.add(PosixFilePermission.GROUP_READ);
                hashSet.add(PosixFilePermission.GROUP_WRITE);
                hashSet.add(PosixFilePermission.OTHERS_READ);
                hashSet.add(PosixFilePermission.OTHERS_WRITE);
                Files.setPosixFilePermissions(file.toPath(), hashSet);
            } catch (IOException e4) {
                e = e4;
                str = "IOException while exec Shell Chmod Script";
                JCPLogger.warning(str, e);
                this.b = this.a.lock();
            } catch (InterruptedException e5) {
                e = e5;
                Thread.currentThread().interrupt();
                str = "Shell Chmod Script interrupted";
                JCPLogger.warning(str, e);
                this.b = this.a.lock();
            }
        }
        try {
            this.b = this.a.lock();
        } catch (OverlappingFileLockException e6) {
            IOException iOException = new IOException(e6.getMessage());
            try {
                iOException.initCause(e6);
                throw iOException;
            } catch (Throwable unused) {
                throw iOException;
            }
        }
    }

    public boolean fileTryLock() throws IOException {
        if (this.b != null) {
            throw new EOFException("Double lock");
        }
        FileChannel channel = new RandomAccessFile(new File(this.c), "rw").getChannel();
        this.a = channel;
        try {
            FileLock tryLock = channel.tryLock();
            this.b = tryLock;
            return tryLock != null;
        } catch (OverlappingFileLockException e) {
            IOException iOException = new IOException(e.getMessage());
            try {
                iOException.initCause(e);
                throw iOException;
            } catch (Throwable unused) {
                throw iOException;
            }
        }
    }

    public void fileUnlock() throws IOException {
        FileLock fileLock = this.b;
        if (fileLock == null) {
            throw new FileNotFoundException("Try to unlock not locked mutex");
        }
        fileLock.release();
        this.b = null;
        FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
        this.a = null;
    }

    public void fileUnlockFinally() {
        try {
            fileUnlock();
        } catch (IOException e) {
            JCPLogger.warning("ignore code ", (Throwable) e);
        }
    }

    public final void finalize() {
        if (this.b != null) {
            unlockFinally();
            JCPLogger.warning("Finalizing locked mutex");
        }
        super.finalize();
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MutexInterface
    public void lock() throws Exception {
        ts61 ts61Var = this.d;
        ts61Var.lock();
        try {
            fileLock();
        } catch (Exception e) {
            ts61Var.unlock();
            throw e;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.c);
        stringBuffer.append(this.b != null ? "(locked)" : "(unlocked)");
        return stringBuffer.toString();
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MutexInterface
    public boolean tryLock() throws IOException {
        try {
            this.d.tryLock();
            return false;
        } catch (Exception e) {
            IOException iOException = new IOException(e.toString());
            iOException.initCause(e);
            throw iOException;
        }
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MutexInterface
    public void unlock() throws IOException {
        try {
            fileUnlock();
            try {
                this.d.unlock();
            } catch (Exception e) {
                IOException iOException = new IOException(e.toString());
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Exception e2) {
            IOException iOException2 = new IOException(e2.toString());
            iOException2.initCause(e2);
            throw iOException2;
        }
    }

    @Override // ru.CryptoPro.JCP.KeyStore.MutexInterface
    public void unlockFinally() {
        ts61 ts61Var = this.d;
        try {
            fileUnlockFinally();
        } finally {
            ts61Var.unlockFinally();
        }
    }
}
