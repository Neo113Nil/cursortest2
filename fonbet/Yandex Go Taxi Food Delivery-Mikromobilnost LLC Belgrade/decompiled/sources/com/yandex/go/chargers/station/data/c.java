package com.yandex.go.chargers.station.data;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsRequestParam;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse;
import com.yandex.go.chargers.station.data.model.OrderContext;
import defpackage.cmt;
import defpackage.e6a;
import defpackage.ejb1;
import defpackage.fmt;
import defpackage.g6a;
import defpackage.gxa;
import defpackage.h3y;
import defpackage.hfa0;
import defpackage.iwa;
import defpackage.jqr;
import defpackage.k6a;
import defpackage.k7x0;
import defpackage.lpa;
import defpackage.m6a0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.ow9;
import defpackage.pwy0;
import defpackage.rda;
import defpackage.rpa;
import defpackage.tpr;
import defpackage.tsa;
import defpackage.tt2;
import defpackage.uda;
import defpackage.ura;
import defpackage.uyj;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class c {
    public final tt2 a;
    public final k7x0 b;
    public final pwy0 c;
    public final ru.yandex.taxi.widget.c d;
    public final h3y e;
    public final iwa f;
    public final gxa g;
    public final f h;
    public final com.yandex.go.chargers.station.data.mapper.a i;
    public final com.yandex.go.chargers.domain.a j;
    public final lpa k;
    public final g6a l;
    public final rpa m;
    public final com.yandex.go.chargers.data.e n;
    public final rda o;
    public final com.yandex.go.chargers.payments.data.a p;
    public final ura q;

    public c(tt2 tt2Var, k7x0 k7x0Var, pwy0 pwy0Var, ru.yandex.taxi.widget.c cVar, h3y h3yVar, iwa iwaVar, gxa gxaVar, f fVar, com.yandex.go.chargers.station.data.mapper.a aVar, com.yandex.go.chargers.domain.a aVar2, lpa lpaVar, g6a g6aVar, rpa rpaVar, com.yandex.go.chargers.data.e eVar, rda rdaVar, com.yandex.go.chargers.payments.data.a aVar3, ura uraVar) {
        this.a = tt2Var;
        this.b = k7x0Var;
        this.c = pwy0Var;
        this.d = cVar;
        this.e = h3yVar;
        this.f = iwaVar;
        this.g = gxaVar;
        this.h = fVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = lpaVar;
        this.l = g6aVar;
        this.m = rpaVar;
        this.n = eVar;
        this.o = rdaVar;
        this.p = aVar3;
        this.q = uraVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0197, code lost:
    
        if (r4 == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0163, code lost:
    
        if (r3 != r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(c cVar, kotlinx.serialization.json.b bVar, tsa tsaVar, int i, hfa0 hfa0Var, ContinuationImpl continuationImpl) {
        ChargersStationDetailsRepository$getChargersStationDetails$1 chargersStationDetailsRepository$getChargersStationDetails$1;
        int i2;
        ChargersStationApi chargersStationApi;
        int i3;
        ChargersStationDetailsRequestParam chargersStationDetailsRequestParam;
        fmt fmtVar;
        ChargersStationDetailsResponse.NotificationDto notificationDto;
        Object i4;
        fmt fmtVar2;
        rpa rpaVar = cVar.m;
        if (continuationImpl instanceof ChargersStationDetailsRepository$getChargersStationDetails$1) {
            chargersStationDetailsRepository$getChargersStationDetails$1 = (ChargersStationDetailsRepository$getChargersStationDetails$1) continuationImpl;
            int i5 = chargersStationDetailsRepository$getChargersStationDetails$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsRepository$getChargersStationDetails$1.label = i5 - Integer.MIN_VALUE;
                Object obj = chargersStationDetailsRepository$getChargersStationDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = chargersStationDetailsRepository$getChargersStationDetails$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    lpa lpaVar = cVar.k;
                    ow9 ow9Var = (ow9) kotlinx.coroutines.flow.e.d(rpaVar.y).a.getValue();
                    Date b = cVar.p.b();
                    lpaVar.getClass();
                    ChargersSelectedDiscountDto a = lpa.a(ow9Var, b);
                    m6a0 d = hfa0Var.d();
                    String str = tsaVar.b;
                    String str2 = tsaVar.a;
                    OrderContext orderContext = i > 0 ? new OrderContext(i, bVar) : null;
                    List c = d != null ? ejb1.c(d) : null;
                    if (c == null) {
                        c = EmptyList.a;
                    }
                    ChargersStationDetailsRequestParam chargersStationDetailsRequestParam2 = new ChargersStationDetailsRequestParam(str, str2, orderContext, a, c);
                    ChargersStationApi chargersStationApi2 = (ChargersStationApi) cVar.e.get();
                    f fVar = cVar.h;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$0 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$1 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$2 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$3 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$4 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$5 = chargersStationDetailsRequestParam2;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$6 = chargersStationApi2;
                    chargersStationDetailsRepository$getChargersStationDetails$1.I$0 = i;
                    chargersStationDetailsRepository$getChargersStationDetails$1.label = 1;
                    obj = fVar.c(chargersStationDetailsRepository$getChargersStationDetails$1);
                    if (obj != coroutineSingletons) {
                        chargersStationApi = chargersStationApi2;
                        i3 = i;
                        chargersStationDetailsRequestParam = chargersStationDetailsRequestParam2;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        i3 = chargersStationDetailsRepository$getChargersStationDetails$1.I$0;
                        kotlin.b.b(obj);
                        fmtVar = (fmt) obj;
                        rpaVar.Jg(((ChargersStationDetailsResponse) fmtVar.a).p);
                        notificationDto = ((ChargersStationDetailsResponse) fmtVar.a).o;
                        if (notificationDto != null) {
                            ru.yandex.taxi.widget.c cVar2 = cVar.d;
                            FormattedText formattedText = notificationDto.b;
                            chargersStationDetailsRepository$getChargersStationDetails$1.L$0 = null;
                            chargersStationDetailsRepository$getChargersStationDetails$1.L$1 = null;
                            chargersStationDetailsRepository$getChargersStationDetails$1.L$2 = null;
                            chargersStationDetailsRepository$getChargersStationDetails$1.L$3 = null;
                            chargersStationDetailsRepository$getChargersStationDetails$1.L$4 = null;
                            chargersStationDetailsRepository$getChargersStationDetails$1.L$5 = null;
                            chargersStationDetailsRepository$getChargersStationDetails$1.L$6 = fmtVar;
                            chargersStationDetailsRepository$getChargersStationDetails$1.L$7 = notificationDto;
                            chargersStationDetailsRepository$getChargersStationDetails$1.I$0 = i3;
                            chargersStationDetailsRepository$getChargersStationDetails$1.label = 3;
                            i4 = ru.yandex.taxi.widget.c.i(cVar2, formattedText, null, chargersStationDetailsRepository$getChargersStationDetails$1, 30);
                        }
                        return new Pair(fmtVar.a, fmtVar.e.a("X-YaTraceId"));
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fmtVar2 = (fmt) chargersStationDetailsRepository$getChargersStationDetails$1.L$6;
                        kotlin.b.b(obj);
                        fmtVar = fmtVar2;
                        return new Pair(fmtVar.a, fmtVar.e.a("X-YaTraceId"));
                    }
                    i3 = chargersStationDetailsRepository$getChargersStationDetails$1.I$0;
                    notificationDto = (ChargersStationDetailsResponse.NotificationDto) chargersStationDetailsRepository$getChargersStationDetails$1.L$7;
                    fmt fmtVar3 = (fmt) chargersStationDetailsRepository$getChargersStationDetails$1.L$6;
                    kotlin.b.b(obj);
                    i4 = obj;
                    fmtVar = fmtVar3;
                    CharSequence charSequence = (CharSequence) i4;
                    String str3 = notificationDto.a;
                    k6a k6aVar = new k6a(charSequence, str3 != null ? new e6a(((m7x0) cVar.b).a(str3)) : null, 0);
                    g6a g6aVar = cVar.l;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$0 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$1 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$2 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$3 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$4 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$5 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$6 = fmtVar;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$7 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.L$8 = null;
                    chargersStationDetailsRepository$getChargersStationDetails$1.I$0 = i3;
                    chargersStationDetailsRepository$getChargersStationDetails$1.label = 4;
                    if (g6aVar.a.emit(k6aVar, chargersStationDetailsRepository$getChargersStationDetails$1) != coroutineSingletons) {
                        fmtVar2 = fmtVar;
                        fmtVar = fmtVar2;
                        return new Pair(fmtVar.a, fmtVar.e.a("X-YaTraceId"));
                    }
                    return coroutineSingletons;
                }
                i3 = chargersStationDetailsRepository$getChargersStationDetails$1.I$0;
                chargersStationApi = (ChargersStationApi) chargersStationDetailsRepository$getChargersStationDetails$1.L$6;
                chargersStationDetailsRequestParam = (ChargersStationDetailsRequestParam) chargersStationDetailsRepository$getChargersStationDetails$1.L$5;
                kotlin.b.b(obj);
                cmt<ChargersStationDetailsResponse> a2 = chargersStationApi.a((Map) obj, chargersStationDetailsRequestParam);
                chargersStationDetailsRepository$getChargersStationDetails$1.L$0 = null;
                chargersStationDetailsRepository$getChargersStationDetails$1.L$1 = null;
                chargersStationDetailsRepository$getChargersStationDetails$1.L$2 = null;
                chargersStationDetailsRepository$getChargersStationDetails$1.L$3 = null;
                chargersStationDetailsRepository$getChargersStationDetails$1.L$4 = null;
                chargersStationDetailsRepository$getChargersStationDetails$1.L$5 = null;
                chargersStationDetailsRepository$getChargersStationDetails$1.L$6 = null;
                chargersStationDetailsRepository$getChargersStationDetails$1.I$0 = i3;
                chargersStationDetailsRepository$getChargersStationDetails$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.b(a2, null, chargersStationDetailsRepository$getChargersStationDetails$1);
            }
        }
        chargersStationDetailsRepository$getChargersStationDetails$1 = new ChargersStationDetailsRepository$getChargersStationDetails$1(cVar, continuationImpl);
        Object obj2 = chargersStationDetailsRepository$getChargersStationDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = chargersStationDetailsRepository$getChargersStationDetails$1.label;
        if (i2 != 0) {
        }
        cmt<ChargersStationDetailsResponse> a22 = chargersStationApi.a((Map) obj2, chargersStationDetailsRequestParam);
        chargersStationDetailsRepository$getChargersStationDetails$1.L$0 = null;
        chargersStationDetailsRepository$getChargersStationDetails$1.L$1 = null;
        chargersStationDetailsRepository$getChargersStationDetails$1.L$2 = null;
        chargersStationDetailsRepository$getChargersStationDetails$1.L$3 = null;
        chargersStationDetailsRepository$getChargersStationDetails$1.L$4 = null;
        chargersStationDetailsRepository$getChargersStationDetails$1.L$5 = null;
        chargersStationDetailsRepository$getChargersStationDetails$1.L$6 = null;
        chargersStationDetailsRepository$getChargersStationDetails$1.I$0 = i3;
        chargersStationDetailsRepository$getChargersStationDetails$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.b(a22, null, chargersStationDetailsRepository$getChargersStationDetails$1);
    }

    public final tpr b(tsa tsaVar, String str) {
        uda udaVar = (uda) kotlinx.coroutines.flow.e.d(this.o.a).a.getValue();
        jqr jqrVar = new jqr(new m0(kotlinx.coroutines.flow.e.m(this.p.e(), this.j.c(), com.yandex.go.coroutines.b.d(this.q.a, new ChargersStationDetailsRepository$listenToStationDetailsResponse$$inlined$start$1(zy11.a, null)), kotlinx.coroutines.flow.e.t(new b(kotlinx.coroutines.flow.e.d(this.n.d), this, str)), new ChargersStationDetailsRepository$listenToStationDetailsResponse$1(this, udaVar != null ? udaVar.c : null, tsaVar, null)), this.c.a(), new ChargersStationDetailsRepository$getStationDetails$1(this, null)), new ChargersStationDetailsRepository$getStationDetails$2(this, null), 3);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(jqrVar, uyj.a);
    }
}
