package com.yandex.go.mainscreen.superapp.impl.foundation.domain;

import defpackage.ny61;
import defpackage.uaw0;
import defpackage.vaw0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.waw0;
import defpackage.xir;
import defpackage.yir;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1 superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        Object yirVar;
        if (continuation instanceof SuperappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1) {
            superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1 = (SuperappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    waw0 waw0Var = (waw0) obj;
                    if (waw0Var instanceof uaw0) {
                        uaw0 uaw0Var = (uaw0) waw0Var;
                        yirVar = new xir(uaw0Var.a, uaw0Var.b);
                    } else {
                        if (!(waw0Var instanceof vaw0)) {
                            w511.b();
                            return null;
                        }
                        vaw0 vaw0Var = (vaw0) waw0Var;
                        yirVar = new yir(vaw0Var.d, vaw0Var.a, vaw0Var.b, vaw0Var.c);
                    }
                    superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(yirVar, superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1 = new SuperappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
