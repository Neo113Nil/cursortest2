package yads;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.bdn;
import xsna.myc0;
import xsna.spj;
import xsna.wgl;

/* loaded from: classes10.dex */
public final class zz1 {
    public final hx2 a;
    public final z82 b;
    public final u82 c;

    public /* synthetic */ zz1(Context context, d4 d4Var, ov2 ov2Var) {
        this(gx2.a(), new z82(context, d4Var, ov2Var), new u82());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zz1 zz1Var, oi oiVar, spj spjVar) {
        vz1 vz1Var;
        int i;
        oi oiVar2;
        we3 we3Var;
        zz1Var.getClass();
        if (spjVar instanceof vz1) {
            vz1Var = (vz1) spjVar;
            int i2 = vz1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vz1Var.e = i2 - Integer.MIN_VALUE;
                Object obj = vz1Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vz1Var.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    oi oiVar3 = oiVar.c instanceof po1 ? oiVar : null;
                    if (oiVar3 == null) {
                        return oiVar;
                    }
                    z82 z82Var = zz1Var.b;
                    we3 we3Var2 = ((po1) oiVar3.c).b;
                    vz1Var.b = oiVar3;
                    vz1Var.e = 1;
                    z82Var.getClass();
                    bdn bdnVar = bdn.a;
                    Object k = myc0.k(wgl.c, new v82(we3Var2, z82Var, null), vz1Var);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oi oiVar4 = oiVar3;
                    obj = k;
                    oiVar2 = oiVar4;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oiVar2 = vz1Var.b;
                    kotlin.a.a(obj);
                }
                we3Var = (we3) obj;
                if (we3Var == null) {
                    po1 po1Var = (po1) oiVar2.c;
                    if (po1Var.c == null && po1Var.a == null) {
                        return null;
                    }
                }
                po1 po1Var2 = (po1) oiVar2.c;
                return new oi(oiVar2.a, oiVar2.b, new po1(po1Var2.a, we3Var, po1Var2.c), oiVar2.d, oiVar2.e, oiVar2.f);
            }
        }
        vz1Var = new vz1(zz1Var, spjVar);
        Object obj2 = vz1Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vz1Var.e;
        if (i != 0) {
        }
        we3Var = (we3) obj2;
        if (we3Var == null) {
        }
        po1 po1Var22 = (po1) oiVar2.c;
        return new oi(oiVar2.a, oiVar2.b, new po1(po1Var22.a, we3Var, po1Var22.c), oiVar2.d, oiVar2.e, oiVar2.f);
    }

    public zz1(hx2 hx2Var, z82 z82Var, u82 u82Var) {
        this.a = hx2Var;
        this.b = z82Var;
        this.c = u82Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, sz1 sz1Var, spj spjVar) {
        wz1 wz1Var;
        int i;
        List list;
        sz1 sz1Var2 = sz1Var;
        if (spjVar instanceof wz1) {
            wz1Var = (wz1) spjVar;
            int i2 = wz1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wz1Var.e = i2 - Integer.MIN_VALUE;
                Object obj = wz1Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wz1Var.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    qu2 a = this.a.a(context);
                    if (a == null || !a.D0) {
                        return sz1Var2;
                    }
                    List list2 = sz1Var2.a.a;
                    wz1Var.b = sz1Var2;
                    wz1Var.e = 1;
                    bdn bdnVar = bdn.a;
                    obj = myc0.k(wgl.c, new yz1(list2, this, null), wz1Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sz1Var2 = wz1Var.b;
                    kotlin.a.a(obj);
                }
                list = (List) obj;
                if (list != null) {
                    return null;
                }
                e22 e22Var = sz1Var2.a;
                return new sz1(sz1Var2.b, sz1Var2.c, new e22(list, e22Var.b, e22Var.c, e22Var.d, e22Var.e, e22Var.f, e22Var.g, e22Var.h, e22Var.i, e22Var.j));
            }
        }
        wz1Var = new wz1(this, spjVar);
        Object obj2 = wz1Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wz1Var.e;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
    }
}
