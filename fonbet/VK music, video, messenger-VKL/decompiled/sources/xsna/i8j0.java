package xsna;

import android.view.ViewGroup;
import com.vk.lists.c;
import xsna.m8j0;

/* compiled from: ShareStoryDataNarrativeDelegate.kt */
/* loaded from: classes16.dex */
public final class i8j0 extends p1u0<m8j0.c> {
    public final n8 a;
    public final n8j0 b;

    /* compiled from: ShareStoryDataNarrativeDelegate.kt */
    public static final class a extends vfz<m8j0.c> {
        public final h8j0 l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h8j0 h8j0Var) {
            super(h8j0Var);
            f4m.q(iah0.a(8), h8j0Var);
            this.l = h8j0Var;
        }

        @Override // xsna.vfz
        public final void W5(m8j0.c cVar) {
            m8j0.c cVar2 = cVar;
            boolean z = cVar2.e;
            h8j0 h8j0Var = this.l;
            if (z) {
                String str = cVar2.f;
                com.vk.lists.c cVar3 = h8j0Var.x;
                cVar3.o();
                cVar3.r(true);
                cVar3.s(str);
                if (str != null && !drm0.N(str)) {
                    cVar3.n(false);
                }
            }
            h8j0Var.v.setText(h8j0Var.getContext().getString(cVar2.c));
            h8j0Var.w.setItems(cVar2.d);
        }
    }

    public i8j0(n8 n8Var, n8j0 n8j0Var) {
        this.a = n8Var;
        this.b = n8j0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends m8j0.c> b(ViewGroup viewGroup) {
        return new a(new h8j0(viewGroup.getContext(), this.a, new c.h(this.b), Integer.MAX_VALUE));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof m8j0.c;
    }
}
