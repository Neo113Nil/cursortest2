package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Left;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PostingLeftIconCell.kt */
/* loaded from: classes18.dex */
public final class vgc0 implements Cell$Left {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e = androidx.compose.runtime.k.b(null);

    /* compiled from: PostingLeftIconCell.kt */
    public static final class a {
        public static vgc0 a(lg90 lg90Var, long j, androidx.compose.runtime.a aVar) {
            lg90 lg90Var2;
            long j2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1203867475, 3080, -1, "com.vk.feed.tool.compose.posting.step2cell.PostingLeftIconCell.Companion.invoke (PostingLeftIconCell.kt:54)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                lg90Var2 = lg90Var;
                j2 = j;
                vgc0 vgc0Var = new vgc0(lg90Var2, 20, 24, j2);
                aVar.R(vgc0Var);
                x = vgc0Var;
            } else {
                lg90Var2 = lg90Var;
                j2 = j;
            }
            vgc0 vgc0Var2 = (vgc0) x;
            wh50 wh50Var = vgc0Var2.a;
            wh50 wh50Var2 = vgc0Var2.c;
            wh50 wh50Var3 = vgc0Var2.b;
            ((zak0) wh50Var).setValue(lg90Var2);
            ((zak0) wh50Var3).setValue(new pco(((pco) ((zak0) wh50Var3).getValue()).b));
            ((zak0) wh50Var2).setValue(new pco(((pco) ((zak0) wh50Var2).getValue()).b));
            ((zak0) vgc0Var2.d).setValue(new l5g(j2));
            ((zak0) vgc0Var2.e).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return vgc0Var2;
        }
    }

    public vgc0(lg90 lg90Var, float f, float f2, long j) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = cq.f(f);
        this.c = cq.f(f2);
        this.d = zy60.d(j);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1780091118);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1780091118, i2, -1, "com.vk.feed.tool.compose.posting.step2cell.PostingLeftIconCell.Content (PostingLeftIconCell.kt:34)");
            }
            float f = ((pco) ((zak0) this.c).getValue()).b;
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(aVar2, f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q);
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
            pzu0.b((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.e).getValue(), txj0.q(aVar2, ((pco) ((zak0) this.b).getValue()).b), ((l5g) ((zak0) this.d).getValue()).a, M, 8, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gdv(i, 3, this, spg0Var, q630Var);
        }
    }
}
