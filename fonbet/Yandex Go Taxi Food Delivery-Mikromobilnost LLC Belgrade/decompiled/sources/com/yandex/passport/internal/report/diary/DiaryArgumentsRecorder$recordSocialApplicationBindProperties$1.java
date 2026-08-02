package com.yandex.passport.internal.report.diary;

import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryArgumentsRecorder", f = "DiaryArgumentsRecorder.kt", l = {476, 481, 486, 491, 496, RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND}, m = "recordSocialApplicationBindProperties")
/* loaded from: classes15.dex */
final class DiaryArgumentsRecorder$recordSocialApplicationBindProperties$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryArgumentsRecorder$recordSocialApplicationBindProperties$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.r(null, null, null, this);
    }
}
