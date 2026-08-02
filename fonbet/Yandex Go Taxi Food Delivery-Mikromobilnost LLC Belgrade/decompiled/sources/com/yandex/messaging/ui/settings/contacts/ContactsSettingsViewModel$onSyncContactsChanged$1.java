package com.yandex.messaging.ui.settings.contacts;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sde;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.contacts.ContactsSettingsViewModel$onSyncContactsChanged$1", f = "ContactsSettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsSettingsViewModel$onSyncContactsChanged$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSettingsViewModel$onSyncContactsChanged$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactsSettingsViewModel$onSyncContactsChanged$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ContactsSettingsViewModel$onSyncContactsChanged$1 contactsSettingsViewModel$onSyncContactsChanged$1 = (ContactsSettingsViewModel$onSyncContactsChanged$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        contactsSettingsViewModel$onSyncContactsChanged$1.invokeSuspend(zy11Var);
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
        c cVar = this.this$0;
        cVar.y.reportEvent("contacts_settings_permission_requested", c.Z(cVar));
        this.this$0.X(sde.a);
        return zy11.a;
    }
}
