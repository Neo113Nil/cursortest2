package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.ContentSize;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: LeftIconContent.kt */
@ozl
/* loaded from: classes17.dex */
public final class szy implements qzy {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);
    public final wh50 d;

    public szy(lg90 lg90Var, long j, ContentSize contentSize) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.d = androidx.compose.runtime.k.b(contentSize);
    }

    @Override // xsna.ana
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-905248627);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-905248627, i2, -1, "com.vk.core.compose.component.cell.content.LeftIconContent.invoke (LeftIconContent.kt:36)");
            }
            wh50 wh50Var = this.d;
            float h = ((ContentSize) ((zak0) wh50Var).getValue()).h() - 4;
            float h2 = ((ContentSize) ((zak0) wh50Var).getValue()).h();
            float h3 = ((ContentSize) ((zak0) wh50Var).getValue()).h() - 20;
            q630.a aVar2 = q630.a.a;
            float f = 10;
            q630 H = s200.H(txj0.h(txj0.v(aVar2, h), h2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 16, f, 1);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, c, cri.a.d);
            vqv.a((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.c).getValue(), txj0.q(aVar2, h3), ((l5g) ((zak0) this.b).getValue()).a, M, 8, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new at3(this, i, 3);
        }
    }
}
