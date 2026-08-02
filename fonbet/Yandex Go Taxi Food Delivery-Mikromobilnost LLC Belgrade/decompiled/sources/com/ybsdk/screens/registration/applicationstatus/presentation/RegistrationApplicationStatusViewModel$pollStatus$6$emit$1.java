package com.ybsdk.screens.registration.applicationstatus.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusViewModel$pollStatus$6", f = "RegistrationApplicationStatusViewModel.kt", l = {246}, m = "emit")
/* loaded from: classes2.dex */
final class RegistrationApplicationStatusViewModel$pollStatus$6$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationApplicationStatusViewModel$pollStatus$6$emit$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
