package com.yandex.messaging.domain.organizations;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.w4b0;
import defpackage.x4b0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        HasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1 hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof HasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1) {
            hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1 = (HasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1) continuation;
            int i2 = hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x4b0 x4b0Var = (x4b0) obj;
                    w4b0[] w4b0VarArr = x4b0Var.j;
                    ArrayList arrayList = new ArrayList();
                    for (w4b0 w4b0Var : w4b0VarArr) {
                        if (!w4b0Var.e && !w4b0Var.d && w4b0Var.a != 0) {
                            arrayList.add(w4b0Var);
                        }
                    }
                    Boolean valueOf = Boolean.valueOf((x4b0Var.l ? arrayList.size() : arrayList.size() + 1) > 1);
                    hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1 = new HasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hasPersonalOrganizationsUseCase$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
