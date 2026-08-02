package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.c5g;
import xsna.lq9;
import xsna.s7s0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class z82 {
    public final rf3 a;
    public final ai3 b;

    public /* synthetic */ z82(Context context, d4 d4Var, ov2 ov2Var) {
        this(new rf3(context, new q72()), new ai3(context, d4Var, ov2Var, new z62(d4Var), new ac2()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z82 z82Var, List list, spj spjVar) {
        w82 w82Var;
        int i;
        yh3 yh3Var;
        z82Var.getClass();
        if (spjVar instanceof w82) {
            w82Var = (w82) spjVar;
            int i2 = w82Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w82Var.e = i2 - Integer.MIN_VALUE;
                Object obj = w82Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = w82Var.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ai3 ai3Var = z82Var.b;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((nf3) it.next()).b);
                    }
                    w82Var.b = z82Var;
                    w82Var.e = 1;
                    ai3Var.getClass();
                    lq9 lq9Var = new lq9(1, s7s0.c(w82Var));
                    lq9Var.o();
                    zh3 zh3Var = new zh3(lq9Var);
                    vh3 vh3Var = ai3Var.a;
                    Object obj2 = new Object();
                    vh3Var.c.getClass();
                    sh3 a = th3.a(arrayList);
                    vh3Var.d.addAll(a.a);
                    vh3Var.b.a(vh3Var.a, a.b, new uh3(vh3Var, zh3Var, obj2), obj2);
                    obj = lq9Var.n();
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z82Var = w82Var.b;
                    kotlin.a.a(obj);
                }
                yh3Var = (yh3) obj;
                if (!(yh3Var instanceof wh3)) {
                    return EmptyList.b;
                }
                if (yh3Var instanceof xh3) {
                    return z82Var.a.a(((xh3) yh3Var).a, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        w82Var = new w82(z82Var, spjVar);
        Object obj3 = w82Var.c;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = w82Var.e;
        if (i != 0) {
        }
        yh3Var = (yh3) obj3;
        if (!(yh3Var instanceof wh3)) {
        }
    }

    public z82(rf3 rf3Var, ai3 ai3Var) {
        this.a = rf3Var;
        this.b = ai3Var;
    }
}
