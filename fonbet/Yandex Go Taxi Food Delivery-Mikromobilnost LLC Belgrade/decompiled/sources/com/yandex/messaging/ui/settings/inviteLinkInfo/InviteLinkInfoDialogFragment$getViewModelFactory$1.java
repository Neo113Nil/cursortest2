package com.yandex.messaging.ui.settings.inviteLinkInfo;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.settings.inviteLinkInfo.InviteLinkInfoDialogFragment", f = "InviteLinkInfoDialogFragment.kt", l = {32}, m = "getViewModelFactory")
/* loaded from: classes15.dex */
public final class InviteLinkInfoDialogFragment$getViewModelFactory$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InviteLinkInfoDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteLinkInfoDialogFragment$getViewModelFactory$1(InviteLinkInfoDialogFragment inviteLinkInfoDialogFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = inviteLinkInfoDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getViewModelFactory(this);
    }
}
