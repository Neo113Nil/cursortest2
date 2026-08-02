package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {864, 867, 870}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class xhh0 extends SuspendLambda implements wzs<jmr0, spj<? super jmr0>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ zhh0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhh0(zhh0 zhh0Var, spj<? super xhh0> spjVar) {
        super(2, spjVar);
        this.this$0 = zhh0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xhh0 xhh0Var = new xhh0(this.this$0, spjVar);
        xhh0Var.J$0 = ((jmr0) obj).a;
        return xhh0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(jmr0 jmr0Var, spj<? super jmr0> spjVar) {
        long j = jmr0Var.a;
        xhh0 xhh0Var = new xhh0(this.this$0, spjVar);
        xhh0Var.J$0 = j;
        return xhh0Var.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r0 != r6) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        long j;
        Object a;
        long j2;
        long j3;
        long j4;
        Object a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long j5 = this.J$0;
            e160 e160Var = this.this$0.f;
            this.J$0 = j5;
            this.label = 1;
            b = e160Var.b(j5, this);
            if (b != coroutineSingletons) {
                j = j5;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            kotlin.a.a(obj);
            b = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j6 = this.J$1;
                long j7 = this.J$0;
                kotlin.a.a(obj);
                j2 = j7;
                j4 = j6;
                a2 = obj;
                return new jmr0(jmr0.d(j2, jmr0.d(j4, ((jmr0) a2).a)));
            }
            j3 = this.J$1;
            j2 = this.J$0;
            kotlin.a.a(obj);
            a = obj;
            long j8 = ((jmr0) a).a;
            e160 e160Var2 = this.this$0.f;
            long d = jmr0.d(j3, j8);
            this.J$0 = j2;
            this.J$1 = j8;
            this.label = 3;
            j4 = j8;
            a2 = e160Var2.a(d, j4, this);
        }
        long d2 = jmr0.d(j, ((jmr0) b).a);
        zhh0 zhh0Var = this.this$0;
        this.J$0 = j;
        this.J$1 = d2;
        this.label = 2;
        a = zhh0Var.a(d2, this);
        if (a != coroutineSingletons) {
            j2 = j;
            j3 = d2;
            long j82 = ((jmr0) a).a;
            e160 e160Var22 = this.this$0.f;
            long d3 = jmr0.d(j3, j82);
            this.J$0 = j2;
            this.J$1 = j82;
            this.label = 3;
            j4 = j82;
            a2 = e160Var22.a(d3, j4, this);
        }
        return coroutineSingletons;
    }
}
