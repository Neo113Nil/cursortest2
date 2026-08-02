package com.yandex.go.masstransit.sdk.ble.impl.domain;

import com.yandex.go.masstransit.sdk.ble.api.model.BleTransportType;
import com.yandex.go.masstransit.sdk.ble.impl.ble.MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.fd30;
import defpackage.gvu0;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ov6;
import defpackage.pn30;
import defpackage.qcx;
import defpackage.s8o;
import defpackage.sbx;
import defpackage.scc;
import defpackage.sj40;
import defpackage.tcc;
import defpackage.tl30;
import defpackage.uj40;
import defpackage.vl30;
import defpackage.w511;
import defpackage.xby;
import defpackage.xj40;
import defpackage.xl30;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luj40;", "vehicleInfo", "", "isNewBatchesLoading", "Lzl30;", "<anonymous>", "(Luj40;Z)Lzl30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.domain.MtVehiclesInteractor$vehiclesFlowV2$1", f = "MtVehiclesInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtVehiclesInteractor$vehiclesFlowV2$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtVehiclesInteractor$vehiclesFlowV2$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        MtVehiclesInteractor$vehiclesFlowV2$1 mtVehiclesInteractor$vehiclesFlowV2$1 = new MtVehiclesInteractor$vehiclesFlowV2$1(this.this$0, (Continuation) obj3);
        mtVehiclesInteractor$vehiclesFlowV2$1.L$0 = (uj40) obj;
        mtVehiclesInteractor$vehiclesFlowV2$1.Z$0 = booleanValue;
        return mtVehiclesInteractor$vehiclesFlowV2$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
    
        if (r1 == null) goto L63;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BufferedInputStream N;
        String str;
        String str2;
        Map map;
        String L;
        uj40 uj40Var = (uj40) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        int i = xj40.a[uj40Var.b.ordinal()];
        pn30 pn30Var = pn30.a;
        if (i == 1) {
            return new vl30(scc.g(pn30Var, pn30Var, pn30Var));
        }
        String str3 = "";
        if (i == 2) {
            sj40 sj40Var = uj40Var.c;
            Throwable th = sj40Var != null ? sj40Var.a : null;
            if (s8o.B(th)) {
                return tl30.e;
            }
            this.this$0.getClass();
            Integer M = s8o.M(th);
            if (M == null || M.intValue() != 403 || (N = s8o.N(th)) == null) {
                return tl30.d;
            }
            try {
                L = s8o.L(N);
            } catch (Throwable th2) {
                th = th2;
                str = "";
            }
            if (L == null) {
                str2 = "";
                MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.Companion.getClass();
                map = MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.map;
                return new tl30((MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode) map.get(str3), str2, false);
            }
            c cVar = (c) sbx.d.b(c.Companion.serializer(), L);
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get(AuthSdkActivity.RESPONSE_TYPE_CODE);
            if (bVar != null) {
                str = qcx.g(qcx.n(bVar));
            }
            str = "";
            try {
                kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVar.get(Constants.KEY_MESSAGE);
                if (bVar2 != null) {
                    String g = qcx.g(qcx.n(bVar2));
                    if (g != null) {
                        str3 = g;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                xby.d.j(th);
                str2 = str3;
                str3 = str;
                MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.Companion.getClass();
                map = MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.map;
                return new tl30((MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode) map.get(str3), str2, false);
            }
            str2 = str3;
            str3 = str;
            MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.Companion.getClass();
            map = MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.map;
            return new tl30((MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode) map.get(str3), str2, false);
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        a aVar = this.this$0;
        List list = uj40Var.a;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ov6) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ov6 ov6Var = (ov6) it.next();
            String str4 = ov6Var.c;
            if (str4 == null) {
                str4 = "";
            }
            if (new Regex("\\w\\d{3}\\w{2}", RegexOption.IGNORE_CASE).h(str4)) {
                str4 = gvu0.u0(str4) + " " + str4.substring(1, 4) + " " + str4.substring(4);
            }
            String str5 = str4;
            String str6 = ov6Var.a;
            String str7 = ov6Var.b;
            String str8 = ov6Var.f;
            String str9 = str8 == null ? "" : str8;
            BleTransportType bleTransportType = BleTransportType.Bus;
            String str10 = ov6Var.d;
            arrayList2.add(new fd30(str5, str6, str7, str9, bleTransportType, str10 != null ? mja1.a(str10, null, 6) : null, ov6Var.e));
        }
        if (z) {
            arrayList2 = kotlin.collections.a.m0(scc.g(pn30Var, pn30Var), arrayList2);
        }
        return new xl30(arrayList2);
    }
}
