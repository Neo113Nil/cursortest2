package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelFlow.kt */
@b6l(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class qya extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ lsr<Object> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sya<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qya(lsr<Object> lsrVar, sya<Object> syaVar, spj<? super qya> spjVar) {
        super(2, spjVar);
        this.$collector = lsrVar;
        this.this$0 = syaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        qya qyaVar = new qya(this.$collector, this.this$0, spjVar);
        qyaVar.L$0 = obj;
        return qyaVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qya) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            lsr<Object> lsrVar = this.$collector;
            b9f0<Object> i2 = this.this$0.i(yvjVar);
            this.label = 1;
            Object a = tsr.a(lsrVar, i2, true, this);
            if (a != obj2) {
                a = s3q0.a;
            }
            if (a == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
