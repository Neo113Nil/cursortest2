package defpackage;

import android.content.BroadcastReceiver;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.widget.TextView;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.state.ToggleableState;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.CustomWebView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.CustomWebView$setupWebChromeClient$1;
import com.yandex.go.design.compose.check.CheckState;
import com.yandex.go.mainscreen.superapp.impl.currentaddress.c;
import com.yandex.go.payments.cards.ui.CardNumberPadView;
import com.yandex.go.taxi.order.custom_tips_input.mvp.CustomTipsInputModalView;
import com.yandex.messaging.ui.folders.e;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.divkit.cvv_confirm.b;
import com.yandex.payment.divkit.exitscreen.DKExitFragment;
import com.yandex.payment.divkit.license.DKLicenseFragment;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.g;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersFragment;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import com.ybsdk.feature.dashboard.api.NfcSupportChecker$Status;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardTokenizationWidget;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinFragment;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class dye implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dye(ha60 ha60Var, DashboardTokenizationWidget dashboardTokenizationWidget, pey peyVar, rs31 rs31Var) {
        this.a = 25;
        this.b = ha60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0018 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$3;
        Object value;
        b5f b5fVar;
        stz0 render$lambda$14$lambda$11;
        zy11 onViewCreated$lambda$10$lambda$6;
        zy11 onViewCreated$lambda$14$lambda$11;
        zy11 zy11Var;
        zy11 onCreateWindow$lambda$0;
        zy11 onViewCreated$lambda$32;
        zy11 onViewCreated$lambda$0;
        zy11 onViewCreated$lambda$02;
        zy11 bottomSheet$lambda$49$lambda$48$lambda$47;
        NfcSupportChecker$Status nfcSupportChecker$Status;
        ToggleableState toggleableState;
        boolean z;
        List<PlusPaySdkAdapter$CompositeOffer.Option> optionOffers;
        Iterator<T> it;
        boolean z2;
        int i = this.a;
        int i2 = 0;
        Object obj2 = null;
        zy11 zy11Var2 = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                wxe wxeVar = (wxe) obj3;
                f.l((mnq0) obj, wxeVar.a + " " + wxeVar.b);
                return zy11Var2;
            case 1:
                onViewCreated$lambda$3 = CounterOffersFragment.onViewCreated$lambda$3((CounterOffersFragment) obj3, (mx60) obj);
                return onViewCreated$lambda$3;
            case 2:
                ((a) ((z0f) obj3).c).a((b151) obj);
                return zy11Var2;
            case 3:
                ec0 ec0Var = (ec0) obj;
                Set set = ec0Var.b;
                Set set2 = ec0Var.a;
                r0 r0Var = ((e) obj3).C;
                do {
                    value = r0Var.getValue();
                    b5fVar = (b5f) value;
                } while (!r0Var.k(value, b5fVar != null ? b5f.a(b5fVar, null, set, set2, 21) : null));
                return zy11Var2;
            case 4:
                render$lambda$14$lambda$11 = CreatePinFragment.render$lambda$14$lambda$11((g7f) obj3, (stz0) obj);
                return render$lambda$14$lambda$11;
            case 5:
                onViewCreated$lambda$10$lambda$6 = CreatePinFragment.onViewCreated$lambda$10$lambda$6((CreatePinFragment) obj3, ((Character) obj).charValue());
                return onViewCreated$lambda$10$lambda$6;
            case 6:
                c7f c7fVar = (c7f) obj3;
                String str = c7fVar.a;
                if (!c7fVar.b(0) || !jl40.l(str, "1234")) {
                    int i3 = 0;
                    while (i2 < str.length()) {
                        if (str.charAt(i2) == gvu0.u0(str)) {
                            i3++;
                        }
                        i2++;
                    }
                    if (i3 != 4) {
                        return c7fVar;
                    }
                }
                return c7f.a(c7fVar, null, null, y6f.d, null, null, null, 251);
            case 7:
                onViewCreated$lambda$14$lambda$11 = CreditDepositFragment.onViewCreated$lambda$14$lambda$11((q661) obj3, (Throwable) obj);
                return onViewCreated$lambda$14$lambda$11;
            case 8:
                zbf zbfVar = (zbf) obj3;
                BroadcastReceiver broadcastReceiver = (BroadcastReceiver) obj;
                zbfVar.a("broadcast received", new Pair[0]);
                String resultData = broadcastReceiver.getResultData();
                String str2 = zbfVar.d;
                if (jl40.l(resultData, str2)) {
                    zbfVar.a("broadcast recursion", new Pair[0]);
                } else {
                    qp3 qp3Var = zbfVar.g;
                    kgx kgxVar = zbf.h[0];
                    if (((e1k) qp3Var.a()) == null || !zbfVar.c.a()) {
                        zbfVar.a("broadcast skipped", new Pair[0]);
                    } else {
                        broadcastReceiver.setResult(1, str2, null);
                        broadcastReceiver.abortBroadcast();
                        zbfVar.a("broadcast handled", new Pair[0]);
                    }
                }
                return zy11Var2;
            case 9:
                eef eefVar = (eef) obj3;
                eefVar.b.L7((bef) eefVar.a.get(((Integer) obj).intValue()));
                return zy11Var2;
            case 10:
                ((c) obj3).r(new zef(i2, (zzs) obj));
                return zy11Var2;
            case 11:
                f.l((mnq0) obj, ((irl) obj3).c);
                return zy11Var2;
            case 12:
                zy11Var = CustomTipsInputModalView.setupInputField$lambda$0$0((CustomTipsInputModalView) obj3, ((Integer) obj).intValue());
                return zy11Var;
            case 13:
                onCreateWindow$lambda$0 = CustomWebView$setupWebChromeClient$1.onCreateWindow$lambda$0((CustomWebView) obj3, (String) obj);
                return onCreateWindow$lambda$0;
            case 14:
                com.yandex.go.payments.cards.pci_dss.ui.c cVar = (com.yandex.go.payments.cards.pci_dss.ui.c) obj3;
                Editable editable = (Editable) obj;
                ((CardNumberPadView) cVar.b.a).setConfirmButtonEnabled((editable != null ? editable.length() : 0) == cVar.e);
                return zy11Var2;
            case 15:
                b bVar = (b) obj3;
                qwl qwlVar = bVar.I;
                if (qwlVar != null) {
                    qwlVar.setPaymentApi(bVar.w);
                }
                qwl qwlVar2 = bVar.I;
                if (qwlVar2 != null) {
                    qwlVar2.provideCvn();
                }
                return zy11Var2;
            case 16:
                onViewCreated$lambda$32 = DKChallengerFragment.onViewCreated$lambda$3((DKChallengerFragment) obj3, (jsf) obj);
                return onViewCreated$lambda$32;
            case 17:
                onViewCreated$lambda$0 = DKExitFragment.onViewCreated$lambda$0((DKExitFragment) obj3, (f950) obj);
                return onViewCreated$lambda$0;
            case 18:
                onViewCreated$lambda$02 = DKLicenseFragment.onViewCreated$lambda$0((DKLicenseFragment) obj3, (f950) obj);
                return onViewCreated$lambda$02;
            case 19:
                ((com.yandex.payment.divkit.preselect.f) obj3).Z((PaymentMethod) obj, true);
                return zy11Var2;
            case 20:
                androidx.core.widget.b.a((TextView) ((cdg) obj3).f.a(cdg.n[0]), ColorStateList.valueOf(((Integer) obj).intValue()));
                return zy11Var2;
            case 21:
                fdg fdgVar = ((kdg) obj3).i;
                lio.a(fdgVar != null ? fdgVar.b : null);
                throw null;
            case 22:
                androidx.core.widget.b.a((TextView) ((tdg) obj3).h.a(tdg.r[0]), ColorStateList.valueOf(((Integer) obj).intValue()));
                return zy11Var2;
            case 23:
                bottomSheet$lambda$49$lambda$48$lambda$47 = DashboardFragment.bottomSheet$lambda$49$lambda$48$lambda$47((DashboardFragment) obj3, ((Boolean) obj).booleanValue());
                return bottomSheet$lambda$49$lambda$48$lambda$47;
            case 24:
                n70 n70Var = (n70) obj;
                ((dmg) obj3).invoke();
                x4c.g("NfcProductWidget in dashboard is null", null, null, null, 14);
                n70Var.W(new ns3(n70Var, 6));
                return zy11Var2;
            case 25:
                jmg jmgVar = (jmg) obj;
                com.ybsdk.rconfig.b bVar2 = ((tv3) ((ha60) obj3)).a;
                if (jmgVar instanceof img) {
                    String str3 = ((img) jmgVar).a;
                    nfcSupportChecker$Status = jl40.l(str3, "split") ? NfcSupportChecker$Status.SPLIT_PROMO : jl40.l(str3, "corp_card") ? ((CommonFeatureFlag) bVar2.d(wlp.l0).getData()).isEnabled() ? NfcSupportChecker$Status.FULL : NfcSupportChecker$Status.NONE : NfcSupportChecker$Status.FULL;
                } else {
                    if (!(jmgVar instanceof hmg)) {
                        w511.b();
                        return null;
                    }
                    nfcSupportChecker$Status = ((CommonFeatureFlag) bVar2.d(wlp.m0).getData()).isEnabled() ? NfcSupportChecker$Status.FULL : NfcSupportChecker$Status.NONE;
                }
                int i4 = qlg.a[nfcSupportChecker$Status.ordinal()];
                if (i4 != 1 && i4 != 2 && i4 != 3) {
                    w511.b();
                }
                return null;
            case 26:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new dke(15, n70Var2, (mjg) obj3));
                return zy11Var2;
            case 27:
                ((f3h) obj3).a.c((pv0) obj);
                return zy11Var2;
            case 28:
                mnq0 mnq0Var = (mnq0) obj;
                int i5 = p8h.a[((CheckState) obj3).ordinal()];
                if (i5 == 1) {
                    toggleableState = ToggleableState.On;
                } else if (i5 == 2) {
                    toggleableState = ToggleableState.Off;
                } else {
                    if (i5 != 3) {
                        w511.b();
                        return null;
                    }
                    toggleableState = ToggleableState.Indeterminate;
                }
                f.u(mnq0Var, toggleableState);
                return zy11Var2;
            default:
                PlusPaySdkAdapter$CompositeOffer.Vendor vendor = (PlusPaySdkAdapter$CompositeOffer.Vendor) obj3;
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer = (PlusPaySdkAdapter$CompositeOffer) next;
                        if (plusPaySdkAdapter$CompositeOffer.getTariffOffer() != null) {
                            PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer = plusPaySdkAdapter$CompositeOffer.getTariffOffer();
                            if ((tariffOffer != null ? tariffOffer.getVendor() : null) != vendor) {
                                z = false;
                                optionOffers = plusPaySdkAdapter$CompositeOffer.getOptionOffers();
                                if ((optionOffers instanceof Collection) || !optionOffers.isEmpty()) {
                                    it = optionOffers.iterator();
                                    while (it.hasNext()) {
                                        if (((PlusPaySdkAdapter$CompositeOffer.Option) it.next()).getVendor() != vendor) {
                                            z2 = false;
                                            if (z && z2) {
                                                obj2 = next;
                                            }
                                        }
                                    }
                                }
                                z2 = true;
                                if (z) {
                                }
                            }
                        }
                        z = true;
                        optionOffers = plusPaySdkAdapter$CompositeOffer.getOptionOffers();
                        if (optionOffers instanceof Collection) {
                        }
                        it = optionOffers.iterator();
                        while (it.hasNext()) {
                        }
                        z2 = true;
                        if (z) {
                        }
                    }
                }
                PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer2 = (PlusPaySdkAdapter$CompositeOffer) obj2;
                return plusPaySdkAdapter$CompositeOffer2 != null ? Collections.singletonList(plusPaySdkAdapter$CompositeOffer2) : EmptyList.a;
        }
    }

    public /* synthetic */ dye(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ dye(g gVar, PlusPaySdkAdapter$CompositeOffer.Vendor vendor) {
        this.a = 29;
        this.b = vendor;
    }
}
