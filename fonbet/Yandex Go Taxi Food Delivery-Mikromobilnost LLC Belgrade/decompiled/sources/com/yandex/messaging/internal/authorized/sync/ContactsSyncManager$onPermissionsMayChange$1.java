package com.yandex.messaging.internal.authorized.sync;

import defpackage.cl21;
import defpackage.d9g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcl21;", "Lzy11;", "<anonymous>", "(Lcl21;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.ContactsSyncManager$onPermissionsMayChange$1", f = "ContactsSyncManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsSyncManager$onPermissionsMayChange$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContactsSyncManager$onPermissionsMayChange$1 contactsSyncManager$onPermissionsMayChange$1 = new ContactsSyncManager$onPermissionsMayChange$1(2, continuation);
        contactsSyncManager$onPermissionsMayChange$1.L$0 = obj;
        return contactsSyncManager$onPermissionsMayChange$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ContactsSyncManager$onPermissionsMayChange$1 contactsSyncManager$onPermissionsMayChange$1 = (ContactsSyncManager$onPermissionsMayChange$1) create((cl21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        contactsSyncManager$onPermissionsMayChange$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g f = ((d9g) ((cl21) this.L$0)).f();
        if (!f.T.isEmpty()) {
            f.a.d();
        }
        return zy11.a;
    }
}
