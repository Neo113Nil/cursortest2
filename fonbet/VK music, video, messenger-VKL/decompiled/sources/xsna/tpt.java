package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetAuthDataUseCase.kt */
@b6l(c = "com.vk.push.authsdk.domain.usecase.GetAuthDataUseCase", f = "GetAuthDataUseCase.kt", l = {48, 52, 55}, m = "getPlainAuthToken")
/* loaded from: classes5.dex */
public final class tpt extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wpt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpt(wpt wptVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wptVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
