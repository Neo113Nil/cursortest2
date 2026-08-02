package com.yandex.go.overdraft.domain;

import com.yandex.go.overdraft.data.model.TapAction$PayDebtAction;
import com.yandex.go.overdraft.data.model.q0;
import com.yandex.go.overdraft.data.model.r0;
import com.yandex.go.overdraft.data.model.t0;
import defpackage.c4m;
import defpackage.er31;
import defpackage.ez80;
import defpackage.gz80;
import defpackage.hug;
import defpackage.hz80;
import defpackage.iz80;
import defpackage.jz80;
import defpackage.kdc;
import defpackage.kz80;
import defpackage.mt;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zv51;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o b;

    public m(vpr vprVar, o oVar) {
        this.a = vprVar;
        this.b = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e4, code lost:
    
        if (r10.emit(r6, r0) != r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OverdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1 overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1;
        int i;
        o oVar;
        vpr vprVar;
        t0 t0Var;
        kz80 kz80Var;
        kz80 iz80Var;
        zv51 zv51Var;
        zv51 zv51Var2;
        if (continuation instanceof OverdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1) {
            overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1 = (OverdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$0 = null;
                    overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$1 = null;
                    overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$2 = null;
                    overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$5 = null;
                    overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$6 = null;
                    oVar = this.b;
                    overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$7 = oVar;
                    overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.label = 1;
                    Object a = o.a(oVar, (ez80) obj, overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1);
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
                oVar = (o) overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$7;
                vprVar = (vpr) overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                mt mtVar = (mt) obj2;
                oVar.getClass();
                String str = mtVar.a;
                kdc kdcVar = mtVar.b;
                kdc kdcVar2 = mtVar.c;
                t0Var = mtVar.d;
                er31 er31Var = mtVar.e;
                if (t0Var instanceof TapAction$PayDebtAction) {
                    if (t0Var instanceof q0) {
                        if (er31Var != null) {
                            hug hugVar = er31Var instanceof hug ? (hug) er31Var : null;
                            if (hugVar != null) {
                                zv51Var2 = hugVar.a;
                                iz80Var = new hz80(zv51Var2);
                            }
                        }
                        zv51Var2 = null;
                        iz80Var = new hz80(zv51Var2);
                    } else if (t0Var instanceof r0) {
                        if (er31Var != null) {
                            hug hugVar2 = er31Var instanceof hug ? (hug) er31Var : null;
                            if (hugVar2 != null) {
                                zv51Var = hugVar2.a;
                                iz80Var = new iz80(zv51Var);
                            }
                        }
                        zv51Var = null;
                        iz80Var = new iz80(zv51Var);
                    } else {
                        kz80Var = jz80.a;
                    }
                    kz80Var = iz80Var;
                } else {
                    kz80Var = gz80.a;
                }
                c4m c4mVar = new c4m(str, kdcVar2, kdcVar, kz80Var);
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$0 = null;
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$1 = null;
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$2 = null;
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$3 = null;
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$4 = null;
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$5 = null;
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$6 = null;
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$7 = null;
                overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1 = new OverdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        mt mtVar2 = (mt) obj22;
        oVar.getClass();
        String str2 = mtVar2.a;
        kdc kdcVar3 = mtVar2.b;
        kdc kdcVar22 = mtVar2.c;
        t0Var = mtVar2.d;
        er31 er31Var2 = mtVar2.e;
        if (t0Var instanceof TapAction$PayDebtAction) {
        }
        c4m c4mVar2 = new c4m(str2, kdcVar22, kdcVar3, kz80Var);
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$0 = null;
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$1 = null;
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$2 = null;
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$3 = null;
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$4 = null;
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$5 = null;
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$6 = null;
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.L$7 = null;
        overdraftPaymentMainButtonInteractor$getMainButtonStateFlow$$inlined$map$1$2$1.label = 2;
    }
}
