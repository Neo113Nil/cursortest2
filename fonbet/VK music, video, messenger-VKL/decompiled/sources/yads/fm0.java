package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.bdn;
import xsna.epx;
import xsna.ie00;
import xsna.j8y;
import xsna.myc0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class fm0 {
    public final d4 a;
    public final jb b;
    public final yi2 c;
    public final j8y d;

    public fm0(d4 d4Var, jb jbVar, yi2 yi2Var, j8y j8yVar) {
        this.a = d4Var;
        this.b = jbVar;
        this.c = yi2Var;
        this.d = j8yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, spj spjVar) {
        em0 em0Var;
        int i;
        zs1 zs1Var;
        fm0 fm0Var;
        List list;
        Object obj;
        if (spjVar instanceof em0) {
            em0Var = (em0) spjVar;
            int i2 = em0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                em0Var.e = i2 - Integer.MIN_VALUE;
                Object obj2 = em0Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = em0Var.e;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    String str = this.a.c.a;
                    ht1 ht1Var = this.b.a.c;
                    if (ht1Var != null && (list = ht1Var.c) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (epx.f(((ys1) obj).b, str)) {
                                break;
                            }
                        }
                        ys1 ys1Var = (ys1) obj;
                        if (ys1Var != null) {
                            zs1Var = new zs1(ht1Var.b, ys1Var.b, ys1Var.c);
                            if (zs1Var == null || str == null) {
                                return null;
                            }
                            d4 d4Var = this.a;
                            e00 e00Var = d4Var.a;
                            e13 e13Var = d4Var.d.a;
                            List list2 = zs1Var.b;
                            long j = zs1Var.c;
                            yi2 yi2Var = this.c;
                            em0Var.b = this;
                            em0Var.e = 1;
                            yi2Var.getClass();
                            bdn bdnVar = bdn.a;
                            obj2 = myc0.k(ie00.a.U(), new ui2(j, context, e00Var, e13Var, yi2Var, list2, null), em0Var);
                            if (obj2 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            fm0Var = this;
                        }
                    }
                    zs1Var = null;
                    if (zs1Var == null) {
                        d4 d4Var2 = this.a;
                        e00 e00Var2 = d4Var2.a;
                        e13 e13Var2 = d4Var2.d.a;
                        List list22 = zs1Var.b;
                        long j2 = zs1Var.c;
                        yi2 yi2Var2 = this.c;
                        em0Var.b = this;
                        em0Var.e = 1;
                        yi2Var2.getClass();
                        bdn bdnVar2 = bdn.a;
                        obj2 = myc0.k(ie00.a.U(), new ui2(j2, context, e00Var2, e13Var2, yi2Var2, list22, null), em0Var);
                        if (obj2 != coroutineSingletons) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fm0Var = em0Var.b;
                kotlin.a.a(obj2);
                j8y j8yVar = fm0Var.d;
                j8yVar.getClass();
                return j8yVar.b(ei2.Companion.serializer(), (ei2) obj2);
            }
        }
        em0Var = new em0(this, spjVar);
        Object obj22 = em0Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = em0Var.e;
        if (i != 0) {
        }
        j8y j8yVar2 = fm0Var.d;
        j8yVar2.getClass();
        return j8yVar2.b(ei2.Companion.serializer(), (ei2) obj22);
    }
}
