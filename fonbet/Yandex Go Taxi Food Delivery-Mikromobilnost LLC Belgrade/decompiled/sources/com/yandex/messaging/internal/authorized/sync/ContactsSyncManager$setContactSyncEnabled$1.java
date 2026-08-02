package com.yandex.messaging.internal.authorized.sync;

import android.content.SharedPreferences;
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
@mvg(c = "com.yandex.messaging.internal.authorized.sync.ContactsSyncManager$setContactSyncEnabled$1", f = "ContactsSyncManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsSyncManager$setContactSyncEnabled$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $value;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSyncManager$setContactSyncEnabled$1(d dVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$value = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContactsSyncManager$setContactSyncEnabled$1 contactsSyncManager$setContactSyncEnabled$1 = new ContactsSyncManager$setContactSyncEnabled$1(this.this$0, this.$value, continuation);
        contactsSyncManager$setContactSyncEnabled$1.L$0 = obj;
        return contactsSyncManager$setContactSyncEnabled$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ContactsSyncManager$setContactSyncEnabled$1 contactsSyncManager$setContactSyncEnabled$1 = (ContactsSyncManager$setContactSyncEnabled$1) create((cl21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        contactsSyncManager$setContactSyncEnabled$1.invokeSuspend(zy11Var);
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
        cl21 cl21Var = (cl21) this.L$0;
        SharedPreferences sharedPreferences = this.this$0.d;
        boolean z = this.$value;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        d9g d9gVar = (d9g) cl21Var;
        edit.putString("CONTACT_SYNC_ENABLED_FOR_GUID", z ? d9gVar.a.a : null);
        edit.commit();
        boolean z2 = this.$value;
        zy11 zy11Var = zy11.a;
        if (!z2) {
            ((com.yandex.messaging.contacts.sync.b) d9gVar.q.get()).i();
            return zy11Var;
        }
        g f = d9gVar.f();
        if (!f.T.isEmpty()) {
            f.a.d();
        }
        return zy11Var;
    }
}
