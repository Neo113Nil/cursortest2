package defpackage;

import defpackage.s340;
import defpackage.tje;
import defpackage.zy6;
import java.util.List;
import ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorModalView;

/* loaded from: classes6.dex */
public final class o340 implements q340 {
    public final /* synthetic */ MtStopSelectorModalView a;

    public o340(MtStopSelectorModalView mtStopSelectorModalView) {
        this.a = mtStopSelectorModalView;
    }

    @Override // defpackage.q340
    public final void Q1(q47 q47Var) {
        final MtStopSelectorModalView mtStopSelectorModalView = this.a;
        mtStopSelectorModalView.getSuccessState().b.setVisibility(8);
        mtStopSelectorModalView.getLoadingState().b.setVisibility(8);
        mtStopSelectorModalView.getErrorState().b.setVisibility(0);
        ((pm5) mtStopSelectorModalView.getErrorState().c.buttonsContract()).d(q47Var);
        ((pm5) mtStopSelectorModalView.getErrorState().c.buttonsContract()).f(new b57() { // from class: ru.yandex.taxi.masstransit.geopayment.stopselector.a
            @Override // defpackage.b57
            public final void a(zy6 zy6Var) {
                s340 s340Var;
                s340Var = MtStopSelectorModalView.this.presenter;
                tje.N(s340Var.Jg(), null, null, new MtStopSelectorPresenter$onRetryClicked$1(s340Var, null), 3);
            }
        });
    }

    @Override // defpackage.q340
    public final void renderLoadingState() {
        MtStopSelectorModalView mtStopSelectorModalView = this.a;
        mtStopSelectorModalView.getSuccessState().b.setVisibility(8);
        mtStopSelectorModalView.getErrorState().b.setVisibility(8);
        mtStopSelectorModalView.getLoadingState().b.setVisibility(0);
    }

    @Override // defpackage.q340
    public final void vd(CharSequence charSequence, List list) {
        m440 m440Var;
        MtStopSelectorModalView mtStopSelectorModalView = this.a;
        mtStopSelectorModalView.getErrorState().b.setVisibility(8);
        mtStopSelectorModalView.getLoadingState().b.setVisibility(8);
        mtStopSelectorModalView.getSuccessState().b.setVisibility(0);
        mtStopSelectorModalView.getSuccessState().c.setTitle(charSequence);
        m440Var = mtStopSelectorModalView.adapter;
        m440Var.submitList(list, null);
    }
}
