package com.yandex.go.payments.mbank.navigation;

import com.yandex.go.payments.addmethod.data.model.AddPaymentJsonMessage;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import defpackage.ef0;
import defpackage.ff41;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.jst;
import defpackage.qcx;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ b a;
    public final /* synthetic */ WebviewBindingFlow b;
    public final /* synthetic */ ff41 c;

    public /* synthetic */ a(b bVar, WebviewBindingFlow webviewBindingFlow, ff41 ff41Var) {
        this.a = bVar;
        this.b = webviewBindingFlow;
        this.c = ff41Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i;
        WebviewBindingFlow.PaymentMethodBindResponseSignal paymentMethodBindResponseSignal;
        boolean z;
        LinkedHashMap linkedHashMap;
        b bVar = this.a;
        AddPaymentJsonMessage addPaymentJsonMessage = (AddPaymentJsonMessage) ((xnt) bVar.E).c((String) obj, AddPaymentJsonMessage.Companion.serializer());
        WebviewBindingFlow webviewBindingFlow = this.b;
        List list = webviewBindingFlow.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            WebviewBindingFlow.PaymentMethodBindResponseSignal paymentMethodBindResponseSignal2 = (WebviewBindingFlow.PaymentMethodBindResponseSignal) obj2;
            if (jl40.l(paymentMethodBindResponseSignal2.a, addPaymentJsonMessage.a) && paymentMethodBindResponseSignal2.b.a != WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.UNKNOWN) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            paymentMethodBindResponseSignal = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                WebviewBindingFlow.PaymentMethodBindResponseSignal paymentMethodBindResponseSignal3 = (WebviewBindingFlow.PaymentMethodBindResponseSignal) next;
                List list2 = paymentMethodBindResponseSignal3.c;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (!addPaymentJsonMessage.b.containsKey(((WebviewBindingFlow.PaymentMethodBindResponseSignalParam) it2.next()).a)) {
                            break;
                        }
                    }
                }
                List<WebviewBindingFlow.PaymentMethodBindResponseSignalParam> list3 = paymentMethodBindResponseSignal3.c;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (WebviewBindingFlow.PaymentMethodBindResponseSignalParam paymentMethodBindResponseSignalParam : list3) {
                        try {
                            String str = paymentMethodBindResponseSignalParam.c;
                            if (str == null) {
                                z = true;
                            } else {
                                kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) addPaymentJsonMessage.b.get(paymentMethodBindResponseSignalParam.a);
                                z = jl40.l(bVar2 != null ? qcx.g(qcx.n(bVar2)) : null, str);
                            }
                        } catch (Exception unused) {
                            z = false;
                        }
                        if (!z) {
                            break;
                        }
                    }
                }
                arrayList2.add(next);
            }
            Iterator it3 = arrayList2.iterator();
            paymentMethodBindResponseSignal = null;
            while (it3.hasNext()) {
                WebviewBindingFlow.PaymentMethodBindResponseSignal paymentMethodBindResponseSignal4 = (WebviewBindingFlow.PaymentMethodBindResponseSignal) it3.next();
                int size = paymentMethodBindResponseSignal4.c.size();
                if (paymentMethodBindResponseSignal == null || i < size) {
                    paymentMethodBindResponseSignal = paymentMethodBindResponseSignal4;
                    i = size;
                }
            }
        }
        if (paymentMethodBindResponseSignal != null) {
            WebviewBindingFlow.PaymentMethodBindResponseSignalAction paymentMethodBindResponseSignalAction = paymentMethodBindResponseSignal.b;
            List list4 = paymentMethodBindResponseSignal.c;
            int d = gw00.d(tcc.n(list4, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                String str2 = ((WebviewBindingFlow.PaymentMethodBindResponseSignalParam) it4.next()).a;
                try {
                    linkedHashMap2.put(str2, qcx.n((kotlinx.serialization.json.b) addPaymentJsonMessage.b.get(str2)).a());
                } catch (Exception unused2) {
                    linkedHashMap = null;
                }
            }
            linkedHashMap = linkedHashMap2;
            if (linkedHashMap != null) {
                int i2 = ef0.a[paymentMethodBindResponseSignalAction.a.ordinal()];
                ff41 ff41Var = this.c;
                switch (i2) {
                    case 1:
                        tje.N(bVar.o(), null, null, new AddMBankAccountBaseRouter$openExternalUrl$1(bVar, paymentMethodBindResponseSignal, linkedHashMap, null), 3);
                        break;
                    case 2:
                        tje.N(bVar.o(), null, null, new AddMBankAccountBaseRouter$openOtp$1(bVar, null), 3);
                        break;
                    case 3:
                        tje.N(bVar.o(), null, null, new AddMBankAccountBaseRouter$otpSuccess$1(bVar, paymentMethodBindResponseSignal, linkedHashMap, webviewBindingFlow, null), 3);
                        break;
                    case 4:
                        tje.N(bVar.o(), null, null, new AddMBankAccountBaseRouter$otpFailed$1(bVar, null), 3);
                        break;
                    case 5:
                        b.R(bVar, webviewBindingFlow, new AddMBankAccountBaseRouter$bindingSuccess$1(bVar, ff41Var, paymentMethodBindResponseSignal, linkedHashMap, webviewBindingFlow, null), 2);
                        break;
                    case 6:
                        tje.N(bVar.o(), null, null, new AddMBankAccountBaseRouter$webViewLoaded$1(bVar, null), 3);
                        break;
                    case 7:
                        b.R(bVar, webviewBindingFlow, new AddMBankAccountBaseRouter$bindingFailed$1(bVar, ff41Var, null), 2);
                        break;
                    case 8:
                        WebviewBindingFlow.SignalParamPayload signalParamPayload = paymentMethodBindResponseSignalAction.b;
                        tje.N(bVar.o(), null, null, new AddMBankAccountBaseRouter$withSpinner$1(webviewBindingFlow, bVar, new AddMBankAccountBaseRouter$showErrorMessage$1(bVar, ff41Var, null), signalParamPayload != null ? signalParamPayload.a : null, null), 3);
                        break;
                    default:
                        jst.e.c("AddMBankAccount parse unknown signal action");
                        break;
                }
            }
        }
        return zy11.a;
    }
}
