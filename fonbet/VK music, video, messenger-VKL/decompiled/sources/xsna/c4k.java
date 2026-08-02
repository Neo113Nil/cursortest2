package xsna;

import android.os.Build;
import com.facebook.soloader.MinElf;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import kotlin.text.Regex;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: CpuUtilsBase.kt */
/* loaded from: classes3.dex */
public abstract class c4k implements FileFilter {
    public final int a;
    public final boolean b;
    public final double c;
    public final double d;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r0 < 1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115 A[LOOP:1: B:23:0x0069->B:44:0x0115, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c4k(a2a a2aVar, o67 o67Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        double d;
        double d2;
        int i4 = 0;
        try {
            i = new File("/sys/devices/system/cpu/").listFiles(this).length;
        } catch (Throwable th) {
            a2aVar.invoke(new RuntimeException("Unable to get reliable CPU Core count", th));
            i = 0;
        }
        try {
            i2 = Runtime.getRuntime().availableProcessors();
        } catch (Throwable th2) {
            a2aVar.invoke(new RuntimeException("Unable to get reliable processors count", th2));
        }
        int i5 = i4 + 1;
        if (i4 >= i3) {
            double d3 = d * 0.001d;
            this.c = d3;
            double d4 = d2 * 0.001d;
            this.d = d4;
            o67Var.invoke("cores=" + this.a + ", is64BitAbi=" + z + ", cpu freq=[" + d3 + ", " + d4 + ']');
            return;
        }
        i4 = i5;
        i2 = 1;
        this.a = i < i2 ? i2 : i;
        z = false;
        for (String str : Build.SUPPORTED_ABIS) {
            if (MinElf.ISA.AARCH64.equalsIgnoreCase(str) || MinElf.ISA.X86_64.equalsIgnoreCase(str)) {
                z = true;
            }
        }
        this.b = z;
        i3 = this.a - 1;
        d = -1.0d;
        d2 = -1.0d;
        while (true) {
            try {
                double b = b("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_min_freq");
                d = d >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? d > b ? b : d : b;
            } catch (Throwable th3) {
                a2aVar.invoke(new RuntimeException(tgw.b(i4, "Unable to get min cpu", " frequency"), th3));
            }
            try {
                double b2 = b("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq");
                d2 = d2 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? d2 < b2 ? b2 : d2 : b2;
            } catch (Throwable th4) {
                a2aVar.invoke(new RuntimeException(tgw.b(i4, "Unable to get max cpu", " frequency"), th4));
            }
            int i52 = i4 + 1;
            if (i4 >= i3) {
            }
            i4 = i52;
        }
        double b22 = b("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq");
        if (d2 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
        }
        d2 = d2 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? d2 < b22 ? b22 : d2 : b22;
        int i522 = i4 + 1;
        if (i4 >= i3) {
        }
    }

    public static double b(String str) {
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            throw new IOException("File is missing or empty");
        }
        double parseDouble = Double.parseDouble(nbr.r(file, emb.b));
        if (parseDouble >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return parseDouble;
        }
        throw new IOException("Read cpu frequency is negative");
    }

    public final boolean a() {
        return this.a >= 8;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return new Regex("cpu[0-9]+").f(file.getName());
    }
}
