package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ReportViewModel.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportViewModel", f = "ReportViewModel.kt", l = {186}, m = "sendMessage-0E7RQCE")
/* loaded from: classes4.dex */
public final class l6g0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n6g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6g0(n6g0 n6g0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = n6g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object i = n6g0.i(this.this$0, null, null, this);
        return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : new Result(i);
    }
}
