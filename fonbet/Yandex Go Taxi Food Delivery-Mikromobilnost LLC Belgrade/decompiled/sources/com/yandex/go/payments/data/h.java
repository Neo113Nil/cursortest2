package com.yandex.go.payments.data;

import com.yandex.go.payments.data.model.ListPaymentMethodsParams;
import com.yandex.go.payments.data.model.ListPaymentMethodsResponse;
import com.yandex.go.payments.data.model.PaymentsBindingInProgress;
import com.yandex.go.payments.data.model.response.ListPaymentMethodsUiDto;
import defpackage.bei;
import defpackage.brg;
import defpackage.bvu0;
import defpackage.cmt;
import defpackage.dc7;
import defpackage.ec7;
import defpackage.evu0;
import defpackage.fc7;
import defpackage.fmt;
import defpackage.fty;
import defpackage.jl40;
import defpackage.l76;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.scc;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.CacheStatus;

/* loaded from: classes13.dex */
public final class h {
    public final String a;
    public final PaymentsApi b;
    public final com.yandex.go.payments.domain.m c;
    public final fc7 d;
    public final c e;

    public h(String str, PaymentsApi paymentsApi, com.yandex.go.payments.domain.m mVar, fc7 fc7Var, c cVar) {
        this.a = str;
        this.b = paymentsApi;
        this.c = mVar;
        this.d = fc7Var;
        this.e = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x010a, code lost:
    
        if (r10.c.a(r12, r0) != r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x008b, code lost:
    
        if (r13 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, String str, ContinuationImpl continuationImpl) {
        PaymentRepositoryImpl$listPaymentMethods$1 paymentRepositoryImpl$listPaymentMethods$1;
        int i;
        fmt fmtVar;
        boolean isEmpty;
        c cVar;
        ListPaymentMethodsUiDto listPaymentMethodsUiDto;
        List list;
        String str2;
        Integer l;
        Date a;
        if (continuationImpl instanceof PaymentRepositoryImpl$listPaymentMethods$1) {
            paymentRepositoryImpl$listPaymentMethods$1 = (PaymentRepositoryImpl$listPaymentMethods$1) continuationImpl;
            int i2 = paymentRepositoryImpl$listPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentRepositoryImpl$listPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentRepositoryImpl$listPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRepositoryImpl$listPaymentMethods$1.label;
                String str3 = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(str, "no_feature")) {
                        str = null;
                    }
                    cmt<ListPaymentMethodsResponse> b = this.b.b(str3, str, new ListPaymentMethodsParams(jl40.l(zzsVar, zzs.f) ? null : scc.g(Double.valueOf(zzsVar.b), Double.valueOf(zzsVar.a)), 2));
                    paymentRepositoryImpl$listPaymentMethods$1.L$0 = null;
                    paymentRepositoryImpl$listPaymentMethods$1.L$1 = null;
                    paymentRepositoryImpl$listPaymentMethods$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(b, null, paymentRepositoryImpl$listPaymentMethods$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fmtVar = (fmt) paymentRepositoryImpl$listPaymentMethods$1.L$2;
                        kotlin.b.b(obj);
                        String a2 = fmtVar.e.a("Date");
                        long time = (a2 == null || (a = brg.a(a2)) == null) ? 0L : a.getTime() - System.currentTimeMillis();
                        ListPaymentMethodsResponse listPaymentMethodsResponse = (ListPaymentMethodsResponse) fmtVar.a;
                        oeu oeuVar = fmtVar.e;
                        this.d.getClass();
                        ec7 ec7Var = bei.z;
                        String a3 = oeuVar.a("cache-policy");
                        if (a3 != null) {
                            int hashCode = a3.hashCode();
                            if (hashCode != 3744684) {
                                if (hashCode != 288459765) {
                                    if (hashCode == 978455428) {
                                        a3.equals(CacheStatus.SERIAL_NO_CACHE);
                                    }
                                } else if (a3.equals("distance")) {
                                    String a4 = oeuVar.a("cache-policy-value");
                                    ec7Var = new dc7((a4 == null || (l = bvu0.l(10, a4)) == null) ? 0 : l.intValue());
                                }
                            } else if (a3.equals("zone")) {
                                ec7Var = l76.y;
                            }
                        }
                        return new fty(listPaymentMethodsResponse, time, ec7Var);
                    }
                    kotlin.b.b(obj);
                }
                fmtVar = (fmt) obj;
                ListPaymentMethodsResponse listPaymentMethodsResponse2 = (ListPaymentMethodsResponse) fmtVar.a;
                List list2 = listPaymentMethodsResponse2.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    PaymentsBindingInProgress paymentsBindingInProgress = (PaymentsBindingInProgress) obj2;
                    if (paymentsBindingInProgress.b != null && (!evu0.J(r9)) && (str2 = paymentsBindingInProgress.a) != null && (!evu0.J(str2))) {
                        arrayList.add(obj2);
                    }
                }
                isEmpty = arrayList.isEmpty();
                cVar = this.e;
                if (!isEmpty) {
                    cVar.d = str3;
                    r0 r0Var = cVar.c;
                    r0Var.getClass();
                    r0Var.m(null, arrayList);
                }
                listPaymentMethodsUiDto = listPaymentMethodsResponse2.d;
                if (listPaymentMethodsUiDto != null && (list = listPaymentMethodsUiDto.c) != null) {
                    cVar.getClass();
                    if (!list.isEmpty()) {
                        r0 r0Var2 = cVar.b;
                        r0Var2.getClass();
                        r0Var2.m(null, list);
                    }
                }
                String str4 = ((ListPaymentMethodsResponse) fmtVar.a).h;
                paymentRepositoryImpl$listPaymentMethods$1.L$0 = null;
                paymentRepositoryImpl$listPaymentMethods$1.L$1 = null;
                paymentRepositoryImpl$listPaymentMethods$1.L$2 = fmtVar;
                paymentRepositoryImpl$listPaymentMethods$1.label = 2;
            }
        }
        paymentRepositoryImpl$listPaymentMethods$1 = new PaymentRepositoryImpl$listPaymentMethods$1(this, continuationImpl);
        Object obj3 = paymentRepositoryImpl$listPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRepositoryImpl$listPaymentMethods$1.label;
        String str32 = this.a;
        if (i != 0) {
        }
        fmtVar = (fmt) obj3;
        ListPaymentMethodsResponse listPaymentMethodsResponse22 = (ListPaymentMethodsResponse) fmtVar.a;
        List list22 = listPaymentMethodsResponse22.c;
        ArrayList arrayList2 = new ArrayList();
        while (r13.hasNext()) {
        }
        isEmpty = arrayList2.isEmpty();
        cVar = this.e;
        if (!isEmpty) {
        }
        listPaymentMethodsUiDto = listPaymentMethodsResponse22.d;
        if (listPaymentMethodsUiDto != null) {
            cVar.getClass();
            if (!list.isEmpty()) {
            }
        }
        String str42 = ((ListPaymentMethodsResponse) fmtVar.a).h;
        paymentRepositoryImpl$listPaymentMethods$1.L$0 = null;
        paymentRepositoryImpl$listPaymentMethods$1.L$1 = null;
        paymentRepositoryImpl$listPaymentMethods$1.L$2 = fmtVar;
        paymentRepositoryImpl$listPaymentMethods$1.label = 2;
    }
}
