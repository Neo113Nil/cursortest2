package com.yandex.passport.internal.report.diary;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryUploadUseCase", f = "DiaryUploadUseCase.kt", l = {99}, m = "uploadDiaryMethodsForDay-sWi9020")
/* loaded from: classes15.dex */
final class DiaryUploadUseCase$uploadDiaryMethodsForDay$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryUploadUseCase$uploadDiaryMethodsForDay$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return o.c(this.this$0, 0L, 0L, null, this);
    }
}
