package defpackage;

import ru.yandex.taxi.hiredriver.HireDriverModalView;

/* loaded from: classes5.dex */
public final class mku implements pku {
    public final /* synthetic */ HireDriverModalView a;

    public mku(HireDriverModalView hireDriverModalView) {
        this.a = hireDriverModalView;
    }

    @Override // defpackage.pku
    public final void C3(boolean z) {
        nku binding;
        nku binding2;
        HireDriverModalView hireDriverModalView = this.a;
        if (!z) {
            binding = hireDriverModalView.getBinding();
            binding.d.stopProgressAnimation();
        } else {
            binding2 = hireDriverModalView.getBinding();
            binding2.d.startProgressAnimation(Integer.valueOf(qje.t(xng0.controlMain, hireDriverModalView.getContext())), 800);
        }
    }
}
