package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoroutineApiRequest.kt */
@b6l(c = "com.vk.api.request.coroutine.CoroutineApiRequest$execute$2", f = "CoroutineApiRequest.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class dvj extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ izs<VKApiExecutionException, Object> $apiErrorToResponse;
    int label;
    final /* synthetic */ evj<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dvj(evj<Object> evjVar, izs<? super VKApiExecutionException, Object> izsVar, spj<? super dvj> spjVar) {
        super(2, spjVar);
        this.this$0 = evjVar;
        this.$apiErrorToResponse = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dvj(this.this$0, this.$apiErrorToResponse, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((dvj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        vx2.d.getClass();
        try {
            try {
                this.this$0.getClass();
                evj<Object> evjVar = this.this$0;
                vx2.a.getClass();
                obj2 = evjVar.f(vx2.b());
            } catch (VKApiExecutionException e) {
                izs<VKApiExecutionException, Object> izsVar = this.$apiErrorToResponse;
                if (izsVar == null) {
                    throw e;
                }
                Object invoke = izsVar.invoke(e);
                if (invoke == null) {
                    throw e;
                }
                obj2 = invoke;
            } catch (IOException e2) {
                L.i(e2);
                throw new VKApiExecutionException(-1, this.this$0.b, true, vx2.d.getContext().getString(R.string.default_network_error), null, null, null, null, 0, null, null, e2, 2032);
            }
            vx2.d.p(this.this$0);
            return obj2;
        } catch (Throwable th) {
            vx2.d.getClass();
            throw th;
        }
    }
}
