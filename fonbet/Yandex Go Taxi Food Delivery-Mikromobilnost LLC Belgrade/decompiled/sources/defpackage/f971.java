package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.dm3;
import yads.f5;
import yads.f62;
import yads.ll1;
import yads.ml1;
import yads.tv1;

/* loaded from: classes7.dex */
public final class f971 {
    public final e971 a;
    public final l471 b;
    public final gw71 c;
    public final xj81 d;

    public f971(e971 e971Var) {
        l471 l471Var = new l471();
        gw71 gw71Var = new gw71();
        xj81 xj81Var = new xj81();
        this.a = e971Var;
        this.b = l471Var;
        this.c = gw71Var;
        this.d = xj81Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r6 == r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if (r6 == r5) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, tg81 tg81Var, ContinuationImpl continuationImpl) {
        f62 f62Var;
        int i;
        Set u;
        boolean z;
        Object obj;
        Context context2;
        tg81 tg81Var2;
        Iterator it;
        f5 f5Var;
        e971 e971Var;
        Context context3 = context;
        tg81 tg81Var3 = tg81Var;
        if (continuationImpl instanceof f62) {
            f62Var = (f62) continuationImpl;
            int i2 = f62Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f62Var.i = i2 - Integer.MIN_VALUE;
                Object obj2 = f62Var.g;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = f62Var.i;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj2);
                    gw71 gw71Var = this.c;
                    gw71Var.getClass();
                    u = kotlin.sequences.b.u(kotlin.sequences.b.i(new yw01(kotlin.sequences.b.l(new h73(1, tg81Var3.a.a), new ll1(gw71Var)), ml1.w)));
                    gg81 a = dha1.f().a(context3);
                    int i3 = a != null ? a.b : 0;
                    if (cs71.a(context3) && i3 != 0 && !u.isEmpty()) {
                        gg81 a2 = dha1.f().a(context3);
                        if (a2 != null && (z = a2.I0)) {
                            f62Var.b = context3;
                            f62Var.c = tg81Var3;
                            f62Var.d = u;
                            f62Var.i = 1;
                            this.b.getClass();
                            if (z) {
                                if (!l471.a.compareAndSet(false, true) || (obj = tje.k0(uyj.a, new dm3(context3, null), f62Var)) != coroutineSingletons) {
                                    obj = zy11Var;
                                }
                            }
                            obj = zy11Var;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = f62Var.f;
                    f5Var = f62Var.e;
                    e971Var = (e971) f62Var.d;
                    tg81Var2 = f62Var.c;
                    Context context4 = f62Var.b;
                    b.b(obj2);
                    context2 = context4;
                    while (it.hasNext()) {
                        lg71 lg71Var = (lg71) it.next();
                        d881 d881Var = tg81Var2.b;
                        f62Var.b = context2;
                        f62Var.c = tg81Var2;
                        f62Var.d = e971Var;
                        f62Var.e = f5Var;
                        f62Var.f = it;
                        f62Var.i = 2;
                        xj81 xj81Var = this.d;
                        xj81Var.getClass();
                        li61 li61Var = lg71Var.a;
                        boolean z2 = d881Var.z;
                        sjh sjhVar = uyj.a;
                        Object k0 = tje.k0(o400.a.x, new tv1(context2, lg71Var, li61Var, xj81Var, d881Var, z2, null), f62Var);
                        if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            k0 = zy11Var;
                        }
                        if (k0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    e971Var.a(f5Var);
                    return zy11Var;
                }
                Set set = (Set) f62Var.d;
                tg81Var3 = f62Var.c;
                Context context5 = f62Var.b;
                b.b(obj2);
                u = set;
                context3 = context5;
                f5 f5Var2 = f5.r;
                e971 e971Var2 = this.a;
                e971Var2.b(f5Var2, null);
                context2 = context3;
                tg81Var2 = tg81Var3;
                it = u.iterator();
                f5Var = f5Var2;
                e971Var = e971Var2;
                while (it.hasNext()) {
                }
                e971Var.a(f5Var);
                return zy11Var;
            }
        }
        f62Var = new f62(this, continuationImpl);
        Object obj22 = f62Var.g;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f62Var.i;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        f5 f5Var22 = f5.r;
        e971 e971Var22 = this.a;
        e971Var22.b(f5Var22, null);
        context2 = context3;
        tg81Var2 = tg81Var3;
        it = u.iterator();
        f5Var = f5Var22;
        e971Var = e971Var22;
        while (it.hasNext()) {
        }
        e971Var.a(f5Var);
        return zy11Var2;
    }
}
