package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SingleValueAnimation.kt */
/* loaded from: classes11.dex */
public final class lwj0 {
    public static final xmk0<l5g> a = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);

    public static final if2<l5g, vq2> a(long j) {
        return new if2<>(new l5g(j), b9g.a.invoke(l5g.g(j)), null, 12);
    }

    public static final mtk0 b(long j, iq2 iq2Var, String str, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            iq2Var = a;
        }
        iq2 iq2Var2 = iq2Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean J = aVar.J(l5g.g(j));
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = (itp0) b9g.a.invoke(l5g.g(j));
            aVar.R(x);
        }
        mtk0 c = hg2.c(new l5g(j), (itp0) x, iq2Var2, null, str2, null, aVar, ((i << 3) & 896) | ((i << 6) & 57344), 8);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return c;
    }
}
