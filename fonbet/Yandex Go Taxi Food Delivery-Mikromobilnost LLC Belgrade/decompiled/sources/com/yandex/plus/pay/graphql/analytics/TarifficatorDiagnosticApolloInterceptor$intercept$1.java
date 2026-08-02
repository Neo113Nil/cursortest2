package com.yandex.plus.pay.graphql.analytics;

import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.core.graphql.type.INVOICE_STATUS;
import defpackage.auu0;
import defpackage.bt90;
import defpackage.cu60;
import defpackage.cyw;
import defpackage.fc70;
import defpackage.fu60;
import defpackage.g8e;
import defpackage.gmd;
import defpackage.gw00;
import defpackage.k8u;
import defpackage.lmd;
import defpackage.lxw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omd;
import defpackage.qke;
import defpackage.qmd;
import defpackage.rmd;
import defpackage.sbx;
import defpackage.t5f;
import defpackage.to2;
import defpackage.uqx0;
import defpackage.vo2;
import defpackage.wls;
import defpackage.xlp0;
import defpackage.xmd;
import defpackage.y5e;
import defpackage.ymd;
import defpackage.za70;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lza70;", CA20Status.STATUS_REQUEST_D, "Lvo2;", "response", "Lzy11;", "<anonymous>", "(Lvo2;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.graphql.analytics.TarifficatorDiagnosticApolloInterceptor$intercept$1", f = "TarifficatorDiagnosticApolloInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TarifficatorDiagnosticApolloInterceptor$intercept$1 extends SuspendLambda implements wls {
    final /* synthetic */ to2 $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorDiagnosticApolloInterceptor$intercept$1(b bVar, to2 to2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$request = to2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TarifficatorDiagnosticApolloInterceptor$intercept$1 tarifficatorDiagnosticApolloInterceptor$intercept$1 = new TarifficatorDiagnosticApolloInterceptor$intercept$1(this.this$0, this.$request, continuation);
        tarifficatorDiagnosticApolloInterceptor$intercept$1.L$0 = obj;
        return tarifficatorDiagnosticApolloInterceptor$intercept$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TarifficatorDiagnosticApolloInterceptor$intercept$1 tarifficatorDiagnosticApolloInterceptor$intercept$1 = (TarifficatorDiagnosticApolloInterceptor$intercept$1) create((vo2) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tarifficatorDiagnosticApolloInterceptor$intercept$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String obj2;
        String name;
        omd omdVar;
        rmd b;
        ArrayList<lmd> arrayList;
        vo2 vo2Var = (vo2) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (y5e.s(vo2Var) == null) {
            b bVar = this.this$0;
            List p = y5e.p(vo2Var);
            String r = p != null ? y5e.r(p) : null;
            fc70 fc70Var = this.$request.a;
            uqx0 uqx0Var = bVar.a;
            za70 za70Var = vo2Var.c;
            String name2 = fc70Var.name();
            switch (name2.hashCode()) {
                case -1935925833:
                    if (name2.equals("Offers") && (za70Var instanceof cu60) && (fc70Var instanceof fu60)) {
                        fu60 fu60Var = (fu60) fc70Var;
                        if (((cu60) za70Var).a().a().isEmpty()) {
                            String d = fu60Var.d();
                            String c = fu60Var.c();
                            bt90 bt90Var = uqx0Var.a;
                            if (r == null) {
                                r = "no_value";
                            }
                            LinkedHashMap y = g8e.y("requestId", r, "additionalData", "no_value");
                            y.put("target", d);
                            y.put(CRLReasonCodeExtension.REASON, c);
                            y.put("_meta", bt90.b(new HashMap()));
                            bt90Var.c("Error.Subscription.Tarifficator.Offers.EmptyList", y);
                            break;
                        }
                    }
                    break;
                case -670115059:
                    if (name2.equals("Invoice") && (za70Var instanceof cyw)) {
                        List p2 = y5e.p(vo2Var);
                        String t = p2 != null ? y5e.t(p2) : null;
                        lxw a = ((cyw) za70Var).a().a();
                        INVOICE_STATUS b2 = a.b();
                        if (b2 == INVOICE_STATUS.WAIT_FOR_UZUM || b2 == INVOICE_STATUS.WAIT_FOR_SBP || b2 == INVOICE_STATUS.CREATED_LEGACY || b2 == INVOICE_STATUS.UNKNOWN__ || b2 == null) {
                            if (b2 != null && (obj2 = b2.toString()) != null) {
                                str = obj2.toLowerCase(Locale.ROOT);
                            }
                            uqx0Var.a(r, t, a.a(), str);
                            break;
                        }
                    }
                    break;
                case 710710897:
                    if (name2.equals("CreateInvoice") && (za70Var instanceof t5f)) {
                        List p3 = y5e.p(vo2Var);
                        String t2 = p3 != null ? y5e.t(p3) : null;
                        lxw a2 = ((t5f) za70Var).a().a().a();
                        INVOICE_STATUS b3 = a2.b();
                        if (b3 == INVOICE_STATUS.FAILED || b3 == INVOICE_STATUS.UNKNOWN__ || b3 == null) {
                            if (b3 != null && (name = b3.name()) != null) {
                                str = name.toLowerCase(Locale.ROOT);
                            }
                            uqx0Var.a(r, t2, a2.a(), str);
                            break;
                        }
                    }
                    break;
                case 1903940685:
                    if (name2.equals("CompositeOfferDetails") && (za70Var instanceof gmd) && (fc70Var instanceof ymd)) {
                        ymd ymdVar = (ymd) fc70Var;
                        gmd gmdVar = (gmd) za70Var;
                        Boolean a3 = gmdVar.a().a().a();
                        if (ymdVar.c() && a3 == null) {
                            String str2 = (String) ymdVar.e().a();
                            bt90 bt90Var2 = uqx0Var.a;
                            String str3 = r == null ? "no_value" : r;
                            if (str2 == null) {
                                str2 = "no_value";
                            }
                            LinkedHashMap y2 = g8e.y("requestId", str3, "additionalData", "no_value");
                            y2.put("target", str2);
                            y2.put("sessionId", "no_value");
                            y2.put("_meta", bt90.b(new HashMap()));
                            bt90Var2.c("Error.Subscription.Tarifficator.OfferDetails.NullSilent", y2);
                        }
                        rmd b4 = gmdVar.a().b();
                        boolean z = b4 == null || b4.a().isEmpty() || b4.b().isEmpty();
                        if (!ymdVar.d() && z) {
                            String str4 = (String) ymdVar.e().a();
                            uqx0Var.getClass();
                            Map e = gw00.e(new Pair("target", str4));
                            bt90 bt90Var3 = uqx0Var.a;
                            String str5 = r != null ? r : "no_value";
                            sbx sbxVar = uqx0Var.b;
                            sbxVar.getClass();
                            auu0 auu0Var = auu0.a;
                            LinkedHashMap y3 = g8e.y("requestId", str5, "additionalData", sbxVar.c(e, new k8u(auu0Var, qke.n(auu0Var), 1)));
                            y3.put("_meta", bt90.b(new HashMap()));
                            bt90Var3.c("Error.Subscription.Tarifficator.OfferDetails.EmptyPaymentMethods", y3);
                        }
                        xlp0 xlp0Var = new xlp0(25, bVar, r, ymdVar);
                        rmd b5 = gmdVar.a().b();
                        if (b5 != null) {
                            Iterator it = b5.b().iterator();
                            while (it.hasNext()) {
                                omdVar = ((qmd) it.next()).b();
                                if (omdVar != null) {
                                    b = gmdVar.a().b();
                                    if (b == null) {
                                        List b6 = b.b();
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it2 = b6.iterator();
                                        while (it2.hasNext()) {
                                            lmd a4 = ((qmd) it2.next()).a();
                                            if (a4 != null) {
                                                arrayList2.add(a4);
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            Object next = it3.next();
                                            lmd lmdVar = (lmd) next;
                                            xmd a5 = lmdVar.a();
                                            String b7 = a5 != null ? a5.b() : null;
                                            xmd a6 = lmdVar.a();
                                            if (new PlusThemedUrl(b7, a6 != null ? a6.a() : null).isNotEmpty()) {
                                                arrayList.add(next);
                                            }
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    if (omdVar != null) {
                                        if (new PlusThemedUrl(omdVar.a().b(), omdVar.a().a()).isValid()) {
                                            omdVar = null;
                                        }
                                        if (omdVar != null) {
                                            xlp0Var.invoke();
                                        }
                                    }
                                    if (arrayList != null) {
                                        for (lmd lmdVar2 : arrayList) {
                                            xmd a7 = lmdVar2.a();
                                            String b8 = a7 != null ? a7.b() : null;
                                            xmd a8 = lmdVar2.a();
                                            if (new PlusThemedUrl(b8, a8 != null ? a8.a() : null).isValid()) {
                                                lmdVar2 = null;
                                            }
                                            if (lmdVar2 != null) {
                                                xlp0Var.invoke();
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                        omdVar = null;
                        b = gmdVar.a().b();
                        if (b == null) {
                        }
                        if (omdVar != null) {
                        }
                        if (arrayList != null) {
                        }
                    }
                    break;
            }
        }
        return zy11.a;
    }
}
