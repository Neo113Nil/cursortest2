package com.yandex.messaging.internal.authorized.sync;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "hasPermission", "syncEnabled"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.internal.authorized.sync.ContactsSyncManager$isContactSyncAllowed$1", f = "ContactsSyncManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsSyncManager$isContactSyncAllowed$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ContactsSyncManager$isContactSyncAllowed$1 contactsSyncManager$isContactSyncAllowed$1 = new ContactsSyncManager$isContactSyncAllowed$1(3, (Continuation) obj3);
        contactsSyncManager$isContactSyncAllowed$1.Z$0 = booleanValue;
        contactsSyncManager$isContactSyncAllowed$1.Z$1 = booleanValue2;
        return contactsSyncManager$isContactSyncAllowed$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(this.Z$0 && this.Z$1);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
