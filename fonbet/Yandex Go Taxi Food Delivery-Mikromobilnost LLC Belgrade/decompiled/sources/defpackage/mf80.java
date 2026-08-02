package defpackage;

import com.yandex.go.places.common.ui.gallery.a;
import com.yandex.go.places.organization.card.impl.ui.gallery.OrganizationCardGalleryView;

/* loaded from: classes13.dex */
public final /* synthetic */ class mf80 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ OrganizationCardGalleryView b;

    public /* synthetic */ mf80(OrganizationCardGalleryView organizationCardGalleryView, int i) {
        this.a = i;
        this.b = organizationCardGalleryView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 organizationAutoscrollGalleryController_delegate$lambda$0$0;
        ui80 organizationImagesSliderAdapter_delegate$lambda$0;
        pj80 onPageChangeCallback_delegate$lambda$0;
        a organizationAutoscrollGalleryController_delegate$lambda$0;
        int i = this.a;
        OrganizationCardGalleryView organizationCardGalleryView = this.b;
        switch (i) {
            case 0:
                organizationAutoscrollGalleryController_delegate$lambda$0$0 = OrganizationCardGalleryView.organizationAutoscrollGalleryController_delegate$lambda$0$0(organizationCardGalleryView);
                return organizationAutoscrollGalleryController_delegate$lambda$0$0;
            case 1:
                organizationImagesSliderAdapter_delegate$lambda$0 = OrganizationCardGalleryView.organizationImagesSliderAdapter_delegate$lambda$0(organizationCardGalleryView);
                return organizationImagesSliderAdapter_delegate$lambda$0;
            case 2:
                onPageChangeCallback_delegate$lambda$0 = OrganizationCardGalleryView.onPageChangeCallback_delegate$lambda$0(organizationCardGalleryView);
                return onPageChangeCallback_delegate$lambda$0;
            default:
                organizationAutoscrollGalleryController_delegate$lambda$0 = OrganizationCardGalleryView.organizationAutoscrollGalleryController_delegate$lambda$0(organizationCardGalleryView);
                return organizationAutoscrollGalleryController_delegate$lambda$0;
        }
    }
}
