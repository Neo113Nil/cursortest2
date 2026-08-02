package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import androidx.camera.core.ImageCaptureException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class ena1 {
    public static int a(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static Uri b(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    public static void c(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static File d(r1s r1sVar) {
        try {
            File file = (File) r1sVar.b;
            if (file == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            String parent = file.getParent();
            StringBuilder sb = new StringBuilder("CameraX");
            sb.append(UUID.randomUUID().toString());
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            sb.append(lastIndexOf >= 0 ? name.substring(lastIndexOf) : "");
            return new File(parent, sb.toString());
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e);
        }
    }

    public static Uri e(File file, r1s r1sVar) {
        Uri uri = null;
        try {
            try {
                r1sVar.getClass();
                OutputStream outputStream = (OutputStream) r1sVar.c;
                if (outputStream != null) {
                    Objects.requireNonNull(outputStream);
                    c(file, outputStream);
                } else {
                    File file2 = (File) r1sVar.b;
                    if (file2 != null) {
                        Objects.requireNonNull(file2);
                        uri = b(file, file2);
                    }
                }
                file.delete();
                return uri;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    public static void f(Resources.Theme theme) {
        theme.rebase();
    }
}
