package com.yandex.messaging.domain.personal.organization.employee;

import defpackage.il01;
import defpackage.ny61;
import defpackage.uun;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ uun b;
    public final /* synthetic */ String c;

    public a(vpr vprVar, uun uunVar, String str) {
        this.a = vprVar;
        this.b = uunVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EmployeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1 employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof EmployeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1) {
            employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1 = (EmployeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = (String) androidx.room.util.a.b(this.b.h.a, true, false, new il01(this.c, 18));
                    employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1 = new EmployeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = employeeController$getCurrentEmployeeFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
