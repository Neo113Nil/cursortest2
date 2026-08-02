package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InsertTestPushTokenUseCaseImpl.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.data.InsertTestPushTokenUseCaseImpl", f = "InsertTestPushTokenUseCaseImpl.kt", l = {17, 19}, m = "invoke")
/* loaded from: classes5.dex */
public final class x3x extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y3x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3x(y3x y3xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = y3xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
