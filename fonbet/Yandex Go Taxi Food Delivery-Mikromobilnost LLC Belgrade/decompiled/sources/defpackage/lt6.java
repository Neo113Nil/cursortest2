package defpackage;

import com.yandex.go.taxi.order.promotions.modal_default.OrderDefaultModalView;
import com.yandex.go.taxi.order.robotaxi.ui.RobotaxiModalView;
import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class lt6 implements rqs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nwy0 b;

    public /* synthetic */ lt6(nwy0 nwy0Var, int i) {
        this.a = i;
        this.b = nwy0Var;
    }

    @Override // defpackage.rqs0
    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
        int i = this.a;
        nwy0 nwy0Var = this.b;
        switch (i) {
            case 0:
                ((ur70) ((mt6) nwy0Var).T).getClass();
                OrderDefaultModalView.onAttachedToWindow$lambda$0(nqs0Var);
                break;
            case 1:
                RobotaxiModalView.renderBullets$lambda$0$0((RobotaxiModalView) nwy0Var, nqs0Var, wss0Var);
                break;
            default:
                ((SummaryPromotionModalWindowsModalView) nwy0Var).handleBulletAction(nqs0Var);
                break;
        }
    }
}
