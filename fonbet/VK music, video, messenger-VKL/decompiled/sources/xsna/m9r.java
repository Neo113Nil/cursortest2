package xsna;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: FileManager.kt */
/* loaded from: classes.dex */
public final class m9r {
    public final gzs<ExecutorService> a;
    public final bpn0 b = new bpn0(new ub8(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    public m9r(gzs<? extends ExecutorService> gzsVar) {
        this.a = gzsVar;
    }

    public static void a(StringBuilder sb, File file) {
        if (sb == null) {
            return;
        }
        try {
            byte[] bytes = sb.toString().getBytes(emb.b);
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                fileOutputStream.write(bytes);
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean c(File file) {
        if (file == null) {
            return false;
        }
        try {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            return file.createNewFile();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean d(File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    d(listFiles[i]);
                } else {
                    listFiles[i].delete();
                }
            }
        }
        return file.delete();
    }

    public static boolean e(File file) {
        if (file != null && file.exists()) {
            return file.isDirectory() ? d(file) : file.delete();
        }
        return false;
    }

    public static boolean f(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
        return c(file);
    }
}
