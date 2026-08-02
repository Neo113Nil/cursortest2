package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.xb30;

/* compiled from: MouseWheelScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1", f = "MouseWheelScrollingLogic.kt", l = {109, 112}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class dc30 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xb30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc30(xb30 xb30Var, spj<? super dc30> spjVar) {
        super(2, spjVar);
        this.this$0 = xb30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        dc30 dc30Var = new dc30(this.this$0, spjVar);
        dc30Var.L$0 = obj;
        return dc30Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dc30) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0015  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        dc30 dc30Var;
        yvj yvjVar;
        yvj yvjVar2;
        Throwable th2;
        xb30.a aVar;
        float I0;
        float I02;
        xb30 xb30Var;
        zhh0 zhh0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                try {
                    if (i == 1) {
                        yvjVar = (yvj) this.L$0;
                        kotlin.a.a(obj);
                        try {
                            aVar = (xb30.a) obj;
                            I0 = this.this$0.c.I0(ec30.a);
                            I02 = this.this$0.c.I0(ec30.b);
                            xb30Var = this.this$0;
                            zhh0Var = xb30Var.a;
                            this.L$0 = yvjVar;
                            this.label = 2;
                            if (xb30.c(xb30Var, zhh0Var, aVar, I0, I02, dc30Var) != coroutineSingletons) {
                                yvjVar2 = yvjVar;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th3) {
                            th2 = th3;
                            th = th2;
                            dc30Var.this$0.h = null;
                            throw th;
                        }
                        dc30Var = this;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yvj yvjVar3 = (yvj) this.L$0;
                        kotlin.a.a(obj);
                        yvjVar2 = yvjVar3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dc30Var = this;
                    dc30Var.this$0.h = null;
                    throw th;
                }
            } else {
                kotlin.a.a(obj);
                yvjVar2 = (yvj) this.L$0;
            }
            if (!iyx.h(yvjVar2.getCoroutineContext())) {
                this.this$0.h = null;
                return s3q0.a;
            }
            nm8 nm8Var = this.this$0.g;
            this.L$0 = yvjVar2;
            this.label = 1;
            Object a = nm8Var.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            yvjVar = yvjVar2;
            obj = a;
            aVar = (xb30.a) obj;
            I0 = this.this$0.c.I0(ec30.a);
            I02 = this.this$0.c.I0(ec30.b);
            xb30Var = this.this$0;
            zhh0Var = xb30Var.a;
            this.L$0 = yvjVar;
            this.label = 2;
            dc30Var = this;
            if (xb30.c(xb30Var, zhh0Var, aVar, I0, I02, dc30Var) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th5) {
            th2 = th5;
            dc30Var = this;
            th = th2;
            dc30Var.this$0.h = null;
            throw th;
        }
    }
}
