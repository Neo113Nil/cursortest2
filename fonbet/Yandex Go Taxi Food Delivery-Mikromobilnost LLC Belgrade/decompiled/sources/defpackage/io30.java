package defpackage;

import java.util.List;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;

/* loaded from: classes6.dex */
public final class io30 implements i3m {
    public final /* synthetic */ MtMainFlexModalView a;

    public io30(MtMainFlexModalView mtMainFlexModalView) {
        this.a = mtMainFlexModalView;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, long j, List list) {
        boolean z;
        p6q0 p6q0Var;
        lo30 lo30Var;
        MtMainFlexModalView mtMainFlexModalView = this.a;
        mtMainFlexModalView.revealFlexContentForTalkBack(list, xzlVar);
        z = mtMainFlexModalView.lcpReported;
        if (z || (p6q0Var = (p6q0) xzlVar.a.c.b(qoi0.a(p6q0.class))) == null || p6q0Var.a.isEmpty()) {
            return;
        }
        mtMainFlexModalView.lcpReported = true;
        lo30Var = mtMainFlexModalView.presenter;
        lo30Var.J.i(new e211(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT));
    }
}
