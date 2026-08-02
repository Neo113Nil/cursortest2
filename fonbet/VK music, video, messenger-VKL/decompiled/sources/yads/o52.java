package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.g5g;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class o52 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ r52 c;
    public final /* synthetic */ sz1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o52(r52 r52Var, sz1 sz1Var, spj spjVar) {
        super(2, spjVar);
        this.c = r52Var;
        this.d = sz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new o52(this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new o52(this.c, this.d, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            n62 n62Var = this.c.c;
            sz1 sz1Var = this.d;
            this.b = 1;
            n62Var.getClass();
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            if (n62Var.a != null) {
                l62 l62Var = n62Var.b;
                l62Var.getClass();
                List<gz1> list = sz1Var.a.a;
                ArrayList arrayList = new ArrayList();
                for (gz1 gz1Var : list) {
                    l62Var.a.getClass();
                    g5g.y(ro1.a(gz1Var), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    we3 we3Var = ((po1) it.next()).b;
                    List list2 = we3Var != null ? we3Var.a : null;
                    if (list2 == null) {
                        list2 = EmptyList.b;
                    }
                    g5g.y(list2, arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (!((nf3) it2.next()).b.n.isEmpty()) {
                            n62Var.a.a(new m62(lq9Var));
                            break;
                        }
                    }
                }
            }
            lq9Var.resumeWith(s3q0.a);
            Object n = lq9Var.n();
            if (n != CoroutineSingletons.COROUTINE_SUSPENDED) {
                n = s3q0.a;
            }
            if (n == coroutineSingletons) {
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
