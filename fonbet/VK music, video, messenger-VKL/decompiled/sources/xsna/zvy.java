package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: LazyListState.kt */
/* loaded from: classes11.dex */
public final class zvy {
    public static final hvy a = new hvy(null, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, zvj.a(EmptyCoroutineContext.b), d370.k(), s6j.b(0, 0, 0, 0, 15), EmptyList.b, 0, 0, 0, Orientation.Vertical, 0, 0);

    public static final xvy a(final int i, int i2, androidx.compose.runtime.a aVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1470655220, 0, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:78)");
        }
        Object[] objArr = new Object[0];
        fh9 fh9Var = xvy.y;
        boolean o = aVar.o(i) | aVar.o(0);
        Object x = aVar.x();
        if (o || x == a.C0011a.a) {
            x = new gzs() { // from class: xsna.yvy
                @Override // xsna.gzs
                public final Object invoke() {
                    return new xvy(i, 0);
                }
            };
            aVar.R(x);
        }
        xvy xvyVar = (xvy) crx0.D(objArr, fh9Var, (gzs) x, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return xvyVar;
    }

    /* compiled from: LazyListState.kt */
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
