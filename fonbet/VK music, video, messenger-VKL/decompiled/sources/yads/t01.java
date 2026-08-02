package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* loaded from: classes10.dex */
public final class t01 {
    public final d4 a;
    public final ov2 b;

    public t01(ov2 ov2Var, d4 d4Var) {
        this.a = d4Var;
        this.b = ov2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, hp hpVar, spj spjVar) {
        s01 s01Var;
        int i;
        if (spjVar instanceof s01) {
            s01Var = (s01) spjVar;
            int i2 = s01Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s01Var.d = i2 - Integer.MIN_VALUE;
                Object obj = s01Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = s01Var.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    d4 d4Var = this.a;
                    dm0 dm0Var = new dm0(d4Var, new jn(), new ib(hpVar), new aa2(new yp1(d4Var, this.b, null)));
                    s01Var.d = 1;
                    obj = dm0Var.a(context, s01Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return (String) obj;
            }
        }
        s01Var = new s01(this, spjVar);
        Object obj2 = s01Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = s01Var.d;
        if (i != 0) {
        }
        return (String) obj2;
    }
}
