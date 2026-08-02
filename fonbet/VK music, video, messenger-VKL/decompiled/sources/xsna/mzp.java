package xsna;

import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: EventHubApiServiceImpl.kt */
@b6l(c = "com.vk.network.eventhub.impl.EventHubApiServiceImpl$executeApi$2", f = "EventHubApiServiceImpl.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class mzp extends SuspendLambda implements izs<spj<Object>, Object> {
    final /* synthetic */ Map<String, String> $extraParams;
    final /* synthetic */ xy2<Object> $methodCall;
    int label;
    final /* synthetic */ lzp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzp(lzp lzpVar, xy2<Object> xy2Var, Map<String, String> map, spj<? super mzp> spjVar) {
        super(1, spjVar);
        this.this$0 = lzpVar;
        this.$methodCall = xy2Var;
        this.$extraParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new mzp(this.this$0, this.$methodCall, this.$extraParams, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<Object> spjVar) {
        return ((mzp) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        lzp lzpVar = this.this$0;
        xy2<Object> xy2Var = this.$methodCall;
        Map<String, String> map = this.$extraParams;
        this.label = 1;
        Object b = lzp.b(lzpVar, xy2Var, map, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
