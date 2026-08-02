package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;
import com.yandex.go.places.organization.card.impl.ui.gallery.OrganizationCardGalleryView;
import ru.yandex.taxi.design.StoryProgressComponent;
import ru.yandex.taxi.design.badge.DiscountBadgeView;

/* loaded from: classes13.dex */
public final class jf80 implements zo31 {
    public final OrganizationCardGalleryView a;
    public final DotsIndicatorComponent b;
    public final StoryProgressComponent c;
    public final DiscountBadgeView d;
    public final ViewPager2 e;

    public jf80(OrganizationCardGalleryView organizationCardGalleryView, DotsIndicatorComponent dotsIndicatorComponent, StoryProgressComponent storyProgressComponent, DiscountBadgeView discountBadgeView, ViewPager2 viewPager2) {
        this.a = organizationCardGalleryView;
        this.b = dotsIndicatorComponent;
        this.c = storyProgressComponent;
        this.d = discountBadgeView;
        this.e = viewPager2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
