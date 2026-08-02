package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common;

import android.content.Context;
import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.bad0;
import defpackage.c7a0;
import defpackage.d7a0;
import defpackage.dio;
import defpackage.eu90;
import defpackage.fv5;
import defpackage.g8e;
import defpackage.gio;
import defpackage.hj;
import defpackage.hv5;
import defpackage.ind0;
import defpackage.kaa0;
import defpackage.kv5;
import defpackage.lj;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.ofd0;
import defpackage.ohd0;
import defpackage.old0;
import defpackage.pgz;
import defpackage.sqx0;
import defpackage.tcc;
import defpackage.tpd;
import defpackage.w511;
import defpackage.xvz;
import defpackage.xz4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a implements fv5, hv5 {
    public final bad0 a;
    public final kaa0 b;
    public final pgz c;
    public final c7a0 d;
    public final n4u0 e;

    public a(bad0 bad0Var, kaa0 kaa0Var, pgz pgzVar, c7a0 c7a0Var, r0 r0Var) {
        this.a = bad0Var;
        this.b = kaa0Var;
        this.c = pgzVar;
        this.d = c7a0Var;
        this.e = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(old0 old0Var, ContinuationImpl continuationImpl) {
        BindPaymentMethodInteractor$awaitPaymentMethod$1 bindPaymentMethodInteractor$awaitPaymentMethod$1;
        int i;
        boolean z;
        String str;
        if (continuationImpl instanceof BindPaymentMethodInteractor$awaitPaymentMethod$1) {
            bindPaymentMethodInteractor$awaitPaymentMethod$1 = (BindPaymentMethodInteractor$awaitPaymentMethod$1) continuationImpl;
            int i2 = bindPaymentMethodInteractor$awaitPaymentMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bindPaymentMethodInteractor$awaitPaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bindPaymentMethodInteractor$awaitPaymentMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bindPaymentMethodInteractor$awaitPaymentMethod$1.label;
                int i3 = 0;
                c7a0 c7a0Var = this.d;
                if (i != 0) {
                    b.b(obj);
                    d7a0 d7a0Var = (d7a0) c7a0Var;
                    ind0 a = d7a0Var.a.a();
                    PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
                    eu90 eu90Var = d7a0Var.b;
                    String d = dio.d(a.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String str2 = id == null ? "no_value" : id;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
                    ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    eu90Var.d(d, str2, arrayList, false, EmptyList.a);
                    ofd0 ofd0Var = d7a0Var.c;
                    PlusPayCompositeOffers.Offer offer = plusTarifficatorPurchase.getOffer();
                    gio gioVar = ((sqx0) ofd0Var).a;
                    String sessionId = offer.getMeta().getSessionId();
                    gioVar.getClass();
                    LinkedHashMap x = g8e.x("session_id", sessionId);
                    x.put("_meta", gio.a(new HashMap()));
                    gioVar.e("PlusPayment.Step.CardSelecting.Start", x);
                    kv5 kv5Var = new kv5(i3, this);
                    bindPaymentMethodInteractor$awaitPaymentMethod$1.L$0 = null;
                    bindPaymentMethodInteractor$awaitPaymentMethod$1.label = 1;
                    obj = com.yandex.plus.core.data.pay.b.a(old0Var, kv5Var, bindPaymentMethodInteractor$awaitPaymentMethod$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                PlusSelectPaymentMethodState.Terminal terminal = (PlusSelectPaymentMethodState.Terminal) obj;
                z = terminal instanceof PlusSelectPaymentMethodState.Success;
                pgz pgzVar = this.c;
                if (!z) {
                    LogPriority logPriority = LogPriority.INFO;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.Success");
                    }
                    PlusSelectPaymentMethodState.Success success = (PlusSelectPaymentMethodState.Success) terminal;
                    String selectButtonText = success.getSelectButtonText();
                    String id2 = success.getPaymentMethod().getId();
                    d7a0 d7a0Var2 = (d7a0) c7a0Var;
                    ind0 a2 = d7a0Var2.a.a();
                    PlusTarifficatorPurchase plusTarifficatorPurchase2 = a2.b;
                    eu90 eu90Var2 = d7a0Var2.b;
                    String d2 = dio.d(a2.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusTarifficatorPurchase2.getOffer().getTariffOffer();
                    String id3 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                    String str3 = id3 == null ? "no_value" : id3;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusTarifficatorPurchase2.getOffer().getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
                    Iterator<T> it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    str = id2 != null ? id2 : "no_value";
                    LinkedHashMap t = xvz.t(eu90Var2, "purchase_session_id", d2, "product_id", str3);
                    xvz.A(t, "options_id", arrayList2, true, "is_tarifficator");
                    t.put("card_linked", String.valueOf(false));
                    t.put("payment_method_id", str);
                    t.put("button_text", selectButtonText);
                    t.put("paying_with_new_card", String.valueOf(false));
                    t.put("_meta", eu90.c(new HashMap()));
                    eu90Var2.f("PaymentMethods.ContinueButton.Clicked", t);
                    ((sqx0) d7a0Var2.c).a(plusTarifficatorPurchase2.getOffer());
                    return success.getPaymentMethod();
                }
                if (!(terminal instanceof PlusSelectPaymentMethodState.Error)) {
                    if (!(terminal instanceof PlusSelectPaymentMethodState.Cancel)) {
                        w511.b();
                        return null;
                    }
                    LogPriority logPriority2 = LogPriority.INFO;
                    if (pgzVar.e(logPriority2)) {
                        pgzVar.a(logPriority2, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.Cancel");
                    }
                    d7a0 d7a0Var3 = (d7a0) c7a0Var;
                    ind0 a3 = d7a0Var3.a.a();
                    PlusTarifficatorPurchase plusTarifficatorPurchase3 = a3.b;
                    eu90 eu90Var3 = d7a0Var3.b;
                    String d3 = dio.d(a3.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = plusTarifficatorPurchase3.getOffer().getTariffOffer();
                    String id4 = tariffOffer3 != null ? tariffOffer3.getId() : null;
                    str = id4 != null ? id4 : "no_value";
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = plusTarifficatorPurchase3.getOffer().getOptionOffers();
                    ArrayList arrayList3 = new ArrayList(tcc.n(optionOffers3, 10));
                    Iterator<T> it3 = optionOffers3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    LinkedHashMap t2 = xvz.t(eu90Var3, "purchase_session_id", d3, "product_id", str);
                    xvz.A(t2, "options_id", arrayList3, true, "is_tarifficator");
                    t2.put("card_linked", String.valueOf(false));
                    t2.put("_meta", eu90.c(new HashMap()));
                    eu90Var3.f("PaymentMethods.Cancelled", t2);
                    ((sqx0) d7a0Var3.c).a(plusTarifficatorPurchase3.getOffer());
                    return null;
                }
                LogPriority logPriority3 = LogPriority.ERROR;
                if (pgzVar.e(logPriority3)) {
                    pgzVar.a(logPriority3, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.Error - " + ((PlusSelectPaymentMethodState.Error) terminal).getKind());
                }
                PlusSelectPaymentMethodState.Error error = (PlusSelectPaymentMethodState.Error) terminal;
                d7a0 d7a0Var4 = (d7a0) c7a0Var;
                ind0 a4 = d7a0Var4.a.a();
                PlusTarifficatorPurchase plusTarifficatorPurchase4 = a4.b;
                xz4 b = dio.b(plusTarifficatorPurchase4.getSource(), a4.d);
                PlusTarifficatorPurchase c = a4.c();
                PayUIEvgenAnalytics$PaymentOption a5 = dio.a(plusTarifficatorPurchase4.getOffer());
                if (a5 != null) {
                    eu90 eu90Var4 = d7a0Var4.b;
                    String d4 = dio.d(a4.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = plusTarifficatorPurchase4.getOffer().getTariffOffer();
                    String id5 = tariffOffer4 != null ? tariffOffer4.getId() : null;
                    String str4 = id5 == null ? "no_value" : id5;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = plusTarifficatorPurchase4.getOffer().getOptionOffers();
                    ArrayList arrayList4 = new ArrayList(tcc.n(optionOffers4, 10));
                    Iterator<T> it4 = optionOffers4.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((PlusPayCompositeOffers.Offer.Option) it4.next()).getId());
                    }
                    String c2 = dio.c(new PlusPaymentFlowErrorReason.PaymentMethodSelection(error));
                    String str5 = (String) b.a;
                    String str6 = str5 == null ? "no_value" : str5;
                    String str7 = (String) b.b;
                    eu90Var4.e(d4, str4, arrayList4, a5, "no_value", c2, str7 == null ? "no_value" : str7, str6, dio.e(plusTarifficatorPurchase4.getSource()), c.getType() == PlusTarifficatorPurchase.Type.SILENT);
                }
                ((sqx0) d7a0Var4.c).a(plusTarifficatorPurchase4.getOffer());
                return null;
            }
        }
        bindPaymentMethodInteractor$awaitPaymentMethod$1 = new BindPaymentMethodInteractor$awaitPaymentMethod$1(this, continuationImpl);
        Object obj2 = bindPaymentMethodInteractor$awaitPaymentMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bindPaymentMethodInteractor$awaitPaymentMethod$1.label;
        int i32 = 0;
        c7a0 c7a0Var2 = this.d;
        if (i != 0) {
        }
        PlusSelectPaymentMethodState.Terminal terminal2 = (PlusSelectPaymentMethodState.Terminal) obj2;
        z = terminal2 instanceof PlusSelectPaymentMethodState.Success;
        pgz pgzVar2 = this.c;
        if (!z) {
        }
    }

    public final Object b(PlusTarifficatorPurchase plusTarifficatorPurchase, Continuation continuation) {
        Context a = this.a.a();
        lj ljVar = (lj) this.e.getValue();
        Long id = ljVar.getId();
        String authToken = ljVar.getAuthToken();
        hj hjVar = ljVar instanceof hj ? (hj) ljVar : null;
        ohd0 ohd0Var = new ohd0(id, authToken, hjVar != null ? hjVar.d : null);
        String a2 = tpd.a(plusTarifficatorPurchase.getOffer());
        PlusPayCompositeOfferDetails offerDetails = plusTarifficatorPurchase.getOfferDetails();
        String posId = offerDetails != null ? offerDetails.getPosId() : null;
        PlusPayCompositeOfferDetails offerDetails2 = plusTarifficatorPurchase.getOfferDetails();
        String serviceToken = offerDetails2 != null ? offerDetails2.getServiceToken() : null;
        kaa0 kaa0Var = this.b;
        return a(new com.yandex.plus.paymentsdk.internal.method.card.a(kaa0Var.a, a, ohd0Var, a2, posId, serviceToken, kaa0Var.b, kaa0Var.c), (ContinuationImpl) continuation);
    }
}
