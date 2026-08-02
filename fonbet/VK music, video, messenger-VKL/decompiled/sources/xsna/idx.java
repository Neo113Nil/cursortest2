package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InterestBox.kt */
/* loaded from: classes4.dex */
public final class idx {
    public static final void a(final String str, final izs izsVar, final q630 q630Var, final String str2, final boolean z, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        long j;
        long j2;
        androidx.compose.runtime.a M = aVar.M(-849539760);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.J(str2) ? 2048 : 1024) | (M.l(z) ? 16384 : 8192);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-849539760, i2, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.InterestBox (InterestBox.kt:41)");
            }
            final vtu vtuVar = (vtu) M.r(uvi.l);
            q630 f = txj0.f(q630Var, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            uog0 b = vog0.b(28);
            long j3 = wlb0.h(M).getBackground().x;
            float f2 = 2;
            if (z) {
                M.K(1416178962);
                j = j3;
                j2 = wlb0.h(M).m().a;
                M.j();
            } else {
                j = j3;
                M.K(1416179729);
                M.j();
                j2 = l5g.j;
            }
            y18 a2 = aqw.a(f2, j2);
            q630.a aVar3 = q630.a.a;
            q630 q = txj0.q(aVar3, 72);
            int i3 = i2 & 112;
            int i4 = i2 & 57344;
            boolean y = M.y(vtuVar) | (i3 == 32) | (i4 == 16384);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new gzs() { // from class: xsna.fdx
                    @Override // xsna.gzs
                    public final Object invoke() {
                        vtu.this.a(0);
                        izsVar.invoke(Boolean.valueOf(z));
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            q630 J = xa4.J(q, false, (gzs) x);
            boolean z2 = i4 == 16384;
            int i5 = i2 & 14;
            boolean z3 = ((i2 & 7168) == 2048) | z2 | (i5 == 4) | (i3 == 32);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new vmg(str, str2, izsVar, z);
                M.R(x2);
            }
            uov0.a(egi0.a(J, (izs) x2), b, j, 0L, a2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1077085619, new bn7(jaiVar, 7), M), M, 1572864, 40);
            yqv0.c(str, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 1, aVar3), 0L, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).m0, M, i5 | 48, 0, 8124);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, izsVar, q630Var, str2, z, jaiVar, i) { // from class: xsna.gdx
                public final /* synthetic */ String b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ jai g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(196609);
                    idx.a(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
