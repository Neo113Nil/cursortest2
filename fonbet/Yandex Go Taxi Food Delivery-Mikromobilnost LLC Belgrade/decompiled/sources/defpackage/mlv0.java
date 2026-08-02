package defpackage;

import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class mlv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ slv0 b;

    public /* synthetic */ mlv0(slv0 slv0Var, int i) {
        this.a = i;
        this.b = slv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        slv0 slv0Var = this.b;
        switch (i) {
            case 0:
                slv0Var.Kg();
                break;
            case 1:
                SummaryPromotionModalWindowsModalView.setupButton$onAcceptActionSelected(slv0Var);
                break;
            default:
                slv0Var.Kg();
                break;
        }
    }
}
