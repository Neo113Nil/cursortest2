package com.ybsdk.feature.autotopup.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository", f = "AutoTopupSetupRepository.kt", l = {NetworkRequestException.BANNED, 464}, m = "saveAutoTopupV2-tZkwj4A")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$saveAutoTopupV2$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$saveAutoTopupV2$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object n = this.this$0.n(null, null, null, null, null, null, null, null, this);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : new Result(n);
    }
}
