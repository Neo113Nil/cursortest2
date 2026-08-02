package com.yandex.go.shortcuts.impl.repository;

import com.yandex.go.shortcuts.dto.request.KnownOrderInfo;
import defpackage.haf0;
import defpackage.kx70;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.uc4;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s b;
    public final /* synthetic */ List c;
    public final /* synthetic */ yaf0 w;
    public final /* synthetic */ List x;
    public final /* synthetic */ zzs y;
    public final /* synthetic */ uc4 z;

    public q(vpr vprVar, s sVar, List list, yaf0 yaf0Var, List list2, zzs zzsVar, uc4 uc4Var) {
        this.a = vprVar;
        this.b = sVar;
        this.c = list;
        this.w = yaf0Var;
        this.x = list2;
        this.y = zzsVar;
        this.z = uc4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0100, code lost:
    
        if (r0.emit(r1, r12) != r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1 productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1) {
            productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1 = (ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1) continuation;
            int i2 = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1.label = i2 - Integer.MIN_VALUE;
                ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1 productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12 = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1;
                Object obj2 = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    haf0 haf0Var = (haf0) obj;
                    List<kx70> list = this.x;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((kx70) it.next()).d());
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                    for (kx70 kx70Var : list) {
                        arrayList2.add(new KnownOrderInfo(kx70Var.a, kx70Var.b.getAlias(), kx70Var.c, kx70Var.e, kx70Var.f, kx70Var.g));
                    }
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$0 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$1 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$2 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$3 = null;
                    vpr vprVar2 = this.a;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$4 = vprVar2;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$5 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$6 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.label = 1;
                    Object a = this.b.a(this.c, this.w, arrayList, arrayList2, this.y, haf0Var, true, this.z, productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$4;
                kotlin.b.b(obj2);
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$0 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$1 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$2 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$3 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$4 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$5 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.L$6 = null;
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$12.label = 2;
            }
        }
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1 = new ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1(this, continuation);
        ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1 productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122 = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$1;
        Object obj22 = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.label;
        if (i != 0) {
        }
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.L$0 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.L$1 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.L$2 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.L$3 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.L$4 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.L$5 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.L$6 = null;
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$2$122.label = 2;
    }
}
