package com.yandex.go.something_wrong_screen.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adjust.sdk.Constants;
import defpackage.blh0;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.g8t0;
import defpackage.m8t0;
import defpackage.n8t0;
import defpackage.ny61;
import defpackage.o8t0;
import defpackage.qdb1;
import defpackage.r8h0;
import defpackage.tje;
import defpackage.u8t0;
import defpackage.v8t0;
import defpackage.w511;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/something_wrong_screen/ui/SomethingWrongScreenModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lo8t0;", "Landroid/content/Context;", "context", "Lv8t0;", "presenter", "Lg8t0;", "analytics", "<init>", "(Landroid/content/Context;Lv8t0;Lg8t0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lo8t0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "onTouchOutside", "Lv8t0;", "Lg8t0;", "n8t0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SomethingWrongScreenModalView extends SlideableBindingModalView<o8t0> {
    private final g8t0 analytics;
    private final v8t0 presenter;

    public SomethingWrongScreenModalView(Context context, v8t0 v8t0Var, g8t0 g8t0Var) {
        super(context);
        this.presenter = v8t0Var;
        this.analytics = g8t0Var;
        setDismissOnTouchOutside(false);
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        qdb1.c(this, new m8t0(0, this));
        post(new ce0(this, 15));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public o8t0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(blh0.something_wrong_screen_modal_view, parent, false);
        int i = r8h0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = r8h0.screen_subtitle;
            ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
            if (listTextComponent != null) {
                i = r8h0.screen_title;
                ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                if (listTitleComponent != null) {
                    i = r8h0.toggle;
                    ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) cma1.O(i, inflate);
                    if (listItemSwitchComponent != null && (O = cma1.O((i = r8h0.top_divider), inflate)) != null) {
                        return new o8t0((ConstraintLayout) inflate, buttonComponent, listTextComponent, listTitleComponent, listItemSwitchComponent, O);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        v8t0 v8t0Var = this.presenter;
        n8t0 n8t0Var = new n8t0(this);
        v8t0Var.Bg(n8t0Var);
        g8t0 g8t0Var = v8t0Var.A;
        int i = u8t0.a[v8t0Var.y.ordinal()];
        if (i == 1) {
            str = "order";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = Constants.DEEPLINK;
        }
        g8t0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        g8t0Var.a.a("SomethingWrongScreen.Shown", hashMap, 1, new HashMap());
        tje.N(v8t0Var.Jg(), null, null, new SomethingWrongScreenPresenter$attachView$$inlined$collectIn$1(new e(v8t0Var.z.a.i), null, n8t0Var), 3);
        tje.N(v8t0Var.Jg(), null, null, new SomethingWrongScreenPresenter$attachView$3(v8t0Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        g8t0 g8t0Var = this.analytics;
        g8t0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", "close_button");
        g8t0Var.a.a("SomethingWrongScreen.Disappear", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        g8t0 g8t0Var = this.analytics;
        g8t0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", "out_of_screen");
        g8t0Var.a.a("SomethingWrongScreen.Disappear", hashMap, 1, new HashMap());
    }
}
