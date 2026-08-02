package com.yandex.go.ultima_mode.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.ultima_mode.domain.UltimaModeStateInteractorImpl", f = "UltimaModeStateInteractorImpl.kt", l = {60, 64}, m = "getUltimaAppearanceState", v = 2)
/* loaded from: classes8.dex */
final class UltimaModeStateInteractorImpl$getUltimaAppearanceState$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UltimaModeStateInteractorImpl$getUltimaAppearanceState$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
