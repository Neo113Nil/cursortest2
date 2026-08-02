package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InsertPushTokenUseCaseImpl.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.data.InsertPushTokenUseCaseImpl", f = "InsertPushTokenUseCaseImpl.kt", l = {16, 18}, m = "invoke")
/* loaded from: classes5.dex */
public final class v3x extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w3x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3x(w3x w3xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = w3xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
