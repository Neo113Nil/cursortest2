package com.yandex.messaging.ui.creation.component;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.creation.component.TelemessengerCreationDialogFragment", f = "TelemessengerCreationDialogFragment.kt", l = {71}, m = "getViewModelFactory")
/* loaded from: classes15.dex */
public final class TelemessengerCreationDialogFragment$getViewModelFactory$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TelemessengerCreationDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelemessengerCreationDialogFragment$getViewModelFactory$1(TelemessengerCreationDialogFragment telemessengerCreationDialogFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = telemessengerCreationDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getViewModelFactory(this);
    }
}
