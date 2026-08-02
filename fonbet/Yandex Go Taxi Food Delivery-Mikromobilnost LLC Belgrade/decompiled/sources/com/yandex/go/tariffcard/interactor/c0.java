package com.yandex.go.tariffcard.interactor;

import defpackage.bnx0;
import defpackage.f6v;
import defpackage.h6v;
import defpackage.hhs0;
import defpackage.kdd0;
import defpackage.ny61;
import defpackage.pmx0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ hhs0 b;

    public c0(vpr vprVar, hhs0 hhs0Var) {
        this.a = vprVar;
        this.b = hhs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1 tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1;
        int i;
        pmx0 pmx0Var;
        if (continuation instanceof TariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1) {
            tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1 = (TariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1) continuation;
            int i2 = tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f6v f6vVar = (f6v) obj;
                    h6v h6vVar = f6vVar.a;
                    bnx0 bnx0Var = (bnx0) f6vVar.b;
                    if (bnx0Var.b.isEmpty()) {
                        pmx0Var = null;
                    } else {
                        String str = bnx0Var.a;
                        kdd0 kdd0Var = (kdd0) this.b.c;
                        List list = bnx0Var.b;
                        kdd0Var.getClass();
                        pmx0Var = new pmx0(str, kdd0.i(list));
                    }
                    f6v f6vVar2 = new f6v(h6vVar, pmx0Var);
                    tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.L$0 = null;
                    tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.L$1 = null;
                    tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.L$2 = null;
                    tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.L$3 = null;
                    tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.label = 1;
                    if (this.a.emit(f6vVar2, tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1) == coroutineSingletons) {
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
        tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1 = new TariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1(this, continuation);
        Object obj22 = tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffRulesRequirementsItemsInteractor$itemsFlow$$inlined$mapIdentifiable$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
