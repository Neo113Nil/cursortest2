package defpackage;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.KeyStore.ContainerEncoder;
import ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageMedia;
import ru.CryptoPro.JCP.KeyStore.MediaInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class hq61 implements ContainerReaderInterface {
    public static final ResourceBundle d = ResourceBundle.getBundle("ru.CryptoPro.JCP.tools.resources.logger", Locale.getDefault());
    public final String a;
    public final HDImageMedia b;
    public boolean c = false;

    public hq61(HDImageMedia hDImageMedia, String str, boolean z) {
        int i = 0;
        this.b = hDImageMedia;
        this.a = str;
        if (z) {
            File file = new File(str);
            boolean z2 = false;
            while (true) {
                if (i >= 3) {
                    break;
                }
                if (file.isDirectory()) {
                    z2 = true;
                } else {
                    if (file.mkdir()) {
                        z2 = true;
                        break;
                    }
                    JCPLogger.warning("Can't create", file.toString());
                }
                i++;
            }
            if (z2) {
                return;
            }
            throw new SecurityException("Failed to make dir: " + this.a);
        }
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    public final void close() {
        this.c = true;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    public final int fileSize(int i) {
        File file = new File(this.a, ContainerEncoder.KEYNAMES[i]);
        if (!file.exists() || !file.isFile()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        long length = file.length();
        if (length <= 2147483647L) {
            return new Long(length).intValue();
        }
        ny61.v("File is too long");
        return 0;
    }

    public final void finalize() {
        if (!this.c) {
            JCPLogger.warning(d.getString("UclosedFolder"));
        }
        super.finalize();
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    public final String folder() {
        return new File(this.a).getName();
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    public final Date getCreationDate() {
        return new Date(new File(this.a).lastModified());
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    public final MediaInterface getMedia() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    public final boolean login(char[] cArr) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] readFile(int i, int i2, int i3) {
        ?? r6;
        Throwable th;
        String str = ContainerEncoder.KEYNAMES[i];
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.a, str));
                if (i3 < 0) {
                    try {
                        i3 = fileInputStream.available() - i2;
                    } catch (IOException e) {
                        e = e;
                        if (0 != 0) {
                            Array.clear((byte[]) null);
                        }
                        throw e;
                    }
                }
                if (i3 > fileInputStream.available() - i2) {
                    i3 = fileInputStream.available() - i2;
                }
                byte[] bArr = new byte[i3];
                long j = i2;
                if (fileInputStream.skip((j << 32) >>> 32) != j) {
                    throw new EOFException();
                }
                if (fileInputStream.read(bArr) != i3) {
                    throw new EOFException();
                }
                fileInputStream.close();
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                r6 = str;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th3) {
            r6 = 0;
            th = th3;
            if (r6 != 0) {
            }
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    public final void removeFile(int i) {
        if (new File(this.a, ContainerEncoder.KEYNAMES[i]).delete()) {
            return;
        }
        JCPLogger.warning(d.getString("ErrRemoveFile"));
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    public final void removeFolder() {
        if (!new File(this.a).delete()) {
            JCPLogger.warning(d.getString("ErrRemoveFolder"));
        }
        this.c = true;
    }

    @Override // ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface
    public final void storeFile(int i, byte[] bArr, boolean z) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.a, ContainerEncoder.KEYNAMES[i]));
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String toString() {
        return this.a;
    }
}
