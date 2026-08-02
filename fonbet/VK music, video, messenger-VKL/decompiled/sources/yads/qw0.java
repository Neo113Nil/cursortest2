package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.c5g;
import xsna.fto0;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class qw0 extends SuspendLambda implements wzs {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ sw0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw0(List list, sw0 sw0Var, spj spjVar) {
        super(2, spjVar);
        this.d = list;
        this.e = sw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        qw0 qw0Var = new qw0(this.d, this.e, spjVar);
        qw0Var.c = obj;
        return qw0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((qw0) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
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
        yvj yvjVar = (yvj) this.c;
        List list = this.d;
        sw0 sw0Var = this.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(myc0.b(yvjVar, null, null, new pw0(sw0Var, (eo2) it.next(), null), 3));
        }
        this.b = 1;
        Object e = fto0.e(arrayList, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
