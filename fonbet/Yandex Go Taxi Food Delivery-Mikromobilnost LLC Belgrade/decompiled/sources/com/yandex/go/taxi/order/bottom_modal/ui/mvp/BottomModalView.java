package com.yandex.go.taxi.order.bottom_modal.ui.mvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.coroutines.b;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.a2i0;
import defpackage.bts0;
import defpackage.c230;
import defpackage.cma1;
import defpackage.e230;
import defpackage.evu0;
import defpackage.hd6;
import defpackage.i3y;
import defpackage.id6;
import defpackage.jd6;
import defpackage.js4;
import defpackage.jzx;
import defpackage.kd6;
import defpackage.koz0;
import defpackage.l95;
import defpackage.n5;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.qu;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tje;
import defpackage.vc6;
import defpackage.wpy0;
import defpackage.zkh0;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.CloseButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u00101R\u0014\u00106\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00107¨\u0006:"}, d2 = {"Lcom/yandex/go/taxi/order/bottom_modal/ui/mvp/BottomModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ljzx;", "Landroid/content/Context;", "context", "Lbts0;", "slotItemViewFactory", "Lvc6;", "presenter", "<init>", "(Landroid/content/Context;Lbts0;Lvc6;)V", "Lhd6;", "uiState", "Lzy11;", "bindState", "(Lhd6;)V", "", "buttonText", "renderButton", "(Ljava/lang/String;)V", "", "hasBackButton", "renderBackButton", "(Z)V", "hasCloseButton", "renderCloseButton", "updateModalViewBehaviour", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ljzx;", "Lvc6;", "Lcom/yandex/go/taxi/order/bottom_modal/ui/adapter/a;", "adapter$delegate", "Li3y;", "getAdapter", "()Lcom/yandex/go/taxi/order/bottom_modal/ui/adapter/a;", "adapter", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton$delegate", "getBackButton", "()Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "closeButton$delegate", "getCloseButton", "closeButton", "isBackButtonAttached", "()Z", "isCloseButtonAttached", "kd6", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BottomModalView extends SlideableBindingModalView<jzx> {
    public static final int $stable = 8;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;

    /* renamed from: backButton$delegate, reason: from kotlin metadata */
    private final i3y backButton;

    /* renamed from: closeButton$delegate, reason: from kotlin metadata */
    private final i3y closeButton;
    private final vc6 presenter;

    public BottomModalView(Context context, bts0 bts0Var, vc6 vc6Var) {
        super(context);
        this.presenter = vc6Var;
        l95 l95Var = new l95(24, bts0Var);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.adapter = a.b(lazyThreadSafetyMode, l95Var);
        this.backButton = a.b(lazyThreadSafetyMode, new n5(context, 6));
        this.closeButton = a.b(lazyThreadSafetyMode, new n5(context, 7));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.yandex.go.taxi.order.bottom_modal.ui.adapter.a adapter_delegate$lambda$0(bts0 bts0Var) {
        return new com.yandex.go.taxi.order.bottom_modal.ui.adapter.a(bts0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackButtonIconComponent backButton_delegate$lambda$0(Context context) {
        return new BackButtonIconComponent(context, null, 0, a2i0.FloatButtonIconStyle, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(hd6 uiState) {
        getAdapter().submitList(uiState.a, null);
        renderButton(uiState.b);
        renderBackButton(uiState.c);
        renderCloseButton(uiState.d);
        updateModalViewBehaviour(uiState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CloseButtonIconComponent closeButton_delegate$lambda$0(Context context) {
        return new CloseButtonIconComponent(context, null, a2i0.FloatButtonIconStyle, 2, null);
    }

    private final com.yandex.go.taxi.order.bottom_modal.ui.adapter.a getAdapter() {
        return (com.yandex.go.taxi.order.bottom_modal.ui.adapter.a) this.adapter.getValue();
    }

    private final FloatButtonIconComponent getBackButton() {
        return (FloatButtonIconComponent) this.backButton.getValue();
    }

    private final FloatButtonIconComponent getCloseButton() {
        return (FloatButtonIconComponent) this.closeButton.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(BottomModalView bottomModalView) {
        return bottomModalView.getBinding().a;
    }

    private final boolean isBackButtonAttached() {
        return getBackButton().getParent() != null;
    }

    private final boolean isCloseButtonAttached() {
        return getCloseButton().getParent() != null;
    }

    private final void renderBackButton(boolean hasBackButton) {
        if (!hasBackButton || isBackButtonAttached()) {
            if (hasBackButton || !isBackButtonAttached()) {
                return;
            }
            removeFloatButton(getBackButton());
            return;
        }
        FloatButtonIconComponent backButton = getBackButton();
        backButton.setDebounceClickListener(new id6(this, 0));
        backButton.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButton.getContext())));
        addFloatButton(backButton, 8388611);
    }

    private final void renderButton(String buttonText) {
        jzx binding = getBinding();
        ButtonComponent buttonComponent = binding.b;
        buttonComponent.setText(buttonText);
        BottomEdgeButtonLayout bottomEdgeButtonLayout = binding.c;
        bottomEdgeButtonLayout.setVisibility((buttonText == null || evu0.J(buttonText)) ? 8 : 0);
        buttonComponent.setVisibility(bottomEdgeButtonLayout.getVisibility() == 0 ? 0 : 8);
        buttonComponent.setDebounceClickListener(new js4(16, this.presenter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButton$lambda$0$onButtonClicked(vc6 vc6Var) {
        wpy0 wpy0Var = vc6Var.z.c;
        vc6Var.y.a.r(new qu(9));
    }

    private final void renderCloseButton(boolean hasCloseButton) {
        if (!hasCloseButton || isCloseButtonAttached()) {
            if (hasCloseButton || !isCloseButtonAttached()) {
                return;
            }
            removeFloatButton(getCloseButton());
            return;
        }
        FloatButtonIconComponent closeButton = getCloseButton();
        closeButton.setDebounceClickListener(new id6(this, 1));
        closeButton.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, closeButton.getContext())));
        addFloatButton(closeButton, 8388613);
    }

    private final void updateModalViewBehaviour(hd6 uiState) {
        BottomModalView bottomModalView;
        BottomModalView$updateModalViewBehaviour$1 bottomModalView$updateModalViewBehaviour$1;
        if (uiState.e) {
            bottomModalView = this;
            bottomModalView$updateModalViewBehaviour$1 = new BottomModalView$updateModalViewBehaviour$1(0, bottomModalView, BottomModalView.class, "onBackPressed", "onBackPressed()V", 0);
        } else {
            bottomModalView = this;
            bottomModalView$updateModalViewBehaviour$1 = null;
        }
        bottomModalView.setOnTouchOutsideListener(bottomModalView$updateModalViewBehaviour$1 != null ? new jd6(bottomModalView$updateModalViewBehaviour$1, 0) : null);
        bottomModalView.setCardMode(uiState.f ? SlideableModalView.CardMode.SLIDEABLE_CARD : SlideableModalView.CardMode.FIXED_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateModalViewBehaviour$lambda$0(tfx tfxVar) {
        ((sls) tfxVar).invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public jzx bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.layout_bottom_modal_view, parent, false);
        int i = p8h0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = p8h0.button_container;
            BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i, inflate);
            if (bottomEdgeButtonLayout != null) {
                i = p8h0.content;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    return new jzx((GoLinearLayout) inflate, buttonComponent, bottomEdgeButtonLayout, recyclerView);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new l95(23, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vc6 vc6Var = this.presenter;
        kd6 kd6Var = new kd6(this);
        vc6Var.Bg(kd6Var);
        koz0 koz0Var = (koz0) vc6Var.z.c.b;
        koz0Var.getClass();
        koz0Var.a.a("TollRoadAlert.Shown", new HashMap(), 1, new HashMap());
        b.g(vc6Var.Jg(), null, null, new BottomModalPresenter$attachView$1(vc6Var, kd6Var, null), 3);
        RecyclerView recyclerView = getBinding().d;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(getAdapter());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        getBinding().d.setAdapter(null);
        super.onDetachedFromWindow();
    }
}
