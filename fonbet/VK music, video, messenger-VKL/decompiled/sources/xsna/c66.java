package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BaseAuthHostAnalyticsRepository.kt */
@b6l(c = "com.vk.push.authsdk.data.repository.BaseAuthHostAnalyticsRepository", f = "BaseAuthHostAnalyticsRepository.kt", l = {39}, m = "getBaseParams")
/* loaded from: classes5.dex */
public final class c66 extends ContinuationImpl {
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
    final /* synthetic */ b66 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c66(b66 b66Var, spj<? super c66> spjVar) {
        super(spjVar);
        this.this$0 = b66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
