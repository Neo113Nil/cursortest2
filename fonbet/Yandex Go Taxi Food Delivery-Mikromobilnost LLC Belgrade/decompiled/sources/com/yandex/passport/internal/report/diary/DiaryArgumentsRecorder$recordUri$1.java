package com.yandex.passport.internal.report.diary;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryArgumentsRecorder", f = "DiaryArgumentsRecorder.kt", l = {948}, m = "recordUri-0E7RQCE")
/* loaded from: classes15.dex */
final class DiaryArgumentsRecorder$recordUri$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryArgumentsRecorder$recordUri$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object x = this.this$0.x(null, null, this);
        return x == CoroutineSingletons.COROUTINE_SUSPENDED ? x : new Result(x);
    }
}
