package defpackage;

import defpackage.iaz0;

/* loaded from: classes15.dex */
public final class gab implements daz0 {
    public final /* synthetic */ hab a;

    public gab(hab habVar) {
        this.a = habVar;
    }

    @Override // defpackage.daz0
    public final void a(jaz0 jaz0Var) {
        int i = jaz0Var.a;
        hab habVar = this.a;
        habVar.notifyItemChanged(habVar.f() + i);
    }

    @Override // defpackage.daz0
    public final void b(iaz0.a aVar) {
        this.a.notifyDataSetChanged();
    }

    @Override // defpackage.daz0
    public final void d(eaz0 eaz0Var) {
        int i = eaz0Var.a;
        hab habVar = this.a;
        habVar.notifyItemInserted(habVar.f() + i);
    }

    @Override // defpackage.daz0
    public final void e(kaz0 kaz0Var) {
        int i = kaz0Var.a;
        hab habVar = this.a;
        habVar.notifyItemRangeChanged(habVar.f() + i, kaz0Var.b);
    }

    @Override // defpackage.daz0
    public final void f(caz0 caz0Var) {
        int i = caz0Var.a;
        hab habVar = this.a;
        habVar.notifyItemRemoved(habVar.f() + i);
    }

    @Override // defpackage.daz0
    public final void h(faz0 faz0Var) {
        int i = faz0Var.a;
        hab habVar = this.a;
        habVar.notifyItemInserted(habVar.f() + i);
    }
}
