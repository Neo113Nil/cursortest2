package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.i5g;
import xsna.j5g;
import xsna.lq9;
import xsna.myc0;
import xsna.rli0;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.ulp0;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class j72 {
    public final yvj a;
    public final ke0 b;
    public final iv0 c;
    public final zz1 d;

    public j72(yvj yvjVar, ke0 ke0Var, iv0 iv0Var, zz1 zz1Var) {
        this.a = yvjVar;
        this.b = ke0Var;
        this.c = iv0Var;
        this.d = zz1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Context context, sz1 sz1Var, z30 z30Var, spj spjVar) {
        g72 g72Var;
        int i;
        z30 z30Var2;
        j72 j72Var;
        Context context2;
        boolean z2;
        sz1 sz1Var2;
        if (spjVar instanceof g72) {
            g72Var = (g72) spjVar;
            int i2 = g72Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g72Var.h = i2 - Integer.MIN_VALUE;
                g72 g72Var2 = g72Var;
                Object obj = g72Var2.f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = g72Var2.h;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zz1 zz1Var = this.d;
                    g72Var2.b = this;
                    g72Var2.c = context;
                    z30Var2 = z30Var;
                    g72Var2.d = z30Var2;
                    g72Var2.e = z;
                    g72Var2.h = 1;
                    obj = zz1Var.a(context, sz1Var, g72Var2);
                    if (obj != coroutineSingletons) {
                        j72Var = this;
                        context2 = context;
                        z2 = z;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sz1 sz1Var3 = (sz1) g72Var2.b;
                    kotlin.a.a(obj);
                    return sz1Var3;
                }
                z2 = g72Var2.e;
                z30Var2 = g72Var2.d;
                Context context3 = g72Var2.c;
                j72 j72Var2 = (j72) g72Var2.b;
                kotlin.a.a(obj);
                context2 = context3;
                j72Var = j72Var2;
                z30 z30Var3 = z30Var2;
                sz1Var2 = (sz1) obj;
                if (sz1Var2 != null) {
                    return null;
                }
                if (z2) {
                    v9 v9Var = sz1Var2.b;
                    if (v9Var.E) {
                        myc0.h(j72Var.a, null, null, new h72(j72Var, context2, v9Var, sz1Var2, z30Var3, null), 3);
                        return sz1Var2;
                    }
                    if (v9Var.x) {
                        g72Var2.b = sz1Var2;
                        g72Var2.c = null;
                        g72Var2.d = null;
                        g72Var2.h = 2;
                        if (j72Var.a(context2, v9Var, sz1Var2, z30Var3, g72Var2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return sz1Var2;
            }
        }
        g72Var = new g72(this, spjVar);
        g72 g72Var22 = g72Var;
        Object obj2 = g72Var22.f;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = g72Var22.h;
        if (i != 0) {
        }
        z30 z30Var32 = z30Var2;
        sz1Var2 = (sz1) obj2;
        if (sz1Var2 != null) {
        }
    }

    public /* synthetic */ j72(d4 d4Var, ov2 ov2Var, Context context, w5 w5Var, yvj yvjVar) {
        this(yvjVar, new ke0(context, w5Var), new iv0(context, w5Var), new zz1(context, d4Var, ov2Var));
    }

    public final Object a(Context context, v9 v9Var, sz1 sz1Var, z30 z30Var, spj spjVar) {
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        i72 i72Var = new i72(lq9Var);
        boolean a = qr0.a(context, pr0.c);
        r72[] r72VarArr = r72.b;
        if ("first_video_preloading_strategy".equals(v9Var.v) && a) {
            iv0 iv0Var = this.c;
            synchronized (iv0Var.d) {
                try {
                    e22 e22Var = sz1Var.a;
                    f82 f82Var = iv0Var.c;
                    f82Var.getClass();
                    List A = rli0.A(new ulp0(new ulp0(rli0.t(rli0.p(new i5g(e22Var.a), new c82(f82Var)), d82.b), a82.b), b82.b));
                    if (A.isEmpty()) {
                        i72Var.a();
                    } else {
                        gv0 gv0Var = new gv0(iv0Var.a, i72Var, iv0Var.b, j5g.S(A, 1).iterator(), z30Var);
                        iv0Var.a.a(v5.p, null);
                        Pair pair = (Pair) j5g.Y(A);
                        iv0Var.b.a((String) pair.d(), gv0Var, (String) pair.g());
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            this.b.a(sz1Var, i72Var, z30Var);
        }
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }
}
