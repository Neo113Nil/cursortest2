package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import xsna.r1k0;

/* compiled from: SlidingBlockDelegate.kt */
/* loaded from: classes7.dex */
public final class n1k0 extends p1u0<r1k0> {
    public final c4 a;

    /* compiled from: SlidingBlockDelegate.kt */
    public static final class a extends vfz<r1k0> {
        public final c4 l;
        public final wh50 m;
        public final wh50 n;

        public a(ViewGroup viewGroup, c4 c4Var) {
            super(new ComposeView(viewGroup.getContext(), null, 6));
            this.l = c4Var;
            ComposeView composeView = (ComposeView) this.itemView;
            this.m = androidx.compose.runtime.k.b(r1k0.b.c.a);
            this.n = androidx.compose.runtime.k.b(new qyi0(this, 3));
            composeView.setContent(new jai(1967409026, new z5(this, 10), true));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(r1k0 r1k0Var) {
            ((zak0) this.m).setValue(r1k0Var.b);
        }

        public final void h6(r1k0.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            androidx.compose.runtime.a M = aVar.M(-634715044);
            int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-634715044, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.SlidingBlockDelegate.ViewHolder.SlidingBlock (SlidingBlockDelegate.kt:79)");
                }
                if (bVar instanceof r1k0.b.C3591b) {
                    M.K(1945406060);
                    s1k0.a(i2 & 1008, M, ((r1k0.b.C3591b) bVar).a, izsVar, q630Var);
                    M.j();
                } else if (bVar instanceof r1k0.b.c) {
                    M.K(-75785723);
                    u1k0.a(q630Var, M, 6);
                    M.j();
                } else {
                    if (!epx.f(bVar, r1k0.b.a.a)) {
                        throw alb0.c(-75794242, M);
                    }
                    M.K(-75782848);
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new jct(this, bVar, izsVar, q630Var, i);
            }
        }
    }

    public n1k0(c4 c4Var) {
        this.a = c4Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends r1k0> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof r1k0;
    }
}
