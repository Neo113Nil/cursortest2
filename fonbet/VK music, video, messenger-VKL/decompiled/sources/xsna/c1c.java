package xsna;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.j1c;
import xsna.u25;

/* compiled from: CheckSignInFeature.kt */
@b6l(c = "com.vk.superapp.qr.web2app.modal.mvi.CheckSignInFeature$auth$1", f = "CheckSignInFeature.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class c1c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ u25.a $response;
    int label;
    final /* synthetic */ g1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1c(g1c g1cVar, u25.a aVar, spj<? super c1c> spjVar) {
        super(2, spjVar);
        this.this$0 = g1cVar;
        this.$response = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c1c(this.this$0, this.$response, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c1c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            g1c g1cVar = this.this$0;
            noe0 noe0Var = g1cVar.h;
            Context context = g1cVar.f;
            u25.a aVar = this.$response;
            r15 r15Var = new r15(g1cVar.g.b, aVar.a, aVar.b, aVar.c, aVar.d);
            this.label = 1;
            if (noe0Var.b(context, r15Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.this$0.l.b(j1c.d.a);
        return s3q0.a;
    }
}
