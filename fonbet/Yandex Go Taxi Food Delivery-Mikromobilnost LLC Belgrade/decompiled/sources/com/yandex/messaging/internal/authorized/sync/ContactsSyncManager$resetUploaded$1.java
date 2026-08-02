package com.yandex.messaging.internal.authorized.sync;

import android.content.SharedPreferences;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.ContactsSyncManager$resetUploaded$1", f = "ContactsSyncManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsSyncManager$resetUploaded$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSyncManager$resetUploaded$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactsSyncManager$resetUploaded$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ContactsSyncManager$resetUploaded$1 contactsSyncManager$resetUploaded$1 = (ContactsSyncManager$resetUploaded$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        contactsSyncManager$resetUploaded$1.invokeSuspend(zy11Var);
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
        d dVar = this.this$0;
        SharedPreferences sharedPreferences = dVar.c;
        dVar.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("contacts_uploaded_vers");
        edit.commit();
        return zy11.a;
    }
}
