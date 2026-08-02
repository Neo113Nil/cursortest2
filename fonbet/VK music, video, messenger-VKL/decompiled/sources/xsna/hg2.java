package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnimateAsState.kt */
/* loaded from: classes11.dex */
public final class hg2 {
    public static final xmk0<Float> a = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
    public static final xmk0<pco> b;
    public static final xmk0<Integer> c;

    static {
        Object obj = c5u0.a;
        b = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new pco(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 3);
    }

    public static final mtk0 a(float f, phr phrVar, String str, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            phrVar = b;
        }
        phr phrVar2 = phrVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:123)");
        }
        int i3 = i << 6;
        mtk0 c2 = c(new pco(f), rte0.g, phrVar2, null, str2, null, aVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return c2;
    }

    public static final mtk0 b(float f, iq2 iq2Var, String str, izs izsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3 = i2 & 2;
        xmk0<Float> xmk0Var = a;
        iq2 iq2Var2 = i3 != 0 ? xmk0Var : iq2Var;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        izs izsVar2 = (i2 & 16) != 0 ? null : izsVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:74)");
        }
        if (iq2Var2 == xmk0Var) {
            aVar.K(1144115775);
            boolean z = (((i & 896) ^ 384) > 256 && aVar.n(0.01f)) || (i & 384) == 256;
            Object x = aVar.x();
            if (z || x == a.C0011a.a) {
                x = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(0.01f), 3);
                aVar.R(x);
            }
            iq2Var2 = (xmk0) x;
            aVar.j();
        } else {
            aVar.K(1144225701);
            aVar.j();
        }
        int i4 = i << 3;
        mtk0 c2 = c(Float.valueOf(f), rte0.e, iq2Var2, null, str2, izsVar2, aVar, (i4 & 458752) | (i & 14) | (57344 & i4), 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mtk0 c(Object obj, itp0 itp0Var, iq2 iq2Var, Float f, String str, izs izsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        iq2 iq2Var2;
        Object x;
        qta qtaVar;
        boolean y;
        Object x2;
        boolean y2;
        Object x3;
        qta qtaVar2;
        mtk0 mtk0Var;
        Float f2 = (i2 & 8) != 0 ? null : f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:407)");
        }
        Object x4 = aVar.x();
        Object obj2 = a.C0011a.a;
        if (x4 == obj2) {
            x4 = androidx.compose.runtime.k.b(null);
            aVar.R(x4);
        }
        wh50 wh50Var = (wh50) x4;
        Object x5 = aVar.x();
        if (x5 == obj2) {
            x5 = new if2(obj, itp0Var, f2);
            aVar.R(x5);
        }
        if2 if2Var = (if2) x5;
        wh50 c2 = androidx.compose.runtime.k.c(izsVar, aVar, (i >> 15) & 14);
        if (f2 != null && (iq2Var instanceof xmk0)) {
            xmk0 xmk0Var = (xmk0) iq2Var;
            if (!epx.f(xmk0Var.c, f2)) {
                iq2Var2 = new xmk0(xmk0Var.a, xmk0Var.b, f2);
                wh50 c3 = androidx.compose.runtime.k.c(iq2Var2, aVar, 0);
                x = aVar.x();
                if (x == obj2) {
                    x = w0b.a(-1, null, null, 6);
                    aVar.R(x);
                }
                qtaVar = (qta) x;
                y = ((((i & 14) ^ 6) <= 4 && aVar.y(obj)) || (i & 6) == 4) | aVar.y(qtaVar);
                x2 = aVar.x();
                if (!y || x2 == obj2) {
                    x2 = new com.vk.movika.sdk.base.flow.binding.l(1, qtaVar, obj);
                    aVar.R(x2);
                }
                bap.i((gzs) x2, aVar, 0);
                y2 = aVar.y(qtaVar) | aVar.y(if2Var) | aVar.J(c3) | aVar.J(c2);
                x3 = aVar.x();
                if (!y2 || x3 == obj2) {
                    qtaVar2 = qtaVar;
                    Object gg2Var = new gg2(qtaVar2, if2Var, c3, c2, null);
                    aVar.R(gg2Var);
                    x3 = gg2Var;
                } else {
                    qtaVar2 = qtaVar;
                }
                bap.g(qtaVar2, (wzs) x3, aVar, 0);
                mtk0Var = (mtk0) wh50Var.getValue();
                if (mtk0Var == null) {
                    mtk0Var = if2Var.c;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return mtk0Var;
            }
        }
        iq2Var2 = iq2Var;
        wh50 c32 = androidx.compose.runtime.k.c(iq2Var2, aVar, 0);
        x = aVar.x();
        if (x == obj2) {
        }
        qtaVar = (qta) x;
        y = ((((i & 14) ^ 6) <= 4 && aVar.y(obj)) || (i & 6) == 4) | aVar.y(qtaVar);
        x2 = aVar.x();
        if (!y) {
        }
        x2 = new com.vk.movika.sdk.base.flow.binding.l(1, qtaVar, obj);
        aVar.R(x2);
        bap.i((gzs) x2, aVar, 0);
        y2 = aVar.y(qtaVar) | aVar.y(if2Var) | aVar.J(c32) | aVar.J(c2);
        x3 = aVar.x();
        if (y2) {
        }
        qtaVar2 = qtaVar;
        Object gg2Var2 = new gg2(qtaVar2, if2Var, c32, c2, null);
        aVar.R(gg2Var2);
        x3 = gg2Var2;
        bap.g(qtaVar2, (wzs) x3, aVar, 0);
        mtk0Var = (mtk0) wh50Var.getValue();
        if (mtk0Var == null) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        return mtk0Var;
    }
}
