package com.yandex.go.taxi.order.cancel.reasons.view.v2;

import android.content.Context;
import android.text.Editable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.cancel.reasons.interactor.f;
import defpackage.aki0;
import defpackage.ay7;
import defpackage.bys;
import defpackage.c230;
import defpackage.cma1;
import defpackage.cxu0;
import defpackage.dy7;
import defpackage.evu0;
import defpackage.exu0;
import defpackage.f3x;
import defpackage.g92;
import defpackage.gci0;
import defpackage.gy7;
import defpackage.hy7;
import defpackage.j1;
import defpackage.j3x;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.nm7;
import defpackage.nrt;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.rk6;
import defpackage.sjh;
import defpackage.sx7;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tx7;
import defpackage.uyj;
import defpackage.wug0;
import defpackage.ww7;
import defpackage.wx7;
import defpackage.xw7;
import defpackage.xx7;
import defpackage.y5e;
import defpackage.yx7;
import defpackage.zi;
import defpackage.zkh0;
import defpackage.zx7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0005*\u0001<\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001?B5\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0014¢\u0006\u0004\b/\u0010\u0018J\u000f\u00100\u001a\u00020\u0014H\u0014¢\u0006\u0004\b0\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00104R\u001c\u00107\u001a\n\u0012\u0006\b\u0000\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/yandex/go/taxi/order/cancel/reasons/view/v2/CancelReasonsV2View;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lxx7;", "Lay7;", "Lpav;", "imageLoader", "Landroid/content/Context;", "context", "Lexu0;", "styleDelegate", "Lpwy0;", "themeSwitcherProvider", "Lcom/yandex/go/taxi/order/cancel/reasons/view/v2/d;", "presenter", "<init>", "(Lpav;Landroid/content/Context;Lexu0;Lpwy0;Lcom/yandex/go/taxi/order/cancel/reasons/view/v2/d;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "", "styleName", "Lzy11;", "updateThemeAndStyle", "(Lru/yandex/taxi/theme/ThemeType;Ljava/lang/String;)V", "updateBottomElevation", "()V", "Lc230;", "insetsType", "()Lc230;", "Lgy7;", ClidProvider.STATE, "render", "(Lgy7;)V", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyStyle", "(Ljava/lang/String;)V", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "behavior", "initBehavior", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxx7;", "onAttachedToWindow", "onDetachedFromWindow", "Lexu0;", "Lpwy0;", "Lcom/yandex/go/taxi/order/cancel/reasons/view/v2/d;", "Ljava/lang/String;", "Lbys;", "Lyw7;", "adapter", "Lbys;", "", "controlsElevation", "F", "hy7", "scrollListener", "Lhy7;", "iy7", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelReasonsV2View extends SlideableBindingModalView<xx7> implements ay7 {
    public static final int $stable = 8;
    private final bys adapter;
    private final float controlsElevation;
    private final d presenter;
    private final hy7 scrollListener;
    private final exu0 styleDelegate;
    private String styleName;
    private final pwy0 themeSwitcherProvider;

    public CancelReasonsV2View(pav pavVar, Context context, exu0 exu0Var, pwy0 pwy0Var, d dVar) {
        super(context);
        this.styleDelegate = exu0Var;
        this.themeSwitcherProvider = pwy0Var;
        this.presenter = dVar;
        final wx7 wx7Var = new wx7(context, pavVar, new j1(4, this), new rk6(14, this));
        this.adapter = aki0.a(getBinding().e, new tls() { // from class: com.yandex.go.taxi.order.cancel.reasons.view.v2.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                j3x j3xVar = (j3x) obj;
                wx7 wx7Var2 = wx7.this;
                CancelReasonsV2AdapterFactory$create$1$1 cancelReasonsV2AdapterFactory$create$1$1 = new CancelReasonsV2AdapterFactory$create$1$1(0, wx7Var2, wx7.class, "inflateCheckItem", "inflateCheckItem()Lru/yandex/taxi/design/ListItemCheckComponent;", 0);
                j3xVar.getClass();
                aki0.b(new f3x(ww7.class, j3xVar, cancelReasonsV2AdapterFactory$create$1$1), new CancelReasonsV2AdapterFactory$create$1$2(2, wx7Var2, wx7.class, "bindCheckItem", "bindCheckItem(Lru/yandex/taxi/design/ListItemCheckComponent;Lcom/yandex/go/taxi/order/cancel/reasons/models/CancelReasonV2Item$CheckItem;)V", 0));
                aki0.b(new f3x(xw7.class, j3xVar, new CancelReasonsV2AdapterFactory$create$1$3(0, wx7Var2, wx7.class, "inflateListItem", "inflateListItem()Lru/yandex/taxi/design/ListItemComponent;", 0)), new CancelReasonsV2AdapterFactory$create$1$4(2, wx7Var2, wx7.class, "bindListItem", "bindListItem(Lru/yandex/taxi/design/ListItemComponent;Lcom/yandex/go/taxi/order/cancel/reasons/models/CancelReasonV2Item$TextItem;)V", 0));
                return zy11.a;
            }
        });
        this.controlsElevation = tje.r(wug0.cancel_reasons_controls_elevation, getContext());
        hy7 hy7Var = new hy7(this);
        this.scrollListener = hy7Var;
        androidx.core.view.b.q(getBinding().f, true);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setDismissOnBackPressed(false);
        xx7 binding = getBinding();
        binding.e.setItemAnimator(new zx7());
        binding.e.addOnScrollListener(hy7Var);
        binding.d.setDebounceClickListener(new nm7(12, binding, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(CancelReasonsV2View cancelReasonsV2View) {
        cancelReasonsV2View.presenter.Lg(tx7.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(xx7 xx7Var, CancelReasonsV2View cancelReasonsV2View) {
        String obj;
        Editable text = xx7Var.c.getText();
        String str = null;
        if (text != null && (obj = text.toString()) != null && !evu0.J(obj)) {
            str = obj;
        }
        cancelReasonsV2View.presenter.Lg(new sx7(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBottomElevation() {
        xx7 binding = getBinding();
        int computeVerticalScrollRange = binding.e.computeVerticalScrollRange();
        RecyclerView recyclerView = binding.e;
        binding.b.setElevation(recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= computeVerticalScrollRange ? 0.0f : this.controlsElevation);
    }

    private final void updateThemeAndStyle(ThemeType themeType, String styleName) {
        exu0 exu0Var = this.styleDelegate;
        cxu0 b = styleName != null ? ((nrt) exu0Var).b(themeType, styleName) : exu0Var.a(themeType);
        Context context = getContext();
        ContextThemeWrapper contextThemeWrapper = context instanceof ContextThemeWrapper ? (ContextThemeWrapper) context : null;
        if (contextThemeWrapper != null) {
            y5e.Q(contextThemeWrapper, b.b);
        }
    }

    @Override // defpackage.ay7
    public void applyStyle(String styleName) {
        this.styleName = styleName;
        updateThemeAndStyle(this.themeSwitcherProvider.getThemeType(), styleName);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateThemeAndStyle(themeType, this.styleName);
        super.applyTheme(themeType);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public xx7 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.cancel_reasons_v2, parent, false);
        int i = p8h0.bottom_layout;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = p8h0.commentField;
            ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
            if (listItemInputComponent != null) {
                i = p8h0.done_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = p8h0.reasons_recycler;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        i = p8h0.title_text;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            return new xx7((ConstraintLayout) inflate, linearLayout, listItemInputComponent, buttonComponent, recyclerView, robotoTextView);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void initBehavior(AnchorBottomSheetBehavior<View> behavior) {
        super.initBehavior(behavior);
        behavior.W = false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnBackPressedListener(new zi(24));
        setOnTouchOutsideListener(new zi(25));
        setOnArrowClickListener(new zi(26));
        setOnSlideOutListener(new zi(27));
        d dVar = this.presenter;
        dVar.Bg(this);
        yx7 yx7Var = dVar.y;
        o2y0 o2y0Var = yx7Var.e;
        tpr t = e.t(new com.yandex.go.taxi.order.cancel.reasons.interactor.d(o2y0Var.a()));
        tpr t2 = e.t(new f(o2y0Var.a(), yx7Var));
        boolean f = o2y0Var.b().V().f(SimpleBooleanExperiment.HIDE_COMMENT_FIELD_IN_CANCELED_RIDE);
        dy7 dy7Var = yx7Var.a;
        gci0 d = e.d(dy7Var.a);
        r0 r0Var = dy7Var.b;
        tpr t3 = e.t(yx7Var.f.a());
        int i = 3;
        com.yandex.go.taxi.order.cancel.reasons.interactor.b bVar = new com.yandex.go.taxi.order.cancel.reasons.interactor.b(new tpr[]{t, t2, d, r0Var, new g92(2, Boolean.valueOf(f)), t3}, yx7Var);
        yx7Var.d.getClass();
        sjh sjhVar = uyj.a;
        e.H(dVar.Jg(), new jqr(new jqr(e.F(bVar, mdh.b), new CancelReasonsV2Presenter$attachView$1(2, dVar, d.class, "reportScreenShownIfItNeed", "reportScreenShownIfItNeed(Lcom/yandex/go/taxi/order/cancel/reasons/models/CancelReasonsV2UiState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), i), new CancelReasonsV2Presenter$attachView$2(2, this, ay7.class, "render", "render(Lcom/yandex/go/taxi/order/cancel/reasons/models/CancelReasonsV2UiState;)V", 4), i));
        tje.N(dVar.Jg(), null, null, new CancelReasonsV2Presenter$attachView$3(dVar, this, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.ay7
    public void render(gy7 state) {
        getBinding().f.setText(state.a);
        getBinding().c.setVisibility(state.b ? 0 : 8);
        this.adapter.submitList(state.c, null);
    }
}
