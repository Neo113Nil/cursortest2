package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Merge.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ltr extends SuspendLambda implements yzs<lsr<Object>, Object, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<Object, spj<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ltr(wzs<Object, ? super spj<Object>, ? extends Object> wzsVar, spj<? super ltr> spjVar) {
        super(3, spjVar);
        this.$transform = wzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(lsr<Object> lsrVar, Object obj, spj<? super s3q0> spjVar) {
        ltr ltrVar = new ltr(this.$transform, spjVar);
        ltrVar.L$0 = lsrVar;
        ltrVar.L$1 = obj;
        return ltrVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lsr lsrVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lsrVar = (lsr) this.L$0;
            Object obj2 = this.L$1;
            wzs<Object, spj<Object>, Object> wzsVar = this.$transform;
            this.L$0 = lsrVar;
            this.label = 1;
            obj = wzsVar.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            lsrVar = (lsr) this.L$0;
            kotlin.a.a(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
