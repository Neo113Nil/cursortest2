package com.yandex.go.drive.sdkintegration.domain.session;

import defpackage.fnt;
import defpackage.jnt;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DriveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1 driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof DriveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1) {
            driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1 = (DriveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1) continuation;
            int i2 = driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    jnt jntVar = (jnt) obj;
                    if (jntVar != null) {
                        List list = jntVar.a;
                        obj2 = new ArrayList(tcc.n(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            obj2.add(((fnt) it.next()).f());
                        }
                    } else {
                        obj2 = EmptyList.a;
                    }
                    driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.L$0 = null;
                    driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.L$1 = null;
                    driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.L$2 = null;
                    driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.L$3 = null;
                    driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1) == obj4) {
                        return obj4;
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
        driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1 = new DriveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveSessionInteractorImpl$activeDriveSessionsIdsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
