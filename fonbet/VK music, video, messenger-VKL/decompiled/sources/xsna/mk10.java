package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MasterSelectionComponentImpl.kt */
@b6l(c = "com.vk.push.pushsdk.domain.component.MasterSelectionComponentImpl$startMasterElections$1", f = "MasterSelectionComponentImpl.kt", l = {56, 58, 61}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class mk10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onFinish;
    int label;
    final /* synthetic */ nk10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk10(nk10 nk10Var, gzs<s3q0> gzsVar, spj<? super mk10> spjVar) {
        super(2, spjVar);
        this.this$0 = nk10Var;
        this.$onFinish = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mk10(this.this$0, this.$onFinish, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mk10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r1.a.write(new xsna.sap.a(r7), r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r7.a.write(new xsna.sap.a(true), r6) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.this$0.g(false, true);
            sap sapVar = this.this$0.n;
            this.label = 1;
        } else if (i == 1) {
            kotlin.a.a(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$onFinish.invoke();
                return s3q0.a;
            }
            kotlin.a.a(obj);
            c = ((Result) obj).d();
            boolean z = c instanceof Result.Failure;
            this.this$0.g(!z, false);
            sap sapVar2 = this.this$0.n;
            this.label = 3;
        }
        nj10 nj10Var = this.this$0.c;
        this.label = 2;
        c = nj10Var.c(null, this);
    }
}
