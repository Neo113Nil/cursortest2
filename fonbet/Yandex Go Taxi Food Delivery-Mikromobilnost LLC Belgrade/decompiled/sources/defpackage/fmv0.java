package defpackage;

import ru.yandex.taxi.summary.solid.modal_on_order.ui.mvp.SummaryPromotionOnOrderModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class fmv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kmv0 b;

    public /* synthetic */ fmv0(kmv0 kmv0Var, int i) {
        this.a = i;
        this.b = kmv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        kmv0 kmv0Var = this.b;
        switch (i) {
            case 0:
                kmv0Var.Kg();
                break;
            case 1:
                kmv0Var.Kg();
                break;
            default:
                SummaryPromotionOnOrderModalView.setupOrderButton$onAcceptActionSelected(kmv0Var);
                break;
        }
    }
}
