package xsna;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: _Sequences.kt */
@b6l(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", l = {2444, 2448}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class pli0 extends RestrictedSuspendLambda implements wzs<ali0<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ Object $initial;
    final /* synthetic */ wzs<Object, Object, Object> $operation;
    final /* synthetic */ uki0<Object> $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pli0(Object obj, uki0<Object> uki0Var, wzs<Object, Object, Object> wzsVar, spj<? super pli0> spjVar) {
        super(2, spjVar);
        this.$initial = obj;
        this.$this_runningFold = uki0Var;
        this.$operation = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        pli0 pli0Var = new pli0(this.$initial, this.$this_runningFold, this.$operation, spjVar);
        pli0Var.L$0 = obj;
        return pli0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<Object> ali0Var, spj<? super s3q0> spjVar) {
        return ((pli0) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        if (r0.a(r4, r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r0.a(r7, r6) == r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005e -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Iterator<Object> it;
        ali0 ali0Var = (ali0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Object obj3 = this.$initial;
            this.L$0 = ali0Var;
            this.label = 1;
        } else if (i == 1) {
            kotlin.a.a(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            Object invoke = this.L$1;
            kotlin.a.a(obj);
            obj2 = invoke;
            if (it.hasNext()) {
                return s3q0.a;
            }
            invoke = this.$operation.invoke(obj2, it.next());
            this.L$0 = ali0Var;
            this.L$1 = invoke;
            this.L$2 = it;
            this.L$3 = null;
            this.label = 2;
        }
        obj2 = this.$initial;
        it = this.$this_runningFold.iterator();
        if (it.hasNext()) {
        }
    }
}
