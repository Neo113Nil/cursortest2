package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class d10 extends SuspendLambda implements wzs {
    public final /* synthetic */ g10 b;
    public final /* synthetic */ g9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(g10 g10Var, g9 g9Var, spj spjVar) {
        super(2, spjVar);
        this.b = g10Var;
        this.c = g9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new d10(this.b, this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new d10(this.b, this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        g10 g10Var = this.b;
        c22 c22Var = new c22(g10Var.b, ((mv3) g10Var.a).a());
        p12 p12Var = this.b.d;
        g9 g9Var = this.c;
        w52 w52Var = w52.c;
        p12Var.getClass();
        q12 q12Var = new q12(p12Var.a, p12Var.b, new b22(g9Var, w52Var, c22Var, 1), p12Var, p12Var.c, 464);
        p12Var.d.add(q12Var);
        c10 c10Var = p12Var.f;
        w12 w12Var = q12Var.b.x;
        w12Var.d = c10Var;
        w12Var.c.a(c10Var, w12Var.e, null);
        q12Var.a();
        return s3q0.a;
    }
}
