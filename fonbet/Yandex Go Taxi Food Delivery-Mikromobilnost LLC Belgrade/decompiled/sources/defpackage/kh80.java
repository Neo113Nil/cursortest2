package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.a;

/* loaded from: classes13.dex */
public final class kh80 extends ViewPager2.a {
    public final /* synthetic */ OrganizationCardsSliderModalView a;

    public kh80(OrganizationCardsSliderModalView organizationCardsSliderModalView) {
        this.a = organizationCardsSliderModalView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        a aVar;
        OrganizationCardsSliderModalView organizationCardsSliderModalView = this.a;
        aVar = organizationCardsSliderModalView.adapter;
        aVar.l(i);
        organizationCardsSliderModalView.updateNestedScrollView();
    }
}
