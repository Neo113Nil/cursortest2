package com.yandex.plus.core.network.okhttp.client;

import defpackage.ah7;
import defpackage.gz50;
import defpackage.i3y;
import defpackage.kvj0;
import defpackage.lgx;
import defpackage.lsb1;
import defpackage.n55;
import defpackage.nsb1;
import defpackage.nub1;
import defpackage.ny61;
import defpackage.nz50;
import defpackage.oub1;
import defpackage.s0k0;
import defpackage.sls;
import defpackage.sq50;
import defpackage.sz50;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uv50;
import defpackage.v0k0;
import defpackage.zci0;
import defpackage.zls;
import defpackage.zs50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class d {
    public final com.yandex.plus.core.network.error.a a;
    public final zs50 b;
    public final sls c;
    public final i3y d = kotlin.a.a(new BaseOkHttpNetworkClient$callFactory$2(0, this, d.class, "createCallFactory", "createCallFactory()Lcom/yandex/plus/core/network/api/CallFactoryWithContext;", 0));
    public final i3y e = kotlin.a.a(new sls() { // from class: com.yandex.plus.core.network.okhttp.client.a
        @Override // defpackage.sls
        public final Object invoke() {
            d dVar = d.this;
            ah7 ah7Var = (ah7) dVar.d.getValue();
            v0k0 v0k0Var = (v0k0) dVar;
            s0k0 s0k0Var = new s0k0();
            s0k0Var.a = ah7Var;
            s0k0Var.b(v0k0Var.f);
            s0k0Var.a((lgx) v0k0Var.j.getValue());
            v0k0Var.i.invoke(s0k0Var);
            return s0k0Var.c().b(v0k0Var.h);
        }
    });

    public d(com.yandex.plus.core.network.error.a aVar, zs50 zs50Var, sls slsVar) {
        this.a = aVar;
        this.b = zs50Var;
        this.c = slsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, sq50 sq50Var, gz50 gz50Var, zls zlsVar, ContinuationImpl continuationImpl) {
        BaseOkHttpNetworkClient$saveRequestAndResponse$1 baseOkHttpNetworkClient$saveRequestAndResponse$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof BaseOkHttpNetworkClient$saveRequestAndResponse$1) {
            baseOkHttpNetworkClient$saveRequestAndResponse$1 = (BaseOkHttpNetworkClient$saveRequestAndResponse$1) continuationImpl;
            int i2 = baseOkHttpNetworkClient$saveRequestAndResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseOkHttpNetworkClient$saveRequestAndResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseOkHttpNetworkClient$saveRequestAndResponse$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseOkHttpNetworkClient$saveRequestAndResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lsb1.b(sq50Var, gz50Var);
                    baseOkHttpNetworkClient$saveRequestAndResponse$1.L$0 = sq50Var;
                    baseOkHttpNetworkClient$saveRequestAndResponse$1.L$1 = null;
                    baseOkHttpNetworkClient$saveRequestAndResponse$1.L$2 = null;
                    baseOkHttpNetworkClient$saveRequestAndResponse$1.label = 1;
                    obj = zlsVar.invoke(sq50Var, gz50Var, baseOkHttpNetworkClient$saveRequestAndResponse$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sq50Var = (sq50) baseOkHttpNetworkClient$saveRequestAndResponse$1.L$0;
                    kotlin.b.b(obj);
                }
                sz50 sz50Var = (sz50) obj;
                nsb1.c(sq50Var, (nz50) com.yandex.plus.core.network.call.a.a(sz50Var));
                return sz50Var;
            }
        }
        baseOkHttpNetworkClient$saveRequestAndResponse$1 = new BaseOkHttpNetworkClient$saveRequestAndResponse$1(dVar, continuationImpl);
        Object obj3 = baseOkHttpNetworkClient$saveRequestAndResponse$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseOkHttpNetworkClient$saveRequestAndResponse$1.label;
        if (i != 0) {
        }
        sz50 sz50Var2 = (sz50) obj3;
        nsb1.c(sq50Var, (nz50) com.yandex.plus.core.network.call.a.a(sz50Var2));
        return sz50Var2;
    }

    public final kvj0 b(sq50 sq50Var, List list, zci0 zci0Var, boolean z) {
        gz50 e = nub1.e(zci0Var.e);
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return oub1.b((nz50) com.yandex.plus.core.network.call.a.b((sz50) tje.Y(EmptyCoroutineContext.a, new BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkResult$1(sq50Var, zci0Var, new com.yandex.plus.core.network.interceptor.a(sq50Var, e, kotlin.collections.a.o0(arrayList, new c(this, zci0Var, 1)), 0, new n55(this, 0), z), e, null))));
            }
            arrayList.add(new c(this, (uv50) it.next(), i));
        }
    }
}
