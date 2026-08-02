package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bdn;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class p52 extends SuspendLambda implements wzs {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ r52 d;
    public final /* synthetic */ d4 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ sz1 g;
    public final /* synthetic */ nj2 h;
    public final /* synthetic */ z30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p52(r52 r52Var, d4 d4Var, Context context, sz1 sz1Var, nj2 nj2Var, z30 z30Var, spj spjVar) {
        super(2, spjVar);
        this.d = r52Var;
        this.e = d4Var;
        this.f = context;
        this.g = sz1Var;
        this.h = nj2Var;
        this.i = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        p52 p52Var = new p52(this.d, this.e, this.f, this.g, this.h, this.i, spjVar);
        p52Var.c = obj;
        return p52Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((p52) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                r52 r52Var = this.d;
                d4 d4Var = this.e;
                Context context = this.f;
                sz1 sz1Var = this.g;
                nj2 nj2Var = this.h;
                z30 z30Var = this.i;
                k52 k52Var = r52Var.b;
                this.b = 1;
                k52Var.getClass();
                bdn bdnVar = bdn.a;
                obj = myc0.k(wgl.c, new j52(d4Var, k52Var, context, sz1Var, z30Var, nj2Var, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            failure = (sz1) obj;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }
}
