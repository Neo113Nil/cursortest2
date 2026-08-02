package xsna;

import android.app.ActivityManager;
import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.rlottie.RLottieDrawable;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Comparator;

/* compiled from: StickersAnimationsCacheManager.kt */
/* loaded from: classes5.dex */
public final class s8l0 {
    public static final s8l0 a = new s8l0();
    public static volatile boolean b;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
        }
    }

    public static void b() {
        File[] listFiles;
        String e = yse0.e();
        if (e == null || e.length() == 0) {
            return;
        }
        if (yse0.d().a == null || RLottieDrawable.t.get() <= 0) {
            File file = new File(e);
            long g = z4g.g(file);
            if (g >= 52428800 && (listFiles = file.listFiles()) != null) {
                for (File file2 : rl3.m0(listFiles, new a())) {
                    if (drm0.D(file2.getName(), ".scache", true)) {
                        long length = file2.length();
                        file2.delete();
                        g -= length;
                        if (g < 52428800) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final boolean a() {
        long j;
        int m = (int) Preference.m(-1L, "stickers", "animated_stickers_applicable_without_cache");
        if (m == -1) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", "r");
                try {
                    j = Long.parseLong(randomAccessFile.readLine()) / 1000;
                    randomAccessFile.close();
                    randomAccessFile.close();
                } finally {
                }
            } catch (Exception unused) {
                j = -1;
            }
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            m = (availableProcessors < 8 || ((ActivityManager) context.getSystemService("activity")).getMemoryClass() <= 160 || (j != -1 && j <= 1650)) ? 0 : 1;
            Preference.F(m, "stickers", "animated_stickers_applicable_without_cache");
        }
        return m == 1;
    }
}
