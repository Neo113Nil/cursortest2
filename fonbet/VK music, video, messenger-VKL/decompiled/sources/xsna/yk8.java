package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* compiled from: Brush.kt */
/* loaded from: classes11.dex */
public abstract class yk8 {
    public final long a = 9205357640488583168L;

    /* compiled from: Brush.kt */
    public static final class a {
        public static y7z a(List list, float f, float f2, int i) {
            return new y7z(list, null, (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), 0);
        }

        public static y7z b(Pair[] pairArr, float f, float f2, int i) {
            if ((i & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            return c((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), 0);
        }

        public static y7z c(Pair[] pairArr, long j, long j2, int i) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair pair : pairArr) {
                arrayList.add(new l5g(((l5g) pair.j()).a));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair pair2 : pairArr) {
                arrayList2.add(Float.valueOf(((Number) pair2.i()).floatValue()));
            }
            return new y7z(arrayList, arrayList2, j, j2, i);
        }

        public static y7z d(List list, long j, long j2, int i) {
            if ((i & 2) != 0) {
                j = 0;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = 9187343241974906880L;
            }
            return new y7z(list, null, j3, j2, 0);
        }

        public static gte0 e(List list, long j, float f, int i) {
            if ((i & 2) != 0) {
                j = 9205357640488583168L;
            }
            return new gte0(list, null, j, f);
        }

        public static y7z f(Pair[] pairArr, float f, float f2) {
            return c((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32), 0);
        }

        public static y7z g(List list, float f, float f2, int i) {
            return new y7z(list, null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) & 4294967295L), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) & 4294967295L), 0);
        }

        public static /* synthetic */ y7z h(Pair[] pairArr, float f, float f2, int i) {
            if ((i & 2) != 0) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if ((i & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            return f(pairArr, f, f2);
        }
    }

    public abstract void a(float f, long j, fg90 fg90Var);

    public long b() {
        return this.a;
    }
}
