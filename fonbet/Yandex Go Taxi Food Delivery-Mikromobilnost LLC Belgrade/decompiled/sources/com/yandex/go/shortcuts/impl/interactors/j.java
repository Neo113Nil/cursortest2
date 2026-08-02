package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import com.yandex.go.shortcuts.dto.response.PromoMode;
import defpackage.b64;
import defpackage.cug;
import defpackage.fmt;
import defpackage.fva0;
import defpackage.hof0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.maf0;
import defpackage.mdh;
import defpackage.o3s0;
import defpackage.oeu;
import defpackage.q9f0;
import defpackage.qaf0;
import defpackage.qje;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uaf0;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.yww0;
import defpackage.zaf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes13.dex */
public final class j implements vpr {
    public final /* synthetic */ m a;
    public final /* synthetic */ qaf0 b;
    public final /* synthetic */ Address c;
    public final /* synthetic */ zaf0 w;
    public final /* synthetic */ zzs x;

    public j(m mVar, qaf0 qaf0Var, Address address, zaf0 zaf0Var, zzs zzsVar) {
        this.a = mVar;
        this.b = qaf0Var;
        this.c = address;
        this.w = zaf0Var;
        this.x = zzsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0107, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L32;
     */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        fmt fmtVar = (fmt) obj;
        m mVar = this.a;
        o3s0 o3s0Var = mVar.g;
        qaf0 qaf0Var = this.b;
        yaf0 yaf0Var = qaf0Var.a;
        o3s0Var.getClass();
        String p = qje.p(yaf0Var);
        fva0 fva0Var = o3s0Var.a;
        String j = b64.j(p, ".NavigationSection.ResponseRendered");
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
        fva0.f(fva0Var, j, performanceAnalytics$Type, 0L, 4);
        fva0.f(o3s0Var.a, b64.j(p, ".TaxiSection.ResponseRendered"), performanceAnalytics$Type, 0L, 4);
        maf0 maf0Var = mVar.h;
        Object obj3 = fmtVar.a;
        oeu oeuVar = fmtVar.e;
        maf0Var.a.g(new Result(obj3));
        hof0 hof0Var = mVar.j;
        ProductsResponse productsResponse = (ProductsResponse) fmtVar.a;
        PromoMode promoMode = productsResponse.d;
        hof0Var.a.l(promoMode);
        ((yww0) hof0Var.b.getValue()).b(promoMode);
        q9f0 q9f0Var = mVar.f;
        uaf0 uaf0Var = (uaf0) qaf0Var.a;
        q9f0Var.getClass();
        String str = jl40.l(uaf0Var, yaf0.a) ? "Main" : jl40.l(uaf0Var, yaf0.d) ? "TaxiMain" : jl40.l(uaf0Var, yaf0.c) ? "Multiorder" : null;
        if (str != null) {
            ((ru.yandex.taxi.analytics.j) q9f0Var.a).n(str.concat(".Products.Loaded"));
        }
        String a = oeuVar.a("X-YaTraceId");
        String a2 = oeuVar.a("X-YaRequestId");
        q9f0Var.getClass();
        if (promoMode != PromoMode.UNKNOWN) {
            cug cugVar = q9f0Var.b;
            String value = promoMode.getValue();
            cugVar.getClass();
            HashMap hashMap = new HashMap();
            if (value != null) {
                hashMap.put("promo_mode", value);
            }
            if (a != null) {
                hashMap.put("request_id", a);
            }
            if (a2 != null) {
                hashMap.put("trace_id", a2);
            }
            cugVar.a.a("PromoMode.Updated", hashMap, 1, new HashMap());
        }
        unr0.C(new Object[]{productsResponse.b}, 1, "SC: got answer - %s", jst.e);
        zaf0 zaf0Var = this.w;
        qaf0 qaf0Var2 = zaf0Var.a;
        zy11 zy11Var = zy11.a;
        if (qaf0Var2 != null) {
            mVar.k.getClass();
            sjh sjhVar = uyj.a;
            obj2 = tje.k0(mdh.b, new ProductsInteractorImpl$onFetchProducts$2(mVar, productsResponse, zaf0Var, this.c, this.x, null), continuation);
        }
        obj2 = zy11Var;
        return obj2 == CoroutineSingletons.COROUTINE_SUSPENDED ? obj2 : zy11Var;
    }
}
