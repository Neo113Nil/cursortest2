package com.yandex.go.chargers.station.presentation.tariff;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersTariffCardCloseReason;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import com.yandex.go.coroutines.b;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.awa;
import defpackage.b64;
import defpackage.cma1;
import defpackage.dxa;
import defpackage.em9;
import defpackage.hwa;
import defpackage.io9;
import defpackage.ny61;
import defpackage.od9;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.rxa;
import defpackage.sy60;
import defpackage.tje;
import defpackage.txa;
import defpackage.uj9;
import defpackage.v4a;
import defpackage.vhh0;
import defpackage.vxa;
import defpackage.wsh0;
import defpackage.wxa;
import defpackage.zxa;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/chargers/station/presentation/tariff/ChargersTariffModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwxa;", "Landroid/content/Context;", "context", "Ltxa;", "chargersTariffModalPresenter", "<init>", "(Landroid/content/Context;Ltxa;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwxa;", "Lzy11;", "onAttachedToWindow", "()V", "onSlideOut", "onDetachedFromWindow", "Ltxa;", "vxa", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersTariffModalView extends SlideableBindingModalView<wxa> {
    public static final int $stable = 8;
    private final txa chargersTariffModalPresenter;

    public ChargersTariffModalView(Context context, txa txaVar) {
        super(context);
        this.chargersTariffModalPresenter = txaVar;
        qdb1.c(this, new v4a(3, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChargersTariffModalView chargersTariffModalView) {
        txa txaVar = chargersTariffModalView.chargersTariffModalPresenter;
        txaVar.x.r(ChargersAnalytics$ChargersTariffCardCloseReason.Back);
        ((zxa) txaVar.A.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(ChargersTariffModalView chargersTariffModalView, uj9 uj9Var) {
        txa txaVar = chargersTariffModalView.chargersTariffModalPresenter;
        if (uj9Var instanceof dxa) {
            io9 io9Var = txaVar.A;
            hwa hwaVar = ((dxa) uj9Var).a;
            zxa zxaVar = (zxa) io9Var.a;
            zxaVar.A(((awa) zxaVar.H).a(zxaVar.F), hwaVar, sy60.Q2);
        } else {
            txaVar.getClass();
        }
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public wxa bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(wsh0.chargers_tariff_modal_view, parent, false);
        int i = vhh0.action_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = vhh0.button_container;
            if (((BottomEdgeButtonLayout) cma1.O(i, inflate)) != null) {
                i = vhh0.chargers_tariffs;
                ChargersTariffsView chargersTariffsView = (ChargersTariffsView) cma1.O(i, inflate);
                if (chargersTariffsView != null) {
                    return new wxa((GoLinearLayout) inflate, buttonComponent, chargersTariffsView);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        txa txaVar = this.chargersTariffModalPresenter;
        vxa vxaVar = new vxa(this);
        txaVar.Bg(vxaVar);
        em9 em9Var = txaVar.x;
        rxa rxaVar = txaVar.z;
        boolean z = rxaVar.a.b != null;
        String str = rxaVar.c;
        HashMap w = b64.w(em9Var);
        w.put("promo_badge", Boolean.valueOf(z));
        if (str != null) {
            w.put("trace_id", str);
        }
        em9Var.a.a("Chargers.TariffCard.Shown", w, 1, new HashMap());
        vxaVar.render(rxaVar);
        tje.N(txaVar.Jg(), null, null, new ChargersTariffModalPresenter$attachView$$inlined$collectIn$1(b.d(txaVar.y.b, new ChargersTariffModalPresenter$attachView$$inlined$start$1(rxaVar, null)), null, vxaVar, txaVar), 3);
        getBinding().c.setOnTariffDetailItemValueClickListener(new od9(16, this));
        getBinding().c.setOnTariffDetailItemTitleClickListener(new ChargersTariffModalView$onAttachedToWindow$2(1, this.chargersTariffModalPresenter, txa.class, "onTariffItemInfoClicked", "onTariffItemInfoClicked(Lcom/yandex/go/chargers/tariff_item_info/api/domain/model/ChargersTariffDetailItem$Hint;)V", 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.chargersTariffModalPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        super.onSlideOut();
        this.chargersTariffModalPresenter.x.r(ChargersAnalytics$ChargersTariffCardCloseReason.Back);
    }
}
