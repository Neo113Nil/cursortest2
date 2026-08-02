package defpackage;

import com.yandex.go.taxi.order.ui.status.OrderStatusModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class e880 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m880 b;

    public /* synthetic */ e880(m880 m880Var, int i) {
        this.a = i;
        this.b = m880Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m880 m880Var = this.b;
        switch (i) {
            case 0:
                OrderStatusModalView.floatBackButton$onFloatBackButtonPressed(m880Var);
                break;
            case 1:
                OrderStatusModalView.onAttachedToWindow$clickOnPrimaryButton(m880Var);
                break;
            case 2:
                OrderStatusModalView.onAttachedToWindow$clickOnSecondaryButton(m880Var);
                break;
            default:
                OrderStatusModalView.onAttachedToWindow$onFloatBackButtonPressed(m880Var);
                break;
        }
    }
}
