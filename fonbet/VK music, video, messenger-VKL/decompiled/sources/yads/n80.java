package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class n80 extends SuspendLambda implements wzs {
    public b80 b;
    public c80 c;
    public int d;
    public final /* synthetic */ o80 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n80(o80 o80Var, spj spjVar) {
        super(2, spjVar);
        this.e = o80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new n80(this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new n80(this.e, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b80 a;
        c80 c80Var;
        Object obj2;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            kotlin.a.a(obj);
            a = this.e.a.a();
            c80 c80Var2 = a.f;
            if (c80Var2 == null) {
                return b71.a;
            }
            do2 do2Var = this.e.b;
            this.b = a;
            this.c = c80Var2;
            this.d = 1;
            Object a2 = do2Var.a(this);
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            c80Var = c80Var2;
            obj2 = a2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c80Var = this.c;
            a = this.b;
            kotlin.a.a(obj);
            obj2 = ((Result) obj).d();
        }
        if (obj2 instanceof Result.Failure) {
            obj2 = null;
        }
        j80 j80Var = (j80) obj2;
        if (j80Var == null || (list = j80Var.g) == null) {
            list = EmptyList.b;
        }
        List list2 = a.c;
        ArrayList a3 = this.e.c.a(list);
        return this.e.e.a(this.e.d.a(new m80(a.a, a.b, a3.isEmpty() ? list2 : a3, a.d, c80Var.a, c80Var.b)));
    }
}
