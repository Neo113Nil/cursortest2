package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HealthConnectClientAggregationExtensions.kt */
@b6l(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1", f = "HealthConnectClientAggregationExtensions.kt", l = {173, 174}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class jzu extends SuspendLambda implements wzs<lsr<? super List<Object>>, spj<? super s3q0>, Object> {
    final /* synthetic */ j7f0<Object> $request;
    final /* synthetic */ czu $this_readRecordsFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzu(j7f0<Object> j7f0Var, czu czuVar, spj<? super jzu> spjVar) {
        super(2, spjVar);
        this.$request = j7f0Var;
        this.$this_readRecordsFlow = czuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jzu jzuVar = new jzu(this.$request, this.$this_readRecordsFlow, spjVar);
        jzuVar.L$0 = obj;
        return jzuVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super List<Object>> lsrVar, spj<? super s3q0> spjVar) {
        return ((jzu) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r5.emit(r13, r12) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lsr lsrVar;
        j7f0<Object> j7f0Var;
        lsr lsrVar2;
        j7f0<Object> j7f0Var2;
        k7f0 k7f0Var;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lsrVar = (lsr) this.L$0;
            j7f0Var = this.$request;
            czu czuVar = this.$this_readRecordsFlow;
            this.L$0 = lsrVar;
            this.L$1 = j7f0Var;
            this.L$2 = null;
            this.label = 1;
            b = czuVar.b(j7f0Var, this);
            if (b != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k7f0Var = (k7f0) this.L$2;
            j7f0Var2 = (j7f0) this.L$1;
            lsrVar2 = (lsr) this.L$0;
            kotlin.a.a(obj);
            lsrVar = lsrVar2;
            String str = k7f0Var.b;
            j7f0<Object> j7f0Var3 = new j7f0<>(j7f0Var2.a, j7f0Var2.b, j7f0Var2.c, j7f0Var2.d, j7f0Var2.e, str);
            if (str == null) {
                return s3q0.a;
            }
            j7f0Var = j7f0Var3;
            czu czuVar2 = this.$this_readRecordsFlow;
            this.L$0 = lsrVar;
            this.L$1 = j7f0Var;
            this.L$2 = null;
            this.label = 1;
            b = czuVar2.b(j7f0Var, this);
            if (b != coroutineSingletons) {
                lsrVar2 = lsrVar;
                obj = b;
                j7f0Var2 = j7f0Var;
                k7f0Var = (k7f0) obj;
                ArrayList arrayList = k7f0Var.a;
                this.L$0 = lsrVar2;
                this.L$1 = j7f0Var2;
                this.L$2 = k7f0Var;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        j7f0Var = (j7f0) this.L$1;
        lsr lsrVar3 = (lsr) this.L$0;
        kotlin.a.a(obj);
        lsrVar2 = lsrVar3;
        j7f0Var2 = j7f0Var;
        k7f0Var = (k7f0) obj;
        ArrayList arrayList2 = k7f0Var.a;
        this.L$0 = lsrVar2;
        this.L$1 = j7f0Var2;
        this.L$2 = k7f0Var;
        this.label = 2;
    }
}
