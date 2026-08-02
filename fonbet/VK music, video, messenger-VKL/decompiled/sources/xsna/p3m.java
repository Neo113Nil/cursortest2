package xsna;

import android.app.Activity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DesignDemoMviView.kt */
@b6l(c = "com.vk.design.demo.presentation.DesignDemoMviView$Theme$2$1", f = "DesignDemoMviView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class p3m extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ r3m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3m(r3m r3mVar, spj<? super p3m> spjVar) {
        super(2, spjVar);
        this.this$0 = r3mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new p3m(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((p3m) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        lpj k = this.this$0.k();
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(k);
        if (vsx.a()) {
            dhr0.a.getClass();
            dhr0.d0(dhr0.c.b, h, null);
        } else {
            dhr0.a.getClass();
            dhr0.d0(dhr0.c.a, h, null);
        }
        if (h != null) {
            fvr.x(h.getWindow(), !vsx.a());
        }
        return s3q0.a;
    }
}
