package com.yandex.go.places.organization.card.impl.ui.gallery;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;
import com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.b;
import com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.c;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.g0c;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.ip11;
import defpackage.jf80;
import defpackage.kf80;
import defpackage.ki80;
import defpackage.lf80;
import defpackage.li80;
import defpackage.mf80;
import defpackage.mi80;
import defpackage.nj4;
import defpackage.ny61;
import defpackage.o990;
import defpackage.pav;
import defpackage.pj80;
import defpackage.pzt0;
import defpackage.q6h0;
import defpackage.qoi0;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tje;
import defpackage.txc;
import defpackage.ub60;
import defpackage.ui80;
import defpackage.v4;
import defpackage.vi80;
import defpackage.vuh0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.StoryProgressComponent;
import ru.yandex.taxi.design.badge.DiscountBadgeView;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BK\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ/\u0010#\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u001f¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/ui/gallery/OrganizationCardGalleryView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "", "containerWidth", "containerHeight", "Lkf80;", "cardGalleryCallbacks", "Llf80;", "galleryConfig", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lpav;IILkf80;Llf80;Lip11;)V", "", "Lmi80;", "images", "Lzy11;", "renderGalleryProgressComponent", "(Ljava/util/List;)V", "Lnj4;", "badge", "renderBadge", "(Lnj4;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "galleryItems", "", "shouldRenderProgressBar", "setContent$impl", "(Ljava/util/List;Lnj4;Z)V", "setContent", "index", "isSmoothScroll", "selectGalleryItem", "(IZ)V", "Lpav;", CA20Status.STATUS_USER_I, "Lkf80;", "Llf80;", "Lip11;", "Ljf80;", "binding", "Ljf80;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Lui80;", "organizationImagesSliderAdapter$delegate", "Li3y;", "getOrganizationImagesSliderAdapter", "()Lui80;", "organizationImagesSliderAdapter", "Lpj80;", "onPageChangeCallback$delegate", "getOnPageChangeCallback", "()Lpj80;", "onPageChangeCallback", "Lcom/yandex/go/places/common/ui/gallery/a;", "organizationAutoscrollGalleryController$delegate", "getOrganizationAutoscrollGalleryController", "()Lcom/yandex/go/places/common/ui/gallery/a;", "organizationAutoscrollGalleryController", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardGalleryView extends GoFrameLayout {
    public static final int $stable = 8;
    private final jf80 binding;
    private final kf80 cardGalleryCallbacks;
    private final int containerHeight;
    private final int containerWidth;
    private final lf80 galleryConfig;
    private final pav imageLoader;

    /* renamed from: onPageChangeCallback$delegate, reason: from kotlin metadata */
    private final i3y onPageChangeCallback;

    /* renamed from: organizationAutoscrollGalleryController$delegate, reason: from kotlin metadata */
    private final i3y organizationAutoscrollGalleryController;

    /* renamed from: organizationImagesSliderAdapter$delegate, reason: from kotlin metadata */
    private final i3y organizationImagesSliderAdapter;
    private final hbp0 scopeDelegate;
    private final ip11 typefaceDelegate;

    public OrganizationCardGalleryView(Context context, pav pavVar, int i, int i2, kf80 kf80Var, lf80 lf80Var, ip11 ip11Var) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.containerWidth = i;
        this.containerHeight = i2;
        this.cardGalleryCallbacks = kf80Var;
        this.galleryConfig = lf80Var;
        this.typefaceDelegate = ip11Var;
        LayoutInflater.from(context).inflate(vuh0.organization_card_gallery, this);
        int i3 = q6h0.banner_dots_view;
        DotsIndicatorComponent dotsIndicatorComponent = (DotsIndicatorComponent) cma1.O(i3, this);
        if (dotsIndicatorComponent != null) {
            i3 = q6h0.banner_story_progress_view;
            StoryProgressComponent storyProgressComponent = (StoryProgressComponent) cma1.O(i3, this);
            if (storyProgressComponent != null) {
                i3 = q6h0.images_badge;
                DiscountBadgeView discountBadgeView = (DiscountBadgeView) cma1.O(i3, this);
                if (discountBadgeView != null) {
                    i3 = q6h0.images_slider;
                    ViewPager2 viewPager2 = (ViewPager2) cma1.O(i3, this);
                    if (viewPager2 != null) {
                        this.binding = new jf80(this, dotsIndicatorComponent, storyProgressComponent, discountBadgeView, viewPager2);
                        String d = qoi0.a(OrganizationCardGalleryView.class).d();
                        this.scopeDelegate = new hbp0(new czo0(14), d == null ? "" : d, null);
                        mf80 mf80Var = new mf80(this, 1);
                        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                        this.organizationImagesSliderAdapter = a.b(lazyThreadSafetyMode, mf80Var);
                        this.onPageChangeCallback = a.b(lazyThreadSafetyMode, new mf80(this, 2));
                        this.organizationAutoscrollGalleryController = a.b(lazyThreadSafetyMode, new mf80(this, 3));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pj80 getOnPageChangeCallback() {
        return (pj80) this.onPageChangeCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.yandex.go.places.common.ui.gallery.a getOrganizationAutoscrollGalleryController() {
        return (com.yandex.go.places.common.ui.gallery.a) this.organizationAutoscrollGalleryController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ui80 getOrganizationImagesSliderAdapter() {
        return (ui80) this.organizationImagesSliderAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pj80 onPageChangeCallback_delegate$lambda$0(OrganizationCardGalleryView organizationCardGalleryView) {
        return new pj80(0, organizationCardGalleryView.binding.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.yandex.go.places.common.ui.gallery.a organizationAutoscrollGalleryController_delegate$lambda$0(OrganizationCardGalleryView organizationCardGalleryView) {
        return new com.yandex.go.places.common.ui.gallery.a(organizationCardGalleryView.binding.c, new mf80(organizationCardGalleryView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 organizationAutoscrollGalleryController_delegate$lambda$0$0(OrganizationCardGalleryView organizationCardGalleryView) {
        ViewPager2 viewPager2 = organizationCardGalleryView.binding.e;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ui80 organizationImagesSliderAdapter_delegate$lambda$0(OrganizationCardGalleryView organizationCardGalleryView) {
        pav pavVar = organizationCardGalleryView.imageLoader;
        int i = organizationCardGalleryView.containerWidth;
        int i2 = organizationCardGalleryView.containerHeight;
        ub60 ub60Var = new ub60(19, organizationCardGalleryView);
        OrganizationCardGalleryView$organizationImagesSliderAdapter$2$2 organizationCardGalleryView$organizationImagesSliderAdapter$2$2 = new OrganizationCardGalleryView$organizationImagesSliderAdapter$2$2(0, organizationCardGalleryView.cardGalleryCallbacks, kf80.class, "onErrorStateClicked", "onErrorStateClicked()V", 0);
        lf80 lf80Var = organizationCardGalleryView.galleryConfig;
        txc txcVar = new txc(4, ub60Var);
        int i3 = b.Z;
        g0c a = qoi0.a(ki80.class);
        List list = vi80.a;
        zxs zxsVar = new zxs(a.a(), 0, null, list, null, new v4(pavVar, i, i2, organizationCardGalleryView$organizationImagesSliderAdapter$2$2, lf80Var));
        int i4 = c.U;
        g0c a2 = qoi0.a(li80.class);
        return new ui80(txcVar, scc.g(zxsVar, new zxs(a2.a(), 0, null, list, null, new o990(5, pavVar, lf80Var))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 organizationImagesSliderAdapter_delegate$lambda$0$0(OrganizationCardGalleryView organizationCardGalleryView, mi80 mi80Var) {
        com.yandex.go.places.common.ui.gallery.a organizationAutoscrollGalleryController = organizationCardGalleryView.getOrganizationAutoscrollGalleryController();
        pzt0 pzt0Var = organizationAutoscrollGalleryController.w.a;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        organizationAutoscrollGalleryController.b.setCurrentMediaProgressPercent(0.0f);
        ((com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c) organizationCardGalleryView.cardGalleryCallbacks).Ng(mi80Var);
        return zy11.a;
    }

    private final void renderBadge(nj4 badge) {
        DiscountBadgeView discountBadgeView = this.binding.d;
        if (badge == null) {
            discountBadgeView.setVisibility(8);
            return;
        }
        discountBadgeView.setBackgroundTintList(ColorStateList.valueOf(s8o.m(badge.b, discountBadgeView.getContext())));
        discountBadgeView.setText(badge.a);
        discountBadgeView.setVisibility(0);
    }

    private final void renderGalleryProgressComponent(List<? extends mi80> images) {
        tje.N(this.scopeDelegate.c(), null, null, new OrganizationCardGalleryView$renderGalleryProgressComponent$1(this, images, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
        tje.N(this.scopeDelegate.c(), null, null, new OrganizationCardGalleryView$onAttachedToWindow$1$1(this, this.binding, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scopeDelegate.b();
        ViewPager2 viewPager2 = this.binding.e;
        viewPager2.unregisterOnPageChangeCallback(getOnPageChangeCallback());
        viewPager2.unregisterOnPageChangeCallback(getOrganizationAutoscrollGalleryController());
        viewPager2.setAdapter(null);
    }

    public final void selectGalleryItem(int index, boolean isSmoothScroll) {
        this.binding.e.setCurrentItem(index, isSmoothScroll);
        com.yandex.go.places.common.ui.gallery.a organizationAutoscrollGalleryController = getOrganizationAutoscrollGalleryController();
        organizationAutoscrollGalleryController.y = true;
        StoryProgressComponent storyProgressComponent = organizationAutoscrollGalleryController.b;
        storyProgressComponent.setCurrentMedia(index);
        storyProgressComponent.setCurrentMediaProgressPercent(0.0f);
        storyProgressComponent.invalidateComponent();
        organizationAutoscrollGalleryController.a();
    }

    public final void setContent$impl(List<? extends mi80> galleryItems, nj4 badge, boolean shouldRenderProgressBar) {
        getOrganizationImagesSliderAdapter().submitList(galleryItems, null);
        renderBadge(badge);
        if (shouldRenderProgressBar) {
            renderGalleryProgressComponent(galleryItems);
        }
    }
}
