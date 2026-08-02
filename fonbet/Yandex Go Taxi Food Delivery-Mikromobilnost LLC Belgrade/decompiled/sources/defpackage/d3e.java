package defpackage;

import com.yandex.go.payments.cards.ui.ConfirmPaymentMethodView;
import com.yandex.go.payments.cards.verification.confirm.ConfirmCardModalView;

/* loaded from: classes13.dex */
public final class d3e extends jey {
    public final /* synthetic */ ConfirmCardModalView a;

    public d3e(ConfirmCardModalView confirmCardModalView) {
        this.a = confirmCardModalView;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onPause() {
        ConfirmPaymentMethodView confirmPaymentMethodView;
        confirmPaymentMethodView = this.a.confirmCardView;
        if (confirmPaymentMethodView != null) {
            confirmPaymentMethodView.pause();
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onResume() {
        ConfirmPaymentMethodView confirmPaymentMethodView;
        confirmPaymentMethodView = this.a.confirmCardView;
        if (confirmPaymentMethodView != null) {
            confirmPaymentMethodView.resume();
        }
    }
}
