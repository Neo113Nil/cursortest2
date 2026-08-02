package com.yandex.go.payments.shared.family.viewmodels;

import defpackage.ny61;
import defpackage.sap;
import defpackage.tap;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FamilyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1 familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FamilyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1) {
            familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1 = (FamilyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    sap sapVar = (sap) obj;
                    tap tapVar = new tap(sapVar.a, sapVar.b, sapVar.c, sapVar.d, sapVar.e, sapVar.f, sapVar.g, sapVar.h, sapVar.j);
                    familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                    familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                    familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                    familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                    familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(tapVar, familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1 = new FamilyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familyGroupMenuItemInteractorImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
