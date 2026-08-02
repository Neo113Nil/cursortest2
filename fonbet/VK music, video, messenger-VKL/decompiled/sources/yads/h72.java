package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class h72 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ j72 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ v9 e;
    public final /* synthetic */ sz1 f;
    public final /* synthetic */ z30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h72(j72 j72Var, Context context, v9 v9Var, sz1 sz1Var, z30 z30Var, spj spjVar) {
        super(2, spjVar);
        this.c = j72Var;
        this.d = context;
        this.e = v9Var;
        this.f = sz1Var;
        this.g = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new h72(this.c, this.d, this.e, this.f, this.g, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((h72) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            j72 j72Var = this.c;
            Context context = this.d;
            v9 v9Var = this.e;
            sz1 sz1Var = this.f;
            z30 z30Var = this.g;
            this.b = 1;
            if (j72Var.a(context, v9Var, sz1Var, z30Var, this) == coroutineSingletons) {
                return coroutineSingletons;
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
