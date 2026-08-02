package com.yandex.messaging.ui.settings.contacts;

import defpackage.mvg;
import defpackage.oyr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lzy11;", "<anonymous>", "(Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.contacts.ContactsSettingsFragment$ContactsScreen$2$onBackPressed$1", f = "ContactsSettingsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsSettingsFragment$ContactsScreen$2$onBackPressed$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContactsSettingsFragment$ContactsScreen$2$onBackPressed$1 contactsSettingsFragment$ContactsScreen$2$onBackPressed$1 = new ContactsSettingsFragment$ContactsScreen$2$onBackPressed$1(2, continuation);
        contactsSettingsFragment$ContactsScreen$2$onBackPressed$1.L$0 = obj;
        return contactsSettingsFragment$ContactsScreen$2$onBackPressed$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        ((ContactsSettingsFragment$ContactsScreen$2$onBackPressed$1) create(null, (Continuation) obj2)).invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        throw oyr.d(this.L$0);
    }
}
