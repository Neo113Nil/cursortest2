package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: LazyGridState.kt */
/* loaded from: classes11.dex */
public final class gsy {
    public static final mry a;

    static {
        a aVar = new a();
        EmptyList emptyList = EmptyList.b;
        Orientation orientation = Orientation.Vertical;
        a = new mry(null, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, zvj.a(EmptyCoroutineContext.b), d370.k(), 0, new dam(14), new kdw(2), emptyList, 0, 0, 0, orientation, 0, 0);
    }

    public static final dsy a(final int i, int i2, androidx.compose.runtime.a aVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(29186956, 0, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:79)");
        }
        Object[] objArr = new Object[0];
        fh9 fh9Var = dsy.w;
        boolean o = aVar.o(i) | aVar.o(0);
        Object x = aVar.x();
        if (o || x == a.C0011a.a) {
            x = new gzs() { // from class: xsna.fsy
                @Override // xsna.gzs
                public final Object invoke() {
                    return new dsy(i, 0);
                }
            };
            aVar.R(x);
        }
        dsy dsyVar = (dsy) crx0.D(objArr, fh9Var, (gzs) x, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return dsyVar;
    }

    /* compiled from: LazyGridState.kt */
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
