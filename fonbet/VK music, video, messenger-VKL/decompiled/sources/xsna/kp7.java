package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.s2x;

/* compiled from: BookingEditOneLineInput.kt */
/* loaded from: classes18.dex */
public final class kp7 {
    public final mtk0 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final mtk0 e;
    public final q630 f;
    public final q630 g;
    public final q630 h;
    public final q630 i;

    public kp7(mtk0<String> mtk0Var, izs<? super String, s3q0> izsVar, mtk0<String> mtk0Var2, rgy rgyVar, lg90 lg90Var) {
        this.a = mtk0Var;
        this.b = androidx.compose.runtime.k.b(izsVar);
        this.c = androidx.compose.runtime.k.b(rgyVar);
        this.d = androidx.compose.runtime.k.b(lg90Var);
        this.e = mtk0Var2;
        float f = 16;
        q630.a aVar = q630.a.a;
        this.f = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar);
        float f2 = 48;
        this.g = s200.H(txj0.s(aVar, f2, f2), 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
        this.h = s200.H(aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
        this.i = s200.H(aVar, f, 8, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2014362381);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2014362381, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditOneLineInput.ImmutableContent (BookingEditOneLineInput.kt:75)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, this.g);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            pzu0.b((lg90) ((zak0) this.d).getValue(), null, null, wlb0.h(M).getIcon().l, M, 56, 4);
            aVar2 = M;
            aVar2.G();
            yqv0.c((String) this.a.getValue(), this.h.g(q630Var), wlb0.h(aVar2).getText().m, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(aVar2).X, aVar2, 0, 48, 6136);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new hp7(this, q630Var, i, 0);
        }
    }

    public final void b(final int i, androidx.compose.runtime.a aVar, final String str, final q630 q630Var, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(-1246272226);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.J(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1246272226, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditOneLineInput.MutableContent (BookingEditOneLineInput.kt:98)");
            }
            String str2 = (String) this.e.getValue();
            q630 g = this.f.g(q630Var);
            InputSelect$State.Companion.getClass();
            InputSelect$State inputSelect$State = str2 != null ? InputSelect$State.Error : InputSelect$State.Default;
            rgy rgyVar = (rgy) ((zak0) this.c).getValue();
            String str3 = (String) this.a.getValue();
            lg90 lg90Var = (lg90) ((zak0) this.d).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            tzy s = sv1.s(lg90Var, null, ylu0Var.getIcon().l, M, 8);
            boolean z2 = (i2 & 7168) == 2048;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.logic.interactor.d(this, 16);
                M.R(x);
            }
            int i3 = i2 << 6;
            z0v0.a(s2x.a.C3649a.a(str3, (izs) x, str, rgyVar, s, M, i3 & 896, 30584), g, inputSelect$State, z, M, i3 & 7168, 0);
            mm2.f(str2 != null, null, null, null, null, kai.c(1858699766, new ip7(0, this, str2), M), M, 196608, 30);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs(str, z, q630Var, i) { // from class: xsna.jp7
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    kp7.this.b(I, (androidx.compose.runtime.a) obj, this.c, this.e, this.d);
                    return s3q0.a;
                }
            };
        }
    }
}
