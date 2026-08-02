package com.yandex.messaging.ui.settings.contacts;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yde;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "allowed", "wasUploaded", "isDeletingInProgress", "Lyde;", "<anonymous>", "(ZZZ)Lyde;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.contacts.ContactsSettingsViewModel$uiState$1", f = "ContactsSettingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsSettingsViewModel$uiState$1 extends SuspendLambda implements bms {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSettingsViewModel$uiState$1(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        ContactsSettingsViewModel$uiState$1 contactsSettingsViewModel$uiState$1 = new ContactsSettingsViewModel$uiState$1(this.this$0, (Continuation) obj4);
        contactsSettingsViewModel$uiState$1.Z$0 = booleanValue;
        contactsSettingsViewModel$uiState$1.Z$1 = booleanValue2;
        contactsSettingsViewModel$uiState$1.Z$2 = booleanValue3;
        return contactsSettingsViewModel$uiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new yde(this.Z$0, true, this.Z$1, this.Z$2, this.this$0.B);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
