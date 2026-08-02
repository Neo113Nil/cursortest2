package xsna;

import androidx.compose.foundation.text.HandleState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextFieldSelectionManager.kt */
@b6l(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", l = {971}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class dho0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ gho0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dho0(gho0 gho0Var, spj<? super dho0> spjVar) {
        super(2, spjVar);
        this.this$0 = gho0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dho0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dho0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        us2 us2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            gho0 gho0Var = this.this$0;
            if (qko0.c(gho0Var.p().b) || !gho0Var.l()) {
                us2Var = null;
            } else {
                us2Var = x1o0.k(gho0Var.p());
                us2 e = x1o0.m(gho0Var.p(), gho0Var.p().a.c.length()).e(x1o0.l(gho0Var.p(), gho0Var.p().a.c.length()));
                int f = qko0.f(gho0Var.p().b);
                gho0Var.c.invoke(gho0.g(e, jgz.c(f, f)));
                gho0Var.s(HandleState.None);
                c3q0 c3q0Var = gho0Var.a;
                if (c3q0Var != null) {
                    c3q0Var.f = true;
                }
            }
            if (us2Var == null) {
                return s3q0.a;
            }
            wfd wfdVar = this.this$0.h;
            if (wfdVar != null) {
                nvc a = yfd.a(us2Var);
                this.label = 1;
                if (wfdVar.c(a) == coroutineSingletons) {
                    return coroutineSingletons;
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
