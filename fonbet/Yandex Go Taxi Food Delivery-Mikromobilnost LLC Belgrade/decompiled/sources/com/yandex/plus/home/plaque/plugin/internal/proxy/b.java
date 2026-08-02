package com.yandex.plus.home.plaque.plugin.internal.proxy;

import defpackage.jmc0;
import defpackage.kmc0;
import defpackage.lmc0;
import defpackage.mmc0;
import defpackage.nmc0;
import defpackage.ny61;
import defpackage.shd0;
import defpackage.thd0;
import defpackage.uhd0;
import defpackage.vhd0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProxyPlusPlaqueComponent$special$$inlined$map$1$2$1 proxyPlusPlaqueComponent$special$$inlined$map$1$2$1;
        int i;
        Object vhd0Var;
        if (continuation instanceof ProxyPlusPlaqueComponent$special$$inlined$map$1$2$1) {
            proxyPlusPlaqueComponent$special$$inlined$map$1$2$1 = (ProxyPlusPlaqueComponent$special$$inlined$map$1$2$1) continuation;
            int i2 = proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nmc0 nmc0Var = (nmc0) obj;
                    if (nmc0Var instanceof kmc0) {
                        kmc0 kmc0Var = (kmc0) nmc0Var;
                        vhd0Var = new thd0(kmc0Var.b(), kmc0Var.a());
                    } else if (nmc0Var instanceof lmc0) {
                        lmc0 lmc0Var = (lmc0) nmc0Var;
                        vhd0Var = new uhd0(lmc0Var.b(), lmc0Var.a());
                    } else if (nmc0Var instanceof jmc0) {
                        jmc0 jmc0Var = (jmc0) nmc0Var;
                        vhd0Var = new shd0(jmc0Var.a(), jmc0Var.c(), jmc0Var.b());
                    } else {
                        if (!(nmc0Var instanceof mmc0)) {
                            w511.b();
                            return null;
                        }
                        vhd0Var = new vhd0(((mmc0) nmc0Var).a());
                    }
                    proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.L$0 = null;
                    proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.L$1 = null;
                    proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.L$2 = null;
                    proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.L$3 = null;
                    proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.I$0 = 0;
                    proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(vhd0Var, proxyPlusPlaqueComponent$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        proxyPlusPlaqueComponent$special$$inlined$map$1$2$1 = new ProxyPlusPlaqueComponent$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = proxyPlusPlaqueComponent$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
