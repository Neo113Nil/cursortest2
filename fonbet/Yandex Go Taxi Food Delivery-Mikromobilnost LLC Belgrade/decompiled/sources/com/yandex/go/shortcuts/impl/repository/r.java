package com.yandex.go.shortcuts.impl.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.uc4;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class r implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ s b;
    public final /* synthetic */ List c;
    public final /* synthetic */ yaf0 w;
    public final /* synthetic */ List x;
    public final /* synthetic */ zzs y;
    public final /* synthetic */ uc4 z;

    public r(tpr tprVar, s sVar, List list, yaf0 yaf0Var, List list2, zzs zzsVar, uc4 uc4Var) {
        this.a = tprVar;
        this.b = sVar;
        this.c = list;
        this.w = yaf0Var;
        this.x = list2;
        this.y = zzsVar;
        this.z = uc4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$1 productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1;
        int i;
        if (continuation instanceof ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$1) {
            productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1 = (ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$1) continuation;
            int i2 = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q qVar = new q(vprVar, this.b, this.c, this.w, this.x, this.y, this.z);
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.L$0 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.L$1 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.L$2 = null;
                    productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.label = 1;
                    if (this.a.collect(qVar, productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1 = new ProductsParamsStateFactoryImpl$observeParam$$inlined$map$4$1(this, continuation);
        Object obj2 = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsParamsStateFactoryImpl$observeParam$$inlined$map$4$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
