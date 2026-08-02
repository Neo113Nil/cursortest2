package com.yandex.smartcamera.arscene.ui;

import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.smartcamera.arscene.ui.e;
import defpackage.aii0;
import defpackage.an1;
import defpackage.bms;
import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.i43;
import defpackage.j1t0;
import defpackage.k2z0;
import defpackage.n6y;
import defpackage.n8e;
import defpackage.nk2;
import defpackage.ny61;
import defpackage.o430;
import defpackage.p8e;
import defpackage.pi6;
import defpackage.s6y;
import defpackage.squ;
import defpackage.t6y;
import defpackage.tcc;
import defpackage.tse;
import defpackage.tyu0;
import defpackage.vvb1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x910;
import defpackage.z4;
import defpackage.z69;
import defpackage.z6y;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class e {
    public static final void a(final f530 f530Var, final i43 i43Var, final z69 z69Var, final int i, final androidx.compose.runtime.internal.a aVar, fid fidVar, final int i2) {
        int i3;
        final i43 i43Var2;
        z69 z69Var2;
        bts btsVar;
        aii0 v;
        wls wlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-372205890);
        if ((i2 & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 16;
        if ((i2 & 48) == 0) {
            i43Var2 = i43Var;
            i3 |= btsVar2.k(i43Var2) ? 32 : 16;
        } else {
            i43Var2 = i43Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar2.k(z69Var) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.c(i) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.e(aVar) ? 16384 : 8192;
        }
        int i5 = i3;
        if ((i5 & 9363) == 9362 && btsVar2.E()) {
            btsVar2.Y();
            z69Var2 = z69Var;
            btsVar = btsVar2;
        } else {
            btsVar2.a0();
            if ((i2 & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            if (i <= 0) {
                btsVar2.e0(1220222317);
                pi6.a(f530Var, btsVar2, i5 & 14);
                btsVar2.t(false);
                v = btsVar2.v();
                if (v != null) {
                    final int i6 = 0;
                    wlsVar = new wls() { // from class: pqu
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i6;
                            zy11 zy11Var = zy11.a;
                            int i8 = i2;
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i8 | 1);
                                    e.a(f530Var, i43Var2, z69Var, i, aVar, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(i8 | 1);
                                    e.a(f530Var, i43Var2, z69Var, i, aVar, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            z69Var2 = z69Var;
            btsVar2.e0(1217021412);
            btsVar2.t(false);
            final androidx.compose.foundation.lazy.b bVar = z69Var2.a;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                androidx.compose.runtime.a aVar2 = new androidx.compose.runtime.a(zpn.j(EmptyCoroutineContext.a, btsVar2));
                btsVar2.o0(aVar2);
                Q = aVar2;
            }
            final tse tseVar = ((androidx.compose.runtime.a) Q).a;
            boolean k = btsVar2.k(bVar);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == o430Var) {
                Q2 = new z6y(bVar, vvb1.E);
                btsVar2.o0(Q2);
            }
            final androidx.compose.foundation.gestures.snapping.a e = androidx.compose.foundation.gestures.snapping.b.e((j1t0) Q2, btsVar2);
            btsVar = btsVar2;
            b(f530Var, wwg.S(1887041513, true, new k2z0(aVar, i4), btsVar2), wwg.S(-917357078, true, new z4(aVar, i, 19), btsVar2), wwg.S(-346591345, true, new bms() { // from class: qqu
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i7;
                    int intValue = ((Integer) obj).intValue();
                    int intValue2 = ((Integer) obj2).intValue();
                    fid fidVar2 = (fid) obj3;
                    int intValue3 = ((Integer) obj4).intValue();
                    if ((intValue3 & 6) == 0) {
                        i7 = (fidVar2.c(intValue) ? 4 : 2) | intValue3;
                    } else {
                        i7 = intValue3;
                    }
                    if ((intValue3 & 48) == 0) {
                        i7 |= fidVar2.c(intValue2) ? 32 : 16;
                    }
                    if ((i7 & 147) == 146) {
                        bts btsVar3 = (bts) fidVar2;
                        if (btsVar3.E()) {
                            btsVar3.Y();
                            return zy11.a;
                        }
                    }
                    bts btsVar4 = (bts) fidVar2;
                    fwi fwiVar = (fwi) btsVar4.m(j.h);
                    Pair pair = new Pair(new y7m(fwiVar.H(intValue)), new y7m(fwiVar.H(intValue2)));
                    float f = ((y7m) pair.getFirst()).a;
                    float f2 = ((y7m) pair.getSecond()).a;
                    to5 to5Var = x4c.E;
                    l690 d = an91.d(f, 0.0f, f2, 0.0f, 10);
                    int i8 = i;
                    boolean c = btsVar4.c(i8);
                    tse tseVar2 = tseVar;
                    boolean e2 = c | btsVar4.e(tseVar2);
                    b bVar2 = b.this;
                    boolean k2 = e2 | btsVar4.k(bVar2);
                    a aVar3 = aVar;
                    boolean k3 = k2 | btsVar4.k(aVar3);
                    Object Q3 = btsVar4.Q();
                    if (k3 || Q3 == did.a) {
                        mt0 mt0Var = new mt0(i8, tseVar2, bVar2, aVar3, 3);
                        btsVar4.o0(mt0Var);
                        Q3 = mt0Var;
                    }
                    adb1.c(null, bVar2, d, i43Var, to5Var, e, false, (tls) Q3, btsVar4, ImageMetadata.EDGE_MODE);
                    return zy11.a;
                }
            }, btsVar2), btsVar, (i5 & 14) | 3504);
            int i7 = (i5 & 896) ^ 384;
            boolean z = (i7 > 256 && btsVar.k(z69Var2)) || (i5 & 384) == 256;
            Object Q3 = btsVar.Q();
            if (z || Q3 == o430Var) {
                Q3 = new HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$5$1(z69Var2, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, zy11.a);
            boolean k2 = btsVar.k(bVar) | ((i7 > 256 && btsVar.k(z69Var2)) || (i5 & 384) == 256);
            Object Q4 = btsVar.Q();
            if (k2 || Q4 == o430Var) {
                Q4 = new HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$6$1(bVar, z69Var2, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, bVar);
        }
        v = btsVar.v();
        if (v != null) {
            final int i8 = 1;
            final z69 z69Var3 = z69Var2;
            wlsVar = new wls() { // from class: pqu
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i8;
                    zy11 zy11Var = zy11.a;
                    int i82 = i2;
                    switch (i72) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i82 | 1);
                            e.a(f530Var, i43Var, z69Var3, i, aVar, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i82 | 1);
                            e.a(f530Var, i43Var, z69Var3, i, aVar, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(f530 f530Var, final androidx.compose.runtime.internal.a aVar, final androidx.compose.runtime.internal.a aVar2, final androidx.compose.runtime.internal.a aVar3, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(811546288);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(aVar3) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new wls() { // from class: com.yandex.smartcamera.arscene.ui.c
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i3;
                        tyu0 tyu0Var = (tyu0) obj;
                        n8e n8eVar = (n8e) obj2;
                        List h0 = tyu0Var.h0(SlotsEnum.First, androidx.compose.runtime.internal.a.this);
                        ArrayList arrayList = new ArrayList(tcc.n(h0, 10));
                        Iterator it = h0.iterator();
                        while (true) {
                            i3 = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            arrayList.add(((x910) it.next()).l0(p8e.b(0, 0, 0, 0, 15)));
                        }
                        Iterator it2 = arrayList.iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            i4 += ((o) it2.next()).a;
                        }
                        List h02 = tyu0Var.h0(SlotsEnum.Last, aVar2);
                        ArrayList arrayList2 = new ArrayList(tcc.n(h02, 10));
                        Iterator it3 = h02.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((x910) it3.next()).l0(p8e.b(0, 0, 0, 0, 15)));
                        }
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            i3 += ((o) it4.next()).a;
                        }
                        long j = n8eVar.a;
                        List h03 = tyu0Var.h0(SlotsEnum.Dependent, new androidx.compose.runtime.internal.a(738638554, new an1(aVar3, (n8e.i(j) / 2) - (i4 / 2), (n8e.i(j) - i3) / 2, 2), true));
                        ArrayList arrayList3 = new ArrayList(tcc.n(h03, 10));
                        Iterator it5 = h03.iterator();
                        while (it5.hasNext()) {
                            arrayList3.add(((x910) it5.next()).l0(j));
                        }
                        return tyu0Var.w(n8e.i(j), n8e.h(j), kotlin.collections.b.f(), new nk2(arrayList3, 5));
                    }
                };
                btsVar.o0(Q);
            }
            androidx.compose.ui.layout.e.a(f530Var, (wls) Q, btsVar, i2 & 14, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(f530Var, aVar, aVar2, aVar3, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r9.l(r10, 0, r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(androidx.compose.foundation.lazy.b bVar, int i, boolean z, ContinuationImpl continuationImpl) {
        HorizontalCenteringSwitcherKt$scrollToItemCenter$1 horizontalCenteringSwitcherKt$scrollToItemCenter$1;
        int i2;
        Object l;
        Integer d;
        Object l2;
        if (continuationImpl instanceof HorizontalCenteringSwitcherKt$scrollToItemCenter$1) {
            horizontalCenteringSwitcherKt$scrollToItemCenter$1 = (HorizontalCenteringSwitcherKt$scrollToItemCenter$1) continuationImpl;
            int i3 = horizontalCenteringSwitcherKt$scrollToItemCenter$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                horizontalCenteringSwitcherKt$scrollToItemCenter$1.label = i3 - Integer.MIN_VALUE;
                Object obj = horizontalCenteringSwitcherKt$scrollToItemCenter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = horizontalCenteringSwitcherKt$scrollToItemCenter$1.label;
                zy11 zy11Var = zy11.a;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            z = horizontalCenteringSwitcherKt$scrollToItemCenter$1.Z$0;
                            i = horizontalCenteringSwitcherKt$scrollToItemCenter$1.I$0;
                            bVar = (androidx.compose.foundation.lazy.b) horizontalCenteringSwitcherKt$scrollToItemCenter$1.L$0;
                            kotlin.b.b(obj);
                        } else if (i2 != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                Integer d2 = d(i, bVar.j());
                if (d2 != null) {
                    int intValue = d2.intValue();
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.L$0 = null;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.I$0 = i;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.Z$0 = z;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.I$1 = intValue;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.I$2 = 0;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.label = 1;
                    if (!z ? (l = bVar.l(i, intValue, horizontalCenteringSwitcherKt$scrollToItemCenter$1)) != coroutineSingletons : (l = bVar.f(i, intValue, horizontalCenteringSwitcherKt$scrollToItemCenter$1)) != coroutineSingletons) {
                        l = zy11Var;
                    }
                    if (l != coroutineSingletons) {
                        return zy11Var;
                    }
                } else {
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.L$0 = bVar;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.I$0 = i;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.Z$0 = z;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.label = 2;
                }
                return coroutineSingletons;
                d = d(i, bVar.j());
                if (d != null) {
                    int intValue2 = d.intValue();
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.L$0 = null;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.I$0 = i;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.Z$0 = z;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.I$1 = intValue2;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.I$2 = 0;
                    horizontalCenteringSwitcherKt$scrollToItemCenter$1.label = 3;
                    if (!z ? (l2 = bVar.l(i, intValue2, horizontalCenteringSwitcherKt$scrollToItemCenter$1)) != coroutineSingletons : (l2 = bVar.f(i, intValue2, horizontalCenteringSwitcherKt$scrollToItemCenter$1)) != coroutineSingletons) {
                        l2 = zy11Var;
                    }
                    if (l2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        horizontalCenteringSwitcherKt$scrollToItemCenter$1 = new HorizontalCenteringSwitcherKt$scrollToItemCenter$1(continuationImpl);
        Object obj2 = horizontalCenteringSwitcherKt$scrollToItemCenter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = horizontalCenteringSwitcherKt$scrollToItemCenter$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i2 == 0) {
        }
        d = d(i, bVar.j());
        if (d != null) {
        }
        return zy11Var2;
    }

    public static final Integer d(int i, s6y s6yVar) {
        Object obj;
        Iterator it = s6yVar.k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((t6y) ((n6y) obj)).a == i) {
                break;
            }
        }
        n6y n6yVar = (n6y) obj;
        if (n6yVar == null) {
            return null;
        }
        return Integer.valueOf((((t6y) n6yVar).p / 2) - ((((int) (s6yVar.e() >> 32)) / 2) - (-s6yVar.l)));
    }
}
