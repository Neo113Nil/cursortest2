package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.x9k0;

/* compiled from: PagerState.kt */
/* loaded from: classes11.dex */
public final class rc90 {
    public static final float a = 56;
    public static final b b;
    public static final tb90 c;

    /* compiled from: PagerState.kt */
    public static final class b implements azl {
        @Override // xsna.azl
        public final float getDensity() {
            return 1.0f;
        }

        @Override // xsna.azl
        public final float getFontScale() {
            return 1.0f;
        }
    }

    static {
        b bVar = new b();
        b = bVar;
        c = new tb90(EmptyList.b, 0, 0, 0, Orientation.Horizontal, 0, 0, 0, x9k0.b.a, new a(), zvj.a(EmptyCoroutineContext.b), bVar, s6j.b(0, 0, 0, 0, 15));
    }

    public static final long a(ob90 ob90Var, int i) {
        long d = (((i * (ob90Var.d() + ob90Var.e())) + ob90Var.b()) + ob90Var.c()) - ob90Var.e();
        int a2 = (int) (ob90Var.getOrientation() == Orientation.Horizontal ? ob90Var.a() >> 32 : ob90Var.a() & 4294967295L);
        long g = d - (a2 - swe0.g(ob90Var.f().d(a2, ob90Var.d(), ob90Var.b(), ob90Var.c()), 0, a2));
        if (g < 0) {
            return 0L;
        }
        return g;
    }

    public static final yjl b(int i, gzs gzsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:93)");
        }
        Object[] objArr = new Object[0];
        fh9 fh9Var = yjl.H;
        boolean o = aVar.o(i) | aVar.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if ((((i2 & 896) ^ 384) <= 256 || !aVar.J(gzsVar)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z2 = o | z;
        Object x = aVar.x();
        if (z2 || x == a.C0011a.a) {
            x = new zhz(i, gzsVar);
            aVar.R(x);
        }
        yjl yjlVar = (yjl) crx0.D(objArr, fh9Var, (gzs) x, aVar, 0);
        ((zak0) yjlVar.G).setValue(gzsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return yjlVar;
    }

    /* compiled from: PagerState.kt */
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
