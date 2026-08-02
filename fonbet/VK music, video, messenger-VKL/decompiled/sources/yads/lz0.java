package yads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.epx;
import xsna.myc0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class lz0 {
    public final q80 a;

    public lz0(q80 q80Var) {
        this.a = q80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, spj spjVar) {
        kz0 kz0Var;
        int i;
        if (spjVar instanceof kz0) {
            kz0Var = (kz0) spjVar;
            int i2 = kz0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kz0Var.e = i2 - Integer.MIN_VALUE;
                Object obj = kz0Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kz0Var.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    q80 q80Var = this.a;
                    kz0Var.b = str;
                    kz0Var.e = 1;
                    obj = myc0.k(q80Var.d, new p80(q80Var, z, null), kz0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = kz0Var.b;
                    kotlin.a.a(obj);
                }
                for (Object obj2 : ((u50) obj).d.a) {
                    if (epx.f(((b50) obj2).a, str)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        kz0Var = new kz0(this, spjVar);
        Object obj3 = kz0Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kz0Var.e;
        if (i != 0) {
        }
        while (r7.hasNext()) {
        }
        return null;
    }
}
