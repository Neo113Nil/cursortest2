package com.yandex.go.tariffcard.interactor;

import defpackage.aij0;
import defpackage.f6v;
import defpackage.h6v;
import defpackage.ioj0;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.summary.requirements.list.models.RequirementsDueViewPosition;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ nw70 b;

    public h(vpr vprVar, nw70 nw70Var) {
        this.a = vprVar;
        this.b = nw70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PreorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1 preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PreorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1) {
            preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1 = (PreorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1) continuation;
            int i2 = preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f6v f6vVar = (f6v) obj;
                    h6v h6vVar = f6vVar.a;
                    ioj0 ioj0Var = (ioj0) f6vVar.b;
                    this.b.getClass();
                    f6v f6vVar2 = new f6v(h6vVar, (ioj0Var.a.length() <= 0 || ioj0Var.g != RequirementsDueViewPosition.GLUED) ? null : new aij0(ioj0Var, ioj0Var.h, false, false));
                    preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.L$0 = null;
                    preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.L$1 = null;
                    preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.L$2 = null;
                    preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.L$3 = null;
                    preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f6vVar2, preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1 = new PreorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderDueGluedItemInteractor$itemFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
