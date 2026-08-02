package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import android.content.Context;
import com.yandex.go.scooters.packages.upsale_on_book.data.model.ScootersUpsalePackageOnBookExperiment;
import defpackage.b3n0;
import defpackage.b4p0;
import defpackage.b7n0;
import defpackage.bbo0;
import defpackage.bvf0;
import defpackage.c0g;
import defpackage.dbo0;
import defpackage.dvw;
import defpackage.eao0;
import defpackage.fao0;
import defpackage.gao0;
import defpackage.h7n0;
import defpackage.hao0;
import defpackage.iao0;
import defpackage.j18;
import defpackage.j6p0;
import defpackage.jl40;
import defpackage.jwf;
import defpackage.n12;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.p7g;
import defpackage.pwy0;
import defpackage.q4o0;
import defpackage.q5z;
import defpackage.qco0;
import defpackage.qxm0;
import defpackage.r95;
import defpackage.sco0;
import defpackage.t2n0;
import defpackage.tt2;
import defpackage.uem;
import defpackage.vj90;
import defpackage.w030;
import defpackage.w511;
import defpackage.xao0;
import defpackage.xvf0;
import defpackage.xzt0;
import defpackage.y5n0;
import defpackage.y5p0;
import defpackage.z2o0;
import defpackage.zao0;
import defpackage.znn0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class f extends r95 {
    public final n6n0 b;
    public final y5p0 c;
    public final znn0 d;
    public final b3n0 e;
    public final z2o0 f;
    public final com.yandex.go.scooters.passes.domain.i g;
    public final com.yandex.go.scooters.offers.v2.components.bottom.data.a h;
    public final com.yandex.go.scooters.passes.domain.g i;
    public final com.yandex.go.scooters.packages.upsale_on_book.data.a j;
    public final j6p0 k;

    public f(n6n0 n6n0Var, y5p0 y5p0Var, znn0 znn0Var, b3n0 b3n0Var, z2o0 z2o0Var, com.yandex.go.scooters.passes.domain.i iVar, com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar, com.yandex.go.scooters.passes.domain.g gVar, com.yandex.go.scooters.packages.upsale_on_book.data.a aVar2, j6p0 j6p0Var) {
        this.b = n6n0Var;
        this.c = y5p0Var;
        this.d = znn0Var;
        this.e = b3n0Var;
        this.f = z2o0Var;
        this.g = iVar;
        this.h = aVar;
        this.i = gVar;
        this.j = aVar2;
        this.k = j6p0Var;
    }

    public static String d(qco0 qco0Var) {
        String str;
        dbo0 dbo0Var = qco0Var.k;
        if (dbo0Var == null || (str = dbo0Var.a) == null) {
            return null;
        }
        List list = qco0Var.h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((vj90) it.next()).a, str)) {
                return str;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e8, code lost:
    
        if (c(r4, r2) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
    
        if (r1 == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00af, code lost:
    
        if (r1 == r3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0202 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0203 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.r95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersPackagesUpsaleBookHandler$handle$1 scootersPackagesUpsaleBookHandler$handle$1;
        qco0 qco0Var;
        qco0 qco0Var2;
        com.yandex.go.scooters.packages.upsale_on_book.data.a aVar;
        qco0 qco0Var3;
        dbo0 dbo0Var;
        j18 j18Var;
        qco0 qco0Var4;
        qco0 qco0Var5;
        hao0 hao0Var;
        Object obj;
        if (continuationImpl instanceof ScootersPackagesUpsaleBookHandler$handle$1) {
            scootersPackagesUpsaleBookHandler$handle$1 = (ScootersPackagesUpsaleBookHandler$handle$1) continuationImpl;
            int i = scootersPackagesUpsaleBookHandler$handle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scootersPackagesUpsaleBookHandler$handle$1.label = i - Integer.MIN_VALUE;
                Object obj2 = scootersPackagesUpsaleBookHandler$handle$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (scootersPackagesUpsaleBookHandler$handle$1.label) {
                    case 0:
                        kotlin.b.b(obj2);
                        b4p0 a = this.c.a();
                        y5n0 a2 = this.f.a();
                        sco0 sco0Var = a2 != null ? a2.j.a : null;
                        qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
                        if (a != null && qco0Var != null) {
                            scootersPackagesUpsaleBookHandler$handle$1.L$0 = null;
                            scootersPackagesUpsaleBookHandler$handle$1.L$1 = qco0Var;
                            scootersPackagesUpsaleBookHandler$handle$1.label = 1;
                            obj2 = e(a, qco0Var, scootersPackagesUpsaleBookHandler$handle$1);
                            break;
                        }
                        obj = null;
                        scootersPackagesUpsaleBookHandler$handle$1.L$0 = obj;
                        scootersPackagesUpsaleBookHandler$handle$1.L$1 = obj;
                        scootersPackagesUpsaleBookHandler$handle$1.L$2 = obj;
                        scootersPackagesUpsaleBookHandler$handle$1.label = 6;
                        Object a3 = super.a(scootersPackagesUpsaleBookHandler$handle$1);
                        return a3 != obj3 ? obj3 : a3;
                    case 1:
                        qco0Var = (qco0) scootersPackagesUpsaleBookHandler$handle$1.L$1;
                        kotlin.b.b(obj2);
                        qco0Var2 = qco0Var;
                        if (((Boolean) obj2).booleanValue()) {
                            this.d.a = false;
                            aVar = this.j;
                            j6p0 j6p0Var = this.k;
                            scootersPackagesUpsaleBookHandler$handle$1.L$0 = null;
                            scootersPackagesUpsaleBookHandler$handle$1.L$1 = qco0Var2;
                            scootersPackagesUpsaleBookHandler$handle$1.L$2 = aVar;
                            scootersPackagesUpsaleBookHandler$handle$1.label = 2;
                            obj2 = j6p0Var.a.b(scootersPackagesUpsaleBookHandler$handle$1);
                            break;
                        }
                        obj = null;
                        scootersPackagesUpsaleBookHandler$handle$1.L$0 = obj;
                        scootersPackagesUpsaleBookHandler$handle$1.L$1 = obj;
                        scootersPackagesUpsaleBookHandler$handle$1.L$2 = obj;
                        scootersPackagesUpsaleBookHandler$handle$1.label = 6;
                        Object a32 = super.a(scootersPackagesUpsaleBookHandler$handle$1);
                        if (a32 != obj3) {
                        }
                        break;
                    case 2:
                        aVar = (com.yandex.go.scooters.packages.upsale_on_book.data.a) scootersPackagesUpsaleBookHandler$handle$1.L$2;
                        qco0Var2 = (qco0) scootersPackagesUpsaleBookHandler$handle$1.L$1;
                        kotlin.b.b(obj2);
                        String str = ((ScootersUpsalePackageOnBookExperiment) obj2).c;
                        scootersPackagesUpsaleBookHandler$handle$1.L$0 = null;
                        scootersPackagesUpsaleBookHandler$handle$1.L$1 = qco0Var2;
                        scootersPackagesUpsaleBookHandler$handle$1.L$2 = null;
                        scootersPackagesUpsaleBookHandler$handle$1.label = 3;
                        if (aVar.e(str, scootersPackagesUpsaleBookHandler$handle$1) != obj3) {
                            qco0Var3 = qco0Var2;
                            scootersPackagesUpsaleBookHandler$handle$1.L$0 = null;
                            scootersPackagesUpsaleBookHandler$handle$1.L$1 = qco0Var3;
                            scootersPackagesUpsaleBookHandler$handle$1.label = 4;
                            j18 j18Var2 = new j18(1, dvw.b(scootersPackagesUpsaleBookHandler$handle$1));
                            j18Var2.u();
                            dbo0Var = qco0Var3.k;
                            if (dbo0Var != null) {
                                j18Var = j18Var2;
                                qco0Var4 = qco0Var3;
                            } else {
                                n6n0 n6n0Var = this.b;
                                uem uemVar = new uem(j18Var2, 6);
                                uem uemVar2 = new uem(j18Var2, 7);
                                uem uemVar3 = new uem(j18Var2, 8);
                                h7n0 h7n0Var = (h7n0) n6n0Var;
                                com.yandex.go.scooters.offers.v2.g gVar = h7n0Var.b;
                                jwf T = gVar.T(h7n0Var.a);
                                p7g p7gVar = (p7g) T.k;
                                tt2 Z1 = ((c0g) p7gVar.a).Z1();
                                q5z.h(Z1);
                                c0g c0gVar = (c0g) p7gVar.a;
                                pwy0 c3 = c0gVar.c3();
                                q5z.h(c3);
                                j18Var = j18Var2;
                                z2o0 z2o0Var = (z2o0) ((xvf0) T.H).get();
                                q4o0 q4o0Var = (q4o0) ((xvf0) T.d).get();
                                qco0Var4 = qco0Var3;
                                ru.yandex.taxi.widget.c r2 = c0gVar.r2();
                                q5z.h(r2);
                                zao0 zao0Var = new zao0(Z1, c3, z2o0Var, q4o0Var, new bbo0(r2));
                                xao0 xao0Var = new xao0((qxm0) p7gVar.g0.get(), (z2o0) ((xvf0) T.H).get());
                                Context e2 = c0gVar.e2();
                                q5z.h(e2);
                                w030 C2 = c0gVar.C2();
                                q5z.h(C2);
                                gVar.A(new n12(zao0Var, xao0Var, e2, C2, p7gVar.N, (xvf0) T.L), new iao0(dbo0Var), new b7n0(uemVar2, uemVar3, uemVar));
                            }
                            obj2 = j18Var.s();
                            if (obj2 != obj3) {
                                qco0Var5 = qco0Var4;
                                hao0Var = (hao0) obj2;
                                if (!jl40.l(hao0Var, fao0.a)) {
                                    return zy11.a;
                                }
                                if (jl40.l(hao0Var, eao0.a)) {
                                    obj = null;
                                } else {
                                    if (!jl40.l(hao0Var, gao0.a)) {
                                        w511.b();
                                        return null;
                                    }
                                    obj = null;
                                    scootersPackagesUpsaleBookHandler$handle$1.L$0 = null;
                                    scootersPackagesUpsaleBookHandler$handle$1.L$1 = null;
                                    scootersPackagesUpsaleBookHandler$handle$1.L$2 = null;
                                    scootersPackagesUpsaleBookHandler$handle$1.label = 5;
                                    break;
                                }
                                scootersPackagesUpsaleBookHandler$handle$1.L$0 = obj;
                                scootersPackagesUpsaleBookHandler$handle$1.L$1 = obj;
                                scootersPackagesUpsaleBookHandler$handle$1.L$2 = obj;
                                scootersPackagesUpsaleBookHandler$handle$1.label = 6;
                                Object a322 = super.a(scootersPackagesUpsaleBookHandler$handle$1);
                                if (a322 != obj3) {
                                }
                            }
                        }
                    case 3:
                        qco0Var3 = (qco0) scootersPackagesUpsaleBookHandler$handle$1.L$1;
                        kotlin.b.b(obj2);
                        scootersPackagesUpsaleBookHandler$handle$1.L$0 = null;
                        scootersPackagesUpsaleBookHandler$handle$1.L$1 = qco0Var3;
                        scootersPackagesUpsaleBookHandler$handle$1.label = 4;
                        j18 j18Var22 = new j18(1, dvw.b(scootersPackagesUpsaleBookHandler$handle$1));
                        j18Var22.u();
                        dbo0Var = qco0Var3.k;
                        if (dbo0Var != null) {
                        }
                        obj2 = j18Var.s();
                        if (obj2 != obj3) {
                        }
                    case 4:
                        qco0Var5 = (qco0) scootersPackagesUpsaleBookHandler$handle$1.L$1;
                        kotlin.b.b(obj2);
                        hao0Var = (hao0) obj2;
                        if (!jl40.l(hao0Var, fao0.a)) {
                        }
                        break;
                    case 5:
                        kotlin.b.b(obj2);
                        obj = null;
                        scootersPackagesUpsaleBookHandler$handle$1.L$0 = obj;
                        scootersPackagesUpsaleBookHandler$handle$1.L$1 = obj;
                        scootersPackagesUpsaleBookHandler$handle$1.L$2 = obj;
                        scootersPackagesUpsaleBookHandler$handle$1.label = 6;
                        Object a3222 = super.a(scootersPackagesUpsaleBookHandler$handle$1);
                        if (a3222 != obj3) {
                        }
                        break;
                    case 6:
                        kotlin.b.b(obj2);
                        return obj2;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersPackagesUpsaleBookHandler$handle$1 = new ScootersPackagesUpsaleBookHandler$handle$1(this, continuationImpl);
        Object obj22 = scootersPackagesUpsaleBookHandler$handle$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (scootersPackagesUpsaleBookHandler$handle$1.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(qco0 qco0Var, ContinuationImpl continuationImpl) {
        ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1 scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1;
        int i;
        if (continuationImpl instanceof ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1) {
            scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1 = (ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1) continuationImpl;
            int i2 = scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                String d = d(qco0Var);
                if (d != null) {
                    r0 r0Var = this.e.a;
                    r0Var.getClass();
                    r0Var.m(null, t2n0.a);
                    ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2 scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2 = new ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2(this, d, null);
                    scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1.L$0 = null;
                    scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1.L$1 = null;
                    scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1.label = 1;
                    if (bvf0.n(scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$2, scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1 = new ScootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1(this, continuationImpl);
        Object obj2 = scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesUpsaleBookHandler$doPackagePurchaseAndBook$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(b4p0 b4p0Var, qco0 qco0Var, ContinuationImpl continuationImpl) {
        ScootersPackagesUpsaleBookHandler$needToShow$1 scootersPackagesUpsaleBookHandler$needToShow$1;
        int i;
        if (continuationImpl instanceof ScootersPackagesUpsaleBookHandler$needToShow$1) {
            scootersPackagesUpsaleBookHandler$needToShow$1 = (ScootersPackagesUpsaleBookHandler$needToShow$1) continuationImpl;
            int i2 = scootersPackagesUpsaleBookHandler$needToShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesUpsaleBookHandler$needToShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackagesUpsaleBookHandler$needToShow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesUpsaleBookHandler$needToShow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j6p0 j6p0Var = this.k;
                    scootersPackagesUpsaleBookHandler$needToShow$1.L$0 = b4p0Var;
                    scootersPackagesUpsaleBookHandler$needToShow$1.L$1 = qco0Var;
                    scootersPackagesUpsaleBookHandler$needToShow$1.label = 1;
                    obj = j6p0Var.a.b(scootersPackagesUpsaleBookHandler$needToShow$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    qco0Var = (qco0) scootersPackagesUpsaleBookHandler$needToShow$1.L$1;
                    b4p0Var = (b4p0) scootersPackagesUpsaleBookHandler$needToShow$1.L$0;
                    kotlin.b.b(obj);
                }
                ScootersUpsalePackageOnBookExperiment scootersUpsalePackageOnBookExperiment = (ScootersUpsalePackageOnBookExperiment) obj;
                if (this.d.a || qco0Var.k == null || !(b4p0Var instanceof xzt0) || !scootersUpsalePackageOnBookExperiment.b || d(qco0Var) == null) {
                    return Boolean.FALSE;
                }
                com.yandex.go.scooters.packages.upsale_on_book.data.a aVar = this.j;
                String str = scootersUpsalePackageOnBookExperiment.c;
                List list = scootersUpsalePackageOnBookExperiment.d;
                scootersPackagesUpsaleBookHandler$needToShow$1.L$0 = null;
                scootersPackagesUpsaleBookHandler$needToShow$1.L$1 = null;
                scootersPackagesUpsaleBookHandler$needToShow$1.L$2 = null;
                scootersPackagesUpsaleBookHandler$needToShow$1.label = 2;
                Object c = aVar.c(str, list, scootersPackagesUpsaleBookHandler$needToShow$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        scootersPackagesUpsaleBookHandler$needToShow$1 = new ScootersPackagesUpsaleBookHandler$needToShow$1(this, continuationImpl);
        Object obj2 = scootersPackagesUpsaleBookHandler$needToShow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesUpsaleBookHandler$needToShow$1.label;
        if (i != 0) {
        }
        ScootersUpsalePackageOnBookExperiment scootersUpsalePackageOnBookExperiment2 = (ScootersUpsalePackageOnBookExperiment) obj2;
        if (this.d.a) {
        }
        return Boolean.FALSE;
    }
}
