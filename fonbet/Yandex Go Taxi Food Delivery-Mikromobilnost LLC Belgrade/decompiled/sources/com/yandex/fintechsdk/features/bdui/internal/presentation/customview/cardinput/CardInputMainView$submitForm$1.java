package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsDataSource;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsTrigger;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoEventName;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import defpackage.a5n;
import defpackage.cso;
import defpackage.cvu0;
import defpackage.eso;
import defpackage.et5;
import defpackage.gso;
import defpackage.klk;
import defpackage.kzo;
import defpackage.li3;
import defpackage.lk8;
import defpackage.mdh;
import defpackage.mof;
import defpackage.mvg;
import defpackage.nnz0;
import defpackage.ny61;
import defpackage.qk8;
import defpackage.sg8;
import defpackage.tje;
import defpackage.tse;
import defpackage.u6s;
import defpackage.urm;
import defpackage.wls;
import defpackage.x9u0;
import defpackage.yz91;
import defpackage.z031;
import defpackage.z22;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView$submitForm$1", f = "CardInputMainView.kt", l = {569}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class CardInputMainView$submitForm$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ CardInputMainView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputMainView$submitForm$1(CardInputMainView cardInputMainView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardInputMainView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardInputMainView$submitForm$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardInputMainView$submitForm$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0252, code lost:
    
        if (r0 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0257 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0244  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        String str;
        zy11 zy11Var;
        r0 r0Var;
        nnz0 nnz0Var;
        Object k0;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CardNetwork cardNetwork = null;
        zy11 zy11Var2 = zy11.a;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var2;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        aVar = this.this$0.viewController;
        this.label = 1;
        r0 r0Var2 = aVar.n;
        if (!((sg8) r0Var2.getValue()).l) {
            aVar.e();
        }
        while (true) {
            Object value = r0Var2.getValue();
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) aVar.a).a(u6s.c);
            if (r0Var2.k(value, sg8.a((sg8) value, null, null, null, 0, null, null, null, 0, null, new x9u0(z), null, false, false, 7679))) {
                break;
            }
            z = z;
            cardNetwork = cardNetwork;
        }
        kzo kzoVar = aVar.y;
        sg8 sg8Var = (sg8) r0Var2.getValue();
        et5 et5Var = aVar.r;
        com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo.a aVar2 = aVar.x;
        boolean z2 = kzoVar.b;
        if (z2) {
            String v = cvu0.v(sg8Var.a.a, " ", "", false);
            int length = v.length();
            CardNetwork cardNetwork2 = ((lk8) kzoVar.w).a(v).a;
            if (cardNetwork2 == CardNetwork.UNKNOWN) {
                cardNetwork2 = cardNetwork;
            }
            String stringCode = cardNetwork2 != null ? cardNetwork2.getStringCode() : cardNetwork;
            boolean z3 = et5Var != null ? z : false;
            boolean f = aVar2.f();
            if (et5Var == null || (str = et5Var.a) == null) {
                str = stringCode;
            }
            Boolean valueOf = (et5Var == null || stringCode == null) ? cardNetwork : Boolean.valueOf(cvu0.t(et5Var.a, stringCode, z));
            DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource = sg8Var.e != null ? DynamicBinInfoAnalyticsDataSource.DIEHARD : sg8Var.d != 0 ? DynamicBinInfoAnalyticsDataSource.LOCAL : null;
            DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource2 = z3 ? DynamicBinInfoAnalyticsDataSource.DIEHARD : (z2 && f) ? DynamicBinInfoAnalyticsDataSource.CACHED : DynamicBinInfoAnalyticsDataSource.LOCAL;
            z22 z22Var = (z22) kzoVar.c;
            ArrayList b = aVar2.b();
            ArrayList d = aVar2.d();
            ArrayList e = aVar2.e();
            Long l = ((a5n) kzoVar.x).a;
            Long valueOf2 = l != null ? Long.valueOf(System.currentTimeMillis() - l.longValue()) : null;
            DynamicBinInfoAnalyticsTrigger dynamicBinInfoAnalyticsTrigger = DynamicBinInfoAnalyticsTrigger.SUBMIT;
            DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource3 = dynamicBinInfoAnalyticsDataSource;
            String a = DynamicBinInfoEventName.DATA_STATE_ON_SUBMIT.a();
            zy11Var = zy11Var2;
            MapBuilder mapBuilder = new MapBuilder();
            r0Var = r0Var2;
            mapBuilder.put("card_number_length", String.valueOf(length));
            mapBuilder.put("data_source", dynamicBinInfoAnalyticsDataSource2.getValue());
            mapBuilder.put("has_dynamic_data", String.valueOf(z3));
            mapBuilder.put("has_pending_requests", String.valueOf(f));
            mapBuilder.put("pending_prefixes", kotlin.collections.a.X(d, ",", null, null, new urm(11), 30));
            mapBuilder.put("successful_prefixes", kotlin.collections.a.X(e, ",", null, null, new urm(12), 30));
            mapBuilder.put("failed_prefixes", kotlin.collections.a.X(b, ",", null, null, new urm(13), 30));
            mapBuilder.put("has_icon", String.valueOf(dynamicBinInfoAnalyticsDataSource3 != null));
            mapBuilder.put("trigger", dynamicBinInfoAnalyticsTrigger.getValue());
            if (str != null) {
                mapBuilder.put("payment_system", str);
            }
            String value2 = dynamicBinInfoAnalyticsDataSource3 != null ? dynamicBinInfoAnalyticsDataSource3.getValue() : null;
            if (value2 != null) {
                mapBuilder.put("icon_source", value2);
            }
            if (stringCode != null) {
                mapBuilder.put("static_payment_system", stringCode);
            }
            String bool = valueOf != 0 ? valueOf.toString() : null;
            if (bool != null) {
                mapBuilder.put("systems_match", bool);
            }
            String l2 = valueOf2 != null ? valueOf2.toString() : null;
            if (l2 != null) {
                mapBuilder.put("time_since_first_request_ms", l2);
            }
            yz91.c(z22Var, new li3(3, a, mapBuilder.j()), true);
        } else {
            zy11Var = zy11Var2;
            r0Var = r0Var2;
        }
        sg8 sg8Var2 = (sg8) r0Var.getValue();
        qk8 qk8Var = sg8Var2.a;
        if (qk8Var.c instanceof z031) {
            String str3 = qk8Var.a;
            gso gsoVar = sg8Var2.c;
            if (gsoVar.d instanceof z031) {
                eso esoVar = gsoVar.b;
                if (esoVar instanceof cso) {
                    cso csoVar = (cso) esoVar;
                    if (!sg8Var2.l) {
                        mof mofVar = sg8Var2.b;
                        str2 = mofVar.c instanceof z031 ? mofVar.a : null;
                    }
                    nnz0Var = new nnz0(String.valueOf(csoVar.a), String.valueOf(csoVar.b), str3, str2);
                    if (nnz0Var != null) {
                        klk klkVar = aVar.p;
                        if (klkVar != null) {
                            klkVar.handleAction(aVar.f.a.f);
                        }
                    } else {
                        k0 = tje.k0(mdh.b, new CardInputViewController$submitForm$3(aVar, nnz0Var, null), this);
                    }
                    k0 = zy11Var;
                    return k0 != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
            }
        }
        nnz0Var = null;
        if (nnz0Var != null) {
        }
        k0 = zy11Var;
        if (k0 != coroutineSingletons) {
        }
    }
}
