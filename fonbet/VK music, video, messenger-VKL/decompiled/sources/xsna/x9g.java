package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Clickable.kt */
@b6l(c = "androidx.compose.foundation.CombinedClickableNode$handleDownEvent$1", f = "Clickable.kt", l = {1273}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class x9g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ w9g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9g(w9g w9gVar, spj<? super x9g> spjVar) {
        super(2, spjVar);
        this.this$0 = w9gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new x9g(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((x9g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long c = ((rut0) ovi.a(this.this$0, uvi.t)).c();
            this.label = 1;
            if (qsl.b(c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        gzs<s3q0> gzsVar = this.this$0.N;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        w9g w9gVar = this.this$0;
        if (w9gVar.O) {
            ((vtu) ovi.a(w9gVar, uvi.l)).a(0);
        }
        w9g w9gVar2 = this.this$0;
        w9gVar2.V = true;
        yok0 yok0Var = w9gVar2.T;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        w9g w9gVar3 = this.this$0;
        w9gVar3.T = null;
        w9gVar3.S = null;
        return s3q0.a;
    }
}
