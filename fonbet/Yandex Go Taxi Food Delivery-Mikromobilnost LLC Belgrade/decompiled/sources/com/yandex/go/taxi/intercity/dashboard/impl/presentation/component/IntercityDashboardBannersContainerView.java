package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.b;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;
import defpackage.aaw;
import defpackage.baw;
import defpackage.caw;
import defpackage.daw;
import defpackage.eaw;
import defpackage.evu0;
import defpackage.faw;
import defpackage.gaw;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mp60;
import defpackage.nac;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.p7h;
import defpackage.pav;
import defpackage.qje;
import defpackage.tje;
import defpackage.tug0;
import defpackage.vng;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xy40;
import defpackage.z9w;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010#J'\u0010'\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010(J)\u0010.\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00132\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00102\u001a\u00020\u000f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001800¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000f2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00130A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardBannersContainerView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "dashboardPresenter", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;Lpav;Lk7x0;)V", "", "size", "Lzy11;", "applyBannerViewsCacheSize", "(I)V", "position", "Lru/yandex/taxi/design/ListItemComponent;", "getBannerItemView", "(I)Lru/yandex/taxi/design/ListItemComponent;", "view", "itemsCount", "Lgaw;", ClidProvider.STATE, "bindPromoItemUiState", "(Lru/yandex/taxi/design/ListItemComponent;IILgaw;)V", "Landroid/widget/ImageView;", "imageView", "reloadIconOnThemeChange", "(Landroid/widget/ImageView;)V", "", "iconTag", "setIconIfTagChanged", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "setIcon", "currentBannerIndex", "totalBannersAmount", "setupDivider", "(Lru/yandex/taxi/design/ListItemComponent;II)V", "setupShape", "bannerView", "Lfaw;", "action", "analyticsAdditionalInfo", "setupBannerAction", "(Lru/yandex/taxi/design/ListItemComponent;Lfaw;Ljava/lang/String;)V", "Lmp60;", "banners", "renderBanners", "(Lmp60;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "Lpav;", "Lk7x0;", "", "bannerRadius", "F", "bannerHorizontalMargin", CA20Status.STATUS_USER_I, "bannerVerticalPadding", "Lxy40;", "bannerViewsCache", "Lxy40;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardBannersContainerView extends LinearLayout implements nwy0 {
    private final int bannerHorizontalMargin;
    private final float bannerRadius;
    private final int bannerVerticalPadding;
    private final xy40 bannerViewsCache;
    private final g dashboardPresenter;
    private final pav imageLoader;
    private final k7x0 tagUrlFormatter;

    public IntercityDashboardBannersContainerView(Context context, g gVar, pav pavVar, k7x0 k7x0Var) {
        super(context);
        this.dashboardPresenter = gVar;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.bannerRadius = tje.r(tug0.banner_radius, getContext());
        this.bannerHorizontalMargin = tje.r(tug0.banner_horizontal_margin, getContext());
        this.bannerVerticalPadding = tje.r(tug0.component_vertical_padding, getContext());
        this.bannerViewsCache = new xy40(4);
        setOrientation(1);
    }

    private final void applyBannerViewsCacheSize(int size) {
        int i = this.bannerViewsCache.b;
        if (i > size) {
            removeViews(size, i - size);
            xy40 xy40Var = this.bannerViewsCache;
            xy40Var.n(size, xy40Var.b);
        } else if (i < size) {
            int i2 = size - i;
            for (int i3 = 0; i3 < i2; i3++) {
                ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
                listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.bannerViewsCache.g(listItemComponent);
                addView(listItemComponent);
            }
        }
    }

    private final void bindPromoItemUiState(ListItemComponent view, int position, int itemsCount, final gaw state) {
        if (position == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = tje.r(tug0.component_small_margin, view.getContext());
                view.setLayoutParams(marginLayoutParams);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(this.bannerHorizontalMargin);
        marginLayoutParams2.setMarginEnd(this.bannerHorizontalMargin);
        view.setLayoutParams(marginLayoutParams2);
        ClickableImageView leadImageView = view.getLeadImageView();
        String str = state.c;
        String str2 = state.f;
        setIconIfTagChanged(leadImageView, str);
        view.setVerticalPadding(this.bannerVerticalPadding);
        view.setTitle(state.a);
        view.setSubtitle(state.b);
        view.setTrailCompanionText(state.d);
        view.setTrailCompanionTextColorAttr(xng0.textMain);
        view.setTrailCompanionTextTypeface(3);
        setupDivider(view, position, itemsCount);
        setupShape(view, position, itemsCount);
        setupBannerAction(view, state.e, str2);
        WeakHashMap weakHashMap = b.a;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardBannersContainerView$bindPromoItemUiState$lambda$0$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    IntercityDashboardBannersContainerView.this.dashboardPresenter.Ng(state.f);
                }
            });
        } else {
            this.dashboardPresenter.Ng(str2);
        }
    }

    private final ListItemComponent getBannerItemView(int position) {
        return (ListItemComponent) this.bannerViewsCache.b(position);
    }

    private final void reloadIconOnThemeChange(ImageView imageView) {
        Object tag = imageView.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str != null) {
            setIcon(imageView, str);
        }
    }

    private final void setIcon(ImageView imageView, String iconTag) {
        if (evu0.J(iconTag)) {
            imageView.setVisibility(8);
            imageView.setTag(null);
        } else {
            imageView.setVisibility(0);
            ((nac) this.imageLoader.a(imageView)).c(((m7x0) this.tagUrlFormatter).a(iconTag));
            imageView.setTag(iconTag);
        }
    }

    private final void setIconIfTagChanged(ImageView imageView, String iconTag) {
        Object tag = imageView.getTag();
        if (jl40.l(tag instanceof String ? (String) tag : null, iconTag)) {
            return;
        }
        setIcon(imageView, iconTag);
    }

    private final void setupBannerAction(ListItemComponent bannerView, faw action, String analyticsAdditionalInfo) {
        Drawable drawable;
        int i = 2;
        if (!(action instanceof aaw) && !(action instanceof baw) && !(action instanceof z9w) && !(action instanceof daw) && !(action instanceof eaw)) {
            if (!(action instanceof caw)) {
                w511.b();
                return;
            }
            i = 0;
        }
        bannerView.setTrailMode(i);
        if (jl40.l(action, caw.a)) {
            drawable = null;
        } else {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
            drawable = vng.t(typedValue.resourceId, getContext());
        }
        bannerView.setForeground(drawable);
        bannerView.setDebounceClickListener(new p7h(22, this, action, analyticsAdditionalInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBannerAction$lambda$0(IntercityDashboardBannersContainerView intercityDashboardBannersContainerView, faw fawVar, String str) {
        intercityDashboardBannersContainerView.dashboardPresenter.Mg(fawVar, str);
    }

    private final void setupDivider(ListItemComponent view, int currentBannerIndex, int totalBannersAmount) {
        if (currentBannerIndex + 1 < totalBannersAmount) {
            view.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
        }
    }

    private final void setupShape(ListItemComponent view, int currentBannerIndex, int totalBannersAmount) {
        float f;
        float f2;
        view.setClipToOutline(true);
        if (totalBannersAmount != 1) {
            if (currentBannerIndex == 0) {
                f = this.bannerRadius;
                f2 = 0.0f;
            } else if (currentBannerIndex + 1 == totalBannersAmount) {
                f2 = this.bannerRadius;
                f = 0.0f;
            } else {
                f = 0.0f;
            }
            view.setRoundedShape(qje.t(xng0.bgMain, getContext()), f, f, f2, f2);
        }
        f = this.bannerRadius;
        f2 = f;
        view.setRoundedShape(qje.t(xng0.bgMain, getContext()), f, f, f2, f2);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        xy40 xy40Var = this.bannerViewsCache;
        Object[] objArr = xy40Var.a;
        int i = xy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ListItemComponent listItemComponent = (ListItemComponent) objArr[i2];
            setupShape(listItemComponent, i2, this.bannerViewsCache.b);
            reloadIconOnThemeChange(listItemComponent.getLeadImageView());
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void renderBanners(mp60 banners) {
        applyBannerViewsCacheSize(banners.b);
        Object[] objArr = banners.a;
        int i = banners.b;
        for (int i2 = 0; i2 < i; i2++) {
            bindPromoItemUiState(getBannerItemView(i2), i2, banners.b, (gaw) objArr[i2]);
        }
    }
}
