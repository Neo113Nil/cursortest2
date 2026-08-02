package defpackage;

import com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalView;
import com.yandex.go.taxi.order.superapp.orders.ui.b;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.f;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class hos0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ hos0(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SlideableModalView.onArrowClickListener$lambda$0();
                break;
            case 1:
                SolidSummaryView.bottomOffsetCanceller$lambda$0();
                break;
            case 2:
                SourceAddressConfirmationModalView.lambda$5$0();
                break;
            case 4:
                TaxiOnTheWayStateView.onContainerViewTransitionFinished$lambda$0();
                break;
            case 5:
                TaxiOnTheWayStateView.showMultiorderBubblePendingAction$lambda$0();
                break;
            case 6:
                int i = b.p1;
                break;
            case 7:
                VaultsPagerView.disableUserInput$lambda$0();
                break;
            case 8:
                int i2 = f.V1;
                break;
            case 9:
                int i3 = ky31.T;
                break;
            case 10:
                WebViewContainerImpl.initErrorView$lambda$0();
                break;
        }
    }
}
