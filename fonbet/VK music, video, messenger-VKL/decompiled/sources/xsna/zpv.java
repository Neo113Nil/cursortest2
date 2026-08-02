package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: IconContentImpl.kt */
/* loaded from: classes17.dex */
public final class zpv extends HorizontalListItem$VisualContent {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public zpv(lg90 lg90Var, long j, long j2) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = zy60.d(j2);
    }

    @Override // com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-181234537);
        int i2 = (M.p(j) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-181234537, i2, -1, "com.vk.core.compose.component.horizontal.IconContentImpl.Draw (IconContentImpl.kt:29)");
            }
            float c = uco.c(j);
            float b = uco.b(j);
            q630.a aVar2 = q630.a.a;
            q630 u = txj0.u(aVar2, c, b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, u);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            ja8.a(hr80.m(txj0.q(aVar2, Math.min(uco.c(j), uco.b(j))), ((l5g) ((zak0) this.c).getValue()).a, vog0.a), M, 0);
            pzu0.b((lg90) ((zak0) this.a).getValue(), null, ra8.a.b(aVar2, ty6Var), ((l5g) ((zak0) this.b).getValue()).a, M, 56, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, i) { // from class: xsna.ypv
                public final /* synthetic */ long c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    zpv.this.a(I, this.c, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
