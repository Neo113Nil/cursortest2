package com.yandex.go.safety.center;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.safety.center.SafetyCenterProvider", f = "SafetyCenterProvider.kt", l = {256, 257}, m = "accident", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterProvider$accident$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterProvider$accident$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
