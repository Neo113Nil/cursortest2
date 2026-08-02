package com.yandex.plus.home.datasource.local.preferences;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.home.datasource.local.preferences.PreferencesStaticKeyLocalDataSource", f = "PreferencesStaticKeyLocalDataSource.kt", l = {40}, m = "get-gIAlu-s")
/* loaded from: classes8.dex */
final class PreferencesStaticKeyLocalDataSource$get$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesStaticKeyLocalDataSource$get$2(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.b(null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
