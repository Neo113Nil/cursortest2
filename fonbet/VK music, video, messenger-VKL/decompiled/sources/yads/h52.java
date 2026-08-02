package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class h52 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ k52 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ sz1 e;
    public final /* synthetic */ z30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h52(k52 k52Var, Context context, sz1 sz1Var, z30 z30Var, spj spjVar) {
        super(2, spjVar);
        this.c = k52Var;
        this.d = context;
        this.e = sz1Var;
        this.f = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new h52(this.c, this.d, this.e, this.f, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((h52) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        j72 j72Var = this.c.c;
        Context context = this.d;
        sz1 sz1Var = this.e;
        z30 z30Var = this.f;
        this.b = 1;
        Object a = j72Var.a(true, context, sz1Var, z30Var, (spj) this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
