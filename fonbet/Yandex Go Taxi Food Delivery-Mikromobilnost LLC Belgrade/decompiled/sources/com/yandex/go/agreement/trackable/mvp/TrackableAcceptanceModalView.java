package com.yandex.go.agreement.trackable.mvp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.slot.ui.view.SlotItemButtonViewComponent;
import defpackage.ars0;
import defpackage.b101;
import defpackage.bdc;
import defpackage.but0;
import defpackage.cma1;
import defpackage.ehh0;
import defpackage.ei;
import defpackage.h101;
import defpackage.hrs0;
import defpackage.i101;
import defpackage.i3y;
import defpackage.m101;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.o101;
import defpackage.p101;
import defpackage.pxy0;
import defpackage.qdb1;
import defpackage.seb1;
import defpackage.tan;
import defpackage.tje;
import defpackage.u101;
import defpackage.vqh0;
import defpackage.vrs0;
import defpackage.w101;
import defpackage.wrs0;
import defpackage.x4e;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.zgz0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/yandex/go/agreement/trackable/mvp/TrackableAcceptanceModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lw101;", "Landroid/content/Context;", "context", "Lcom/yandex/go/agreement/trackable/mvp/b;", "presenter", "Lars0;", "slotItemButtonViewFactory", "<init>", "(Landroid/content/Context;Lcom/yandex/go/agreement/trackable/mvp/b;Lars0;)V", "Lzy11;", "setInitialBehaviorState", "()V", "", "Lm101;", "buttonsUiState", "setButtons", "(Ljava/util/List;)V", "", "showCloseButton", "setCloseButton", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw101;", "onAttachedToWindow", "onDetachedFromWindow", "onAppearAnimationComplete", "Lcom/yandex/go/agreement/trackable/mvp/b;", "Lars0;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "closeButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lru/yandex/taxi/widget/text/method/LinkMovementMethod;", "linkMovementMethod$delegate", "Li3y;", "getLinkMovementMethod", "()Lru/yandex/taxi/widget/text/method/LinkMovementMethod;", "linkMovementMethod", "p101", "q101", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TrackableAcceptanceModalView extends SlideableBindingModalView<w101> {
    private FloatButtonIconComponent closeButton;

    /* renamed from: linkMovementMethod$delegate, reason: from kotlin metadata */
    private final i3y linkMovementMethod;
    private final b presenter;
    private final ars0 slotItemButtonViewFactory;

    public TrackableAcceptanceModalView(Context context, b bVar, ars0 ars0Var) {
        super(context);
        this.presenter = bVar;
        this.slotItemButtonViewFactory = ars0Var;
        this.linkMovementMethod = kotlin.a.b(LazyThreadSafetyMode.NONE, new zgz0(11, this));
        androidx.core.view.b.p(getBinding().c, new ei(28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkMovementMethod getLinkMovementMethod() {
        return (LinkMovementMethod) this.linkMovementMethod.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkMovementMethod linkMovementMethod_delegate$lambda$0(TrackableAcceptanceModalView trackableAcceptanceModalView) {
        return seb1.a(new pxy0(13, trackableAcceptanceModalView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 linkMovementMethod_delegate$lambda$0$0(TrackableAcceptanceModalView trackableAcceptanceModalView, String str) {
        trackableAcceptanceModalView.presenter.Lg(new h101(str));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButtons(List<m101> buttonsUiState) {
        BottomEdgeButtonLayout bottomEdgeButtonLayout = getBinding().b;
        bottomEdgeButtonLayout.removeAllViews();
        for (m101 m101Var : buttonsUiState) {
            ars0 ars0Var = this.slotItemButtonViewFactory;
            AttributeSet attributeSet = null;
            int i = 0;
            int i2 = 0;
            SlotItemButtonViewComponent slotItemButtonViewComponent = new SlotItemButtonViewComponent(bottomEdgeButtonLayout.getContext(), attributeSet, i, i2, ((hrs0) ars0Var).a, new but0(17, this), 14, null);
            setButtons$lambda$0$0$1(slotItemButtonViewComponent);
            bottomEdgeButtonLayout.addView(slotItemButtonViewComponent.asView());
            int i3 = m101Var.d;
            xss0 xss0Var = m101Var.a;
            slotItemButtonViewComponent.setup(tje.r(i3, bottomEdgeButtonLayout.getContext()), new bdc(xng0.controlPressed));
            nqs0 nqs0Var = xss0Var.d;
            wrs0.a.getClass();
            slotItemButtonViewComponent.setAction(nqs0Var, vrs0.b);
            slotItemButtonViewComponent.render(xss0Var, m101Var.b);
            slotItemButtonViewComponent.renderBackground(m101Var.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setButtons$lambda$0$0$0(TrackableAcceptanceModalView trackableAcceptanceModalView, nqs0 nqs0Var, wrs0 wrs0Var) {
        trackableAcceptanceModalView.presenter.Lg(nqs0Var instanceof i101 ? (i101) nqs0Var : null);
        return zy11.a;
    }

    private static final zy11 setButtons$lambda$0$0$1(View view) {
        x4e.y(-1, -2, view);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCloseButton(boolean showCloseButton) {
        FloatButtonIconComponent floatButtonIconComponent = this.closeButton;
        if (showCloseButton) {
            if (floatButtonIconComponent == null) {
                this.closeButton = qdb1.c(this, new o101(this, 0));
            }
        } else {
            if (floatButtonIconComponent != null) {
                removeView(floatButtonIconComponent);
            }
            this.closeButton = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCloseButton$lambda$0(TrackableAcceptanceModalView trackableAcceptanceModalView) {
        trackableAcceptanceModalView.presenter.Lg(b101.a);
    }

    private final void setInitialBehaviorState() {
        setInterceptOnBackPress(true);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        getBottomSheetBehavior().a0 = false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public w101 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(vqh0.trackable_agreement_layout, parent, false);
        int i = ehh0.buttons_container;
        BottomEdgeButtonLayout bottomEdgeButtonLayout = (BottomEdgeButtonLayout) cma1.O(i, inflate);
        if (bottomEdgeButtonLayout != null) {
            i = ehh0.content;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = ehh0.image;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = ehh0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new w101((LinearLayout) inflate, bottomEdgeButtonLayout, robotoTextView, goImageView, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        r0 r0Var = this.presenter.J;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setInitialBehaviorState();
        b bVar = this.presenter;
        p101 p101Var = new p101(this);
        bVar.Bg(p101Var);
        tje.N(bVar.Jg(), null, null, new TrackableAcceptancePresenter$attachView$$inlined$safeCollectIn$1(new m0(bVar.J, bVar.K, new TrackableAcceptancePresenter$attachView$1(3, null)), p101Var, bVar, null), 3);
        tje.N(bVar.Jg(), null, null, new TrackableAcceptancePresenter$attachView$$inlined$safeCollectIn$2(e.t(bVar.A.a()), p101Var, bVar, null), 3);
        com.yandex.go.agreement.trackable.repository.b bVar2 = bVar.D;
        u101 u101Var = bVar.x;
        String str = u101Var.a.a;
        r0 r0Var = bVar2.c;
        Set M0 = kotlin.collections.a.M0((Iterable) r0Var.getValue());
        M0.add(str);
        r0Var.m(null, M0);
        tan tanVar = bVar.G;
        String str2 = u101Var.a.a;
        tanVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("id", str2);
        tanVar.a.a("EULA.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
