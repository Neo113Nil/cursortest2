package com.yandex.go.payments.sbp.ui.binding_progress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.payments.sbp.data.f;
import defpackage.cma1;
import defpackage.e6h0;
import defpackage.luh0;
import defpackage.ny61;
import defpackage.t61;
import defpackage.wim0;
import defpackage.xim0;
import defpackage.zim0;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/payments/sbp/ui/binding_progress/SbpTokenBindingProgressModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lxim0;", "Landroid/content/Context;", "context", "Lzim0;", "presenter", "<init>", "(Landroid/content/Context;Lzim0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxim0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/content/Context;", "Lzim0;", "wim0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SbpTokenBindingProgressModalView extends SlideableBindingModalView<xim0> {
    public static final int $stable = 8;
    private final Context context;
    private final zim0 presenter;

    public SbpTokenBindingProgressModalView(Context context, zim0 zim0Var) {
        super(context);
        this.context = context;
        this.presenter = zim0Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        setDismissOnBackPressed(false);
    }

    public static final /* synthetic */ xim0 access$getBinding(SbpTokenBindingProgressModalView sbpTokenBindingProgressModalView) {
        return sbpTokenBindingProgressModalView.getBinding();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public xim0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.sbp_token_binding_progress_modal_view, parent, false);
        int i = e6h0.progress;
        if (((CircularProgressBar) cma1.O(i, inflate)) != null) {
            i = e6h0.progress_description;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                return new xim0((ConstraintLayout) inflate, robotoTextView);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zim0 zim0Var = this.presenter;
        zim0Var.Bg(new wim0());
        t61 t61Var = zim0Var.y.c;
        t61Var.getClass();
        t61Var.a.a("SBPOpenBankInProgressCard.Shown", new HashMap(), 1, new HashMap());
        access$getBinding(this).b.setText(((f) zim0Var.x.b).b.e.a);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
