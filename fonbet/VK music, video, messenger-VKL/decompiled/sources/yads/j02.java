package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class j02 extends SuspendLambda implements wzs {
    public final /* synthetic */ n02 b;
    public final /* synthetic */ sz1 c;
    public final /* synthetic */ nj2 d;
    public final /* synthetic */ l02 e;
    public final /* synthetic */ k02 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j02(n02 n02Var, sz1 sz1Var, nj2 nj2Var, l02 l02Var, k02 k02Var, spj spjVar) {
        super(2, spjVar);
        this.b = n02Var;
        this.c = sz1Var;
        this.d = nj2Var;
        this.e = l02Var;
        this.f = k02Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new j02(this.b, this.c, this.d, this.e, this.f, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((j02) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        n02 n02Var = this.b;
        p02 p02Var = n02Var.f;
        Context context = n02Var.e;
        sz1 sz1Var = this.c;
        nj2 nj2Var = this.d;
        y02 y02Var = this.e.d;
        i02 i02Var = this.f.a;
        tz1 tz1Var = (tz1) p02Var.d.a.get(p02Var.a.f);
        if (tz1Var != null) {
            tz1Var.a(context, sz1Var, nj2Var, p02Var.c, y02Var, p02Var.b, i02Var);
        } else {
            i02Var.a(h9.a);
        }
        return s3q0.a;
    }
}
