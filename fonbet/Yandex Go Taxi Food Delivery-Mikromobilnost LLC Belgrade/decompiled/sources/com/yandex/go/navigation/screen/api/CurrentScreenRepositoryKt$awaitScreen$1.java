package com.yandex.go.navigation.screen.api;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigation.screen.api.CurrentScreenRepositoryKt", f = "CurrentScreenRepository.kt", l = {41}, m = "awaitScreen", v = 2)
/* loaded from: classes12.dex */
final class CurrentScreenRepositoryKt$awaitScreen$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public CurrentScreenRepositoryKt$awaitScreen$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, null, this);
    }
}
