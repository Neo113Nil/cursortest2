package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.bvf0;
import defpackage.cpd0;
import defpackage.dio;
import defpackage.ds31;
import defpackage.ec31;
import defpackage.eu90;
import defpackage.ftb;
import defpackage.g7t;
import defpackage.g8e;
import defpackage.gio;
import defpackage.gxm;
import defpackage.h7t;
import defpackage.hzk;
import defpackage.ind0;
import defpackage.jnd0;
import defpackage.knd0;
import defpackage.lnd0;
import defpackage.mnd0;
import defpackage.mz90;
import defpackage.nnd0;
import defpackage.ny61;
import defpackage.omm0;
import defpackage.oz90;
import defpackage.rao;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ufd0;
import defpackage.v9o;
import defpackage.vqx0;
import defpackage.w511;
import defpackage.xvz;
import defpackage.yr31;
import defpackage.zyh0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a extends yr31 {
    public final omm0 A;
    public final ftb B;
    public final ec31 C;
    public final oz90 D;
    public final r0 E;
    public final r0 F;
    public final jnd0 b;
    public final nnd0 c;
    public final com.yandex.plus.pay.ui.core.api.domain.a w;
    public final cpd0 x;
    public final lnd0 y;
    public final hzk z;

    public a(jnd0 jnd0Var, g7t g7tVar, nnd0 nnd0Var, com.yandex.plus.pay.ui.core.api.domain.a aVar, cpd0 cpd0Var, lnd0 lnd0Var, hzk hzkVar, omm0 omm0Var, ftb ftbVar, ec31 ec31Var) {
        this.b = jnd0Var;
        this.c = nnd0Var;
        this.w = aVar;
        this.x = cpd0Var;
        this.y = lnd0Var;
        this.z = hzkVar;
        this.A = omm0Var;
        this.B = ftbVar;
        this.C = ec31Var;
        knd0 knd0Var = jnd0Var.a;
        this.D = ((h7t) g7tVar).a(knd0Var.a());
        r0 c = bvf0.c(v9o.a);
        this.E = c;
        this.F = c;
        ind0 a = knd0Var.a();
        mnd0 mnd0Var = (mnd0) lnd0Var;
        PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
        PlusTarifficatorPurchase c2 = a.c();
        PayUIEvgenAnalytics$PaymentOption a2 = dio.a(c2.getOffer());
        String paymentMethodId = c2.getPaymentMethodId();
        if (a2 != null) {
            eu90 eu90Var = mnd0Var.a;
            String d = dio.d(a.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            id = id == null ? "no_value" : id;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
            ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            paymentMethodId = paymentMethodId == null ? "no_value" : paymentMethodId;
            boolean z = c2.getType() == PlusTarifficatorPurchase.Type.SILENT;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
            xvz.x(a2, t, "payment_option", "payment_method_id", paymentMethodId);
            t.put("silent", String.valueOf(z));
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("PaymentProcess.ErrorScreen.Shown", t);
        }
        ufd0 ufd0Var = mnd0Var.b;
        PlusPayCompositeOffers.Offer offer = plusTarifficatorPurchase.getOffer();
        gio gioVar = ((vqx0) ufd0Var).a;
        String sessionId = offer.getMeta().getSessionId();
        gioVar.getClass();
        LinkedHashMap x = g8e.x("session_id", sessionId);
        x.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Step.Error.Start", x);
        tje.N(ds31.a(this), null, null, new ErrorViewModel$1(this, a, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r1 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(a aVar, ind0 ind0Var, ContinuationImpl continuationImpl) {
        ErrorViewModel$createSupportText$1 errorViewModel$createSupportText$1;
        int i;
        ind0 ind0Var2;
        String str;
        omm0 omm0Var = aVar.A;
        if (continuationImpl instanceof ErrorViewModel$createSupportText$1) {
            errorViewModel$createSupportText$1 = (ErrorViewModel$createSupportText$1) continuationImpl;
            int i2 = errorViewModel$createSupportText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                errorViewModel$createSupportText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = errorViewModel$createSupportText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = errorViewModel$createSupportText$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!((Boolean) aVar.C.invoke()).booleanValue()) {
                        return null;
                    }
                    aVar.c.getClass();
                    com.yandex.plus.pay.ui.core.api.domain.a aVar2 = aVar.w;
                    ind0Var2 = ind0Var;
                    errorViewModel$createSupportText$1.L$0 = ind0Var2;
                    str = "https://yandex.ru/chat/#/user/80027008-e39a-986b-5f64-822d65ab117c";
                    errorViewModel$createSupportText$1.L$1 = "https://yandex.ru/chat/#/user/80027008-e39a-986b-5f64-822d65ab117c";
                    errorViewModel$createSupportText$1.label = 1;
                    obj = aVar2.a("https://yandex.ru/chat/#/user/80027008-e39a-986b-5f64-822d65ab117c", errorViewModel$createSupportText$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    String str2 = (String) errorViewModel$createSupportText$1.L$1;
                    ind0 ind0Var3 = (ind0) errorViewModel$createSupportText$1.L$0;
                    b.b(obj);
                    str = str2;
                    ind0Var2 = ind0Var3;
                }
                PlusPayRichText plusPayRichText = new PlusPayRichText(omm0Var.b(zyh0.PlusPay_Error_Support, "{{LINK}}"), Collections.singletonList(new PlusPayRichText.Item.Link((String) null, "LINK", omm0Var.a(zyh0.PlusPay_Error_Support_LinkText), (String) obj, 1, (DefaultConstructorMarker) null)));
                cpd0 cpd0Var = aVar.x;
                gxm gxmVar = new gxm(5, aVar, ind0Var2, str);
                errorViewModel$createSupportText$1.L$0 = null;
                errorViewModel$createSupportText$1.L$1 = null;
                errorViewModel$createSupportText$1.L$2 = null;
                errorViewModel$createSupportText$1.L$3 = null;
                errorViewModel$createSupportText$1.label = 2;
                Object a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) cpd0Var).a(plusPayRichText, gxmVar, errorViewModel$createSupportText$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        errorViewModel$createSupportText$1 = new ErrorViewModel$createSupportText$1(aVar, continuationImpl);
        Object obj2 = errorViewModel$createSupportText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = errorViewModel$createSupportText$1.label;
        if (i != 0) {
        }
        PlusPayRichText plusPayRichText2 = new PlusPayRichText(omm0Var.b(zyh0.PlusPay_Error_Support, "{{LINK}}"), Collections.singletonList(new PlusPayRichText.Item.Link((String) null, "LINK", omm0Var.a(zyh0.PlusPay_Error_Support_LinkText), (String) obj2, 1, (DefaultConstructorMarker) null)));
        cpd0 cpd0Var2 = aVar.x;
        gxm gxmVar2 = new gxm(5, aVar, ind0Var2, str);
        errorViewModel$createSupportText$1.L$0 = null;
        errorViewModel$createSupportText$1.L$1 = null;
        errorViewModel$createSupportText$1.L$2 = null;
        errorViewModel$createSupportText$1.L$3 = null;
        errorViewModel$createSupportText$1.label = 2;
        Object a2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a) cpd0Var2).a(plusPayRichText2, gxmVar2, errorViewModel$createSupportText$1);
        if (a2 != coroutineSingletons2) {
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        ind0 a = this.b.a.a();
        ufd0 ufd0Var = ((mnd0) this.y).b;
        PlusPayCompositeOffers.Offer offer = a.b.getOffer();
        gio gioVar = ((vqx0) ufd0Var).a;
        String sessionId = offer.getMeta().getSessionId();
        gioVar.getClass();
        LinkedHashMap x = g8e.x("session_id", sessionId);
        x.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Step.Error.Stop", x);
    }

    public final void X(mz90 mz90Var) {
        ind0 a = this.b.a.a();
        String str = mz90Var.a;
        mnd0 mnd0Var = (mnd0) this.y;
        mnd0Var.getClass();
        PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
        PlusTarifficatorPurchase c = a.c();
        PayUIEvgenAnalytics$PaymentOption a2 = dio.a(c.getOffer());
        String paymentMethodId = c.getPaymentMethodId();
        if (a2 != null) {
            eu90 eu90Var = mnd0Var.a;
            String d = dio.d(a.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            if (id == null) {
                id = "no_value";
            }
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
            ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            if (paymentMethodId == null) {
                paymentMethodId = "no_value";
            }
            boolean z = c.getType() == PlusTarifficatorPurchase.Type.SILENT;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
            xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
            xvz.x(a2, t, "payment_option", "payment_method_id", paymentMethodId);
            t.put("button_text", str);
            t.put("silent", String.valueOf(z));
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("PaymentProcess.ErrorScreen.ContinueButton.Clicked", t);
        }
        int i = rao.a[mz90Var.b.ordinal()];
        ftb ftbVar = this.B;
        if (i == 1) {
            ftbVar.a();
        } else if (i == 2 || i == 3) {
            ftbVar.b();
        } else {
            w511.b();
        }
    }
}
