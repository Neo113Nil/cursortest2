package xsna;

import android.app.Activity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DesignDemoMviView.kt */
@b6l(c = "com.vk.design.demo.presentation.DesignDemoMviView$Theme$3$1", f = "DesignDemoMviView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class q3m extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isLegoTheme;
    int label;
    final /* synthetic */ r3m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3m(r3m r3mVar, boolean z, spj<? super q3m> spjVar) {
        super(2, spjVar);
        this.this$0 = r3mVar;
        this.$isLegoTheme = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new q3m(this.this$0, this.$isLegoTheme, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((q3m) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        if (this.$isLegoTheme) {
            dhr0.a.g(this.this$0.k());
        } else {
            dhr0 dhr0Var = dhr0.a;
            lpj k2 = this.this$0.k();
            dhr0Var.getClass();
            dhr0.l(k2);
        }
        if (h != null) {
            dhr0.W(h.getWindow().getDecorView());
        }
        return s3q0.a;
    }
}
