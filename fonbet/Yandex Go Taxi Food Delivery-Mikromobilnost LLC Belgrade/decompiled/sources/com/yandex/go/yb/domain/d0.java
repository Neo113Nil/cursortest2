package com.yandex.go.yb.domain;

import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import defpackage.jw51;
import defpackage.nw51;
import defpackage.ny61;
import defpackage.py51;
import defpackage.rsn;
import defpackage.uv51;
import defpackage.uy51;
import defpackage.vpr;
import defpackage.vy51;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f0 b;

    public d0(vpr vprVar, f0 f0Var) {
        this.a = vprVar;
        this.b = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1 ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        String a;
        Object obj3;
        String str;
        if (continuation instanceof YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    rsn rsnVar = (rsn) obj;
                    py51 py51Var = this.b.h;
                    nw51 nw51Var = (nw51) rsnVar.a;
                    if (nw51Var != null) {
                        nw51 nw51Var2 = (nw51) rsnVar.b;
                        py51Var.getClass();
                        String a2 = py51.a(nw51Var2);
                        if (a2 != null && a2.length() != 0 && ((a = py51.a(nw51Var)) == null || a.length() == 0)) {
                            if (nw51Var2 instanceof jw51) {
                                Iterator it = ((jw51) nw51Var2).c.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it.next();
                                    if (((uv51) obj3).d == YbSdkPaymentMethodInfo$ProductType.WALLET) {
                                        break;
                                    }
                                }
                                uv51 uv51Var = (uv51) obj3;
                                if (uv51Var != null) {
                                    str = uv51Var.a;
                                    if (str != null) {
                                        obj2 = new uy51(str);
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            str = null;
                            if (str != null) {
                            }
                        } else if (py51.a(nw51Var2) != null && py51.a(nw51Var) != null) {
                            obj2 = vy51.a;
                            if (obj2 != null) {
                                ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                                ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                                ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                                ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                                ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                                ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                                if (this.a.emit(obj2, ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    obj2 = null;
                    if (obj2 != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj4);
                }
                return zy11.a;
            }
        }
        ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new YbWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj42 = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybWalletOpenedUpdateStateInteractor$observeYbWalletInternal$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
