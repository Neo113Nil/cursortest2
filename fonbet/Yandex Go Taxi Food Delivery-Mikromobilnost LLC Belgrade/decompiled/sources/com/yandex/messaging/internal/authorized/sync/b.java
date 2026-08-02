package com.yandex.messaging.internal.authorized.sync;

import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.messaging.contacts.PermissionState;
import defpackage.eke;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ eke b;

    public b(vpr vprVar, eke ekeVar) {
        this.a = vprVar;
        this.b = ekeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ContactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1 contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ContactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1) {
            contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1 = (ContactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((Boolean) obj).getClass();
                    PermissionState a = this.b.a(Permission.READ_CONTACTS);
                    contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1 = new ContactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactsSyncManager$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
