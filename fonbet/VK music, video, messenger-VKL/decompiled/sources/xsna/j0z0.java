package xsna;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class j0z0 {
    public static final h0z0 c;
    public static final i0z0 d;
    public static final r5k e;
    public static final long f;
    public static final long g;
    public static volatile j0z0 h;
    public final Set a = tj0.c();
    public final File b;

    static {
        TimeUnit.MINUTES.toMillis(30L);
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(7L);
        long millis = timeUnit.toMillis(1L);
        c = new h0z0();
        d = new i0z0();
        e = new r5k(1);
        f = 104857600L;
        g = millis;
    }

    public j0z0(File file) {
        this.b = file;
    }

    public static File a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new Exception("can't get context cache dir");
        }
        File file = new File(cacheDir, "mytargetcache");
        if (!file.exists() && !file.mkdirs()) {
            throw new Exception("can't create mytarget cache dir");
        }
        if (file.isDirectory() && file.canWrite()) {
            return file;
        }
        throw new Exception("can't write to mytarget cache dir");
    }

    public static File b(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                e(inputStream, fileOutputStream);
                fileOutputStream.close();
                return file;
            } finally {
            }
        } catch (Throwable th) {
            gu8.d("DiskCache: exception - " + th);
            return null;
        }
    }

    public static void e(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[8192];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr, 0, 8192);
                        if (read == -1) {
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("DiskCache: Error - "), th);
            throw th;
        }
    }

    public static j0z0 g(Context context) {
        j0z0 j0z0Var;
        j0z0 j0z0Var2 = h;
        if (j0z0Var2 != null) {
            return j0z0Var2;
        }
        synchronized (j0z0.class) {
            j0z0Var = h;
            if (j0z0Var == null) {
                try {
                    j0z0Var = new j0z0(a(context));
                    h = j0z0Var;
                } catch (Exception e2) {
                    gu8.d("DiskCache: unable to create cache dir: " + e2);
                    return null;
                }
            }
        }
        return j0z0Var;
    }

    public final synchronized File c(InputStream inputStream, String str) {
        File d2;
        n();
        d2 = d(str, ".mp3");
        gu8.c(null, "DiskCache: Save audio - " + d2.getPath());
        return b(inputStream, d2);
    }

    public final File d(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder("mytrg_");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b : digest) {
                sb2.append(String.format("%02X", Byte.valueOf(b)));
            }
            str3 = sb2.toString().toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            str3 = null;
        }
        String a = i5s.a(sb, str3, str2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b.getAbsolutePath());
        return new File(i5s.a(sb3, File.separator, a));
    }

    public final synchronized String f(String str, String str2) {
        n();
        File d2 = d(str, str2);
        if (!d2.exists()) {
            return null;
        }
        gu8.c(null, "DiskCache: Get path - " + d2.getPath());
        try {
            return d2.getAbsolutePath();
        } catch (Throwable th) {
            gu8.d("DiskCache: exception - " + th);
            return null;
        }
    }

    public final synchronized File h(InputStream inputStream, String str) {
        File d2;
        n();
        d2 = d(str, ".mp4");
        gu8.c(null, "DiskCache: Save video - " + d2.getPath());
        return b(inputStream, d2);
    }

    public final synchronized void i() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file.exists() && file.isFile()) {
                    gu8.c(null, "DiskCache: Perform pending deletion - " + file.getPath());
                    if (!file.delete()) {
                        gu8.c(null, "DiskCache: Unable to delete file - " + file.getAbsolutePath());
                    }
                }
                it.remove();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j() {
        File[] listFiles = this.b.listFiles(c);
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, new g0z0());
        long j = 0;
        boolean z = false;
        for (File file : listFiles) {
            if (!z) {
                long length = file.length() + j;
                if (length > f) {
                    z = true;
                }
                j = length;
            }
            if (z) {
                gu8.c(null, "DiskCache: Remove file to enforce size limit - " + file.getPath());
                if (!file.delete()) {
                    gu8.c(null, "DiskCache: Unable to delete file - " + file.getAbsolutePath());
                }
            }
        }
    }

    public final void k() {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        File file = this.b;
        long lastModified = currentTimeMillis - file.lastModified();
        long j = g;
        if (lastModified > j && (listFiles = file.listFiles(c)) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && currentTimeMillis - file2.lastModified() > j) {
                    gu8.c(null, "DiskCache: Remove expired file - " + file2.getPath());
                    if (!file2.delete()) {
                        gu8.c(null, "DiskCache: Unable to delete file - " + file2.getAbsolutePath());
                    }
                }
            }
            if (file.setLastModified(currentTimeMillis)) {
                return;
            }
            gu8.c(null, "DiskCache: Unable to set last modified to dir - " + file.getAbsolutePath());
        }
    }

    public final void l() {
        File[] listFiles = this.b.listFiles(e);
        if (listFiles != null) {
            if (listFiles.length <= 10) {
                return;
            }
            Arrays.sort(listFiles, new wpl(1));
            for (int i = 10; i < listFiles.length; i++) {
                String path = listFiles[i].getPath();
                wga0.b("DiskCache: Remove redundant audio - ", path, null);
                if (!listFiles[i].delete()) {
                    wga0.b("DiskCache: Unable to remove file - ", path, null);
                }
            }
        }
    }

    public final void m() {
        File[] listFiles = this.b.listFiles(d);
        if (listFiles != null) {
            if (listFiles.length <= 10) {
                return;
            }
            Arrays.sort(listFiles, new gpn(1));
            for (int i = 10; i < listFiles.length; i++) {
                String path = listFiles[i].getPath();
                wga0.b("DiskCache: Remove redundant video - ", path, null);
                if (!listFiles[i].delete()) {
                    wga0.b("DiskCache: Unable to remove file - ", path, null);
                }
            }
        }
    }

    public final synchronized void n() {
        try {
            if (!this.b.exists()) {
                gu8.c(null, "DiskCache: cache dir was deleted during runtime, re-creating...");
                if (!this.b.mkdirs()) {
                    throw new Exception("can't re-create cache dir in runtime");
                }
            } else {
                i();
                j();
                k();
                m();
                l();
            }
        } catch (Throwable th) {
            gu8.d("DiskCache: exception - " + th);
        }
    }
}
