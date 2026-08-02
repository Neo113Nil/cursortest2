package com.yandex.go.suggest.impl.data.flex.cart;

import defpackage.hx;
import defpackage.kui0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappCartActionsInteractor$special$$inlined$map$1$2$1 superappCartActionsInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperappCartActionsInteractor$special$$inlined$map$1$2$1) {
            superappCartActionsInteractor$special$$inlined$map$1$2$1 = (SuperappCartActionsInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = superappCartActionsInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappCartActionsInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappCartActionsInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappCartActionsInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kui0 kui0Var = new kui0(new hx(kotlin.collections.b.f(), "bdui/v1/superapp/cart/actualize", null));
                    superappCartActionsInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    superappCartActionsInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    superappCartActionsInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    superappCartActionsInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    superappCartActionsInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(kui0Var, superappCartActionsInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        superappCartActionsInteractor$special$$inlined$map$1$2$1 = new SuperappCartActionsInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappCartActionsInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappCartActionsInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
