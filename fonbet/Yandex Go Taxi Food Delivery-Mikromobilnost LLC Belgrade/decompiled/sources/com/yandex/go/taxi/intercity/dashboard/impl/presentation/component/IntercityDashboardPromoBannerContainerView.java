package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$CarouselSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;
import defpackage.bfw;
import defpackage.cma1;
import defpackage.ejw;
import defpackage.faw;
import defpackage.j8h0;
import defpackage.k7x0;
import defpackage.kw00;
import defpackage.mhw;
import defpackage.nhw;
import defpackage.ny61;
import defpackage.ohw;
import defpackage.p7h;
import defpackage.pav;
import defpackage.pdc;
import defpackage.phw;
import defpackage.qhw;
import defpackage.rlf0;
import defpackage.scc;
import defpackage.tkh0;
import defpackage.tqd;
import defpackage.tug0;
import defpackage.whw;
import defpackage.xen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0006*\u00013\u0018\u0000 62\u00020\u0001:\u00017B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardPromoBannerContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "dashboardPresenter", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lpdc;", "colorConverter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;Lpav;Lk7x0;Lpdc;)V", "", "position", "Lzy11;", "updateViewPagerPadding", "(I)V", "itemsCount", "setupPromoBannerPagerPaddings", "removeAutoscrollIfNeed", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lejw;", "promoBannerSection", "render$impl", "(Lejw;)V", "render", "startDelayedAutoscroll$impl", "startDelayedAutoscroll", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "Lnhw;", "binding", "Lnhw;", "Landroidx/viewpager2/widget/ViewPager2;", "promoBannerPager", "Landroidx/viewpager2/widget/ViewPager2;", "Lrlf0;", "promoBannerViewPagerPaddingHandler", "Lrlf0;", "Lmhw;", "promoBannerAdapter", "Lmhw;", "Ljava/lang/Runnable;", "autoscrollRunnable", "Ljava/lang/Runnable;", "", "isScrolled", "Z", "qhw", "onPageChangeCallback", "Lqhw;", "Companion", "phw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardPromoBannerContainerView extends FrameLayout {
    private static final long AUTOSCROLL_DELAY_MILLIS = 5000;
    private static final int BANNERS_COUNT_FOR_EQUAL_PADDINGS = 1;
    private static final phw Companion = new phw();
    private static final int INDEX_PAGE_FIRST = 0;
    private static final int INDEX_PAGE_FOR_AUTOSCROLL = 1;
    private static final int OFFSCREEN_PAGE_LIMIT = 1;
    private final Runnable autoscrollRunnable;
    private final nhw binding;
    private final g dashboardPresenter;
    private boolean isScrolled;
    private final qhw onPageChangeCallback;
    private final mhw promoBannerAdapter;
    private final ViewPager2 promoBannerPager;
    private final rlf0 promoBannerViewPagerPaddingHandler;

    public IntercityDashboardPromoBannerContainerView(Context context, g gVar, pav pavVar, k7x0 k7x0Var, pdc pdcVar) {
        super(context);
        this.dashboardPresenter = gVar;
        int i = 0;
        View inflate = LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_promo_banner_container, (ViewGroup) this, false);
        addView(inflate);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i2 = j8h0.promo_banner_pager;
        ViewPager2 viewPager2 = (ViewPager2) cma1.O(i2, inflate);
        if (viewPager2 == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            throw null;
        }
        this.binding = new nhw(frameLayout, viewPager2);
        this.promoBannerPager = viewPager2;
        this.promoBannerViewPagerPaddingHandler = new rlf0(viewPager2);
        this.promoBannerAdapter = new mhw(pavVar, k7x0Var, pdcVar, new xen(27, this));
        this.autoscrollRunnable = new ohw(this, i);
        this.onPageChangeCallback = new qhw(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoscrollRunnable$lambda$0(IntercityDashboardPromoBannerContainerView intercityDashboardPromoBannerContainerView) {
        intercityDashboardPromoBannerContainerView.promoBannerPager.setCurrentItem(1);
        whw whwVar = intercityDashboardPromoBannerContainerView.dashboardPresenter.z.e;
        whwVar.a.p(whwVar.a.i("promo_banner_autoscroll_count", 0) + 1, "promo_banner_autoscroll_count");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void promoBannerAdapter$lambda$0(IntercityDashboardPromoBannerContainerView intercityDashboardPromoBannerContainerView, faw fawVar, String str) {
        intercityDashboardPromoBannerContainerView.dashboardPresenter.Mg(fawVar, str);
        intercityDashboardPromoBannerContainerView.removeCallbacks(intercityDashboardPromoBannerContainerView.autoscrollRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeAutoscrollIfNeed(int position) {
        if (position != 0) {
            this.isScrolled = true;
            removeCallbacks(this.autoscrollRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0(ArrayList arrayList, List list, IntercityDashboardPromoBannerContainerView intercityDashboardPromoBannerContainerView) {
        if (arrayList.isEmpty() || list.size() == arrayList.size()) {
            return;
        }
        intercityDashboardPromoBannerContainerView.promoBannerPager.post(new ohw(intercityDashboardPromoBannerContainerView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0$0(IntercityDashboardPromoBannerContainerView intercityDashboardPromoBannerContainerView) {
        intercityDashboardPromoBannerContainerView.promoBannerPager.setCurrentItem(0);
    }

    private final void setupPromoBannerPagerPaddings(int itemsCount) {
        rlf0 rlf0Var = this.promoBannerViewPagerPaddingHandler;
        if (itemsCount == 1) {
            Resources resources = rlf0Var.b;
            rlf0Var.a.setPadding((int) resources.getDimension(tug0.content_horizontal_padding), 0, (int) resources.getDimension(tug0.content_horizontal_padding), 0);
            return;
        }
        Resources resources2 = rlf0Var.b;
        rlf0Var.a.setPadding((int) resources2.getDimension(tug0.content_horizontal_padding), 0, (int) resources2.getDimension(tug0.promo_banner_pager_end_padding_for_scroll), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewPagerPadding(int position) {
        int f = scc.f(this.promoBannerAdapter.getCurrentList());
        rlf0 rlf0Var = this.promoBannerViewPagerPaddingHandler;
        if (position == f) {
            Resources resources = rlf0Var.b;
            rlf0Var.a.setPadding((int) resources.getDimension(tug0.content_horizontal_padding), 0, (int) resources.getDimension(tug0.content_horizontal_padding), 0);
            return;
        }
        Resources resources2 = rlf0Var.b;
        rlf0Var.a.setPadding((int) resources2.getDimension(tug0.content_horizontal_padding), 0, (int) resources2.getDimension(tug0.promo_banner_pager_end_padding_for_scroll), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tqd tqdVar = new tqd();
        tqdVar.a(new kw00(getResources().getDimensionPixelSize(tug0.promo_banner_margin), 0));
        this.promoBannerPager.setPageTransformer(tqdVar);
        this.promoBannerPager.setOffscreenPageLimit(1);
        setupPromoBannerPagerPaddings(this.promoBannerAdapter.getItemCount());
        this.promoBannerPager.registerOnPageChangeCallback(this.onPageChangeCallback);
        this.promoBannerPager.setAdapter(this.promoBannerAdapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.autoscrollRunnable);
        this.promoBannerPager.unregisterOnPageChangeCallback(this.onPageChangeCallback);
    }

    public final void render$impl(ejw promoBannerSection) {
        Object obj;
        IntercityDashboardSectionDto$CarouselSectionDtoIntercity intercityDashboardSectionDto$CarouselSectionDtoIntercity;
        removeCallbacks(this.autoscrollRunnable);
        List<Object> currentList = this.promoBannerAdapter.getCurrentList();
        ArrayList arrayList = new ArrayList(promoBannerSection.a);
        setupPromoBannerPagerPaddings(arrayList.size());
        this.promoBannerAdapter.submitList(arrayList, new p7h(23, arrayList, currentList, this));
        g gVar = this.dashboardPresenter;
        int f = scc.f(arrayList);
        boolean z = this.isScrolled;
        f fVar = gVar.z;
        IntercityDashboardResponseDto intercityDashboardResponseDto = fVar.a.a().c;
        if (intercityDashboardResponseDto == null) {
            intercityDashboardSectionDto$CarouselSectionDtoIntercity = null;
        } else {
            Iterator it = intercityDashboardResponseDto.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((i0) obj) instanceof IntercityDashboardSectionDto$CarouselSectionDtoIntercity) {
                        break;
                    }
                }
            }
            if (!(obj instanceof IntercityDashboardSectionDto$CarouselSectionDtoIntercity)) {
                obj = null;
            }
            intercityDashboardSectionDto$CarouselSectionDtoIntercity = (IntercityDashboardSectionDto$CarouselSectionDtoIntercity) obj;
        }
        Integer num = intercityDashboardSectionDto$CarouselSectionDtoIntercity != null ? intercityDashboardSectionDto$CarouselSectionDtoIntercity.a : null;
        int i = fVar.e.a.i("promo_banner_autoscroll_count", 0);
        if (num == null || num.intValue() <= i || z || f < 1) {
            return;
        }
        ((bfw) gVar.Dg()).Oa();
    }

    public final void startDelayedAutoscroll$impl() {
        postDelayed(this.autoscrollRunnable, 5000L);
    }
}
