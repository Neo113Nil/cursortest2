package sg.bigo.ads.by;

import android.os.Build;
import com.ironsource.B5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import xsna.h5s;

/* loaded from: classes9.dex */
public final class a {
    private static String[] a = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    private static String[] b = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};
    private static String[] c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    private static String[] d = {"goldfish"};

    public static int a() {
        try {
            if (!e() && !d() && !f()) {
                if (!g()) {
                    return 0;
                }
            }
            return 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String b() {
        StringBuilder sb = new StringBuilder(" Build.BOARD = ");
        sb.append(Build.BOARD);
        sb.append(", Build.BOOTLOADER = ");
        sb.append(Build.BOOTLOADER);
        sb.append(", Build.BRAND = ");
        sb.append(Build.BRAND);
        sb.append(", Build.DEVICE = ");
        sb.append(Build.DEVICE);
        sb.append(", Build.DISPLAY = ");
        sb.append(Build.DISPLAY);
        sb.append(", Build.FINGERPRINT = ");
        sb.append(Build.FINGERPRINT);
        sb.append(", Build.HARDWARE = ");
        sb.append(Build.HARDWARE);
        sb.append(", Build.HOST = ");
        sb.append(Build.HOST);
        sb.append(", Build.MANUFACTURER = ");
        sb.append(Build.MANUFACTURER);
        sb.append(", Build.MODEL = ");
        sb.append(Build.MODEL);
        sb.append(", Build.PRODUCT = ");
        sb.append(Build.PRODUCT);
        sb.append(", Build.TIME = ");
        sb.append(Build.TIME);
        sb.append(", Build.TYPE = ");
        sb.append(Build.TYPE);
        sb.append(", Build.ID = ");
        sb.append(Build.USER);
        sb.append(", Build.VERSION.CODENAME = ");
        sb.append(Build.VERSION.CODENAME);
        sb.append(", Build.VERSION.INCREMENTAL = ");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append(", Build.VERSION.RELEASE = ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", Build.VERSION.SDK_INT = ");
        return h5s.c(Build.VERSION.SDK_INT, StringUtils.COMMA, sb);
    }

    public static String c() {
        try {
            Process start = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream(), B5.O));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString().toLowerCase();
                }
                sb.append(readLine);
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean d() {
        try {
            for (String str : b) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean e() {
        try {
            for (String str : a) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean f() {
        try {
            for (String str : c) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean g() {
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                String str = new String(bArr);
                for (String str2 : d) {
                    if (str.contains(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
