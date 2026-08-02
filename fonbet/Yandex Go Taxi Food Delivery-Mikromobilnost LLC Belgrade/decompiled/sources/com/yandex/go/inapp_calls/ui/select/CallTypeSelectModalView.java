package com.yandex.go.inapp_calls.ui.select;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import com.yandex.go.inapp_calls.ui.select.CallTypeSelectModalView;
import defpackage.c230;
import defpackage.cma1;
import defpackage.da0;
import defpackage.e230;
import defpackage.ip11;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.nk7;
import defpackage.ny61;
import defpackage.oth0;
import defpackage.qdb1;
import defpackage.qk7;
import defpackage.qu;
import defpackage.rih0;
import defpackage.rk6;
import defpackage.tje;
import defpackage.wk6;
import defpackage.zmh;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/inapp_calls/ui/select/CallTypeSelectModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lnk7;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Lqk7;", "presenter", "<init>", "(Landroid/content/Context;Lip11;Lqk7;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lnk7;", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lqk7;", "lk7", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CallTypeSelectModalView extends SlideableBindingModalView<nk7> {
    private final qk7 presenter;

    public CallTypeSelectModalView(Context context, ip11 ip11Var, qk7 qk7Var) {
        super(context);
        this.presenter = qk7Var;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        getBinding().f.setTypeface(((zmh) ip11Var).d());
        b.q(getBinding().f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(CallTypeSelectModalView callTypeSelectModalView) {
        return callTypeSelectModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$closeClicked(qk7 qk7Var) {
        ((da0) qk7Var.y.b).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$defaultCallClicked(qk7 qk7Var) {
        if (qk7Var.F) {
            qk7Var.Kg(DefaultOutgoingCallType.PHONE);
        }
        ((da0) qk7Var.y.b).r(new wk6(15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$inAppCallClicked(qk7 qk7Var) {
        if (qk7Var.F) {
            qk7Var.Kg(DefaultOutgoingCallType.VOIP);
        }
        ((da0) qk7Var.y.b).r(new wk6(14));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public nk7 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(oth0.call_type_select_modal_view, parent, false);
        int i = rih0.default_call_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = rih0.inapp_call_button;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = rih0.remember_my_choice_view;
                ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) cma1.O(i, inflate);
                if (listItemCheckComponent != null) {
                    i = rih0.subtitle;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = rih0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            return new nk7((GoLinearLayout) inflate, buttonComponent, buttonComponent2, listItemCheckComponent, robotoTextView, robotoTextView2);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new rk6(8, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qk7 qk7Var = this.presenter;
        lk7 lk7Var = new lk7(this);
        qk7Var.Bg(lk7Var);
        tje.N(qk7Var.Jg(), null, null, new CallTypeSelectPresenter$attachView$$inlined$collectIn$1(new m0(d.b(qk7Var.A.d), qk7Var.D.a(), new CallTypeSelectPresenter$attachView$1(3, null)), null, lk7Var, qk7Var), 3);
        final int i = 0;
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        final qk7 qk7Var2 = this.presenter;
        qdb1.c(this, new Runnable() { // from class: kk7
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                qk7 qk7Var3 = qk7Var2;
                switch (i2) {
                    case 0:
                        CallTypeSelectModalView.onAttachedToWindow$closeClicked(qk7Var3);
                        break;
                    case 1:
                        CallTypeSelectModalView.onAttachedToWindow$defaultCallClicked(qk7Var3);
                        break;
                    default:
                        CallTypeSelectModalView.onAttachedToWindow$inAppCallClicked(qk7Var3);
                        break;
                }
            }
        });
        ButtonComponent buttonComponent = getBinding().b;
        final qk7 qk7Var3 = this.presenter;
        final int i2 = 1;
        buttonComponent.setOnClickListener(new Runnable() { // from class: kk7
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                qk7 qk7Var32 = qk7Var3;
                switch (i22) {
                    case 0:
                        CallTypeSelectModalView.onAttachedToWindow$closeClicked(qk7Var32);
                        break;
                    case 1:
                        CallTypeSelectModalView.onAttachedToWindow$defaultCallClicked(qk7Var32);
                        break;
                    default:
                        CallTypeSelectModalView.onAttachedToWindow$inAppCallClicked(qk7Var32);
                        break;
                }
            }
        });
        ButtonComponent buttonComponent2 = getBinding().c;
        final qk7 qk7Var4 = this.presenter;
        final int i3 = 2;
        buttonComponent2.setOnClickListener(new Runnable() { // from class: kk7
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                qk7 qk7Var32 = qk7Var4;
                switch (i22) {
                    case 0:
                        CallTypeSelectModalView.onAttachedToWindow$closeClicked(qk7Var32);
                        break;
                    case 1:
                        CallTypeSelectModalView.onAttachedToWindow$defaultCallClicked(qk7Var32);
                        break;
                    default:
                        CallTypeSelectModalView.onAttachedToWindow$inAppCallClicked(qk7Var32);
                        break;
                }
            }
        });
        getBinding().d.setCheckedChangeListener(new mk7(i, this.presenter));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
