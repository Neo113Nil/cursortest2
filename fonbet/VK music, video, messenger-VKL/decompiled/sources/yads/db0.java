package yads;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* loaded from: classes10.dex */
public final class db0 {
    public final pb2 a;
    public final v02 b;
    public final n93 c;
    public final zh2 d;

    public db0(l52 l52Var, v02 v02Var, n93 n93Var, zh2 zh2Var) {
        this.a = l52Var;
        this.b = v02Var;
        this.c = n93Var;
        this.d = zh2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, wa0 wa0Var, spj spjVar) {
        cb0 cb0Var;
        int i;
        db0 db0Var;
        th2 th2Var;
        if (spjVar instanceof cb0) {
            cb0Var = (cb0) spjVar;
            int i2 = cb0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cb0Var.f = i2 - Integer.MIN_VALUE;
                Object obj = cb0Var.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cb0Var.f;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List list = wa0Var.d;
                    zh2 zh2Var = this.d;
                    cb0Var.b = this;
                    cb0Var.c = wa0Var;
                    cb0Var.f = 1;
                    obj = zh2Var.a(context, list, cb0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    db0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wa0Var = cb0Var.c;
                    db0Var = cb0Var.b;
                    kotlin.a.a(obj);
                }
                th2Var = (th2) obj;
                if (th2Var == null) {
                    v02 v02Var = db0Var.b;
                    v02Var.a.b();
                    v02Var.b.f.c();
                    return th2Var;
                }
                db0Var.a.a(wa0Var.b);
                db0Var.c.a(wa0Var.c, vu.a);
                return th2Var;
            }
        }
        cb0Var = new cb0(this, spjVar);
        Object obj2 = cb0Var.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cb0Var.f;
        if (i != 0) {
        }
        th2Var = (th2) obj2;
        if (th2Var == null) {
        }
    }
}
