package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.bdn;
import xsna.myc0;
import xsna.n7i;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;

/* loaded from: classes10.dex */
public final class sf1 {
    public final Context a;
    public final hx2 b;
    public final ag1 c;
    public final qf1 d;

    public sf1(Context context, hx2 hx2Var, ag1 ag1Var, qf1 qf1Var) {
        this.a = context;
        this.b = hx2Var;
        this.c = ag1Var;
        this.d = qf1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (r10 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r10.a(r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        if (r10 != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(spj spjVar) {
        rf1 rf1Var;
        Object obj;
        int i;
        Object obj2;
        sf1 sf1Var;
        String str;
        Object obj3;
        if (spjVar instanceof rf1) {
            rf1Var = (rf1) spjVar;
            int i2 = rf1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rf1Var.e = i2 - Integer.MIN_VALUE;
                obj = rf1Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rf1Var.e;
                Object obj4 = null;
                if (i != 0) {
                    kotlin.a.a(obj);
                    rf1Var.b = this;
                    rf1Var.e = 1;
                    n7i n7iVar = jf1.a;
                    if (n7iVar != null) {
                        obj2 = n7iVar.H(rf1Var);
                        if (obj2 != coroutineSingletons) {
                            obj2 = s3q0.a;
                        }
                    } else {
                        obj2 = s3q0.a;
                    }
                    if (obj2 != coroutineSingletons) {
                        sf1Var = this;
                    }
                }
                if (i == 1) {
                    sf1Var = rf1Var.b;
                    kotlin.a.a(obj);
                } else if (i == 2) {
                    sf1Var = rf1Var.b;
                    kotlin.a.a(obj);
                    String str2 = (String) obj;
                    if (str2 != null) {
                        return str2;
                    }
                    qf1 qf1Var = sf1Var.d;
                    rf1Var.b = sf1Var;
                    rf1Var.e = 3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return obj;
                        }
                        sf1Var = rf1Var.b;
                        kotlin.a.a(obj);
                        rf1Var.b = null;
                        rf1Var.e = 5;
                        qu2 a = sf1Var.b.a(sf1Var.a);
                        String str3 = a != null ? a.z : null;
                        if (str3 != null && str3.length() != 0) {
                            ag1 ag1Var = sf1Var.c;
                            ag1Var.getClass();
                            bdn bdnVar = bdn.a;
                            obj4 = myc0.k(wgl.c, new vf1(ag1Var, null), rf1Var);
                        }
                        return obj4 == coroutineSingletons ? coroutineSingletons : obj4;
                    }
                    sf1Var = rf1Var.b;
                    kotlin.a.a(obj);
                    rf1Var.b = sf1Var;
                    rf1Var.e = 4;
                    n7i n7iVar2 = jf1.a;
                    if (n7iVar2 != null) {
                        obj3 = n7iVar2.H(rf1Var);
                        if (obj3 != coroutineSingletons) {
                            obj3 = s3q0.a;
                        }
                    } else {
                        obj3 = s3q0.a;
                    }
                }
                rf1Var.b = sf1Var;
                rf1Var.e = 2;
                qu2 a2 = sf1Var.b.a(sf1Var.a);
                str = a2 == null ? a2.z : null;
                if (str != null || str.length() == 0) {
                    obj = null;
                } else {
                    ag1 ag1Var2 = sf1Var.c;
                    ag1Var2.getClass();
                    bdn bdnVar2 = bdn.a;
                    obj = myc0.k(wgl.c, new vf1(ag1Var2, null), rf1Var);
                }
            }
        }
        rf1Var = new rf1(this, spjVar);
        obj = rf1Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rf1Var.e;
        Object obj42 = null;
        if (i != 0) {
        }
        rf1Var.b = sf1Var;
        rf1Var.e = 2;
        qu2 a22 = sf1Var.b.a(sf1Var.a);
        if (a22 == null) {
        }
        if (str != null) {
        }
        obj = null;
    }
}
