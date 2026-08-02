package defpackage;

import android.view.View;
import com.yandex.alicekit.core.widget.TabView;
import com.yandex.go.drive.vertical.ui.double_content_modal.DoubleContentModalView;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes15.dex */
public final /* synthetic */ class od8 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ od8(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                CardDetailsFragment.getViewBinding$lambda$27$lambda$10(view);
                break;
            case 1:
                DoubleContentModalView._init_$lambda$2(view);
                break;
            case 2:
                break;
            case 3:
                MtCollapsedRoutesView.lambda$1$0(view);
                break;
            case 4:
                MtCollapsedRoutesView.lambda$1$1(view);
                break;
            case 5:
                MtRoutesModalView.attachClickCatcher$lambda$0$0(view);
                break;
            case 6:
                PartnersFragment.getViewBinding$lambda$11$lambda$4(view);
                break;
            case 7:
                SolidSummaryView.lambda$9$0(view);
                break;
            case 8:
                TabView.lambda$new$1(view);
                break;
            default:
                TransferPhoneInputFragment.getViewBinding$lambda$14$lambda$10(view);
                break;
        }
    }
}
