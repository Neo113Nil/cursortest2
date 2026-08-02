package yads;

import android.content.Context;
import android.os.StatFs;

/* loaded from: classes10.dex */
public abstract class jt1 {
    public static long a(Context context, long j, long j2) {
        long j3;
        if (j > j2) {
            j = j2;
        }
        try {
            StatFs statFs = new StatFs(vg0.a(context, "").getAbsolutePath());
            j3 = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException unused) {
            j3 = j;
        }
        long j4 = 100;
        long j5 = (2 * j3) / j4;
        long j6 = (j3 * 50) / j4;
        if (j > j6) {
            j = j6;
        }
        if (j5 <= j2) {
            j2 = j5;
        }
        return j2 < j ? j : j2;
    }
}
