package com.yandex.go.inapp_calls.interactor.permissions;

import defpackage.ny61;
import defpackage.v7j0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final v7j0 a;

    public a(v7j0 v7j0Var) {
        this.a = v7j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1 inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1;
        int i;
        if (continuationImpl instanceof InAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1) {
            inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1 = (InAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1) continuationImpl;
            int i2 = inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1.label;
                if (i != 0) {
                    b.b(obj);
                    inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1.label = 1;
                    if (((com.yandex.go.permission.b) this.a).d(12, inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1 = new InAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1(this, continuationImpl);
        Object obj2 = inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsPermissionsInteractor$requestNotificationsPermissionIfNeed$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
