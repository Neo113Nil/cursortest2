package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import xsna.ty6;

/* compiled from: Alignment.kt */
/* loaded from: classes11.dex */
public interface dt1 {
    public static final a a = a.a;

    /* compiled from: Alignment.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final ty6 b = new ty6(-1.0f, -1.0f);
        public static final ty6 c = new ty6(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f);
        public static final ty6 d = new ty6(1.0f, -1.0f);
        public static final ty6 e = new ty6(-1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        public static final ty6 f = new ty6(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        public static final ty6 g = new ty6(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        public static final ty6 h = new ty6(-1.0f, 1.0f);
        public static final ty6 i = new ty6(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        public static final ty6 j = new ty6(1.0f, 1.0f);
        public static final ty6.b k = new ty6.b(-1.0f);
        public static final ty6.b l = new ty6.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        public static final ty6.b m = new ty6.b(1.0f);
        public static final ty6.a n = new ty6.a(-1.0f);
        public static final ty6.a o = new ty6.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        public static final ty6.a p = new ty6.a(1.0f);

        public static ty6 a() {
            return f;
        }

        public static ty6.a b() {
            return o;
        }

        public static ty6.b c() {
            return l;
        }

        public static ty6.a d() {
            return n;
        }

        public static ty6.b e() {
            return k;
        }

        public static ty6 f() {
            return b;
        }
    }

    /* compiled from: Alignment.kt */
    public interface b {
        int a(int i, int i2, LayoutDirection layoutDirection);
    }

    /* compiled from: Alignment.kt */
    public interface c {
        int a(int i, int i2);
    }

    long a(long j, long j2, LayoutDirection layoutDirection);
}
