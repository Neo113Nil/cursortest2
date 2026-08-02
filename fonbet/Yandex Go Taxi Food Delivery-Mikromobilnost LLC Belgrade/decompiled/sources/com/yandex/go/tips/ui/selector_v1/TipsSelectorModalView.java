package com.yandex.go.tips.ui.selector_v1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.tipssuggest.domain.a;
import com.yandex.go.tips.ui.TipsView;
import defpackage.cma1;
import defpackage.dlh0;
import defpackage.ine0;
import defpackage.jfz0;
import defpackage.kux0;
import defpackage.mrg0;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.s2u0;
import defpackage.t8h0;
import defpackage.ugz0;
import defpackage.vgz0;
import defpackage.wgz0;
import defpackage.wnb1;
import defpackage.xgz0;
import defpackage.xw31;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001%B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/go/tips/ui/selector_v1/TipsSelectorModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lvgz0;", "Lwgz0;", "Landroid/content/Context;", "context", "Lxgz0;", "presenter", "<init>", "(Landroid/content/Context;Lxgz0;)V", "Lzy11;", "onAttachedToWindow", "()V", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissInternal", "(Ljava/lang/Runnable;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "", "Ljfz0;", "tips", "showTips", "(Ljava/util/List;)V", "", "screenName", "()Ljava/lang/String;", "", "canHandleScreenTracking", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvgz0;", "Lugz0;", "listener", "setOnTipUpdateListener", "(Lugz0;)V", "Lxgz0;", "tipUpdateListener", "Lugz0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsSelectorModalView extends SlideableBindingModalView<vgz0> implements wgz0 {
    private final xgz0 presenter;
    private ugz0 tipUpdateListener;

    public TipsSelectorModalView(Context context, xgz0 xgz0Var) {
        super(context);
        this.presenter = xgz0Var;
        this.tipUpdateListener = new s2u0(14);
        wnb1.d(r1.getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius), getBinding().a);
        b.q(getBinding().c, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(TipsSelectorModalView tipsSelectorModalView, jfz0 jfz0Var, boolean z) {
        xgz0 xgz0Var = tipsSelectorModalView.presenter;
        ine0 ine0Var = xgz0Var.B;
        String str = jfz0Var.f;
        TipsType tipsType = jfz0Var.e;
        ine0Var.a.D(Integer.parseInt(str));
        TaxiOrder v = ((e0) xgz0Var.A).v();
        a aVar = xgz0Var.x;
        if (v == null) {
            aVar.g(new Tips(str, tipsType));
        } else if (v.A() != null && v.A() == tipsType) {
            v.U(str, TipsType.PERCENT);
            xgz0Var.w.g(v);
            aVar.f(v.a, new Tips(str, tipsType));
        }
        ((wgz0) xgz0Var.Dg()).showTips(xgz0Var.y.a(xgz0Var.B.a.s()));
        xgz0Var.z.c(Integer.valueOf(Integer.parseInt(str)));
        tipsSelectorModalView.tipUpdateListener.n(jfz0Var.f);
        tipsSelectorModalView.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(TipsSelectorModalView tipsSelectorModalView) {
        xw31.w(tipsSelectorModalView.getBinding().c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tipUpdateListener$lambda$0(String str) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vgz0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        if (parent == null) {
            ny61.t("parent");
            return null;
        }
        inflater.inflate(dlh0.tips_selector_modal_view, parent);
        int i = t8h0.list_text;
        if (((ListItemComponent) cma1.O(i, parent)) != null) {
            i = t8h0.tips;
            TipsView tipsView = (TipsView) cma1.O(i, parent);
            if (tipsView != null) {
                i = t8h0.tips_selector_toolbar;
                ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, parent);
                if (toolbarComponent != null) {
                    return new vgz0(parent, tipsView, toolbarComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(parent.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContentView() {
        return getBinding().a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        super.dismissInternal(onAnimationEnd);
        this.presenter.z.b();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xgz0 xgz0Var = this.presenter;
        xgz0Var.Bg(this);
        ((wgz0) xgz0Var.Dg()).showTips(xgz0Var.y.a(xgz0Var.B.a.s()));
        getBinding().b.setButtonToggledListener(new n2v0(20, this));
        post(new kux0(15, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "card_tips";
    }

    public final void setOnTipUpdateListener(ugz0 listener) {
        this.tipUpdateListener = listener;
    }

    @Override // defpackage.wgz0
    public void showTips(List<jfz0> tips) {
        getBinding().b.setModelsGroup(tips);
    }
}
