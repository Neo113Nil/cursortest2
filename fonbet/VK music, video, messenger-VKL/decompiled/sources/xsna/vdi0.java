package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SelectionManager.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2", f = "SelectionManager.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class vdi0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ bei0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdi0(bei0 bei0Var, spj<? super vdi0> spjVar) {
        super(1, spjVar);
        this.this$0 = bei0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new vdi0(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((vdi0) create(spjVar)).invokeSuspend(s3q0.a);
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
                    if (aua0Var.b(d2, j, this) == coroutineSingletons) {
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
