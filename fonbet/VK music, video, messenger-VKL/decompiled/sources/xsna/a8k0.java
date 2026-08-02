package xsna;

import androidx.compose.material.SnackbarDuration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b8k0;

/* compiled from: SnackbarHost.kt */
@b6l(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {166}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class a8k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ kl $accessibilityManager;
    final /* synthetic */ k7k0 $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8k0(k7k0 k7k0Var, kl klVar, spj<? super a8k0> spjVar) {
        super(2, spjVar);
        this.$currentSnackbarData = k7k0Var;
        this.$accessibilityManager = klVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new a8k0(this.$currentSnackbarData, this.$accessibilityManager, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((a8k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            k7k0 k7k0Var = this.$currentSnackbarData;
            if (k7k0Var != null) {
                SnackbarDuration duration = k7k0Var.getDuration();
                boolean z = this.$currentSnackbarData.a() != null;
                kl klVar = this.$accessibilityManager;
                int i2 = b8k0.a.$EnumSwitchMapping$0[duration.ordinal()];
                if (i2 == 1) {
                    j = Long.MAX_VALUE;
                } else if (i2 == 2) {
                    j = 10000;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = 4000;
                }
                if (klVar != null) {
                    j = klVar.a(j, z);
                }
                this.label = 1;
                if (qsl.b(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$currentSnackbarData.dismiss();
        return s3q0.a;
    }
}
