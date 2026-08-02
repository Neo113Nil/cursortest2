package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClearVkpnsPushDatabaseUseCase.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.data.ClearVkpnsPushDatabaseUseCase", f = "ClearVkpnsPushDatabaseUseCase.kt", l = {14, 15, 16}, m = "invoke")
/* loaded from: classes5.dex */
public final class ric extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ sic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ric(sic sicVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sicVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
