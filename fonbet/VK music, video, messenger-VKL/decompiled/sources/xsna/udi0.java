package xsna;

import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SelectionManager.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1", f = "SelectionManager.kt", l = {194}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class udi0 extends SuspendLambda implements wzs<ov70, spj<? super s3q0>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ bei0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udi0(bei0 bei0Var, spj<? super udi0> spjVar) {
        super(2, spjVar);
        this.this$0 = bei0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        udi0 udi0Var = new udi0(this.this$0, spjVar);
        udi0Var.J$0 = ((ov70) obj).a;
        return udi0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ov70 ov70Var, spj<? super s3q0> spjVar) {
        long j = ov70Var.a;
        udi0 udi0Var = new udi0(this.this$0, spjVar);
        udi0Var.J$0 = j;
        return udi0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Pair<us2, qko0> d = this.this$0.d();
            if (d != null) {
                bei0 bei0Var = this.this$0;
                us2 d2 = d.d();
                long j = d.g().a;
                aua0 aua0Var = bei0Var.x;
                if (aua0Var != null) {
                    this.label = 1;
                    if (aua0Var.a(d2, j, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
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
