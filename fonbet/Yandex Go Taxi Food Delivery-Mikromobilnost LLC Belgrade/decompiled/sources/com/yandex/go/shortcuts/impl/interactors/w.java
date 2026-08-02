package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.response.ProductsScreenResponse;
import defpackage.bfp0;
import defpackage.bg5;
import defpackage.bvf0;
import defpackage.d1z;
import defpackage.eaf0;
import defpackage.ffx;
import defpackage.fre;
import defpackage.h3y;
import defpackage.hzs;
import defpackage.jl40;
import defpackage.jst;
import defpackage.m8f0;
import defpackage.ny61;
import defpackage.o8h;
import defpackage.qaf0;
import defpackage.qmp;
import defpackage.raf0;
import defpackage.tt2;
import defpackage.uc4;
import defpackage.ul51;
import defpackage.unr0;
import defpackage.vaf0;
import defpackage.waf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class w {
    public final qmp a;
    public final h3y b;
    public final bfp0 c;
    public final tt2 d;
    public final bg5 e;
    public final o8h f;
    public final n0 g = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final r0 h = bvf0.c(new raf0(null));
    public raf0 i;

    public w(qmp qmpVar, h3y h3yVar, bfp0 bfp0Var, tt2 tt2Var, m8f0 m8f0Var, bg5 bg5Var, o8h o8hVar) {
        this.a = qmpVar;
        this.b = h3yVar;
        this.c = bfp0Var;
        this.d = tt2Var;
        this.e = bg5Var;
        this.f = o8hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w wVar, ProductsScreenResponse productsScreenResponse, Address address, raf0 raf0Var, zzs zzsVar, Continuation continuation) {
        ProductsScreenInteractorImpl$onFetchProducts$1 productsScreenInteractorImpl$onFetchProducts$1;
        int i;
        waf0 waf0Var;
        r0 r0Var;
        wVar.getClass();
        if (continuation instanceof ProductsScreenInteractorImpl$onFetchProducts$1) {
            productsScreenInteractorImpl$onFetchProducts$1 = (ProductsScreenInteractorImpl$onFetchProducts$1) continuation;
            int i2 = productsScreenInteractorImpl$onFetchProducts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsScreenInteractorImpl$onFetchProducts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsScreenInteractorImpl$onFetchProducts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsScreenInteractorImpl$onFetchProducts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    unr0.C(new Object[]{productsScreenResponse.getE()}, 1, "SC: got answer - %s", jst.e);
                    qaf0 qaf0Var = raf0Var.a;
                    if (qaf0Var == null) {
                        return;
                    }
                    waf0 waf0Var2 = (waf0) qaf0Var.a;
                    bfp0 bfp0Var = wVar.c;
                    bfp0Var.a.put(((vaf0) waf0Var2).e, productsScreenResponse.getE().getE());
                    wVar.f.getClass();
                    wVar.a.getClass();
                    waf0Var = waf0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    waf0 waf0Var3 = (waf0) productsScreenInteractorImpl$onFetchProducts$1.L$4;
                    zzsVar = (zzs) productsScreenInteractorImpl$onFetchProducts$1.L$3;
                    raf0Var = (raf0) productsScreenInteractorImpl$onFetchProducts$1.L$2;
                    address = (Address) productsScreenInteractorImpl$onFetchProducts$1.L$1;
                    productsScreenResponse = (ProductsScreenResponse) productsScreenInteractorImpl$onFetchProducts$1.L$0;
                    kotlin.b.b(obj);
                    waf0Var = waf0Var3;
                }
                hzs hzsVar = new hzs(address, productsScreenResponse, waf0Var, zzsVar, d1z.a);
                r0Var = raf0Var.b;
                if (r0Var == null) {
                    r0Var.l(hzsVar);
                    return;
                }
                return;
            }
        }
        productsScreenInteractorImpl$onFetchProducts$1 = new ProductsScreenInteractorImpl$onFetchProducts$1(wVar, continuation);
        Object obj2 = productsScreenInteractorImpl$onFetchProducts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsScreenInteractorImpl$onFetchProducts$1.label;
        if (i != 0) {
        }
        hzs hzsVar2 = new hzs(address, productsScreenResponse, waf0Var, zzsVar, d1z.a);
        r0Var = raf0Var.b;
        if (r0Var == null) {
        }
    }

    public final Object b(qaf0 qaf0Var, eaf0 eaf0Var, waf0 waf0Var, boolean z, Continuation continuation) {
        List d = eaf0Var.d();
        Address a = eaf0Var.a();
        zzs B = a.B();
        raf0 c = c(qaf0Var);
        if (!z && !eaf0Var.e() && eaf0Var.equals(c.c)) {
            jst.e.getClass();
            return zy11.a;
        }
        c.c = eaf0Var;
        zzs g = eaf0Var.g();
        uc4 b = eaf0Var.b();
        kotlinx.serialization.json.b f = eaf0Var.f();
        kotlinx.serialization.json.b c2 = eaf0Var.c();
        ((ul51) this.a).getClass();
        raf0 c3 = c(qaf0Var);
        zzs zzsVar = g == null ? B : g;
        unr0.C(new Object[]{a}, 1, "SC: start fetching products after pin drop - %s", jst.e);
        return new kotlinx.coroutines.flow.o(new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.T(new t(this.h, qaf0Var), 1), new ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$flatMapLatest$1(null, this, B, d, qaf0Var, b, f, c2)), new ProductsScreenInteractorImpl$fetchScreenProducts$5(this, c3, null)), new ProductsScreenInteractorImpl$fetchScreenProducts$$inlined$safeCollect$1(null, this, c3, waf0Var)).collect(new fre(this, a, c3, zzsVar, 7), continuation);
    }

    public final raf0 c(qaf0 qaf0Var) {
        raf0 raf0Var = (raf0) this.h.getValue();
        if (jl40.l(qaf0Var, raf0Var.a)) {
            return raf0Var;
        }
        raf0 raf0Var2 = this.i;
        if (raf0Var2 == null) {
            raf0 raf0Var3 = new raf0(qaf0Var);
            this.i = raf0Var3;
            return raf0Var3;
        }
        if (!jl40.l(qaf0Var, raf0Var2.a)) {
            raf0 raf0Var4 = new raf0(qaf0Var);
            this.i = raf0Var4;
            return raf0Var4;
        }
        raf0 raf0Var5 = this.i;
        if (raf0Var5 != null) {
            return raf0Var5;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final kotlinx.coroutines.flow.internal.g d() {
        return kotlinx.coroutines.flow.e.X(this.h, new ProductsScreenInteractorImpl$screenProductsFlow$$inlined$flatMapLatest$2());
    }
}
