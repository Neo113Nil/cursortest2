package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* compiled from: EventHubApiServiceImpl.kt */
@b6l(c = "com.vk.network.eventhub.impl.EventHubApiServiceImpl$awaitResponse$2", f = "EventHubApiServiceImpl.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class kzp extends SuspendLambda implements wzs<yvj, spj<? super JSONObject>, Object> {
    final /* synthetic */ n7i<JSONObject> $deferred;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzp(n7i<JSONObject> n7iVar, spj<? super kzp> spjVar) {
        super(2, spjVar);
        this.$deferred = n7iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kzp(this.$deferred, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super JSONObject> spjVar) {
        return ((kzp) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        n7i<JSONObject> n7iVar = this.$deferred;
        this.label = 1;
        Object H = n7iVar.H(this);
        return H == coroutineSingletons ? coroutineSingletons : H;
    }
}
