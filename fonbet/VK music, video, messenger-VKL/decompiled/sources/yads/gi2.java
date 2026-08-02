package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* loaded from: classes10.dex */
public final class gi2 {
    public final d4 a;
    public final ov2 b;

    public gi2(ov2 ov2Var, d4 d4Var) {
        this.a = d4Var;
        this.b = ov2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, hp hpVar, spj spjVar) {
        fi2 fi2Var;
        int i;
        if (spjVar instanceof fi2) {
            fi2Var = (fi2) spjVar;
            int i2 = fi2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fi2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = fi2Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fi2Var.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    d4 d4Var = this.a;
                    ov2 ov2Var = this.b;
                    fm0 fm0Var = new fm0(d4Var, new jb(hpVar), new yi2(new yp1(d4Var, ov2Var, null), new nv(d4Var, ov2Var)), je1.a);
                    fi2Var.d = 1;
                    obj = fm0Var.a(context, fi2Var);
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
        fi2Var = new fi2(this, spjVar);
        Object obj2 = fi2Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fi2Var.d;
        if (i != 0) {
        }
        return (String) obj2;
    }
}
