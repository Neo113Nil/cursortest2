package com.yandex.go.scooters.deposit.communication.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.scooters.analytics.ScootersDepositCardAnalytics$ButtonName;
import com.yandex.go.scooters.analytics.ScootersDepositCardAnalytics$CloseReason;
import defpackage.cma1;
import defpackage.j7h0;
import defpackage.ny61;
import defpackage.sdn0;
import defpackage.tje;
import defpackage.udn0;
import defpackage.ujh0;
import defpackage.v3n0;
import defpackage.vdn0;
import defpackage.xdn0;
import defpackage.ydn0;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/scooters/deposit/communication/ui/ScootersDepositCommunicationModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lvdn0;", "Landroid/content/Context;", "context", "Lsdn0;", "scootersDepositCardAnalytics", "Lydn0;", "scootersDepositCommunicationPresenter", "<init>", "(Landroid/content/Context;Lsdn0;Lydn0;)V", "Lzy11;", "logAnalyticEventOnClosedByButton", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvdn0;", "onAttachedToWindow", "onTouchOutside", "onSlideOut", "onBackPressed", "onDetachedFromWindow", "Lsdn0;", "Lydn0;", "udn0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDepositCommunicationModalView extends SlideableBindingModalView<vdn0> {
    private final sdn0 scootersDepositCardAnalytics;
    private final ydn0 scootersDepositCommunicationPresenter;

    public ScootersDepositCommunicationModalView(Context context, sdn0 sdn0Var, ydn0 ydn0Var) {
        super(context);
        this.scootersDepositCardAnalytics = sdn0Var;
        this.scootersDepositCommunicationPresenter = ydn0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAnalyticEventOnClosedByButton() {
        this.scootersDepositCardAnalytics.a(ScootersDepositCardAnalytics$CloseReason.Button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersDepositCommunicationModalView scootersDepositCommunicationModalView) {
        sdn0 sdn0Var = scootersDepositCommunicationModalView.scootersDepositCardAnalytics;
        ScootersDepositCardAnalytics$ButtonName scootersDepositCardAnalytics$ButtonName = ScootersDepositCardAnalytics$ButtonName.Ok;
        sdn0Var.getClass();
        HashMap hashMap = new HashMap();
        if (scootersDepositCardAnalytics$ButtonName != null) {
            hashMap.put("button_name", scootersDepositCardAnalytics$ButtonName.getEventValue());
        }
        sdn0Var.a.a("ScootersDepositCard.Tapped", hashMap, 1, new HashMap());
        ydn0 ydn0Var = scootersDepositCommunicationModalView.scootersDepositCommunicationPresenter;
        ((xdn0) ydn0Var.Dg()).d3();
        ydn0Var.y.invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vdn0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ujh0.scooters_deposit_communication_modal_view, parent, false);
        parent.addView(inflate);
        int i = j7h0.description_text_view;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = j7h0.imageView;
            if (((ImageView) cma1.O(i, inflate)) != null) {
                i = j7h0.ok_button;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = j7h0.title_text_view;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new vdn0((LinearLayout) inflate, robotoTextView, listItemComponent, robotoTextView2);
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
        sdn0 sdn0Var = this.scootersDepositCardAnalytics;
        sdn0Var.getClass();
        sdn0Var.a.a("ScootersDepositCard.Shown", new HashMap(), 1, new HashMap());
        ydn0 ydn0Var = this.scootersDepositCommunicationPresenter;
        udn0 udn0Var = new udn0(this);
        ydn0Var.Bg(udn0Var);
        tje.N(ydn0Var.Jg(), null, null, new ScootersDepositCommunicationPresenter$attachView$1(ydn0Var, udn0Var, null), 3);
        getBinding().c.setDebounceClickListener(new v3n0(5, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.scootersDepositCardAnalytics.a(ScootersDepositCardAnalytics$CloseReason.BackPressed);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersDepositCommunicationPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        this.scootersDepositCardAnalytics.a(ScootersDepositCardAnalytics$CloseReason.SlideOut);
        super.onSlideOut();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        this.scootersDepositCardAnalytics.a(ScootersDepositCardAnalytics$CloseReason.TouchOutside);
        super.onTouchOutside();
    }
}
