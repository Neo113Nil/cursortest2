package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import com.vk.dto.common.ImageSizeKey;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes13.dex */
public final class xd7 {
    public static final Uri a = Uri.parse("content://com.huawei.hwid");
    public static final String[] b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", PackageConstants.SERVICES_SIGNATURE_V3};

    public static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.createDeviceProtectedStorageContext().getFilesDir());
        return i5s.a(sb, File.separator, "aegis");
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void c(ByteArrayInputStream byteArrayInputStream, Context context) {
        FileOutputStream fileOutputStream;
        String a2 = a(context);
        if (!bd3.d(a2) && !TextUtils.isEmpty(a2)) {
            File file = new File(a2);
            if (file.exists()) {
                n34.b("BksUtil");
            } else if (!file.mkdirs()) {
                n34.e("BksUtil", "create directory  failed");
            }
        }
        File file2 = new File(a2, "hmsrootcas.bks");
        if (file2.exists()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                n34.b("BksUtil");
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = byteArrayInputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    s770.e(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            n34.e("BksUtil", " IOException");
            s770.e(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            s770.e(fileOutputStream2);
            throw th;
        }
    }

    public static byte[] d(Context context, String str) {
        PackageInfo packageInfo;
        if (TextUtils.isEmpty(str)) {
            Log.e("BksUtil", "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("BksUtil", "PackageManager.NameNotFoundException : " + e.getMessage());
        } catch (Exception e2) {
            Log.e("BksUtil", "get pm exception : " + e2.getMessage());
        }
        return new byte[0];
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            n34.e("BksUtil", "inputstraem exception");
            return "";
        }
    }

    public static void f(Context context) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                inputStream = context.getContentResolver().openInputStream(Uri.withAppendedPath(a, "files/hmsrootcas.bks"));
            } catch (Throwable th) {
                th = th;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= -1) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    }
                    byteArrayOutputStream.flush();
                    byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                } catch (Exception e) {
                    e = e;
                }
                try {
                    String string = cxy0.a(context).getString("bks_hash", "");
                    String e2 = e(byteArrayOutputStream.toByteArray());
                    if (i(context) && string.equals(e2)) {
                        n34.b("BksUtil");
                        s770.e(inputStream);
                        s770.e(byteArrayOutputStream);
                        s770.e(byteArrayInputStream);
                    }
                    n34.b("BksUtil");
                    c(byteArrayInputStream, context);
                    cxy0.a(context).edit().putString("bks_hash", e2).apply();
                    s770.e(inputStream);
                    s770.e(byteArrayOutputStream);
                    s770.e(byteArrayInputStream);
                } catch (Exception e3) {
                    e = e3;
                    byteArrayInputStream2 = byteArrayInputStream;
                    n34.e("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                    s770.e(inputStream);
                    s770.e(byteArrayOutputStream);
                    s770.e(byteArrayInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream2 = byteArrayInputStream;
                    s770.e(inputStream);
                    s770.e(byteArrayOutputStream);
                    s770.e(byteArrayInputStream2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                byteArrayOutputStream = null;
                n34.e("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                s770.e(inputStream);
                s770.e(byteArrayOutputStream);
                s770.e(byteArrayInputStream2);
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                s770.e(inputStream);
                s770.e(byteArrayOutputStream);
                s770.e(byteArrayInputStream2);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    public static boolean g(String str) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        n34.b("BksUtil");
        String[] split = str.split("\\.");
        String[] split2 = "4.0.2.300".split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        int i = 0;
        while (i < max) {
            if (i < length) {
                try {
                    parseInt = Integer.parseInt(split[i]);
                } catch (Exception e) {
                    n34.e("BksUtil", " exception : " + e.getMessage());
                    return i >= length2;
                }
            } else {
                parseInt = 0;
            }
            int parseInt2 = i < length2 ? Integer.parseInt(split2[i]) : 0;
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
            i++;
        }
        return true;
    }

    public static String h(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return b(MessageDigest.getInstance("SHA-256").digest(bArr));
            } catch (NoSuchAlgorithmException e) {
                Log.e("BksUtil", "NoSuchAlgorithmException" + e.getMessage());
            }
        }
        return "";
    }

    public static boolean i(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return bd3.d(i5s.a(sb, File.separator, "hmsrootcas.bks"));
    }

    public static synchronized FileInputStream j(Context context) {
        synchronized (xd7.class) {
            n34.b("BksUtil");
            if (context != null && rdi.j == null) {
                rdi.j = context.getApplicationContext();
            }
            Context context2 = rdi.j;
            if (context2 == null) {
                n34.e("BksUtil", "context is null");
                return null;
            }
            if (!g(qvy0.a("com.huawei.hwid")) && !g(qvy0.a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                n34.e("BksUtil", "hms version code is too low : " + qvy0.a("com.huawei.hwid"));
                return null;
            }
            byte[] d = d(context2, "com.huawei.hwid");
            String[] strArr = b;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (strArr[i].equalsIgnoreCase(h(d))) {
                        break;
                    }
                    i++;
                } else if (!PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(h(d(context2, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)))) {
                    n34.e("BksUtil", "hms sign error");
                    return null;
                }
            }
            f(context2);
            return k(context2);
        }
    }

    public static FileInputStream k(Context context) {
        if (!i(context)) {
            return null;
        }
        n34.b("BksUtil");
        try {
            return new FileInputStream(a(context) + File.separator + "hmsrootcas.bks");
        } catch (FileNotFoundException unused) {
            n34.e("BksUtil", "FileNotFoundExceptio: ");
            return null;
        }
    }
}
