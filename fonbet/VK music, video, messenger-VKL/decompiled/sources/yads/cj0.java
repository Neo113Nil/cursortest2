package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class cj0 extends SuspendLambda implements wzs {
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ dj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(dj0 dj0Var, List list, spj spjVar) {
        super(2, spjVar);
        this.c = list;
        this.d = dj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        cj0 cj0Var = new cj0(this.d, this.c, spjVar);
        cj0Var.b = obj;
        return cj0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((cj0) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        yvj yvjVar = (yvj) this.b;
        List list = this.c;
        dj0 dj0Var = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            myc0.h(yvjVar, null, null, new bj0(dj0Var, (String) it.next(), null), 3);
        }
        return s3q0.a;
    }
}
