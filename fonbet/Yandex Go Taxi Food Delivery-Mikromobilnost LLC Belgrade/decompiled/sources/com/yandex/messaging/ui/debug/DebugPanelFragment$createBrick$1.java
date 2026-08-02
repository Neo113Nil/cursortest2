package com.yandex.messaging.ui.debug;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.messaging.ui.debug.DebugPanelFragment", f = "DebugPanelFragment.kt", l = {17}, m = "createBrick")
/* loaded from: classes15.dex */
public final class DebugPanelFragment$createBrick$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DebugPanelFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugPanelFragment$createBrick$1(DebugPanelFragment debugPanelFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = debugPanelFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createBrick(this);
    }
}
