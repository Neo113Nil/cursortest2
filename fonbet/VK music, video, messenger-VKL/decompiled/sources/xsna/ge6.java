package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BaseHostAnalyticsRepository.kt */
@b6l(c = "com.vk.push.pushsdk.data.repository.BaseHostAnalyticsRepository", f = "BaseHostAnalyticsRepository.kt", l = {39}, m = "getBaseParams")
/* loaded from: classes.dex */
public final class ge6 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fe6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge6(fe6 fe6Var, spj<? super ge6> spjVar) {
        super(spjVar);
        this.this$0 = fe6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
