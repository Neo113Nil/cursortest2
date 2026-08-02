package com.yandex.go.superapp.orders.card.header;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.superapp.orders.card.actions.TrackingCardButtonView;
import com.yandex.go.superapp.orders.card.header.leads.TrackingCardImageWithOverlayImageView;
import com.yandex.go.superapp.orders.card.header.trails.OrderCardIconStackView;
import com.yandex.go.superapp.orders.card.header.trails.OrderCardTimerView;
import com.yandex.go.superapp.orders.card.header.trails.TrackingCardObjectWithPlateNumberView;
import com.yandex.go.superapp.orders.card.header.trails.TrackingCardTextWithIconView;
import com.yandex.go.superapp.orders.card.timeline.TrackingCardCircleTimelineView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.an70;
import defpackage.ay4;
import defpackage.bdc;
import defpackage.bn70;
import defpackage.c8h0;
import defpackage.cdc;
import defpackage.cma1;
import defpackage.cn70;
import defpackage.dn70;
import defpackage.en70;
import defpackage.evu0;
import defpackage.f4h0;
import defpackage.fd60;
import defpackage.fn70;
import defpackage.g16;
import defpackage.gm70;
import defpackage.hic;
import defpackage.hm70;
import defpackage.hn70;
import defpackage.ijs;
import defpackage.in70;
import defpackage.jl40;
import defpackage.jm70;
import defpackage.jn70;
import defpackage.kdc;
import defpackage.lbm;
import defpackage.lm70;
import defpackage.ln70;
import defpackage.mkh0;
import defpackage.mm70;
import defpackage.nac;
import defpackage.nfv;
import defpackage.nm70;
import defpackage.ny61;
import defpackage.om70;
import defpackage.pav;
import defpackage.pfv;
import defpackage.pm70;
import defpackage.qm70;
import defpackage.rm70;
import defpackage.sfv;
import defpackage.sls;
import defpackage.sm70;
import defpackage.tfv;
import defpackage.tje;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.wn70;
import defpackage.zl50;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.carplates.ui.CarIndexComponent;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;
import ru.yandex.taxi.carplates.ui.services.ScootersCarIndexContainerView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SpannableTextStrategyInteractor;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SearchProgressBar;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJY\u0010\u0017\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ'\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010'J'\u0010.\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00162\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00162\b\b\u0001\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00162\b\b\u0001\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b;\u00107J\u0017\u0010<\u001a\u00020\u00162\b\b\u0001\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b<\u00107J)\u0010@\u001a\u00020\u00162\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00160=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160=¢\u0006\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0017\u0010F\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010SR\u0016\u0010T\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010WR\u0016\u0010[\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010UR\u0016\u0010^\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010UR\u0016\u0010_\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010U¨\u0006`"}, d2 = {"Lcom/yandex/go/superapp/orders/card/header/OrderCardHeaderView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Lkdc;", "color", "", "isColorForced", "Lru/yandex/taxi/design/SpannableTextStrategyInteractor$SpannableTextStrategy;", "spannableStrategy", "endIcon", "animateProgress", "progressAnimationColor", "progressAnimationDuration", "Lzy11;", "setHeaderTitle", "(Ljava/lang/CharSequence;Lkdc;Ljava/lang/Boolean;Lru/yandex/taxi/design/SpannableTextStrategyInteractor$SpannableTextStrategy;Ljava/lang/Integer;ZLjava/lang/Integer;I)V", "setHeaderTitleColor", "()V", "setHeaderSubtitleColor", "isVisible", "", "duration", "startTime", "setHeaderProgressBar", "(ZJJ)V", "setHeaderSubtitle", "(Ljava/lang/CharSequence;Lkdc;)V", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "isAnimationInProgress", "announceForAccessibility", "(Ljava/lang/CharSequence;Z)V", "Lwn70;", "style", "Lpav;", "imageLoader", "Lhic;", "colorizedCarIconFactory", "init", "(Lwn70;Lpav;Lhic;)V", "setStyle", "(Lwn70;)V", "Lhn70;", ClidProvider.STATE, "setState", "(Lhn70;)V", "updateProgressAnimationColor", "(I)V", "Lru/yandex/taxi/carplates/ui/CarIndexComponent;", "getCarIndexPlate", "()Lru/yandex/taxi/carplates/ui/CarIndexComponent;", "setCardStyleTitleColor", "setCardStyleSubtitleColor", "Lkotlin/Function0;", "headerListener", "trailListener", "setOnClickListeners", "(Lsls;Lsls;)V", "Lgm70;", "binding", "Lgm70;", "Lru/yandex/taxi/design/ListItemComponent;", "header", "Lru/yandex/taxi/design/ListItemComponent;", "getHeader", "()Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/widget/SearchProgressBar;", "progressBar", "Lru/yandex/taxi/widget/SearchProgressBar;", "Ljn70;", "leadDelegate", "Ljn70;", "Lln70;", "trailDelegate", "Lln70;", "Lpav;", "customProgressAnimationColor", CA20Status.STATUS_USER_I, "cardStyleTitleColor", "Lkdc;", "cardStateTitleColor", "cardStyleSubtitleColor", "cardStateSubtitleColor", "applyColorsFromUiState", "Z", "defaultHorizontalPaddingPx", "centerFrameHorizontalPaddingPx", "centerFrameVerticalPaddingPx", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderCardHeaderView extends GoFrameLayout {
    private boolean applyColorsFromUiState;
    private final gm70 binding;
    private kdc cardStateSubtitleColor;
    private kdc cardStateTitleColor;
    private kdc cardStyleSubtitleColor;
    private kdc cardStyleTitleColor;
    private int centerFrameHorizontalPaddingPx;
    private int centerFrameVerticalPaddingPx;
    private int customProgressAnimationColor;
    private int defaultHorizontalPaddingPx;
    private final ListItemComponent header;
    private pav imageLoader;
    private final jn70 leadDelegate;
    private final SearchProgressBar progressBar;
    private final ln70 trailDelegate;

    public OrderCardHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(mkh0.order_card_header, this);
        int i2 = c8h0.header;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, this);
        if (listItemComponent != null) {
            i2 = c8h0.progress_bar;
            SearchProgressBar searchProgressBar = (SearchProgressBar) cma1.O(i2, this);
            if (searchProgressBar != null) {
                this.binding = new gm70(this, listItemComponent, searchProgressBar);
                this.header = listItemComponent;
                this.progressBar = searchProgressBar;
                this.leadDelegate = new jn70(listItemComponent);
                this.trailDelegate = new ln70(listItemComponent);
                this.applyColorsFromUiState = true;
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void announceForAccessibility(CharSequence description, boolean isAnimationInProgress) {
        CharSequence contentDescription = this.binding.b.getContentDescription();
        CharSequence k0 = contentDescription != null ? evu0.k0(contentDescription) : null;
        if (jl40.l(k0, description) || k0 == null || evu0.J(k0)) {
            return;
        }
        Regex regex = new Regex("\\d?\\d:\\d{2}");
        if (jl40.l(evu0.k0(regex.j(k0, "")).toString(), evu0.k0(regex.j(description, "")).toString())) {
            return;
        }
        if (this.header.isAccessibilityFocused() || !isAnimationInProgress) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.setClassName("com.yandex.go.superapp.orders.card.header.OrderCardHeaderView");
                obtain.setPackageName(getContext().getPackageName());
                obtain.getText().add(description);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    private final void setHeaderProgressBar(boolean isVisible, long duration, long startTime) {
        this.progressBar.setVisibility(isVisible ? 0 : 8);
        SearchProgressBar searchProgressBar = this.progressBar;
        if (!isVisible) {
            searchProgressBar.stopAndHide();
            return;
        }
        searchProgressBar.setDuration(duration, startTime);
        if (this.progressBar.getStarted()) {
            return;
        }
        this.progressBar.start();
    }

    private final void setHeaderSubtitle(CharSequence text, kdc color) {
        this.header.setSubtitle(text);
        if (color == null || !this.applyColorsFromUiState) {
            color = null;
        }
        this.cardStateSubtitleColor = color;
        setHeaderSubtitleColor();
    }

    private final void setHeaderSubtitleColor() {
        kdc kdcVar = this.cardStateSubtitleColor;
        if (kdcVar == null && (kdcVar = this.cardStyleSubtitleColor) == null) {
            return;
        }
        this.header.setSubtitleTextColor(kdcVar);
    }

    private final void setHeaderTitle(CharSequence text, kdc color, Boolean isColorForced, SpannableTextStrategyInteractor.SpannableTextStrategy spannableStrategy, Integer endIcon, boolean animateProgress, Integer progressAnimationColor, int progressAnimationDuration) {
        this.header.setTitleSpannableTextStrategy(spannableStrategy);
        this.header.setTitle(text);
        if (!this.applyColorsFromUiState && !jl40.l(isColorForced, Boolean.TRUE)) {
            color = null;
        }
        this.cardStateTitleColor = color;
        setHeaderTitleColor();
        ListItemComponent listItemComponent = this.header;
        if (endIcon != null) {
            listItemComponent.setTitleWithNavigationIcon(true);
            this.header.setTitleEndDrawable(vng.t(endIcon.intValue(), getContext()));
        } else {
            listItemComponent.setTitleWithNavigationIcon(false);
        }
        ListItemComponent listItemComponent2 = this.header;
        if (!animateProgress) {
            listItemComponent2.stopTitleProgressAnimation();
            return;
        }
        if (!this.applyColorsFromUiState) {
            progressAnimationColor = Integer.valueOf(this.customProgressAnimationColor);
        }
        listItemComponent2.startTitleProgressAnimation(progressAnimationColor, progressAnimationDuration);
    }

    private final void setHeaderTitleColor() {
        kdc kdcVar = this.cardStateTitleColor;
        if (kdcVar == null && (kdcVar = this.cardStyleTitleColor) == null) {
            return;
        }
        this.header.setTitleTextColor(kdcVar);
    }

    public final CarIndexComponent getCarIndexPlate() {
        CarIndexContainerView carIndexContainerView = (CarIndexContainerView) this.trailDelegate.a.getTrailViewAs(CarIndexContainerView.class);
        if (carIndexContainerView == null) {
            return null;
        }
        return carIndexContainerView.getCarPlate();
    }

    public final ListItemComponent getHeader() {
        return this.header;
    }

    public final void init(wn70 style, pav imageLoader, hic colorizedCarIconFactory) {
        this.imageLoader = imageLoader;
        this.leadDelegate.b = imageLoader;
        ln70 ln70Var = this.trailDelegate;
        ln70Var.b = style;
        ln70Var.c = imageLoader;
        ln70Var.d = colorizedCarIconFactory;
        this.header.title().setIncludeFontPadding(false);
        this.header.subtitle().setIncludeFontPadding(false);
        this.header.setLeadFrameMinimumWidth(0);
    }

    public final void setCardStyleSubtitleColor(int color) {
        this.cardStyleSubtitleColor = new cdc(color);
        setHeaderSubtitleColor();
    }

    public final void setCardStyleTitleColor(int color) {
        this.cardStyleTitleColor = new cdc(color);
        setHeaderTitleColor();
    }

    public final void setOnClickListeners(sls headerListener, sls trailListener) {
        this.header.setDebounceClickListener(new ijs(19, headerListener));
        setForeground(vng.t(f4h0.bg_header_ripple, getContext()));
        this.header.setTrailContainerClickListener(new ijs(20, trailListener));
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0598  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setState(hn70 state) {
        boolean z;
        Object obj;
        int i;
        int i2;
        int i3;
        Object obj2;
        boolean z2;
        ln70 ln70Var;
        fn70 fn70Var;
        int i4;
        int i5;
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2;
        boolean z3;
        tfv sfvVar;
        boolean z4;
        setVisibility(state != null ? 0 : 8);
        if (state == null) {
            return;
        }
        String str = state.v;
        if (str != null) {
            announceForAccessibility(str, state.f);
            this.binding.b.setContentDescription(str);
        }
        setHeaderTitle(state.a, state.b, state.c, state.d, state.e, state.f, state.g, state.h);
        setHeaderSubtitle(state.i, state.b);
        this.header.setVerticalPadding(this.centerFrameVerticalPaddingPx);
        jn70 jn70Var = this.leadDelegate;
        nm70 nm70Var = state.k;
        int i6 = this.defaultHorizontalPaddingPx;
        int i7 = this.centerFrameHorizontalPaddingPx;
        ListItemComponent listItemComponent3 = jn70Var.a;
        int u = nm70Var != null ? tje.u(40, listItemComponent3.getContext()) : 0;
        boolean z5 = nm70Var instanceof lm70;
        nfv nfvVar = nfv.a;
        pfv pfvVar = pfv.a;
        if (z5) {
            if (jn70Var.d) {
                listItemComponent3.setPaddingRelative(i6, listItemComponent3.getPaddingTop(), listItemComponent3.getPaddingEnd(), listItemComponent3.getPaddingBottom());
                ListItemComponent.updateCenterFramePadding$default(listItemComponent3, i7, 0, 2, null);
                c.D(u, u, listItemComponent3.getLeadImageView());
            }
            pav pavVar = jn70Var.b;
            if (pavVar == null) {
                z = z5;
                obj = OrderCardIconStackView.class;
                i = i6;
                i2 = i7;
                i3 = 2;
                obj2 = null;
                if (z) {
                    z2 = false;
                } else {
                    listItemComponent3.setPaddingRelative(nm70Var != null ? i : 0, listItemComponent3.getPaddingTop(), listItemComponent3.getPaddingEnd(), listItemComponent3.getPaddingBottom());
                    z2 = false;
                    ListItemComponent.updateCenterFramePadding$default(listItemComponent3, nm70Var != null ? i2 : i, 0, i3, obj2);
                }
                jn70Var.d = z2;
                ln70Var = this.trailDelegate;
                fn70Var = state.l;
                float f = state.n;
                int i8 = state.o;
                int i9 = state.p;
                Float f2 = state.q;
                int v = f2 != null ? tje.v(getContext(), f2.floatValue()) : this.defaultHorizontalPaddingPx;
                int i10 = this.centerFrameHorizontalPaddingPx;
                ListItemComponent listItemComponent4 = ln70Var.a;
                if (!jl40.l(fn70Var, ln70Var.n)) {
                    ln70Var.n = fn70Var;
                    int v2 = tje.v(listItemComponent4.getContext(), f);
                    boolean z6 = fn70Var instanceof lm70;
                    if (z6) {
                        if (ln70Var.m) {
                            listItemComponent4.setPaddingRelative(listItemComponent4.getPaddingStart(), listItemComponent4.getPaddingTop(), v, listItemComponent4.getPaddingBottom());
                            ListItemComponent.updateCenterFramePadding$default(listItemComponent4, 0, i10, 1, obj2);
                            c.D(v2, v2, listItemComponent4.getTrailImageView());
                        }
                        pav pavVar2 = ln70Var.c;
                        if (pavVar2 != null) {
                            g16 b = pavVar2.b();
                            lm70 lm70Var = (lm70) fn70Var;
                            Integer num = lm70Var.b;
                            i5 = i10;
                            listItemComponent2 = listItemComponent4;
                            b.b(lm70Var.a).e(num == null ? pfvVar : num.intValue() * 2 >= v2 ? nfvVar : new sfv(0.0f, num.intValue(), 0)).h(new in70(listItemComponent4, v, i5, v2, 1));
                            listItemComponent2.setTrailVerticalGravity(i9);
                            listItemComponent2.setTrailImportantForAccessibility(i8);
                            if (z6) {
                                listItemComponent2.setPaddingRelative(listItemComponent2.getPaddingStart(), listItemComponent2.getPaddingTop(), fn70Var != null ? v : 0, listItemComponent2.getPaddingBottom());
                                if (fn70Var != null) {
                                    v = i5;
                                }
                                z3 = false;
                                ListItemComponent.updateCenterFramePadding$default(listItemComponent2, 0, v, 1, null);
                            } else {
                                z3 = false;
                            }
                            ln70Var.m = z3;
                        } else {
                            i4 = i10;
                            listItemComponent = listItemComponent4;
                            i5 = i4;
                            listItemComponent2 = listItemComponent;
                            listItemComponent2.setTrailVerticalGravity(i9);
                            listItemComponent2.setTrailImportantForAccessibility(i8);
                            if (z6) {
                            }
                            ln70Var.m = z3;
                        }
                    } else {
                        i4 = i10;
                        ListItemComponent listItemComponent5 = listItemComponent4;
                        if (fn70Var instanceof hm70) {
                            c.D(v2, v2, listItemComponent5.getTrailImageView());
                            listItemComponent5.setTrailImage(((hm70) fn70Var).a);
                            listItemComponent = listItemComponent5;
                        } else if (fn70Var instanceof bn70) {
                            View trailViewAs = listItemComponent5.getTrailViewAs(RobotoTextView.class);
                            View view = trailViewAs;
                            if (trailViewAs == null) {
                                final RobotoTextView robotoTextView = new RobotoTextView(listItemComponent5.getContext(), null, 0, 6, null);
                                robotoTextView.setTextTypeface(3);
                                robotoTextView.setTextSize(16.0f);
                                robotoTextView.setLineHeight(tje.u(17, robotoTextView.getContext()));
                                robotoTextView.setLetterSpacing(-0.005f);
                                robotoTextView.setTextColor(new bdc(ln70Var.l));
                                WeakHashMap weakHashMap = b.a;
                                if (robotoTextView.isAttachedToWindow()) {
                                    c.D(-2, -2, robotoTextView);
                                } else {
                                    robotoTextView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.superapp.orders.card.header.OrderCardHeaderViewTrailDelegate$getTrailText$lambda$0$0$$inlined$doOnAttach$1
                                        @Override // android.view.View.OnAttachStateChangeListener
                                        public void onViewAttachedToWindow(View view2) {
                                            robotoTextView.removeOnAttachStateChangeListener(this);
                                            c.D(-2, -2, robotoTextView);
                                        }

                                        @Override // android.view.View.OnAttachStateChangeListener
                                        public void onViewDetachedFromWindow(View view2) {
                                        }
                                    });
                                }
                                listItemComponent5.setTrailView(robotoTextView);
                                view = robotoTextView;
                            }
                            ((RobotoTextView) view).setText(((bn70) fn70Var).a);
                            listItemComponent = listItemComponent5;
                        } else {
                            int i11 = 20;
                            if (fn70Var instanceof jm70) {
                                View trailViewAs2 = listItemComponent5.getTrailViewAs(obj);
                                if (trailViewAs2 == null) {
                                    trailViewAs2 = new OrderCardIconStackView(listItemComponent5.getContext(), new OrderCardHeaderViewTrailDelegate$getIconStackTrail$1$1(ln70Var, ln70.class, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "getBackgroundColor()I", 0), ln70Var.c, OrderCardIconStackView.Order.Descending, new fd60(i11), new fd60(21), new fd60(22));
                                    listItemComponent5.setTrailView(trailViewAs2);
                                }
                                ((OrderCardIconStackView) trailViewAs2).render(((jm70) fn70Var).a);
                                listItemComponent = listItemComponent5;
                            } else {
                                if (fn70Var instanceof sm70) {
                                    final sm70 sm70Var = (sm70) fn70Var;
                                    ay4 ay4Var = sm70Var.f;
                                    String str2 = sm70Var.c;
                                    CarIndexContainerView carIndexContainerView = (CarIndexContainerView) listItemComponent5.getTrailViewAs(CarIndexContainerView.class);
                                    if (carIndexContainerView == null || carIndexContainerView.getLayoutRes() != ay4Var.b) {
                                        if (jl40.l(ay4Var, rm70.c) || jl40.l(ay4Var, pm70.c)) {
                                            carIndexContainerView = new CarIndexContainerView(listItemComponent5.getContext(), ay4Var.b);
                                        } else {
                                            if (!jl40.l(ay4Var, qm70.c)) {
                                                w511.b();
                                                return;
                                            }
                                            carIndexContainerView = new ScootersCarIndexContainerView(listItemComponent5.getContext());
                                        }
                                        c.D(carIndexContainerView.getLayoutParams().width, ln70Var.i, carIndexContainerView);
                                        carIndexContainerView.setTranslationY(Math.min((ln70Var.i - ln70Var.h) / 2.0f, 0.0f));
                                        listItemComponent5.setTrailView(carIndexContainerView);
                                    }
                                    final int i12 = 0;
                                    ((ViewGroup.MarginLayoutParams) carIndexContainerView.getLayoutParams()).setMargins(0, 0, 0, 0);
                                    if (jl40.l(ay4Var, qm70.c) && (carIndexContainerView instanceof ScootersCarIndexContainerView)) {
                                        pav pavVar3 = ln70Var.c;
                                        i5 = i4;
                                        listItemComponent2 = listItemComponent5;
                                        if (pavVar3 != null) {
                                            lbm f3 = pavVar3.f(new wls() { // from class: kn70
                                                @Override // defpackage.wls
                                                public final Object invoke(Object obj3, Object obj4) {
                                                    int i13 = i12;
                                                    zy11 zy11Var = zy11.a;
                                                    sm70 sm70Var2 = sm70Var;
                                                    switch (i13) {
                                                        case 0:
                                                            ((ScootersCarIndexContainerView) obj3).bindScootersData(sm70Var2.a, (Drawable) obj4);
                                                            break;
                                                        default:
                                                            ((CarIndexContainerView) obj3).bind(sm70Var2.a, (Drawable) obj4);
                                                            break;
                                                    }
                                                    return zy11Var;
                                                }
                                            }, carIndexContainerView);
                                            listItemComponent2 = listItemComponent5;
                                            if (f3 != null) {
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                ((nac) f3).c(str2);
                                                listItemComponent2 = listItemComponent5;
                                            }
                                        }
                                    } else {
                                        i5 = i4;
                                        if (sm70Var.b != null) {
                                            carIndexContainerView.bind(sm70Var.a, new zl50(13, ln70Var, sm70Var));
                                        } else {
                                            pav pavVar4 = ln70Var.c;
                                            if (pavVar4 != null) {
                                                final int i13 = 1;
                                                lbm f4 = pavVar4.f(new wls() { // from class: kn70
                                                    @Override // defpackage.wls
                                                    public final Object invoke(Object obj3, Object obj4) {
                                                        int i132 = i13;
                                                        zy11 zy11Var = zy11.a;
                                                        sm70 sm70Var2 = sm70Var;
                                                        switch (i132) {
                                                            case 0:
                                                                ((ScootersCarIndexContainerView) obj3).bindScootersData(sm70Var2.a, (Drawable) obj4);
                                                                break;
                                                            default:
                                                                ((CarIndexContainerView) obj3).bind(sm70Var2.a, (Drawable) obj4);
                                                                break;
                                                        }
                                                        return zy11Var;
                                                    }
                                                }, carIndexContainerView);
                                                if (f4 != null) {
                                                    Integer num2 = sm70Var.d;
                                                    if (num2 != null) {
                                                        ((nac) f4).e(num2.intValue());
                                                    }
                                                    if (str2 == null) {
                                                        str2 = "";
                                                    }
                                                    ((nac) f4).c(str2);
                                                }
                                            }
                                        }
                                        b.p(carIndexContainerView, sm70Var.e);
                                        listItemComponent2 = listItemComponent5;
                                    }
                                } else {
                                    i5 = i4;
                                    if (fn70Var instanceof en70) {
                                        View trailViewAs3 = listItemComponent5.getTrailViewAs(OrderCardTimerView.class);
                                        if (trailViewAs3 == null) {
                                            trailViewAs3 = new OrderCardTimerView(listItemComponent5.getContext(), null, 0, 6, null);
                                            listItemComponent5.setTrailView(trailViewAs3);
                                        }
                                        ((OrderCardTimerView) trailViewAs3).setStartTime(((en70) fn70Var).a);
                                        listItemComponent2 = listItemComponent5;
                                    } else if (fn70Var instanceof an70) {
                                        View trailViewAs4 = listItemComponent5.getTrailViewAs(TrackingCardObjectWithPlateNumberView.class);
                                        if (trailViewAs4 == null) {
                                            trailViewAs4 = new TrackingCardObjectWithPlateNumberView(ln70Var.c, ln70Var.d, listItemComponent5.getContext(), null, 0, 24, null);
                                            listItemComponent5.setTrailView(trailViewAs4);
                                        }
                                        ((TrackingCardObjectWithPlateNumberView) trailViewAs4).render((an70) fn70Var);
                                        listItemComponent2 = listItemComponent5;
                                    } else if (fn70Var instanceof dn70) {
                                        View trailViewAs5 = listItemComponent5.getTrailViewAs(TrackingCardCircleTimelineView.class);
                                        View view2 = trailViewAs5;
                                        if (trailViewAs5 == null) {
                                            TrackingCardCircleTimelineView trackingCardCircleTimelineView = new TrackingCardCircleTimelineView(listItemComponent5.getContext(), null, 0, 6, null);
                                            pav pavVar5 = ln70Var.c;
                                            if (pavVar5 != null) {
                                                trackingCardCircleTimelineView.init(ln70Var.b, pavVar5);
                                            }
                                            listItemComponent5.setTrailView(trackingCardCircleTimelineView);
                                            view2 = trackingCardCircleTimelineView;
                                        }
                                        ((TrackingCardCircleTimelineView) view2).render(((dn70) fn70Var).a);
                                        listItemComponent2 = listItemComponent5;
                                    } else if (fn70Var instanceof cn70) {
                                        View trailViewAs6 = listItemComponent5.getTrailViewAs(TrackingCardTextWithIconView.class);
                                        if (trailViewAs6 == null) {
                                            trailViewAs6 = new TrackingCardTextWithIconView(ln70Var.c, ln70Var.j, ln70Var.k, listItemComponent5.getContext(), null, 0, 48, null);
                                            listItemComponent5.setTrailView(trailViewAs6);
                                        }
                                        ((TrackingCardTextWithIconView) trailViewAs6).render((cn70) fn70Var);
                                        listItemComponent2 = listItemComponent5;
                                    } else if (fn70Var instanceof om70) {
                                        View trailViewAs7 = listItemComponent5.getTrailViewAs(TrackingCardButtonView.class);
                                        View view3 = trailViewAs7;
                                        if (trailViewAs7 == null) {
                                            final TrackingCardButtonView trackingCardButtonView = new TrackingCardButtonView(listItemComponent5.getContext(), null, 0, 6, null);
                                            pav pavVar6 = ln70Var.c;
                                            if (pavVar6 != null) {
                                                trackingCardButtonView.init(ln70Var.b, pavVar6);
                                            }
                                            trackingCardButtonView.setRoundedBackground(ln70Var.f, tje.w(20, trackingCardButtonView.getContext()));
                                            trackingCardButtonView.setTitleTextColor(ln70Var.g);
                                            trackingCardButtonView.setTitleTypeface(3);
                                            trackingCardButtonView.setSubtitleTextColor(ln70Var.g);
                                            int u2 = tje.u(14, trackingCardButtonView.getContext());
                                            trackingCardButtonView.leadFrame.setMinimumWidth(u2);
                                            trackingCardButtonView.trailFrame.setMinimumWidth(u2);
                                            WeakHashMap weakHashMap2 = b.a;
                                            if (trackingCardButtonView.isAttachedToWindow()) {
                                                c.D(-2, tje.u(40, trackingCardButtonView.getContext()), trackingCardButtonView);
                                            } else {
                                                trackingCardButtonView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.superapp.orders.card.header.OrderCardHeaderViewTrailDelegate$getButtonView$lambda$0$0$$inlined$doOnAttach$1
                                                    @Override // android.view.View.OnAttachStateChangeListener
                                                    public void onViewAttachedToWindow(View view4) {
                                                        trackingCardButtonView.removeOnAttachStateChangeListener(this);
                                                        TrackingCardButtonView trackingCardButtonView2 = trackingCardButtonView;
                                                        c.D(-2, c.h(40, trackingCardButtonView2), trackingCardButtonView2);
                                                    }

                                                    @Override // android.view.View.OnAttachStateChangeListener
                                                    public void onViewDetachedFromWindow(View view4) {
                                                    }
                                                });
                                            }
                                            listItemComponent5.setTrailView(trackingCardButtonView);
                                            view3 = trackingCardButtonView;
                                        }
                                        ((TrackingCardButtonView) view3).render(((om70) fn70Var).a);
                                        listItemComponent2 = listItemComponent5;
                                    } else if (fn70Var != null) {
                                        w511.b();
                                        return;
                                    } else {
                                        listItemComponent5.setTrailView(null);
                                        listItemComponent2 = listItemComponent5;
                                    }
                                }
                                listItemComponent2.setTrailVerticalGravity(i9);
                                listItemComponent2.setTrailImportantForAccessibility(i8);
                                if (z6) {
                                }
                                ln70Var.m = z3;
                            }
                        }
                        i5 = i4;
                        listItemComponent2 = listItemComponent;
                        listItemComponent2.setTrailVerticalGravity(i9);
                        listItemComponent2.setTrailImportantForAccessibility(i8);
                        if (z6) {
                        }
                        ln70Var.m = z3;
                    }
                }
                this.header.trailFrame.setClickable(state.m);
                setHeaderProgressBar(state.r, state.s, state.t);
            }
            g16 b2 = pavVar.b();
            lm70 lm70Var2 = (lm70) nm70Var;
            Integer num3 = lm70Var2.b;
            g16 b3 = b2.b(lm70Var2.a);
            if (num3 == null) {
                sfvVar = pfvVar;
            } else if (num3.intValue() * 2 >= 40) {
                sfvVar = nfvVar;
            } else {
                float intValue = num3.intValue();
                z4 = false;
                sfvVar = new sfv(0.0f, intValue, 0);
                b3.e(sfvVar).h(new in70(listItemComponent3, i6, i7, u, 0));
            }
            z4 = false;
            b3.e(sfvVar).h(new in70(listItemComponent3, i6, i7, u, 0));
        } else {
            if (!(nm70Var instanceof hm70)) {
                if (nm70Var instanceof mm70) {
                    View leadViewAs = listItemComponent3.getLeadViewAs(TrackingCardImageWithOverlayImageView.class);
                    if (leadViewAs == null) {
                        z = z5;
                        i = i6;
                        obj = OrderCardIconStackView.class;
                        i3 = 2;
                        i2 = i7;
                        obj2 = null;
                        leadViewAs = new TrackingCardImageWithOverlayImageView(listItemComponent3.getContext(), jn70Var.b, new OrderCardHeaderViewLeadDelegate$getImageWithOverlayImageView$1$1(jn70Var, jn70.class, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "getBackgroundColor()I", 0));
                        listItemComponent3.setLeadView(leadViewAs);
                    } else {
                        z = z5;
                        obj = OrderCardIconStackView.class;
                        i = i6;
                        i2 = i7;
                        i3 = 2;
                        obj2 = null;
                    }
                    ((TrackingCardImageWithOverlayImageView) leadViewAs).render((mm70) nm70Var);
                } else {
                    z = z5;
                    obj = OrderCardIconStackView.class;
                    i = i6;
                    i2 = i7;
                    i3 = 2;
                    obj2 = null;
                    if (nm70Var instanceof jm70) {
                        View leadViewAs2 = listItemComponent3.getLeadViewAs(obj);
                        if (leadViewAs2 == null) {
                            leadViewAs2 = new OrderCardIconStackView(listItemComponent3.getContext(), new OrderCardHeaderViewLeadDelegate$getIconStackLead$1$1(jn70Var, jn70.class, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "getBackgroundColor()I", 0), jn70Var.b, OrderCardIconStackView.Order.Ascending, OrderCardHeaderViewLeadDelegate$getIconStackLead$1$2.b, OrderCardHeaderViewLeadDelegate$getIconStackLead$1$3.b, OrderCardHeaderViewLeadDelegate$getIconStackLead$1$4.b);
                            listItemComponent3.setLeadView(leadViewAs2);
                        }
                        ((OrderCardIconStackView) leadViewAs2).render(((jm70) nm70Var).a);
                    } else {
                        if (nm70Var != null) {
                            w511.b();
                            return;
                        }
                        listItemComponent3.clearLeadView();
                    }
                }
                if (z) {
                }
                jn70Var.d = z2;
                ln70Var = this.trailDelegate;
                fn70Var = state.l;
                float f5 = state.n;
                int i82 = state.o;
                int i92 = state.p;
                Float f22 = state.q;
                if (f22 != null) {
                }
                int i102 = this.centerFrameHorizontalPaddingPx;
                ListItemComponent listItemComponent42 = ln70Var.a;
                if (!jl40.l(fn70Var, ln70Var.n)) {
                }
                this.header.trailFrame.setClickable(state.m);
                setHeaderProgressBar(state.r, state.s, state.t);
            }
            c.D(u, u, listItemComponent3.getLeadImageView());
            listItemComponent3.setLeadImage(((hm70) nm70Var).a);
        }
        z = z5;
        obj = OrderCardIconStackView.class;
        i = i6;
        i2 = i7;
        i3 = 2;
        obj2 = null;
        if (z) {
        }
        jn70Var.d = z2;
        ln70Var = this.trailDelegate;
        fn70Var = state.l;
        float f52 = state.n;
        int i822 = state.o;
        int i922 = state.p;
        Float f222 = state.q;
        if (f222 != null) {
        }
        int i1022 = this.centerFrameHorizontalPaddingPx;
        ListItemComponent listItemComponent422 = ln70Var.a;
        if (!jl40.l(fn70Var, ln70Var.n)) {
        }
        this.header.trailFrame.setClickable(state.m);
        setHeaderProgressBar(state.r, state.s, state.t);
    }

    public final void setStyle(wn70 style) {
        this.applyColorsFromUiState = !style.g();
        this.header.setMinHeight(tje.u(style.t(), getContext()));
        this.header.setTitleTextSizePx((int) tje.b0(getContext(), style.c()));
        TextView title = this.header.title();
        title.setLineHeight((int) c.F(style.r(), title));
        title.setLetterSpacing(style.z());
        title.setMaxLines(style.u());
        this.header.setSubtitleTextSizePx((int) tje.b0(getContext(), style.f()));
        TextView subtitle = this.header.subtitle();
        RobotoTextView robotoTextView = subtitle instanceof RobotoTextView ? (RobotoTextView) subtitle : null;
        if (robotoTextView != null) {
            robotoTextView.setTextTypeface(0);
        }
        subtitle.setLineHeight((int) c.F(style.e(), subtitle));
        subtitle.setLetterSpacing(0.0f);
        subtitle.setMaxLines(style.l());
        Integer D = style.D(getContext());
        if (D != null) {
            setCardStyleTitleColor(D.intValue());
        }
        Integer E = style.E(getContext());
        if (E != null) {
            setCardStyleSubtitleColor(E.intValue());
        }
        jn70 jn70Var = this.leadDelegate;
        jn70Var.c = style.n(jn70Var.a.getContext());
        ln70 ln70Var = this.trailDelegate;
        ListItemComponent listItemComponent = ln70Var.a;
        ln70Var.e = style.n(listItemComponent.getContext());
        ln70Var.f = style.C(listItemComponent.getContext());
        ln70Var.g = style.h(listItemComponent.getContext());
        ln70Var.i = tje.u(style.p(), listItemComponent.getContext());
        ln70Var.j = style.q();
        ln70Var.k = style.d();
        ln70Var.l = style.m();
        this.defaultHorizontalPaddingPx = tje.v(getContext(), style.o());
        this.centerFrameHorizontalPaddingPx = tje.v(getContext(), style.a());
        this.centerFrameVerticalPaddingPx = tje.v(getContext(), style.k());
    }

    public final void updateProgressAnimationColor(int color) {
        this.customProgressAnimationColor = color;
        this.header.updateTitleShimmeringColor(Integer.valueOf(color));
    }

    public OrderCardHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrderCardHeaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OrderCardHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
