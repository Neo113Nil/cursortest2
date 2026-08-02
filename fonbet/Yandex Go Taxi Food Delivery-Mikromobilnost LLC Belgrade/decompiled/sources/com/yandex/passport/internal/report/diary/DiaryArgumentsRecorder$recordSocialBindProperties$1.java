package com.yandex.passport.internal.report.diary;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryArgumentsRecorder", f = "DiaryArgumentsRecorder.kt", l = {444, 449, NetworkRequestException.BANNED, 459, 464}, m = "recordSocialBindProperties")
/* loaded from: classes15.dex */
final class DiaryArgumentsRecorder$recordSocialBindProperties$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryArgumentsRecorder$recordSocialBindProperties$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(null, null, null, this);
    }
}
