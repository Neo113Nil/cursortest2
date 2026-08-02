package com.yandex.go.scooters.insurance.suggest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aun0;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.qfh0;
import defpackage.sls;
import defpackage.srh0;
import defpackage.tje;
import defpackage.tls;
import defpackage.vtn0;
import defpackage.wtn0;
import defpackage.zsn0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB[\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/go/scooters/insurance/suggest/ScootersInsuranceSuggestModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwtn0;", "Landroid/content/Context;", "context", "Lzsn0;", "scootersInsuranceAnalytics", "Lkotlin/Function0;", "Lzy11;", "onRefuse", "onFullInsuranceEnabled", "Lkotlin/Function1;", "", "showErrorDialog", "Laun0;", "scootersInsuranceSuggestPresenter", "<init>", "(Landroid/content/Context;Lzsn0;Lsls;Lsls;Ltls;Laun0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwtn0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lzsn0;", "Lsls;", "Ltls;", "Laun0;", "vtn0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersInsuranceSuggestModalView extends SlideableBindingModalView<wtn0> {
    public static final int $stable = 8;
    private final sls onFullInsuranceEnabled;
    private final sls onRefuse;
    private final zsn0 scootersInsuranceAnalytics;
    private final aun0 scootersInsuranceSuggestPresenter;
    private final tls showErrorDialog;

    public ScootersInsuranceSuggestModalView(Context context, zsn0 zsn0Var, sls slsVar, sls slsVar2, tls tlsVar, aun0 aun0Var) {
        super(context);
        this.scootersInsuranceAnalytics = zsn0Var;
        this.onRefuse = slsVar;
        this.onFullInsuranceEnabled = slsVar2;
        this.showErrorDialog = tlsVar;
        this.scootersInsuranceSuggestPresenter = aun0Var;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public wtn0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_insurance_suggest_modal_view, (ViewGroup) this, false);
        int i = qfh0.conditions;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = qfh0.details_item_component;
            ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent2 != null) {
                i = qfh0.main_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = qfh0.minor_button;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent2 != null) {
                        i = qfh0.price;
                        ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                        if (listItemComponent3 != null) {
                            i = qfh0.subtitle;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null) {
                                i = qfh0.title;
                                if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                                    return new wtn0((GoLinearLayout) inflate, listItemComponent, listItemComponent2, buttonComponent, buttonComponent2, listItemComponent3, robotoTextView);
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

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        aun0 aun0Var = this.scootersInsuranceSuggestPresenter;
        vtn0 vtn0Var = new vtn0(this);
        aun0Var.Bg(vtn0Var);
        tje.N(aun0Var.Jg(), null, null, new ScootersInsuranceSuggestPresenter$attachView$1(aun0Var, vtn0Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersInsuranceSuggestPresenter.Cg();
    }
}
