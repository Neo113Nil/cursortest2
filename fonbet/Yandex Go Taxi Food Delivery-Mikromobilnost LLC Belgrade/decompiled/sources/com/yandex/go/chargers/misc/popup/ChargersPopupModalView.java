package com.yandex.go.chargers.misc.popup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.ana;
import defpackage.cma1;
import defpackage.da0;
import defpackage.g18;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qhh0;
import defpackage.qma;
import defpackage.qsh0;
import defpackage.qu;
import defpackage.rma;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uma;
import defpackage.uyj;
import defpackage.v4a;
import defpackage.vma;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/chargers/misc/popup/ChargersPopupModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lrma;", "Lpav;", "imageLoader", "Landroid/content/Context;", "context", "Lvma;", "presenter", "<init>", "(Lpav;Landroid/content/Context;Lvma;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lrma;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lpav;", "Lvma;", "Lg18;", "iconCancellable", "Lg18;", "qma", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPopupModalView extends SlideableBindingModalView<rma> {
    private g18 iconCancellable;
    private final pav imageLoader;
    private final vma presenter;

    public ChargersPopupModalView(pav pavVar, Context context, vma vmaVar) {
        super(context);
        this.imageLoader = pavVar;
        this.presenter = vmaVar;
        getBinding().c.setDebounceClickListener(new v4a(2, vmaVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$gotItClicked(vma vmaVar) {
        ((da0) vmaVar.z.b).r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public rma bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qsh0.chargers_popup_modal_view, parent, false);
        int i = qhh0.body;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = qhh0.got_it;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = qhh0.icon;
                GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                if (goImageView != null) {
                    i = qhh0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new rma(goImageView, (GoLinearLayout) inflate, buttonComponent, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vma vmaVar = this.presenter;
        qma qmaVar = new qma(this);
        vmaVar.Bg(qmaVar);
        ana anaVar = vmaVar.x;
        uma umaVar = vmaVar.y;
        tpr t = e.t(new n(new b(anaVar.b.a(), anaVar, umaVar), new ChargersPopupUiStateInteractor$uiStateFlow$2(anaVar, umaVar, null)));
        anaVar.a.getClass();
        tje.N(vmaVar.Jg(), null, null, new ChargersPopupPresenter$attachView$$inlined$collectIn$1(e.F(t, uyj.a), null, qmaVar), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.iconCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.iconCancellable = null;
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
