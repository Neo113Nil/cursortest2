package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TopAppBarScrollBehavior.kt */
/* loaded from: classes17.dex */
public interface v6p0 {

    /* compiled from: TopAppBarScrollBehavior.kt */
    public static final class a {
        public static rmp a(x6p0 x6p0Var, gzs gzsVar, xmk0 xmk0Var, androidx.compose.runtime.a aVar, int i, int i2) {
            if ((i2 & 8) != 0) {
                xmk0Var = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
            }
            l7l a = ilk0.a(aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1267508403, i, -1, "com.vk.core.compose.component.topbar.TopAppBarScrollBehavior.Companion.enterAlways (TopAppBarScrollBehavior.kt:111)");
            }
            boolean J = ((((i & 112) ^ 48) > 32 && aVar.J(gzsVar)) || (i & 48) == 32) | aVar.J(x6p0Var) | aVar.l(false) | aVar.J(xmk0Var) | aVar.J(a);
            Object x = aVar.x();
            if (J || x == a.C0011a.a) {
                x = new rmp(x6p0Var, xmk0Var, a, gzsVar);
                aVar.R(x);
            }
            rmp rmpVar = (rmp) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return rmpVar;
        }
    }

    d160 a();

    Object b(wd00 wd00Var);

    x6p0 getState();
}
