package sg.bigo.ads.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class q {
    private static long a;
    private static long b;
    private static long c;
    private static long d;

    public static long a() {
        if (System.currentTimeMillis() - b > 60000) {
            a = f();
            b = System.currentTimeMillis();
        }
        return a;
    }

    public static long b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    public static int c(Context context) {
        try {
            return (int) Math.min(15728640L, (((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass() / 8) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Exception unused) {
            return 15728640;
        }
    }

    public static long d() {
        if (System.currentTimeMillis() - d > 60000) {
            try {
                c = g();
            } catch (Throwable th) {
                sg.bigo.ads.bn.a.a(0, "StorageUtils", th.toString());
            }
            d = System.currentTimeMillis();
        }
        return c;
    }

    public static File e() {
        return new File(Environment.getExternalStorageDirectory(), "Pictures");
    }

    private static long f() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(0, "StorageUtils", "getExternalStorageRemainSpace" + th.getMessage());
            return 0L;
        }
    }

    private static long g() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo d2 = d(context);
        if (d2 == null) {
            return 0L;
        }
        return g.a(d2.availMem, 3);
    }

    public static long b(Context context) {
        ActivityManager.MemoryInfo d2 = d(context);
        if (d2 == null) {
            return 0L;
        }
        return g.a(d2.totalMem, 3);
    }

    public static boolean c() {
        return g() > ServiceProvider.HTTP_CACHE_DISK_SIZE;
    }

    private static ActivityManager.MemoryInfo d(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> Set<T> a(final int i) {
        return Collections.newSetFromMap(new LinkedHashMap<T, Boolean>() { // from class: sg.bigo.ads.common.utils.q.1
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<T, Boolean> entry) {
                return size() > i;
            }
        });
    }
}
