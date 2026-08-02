package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.c280;
import xsna.cri;
import xsna.d280;
import xsna.dt1;
import xsna.o080;
import xsna.q630;

/* compiled from: OldUserOnBoardingStateContentView.kt */
/* loaded from: classes5.dex */
public final class l080 extends i6v0<o080, a080> {
    public final xqi<o080.a> f;
    public final boolean g;
    public final frv0 h;
    public final boolean i;

    public l080() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l080(xqi xqiVar, Context context, tl50 tl50Var, frv0 frv0Var, boolean z, int i) {
        super(context, tl50Var);
        boolean z2 = (i & 8) == 0;
        frv0Var = (i & 16) != 0 ? null : frv0Var;
        z = (i & 32) != 0 ? false : z;
        this.f = xqiVar;
        this.g = z2;
        this.h = frv0Var;
        this.i = z;
        vq.b(-1, -2, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((o080) ao50Var, izsVar, aVar, 512);
    }

    public final void h(o080 o080Var, izs<? super a080, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        float f;
        boolean z;
        float f2;
        q630 H;
        q630.a aVar2;
        float f3;
        androidx.compose.runtime.a M = aVar.M(-242415434);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-242415434, i2, -1, "com.vk.profile.core.onboarding.mvi.view.OldUserOnBoardingStateContentView.ThemedContent (OldUserOnBoardingStateContentView.kt:78)");
            }
            o080.a aVar3 = (o080.a) ((zak0) this.f.e).getValue();
            if (aVar3 instanceof o080.a.b) {
                M.K(-1957744024);
                wh50 d = jk50.d(((o080.a.b) aVar3).a, c280.a.a, M, 48);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = bbk0.b(new xrj(d, 26));
                    M.R(x);
                }
                q630.a aVar4 = q630.a.a;
                float f4 = 32;
                q630 H2 = s200.H(p490.D(n34.t(txj0.f(aVar4, 1.0f), dz5.I(0, 1, M, false), null), p490.x(M), 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4 + ((pco) ((mtk0) x).getValue()).b, 7);
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, H2);
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
                q630 f5 = txj0.f(aVar4, 1.0f);
                cp10 d2 = ja8.d(dt1.a.b, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, f5);
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
                k9q0.w(M, d2, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                d280 content = ((c280) d.getValue()).getContent();
                boolean z2 = content instanceof d280.b;
                boolean z3 = this.g;
                if (z2) {
                    M.K(-119901627);
                    q630 d3 = sua.d(1.3158878f, txj0.f(aVar4, 1.0f), false);
                    if (z3) {
                        f3 = f4;
                    } else {
                        f3 = f4;
                        d3 = s200.H(d3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 7);
                    }
                    n080.c((d280.b) content, izsVar, d3, M, i2 & 112);
                    M.j();
                    f2 = f3;
                    f = 1.0f;
                    z = false;
                } else {
                    if (!(content instanceof d280.a)) {
                        throw alb0.c(-558065646, M);
                    }
                    M.K(-119434240);
                    f = 1.0f;
                    z = false;
                    q630 d4 = sua.d(1.3158878f, txj0.f(aVar4, 1.0f), false);
                    if (z3) {
                        H = d4;
                        f2 = f4;
                    } else {
                        f2 = f4;
                        H = s200.H(d4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 7);
                    }
                    n080.b((d280.a) content, izsVar, H, M, i2 & 112);
                    M.j();
                }
                if (this.i) {
                    M.K(-118987809);
                    float f6 = 10;
                    q630 H3 = s200.H(ra8.a.b(txj0.B(aVar4, null, 3), dt1.a.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9);
                    if ((i2 & 112) == 32) {
                        z = true;
                    }
                    Object x2 = M.x();
                    if (z || x2 == c0012a) {
                        x2 = new nac(izsVar, 3);
                        M.R(x2);
                    }
                    aVar2 = aVar4;
                    nzu0.e((gzs) x2, H3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, l2l0.b, M, 100663296, 252);
                } else {
                    aVar2 = aVar4;
                    M.K(-124739115);
                }
                M.j();
                M.G();
                if (z3) {
                    M.K(-737672662);
                    ck70.b(aVar2, f2, M, 6);
                } else {
                    M.K(-744266021);
                    M.j();
                }
                n080.a((c280) d.getValue(), txj0.f(aVar2, f), this.h, M, 48);
                M.G();
            } else {
                M.K(-1961650644);
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
            s.d = new k77(i, 3, this, o080Var, izsVar);
        }
    }
}
