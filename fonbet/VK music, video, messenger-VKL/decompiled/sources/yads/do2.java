package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.erm0;
import xsna.j5g;
import xsna.lq9;
import xsna.s7s0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class do2 {
    public final Context a;
    public final zp2 b;
    public final da0 c;
    public final g71 d;

    public do2(Context context, zp2 zp2Var, da0 da0Var, g71 g71Var) {
        this.a = context;
        this.b = zp2Var;
        this.c = da0Var;
        this.d = g71Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(spj spjVar) {
        ao2 ao2Var;
        int i;
        if (spjVar instanceof ao2) {
            ao2Var = (ao2) spjVar;
            int i2 = ao2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ao2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = ao2Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ao2Var.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ao2Var.d = 1;
                    lq9 lq9Var = new lq9(1, s7s0.c(ao2Var));
                    lq9Var.o();
                    g71 g71Var = this.d;
                    bo2 bo2Var = new bo2(lq9Var);
                    co2 co2Var = new co2(lq9Var);
                    g71Var.getClass();
                    f71 f71Var = new f71(bo2Var, co2Var);
                    Context context = this.a;
                    da0 da0Var = this.c;
                    StringBuilder sb = new StringBuilder();
                    String str = da0Var.a.e;
                    if (str == null) {
                        str = da0.b;
                    }
                    sb.append(str);
                    Character B0 = erm0.B0(sb);
                    if (B0 == null || B0.charValue() != '/') {
                        sb.append('/');
                    }
                    sb.append("v1/debugpanel");
                    if (!da0Var.a.b.isEmpty()) {
                        sb.append(j5g.g0(da0Var.a.b, "&", "?", null, 0, ca0.b, 28));
                    }
                    gc1 gc1Var = new gc1(context, sb.toString(), this.b, this.c.a.c, f71Var);
                    yp2 a = xp2.a();
                    Context context2 = this.a;
                    synchronized (a) {
                        t92.a(context2).a(gc1Var);
                    }
                    obj = lq9Var.n();
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        ao2Var = new ao2(this, spjVar);
        Object obj2 = ao2Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ao2Var.d;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
