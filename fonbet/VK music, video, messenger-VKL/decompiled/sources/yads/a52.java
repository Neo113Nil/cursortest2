package yads;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.epx;
import xsna.izs;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class a52 {
    public final yvj a;
    public final w5 b;
    public final jj c;
    public final c51 d;
    public final f41 e;
    public final j51 f;
    public final izs g;

    public /* synthetic */ a52(Context context, yvj yvjVar, w5 w5Var) {
        this(yvjVar, w5Var, new jj(), new c51(), new f41(context), new j51(), w42.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(HashSet hashSet, nj2 nj2Var, sz1 sz1Var, spj spjVar) {
        x42 x42Var;
        int i;
        a52 a52Var;
        nj2 nj2Var2;
        w5 w5Var;
        v5 v5Var;
        i51 i51Var;
        if (spjVar instanceof x42) {
            x42Var = (x42) spjVar;
            int i2 = x42Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x42Var.i = i2 - Integer.MIN_VALUE;
                Object obj = x42Var.g;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = x42Var.i;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (hashSet.isEmpty()) {
                        return s3q0.a;
                    }
                    w5 w5Var2 = this.b;
                    v5 v5Var2 = v5.o;
                    w5Var2.a(v5Var2, null);
                    f41 f41Var = this.e;
                    x42Var.b = this;
                    x42Var.c = nj2Var;
                    x42Var.d = sz1Var;
                    x42Var.e = w5Var2;
                    x42Var.f = v5Var2;
                    x42Var.i = 1;
                    f41Var.getClass();
                    lq9 lq9Var = new lq9(1, s7s0.c(x42Var));
                    lq9Var.o();
                    f41Var.a(hashSet, new d41(lq9Var));
                    Object n = lq9Var.n();
                    if (n == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    a52Var = this;
                    nj2Var2 = nj2Var;
                    w5Var = w5Var2;
                    obj = n;
                    v5Var = v5Var2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v5Var = x42Var.f;
                    w5Var = x42Var.e;
                    sz1Var = x42Var.d;
                    nj2Var2 = x42Var.c;
                    a52Var = x42Var.b;
                    kotlin.a.a(obj);
                }
                i51Var = (i51) obj;
                if (i51Var instanceof h51) {
                    Map map = ((h51) i51Var).a;
                    v9 v9Var = sz1Var.b;
                    String str = v9Var.w;
                    s42 s42Var = s42.c;
                    if (!epx.f(str, "loading_on_show") && !epx.f(v9Var.w, "loading_on_back")) {
                        c51 c51Var = a52Var.d;
                        c51Var.getClass();
                        Iterator it = sz1Var.a.a.iterator();
                        while (it.hasNext()) {
                            List list = ((gz1) it.next()).b;
                            if (!list.isEmpty()) {
                                c51Var.a(list, map);
                            }
                        }
                        jj jjVar = a52Var.c;
                        jjVar.getClass();
                        for (gz1 gz1Var : sz1Var.a.a) {
                            List list2 = gz1Var.b;
                            if (!list2.isEmpty()) {
                                gz1Var.b = jjVar.a(list2, map);
                            }
                        }
                    }
                    nj2Var2.b.putAll(map);
                }
                s3q0 s3q0Var = s3q0.a;
                w5Var.a(v5Var);
                return s3q0Var;
            }
        }
        x42Var = new x42(this, spjVar);
        Object obj2 = x42Var.g;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = x42Var.i;
        if (i != 0) {
        }
        i51Var = (i51) obj2;
        if (i51Var instanceof h51) {
        }
        s3q0 s3q0Var2 = s3q0.a;
        w5Var.a(v5Var);
        return s3q0Var2;
    }

    public a52(yvj yvjVar, w5 w5Var, jj jjVar, c51 c51Var, f41 f41Var, j51 j51Var, izs izsVar) {
        this.a = yvjVar;
        this.b = w5Var;
        this.c = jjVar;
        this.d = c51Var;
        this.e = f41Var;
        this.f = j51Var;
        this.g = izsVar;
    }
}
