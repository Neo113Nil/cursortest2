package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.t0c;

/* compiled from: CheckServiceAliveInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.domain.interactor.CheckServiceAliveInteractor$startTracking$1", f = "CheckServiceAliveInteractor.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class v0c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ t0c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0c(t0c t0cVar, spj<? super v0c> spjVar) {
        super(2, spjVar);
        this.this$0 = t0cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new v0c(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((v0c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            t0c t0cVar = this.this$0;
            this.label = 1;
            obj = t0c.a(t0cVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        t0c.a aVar = (t0c.a) obj;
        if (aVar.a) {
            t0c t0cVar2 = this.this$0;
            x0c x0cVar = t0cVar2.a;
            long j = aVar.b;
            hpj hpjVar = t0cVar2.c;
            x0cVar.getClass();
            t0cVar2.d = myc0.h(hpjVar, null, null, new w0c(j, x0cVar, null), 3);
        }
        return s3q0.a;
    }
}
