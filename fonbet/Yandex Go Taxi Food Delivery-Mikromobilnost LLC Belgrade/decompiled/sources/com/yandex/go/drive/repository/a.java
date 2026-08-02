package com.yandex.go.drive.repository;

import defpackage.jnt;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
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
        DriveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1 driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof DriveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1) {
            driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1 = (DriveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1) continuation;
            int i2 = driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    jnt jntVar = (jnt) obj;
                    if (jntVar == null || (obj2 = jntVar.a) == null) {
                        obj2 = EmptyList.a;
                    }
                    driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.L$0 = null;
                    driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.L$1 = null;
                    driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.L$2 = null;
                    driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.L$3 = null;
                    driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1 = new DriveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1(this, continuation);
        Object obj32 = driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveMultiOrderRepositoryImpl$ordersState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
