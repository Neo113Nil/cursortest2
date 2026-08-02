package yads;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.myc0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class iz0 {
    public final q80 a;

    public iz0(q80 q80Var) {
        this.a = q80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, spj spjVar) {
        hz0 hz0Var;
        int i;
        iz0 iz0Var;
        if (spjVar instanceof hz0) {
            hz0Var = (hz0) spjVar;
            int i2 = hz0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hz0Var.e = i2 - Integer.MIN_VALUE;
                Object obj = hz0Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hz0Var.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    q80 q80Var = this.a;
                    hz0Var.b = this;
                    hz0Var.e = 1;
                    obj = myc0.k(q80Var.d, new p80(q80Var, z, null), hz0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    iz0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iz0Var = hz0Var.b;
                    kotlin.a.a(obj);
                }
                u50 u50Var = (u50) obj;
                List list = u50Var.h;
                m50 m50Var = u50Var.a;
                t80 t80Var = u50Var.b;
                iz0Var.getClass();
                return new v70(list, m50Var, new u80(t80Var.a, new w80(!t80Var.b ? t80Var.c.isEmpty() ? v80.b : v80.c : v80.d, t80Var.c)), u50Var.c, u50Var.d, u50Var.e, u50Var.f);
            }
        }
        hz0Var = new hz0(this, spjVar);
        Object obj2 = hz0Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hz0Var.e;
        if (i != 0) {
        }
        u50 u50Var2 = (u50) obj2;
        List list2 = u50Var2.h;
        m50 m50Var2 = u50Var2.a;
        t80 t80Var2 = u50Var2.b;
        iz0Var.getClass();
        return new v70(list2, m50Var2, new u80(t80Var2.a, new w80(!t80Var2.b ? t80Var2.c.isEmpty() ? v80.b : v80.c : v80.d, t80Var2.c)), u50Var2.c, u50Var2.d, u50Var2.e, u50Var2.f);
    }
}
