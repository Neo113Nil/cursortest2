package defpackage;

import android.view.View;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes13.dex */
public final class jh80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrganizationCardsSliderModalView b;

    public /* synthetic */ jh80(OrganizationCardsSliderModalView organizationCardsSliderModalView, int i) {
        this.a = i;
        this.b = organizationCardsSliderModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View content;
        int i;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        g gVar;
        qra0 peekTransformer;
        int i2;
        qra0 peekTransformer2;
        int i3 = this.a;
        OrganizationCardsSliderModalView organizationCardsSliderModalView = this.b;
        switch (i3) {
            case 0:
                content = organizationCardsSliderModalView.getContent();
                int height = content.getHeight();
                i = ((SlideableModalView) organizationCardsSliderModalView).topSystemWindowInset;
                OrganizationCardsSliderModalView.access$getBinding(organizationCardsSliderModalView).b.getLayoutParams().height = height - i;
                OrganizationCardsSliderModalView.access$getBinding(organizationCardsSliderModalView).b.requestLayout();
                break;
            default:
                gh80 gh80Var = OrganizationCardsSliderModalView.Companion;
                bottomSheetBehavior = organizationCardsSliderModalView.getBottomSheetBehavior();
                boolean a = gh80.a(gh80Var, bottomSheetBehavior);
                gVar = organizationCardsSliderModalView.sliderPresenter;
                gVar.Ng(a);
                if (!a) {
                    peekTransformer = organizationCardsSliderModalView.getPeekTransformer();
                    i2 = organizationCardsSliderModalView.peekOffset;
                    peekTransformer.a(i2);
                    OrganizationCardsSliderModalView.applyCollapsedVisualState$default(organizationCardsSliderModalView, false, 1, null);
                    organizationCardsSliderModalView.isCardExpanded = false;
                    break;
                } else {
                    OrganizationCardsSliderModalView.access$getBinding(organizationCardsSliderModalView).b.setUserInputEnabled(false);
                    peekTransformer2 = organizationCardsSliderModalView.getPeekTransformer();
                    peekTransformer2.a(0);
                    organizationCardsSliderModalView.applyExpandedVisualState();
                    organizationCardsSliderModalView.isCardExpanded = true;
                    break;
                }
        }
    }
}
