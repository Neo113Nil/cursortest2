package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.c5g;
import xsna.fto0;
import xsna.myc0;
import xsna.o7i;
import xsna.pyx;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class y82 extends SuspendLambda implements wzs {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ z82 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y82(z82 z82Var, List list, spj spjVar) {
        super(2, spjVar);
        this.d = list;
        this.e = z82Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        y82 y82Var = new y82(this.e, this.d, spjVar);
        y82Var.c = obj;
        return y82Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((y82) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pyx pyxVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.c;
            List<nf3> list = this.d;
            z82 z82Var = this.e;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (nf3 nf3Var : list) {
                if (nf3Var.b.a) {
                    pyxVar = myc0.b(yvjVar, null, null, new x82(z82Var, nf3Var, null), 3);
                } else {
                    Object singletonList = Collections.singletonList(nf3Var);
                    pyx o7iVar = new o7i(null);
                    o7iVar.i0(singletonList);
                    pyxVar = o7iVar;
                }
                arrayList.add(pyxVar);
            }
            this.b = 1;
            obj = fto0.e(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return c5g.v((Iterable) obj);
    }
}
