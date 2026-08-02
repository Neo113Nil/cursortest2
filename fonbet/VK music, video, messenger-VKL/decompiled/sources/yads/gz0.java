package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.c5g;
import xsna.myc0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class gz0 {
    public final q80 a;

    public gz0(q80 q80Var) {
        this.a = q80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e A[LOOP:0: B:11:0x0058->B:13:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, spj spjVar) {
        fz0 fz0Var;
        int i;
        if (spjVar instanceof fz0) {
            fz0Var = (fz0) spjVar;
            int i2 = fz0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fz0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = fz0Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fz0Var.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    q80 q80Var = this.a;
                    fz0Var.d = 1;
                    obj = myc0.k(q80Var.d, new p80(q80Var, z, null), fz0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                List<e40> list = ((u50) obj).g;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (e40 e40Var : list) {
                    arrayList.add(new i40(e40Var.a, e40Var.b, e40Var.c));
                }
                return new v40(arrayList);
            }
        }
        fz0Var = new fz0(this, spjVar);
        Object obj2 = fz0Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fz0Var.d;
        if (i != 0) {
        }
        List<e40> list2 = ((u50) obj2).g;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        while (r6.hasNext()) {
        }
        return new v40(arrayList2);
    }
}
