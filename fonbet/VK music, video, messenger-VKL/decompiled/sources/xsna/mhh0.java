package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalTabs.kt */
@b6l(c = "com.vk.core.compose.component.internal.ScrollableTabData$onLaidOut$1$1", f = "InternalTabs.kt", l = {512}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class mhh0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $calculatedOffset;
    int label;
    final /* synthetic */ nhh0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhh0(nhh0 nhh0Var, int i, spj<? super mhh0> spjVar) {
        super(2, spjVar);
        this.this$0 = nhh0Var;
        this.$calculatedOffset = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mhh0(this.this$0, this.$calculatedOffset, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mhh0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            jgh0 jgh0Var = this.this$0.a;
            int i2 = this.$calculatedOffset;
            dtp0 dtp0Var = lnx.a;
            this.label = 1;
            Object g = fdi.g(jgh0Var, i2 - ((wak0) jgh0Var.a).getIntValue(), dtp0Var, this);
            if (g != obj2) {
                g = s3q0.a;
            }
            if (g == obj2) {
                return obj2;
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
