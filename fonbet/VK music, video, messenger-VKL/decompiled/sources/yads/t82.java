package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.bdn;
import xsna.i5g;
import xsna.ie00;
import xsna.myc0;
import xsna.rli0;
import xsna.s3q0;
import xsna.spj;
import xsna.ulp0;

/* loaded from: classes10.dex */
public final class t82 {
    public final w5 a;
    public final fp3 b;
    public final xn1 c;
    public final rx1 d;

    public /* synthetic */ t82(w5 w5Var) {
        this(w5Var, new fp3());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        if (r6 == r5) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, sz1 sz1Var, spj spjVar) {
        s82 s82Var;
        int i;
        Set C;
        t82 t82Var;
        Object obj;
        w5 w5Var;
        Context context2;
        Iterator it;
        t82 t82Var2;
        sz1 sz1Var2;
        v5 v5Var;
        Context context3 = context;
        sz1 sz1Var3 = sz1Var;
        if (spjVar instanceof s82) {
            s82Var = (s82) spjVar;
            int i2 = s82Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s82Var.j = i2 - Integer.MIN_VALUE;
                Object obj2 = s82Var.h;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = s82Var.j;
                int i3 = 2;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    xn1 xn1Var = this.c;
                    xn1Var.getClass();
                    C = rli0.C(rli0.m(new ulp0(rli0.p(new i5g(sz1Var3.a.a), new vn1(xn1Var)), wn1.b)));
                    qu2 a = gx2.a().a(context3);
                    int i4 = a != null ? a.b : 0;
                    if (!tb.a(context3) || i4 == 0 || C.isEmpty()) {
                        return s3q0.a;
                    }
                    qu2 a2 = gx2.a().a(context3);
                    if (a2 != null && a2.I0) {
                        fp3 fp3Var = this.b;
                        s82Var.b = this;
                        s82Var.c = context3;
                        s82Var.d = sz1Var3;
                        s82Var.e = C;
                        s82Var.j = 1;
                        fp3Var.getClass();
                        if (a2.I0) {
                            if (fp3.a.compareAndSet(false, true)) {
                                obj = myc0.k(bdn.b, new ep3(context3, null), s82Var);
                                if (obj != obj3) {
                                    obj = s3q0.a;
                                }
                            } else {
                                obj = s3q0.a;
                            }
                            if (obj != obj3) {
                                obj = s3q0.a;
                            }
                        } else {
                            obj = s3q0.a;
                        }
                    }
                    t82Var = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = s82Var.g;
                        v5Var = s82Var.f;
                        w5Var = (w5) s82Var.e;
                        sz1Var2 = s82Var.d;
                        Context context4 = s82Var.c;
                        t82 t82Var3 = s82Var.b;
                        kotlin.a.a(obj2);
                        t82Var2 = t82Var3;
                        context2 = context4;
                        while (it.hasNext()) {
                            pk1 pk1Var = (pk1) it.next();
                            rx1 rx1Var = t82Var2.d;
                            v9 v9Var = sz1Var2.b;
                            s82Var.b = t82Var2;
                            s82Var.c = context2;
                            s82Var.d = sz1Var2;
                            s82Var.e = w5Var;
                            s82Var.f = v5Var;
                            s82Var.g = it;
                            s82Var.j = i3;
                            rx1Var.getClass();
                            String str = pk1Var.a;
                            boolean z = v9Var.D;
                            bdn bdnVar = bdn.a;
                            Object k = myc0.k(ie00.a.U(), new qx1(context2, pk1Var, str, rx1Var, v9Var, z, null), s82Var);
                            if (k != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                k = s3q0.a;
                            }
                            if (k == obj3) {
                                return obj3;
                            }
                            i3 = 2;
                        }
                        s3q0 s3q0Var = s3q0.a;
                        w5Var.a(v5Var);
                        return s3q0Var;
                    }
                    Set set = (Set) s82Var.e;
                    sz1Var3 = s82Var.d;
                    Context context5 = s82Var.c;
                    t82 t82Var4 = s82Var.b;
                    kotlin.a.a(obj2);
                    C = set;
                    context3 = context5;
                    t82Var = t82Var4;
                }
                w5Var = t82Var.a;
                v5 v5Var2 = v5.q;
                w5Var.a(v5Var2, null);
                t82 t82Var5 = t82Var;
                context2 = context3;
                it = C.iterator();
                t82Var2 = t82Var5;
                sz1Var2 = sz1Var3;
                v5Var = v5Var2;
                while (it.hasNext()) {
                }
                s3q0 s3q0Var2 = s3q0.a;
                w5Var.a(v5Var);
                return s3q0Var2;
            }
        }
        s82Var = new s82(this, spjVar);
        Object obj22 = s82Var.h;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = s82Var.j;
        int i32 = 2;
        if (i != 0) {
        }
        w5Var = t82Var.a;
        v5 v5Var22 = v5.q;
        w5Var.a(v5Var22, null);
        t82 t82Var52 = t82Var;
        context2 = context3;
        it = C.iterator();
        t82Var2 = t82Var52;
        sz1Var2 = sz1Var3;
        v5Var = v5Var22;
        while (it.hasNext()) {
        }
        s3q0 s3q0Var22 = s3q0.a;
        w5Var.a(v5Var);
        return s3q0Var22;
    }

    public t82(w5 w5Var, fp3 fp3Var) {
        this.a = w5Var;
        this.b = fp3Var;
        this.c = new xn1();
        this.d = new rx1();
    }
}
