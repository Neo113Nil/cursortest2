package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.hr1;
import yads.nf2;
import yads.qr1;
import yads.xl0;
import yads.xz;
import yads.yo;

/* loaded from: classes7.dex */
public final class mv81 {
    public final fe81 a;
    public final rl61 b;
    public final t881 c;
    public final zcx d;

    public mv81(fe81 fe81Var, v981 v981Var, yo yoVar) {
        rl61 rl61Var = new rl61(yoVar);
        t881 t881Var = new t881(new z581(fe81Var, v981Var, null), new rr41(10, fe81Var, v981Var));
        zcx zcxVar = xf71.a;
        this.a = fe81Var;
        this.b = rl61Var;
        this.c = t881Var;
        this.d = zcxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        xl0 xl0Var;
        int i;
        bh71 bh71Var;
        List list;
        Object obj;
        if (continuationImpl instanceof xl0) {
            xl0Var = (xl0) continuationImpl;
            int i2 = xl0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xl0Var.d = i2 - Integer.MIN_VALUE;
                Object obj2 = xl0Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xl0Var.d;
                if (i != 0) {
                    b.b(obj2);
                    fe81 fe81Var = this.a;
                    String str = fe81Var.c.a;
                    qr1 qr1Var = this.b.a.c;
                    if (qr1Var != null && (list = qr1Var.c) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(((hr1) obj).b, str)) {
                                break;
                            }
                        }
                        hr1 hr1Var = (hr1) obj;
                        if (hr1Var != null) {
                            bh71Var = new bh71(qr1Var.b, hr1Var.b, hr1Var.c);
                            if (bh71Var == null || str == null) {
                                return null;
                            }
                            xz xzVar = fe81Var.a;
                            a271 a271Var = fe81Var.d.a;
                            List list2 = bh71Var.b;
                            long j = bh71Var.c;
                            xl0Var.d = 1;
                            t881 t881Var = this.c;
                            t881Var.getClass();
                            sjh sjhVar = uyj.a;
                            obj2 = tje.k0(o400.a.x, new nf2(j, context, list2, null, xzVar, t881Var, a271Var), xl0Var);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    bh71Var = null;
                    if (bh71Var == null) {
                        xz xzVar2 = fe81Var.a;
                        a271 a271Var2 = fe81Var.d.a;
                        List list22 = bh71Var.b;
                        long j2 = bh71Var.c;
                        xl0Var.d = 1;
                        t881 t881Var2 = this.c;
                        t881Var2.getClass();
                        sjh sjhVar2 = uyj.a;
                        obj2 = tje.k0(o400.a.x, new nf2(j2, context, list22, null, xzVar2, t881Var2, a271Var2), xl0Var);
                        if (obj2 == coroutineSingletons) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj2);
                zcx zcxVar = this.d;
                zcxVar.getClass();
                is81.Companion.getClass();
                return zcxVar.c((is81) obj2, ki81.a);
            }
        }
        xl0Var = new xl0(this, continuationImpl);
        Object obj22 = xl0Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xl0Var.d;
        if (i != 0) {
        }
        zcx zcxVar2 = this.d;
        zcxVar2.getClass();
        is81.Companion.getClass();
        return zcxVar2.c((is81) obj22, ki81.a);
    }
}
