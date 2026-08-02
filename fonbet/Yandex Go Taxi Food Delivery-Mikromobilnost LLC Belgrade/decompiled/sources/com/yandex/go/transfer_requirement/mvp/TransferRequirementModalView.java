package com.yandex.go.transfer_requirement.mvp;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.transfer_requirement.analytics.TransferCardAnalytics$DismissType;
import com.yandex.go.transfer_requirement.analytics.TransferCardAnalytics$TransferType;
import com.yandex.go.transfer_requirement.ui.date_selector.TransferDateSelectorView;
import com.yandex.go.transfer_requirement.ui.flight_input.TransferNumberInputView;
import defpackage.but0;
import defpackage.c230;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.cmk;
import defpackage.ctb1;
import defpackage.dqe0;
import defpackage.exu0;
import defpackage.fl5;
import defpackage.flh0;
import defpackage.flx0;
import defpackage.fp01;
import defpackage.gp01;
import defpackage.gvz0;
import defpackage.hp01;
import defpackage.i3y;
import defpackage.ih01;
import defpackage.ip01;
import defpackage.jp01;
import defpackage.kcz0;
import defpackage.kdc;
import defpackage.kp01;
import defpackage.kux0;
import defpackage.lp01;
import defpackage.m950;
import defpackage.mr31;
import defpackage.nrt;
import defpackage.ny61;
import defpackage.op01;
import defpackage.pbg;
import defpackage.pp01;
import defpackage.pwy0;
import defpackage.q4h0;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.qr31;
import defpackage.t601;
import defpackage.tje;
import defpackage.tu;
import defpackage.u6o0;
import defpackage.usx0;
import defpackage.v8h0;
import defpackage.vmn0;
import defpackage.w6z0;
import defpackage.wf7;
import defpackage.wh01;
import defpackage.wpy0;
import defpackage.xng0;
import defpackage.xvy0;
import defpackage.xw31;
import defpackage.y5e;
import defpackage.yo01;
import defpackage.zgz0;
import defpackage.zql0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003XYZB=\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010\u0016J\u000f\u0010-\u001a\u00020\u0014H\u0002¢\u0006\u0004\b-\u0010\u0016J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u001aH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u0010\u0016J\u000f\u00103\u001a\u00020\u0014H\u0002¢\u0006\u0004\b3\u0010\u0016J\u000f\u00104\u001a\u00020\u0014H\u0002¢\u0006\u0004\b4\u0010\u0016J\u000f\u00105\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u0010\u0016J!\u00109\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020/H\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010=R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010>R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010O\u001a\u0012\u0012\u0004\u0012\u00020M0Lj\b\u0012\u0004\u0012\u00020M`N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006["}, d2 = {"Lcom/yandex/go/transfer_requirement/mvp/TransferRequirementModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lkp01;", "Landroid/view/ContextThemeWrapper;", "contextWrapper", "Lfp01;", "modalNavigator", "Llp01;", "presenterFactory", "Lexu0;", "styleDelegate", "Lpwy0;", "themeSwitcherProvider", "Lgvz0;", "tooltipPlacementRepository", "<init>", "(Landroid/view/ContextThemeWrapper;Lfp01;Llp01;Lexu0;Lpwy0;Lgvz0;)V", "Lc230;", "insetsType", "()Lc230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "newOffset", "onDialogSlide", "(F)V", "dismiss", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lkp01;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "setupViews", "setupListeners", "isFocused", "Landroidx/core/view/OneShotPreDrawListener;", "signInputOnFocusChange", "(Z)Landroidx/core/view/OneShotPreDrawListener;", "onCancelInputButtonClicked", "onSaveInputButtonClicked", "closeKeyboard", "showTooltip", "hideTooltip", "", "styleName", "updateThemeAndStyle", "(Lru/yandex/taxi/theme/ThemeType;Ljava/lang/String;)V", "updateTooltipHelper", "()Landroidx/core/view/OneShotPreDrawListener;", "Landroid/view/ContextThemeWrapper;", "Lfp01;", "Lexu0;", "Lpwy0;", "Lgvz0;", "Lop01;", "presenter", "Lop01;", "Ljava/lang/String;", "Lqr31;", "viewGroupBubbleContainer", "Lqr31;", "Lmr31;", "tooltip", "Lmr31;", "Ljava/util/ArrayList;", "Lru/yandex/taxi/design/ListItemComponent;", "Lkotlin/collections/ArrayList;", "ruleViewsCache", "Ljava/util/ArrayList;", "", "shadowMargin$delegate", "Li3y;", "getShadowMargin", "()I", "shadowMargin", "Companion", "jp01", "ip01", "tp01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransferRequirementModalView extends SlideableBindingModalView<kp01> {
    private static final float CLOSE_KEYBOARD_DIALOG_THRESHOLD = 0.5f;
    public static final ip01 Companion = new ip01();
    private final ContextThemeWrapper contextWrapper;
    private final fp01 modalNavigator;
    private final op01 presenter;
    private final ArrayList<ListItemComponent> ruleViewsCache;

    /* renamed from: shadowMargin$delegate, reason: from kotlin metadata */
    private final i3y shadowMargin;
    private final exu0 styleDelegate;
    private String styleName;
    private final pwy0 themeSwitcherProvider;
    private mr31 tooltip;
    private final gvz0 tooltipPlacementRepository;
    private qr31 viewGroupBubbleContainer;

    public TransferRequirementModalView(ContextThemeWrapper contextThemeWrapper, fp01 fp01Var, lp01 lp01Var, exu0 exu0Var, pwy0 pwy0Var, gvz0 gvz0Var) {
        super(contextThemeWrapper);
        this.contextWrapper = contextThemeWrapper;
        this.modalNavigator = fp01Var;
        this.styleDelegate = exu0Var;
        this.themeSwitcherProvider = pwy0Var;
        this.tooltipPlacementRepository = gvz0Var;
        vmn0 vmn0Var = ((pp01) lp01Var).a;
        this.presenter = new op01((kcz0) ((flx0) vmn0Var.a).get(), (ru.yandex.taxi.styling.c) ((pbg) vmn0Var.b).get(), (pwy0) ((pbg) vmn0Var.c).get(), (com.yandex.go.transfer_requirement.card_state.a) ((usx0) vmn0Var.w).get(), (com.yandex.go.transfer_requirement.state.a) ((u6o0) vmn0Var.x).get(), (tu) ((pbg) vmn0Var.y).get(), fp01Var);
        this.ruleViewsCache = new ArrayList<>();
        this.shadowMargin = kotlin.a.b(LazyThreadSafetyMode.NONE, new gp01(this, 0));
    }

    private final void closeKeyboard() {
        post(new ce0(this, 15));
        clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getShadowMargin() {
        return ((Number) this.shadowMargin.getValue()).intValue();
    }

    private final void hideTooltip() {
        qr31 qr31Var = this.viewGroupBubbleContainer;
        if (qr31Var != null) {
            qr31Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(TransferRequirementModalView transferRequirementModalView) {
        return transferRequirementModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancelInputButtonClicked() {
        kp01 binding = getBinding();
        AnimatedListItemInputComponent animatedListItemInputComponent = binding.s;
        String str = ((yo01) this.presenter.A.j.a.getValue()).f;
        if (str == null) {
            str = "";
        }
        animatedListItemInputComponent.setValue(str);
        binding.s.clearInputFocus();
        closeKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSaveInputButtonClicked() {
        kp01 binding = getBinding();
        String obj = binding.s.value().toString();
        op01 op01Var = this.presenter;
        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$updateGreeting$1(op01Var, obj, null), 3);
        binding.s.clearInputFocus();
        closeKeyboard();
    }

    private final void setupListeners() {
        kp01 binding = getBinding();
        binding.x.setClickListener(new but0(24, this));
        binding.h.setDebounceClickListener(new t601(5, binding, this));
        binding.k.setOnEditFinishedListener(new TransferRequirementModalView$setupListeners$1$3(1, this.presenter, op01.class, "onFlightNumberUpdated", "onFlightNumberUpdated(Ljava/lang/String;)V", 0));
        int i = 2;
        ru.yandex.taxi.design.utils.c.z(new gp01(this, i), binding.w);
        binding.u.setOnEditFinishedListener(new TransferRequirementModalView$setupListeners$1$5(1, this.presenter, op01.class, "onTrainCarriageUpdated", "onTrainCarriageUpdated(Ljava/lang/String;)V", 0));
        binding.l.setDebounceClickListener(new kux0(25, this.presenter));
        binding.s.setOnFocusStateChanged(new TransferRequirementModalView$setupListeners$1$7(1, this, TransferRequirementModalView.class, "signInputOnFocusChange", "signInputOnFocusChange(Z)Landroidx/core/view/OneShotPreDrawListener;", 8));
        binding.o.setDebounceClickListener(new hp01(this, 1));
        binding.q.setDebounceClickListener(new hp01(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListeners$lambda$0$0(TransferRequirementModalView transferRequirementModalView, int i, wh01 wh01Var) {
        op01 op01Var = transferRequirementModalView.presenter;
        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$onDateUpdated$1(op01Var, wh01Var.c, null), 3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$0$1(kp01 kp01Var, TransferRequirementModalView transferRequirementModalView) {
        kp01Var.h.toggle();
        op01 op01Var = transferRequirementModalView.presenter;
        boolean isChecked = kp01Var.h.isChecked();
        kcz0 kcz0Var = op01Var.x;
        boolean c = op01Var.A.c();
        ih01 ih01Var = (ih01) kcz0Var.a;
        TransferCardAnalytics$TransferType p = kcz0.p(c);
        ih01Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("transfer_type", p.getEventValue());
        hashMap.put("value", Boolean.valueOf(isChecked));
        ih01Var.a.a("TransferCard.LuggageSwitcher.Changed", hashMap, 1, new HashMap());
        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$onLuggageToggled$1(op01Var, isChecked, null), 3);
        transferRequirementModalView.closeKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListeners$lambda$0$2(TransferRequirementModalView transferRequirementModalView) {
        w6z0 w6z0Var;
        transferRequirementModalView.closeKeyboard();
        op01 op01Var = transferRequirementModalView.presenter;
        Calendar a = ctb1.a(op01Var.A.e.a());
        if (a == null) {
            w6z0Var = null;
        } else {
            wf7 wf7Var = wf7.a;
            w6z0Var = new w6z0(wf7.c(a, a.getTimeZone()));
        }
        if (w6z0Var != null) {
            fp01 fp01Var = op01Var.D;
            e eVar = new e(op01Var);
            fl5 fl5Var = (fl5) ((wpy0) fp01Var).b;
            fl5Var.A((m950) ((pbg) fl5Var.L).get(), w6z0Var, eVar);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$0$onPassengerSelectorClicked(op01 op01Var) {
        kcz0 kcz0Var = op01Var.x;
        boolean c = op01Var.A.c();
        ih01 ih01Var = (ih01) kcz0Var.a;
        TransferCardAnalytics$TransferType p = kcz0.p(c);
        ih01Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("transfer_type", p.getEventValue());
        ih01Var.a.a("TransferCard.WhoWillRideButton.Tapped", hashMap, 1, new HashMap());
        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$onPassengerSelectorClicked$1(op01Var, null), 3);
    }

    private final void setupViews() {
        kp01 binding = getBinding();
        binding.s.setDividerVisibility(false);
        binding.w.setDividerVisibility(true);
        binding.b.setBackgroundColor((kdc) null);
        binding.e.setBackgroundResource(q4h0.transfer_top_corners_floating_24dp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int shadowMargin_delegate$lambda$0(TransferRequirementModalView transferRequirementModalView) {
        return ru.yandex.taxi.design.utils.c.h(12, transferRequirementModalView);
    }

    private final void showTooltip() {
        qr31 qr31Var = new qr31(getBinding().t, this.tooltipPlacementRepository);
        this.viewGroupBubbleContainer = qr31Var;
        mr31 mr31Var = this.tooltip;
        if (mr31Var != null) {
            qr31Var.d(getBinding().r, mr31Var, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OneShotPreDrawListener signInputOnFocusChange(boolean isFocused) {
        kp01 binding = getBinding();
        GoLinearLayout goLinearLayout = binding.p;
        AnimatedListItemInputComponent animatedListItemInputComponent = binding.s;
        goLinearLayout.setVisibility(isFocused ? 0 : 8);
        if (isFocused || animatedListItemInputComponent.value().toString().length() > 0) {
            ru.yandex.taxi.design.utils.c.z(new gp01(this, 3), animatedListItemInputComponent.title());
        } else {
            ru.yandex.taxi.design.utils.c.z(new zgz0(25, binding), animatedListItemInputComponent.title());
        }
        return updateTooltipHelper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 signInputOnFocusChange$lambda$0$0(TransferRequirementModalView transferRequirementModalView) {
        transferRequirementModalView.showTooltip();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 signInputOnFocusChange$lambda$0$1(kp01 kp01Var) {
        kp01Var.s.focusInput();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateThemeAndStyle(ThemeType themeType, String styleName) {
        exu0 exu0Var = this.styleDelegate;
        y5e.Q(this.contextWrapper, (styleName != null ? ((nrt) exu0Var).b(themeType, styleName) : exu0Var.a(themeType)).b);
        xvy0.b(getBinding().a, themeType, true, new zql0(qje.u(this.contextWrapper.getTheme(), xng0.bgMain), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OneShotPreDrawListener updateTooltipHelper() {
        return OneShotPreDrawListener.add(this, new cmk(this, getBinding(), xw31.n(getContext())));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateThemeAndStyle(themeType, this.styleName);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public kp01 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(flh0.transfer_requirement_modal_view_layout, parent, false);
        parent.addView(inflate);
        int i = v8h0.card_title;
        ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
        if (listHeaderComponent != null) {
            i = v8h0.done_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = v8h0.done_button_error_text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = v8h0.done_button_group;
                    GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                    if (goLinearLayout != null) {
                        i = v8h0.footer_shadow;
                        GoView goView = (GoView) cma1.O(i, inflate);
                        if (goView != null) {
                            i = v8h0.luggage_count_list_item;
                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                            if (listItemComponent != null) {
                                i = v8h0.luggage_info_toggle;
                                ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) cma1.O(i, inflate);
                                if (listItemSwitchComponent != null) {
                                    i = v8h0.meeting_section_divider;
                                    GoView goView2 = (GoView) cma1.O(i, inflate);
                                    if (goView2 != null) {
                                        i = v8h0.meeting_title;
                                        ListGroupHeaderComponent listGroupHeaderComponent = (ListGroupHeaderComponent) cma1.O(i, inflate);
                                        if (listGroupHeaderComponent != null) {
                                            i = v8h0.number_input;
                                            TransferNumberInputView transferNumberInputView = (TransferNumberInputView) cma1.O(i, inflate);
                                            if (transferNumberInputView != null) {
                                                i = v8h0.passenger_selector;
                                                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                                if (listItemComponent2 != null) {
                                                    i = v8h0.rules_container;
                                                    GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, inflate);
                                                    if (goLinearLayout2 != null) {
                                                        i = v8h0.rules_title;
                                                        ListGroupHeaderComponent listGroupHeaderComponent2 = (ListGroupHeaderComponent) cma1.O(i, inflate);
                                                        if (listGroupHeaderComponent2 != null) {
                                                            i = v8h0.sign_input_cancel_button;
                                                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                                                            if (buttonComponent2 != null) {
                                                                i = v8h0.sign_input_confirmation_container;
                                                                GoLinearLayout goLinearLayout3 = (GoLinearLayout) cma1.O(i, inflate);
                                                                if (goLinearLayout3 != null) {
                                                                    i = v8h0.sign_input_save_button;
                                                                    ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i, inflate);
                                                                    if (buttonComponent3 != null) {
                                                                        i = v8h0.sign_input_title_helper_text_view;
                                                                        if (((TextView) cma1.O(i, inflate)) != null && (O = cma1.O((i = v8h0.sign_input_title_helper_view), inflate)) != null) {
                                                                            i = v8h0.sign_text_input;
                                                                            AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i, inflate);
                                                                            if (animatedListItemInputComponent != null) {
                                                                                i = v8h0.tooltip_container;
                                                                                FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                                                                if (frameLayout != null) {
                                                                                    i = v8h0.train_carriage_input;
                                                                                    TransferNumberInputView transferNumberInputView2 = (TransferNumberInputView) cma1.O(i, inflate);
                                                                                    if (transferNumberInputView2 != null) {
                                                                                        i = v8h0.train_time_carriage_row;
                                                                                        GoLinearLayout goLinearLayout4 = (GoLinearLayout) cma1.O(i, inflate);
                                                                                        if (goLinearLayout4 != null) {
                                                                                            i = v8h0.train_time_row;
                                                                                            AnimatedListItemInputComponent animatedListItemInputComponent2 = (AnimatedListItemInputComponent) cma1.O(i, inflate);
                                                                                            if (animatedListItemInputComponent2 != null) {
                                                                                                i = v8h0.transfer_date_selector;
                                                                                                TransferDateSelectorView transferDateSelectorView = (TransferDateSelectorView) cma1.O(i, inflate);
                                                                                                if (transferDateSelectorView != null) {
                                                                                                    return new kp01((GoFrameLayout) inflate, listHeaderComponent, buttonComponent, robotoTextView, goLinearLayout, goView, listItemComponent, listItemSwitchComponent, goView2, listGroupHeaderComponent, transferNumberInputView, listItemComponent2, goLinearLayout2, listGroupHeaderComponent2, buttonComponent2, goLinearLayout3, buttonComponent3, O, animatedListItemInputComponent, frameLayout, transferNumberInputView2, goLinearLayout4, animatedListItemInputComponent2, transferDateSelectorView);
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
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
        closeKeyboard();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new gp01(this, 1), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        op01 op01Var = this.presenter;
        jp01 jp01Var = new jp01(this);
        op01Var.Bg(jp01Var);
        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$attachView$1(op01Var, null), 3);
        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$attachView$2(op01Var, jp01Var, null), 3);
        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$attachView$3(op01Var, jp01Var, null), 3);
        int i = 0;
        op01Var.E = false;
        kcz0 kcz0Var = op01Var.x;
        boolean c = op01Var.A.c();
        Address h = ((dqe0) kcz0Var.b).a.G.h();
        zzs B = h != null ? h.B() : null;
        if (B != null) {
            Map i2 = kotlin.collections.b.i(new Pair("lat", Double.valueOf(B.a)), new Pair("lon", Double.valueOf(B.b)));
            ih01 ih01Var = (ih01) kcz0Var.a;
            TransferCardAnalytics$TransferType p = kcz0.p(c);
            ih01Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("transfer_type", p.getEventValue());
            hashMap.put("pin_coordinate", i2);
            ih01Var.a.a("TransferCard.Shown", hashMap, 1, new HashMap());
        }
        qdb1.b(this, new hp01(this, i));
        setupListeners();
        setupViews();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        op01 op01Var = this.presenter;
        if (!op01Var.E) {
            op01Var.E = true;
            op01Var.x.u(op01Var.A.c(), TransferCardAnalytics$DismissType.BackButton);
        }
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        if (newOffset <= 0.5f) {
            closeKeyboard();
        }
        hideTooltip();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev != null && ev.getAction() == 1) {
            hideTooltip();
        }
        return super.onInterceptTouchEvent(ev);
    }
}
