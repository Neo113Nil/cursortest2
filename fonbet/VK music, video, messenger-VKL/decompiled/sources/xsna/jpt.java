package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetAllInstalledHostsUseCase.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.masterhost.GetAllInstalledHostsUseCase", f = "GetAllInstalledHostsUseCase.kt", l = {20}, m = "invoke-IoAF18A")
/* loaded from: classes5.dex */
public final class jpt extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kpt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpt(kpt kptVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kptVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
