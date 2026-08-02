package ru.mail.libverify.n0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.BatteryManager;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.vk.dto.common.ImageSizeKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import ru.mail.verify.core.utils.FileLog;
import xsna.anj;
import xsna.r04;
import xsna.tdj;
import xsna.v1v;

/* loaded from: classes9.dex */
public final class e {
    @NonNull
    public static String a(@NonNull byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    @NonNull
    public static String b(@NonNull byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    @NonNull
    public static String c(@NonNull String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 2);
    }

    @NonNull
    public static Locale d(@NonNull String str) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return Locale.getDefault();
        }
        int indexOf = str.indexOf(95);
        if (indexOf < 0) {
            substring = "";
        } else {
            String substring2 = str.substring(0, indexOf);
            substring = str.substring(indexOf + 1);
            str = substring2;
        }
        return new Locale(str.length() == 2 ? str.toLowerCase(Locale.US) : "", substring.length() == 2 ? substring.toUpperCase(Locale.US) : "");
    }

    @NonNull
    public static String e(@NonNull String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.reset();
            messageDigest.update(bytes);
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            FileLog.e("Utils", "stringToMD5", e);
            return d.a(str);
        }
    }

    @NonNull
    public static String f(@NonNull String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            messageDigest.update(bytes);
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            FileLog.e("Utils", "stringToSHA256", e);
            return a(ru.mail.libverify.o0.b.a(bytes));
        }
    }

    @NonNull
    public static byte[] b(@NonNull String str) {
        return Base64.decode(str.getBytes(StandardCharsets.UTF_8), 2);
    }

    @NonNull
    public static File c(@NonNull Context context) {
        return context.getNoBackupFilesDir();
    }

    public static boolean b(@NonNull Context context, @NonNull String str) {
        try {
            return anj.a(context, str) == 0;
        } catch (Exception unused) {
            FileLog.e("Utils", "Failed to check self permission %s", str);
            return false;
        }
    }

    @NonNull
    public static String b(@NonNull File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, StandardCharsets.UTF_8);
            randomAccessFile.close();
            return str;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    public static String a(@Nullable Bundle bundle) {
        if (bundle == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (str != null && obj != null) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append("='");
                sb.append(obj);
                sb.append("'");
            }
        }
        String sb2 = sb.toString();
        return TextUtils.isEmpty(sb2) ? "[empty]" : sb2;
    }

    @Nullable
    @SuppressLint({"DiscouragedApi"})
    public static Boolean e(@NonNull Context context) {
        try {
            return Boolean.valueOf(((TelephonyManager) context.getSystemService("phone")).isVoiceCapable());
        } catch (Throwable unused) {
            FileLog.e("Utils", "failed to get voice capable property");
            return null;
        }
    }

    public static void b(@NonNull File file, @NonNull String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Nullable
    public static String d(@NonNull Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        return TextUtils.isEmpty(string) ? System.getProperty("ro.serialno") : string;
    }

    public static int a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            FileLog.e("Utils", "Could not get package name: " + e);
            throw new RuntimeException("Could not get package name");
        }
    }

    @Nullable
    public static Integer b(@NonNull Context context) {
        try {
            return Integer.valueOf(((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4));
        } catch (Throwable unused) {
            FileLog.e("Utils", "failed to get battery status");
            return null;
        }
    }

    @NonNull
    public static String a(@NonNull Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.isEmpty(language)) {
            return "en_US";
        }
        return TextUtils.isEmpty(country) ? language : v1v.a('_', language, country);
    }

    @NonNull
    public static String a(@NonNull String str, @NonNull String str2) {
        if (str2.startsWith(str)) {
            return a(str2);
        }
        if (str.equalsIgnoreCase("HTC")) {
            return "HTC ".concat(str2);
        }
        return tdj.a(new StringBuilder(), a(str), " ", str2);
    }

    @NonNull
    private static String a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (z && Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
                z = false;
            } else {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @NonNull
    public static String a(@NonNull File file) throws IOException {
        File file2 = new File(file.getPath() + ".new");
        File file3 = new File(file.getPath() + ".bak");
        if (file3.exists()) {
            r04.c(file3, file);
        }
        if (file2.exists() && file.exists() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + file2);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            int i = 0;
            while (true) {
                int read = fileInputStream.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    fileInputStream.close();
                    return new String(bArr, StandardCharsets.UTF_8);
                }
                i += read;
                int available = fileInputStream.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public static int a(int i, int i2) {
        return Integer.compare(i, i2);
    }

    public static int a(long j, long j2) {
        return Long.compare(j, j2);
    }

    public static void a(@NonNull File file, @NonNull String str) throws IOException {
        FileOutputStream fileOutputStream;
        boolean z;
        r04 r04Var = new r04(file);
        File file2 = (File) r04Var.b;
        try {
            fileOutputStream = r04Var.d();
        } catch (IOException e) {
            e = e;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            try {
                fileOutputStream.getFD().sync();
                z = true;
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                Log.e("AtomicFile", "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                Log.e("AtomicFile", "Failed to close file output stream", e2);
            }
            r04.c(file2, (File) r04Var.a);
        } catch (IOException e3) {
            e = e3;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException unused2) {
                    Log.e("AtomicFile", "Failed to sync file output stream");
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                    Log.e("AtomicFile", "Failed to close file output stream", e4);
                }
                if (!file2.delete()) {
                    Log.e("AtomicFile", "Failed to delete new file " + file2);
                }
            }
            throw e;
        }
    }

    @Nullable
    public static String a(@NonNull Context context, @NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
            } catch (Throwable th) {
                FileLog.e("Utils", "Failed to load meta-data", th);
                return null;
            }
        }
        throw new IllegalArgumentException("Manifest key must be not empty");
    }
}
