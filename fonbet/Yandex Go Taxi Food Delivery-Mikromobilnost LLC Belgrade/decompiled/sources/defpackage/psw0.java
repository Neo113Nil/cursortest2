package defpackage;

import ru.yandex.taxi.surge.dialog.SurgeInfoModalView;

/* loaded from: classes6.dex */
public final class psw0 implements tsw0 {
    public final /* synthetic */ SurgeInfoModalView a;

    public psw0(SurgeInfoModalView surgeInfoModalView) {
        this.a = surgeInfoModalView;
    }

    @Override // defpackage.tsw0
    public final void j6(jtw0 jtw0Var) {
        rsw0 binding;
        rsw0 binding2;
        rsw0 binding3;
        rsw0 binding4;
        rsw0 binding5;
        rsw0 binding6;
        rsw0 binding7;
        upw0 upw0Var;
        upw0 upw0Var2;
        rsw0 binding8;
        rsw0 binding9;
        rsw0 binding10;
        c57 c57Var;
        boolean z = jtw0Var instanceof htw0;
        SurgeInfoModalView surgeInfoModalView = this.a;
        if (!z) {
            if (!jl40.l(jtw0Var, itw0.a)) {
                w511.b();
                return;
            }
            binding = surgeInfoModalView.getBinding();
            cma1.J(binding.h.b);
            binding2 = surgeInfoModalView.getBinding();
            cma1.M(binding2.f);
            binding3 = surgeInfoModalView.getBinding();
            cma1.M(binding3.c);
            binding4 = surgeInfoModalView.getBinding();
            binding4.e.setVisibility(8);
            return;
        }
        binding5 = surgeInfoModalView.getBinding();
        cma1.L(binding5.h.b);
        binding6 = surgeInfoModalView.getBinding();
        cma1.J(binding6.f);
        binding7 = surgeInfoModalView.getBinding();
        cma1.J(binding7.c);
        upw0Var = surgeInfoModalView.mainSectionAdapter;
        htw0 htw0Var = (htw0) jtw0Var;
        q47 q47Var = htw0Var.c;
        upw0Var.submitList(htw0Var.a, null);
        upw0Var2 = surgeInfoModalView.bottomSectionAdapter;
        upw0Var2.submitList(htw0Var.b, null);
        binding8 = surgeInfoModalView.getBinding();
        binding8.e.setVisibility(0);
        if (q47Var == null) {
            binding9 = surgeInfoModalView.getBinding();
            binding9.b.setVisibility(8);
        } else {
            binding10 = surgeInfoModalView.getBinding();
            binding10.b.setVisibility(0);
            c57Var = surgeInfoModalView.actionButtons;
            ((pm5) c57Var).d(q47Var);
        }
    }
}
