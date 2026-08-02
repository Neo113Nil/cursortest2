package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetState;
import xsna.cri;
import xsna.dt1;
import xsna.it0;
import xsna.ozj;
import xsna.q630;

/* compiled from: CourierMapScreen.kt */
/* loaded from: classes18.dex */
public final class szj {
    public static final float a = 64;

    public static final void a(qm00 qm00Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1383412415);
        int i2 = i | (M.J(qm00Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1383412415, i2, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.AboveSheetContent (CourierMapScreen.kt:162)");
            }
            q630Var2 = q630.a.a;
            q630 E = ahn.E(txj0.f(q630Var2, 1.0f), "courier_delivery_location_button");
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ws0(izsVar, 3);
                M.R(x);
            }
            float f = 16;
            tkq0.a(0, M, (gzs) x, s200.H(ra8.a.b(q630Var2, dt1.a.j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3), qm00Var.b);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v17(i, 3, qm00Var, izsVar, q630Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Context context, ozj.c cVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(918184893);
        if ((i & 6) == 0) {
            i2 = (M.y(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(918184893, i2, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.CourierMapScreen (CourierMapScreen.kt:65)");
            }
            wh50 d = jk50.d(cVar.b, new qm00(0), M, 0);
            wh50 d2 = jk50.d(cVar.a, it0.b.b, M, 48);
            dt1.a.getClass();
            cp10 d3 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            it0 it0Var = (it0) d2.getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(5397877, 0, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.rememberBottomSheetState (CourierMapScreen.kt:183)");
            }
            M.K(892399668);
            f12 c2 = s88.c(BottomSheetState.Collapsed, null, M, 6, 62);
            boolean J = M.J(it0Var) | M.J(c2);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new rzj(it0Var, c2, null);
                M.R(x);
            }
            bap.g(it0Var, (wzs) x, M, 0);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(txj0.d(aVar3, 1.0f), "courier_map_bottom_sheet");
            jai c3 = kai.c(-1215566652, new p9(3, izsVar, d2), M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new vv7(5);
                M.R(x2);
            }
            s88.b(c3, (wzs) x2, c2, E, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(2119048396, new pzj(0, izsVar, d), M), kai.c(-685350195, new n9d(context, izsVar, d, 2), M), M, 905997366);
            M = M;
            jx9.a(((qm00) d.getValue()).e, ((qm00) d.getValue()).d, txj0.d(aVar3, 1.0f), M, 384);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qzj(context, cVar, q630Var, izsVar, i);
        }
    }

    public static final void c(Context context, qm00 qm00Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1788000649);
        int i2 = i | (M.y(context) ? 4 : 2) | (M.J(qm00Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1788000649, i2, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.CourierMapScreenContent (CourierMapScreen.kt:118)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = j3v0.c(context);
                M.R(x2);
            }
            jm00 jm00Var = (jm00) x2;
            j3v0.a(((f5z) M.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), jm00Var, M, 0);
            oj00 oj00Var = (oj00) wh50Var.getValue();
            j3v0.b(oj00Var != null ? new qow(oj00Var) : null, M, 0);
            int r0 = ((azl) M.r(uvi.h)).r0(a);
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 d3 = txj0.d(aVar2, 1.0f);
            boolean y = M.y(jm00Var) | ((i2 & 896) == 256) | M.o(r0);
            Object x3 = M.x();
            if (y || x3 == obj) {
                x3 = new ydf(jm00Var, wh50Var, izsVar, r0);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            boolean z = (i2 & 112) == 32;
            Object x4 = M.x();
            if (z || x4 == obj) {
                x4 = new d05(14, wh50Var, qm00Var);
                M.R(x4);
            }
            ae2.a(48, 0, M, izsVar2, (izs) x4, d3);
            if (qm00Var.e) {
                M.K(1754076243);
            } else {
                M.K(1760143935);
                ayz.c(0, M, s200.H(ra8.a.b(aVar2, dt1.a.f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 134, 7), qm00Var.c);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xw(i, 1, context, qm00Var, izsVar, q630Var2);
        }
    }
}
