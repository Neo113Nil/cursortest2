package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class qn extends SuspendLambda implements wzs {
    public final /* synthetic */ zn b;
    public final /* synthetic */ vb3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(zn znVar, vb3 vb3Var, spj spjVar) {
        super(2, spjVar);
        this.b = znVar;
        this.c = vb3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new qn(this.b, this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new qn(this.b, this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        zn znVar = this.b;
        synchronized (znVar) {
            z = znVar.s;
        }
        if (!z) {
            String a = this.c.a(this.b.c);
            if (a == null || a.length() == 0) {
                this.b.b(h9.j);
            } else {
                this.b.b.a(v5.r, null);
                this.b.c.g = this.c.a();
                zn znVar2 = this.b;
                d4 d4Var = znVar2.c;
                tq2 tq2Var = znVar2.o;
                Context context = znVar2.a;
                tq2Var.getClass();
                d4Var.n = context.getResources().getConfiguration().orientation;
                vb3 vb3Var = this.c;
                zn znVar3 = this.b;
                this.b.q.a(this.b.a(a, vb3Var.a(znVar3.a, znVar3.c, znVar3.i)));
            }
        }
        return s3q0.a;
    }
}
