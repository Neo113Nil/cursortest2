package xsna;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import kotlin.Result;

/* compiled from: FileUtils.kt */
/* loaded from: classes17.dex */
public final class cbr {
    public static final cbr a = new cbr();

    public static boolean a(File file, File file2) {
        Object failure;
        Object failure2;
        if (!file.exists() || !file2.exists() || file.length() != file2.length()) {
            return false;
        }
        try {
            failure = b(file);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = null;
        if (Result.a(failure) != null) {
            file.getName();
            failure = null;
        }
        String str = (String) failure;
        try {
            failure2 = b(file2);
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        if (Result.a(failure2) == null) {
            obj = failure2;
        } else {
            file2.getName();
        }
        return epx.f(str, (String) obj);
    }

    public static String b(File file) {
        int read;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[8192];
            int i = 0;
            while (i < 65536 && (read = fileInputStream.read(bArr)) > 0) {
                int min = Math.min(read, 65536 - i);
                messageDigest.update(bArr, 0, min);
                i += min;
            }
            String Y = rl3.Y(messageDigest.digest(), "", new com(5), 30);
            fileInputStream.close();
            return Y;
        } finally {
        }
    }

    public static void c(File file, File file2) throws IOException {
        FileInputStream fileInputStream;
        File parentFile;
        if (!file2.exists() && (parentFile = file2.getParentFile()) != null) {
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file2.createNewFile();
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.getMessage();
            fileInputStream = null;
        }
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (FileNotFoundException e2) {
            e2.getMessage();
        }
        if (fileInputStream == null) {
            throw new IllegalStateException("InputStream is null");
        }
        if (fileOutputStream == null) {
            throw new IllegalStateException("OutputStream is null");
        }
        int i = 0;
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            Closeable[] closeableArr = {fileInputStream, fileOutputStream};
            while (i < 2) {
                Closeable closeable = closeableArr[i];
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
                i++;
            }
        } catch (Throwable th) {
            Closeable[] closeableArr2 = {fileInputStream, fileOutputStream};
            while (i < 2) {
                Closeable closeable2 = closeableArr2[i];
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (IOException unused2) {
                    }
                }
                i++;
            }
            throw th;
        }
    }

    public static boolean d(Context context, File file, File file2) {
        try {
            long lastModified = file.lastModified();
            c(file, file2);
            file2.setLastModified(lastModified);
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public static File e(File file, String str, String str2) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis());
        }
        return new File(file, v1v.a(JwtParser.SEPARATOR_CHAR, str, str2));
    }
}
