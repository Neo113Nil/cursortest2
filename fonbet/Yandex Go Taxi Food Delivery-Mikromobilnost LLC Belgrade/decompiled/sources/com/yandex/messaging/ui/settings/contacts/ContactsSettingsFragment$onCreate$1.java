package com.yandex.messaging.ui.settings.contacts;

import defpackage.eyc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.contacts.ContactsSettingsFragment$onCreate$1", f = "ContactsSettingsFragment.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ContactsSettingsFragment$onCreate$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ ContactsSettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSettingsFragment$onCreate$1(ContactsSettingsFragment contactsSettingsFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = contactsSettingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactsSettingsFragment$onCreate$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactsSettingsFragment$onCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eyc eycVar;
        noh activityComponentAsync;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            eycVar = this.this$0.fragmentComponent;
            activityComponentAsync = this.this$0.getActivityComponentAsync();
            this.L$0 = eycVar;
            this.label = 1;
            obj = activityComponentAsync.k(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        throw oyr.d(obj);
    }
}
