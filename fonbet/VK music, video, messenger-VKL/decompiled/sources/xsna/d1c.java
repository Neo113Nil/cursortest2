package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CheckSignInFeature.kt */
@b6l(c = "com.vk.superapp.qr.web2app.modal.mvi.CheckSignInFeature$requestInvalidateQr$1", f = "CheckSignInFeature.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class d1c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ g1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1c(g1c g1cVar, spj<? super d1c> spjVar) {
        super(2, spjVar);
        this.this$0 = g1cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new d1c(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d1c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            g1c g1cVar = this.this$0;
            noe0 noe0Var = g1cVar.h;
            String str = g1cVar.g.b;
            this.label = 1;
            if (noe0Var.a(str, this) == coroutineSingletons) {
                return coroutineSingletons;
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
