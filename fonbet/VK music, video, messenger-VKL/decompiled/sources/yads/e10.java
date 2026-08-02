package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class e10 extends SuspendLambda implements wzs {
    public final /* synthetic */ g10 b;
    public final /* synthetic */ g9 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e10(g10 g10Var, g9 g9Var, int i, spj spjVar) {
        super(2, spjVar);
        this.b = g10Var;
        this.c = g9Var;
        this.d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new e10(this.b, this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((e10) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        g10 g10Var = this.b;
        c22 c22Var = new c22(g10Var.b, ((mv3) g10Var.a).a());
        p12 p12Var = this.b.d;
        g9 g9Var = this.c;
        w52 w52Var = w52.d;
        int i = this.d;
        p12Var.getClass();
        q12 q12Var = new q12(p12Var.a, p12Var.b, new b22(g9Var, w52Var, c22Var, i), p12Var, null, 496);
        p12Var.d.add(q12Var);
        zu3 zu3Var = p12Var.g;
        w12 w12Var = q12Var.b.x;
        w12Var.e = zu3Var;
        w12Var.c.a(w12Var.d, zu3Var, null);
        q12Var.a();
        return s3q0.a;
    }
}
