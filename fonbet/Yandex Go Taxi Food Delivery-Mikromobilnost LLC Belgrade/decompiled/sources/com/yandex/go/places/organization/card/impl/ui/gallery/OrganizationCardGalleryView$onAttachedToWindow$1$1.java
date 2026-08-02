package com.yandex.go.places.organization.card.impl.ui.gallery;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.places.common.ui.gallery.a;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;
import defpackage.fug0;
import defpackage.ip11;
import defpackage.jf80;
import defpackage.lf80;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.nf80;
import defpackage.ny61;
import defpackage.pj80;
import defpackage.tse;
import defpackage.ui80;
import defpackage.wh91;
import defpackage.wls;
import defpackage.zmh;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.badge.DiscountBadgeView;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.gallery.OrganizationCardGalleryView$onAttachedToWindow$1$1", f = "OrganizationCardGalleryView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class OrganizationCardGalleryView$onAttachedToWindow$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ jf80 $this_with;
    int label;
    final /* synthetic */ OrganizationCardGalleryView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardGalleryView$onAttachedToWindow$1$1(OrganizationCardGalleryView organizationCardGalleryView, jf80 jf80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = organizationCardGalleryView;
        this.$this_with = jf80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardGalleryView$onAttachedToWindow$1$1(this.this$0, this.$this_with, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrganizationCardGalleryView$onAttachedToWindow$1$1 organizationCardGalleryView$onAttachedToWindow$1$1 = (OrganizationCardGalleryView$onAttachedToWindow$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        organizationCardGalleryView$onAttachedToWindow$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jf80 jf80Var;
        int i;
        jf80 jf80Var2;
        ip11 ip11Var;
        lf80 lf80Var;
        int d;
        lf80 lf80Var2;
        lf80 lf80Var3;
        pj80 onPageChangeCallback;
        ui80 organizationImagesSliderAdapter;
        a organizationAutoscrollGalleryController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        jf80Var = this.this$0.binding;
        OrganizationCardGalleryView organizationCardGalleryView = jf80Var.a;
        i = this.this$0.containerHeight;
        c.D(organizationCardGalleryView.getLayoutParams().width, i, organizationCardGalleryView);
        jf80Var2 = this.this$0.binding;
        DiscountBadgeView discountBadgeView = jf80Var2.d;
        ip11Var = this.this$0.typefaceDelegate;
        this.this$0.getContext();
        discountBadgeView.setTypeface(((zmh) ip11Var).d());
        lf80Var = this.this$0.galleryConfig;
        boolean z = lf80Var.a;
        OrganizationCardGalleryView organizationCardGalleryView2 = this.this$0;
        if (z) {
            organizationCardGalleryView2.setBackgroundColor(c.a(mqg0.black, organizationCardGalleryView2));
            d = 0;
        } else {
            organizationCardGalleryView2.setBackgroundColor(c.a(mqg0.transparent, organizationCardGalleryView2));
            d = c.d(fug0.discovery_organizations_card_image_slider_inner_horizontal_margin, this.this$0);
        }
        DotsIndicatorComponent dotsIndicatorComponent = this.$this_with.b;
        lf80Var2 = this.this$0.galleryConfig;
        dotsIndicatorComponent.setVisibility(lf80Var2.a ? 0 : 8);
        ViewPager2 viewPager2 = this.$this_with.e;
        OrganizationCardGalleryView organizationCardGalleryView3 = this.this$0;
        wh91.a(viewPager2);
        lf80Var3 = organizationCardGalleryView3.galleryConfig;
        if (lf80Var3.a) {
            organizationAutoscrollGalleryController = organizationCardGalleryView3.getOrganizationAutoscrollGalleryController();
            viewPager2.registerOnPageChangeCallback(organizationAutoscrollGalleryController);
        } else {
            onPageChangeCallback = organizationCardGalleryView3.getOnPageChangeCallback();
            viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
        }
        organizationImagesSliderAdapter = organizationCardGalleryView3.getOrganizationImagesSliderAdapter();
        viewPager2.setAdapter(organizationImagesSliderAdapter);
        viewPager2.addItemDecoration(new nf80(d));
        return zy11.a;
    }
}
