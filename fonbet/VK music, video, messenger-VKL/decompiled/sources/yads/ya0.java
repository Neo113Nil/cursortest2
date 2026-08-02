package yads;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* loaded from: classes10.dex */
public final class ya0 implements o0 {
    public final db0 a;

    public ya0(db0 db0Var) {
        this.a = db0Var;
    }

    @Override // yads.o0
    public final /* bridge */ /* synthetic */ Object a(View view, m0 m0Var, u0 u0Var) {
        return a(view, (wa0) m0Var, (spj) u0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(View view, wa0 wa0Var, spj spjVar) {
        xa0 xa0Var;
        int i;
        if (spjVar instanceof xa0) {
            xa0Var = (xa0) spjVar;
            int i2 = xa0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xa0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = xa0Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xa0Var.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Context context = view.getContext();
                    db0 db0Var = this.a;
                    xa0Var.d = 1;
                    obj = db0Var.a(context, wa0Var, xa0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return new p01(true, (th2) obj);
            }
        }
        xa0Var = new xa0(this, spjVar);
        Object obj2 = xa0Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xa0Var.d;
        if (i != 0) {
        }
        return new p01(true, (th2) obj2);
    }
}
