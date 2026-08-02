package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.b280;
import xsna.cri;
import xsna.dt1;
import xsna.o080;
import xsna.q630;

/* compiled from: OldUserOnBoardingStateBottomView.kt */
/* loaded from: classes5.dex */
public final class j080 extends i6v0<o080, a080> {
    public final xqi<o080.a> f;

    public j080(xqi xqiVar, Context context, tl50 tl50Var) {
        super(context, tl50Var);
        this.f = xqiVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((o080) ao50Var, izsVar, aVar, 512);
    }

    public final void h(o080 o080Var, izs<? super a080, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-337106342);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-337106342, i2, -1, "com.vk.profile.core.onboarding.mvi.view.OldUserOnBoardingStateBottomView.ThemedContent (OldUserOnBoardingStateBottomView.kt:34)");
            }
            o080.a aVar2 = (o080.a) ((zak0) this.f.e).getValue();
            if (aVar2 instanceof o080.a.b) {
                M.K(-1101180861);
                h0u0 h0u0Var = ((o080.a.b) aVar2).b;
                b280.a aVar3 = b280.a.a;
                wh50 d = jk50.d(h0u0Var, aVar3, M, 48);
                if (epx.f((b280) d.getValue(), aVar3)) {
                    M.K(-1102993400);
                } else {
                    M.K(-1101016840);
                    q630.a aVar4 = q630.a.a;
                    q630 f = txj0.f(aVar4, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    float f2 = 16;
                    float f3 = 12;
                    q630 H = s200.H(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(f, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5);
                    a.j g = androidx.compose.foundation.layout.a.g(f3);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    k080.b(((i2 >> 3) & 14) | 384, M, izsVar, txj0.f(aVar4, 1.0f), (b280) d.getValue());
                    k080.a((i2 & 112) | 384, M, izsVar, txj0.f(aVar4, 1.0f), (b280) d.getValue());
                    M.G();
                }
                M.j();
            } else {
                M.K(-1102993400);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kv7(this, o080Var, izsVar, i, 5);
        }
    }
}
