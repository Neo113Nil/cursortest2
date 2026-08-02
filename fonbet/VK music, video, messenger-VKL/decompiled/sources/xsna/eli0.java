package xsna;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: Sequences.kt */
@b6l(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", l = {383}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class eli0 extends RestrictedSuspendLambda implements wzs<ali0<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<Object, Iterator<Object>> $iterator;
    final /* synthetic */ uki0<Object> $source;
    final /* synthetic */ wzs<Integer, Object, Object> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eli0(uki0<Object> uki0Var, wzs<? super Integer, Object, Object> wzsVar, izs<Object, ? extends Iterator<Object>> izsVar, spj<? super eli0> spjVar) {
        super(2, spjVar);
        this.$source = uki0Var;
        this.$transform = wzsVar;
        this.$iterator = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        eli0 eli0Var = new eli0(this.$source, this.$transform, this.$iterator, spjVar);
        eli0Var.L$0 = obj;
        return eli0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<Object> ali0Var, spj<? super s3q0> spjVar) {
        return ((eli0) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Iterator<Object> it;
        ali0 ali0Var = (ali0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            i = 0;
            it = this.$source.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            it = (Iterator) this.L$1;
            kotlin.a.a(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            wzs<Integer, Object, Object> wzsVar = this.$transform;
            int i3 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Iterator<Object> invoke = this.$iterator.invoke(wzsVar.invoke(new Integer(i), next));
            this.L$0 = ali0Var;
            this.L$1 = it;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i3;
            this.label = 1;
            if (ali0Var.b(invoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i3;
        }
        return s3q0.a;
    }
}
