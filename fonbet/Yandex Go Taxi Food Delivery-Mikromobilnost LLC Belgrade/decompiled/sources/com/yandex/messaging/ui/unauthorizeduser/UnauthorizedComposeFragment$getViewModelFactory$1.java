package com.yandex.messaging.ui.unauthorizeduser;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.unauthorizeduser.UnauthorizedComposeFragment", f = "UnauthorizedComposeFragment.kt", l = {23}, m = "getViewModelFactory")
/* loaded from: classes15.dex */
public final class UnauthorizedComposeFragment$getViewModelFactory$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UnauthorizedComposeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnauthorizedComposeFragment$getViewModelFactory$1(UnauthorizedComposeFragment unauthorizedComposeFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = unauthorizedComposeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getViewModelFactory(this);
    }
}
