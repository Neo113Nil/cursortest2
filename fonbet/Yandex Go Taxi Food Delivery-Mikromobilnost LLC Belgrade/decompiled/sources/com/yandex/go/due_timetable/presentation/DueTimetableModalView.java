package com.yandex.go.due_timetable.presentation;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.due.api.analytics.model.DueAnalyticOrigin;
import com.yandex.go.due.api.analytics.model.DueAnalyticViewType;
import com.yandex.go.due_timetable.presentation.state.ButtonType;
import com.yandex.go.due_timetable.presentation.widget.ShimmeringDueTimetableView;
import com.yandex.go.due_timetable.presentation.widget.day_selector.DaySelectorView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a1n;
import defpackage.azm;
import defpackage.b0n;
import defpackage.b1n;
import defpackage.cma1;
import defpackage.czm;
import defpackage.d2h0;
import defpackage.dvm;
import defpackage.e0n;
import defpackage.e1n;
import defpackage.eth0;
import defpackage.f1h0;
import defpackage.f1n;
import defpackage.g1n;
import defpackage.gih0;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.k7x0;
import defpackage.loj;
import defpackage.lzm;
import defpackage.n5;
import defpackage.nsg;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qje;
import defpackage.qzm;
import defpackage.s0n;
import defpackage.sym;
import defpackage.t0n;
import defpackage.tje;
import defpackage.u0n;
import defpackage.uyj;
import defpackage.v0n;
import defpackage.v8e;
import defpackage.w0n;
import defpackage.w511;
import defpackage.wqj;
import defpackage.x0n;
import defpackage.xng0;
import defpackage.xy40;
import defpackage.xzm;
import defpackage.y0n;
import defpackage.yzm;
import defpackage.z0n;
import defpackage.zy11;
import defpackage.zzm;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SingleShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.due_timetable.DueTimetableView;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\tJ(+.147:KB5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u00060:R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/yandex/go/due_timetable/presentation/DueTimetableModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lb1n;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lcom/yandex/go/due_timetable/presentation/g;", "presenter", "Lsym;", "slotWidthExperimentModifier", "<init>", "(Landroid/content/Context;Lpav;Lk7x0;Lcom/yandex/go/due_timetable/presentation/g;Lsym;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lb1n;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "applyContentContainerTheme", "applyLoadingContainerTheme", "applyErrorContainerTheme", "applyFooterContainerTheme", "Lpav;", "Lk7x0;", "Lcom/yandex/go/due_timetable/presentation/g;", "Lsym;", "Lu0n;", "contentViewController", "Lu0n;", "Lx0n;", "priceViewController", "Lx0n;", "Lv0n;", "departureViewController", "Lv0n;", "Ls0n;", "arrivalViewController", "Ls0n;", "La1n;", "unavailableViewController", "La1n;", "Lz0n;", "promoViewController", "Lz0n;", "Ly0n;", "promoAndTimeDividerController", "Ly0n;", "", "selectableItemBackgroundResourceId$delegate", "Li3y;", "getSelectableItemBackgroundResourceId", "()I", "selectableItemBackgroundResourceId", "newDaySlotSelected", "Z", "Lxy40;", "Lru/yandex/taxi/design/ListItemComponent;", "promoViewsCache", "Lxy40;", "Companion", "w0n", "t0n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DueTimetableModalView extends SlideableBindingModalView<b1n> {
    private static final t0n Companion = new t0n();
    private static final float DISABLE_ALPHA = 0.5f;
    private static final float ENABLE_ALPHA = 1.0f;
    private final s0n arrivalViewController;
    private final u0n contentViewController;
    private final v0n departureViewController;
    private final pav imageLoader;
    private boolean newDaySlotSelected;
    private final g presenter;
    private final x0n priceViewController;
    private final y0n promoAndTimeDividerController;
    private final z0n promoViewController;
    private final xy40 promoViewsCache;

    /* renamed from: selectableItemBackgroundResourceId$delegate, reason: from kotlin metadata */
    private final i3y selectableItemBackgroundResourceId;
    private final sym slotWidthExperimentModifier;
    private final k7x0 tagUrlFormatter;
    private final a1n unavailableViewController;

    public DueTimetableModalView(Context context, pav pavVar, k7x0 k7x0Var, g gVar, sym symVar) {
        super(context);
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.presenter = gVar;
        this.slotWidthExperimentModifier = symVar;
        this.contentViewController = new u0n(getBinding().b.a, (LinearLayout) getBinding().g.c, getBinding().d.b, getBinding().c.b);
        this.priceViewController = new x0n(getBinding().b.h, getBinding().b.g);
        this.departureViewController = new v0n(context, getBinding().e.f, getBinding().e.g, getBinding().e.p, getBinding().e.i, getBinding().e.h);
        this.arrivalViewController = new s0n(getBinding().e.b, getBinding().e.c, getBinding().e.o, getBinding().e.e, getBinding().e.d);
        this.unavailableViewController = new a1n(getBinding().e.q, getBinding().e.s);
        this.promoViewController = new z0n(getBinding().e.n);
        this.promoAndTimeDividerController = new y0n(this, getBinding().e.l, getBinding().e.m);
        this.selectableItemBackgroundResourceId = kotlin.a.b(LazyThreadSafetyMode.NONE, new n5(context, 19));
        this.newDaySlotSelected = true;
        this.promoViewsCache = new xy40((Object) null);
        getBinding().e.j.setClipToOutline(true);
        getBinding().b.b.setOnItemClickListener(new loj(7, this));
        getBinding().b.e.setOnItemClickListener(new v8e(27, this));
        getBinding().b.e.setSlotWidthModifier(symVar);
        getBinding().e.k.setDebounceClickListener(new wqj(15, getBinding().e.k, this));
        getBottomSheetBehavior().e0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(DueTimetableModalView dueTimetableModalView, int i, nsg nsgVar) {
        dueTimetableModalView.newDaySlotSelected = true;
        dueTimetableModalView.presenter.Lg(new yzm(i));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DueTimetableModalView dueTimetableModalView, int i, lzm lzmVar) {
        dueTimetableModalView.presenter.Lg(new b0n(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ButtonComponent buttonComponent, DueTimetableModalView dueTimetableModalView) {
        Object tag = buttonComponent.getTag();
        ButtonType buttonType = tag instanceof ButtonType ? (ButtonType) tag : null;
        if (buttonType == ButtonType.CONFIRM) {
            dueTimetableModalView.presenter.Lg(xzm.a);
        } else if (buttonType == ButtonType.RETRY) {
            dueTimetableModalView.presenter.Lg(zzm.a);
        }
    }

    private final void applyContentContainerTheme(ThemeType themeType) {
        azm azmVar = getBinding().b;
        azmVar.c.setBackground(tje.y(f1h0.round_section_bg_bottom, getContext()));
        azmVar.d.setBackgroundColor(qje.t(xng0.cardDivider, getContext()));
        azmVar.f.setBackground(tje.y(f1h0.round_section_bg_top, getContext()));
        azmVar.h.applyTheme(themeType);
        azmVar.g.applyTheme(themeType);
    }

    private final void applyErrorContainerTheme(ThemeType themeType) {
        czm czmVar = getBinding().d;
        czmVar.b.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        czmVar.c.applyTheme(themeType);
    }

    private final void applyFooterContainerTheme(ThemeType themeType) {
        e0n e0nVar = getBinding().e;
        e0nVar.a.setBackground(tje.y(d2h0.bg_due_timetable_modal_footer, getContext()));
        e0nVar.i.applyTheme(themeType);
        e0nVar.h.applyTheme(themeType);
        e0nVar.e.applyTheme(themeType);
        e0nVar.d.applyTheme(themeType);
        e0nVar.k.applyTheme(themeType);
        e0nVar.p.applyTheme(themeType);
        e0nVar.o.applyTheme(themeType);
        e0nVar.r.setImageDrawable(tje.y(d2h0.ic_due_timetable_info, getContext()));
    }

    private final void applyLoadingContainerTheme(ThemeType themeType) {
        qzm qzmVar = getBinding().g;
        ((FrameLayout) qzmVar.e).setBackground(tje.y(f1h0.round_section_bg_bottom, getContext()));
        qzmVar.f.setBackgroundColor(qje.t(xng0.cardDivider, getContext()));
        ((LinearLayout) qzmVar.d).setBackground(tje.y(f1h0.round_section_bg_top, getContext()));
        ((ShimmeringBar) qzmVar.b).applyTheme(themeType);
        ((ShimmeringBar) qzmVar.g).applyTheme(themeType);
        ((ShimmeringDueTimetableView) qzmVar.h).applyTheme(themeType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSelectableItemBackgroundResourceId() {
        return ((Number) this.selectableItemBackgroundResourceId.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int selectableItemBackgroundResourceId_delegate$lambda$0(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        getBinding().a.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        applyContentContainerTheme(themeType);
        applyLoadingContainerTheme(themeType);
        applyErrorContainerTheme(themeType);
        applyFooterContainerTheme(themeType);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public b1n bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View O2;
        View O3;
        View O4;
        int i = 0;
        View inflate = inflater.inflate(eth0.due_timetable_modal_view, parent, false);
        int i2 = gih0.center_container;
        if (((FrameLayout) cma1.O(i2, inflate)) != null && (O = cma1.O((i2 = gih0.content_container), inflate)) != null) {
            int i3 = gih0.day_selector;
            DaySelectorView daySelectorView = (DaySelectorView) cma1.O(i3, O);
            if (daySelectorView != null) {
                i3 = gih0.day_selector_card;
                FrameLayout frameLayout = (FrameLayout) cma1.O(i3, O);
                if (frameLayout != null && (O2 = cma1.O((i3 = gih0.divider), O)) != null) {
                    i3 = gih0.due_timetable;
                    DueTimetableView dueTimetableView = (DueTimetableView) cma1.O(i3, O);
                    if (dueTimetableView != null) {
                        i3 = gih0.due_timetable_card;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i3, O);
                        if (linearLayout != null) {
                            i3 = gih0.price_content;
                            if (((LinearLayout) cma1.O(i3, O)) != null) {
                                i3 = gih0.price_label;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, O);
                                if (robotoTextView != null) {
                                    i3 = gih0.price_value;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, O);
                                    if (robotoTextView2 != null) {
                                        azm azmVar = new azm((LinearLayout) O, daySelectorView, frameLayout, O2, dueTimetableView, linearLayout, robotoTextView, robotoTextView2);
                                        i2 = gih0.empty_container;
                                        View O5 = cma1.O(i2, inflate);
                                        if (O5 != null) {
                                            int i4 = gih0.empty_message;
                                            RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i4, O5);
                                            if (robotoTextView3 == null) {
                                                ny61.t("Missing required view with ID: ".concat(O5.getResources().getResourceName(i4)));
                                                return null;
                                            }
                                            czm czmVar = new czm((FrameLayout) O5, robotoTextView3, i);
                                            int i5 = gih0.error_container;
                                            View O6 = cma1.O(i5, inflate);
                                            if (O6 != null) {
                                                int i6 = gih0.error_message;
                                                RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i6, O6);
                                                if (robotoTextView4 == null) {
                                                    ny61.t("Missing required view with ID: ".concat(O6.getResources().getResourceName(i6)));
                                                    return null;
                                                }
                                                czm czmVar2 = new czm((FrameLayout) O6, robotoTextView4, 1);
                                                int i7 = gih0.footer_container;
                                                View O7 = cma1.O(i7, inflate);
                                                if (O7 != null) {
                                                    int i8 = gih0.arrival_container;
                                                    FrameLayout frameLayout2 = (FrameLayout) cma1.O(i8, O7);
                                                    if (frameLayout2 != null) {
                                                        i8 = gih0.arrival_content;
                                                        LinearLayout linearLayout2 = (LinearLayout) cma1.O(i8, O7);
                                                        if (linearLayout2 != null) {
                                                            i8 = gih0.arrival_label;
                                                            RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i8, O7);
                                                            if (robotoTextView5 != null) {
                                                                i8 = gih0.arrival_time;
                                                                RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i8, O7);
                                                                if (robotoTextView6 != null) {
                                                                    i8 = gih0.departure_container;
                                                                    FrameLayout frameLayout3 = (FrameLayout) cma1.O(i8, O7);
                                                                    if (frameLayout3 != null) {
                                                                        i8 = gih0.departure_content;
                                                                        LinearLayout linearLayout3 = (LinearLayout) cma1.O(i8, O7);
                                                                        if (linearLayout3 != null) {
                                                                            i8 = gih0.departure_label;
                                                                            RobotoTextView robotoTextView7 = (RobotoTextView) cma1.O(i8, O7);
                                                                            if (robotoTextView7 != null) {
                                                                                i8 = gih0.departure_time;
                                                                                RobotoTextView robotoTextView8 = (RobotoTextView) cma1.O(i8, O7);
                                                                                if (robotoTextView8 != null) {
                                                                                    LinearLayout linearLayout4 = (LinearLayout) O7;
                                                                                    i8 = gih0.footer_button;
                                                                                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i8, O7);
                                                                                    if (buttonComponent != null) {
                                                                                        i8 = gih0.footer_containers_holder;
                                                                                        LinearLayout linearLayout5 = (LinearLayout) cma1.O(i8, O7);
                                                                                        if (linearLayout5 != null) {
                                                                                            i8 = gih0.footer_time_container;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i8, O7);
                                                                                            if (constraintLayout != null) {
                                                                                                i8 = gih0.promo_items_holder;
                                                                                                LinearLayout linearLayout6 = (LinearLayout) cma1.O(i8, O7);
                                                                                                if (linearLayout6 != null) {
                                                                                                    i8 = gih0.shimmering_arrival_content;
                                                                                                    SingleShimmeringBar singleShimmeringBar = (SingleShimmeringBar) cma1.O(i8, O7);
                                                                                                    if (singleShimmeringBar != null) {
                                                                                                        i8 = gih0.shimmering_departure_content;
                                                                                                        SingleShimmeringBar singleShimmeringBar2 = (SingleShimmeringBar) cma1.O(i8, O7);
                                                                                                        if (singleShimmeringBar2 != null) {
                                                                                                            i8 = gih0.unavailable_container;
                                                                                                            FrameLayout frameLayout4 = (FrameLayout) cma1.O(i8, O7);
                                                                                                            if (frameLayout4 != null) {
                                                                                                                i8 = gih0.unavailable_icon;
                                                                                                                ImageView imageView = (ImageView) cma1.O(i8, O7);
                                                                                                                if (imageView != null) {
                                                                                                                    i8 = gih0.unavailable_label;
                                                                                                                    RobotoTextView robotoTextView9 = (RobotoTextView) cma1.O(i8, O7);
                                                                                                                    if (robotoTextView9 != null) {
                                                                                                                        e0n e0nVar = new e0n(linearLayout4, frameLayout2, linearLayout2, robotoTextView5, robotoTextView6, frameLayout3, linearLayout3, robotoTextView7, robotoTextView8, linearLayout4, buttonComponent, linearLayout5, constraintLayout, linearLayout6, singleShimmeringBar, singleShimmeringBar2, frameLayout4, imageView, robotoTextView9);
                                                                                                                        i7 = gih0.footer_shadow;
                                                                                                                        ImageView imageView2 = (ImageView) cma1.O(i7, inflate);
                                                                                                                        if (imageView2 != null && (O3 = cma1.O((i7 = gih0.loading_container), inflate)) != null) {
                                                                                                                            int i9 = gih0.day_selector_card;
                                                                                                                            FrameLayout frameLayout5 = (FrameLayout) cma1.O(i9, O3);
                                                                                                                            if (frameLayout5 != null && (O4 = cma1.O((i9 = gih0.divider), O3)) != null) {
                                                                                                                                i9 = gih0.due_timetable_card;
                                                                                                                                LinearLayout linearLayout7 = (LinearLayout) cma1.O(i9, O3);
                                                                                                                                if (linearLayout7 != null) {
                                                                                                                                    i9 = gih0.shimmering_day_selector;
                                                                                                                                    ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i9, O3);
                                                                                                                                    if (shimmeringBar != null) {
                                                                                                                                        i9 = gih0.shimmering_due_timetable;
                                                                                                                                        ShimmeringDueTimetableView shimmeringDueTimetableView = (ShimmeringDueTimetableView) cma1.O(i9, O3);
                                                                                                                                        if (shimmeringDueTimetableView != null) {
                                                                                                                                            i9 = gih0.shimmering_price;
                                                                                                                                            ShimmeringBar shimmeringBar2 = (ShimmeringBar) cma1.O(i9, O3);
                                                                                                                                            if (shimmeringBar2 != null) {
                                                                                                                                                qzm qzmVar = new qzm((LinearLayout) O3, frameLayout5, O4, linearLayout7, shimmeringBar, shimmeringDueTimetableView, shimmeringBar2);
                                                                                                                                                i7 = gih0.title;
                                                                                                                                                RobotoTextView robotoTextView10 = (RobotoTextView) cma1.O(i7, inflate);
                                                                                                                                                if (robotoTextView10 != null) {
                                                                                                                                                    i7 = gih0.title_container;
                                                                                                                                                    if (((RelativeLayout) cma1.O(i7, inflate)) != null) {
                                                                                                                                                        i7 = gih0.title_shimmering_view;
                                                                                                                                                        SingleShimmeringBar singleShimmeringBar3 = (SingleShimmeringBar) cma1.O(i7, inflate);
                                                                                                                                                        if (singleShimmeringBar3 != null) {
                                                                                                                                                            return new b1n((ConstraintLayout) inflate, azmVar, czmVar, czmVar2, e0nVar, imageView2, qzmVar, robotoTextView10, singleShimmeringBar3);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            ny61.t("Missing required view with ID: ".concat(O3.getResources().getResourceName(i9)));
                                                                                                                            return null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ny61.t("Missing required view with ID: ".concat(O7.getResources().getResourceName(i8)));
                                                    return null;
                                                }
                                                i2 = i7;
                                            } else {
                                                i2 = i5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        DueAnalyticOrigin dueAnalyticOrigin;
        super.onAttachedToWindow();
        g gVar = this.presenter;
        w0n w0nVar = new w0n(this);
        gVar.Bg(w0nVar);
        d dVar = new d(new b(new n(gVar.J.b, new DueTimetablePresenter$attachView$1(gVar, null)), gVar.G), gVar.F);
        gVar.C.getClass();
        tje.N(gVar.Jg(), null, null, new DueTimetablePresenter$attachView$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(dVar, uyj.a), null, w0nVar), 3);
        tje.N(gVar.Jg(), null, null, new DueTimetablePresenter$attachView$$inlined$collectIn$2(gVar.K.b, null, gVar), 3);
        tje.N(gVar.Jg(), null, null, new DueTimetablePresenter$attachView$$inlined$safeCollectIn$1(new f(gVar.I.a(), gVar), null, w0nVar), 3);
        tje.N(gVar.Jg(), null, null, new DueTimetablePresenter$attachView$$inlined$collectIn$3(kotlinx.coroutines.flow.e.p(gVar.S, 300L), null, gVar), 3);
        tje.N(gVar.Jg(), null, null, new DueTimetablePresenter$attachView$$inlined$collectIn$4(new jqr(((k) gVar.P).j.a(), new DueTimetablePresenter$attachView$9(gVar, null), 0), null, gVar), 3);
        dvm dvmVar = gVar.M;
        String str = gVar.x;
        DueAnalyticViewType dueAnalyticViewType = DueAnalyticViewType.TIMETABLE;
        g1n g1nVar = gVar.y;
        if (g1nVar instanceof f1n) {
            dueAnalyticOrigin = DueAnalyticOrigin.SUMMARY;
        } else {
            if (!(g1nVar instanceof e1n)) {
                w511.b();
                return;
            }
            dueAnalyticOrigin = DueAnalyticOrigin.INTERCITY_DASHBOARD;
        }
        dvmVar.c(str, dueAnalyticViewType, dueAnalyticOrigin);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
