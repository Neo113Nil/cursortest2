package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.i62;
import yads.wx1;
import yads.xx1;
import yads.zx1;

/* loaded from: classes7.dex */
public final class ak61 {
    public final a081 a;
    public final qr71 b;
    public final gc71 c;

    public ak61(Context context, fe81 fe81Var, e971 e971Var, v981 v981Var) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        qr71 qr71Var = new qr71(context, fe81Var, e971Var, v981Var);
        gc71 gc71Var = new gc71();
        this.a = a081Var2;
        this.b = qr71Var;
        this.c = gc71Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ak61 ak61Var, uy71 uy71Var, ContinuationImpl continuationImpl) {
        wx1 wx1Var;
        int i;
        uy71 uy71Var2;
        il81 il81Var;
        if (continuationImpl instanceof wx1) {
            wx1Var = (wx1) continuationImpl;
            int i2 = wx1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wx1Var.e = i2 - Integer.MIN_VALUE;
                Object obj = wx1Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wx1Var.e;
                if (i != 0) {
                    b.b(obj);
                    uy71 uy71Var3 = uy71Var.c instanceof d171 ? uy71Var : null;
                    if (uy71Var3 == null) {
                        return uy71Var;
                    }
                    qr71 qr71Var = ak61Var.b;
                    il81 il81Var2 = ((d171) uy71Var3.c).b;
                    wx1Var.b = uy71Var3;
                    wx1Var.e = 1;
                    qr71Var.getClass();
                    sjh sjhVar = uyj.a;
                    Object k0 = tje.k0(mdh.b, new i62(il81Var2, qr71Var, null), wx1Var);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    uy71 uy71Var4 = uy71Var3;
                    obj = k0;
                    uy71Var2 = uy71Var4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uy71Var2 = wx1Var.b;
                    b.b(obj);
                }
                il81Var = (il81) obj;
                if (il81Var == null) {
                    d171 d171Var = (d171) uy71Var2.c;
                    if (d171Var.c == null && d171Var.a == null) {
                        return null;
                    }
                }
                d171 d171Var2 = (d171) uy71Var2.c;
                return new uy71(uy71Var2.a, uy71Var2.b, new d171(d171Var2.a, il81Var, d171Var2.c), uy71Var2.d, uy71Var2.e, uy71Var2.f);
            }
        }
        wx1Var = new wx1(ak61Var, continuationImpl);
        Object obj2 = wx1Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wx1Var.e;
        if (i != 0) {
        }
        il81Var = (il81) obj2;
        if (il81Var == null) {
        }
        d171 d171Var22 = (d171) uy71Var2.c;
        return new uy71(uy71Var2.a, uy71Var2.b, new d171(d171Var22.a, il81Var, d171Var22.c), uy71Var2.d, uy71Var2.e, uy71Var2.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, tg81 tg81Var, ContinuationImpl continuationImpl) {
        xx1 xx1Var;
        int i;
        tg81 tg81Var2;
        List list;
        if (continuationImpl instanceof xx1) {
            xx1Var = (xx1) continuationImpl;
            int i2 = xx1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xx1Var.e = i2 - Integer.MIN_VALUE;
                Object obj = xx1Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xx1Var.e;
                if (i != 0) {
                    b.b(obj);
                    gg81 a = this.a.a(context);
                    if (a == null || !a.D0) {
                        return tg81Var;
                    }
                    List list2 = tg81Var.a.a;
                    xx1Var.b = tg81Var;
                    xx1Var.e = 1;
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new zx1(list2, this, null), xx1Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tg81Var2 = tg81Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tg81Var2 = xx1Var.b;
                    b.b(obj);
                }
                list = (List) obj;
                if (list != null) {
                    return null;
                }
                qb71 qb71Var = tg81Var2.a;
                qb71 qb71Var2 = new qb71(list, qb71Var.b, qb71Var.c, qb71Var.d, qb71Var.e, qb71Var.f, qb71Var.g, qb71Var.h, qb71Var.i, qb71Var.j);
                return new tg81(tg81Var2.c, tg81Var2.b, qb71Var2);
            }
        }
        xx1Var = new xx1(this, continuationImpl);
        Object obj2 = xx1Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xx1Var.e;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
    }
}
