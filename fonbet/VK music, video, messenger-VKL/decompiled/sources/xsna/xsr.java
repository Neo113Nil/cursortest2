package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Delay.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", l = {307, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class xsr extends SuspendLambda implements wzs<zhd0<? super s3q0>, spj<? super s3q0>, Object> {
    final /* synthetic */ long $delayMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsr(long j, spj<? super xsr> spjVar) {
        super(2, spjVar);
        this.$delayMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xsr xsrVar = new xsr(this.$delayMillis, spjVar);
        xsrVar.L$0 = obj;
        return xsrVar;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super s3q0> zhd0Var, spj<? super s3q0> spjVar) {
        return ((xsr) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (xsna.qsl.b(r4, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r8.e.t(r4, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (xsna.qsl.b(r5, r7) == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:12:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    zhd0Var = (zhd0) this.L$0;
                    kotlin.a.a(obj);
                    long j = this.$delayMillis;
                    this.L$0 = zhd0Var;
                    this.label = 3;
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            zhd0Var = (zhd0) this.L$0;
            kotlin.a.a(obj);
        } else {
            kotlin.a.a(obj);
            zhd0Var = (zhd0) this.L$0;
            long j2 = this.$delayMillis;
            this.L$0 = zhd0Var;
            this.label = 1;
        }
        whd0 channel = zhd0Var.getChannel();
        s3q0 s3q0Var = s3q0.a;
        this.L$0 = zhd0Var;
        this.label = 2;
    }
}
