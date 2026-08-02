package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
/* loaded from: classes11.dex */
public final class mxy {
    public static final lxy a;

    static {
        int[] iArr = new int[0];
        a = new lxy(iArr, iArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, false, new sxy(iArr, iArr), new b1y(new p8v(1), 5), d370.k(), 0, EmptyList.b, 0L, 0, 0, 0, 0, 0, zvj.a(EmptyCoroutineContext.b));
    }

    /* compiled from: LazyStaggeredGridMeasureResult.kt */
    public static final class a implements dp10 {
        @Override // xsna.dp10
        public final int getHeight() {
            return 0;
        }

        @Override // xsna.dp10
        public final int getWidth() {
            return 0;
        }

        @Override // xsna.dp10
        public final Map<gt1, Integer> q() {
            return jgp.b;
        }

        @Override // xsna.dp10
        public final void j() {
        }
    }
}
