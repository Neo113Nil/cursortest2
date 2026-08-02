package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.bdn;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.lq9;
import xsna.myc0;
import xsna.n7i;
import xsna.p7i;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.t1j0;
import xsna.tdr;
import xsna.wgl;
import xsna.yvj;
import xsna.zvj;

/* loaded from: classes10.dex */
public final class qf1 implements tf1 {
    public final Context a;
    public final hx2 b;
    public final ag1 c;
    public final gzs d;
    public final yvj e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qf1(Context context) {
        this(context, r2, r3, r4, zvj.a(wgl.c));
        hx2 a = gx2.a();
        ag1 ag1Var = new ag1(context);
        kf1 kf1Var = new kf1(context);
        bdn bdnVar = bdn.a;
    }

    public final void a(String str, izs izsVar) {
        l53 l53Var = new l53(str, new tdr(this, str, izsVar), new t1j0(str, izsVar));
        l53Var.j = false;
        l53Var.q = "light_bundle_js_request_tag";
        ((dq2) this.d.invoke()).a(l53Var);
    }

    public static final void a(qf1 qf1Var, String str, izs izsVar, String str2) {
        myc0.h(qf1Var.e, null, null, new pf1(qf1Var, str2, str, izsVar, null), 3);
    }

    public qf1(Context context, hx2 hx2Var, ag1 ag1Var, gzs gzsVar, yvj yvjVar) {
        this.a = context;
        this.b = hx2Var;
        this.c = ag1Var;
        this.d = gzsVar;
        this.e = yvjVar;
    }

    public static final void a(String str, izs izsVar, mn3 mn3Var) {
        izsVar.invoke(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ee, code lost:
    
        if (r11.n() == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002a, B:29:0x00c3), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(spj spjVar) {
        nf1 nf1Var;
        Object obj;
        int i;
        n7i n7iVar;
        String str;
        qu2 qu2Var;
        qf1 qf1Var;
        qu2 qu2Var2;
        qf1 qf1Var2;
        try {
            if (spjVar instanceof nf1) {
                nf1Var = (nf1) spjVar;
                int i2 = nf1Var.g;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nf1Var.g = i2 - Integer.MIN_VALUE;
                    obj = nf1Var.e;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = nf1Var.g;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        qu2 a = this.b.a(this.a);
                        if (a == null) {
                            return s3q0.a;
                        }
                        str = a.z;
                        if (str != null && str.length() != 0) {
                            ag1 ag1Var = this.c;
                            nf1Var.b = this;
                            nf1Var.c = a;
                            nf1Var.d = str;
                            nf1Var.g = 1;
                            ag1Var.getClass();
                            bdn bdnVar = bdn.a;
                            Object k = myc0.k(wgl.c, new wf1(ag1Var, null), nf1Var);
                            if (k != coroutineSingletons) {
                                qu2Var = a;
                                obj = k;
                                qf1Var = this;
                            }
                            return coroutineSingletons;
                        }
                        return s3q0.a;
                    }
                    if (i == 1) {
                        str = nf1Var.d;
                        qu2Var = nf1Var.c;
                        qf1Var = nf1Var.b;
                        kotlin.a.a(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            if (n7iVar != null) {
                                n7iVar.h(s3q0.a);
                            }
                            return s3q0.a;
                        }
                        str = nf1Var.d;
                        qu2Var2 = nf1Var.c;
                        qf1Var2 = nf1Var.b;
                        kotlin.a.a(obj);
                        if (obj == null) {
                            return s3q0.a;
                        }
                        qf1Var = qf1Var2;
                        qu2Var = qu2Var2;
                        jf1.a = p7i.a();
                        if (qu2Var.A) {
                            nf1Var.b = null;
                            nf1Var.c = null;
                            nf1Var.d = null;
                            nf1Var.g = 3;
                            qf1Var.getClass();
                            lq9 lq9Var = new lq9(1, s7s0.c(nf1Var));
                            lq9Var.o();
                            qf1Var.a(str, new lf1(lq9Var));
                            lq9Var.r(new mf1(qf1Var));
                        } else {
                            qf1Var.a(str, of1.b);
                            return s3q0.a;
                        }
                    }
                    if (epx.f(obj, str)) {
                        ag1 ag1Var2 = qf1Var.c;
                        nf1Var.b = qf1Var;
                        nf1Var.c = qu2Var;
                        nf1Var.d = str;
                        nf1Var.g = 2;
                        ag1Var2.getClass();
                        bdn bdnVar2 = bdn.a;
                        obj = myc0.k(wgl.c, new vf1(ag1Var2, null), nf1Var);
                        if (obj != coroutineSingletons) {
                            qu2Var2 = qu2Var;
                            qf1Var2 = qf1Var;
                            if (obj == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    jf1.a = p7i.a();
                    if (qu2Var.A) {
                    }
                }
            }
            if (i != 0) {
            }
            if (epx.f(obj, str)) {
            }
            jf1.a = p7i.a();
            if (qu2Var.A) {
            }
        } finally {
            n7iVar = jf1.a;
            if (n7iVar != null) {
                n7iVar.h(s3q0.a);
            }
        }
        nf1Var = new nf1(this, spjVar);
        obj = nf1Var.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nf1Var.g;
    }
}
