package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class tn extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ zn c;
    public final /* synthetic */ hp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(zn znVar, hp hpVar, spj spjVar) {
        super(2, spjVar);
        this.c = znVar;
        this.d = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new tn(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new tn(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
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
        zn znVar = this.c;
        gi2 gi2Var = znVar.m;
        Context context = znVar.a;
        hp hpVar = this.d;
        this.b = 1;
        Object a = gi2Var.a(context, hpVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
