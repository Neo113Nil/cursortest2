package com.yandex.go.mainscreen.superapp.popup.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.popup.data.SuperAppMainScreenPopupRepository", f = "SuperAppMainScreenPopupRepository.kt", l = {147, 150, 152, 154}, m = "reportSuperAppFallbackBehaviourExperiment", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, null, this);
    }
}
