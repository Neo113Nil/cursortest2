package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.c;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.ui.b;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.ar.core.ImageMetadata;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.a6t0;
import defpackage.aii0;
import defpackage.asy0;
import defpackage.atg;
import defpackage.ay11;
import defpackage.ays0;
import defpackage.bb1;
import defpackage.bgr0;
import defpackage.bk91;
import defpackage.bmt0;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.c3c;
import defpackage.c530;
import defpackage.c92;
import defpackage.ci91;
import defpackage.cma1;
import defpackage.cre;
import defpackage.cvw;
import defpackage.cwc0;
import defpackage.did;
import defpackage.dke;
import defpackage.dny0;
import defpackage.dry0;
import defpackage.dur;
import defpackage.dyr;
import defpackage.eiv;
import defpackage.eja1;
import defpackage.ery0;
import defpackage.ety0;
import defpackage.exw0;
import defpackage.eyr;
import defpackage.f530;
import defpackage.f89;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.frb1;
import defpackage.fwi;
import defpackage.g131;
import defpackage.gi91;
import defpackage.gwc0;
import defpackage.gy31;
import defpackage.hcb;
import defpackage.hex0;
import defpackage.hi91;
import defpackage.hk2;
import defpackage.hoy0;
import defpackage.hwd0;
import defpackage.hzr;
import defpackage.i2t0;
import defpackage.i4a1;
import defpackage.ip1;
import defpackage.ire;
import defpackage.iv60;
import defpackage.ivr;
import defpackage.iz21;
import defpackage.izr;
import defpackage.j9a;
import defpackage.jl40;
import defpackage.jnn;
import defpackage.jre;
import defpackage.jvx0;
import defpackage.k5z;
import defpackage.k651;
import defpackage.kk2;
import defpackage.lc0;
import defpackage.ldc;
import defpackage.lj91;
import defpackage.lyc;
import defpackage.lzr;
import defpackage.ml6;
import defpackage.mv60;
import defpackage.n94;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oay;
import defpackage.ohd;
import defpackage.olb1;
import defpackage.osy0;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.pk6;
import defpackage.psy0;
import defpackage.qje;
import defpackage.qmy0;
import defpackage.qtb;
import defpackage.r1b0;
import defpackage.rly0;
import defpackage.rzo;
import defpackage.rzx;
import defpackage.s1a1;
import defpackage.sls;
import defpackage.soy0;
import defpackage.tbb;
import defpackage.td5;
import defpackage.tfx;
import defpackage.tig0;
import defpackage.tj;
import defpackage.tje;
import defpackage.tls;
import defpackage.tly0;
import defpackage.tse;
import defpackage.u200;
import defpackage.u50;
import defpackage.u5t0;
import defpackage.uge;
import defpackage.v2w;
import defpackage.vfc;
import defpackage.vpy0;
import defpackage.vry0;
import defpackage.vw01;
import defpackage.w6u;
import defpackage.w9y;
import defpackage.wjx;
import defpackage.wls;
import defpackage.wvd0;
import defpackage.wwg;
import defpackage.www0;
import defpackage.x4c;
import defpackage.xjx;
import defpackage.xpy0;
import defpackage.y5e;
import defpackage.y6i0;
import defpackage.ylb1;
import defpackage.yly0;
import defpackage.yny0;
import defpackage.yp90;
import defpackage.yur;
import defpackage.yx91;
import defpackage.z910;
import defpackage.zi6;
import defpackage.zii0;
import defpackage.zjy0;
import defpackage.zls;
import defpackage.zny0;
import defpackage.zo1;
import defpackage.zpn;
import defpackage.zqe;
import defpackage.zx40;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class c {
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0471, code lost:
    
        if (r5 > ((r7 != null ? r7.longValue() : 0) + 5000)) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0595 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x062b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0726 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0770 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x07aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x080e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0854 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0411  */
    /* JADX WARN: Type inference failed for: r2v63, types: [f530] */
    /* JADX WARN: Type inference failed for: r5v75, types: [f530] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final hoy0 hoy0Var, final tls tlsVar, final f530 f530Var, final ety0 ety0Var, final gy31 gy31Var, final tls tlsVar2, final zx40 zx40Var, final ml6 ml6Var, final boolean z, final int i, final int i2, final eiv eivVar, final xjx xjxVar, final boolean z2, final boolean z3, final zls zlsVar, fid fidVar, final int i3, final int i4) {
        int i5;
        int i6;
        bts btsVar;
        yny0 yny0Var;
        int i7;
        iv60 iv60Var;
        Object obj;
        int i8;
        vw01 vw01Var;
        vpy0 vpy0Var;
        k651 k651Var;
        ety0 ety0Var2;
        boolean z4;
        kk2 kk2Var;
        Object oayVar;
        bts btsVar2;
        fwi fwiVar;
        dyr dyrVar;
        boolean z5;
        boolean z6;
        hoy0 a;
        Object Q;
        Object obj2;
        ay11 ay11Var;
        Object Q2;
        Object Q3;
        Object Q4;
        int i9;
        int i10;
        eiv eivVar2;
        boolean z7;
        ay11 ay11Var2;
        boolean z8;
        boolean e;
        Object obj3;
        int i11;
        int i12;
        yny0 yny0Var2;
        Object obj4;
        bts btsVar3;
        boolean z9;
        vpy0 vpy0Var2;
        j jVar;
        oay oayVar2;
        eiv eivVar3;
        pk6 pk6Var;
        tse tseVar;
        iv60 iv60Var2;
        hoy0 hoy0Var2;
        c530 c530Var;
        f530 c;
        boolean k;
        Object coreTextFieldKt$CoreTextField$5$1;
        final oay oayVar3;
        yur yurVar;
        f530 f530Var2;
        c530 c530Var2;
        int i13;
        zx40 zx40Var2;
        final j jVar2;
        final iv60 iv60Var3;
        final k651 k651Var2;
        boolean e2;
        Object Q5;
        k651 k651Var3;
        final oay oayVar4;
        c530 c530Var3;
        boolean e3;
        Object Q6;
        boolean e4;
        Object Q7;
        final oay oayVar5;
        eiv eivVar4;
        f530 a2;
        boolean z10;
        boolean a3;
        Object Q8;
        Object obj5;
        long j;
        boolean e5;
        Object Q9;
        final zx40 zx40Var3;
        final yny0 yny0Var3;
        tls a4;
        final boolean z11;
        ?? a5;
        ?? a6;
        bts btsVar4 = (bts) fidVar;
        btsVar4.g0(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (btsVar4.k(hoy0Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= btsVar4.e(tlsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= btsVar4.k(f530Var) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar4.k(ety0Var) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i5 |= btsVar4.k(gy31Var) ? 16384 : 8192;
        }
        if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
            i5 |= btsVar4.e(tlsVar2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= btsVar4.k(zx40Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= btsVar4.k(ml6Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= btsVar4.a(z) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= btsVar4.c(i) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (btsVar4.c(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= btsVar4.k(eivVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= btsVar4.k(xjxVar) ? 256 : 128;
        }
        if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i6 |= btsVar4.a(z2) ? 2048 : 1024;
        }
        if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i6 |= btsVar4.a(z3) ? 16384 : 8192;
        }
        if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
            i6 |= btsVar4.e(zlsVar) ? 131072 : 65536;
        }
        int i14 = i6 | 1572864;
        if (btsVar4.V(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i14) == 599186) ? false : true)) {
            btsVar4.a0();
            if ((i3 & 1) != 0 && !btsVar4.C()) {
                btsVar4.Y();
            }
            btsVar4.u();
            Object Q10 = btsVar4.Q();
            Object obj6 = did.a;
            if (Q10 == obj6) {
                Q10 = vfc.g(btsVar4);
            }
            yur yurVar2 = (yur) Q10;
            Object Q11 = btsVar4.Q();
            if (Q11 == obj6) {
                tls tlsVar3 = androidx.compose.foundation.text.input.internal.d.a;
                Q11 = new androidx.compose.foundation.text.input.internal.a();
                btsVar4.o0(Q11);
            }
            w9y w9yVar = (w9y) Q11;
            Object Q12 = btsVar4.Q();
            if (Q12 == obj6) {
                Q12 = new vpy0(w9yVar);
                btsVar4.o0(Q12);
            }
            vpy0 vpy0Var3 = (vpy0) Q12;
            fwi fwiVar2 = (fwi) btsVar4.m(androidx.compose.ui.platform.j.h);
            dyr dyrVar2 = (dyr) btsVar4.m(androidx.compose.ui.platform.j.k);
            long j2 = ((osy0) btsVar4.m(psy0.a)).b;
            dur durVar = (dur) btsVar4.m(androidx.compose.ui.platform.j.i);
            k651 k651Var4 = (k651) btsVar4.m(androidx.compose.ui.platform.j.u);
            u5t0 u5t0Var = (u5t0) btsVar4.m(androidx.compose.ui.platform.j.q);
            Orientation orientation = (i == 1 && !z && eivVar.a) ? Orientation.Horizontal : Orientation.Vertical;
            btsVar4.e0(-213744626);
            Object[] objArr = {orientation};
            tig0 tig0Var = yny0.g;
            boolean c2 = btsVar4.c(orientation.ordinal());
            Object Q13 = btsVar4.Q();
            if (c2 || Q13 == obj6) {
                Q13 = new lyc(19, orientation);
                btsVar4.o0(Q13);
            }
            yny0 yny0Var4 = (yny0) cvw.W(objArr, tig0Var, (sls) Q13, btsVar4, 0);
            btsVar4.t(false);
            if (((Orientation) yny0Var4.f.getValue()) != orientation) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(orientation == Orientation.Vertical ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i15 = i5 & 14;
            boolean z12 = ((i5 & HProv.ALG_CLASS_ALL) == 16384) | (i15 == 4);
            Object Q14 = btsVar4.Q();
            if (z12 || Q14 == obj6) {
                vw01 a7 = iz21.a(gy31Var, hoy0Var.a);
                iv60 iv60Var4 = a7.b;
                asy0 asy0Var = hoy0Var.c;
                if (asy0Var != null) {
                    yny0Var = yny0Var4;
                    long j3 = asy0Var.a;
                    int i16 = asy0.c;
                    int r = iv60Var4.r((int) (j3 >> 32));
                    i7 = i14;
                    int r2 = iv60Var4.r((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    int min = Math.min(r, r2);
                    int max = Math.max(r, r2);
                    hk2 hk2Var = new hk2(a7.a);
                    hk2Var.a(new bmt0(0L, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, rly0.c, (bgr0) null, 61439), min, max);
                    Q14 = new vw01(hk2Var.i(), iv60Var4);
                } else {
                    yny0Var = yny0Var4;
                    i7 = i14;
                    Q14 = a7;
                }
                btsVar4.o0(Q14);
            } else {
                yny0Var = yny0Var4;
                i7 = i14;
            }
            vw01 vw01Var2 = (vw01) Q14;
            kk2 kk2Var2 = vw01Var2.a;
            iv60 iv60Var5 = vw01Var2.b;
            aii0 B = btsVar4.B();
            if (B == null) {
                ny61.r("no recompose scope found");
                return;
            }
            B.b |= 1;
            boolean k2 = btsVar4.k(u5t0Var);
            Object Q15 = btsVar4.Q();
            if (k2 || Q15 == obj6) {
                iv60Var = iv60Var5;
                obj = obj6;
                i8 = i15;
                vw01Var = vw01Var2;
                vpy0Var = vpy0Var3;
                k651Var = k651Var4;
                ety0Var2 = ety0Var;
                z4 = z;
                kk2Var = kk2Var2;
                btsVar2 = btsVar4;
                fwiVar = fwiVar2;
                dyrVar = dyrVar2;
                oayVar = new oay(new tly0(kk2Var, ety0Var2, z4, fwiVar, dyrVar, 0), B, u5t0Var);
                btsVar2.o0(oayVar);
            } else {
                z4 = z;
                iv60Var = iv60Var5;
                obj = obj6;
                i8 = i15;
                vw01Var = vw01Var2;
                vpy0Var = vpy0Var3;
                dyrVar = dyrVar2;
                k651Var = k651Var4;
                ety0Var2 = ety0Var;
                kk2Var = kk2Var2;
                oayVar = Q15;
                btsVar2 = btsVar4;
                fwiVar = fwiVar2;
            }
            final oay oayVar6 = (oay) oayVar;
            kk2 kk2Var3 = hoy0Var.a;
            long j4 = hoy0Var.b;
            oayVar6.u = tlsVar;
            oayVar6.z = j2;
            wjx wjxVar = oayVar6.r;
            wjxVar.b = xjxVar;
            wjxVar.c = durVar;
            oayVar6.j = kk2Var3;
            tly0 tly0Var = oayVar6.a;
            if (!jl40.l(tly0Var.a, kk2Var) || !jl40.l(tly0Var.b, ety0Var2) || tly0Var.e != z4 || tly0Var.f != 1 || tly0Var.c != Integer.MAX_VALUE || tly0Var.d != 1 || !jl40.l(tly0Var.g, fwiVar) || !jl40.l(tly0Var.i, EmptyList.a) || tly0Var.h != dyrVar) {
                tly0Var = new tly0(kk2Var, ety0Var2, z4, fwiVar, dyrVar, 0);
            }
            ety0 ety0Var3 = ety0Var2;
            final fwi fwiVar3 = fwiVar;
            if (oayVar6.a != tly0Var) {
                oayVar6.p = true;
            }
            oayVar6.a = tly0Var;
            jnn jnnVar = oayVar6.d;
            xpy0 xpy0Var = oayVar6.e;
            jnnVar.getClass();
            asy0 asy0Var2 = hoy0Var.c;
            boolean l = jl40.l(asy0Var2, jnnVar.b.i());
            String str = jnnVar.a.a.b;
            kk2 kk2Var4 = hoy0Var.a;
            if (!jl40.l(str, kk2Var4.b)) {
                jnnVar.b = new zi6(kk2Var4, j4);
                z5 = true;
            } else if (asy0.b(jnnVar.a.b, j4)) {
                z5 = false;
            } else {
                jnnVar.b.p(asy0.f(j4), asy0.e(j4));
                z5 = false;
                z6 = true;
                if (asy0Var2 != null) {
                    zi6 zi6Var = jnnVar.b;
                    zi6Var.w = -1;
                    zi6Var.x = -1;
                } else {
                    long j5 = asy0Var2.a;
                    if (!asy0.c(j5)) {
                        jnnVar.b.n(asy0.f(j5), asy0.e(j5));
                    }
                }
                if (z5 && (z6 || l)) {
                    a = hoy0Var;
                } else {
                    zi6 zi6Var2 = jnnVar.b;
                    zi6Var2.w = -1;
                    zi6Var2.x = -1;
                    a = hoy0.a(hoy0Var, null, 0L, 3);
                }
                hoy0 hoy0Var3 = jnnVar.a;
                jnnVar.a = a;
                if (xpy0Var != null) {
                    xpy0Var.a(hoy0Var3, a);
                }
                Q = btsVar2.Q();
                obj2 = obj;
                if (Q == obj2) {
                    Q = new ay11(0);
                    btsVar2.o0(Q);
                }
                ay11Var = (ay11) Q;
                long currentTimeMillis = System.currentTimeMillis();
                if (!ay11Var.f) {
                    Long l2 = ay11Var.e;
                }
                ay11Var.e = Long.valueOf(currentTimeMillis);
                ay11Var.a(hoy0Var);
                Q2 = btsVar2.Q();
                if (Q2 == obj2) {
                    Q2 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                    btsVar2.o0(Q2);
                }
                final tse tseVar2 = (tse) Q2;
                Q3 = btsVar2.Q();
                if (Q3 == obj2) {
                    Q3 = new androidx.compose.foundation.relocation.a();
                    btsVar2.o0(Q3);
                }
                final pk6 pk6Var2 = (pk6) Q3;
                Q4 = btsVar2.Q();
                if (Q4 == obj2) {
                    Q4 = new j(ay11Var);
                    btsVar2.o0(Q4);
                }
                final j jVar3 = (j) Q4;
                final iv60 iv60Var6 = iv60Var;
                jVar3.b = iv60Var6;
                jVar3.f = gy31Var;
                jVar3.c = oayVar6.v;
                jVar3.d = oayVar6;
                jVar3.e.setValue(hoy0Var);
                jVar3.w = new asy0(j4);
                jVar3.h = (c3c) btsVar2.m(androidx.compose.ui.platform.j.f);
                jVar3.i = tseVar2;
                jVar3.k = (w6u) btsVar2.m(androidx.compose.ui.platform.j.l);
                jVar3.l = yurVar2;
                final boolean z13 = !z3;
                jVar3.m.setValue(Boolean.valueOf(z13));
                jVar3.n.setValue(Boolean.valueOf(z2));
                btsVar2.e0(1966756105);
                jVar3.j = cwc0.b(SelectedTextType.EditableText, ety0Var3.a.k, btsVar2, 6);
                btsVar2.t(false);
                oayVar6.b();
                i9 = i7;
                int i17 = i9 & 7168;
                final vpy0 vpy0Var4 = vpy0Var;
                int i18 = i8;
                boolean e6 = (i17 != 2048) | btsVar2.e(oayVar6) | ((i9 & HProv.ALG_CLASS_ALL) != 16384) | btsVar2.e(vpy0Var4) | (i18 != 4);
                i10 = (i9 & 112) ^ 48;
                if (i10 <= 32) {
                    eivVar2 = eivVar;
                    if (btsVar2.k(eivVar2)) {
                        z7 = e6;
                        ay11Var2 = ay11Var;
                        z8 = true;
                        e = z7 | z8 | btsVar2.e(iv60Var6) | btsVar2.e(tseVar2) | btsVar2.e(pk6Var2) | btsVar2.e(jVar3);
                        Object Q16 = btsVar2.Q();
                        if (!e || Q16 == obj2) {
                            i11 = i9;
                            i12 = i18;
                            yny0Var2 = yny0Var;
                            obj4 = obj2;
                            final eiv eivVar5 = eivVar2;
                            btsVar3 = btsVar2;
                            obj3 = new tls() { // from class: androidx.compose.foundation.text.a
                                @Override // defpackage.tls
                                public final Object invoke(Object obj7) {
                                    ery0 d;
                                    oay oayVar7 = oay.this;
                                    boolean b = oayVar7.b();
                                    FocusStateImpl focusStateImpl = (FocusStateImpl) ((ivr) obj7);
                                    boolean b2 = focusStateImpl.b();
                                    zy11 zy11Var = zy11.a;
                                    if (b != b2) {
                                        oayVar7.f.setValue(Boolean.valueOf(focusStateImpl.b()));
                                        boolean b3 = oayVar7.b();
                                        hoy0 hoy0Var4 = hoy0Var;
                                        iv60 iv60Var7 = iv60Var6;
                                        if (b3 && z2 && !z3) {
                                            c.h(vpy0Var4, oayVar7, hoy0Var4, eivVar5, iv60Var7);
                                        } else {
                                            c.f(oayVar7);
                                        }
                                        if (focusStateImpl.b() && (d = oayVar7.d()) != null) {
                                            tje.N(tseVar2, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(pk6Var2, hoy0Var4, oayVar7, d, iv60Var7, null), 3);
                                        }
                                        if (!focusStateImpl.b()) {
                                            jVar3.g(null);
                                        }
                                    }
                                    return zy11Var;
                                }
                            };
                            z9 = z2;
                            vpy0Var2 = vpy0Var4;
                            jVar = jVar3;
                            oayVar2 = oayVar6;
                            eivVar3 = eivVar5;
                            pk6Var = pk6Var2;
                            tseVar = tseVar2;
                            iv60Var2 = iv60Var6;
                            hoy0Var2 = hoy0Var;
                            btsVar3.o0(obj3);
                        } else {
                            i11 = i9;
                            eivVar3 = eivVar2;
                            i12 = i18;
                            yny0Var2 = yny0Var;
                            btsVar3 = btsVar2;
                            obj3 = Q16;
                            hoy0Var2 = hoy0Var;
                            obj4 = obj2;
                            vpy0Var2 = vpy0Var4;
                            jVar = jVar3;
                            pk6Var = pk6Var2;
                            oayVar2 = oayVar6;
                            z9 = z2;
                            tseVar = tseVar2;
                            iv60Var2 = iv60Var6;
                        }
                        c530Var = c530.a;
                        c = hi91.c(ci91.f(gi91.b(c530Var, yurVar2), (tls) obj3), z9, zx40Var);
                        oz40 n = androidx.compose.runtime.f.n(Boolean.valueOf((z9 || z3) ? false : true), btsVar3);
                        k = btsVar3.k(n) | btsVar3.e(oayVar2) | btsVar3.e(vpy0Var2) | btsVar3.e(jVar) | ((i10 <= 32 && btsVar3.k(eivVar3)) || (i11 & 48) == 32);
                        Object Q17 = btsVar3.Q();
                        if (!k || Q17 == obj4) {
                            oayVar3 = oayVar2;
                            yurVar = yurVar2;
                            f530Var2 = c;
                            vpy0 vpy0Var5 = vpy0Var2;
                            c530Var2 = c530Var;
                            i13 = i10;
                            zx40Var2 = zx40Var;
                            coreTextFieldKt$CoreTextField$5$1 = new CoreTextFieldKt$CoreTextField$5$1(oayVar3, n, vpy0Var5, jVar, eivVar, null);
                            vpy0Var2 = vpy0Var5;
                            btsVar3.o0(coreTextFieldKt$CoreTextField$5$1);
                        } else {
                            coreTextFieldKt$CoreTextField$5$1 = Q17;
                            oayVar3 = oayVar2;
                            yurVar = yurVar2;
                            f530Var2 = c;
                            c530Var2 = c530Var;
                            i13 = i10;
                            zx40Var2 = zx40Var;
                        }
                        zpn.e(btsVar3, (wls) coreTextFieldKt$CoreTextField$5$1, zy11.a);
                        f530 a8 = exw0.a(c530Var2, 8675309, new androidx.compose.foundation.text.selection.c(new cre(oayVar3, 4)));
                        vpy0 vpy0Var6 = vpy0Var2;
                        jVar2 = jVar;
                        final boolean z14 = z9;
                        iv60Var3 = iv60Var2;
                        final yur yurVar3 = yurVar;
                        f530 k3 = (!z2 ? androidx.compose.ui.b.a(a8, m.a(), new ays0(12, new tls() { // from class: sny0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj7) {
                                u5t0 u5t0Var2;
                                wu60 wu60Var = (wu60) obj7;
                                oay oayVar7 = oay.this;
                                if (!oayVar7.b()) {
                                    yur.b(yurVar3);
                                } else if (!z3 && (u5t0Var2 = oayVar7.c) != null) {
                                    ((wqh) u5t0Var2).b();
                                }
                                if (oayVar7.b() && z14) {
                                    if (oayVar7.a() != HandleState.Selection) {
                                        ery0 d = oayVar7.d();
                                        if (d != null) {
                                            long j6 = wu60Var.a;
                                            jnn jnnVar2 = oayVar7.d;
                                            cre creVar = oayVar7.v;
                                            int j7 = iv60Var3.j(d.b(j6, true));
                                            creVar.invoke(hoy0.a(jnnVar2.a, null, eja1.c(j7, j7), 5));
                                            if (oayVar7.a.a.b.length() > 0) {
                                                oayVar7.k.setValue(HandleState.Cursor);
                                            }
                                        }
                                    } else {
                                        jVar2.g(wu60Var);
                                    }
                                }
                                return zy11.a;
                            }
                        }, zx40Var2)) : a8).k(new www0(jVar2.A, jVar2.z, new ip1(2, jVar2), 4));
                        wvd0.a.getClass();
                        f530 b = yx91.b(k3, y5e.b0);
                        final f530 g = bb1.g(c530Var2, new f89(13, oayVar3, hoy0Var2, iv60Var3));
                        k651Var2 = k651Var;
                        boolean e7 = btsVar3.e(oayVar3) | (i17 != 2048) | btsVar3.k(k651Var2) | btsVar3.e(jVar2);
                        int i19 = i12;
                        e2 = e7 | (i19 != 4) | btsVar3.e(iv60Var3);
                        Q5 = btsVar3.Q();
                        if (!e2 || Q5 == obj4) {
                            final hoy0 hoy0Var4 = hoy0Var2;
                            tls tlsVar4 = new tls() { // from class: yqe
                                @Override // defpackage.tls
                                public final Object invoke(Object obj7) {
                                    xpy0 xpy0Var2;
                                    rzx rzxVar;
                                    rzx rzxVar2;
                                    oay oayVar7 = oay.this;
                                    oz40 oz40Var = oayVar7.o;
                                    rzx rzxVar3 = (rzx) obj7;
                                    oayVar7.h = rzxVar3;
                                    ery0 d = oayVar7.d();
                                    if (d != null) {
                                        d.b = rzxVar3;
                                    }
                                    if (z2) {
                                        HandleState a9 = oayVar7.a();
                                        HandleState handleState = HandleState.Selection;
                                        j jVar4 = jVar2;
                                        hoy0 hoy0Var5 = hoy0Var4;
                                        if (a9 == handleState) {
                                            if (((Boolean) oayVar7.l.getValue()).booleanValue() && k651Var2.b()) {
                                                jVar4.s();
                                            } else {
                                                jVar4.p();
                                            }
                                            oayVar7.m.setValue(Boolean.valueOf(amb1.f(jVar4, true)));
                                            oayVar7.n.setValue(Boolean.valueOf(amb1.f(jVar4, false)));
                                            oz40Var.setValue(Boolean.valueOf(asy0.c(hoy0Var5.b)));
                                        } else if (oayVar7.a() == HandleState.Cursor) {
                                            oz40Var.setValue(Boolean.valueOf(amb1.f(jVar4, true)));
                                        }
                                        iv60 iv60Var7 = iv60Var3;
                                        c.g(oayVar7, hoy0Var5, iv60Var7);
                                        ery0 d2 = oayVar7.d();
                                        if (d2 != null && (xpy0Var2 = oayVar7.e) != null && oayVar7.b() && (rzxVar = d2.b) != null && rzxVar.d() && (rzxVar2 = d2.c) != null) {
                                            dry0 dry0Var = d2.a;
                                            oav0 oav0Var = new oav0(4, rzxVar);
                                            zii0 g2 = rx91.g(rzxVar);
                                            zii0 j6 = rzxVar.j(rzxVar2, false);
                                            if (jl40.l((xpy0) xpy0Var2.a.b.get(), xpy0Var2)) {
                                                xpy0Var2.b.h(hoy0Var5, iv60Var7, dry0Var, oav0Var, g2, j6);
                                            }
                                        }
                                    }
                                    return zy11.a;
                                }
                            };
                            k651Var3 = k651Var2;
                            btsVar3.o0(tlsVar4);
                            Q5 = tlsVar4;
                        } else {
                            k651Var3 = k651Var2;
                        }
                        final f530 y = eja1.y(c530Var2, (tls) Q5);
                        oayVar4 = oayVar3;
                        tse tseVar3 = tseVar;
                        jre jreVar = new jre(vw01Var, hoy0Var, oayVar4, z3, z2, gy31Var instanceof yp90, iv60Var3, jVar2, eivVar, yurVar);
                        if (!z2 && !z3 && k651Var3.b() && asy0.c(((asy0) oayVar4.A.getValue()).a) && asy0.c(((asy0) oayVar4.B.getValue()).a)) {
                            c530Var3 = c530Var2;
                        } else {
                            a6 = androidx.compose.ui.b.a(c530Var2, m.a(), new zls() { // from class: androidx.compose.foundation.text.d
                                @Override // defpackage.zls
                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                    Object obj10;
                                    f530 f530Var3 = (f530) obj7;
                                    ((Integer) obj9).getClass();
                                    bts btsVar5 = (bts) ((fid) obj8);
                                    btsVar5.e0(-84507373);
                                    boolean booleanValue = ((Boolean) btsVar5.m(androidx.compose.ui.platform.j.x)).booleanValue();
                                    boolean a9 = btsVar5.a(booleanValue);
                                    Object Q18 = btsVar5.Q();
                                    Object obj11 = did.a;
                                    if (a9 || Q18 == obj11) {
                                        Q18 = new androidx.compose.foundation.text.input.internal.b(booleanValue);
                                        btsVar5.o0(Q18);
                                    }
                                    androidx.compose.foundation.text.input.internal.b bVar = (androidx.compose.foundation.text.input.internal.b) Q18;
                                    Object obj12 = ml6.this;
                                    boolean z15 = ((obj12 instanceof a6t0) && ((a6t0) obj12).a == 16) ? false : true;
                                    if (((k651) btsVar5.m(androidx.compose.ui.platform.j.u)).b()) {
                                        oay oayVar7 = oayVar4;
                                        if (oayVar7.b()) {
                                            hoy0 hoy0Var5 = hoy0Var;
                                            if (asy0.c(hoy0Var5.b) && z15) {
                                                btsVar5.e0(-707487962);
                                                kk2 kk2Var5 = hoy0Var5.a;
                                                asy0 asy0Var3 = new asy0(hoy0Var5.b);
                                                boolean e8 = btsVar5.e(bVar);
                                                Object Q19 = btsVar5.Q();
                                                if (e8 || Q19 == obj11) {
                                                    Q19 = new TextFieldCursorKt$cursor$1$1$1(bVar, null);
                                                    btsVar5.o0(Q19);
                                                }
                                                zpn.f(kk2Var5, asy0Var3, (wls) Q19, btsVar5);
                                                boolean e9 = btsVar5.e(bVar);
                                                Object obj13 = iv60Var3;
                                                boolean e10 = btsVar5.e(obj13) | e9 | btsVar5.k(hoy0Var5) | btsVar5.e(oayVar7) | btsVar5.k(obj12);
                                                Object Q20 = btsVar5.Q();
                                                if (e10 || Q20 == obj11) {
                                                    Object u50Var = new u50(bVar, obj13, hoy0Var5, oayVar7, obj12, 24);
                                                    btsVar5.o0(u50Var);
                                                    Q20 = u50Var;
                                                }
                                                obj10 = bb1.i(f530Var3, (tls) Q20);
                                                btsVar5.t(false);
                                                btsVar5.t(false);
                                                return obj10;
                                            }
                                        }
                                    }
                                    btsVar5.e0(-705473241);
                                    btsVar5.t(false);
                                    obj10 = c530.a;
                                    btsVar5.t(false);
                                    return obj10;
                                }
                            });
                            c530Var3 = a6;
                        }
                        e3 = btsVar3.e(jVar2);
                        Q6 = btsVar3.Q();
                        if (!e3 || Q6 == obj4) {
                            Q6 = new zqe(jVar2, 0);
                            btsVar3.o0(Q6);
                        }
                        zpn.a(jVar2, (tls) Q6, btsVar3);
                        e4 = btsVar3.e(oayVar4) | btsVar3.e(vpy0Var6) | (i19 != 4) | ((i13 <= 32 && btsVar3.k(eivVar)) || (i11 & 48) == 32);
                        Q7 = btsVar3.Q();
                        if (!e4 || Q7 == obj4) {
                            oayVar5 = oayVar4;
                            lc0 lc0Var = new lc0(oayVar5, vpy0Var6, hoy0Var, eivVar, 11);
                            eivVar4 = eivVar;
                            btsVar3.o0(lc0Var);
                            Q7 = lc0Var;
                        } else {
                            eivVar4 = eivVar;
                            oayVar5 = oayVar4;
                        }
                        zpn.a(eivVar4, (tls) Q7, btsVar3);
                        final cre creVar = oayVar5.v;
                        final boolean z15 = i != 1;
                        final int i20 = eivVar4.e;
                        final ay11 ay11Var3 = ay11Var2;
                        a2 = androidx.compose.ui.b.a(c530Var2, m.a(), new zls() { // from class: androidx.compose.foundation.text.e
                            @Override // defpackage.zls
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                ((Integer) obj9).getClass();
                                bts btsVar5 = (bts) ((fid) obj8);
                                btsVar5.e0(851809892);
                                Object Q18 = btsVar5.Q();
                                o430 o430Var = did.a;
                                if (Q18 == o430Var) {
                                    Q18 = new vry0();
                                    btsVar5.o0(Q18);
                                }
                                vry0 vry0Var = (vry0) Q18;
                                Object Q19 = btsVar5.Q();
                                if (Q19 == o430Var) {
                                    Q19 = new atg();
                                    btsVar5.o0(Q19);
                                }
                                dny0 dny0Var = new dny0(oay.this, jVar2, hoy0Var, z13, z15, vry0Var, iv60Var3, ay11Var3, (atg) Q19, creVar, i20);
                                boolean e8 = btsVar5.e(dny0Var);
                                Object Q20 = btsVar5.Q();
                                if (e8 || Q20 == o430Var) {
                                    TextFieldKeyInputKt$textFieldKeyInput$2$1$1 textFieldKeyInputKt$textFieldKeyInput$2$1$1 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(1, dny0Var, dny0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                                    btsVar5.o0(textFieldKeyInputKt$textFieldKeyInput$2$1$1);
                                    Q20 = textFieldKeyInputKt$textFieldKeyInput$2$1$1;
                                }
                                f530 c3 = lj91.c(c530.a, (tls) ((tfx) Q20));
                                btsVar5.t(false);
                                return c3;
                            }
                        });
                        int i21 = eivVar4.d;
                        z10 = (i21 == 7 || i21 == 8) ? false : true;
                        boolean booleanValue = ((Boolean) n.getValue()).booleanValue();
                        a3 = btsVar3.a(z10) | btsVar3.e(w9yVar);
                        Q8 = btsVar3.Q();
                        if (!a3 || Q8 == obj4) {
                            Q8 = new zo1(z10, w9yVar, 6);
                            btsVar3.o0(Q8);
                        }
                        f530 e8 = s1a1.e(booleanValue, z10, (sls) Q8);
                        obj5 = (ml6) btsVar3.m(n94.a);
                        j = ((ldc) btsVar3.m(n94.b)).a;
                        if (!ldc.c(j, rzo.d(1308617531))) {
                            obj5 = new a6t0(j);
                        }
                        e5 = btsVar3.e(oayVar5) | btsVar3.k(obj5);
                        Q9 = btsVar3.Q();
                        if (!e5 || Q9 == obj4) {
                            Q9 = new dke(3, oayVar5, obj5);
                            btsVar3.o0(Q9);
                        }
                        f530 k4 = lj91.d(lj91.d(bk91.f(f530Var.k(bb1.i(c530Var2, (tls) Q9)), w9yVar, oayVar5, jVar2).k(e8).k(f530Var2), new qmy0(0, durVar, oayVar5)), new tj(10, oayVar5, jVar2)).k(a2);
                        if (m.b) {
                            zx40Var3 = zx40Var;
                            yny0Var3 = yny0Var2;
                            a4 = new tls() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.tls
                                public final Object invoke(Object obj7) {
                                    v2w v2wVar = (v2w) obj7;
                                    v2wVar.getClass();
                                    g131 g131Var = v2wVar.a;
                                    g131Var.b("scrollerPosition", yny0.this);
                                    g131Var.b("interactionSource", zx40Var3);
                                    g131Var.b(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(z2));
                                    return zy11.a;
                                }
                            };
                        } else {
                            zx40Var3 = zx40Var;
                            yny0Var3 = yny0Var2;
                            a4 = m.a();
                        }
                        f530 f = i4a1.f(eja1.y(androidx.compose.ui.b.a(k4, a4, new qtb(yny0Var3, z2, zx40Var3, 3)).k(b).k(jreVar), new cre(oayVar5, 0)), new hex0(9, jVar2, tseVar3));
                        z11 = !z2 && oayVar5.b() && ((Boolean) oayVar5.q.getValue()).booleanValue() && k651Var3.b();
                        if (z11) {
                            androidx.compose.ui.semantics.g gVar = u200.a;
                            a5 = androidx.compose.ui.b.a(c530Var2, m.a(), new jvx0(3, jVar2));
                            c530Var2 = a5;
                        }
                        final c530 c530Var4 = c530Var2;
                        final pk6 pk6Var3 = pk6Var;
                        final c530 c530Var5 = c530Var3;
                        final oay oayVar7 = oayVar5;
                        wls wlsVar = new wls() { // from class: dre
                            @Override // defpackage.wls
                            public final Object invoke(Object obj7, Object obj8) {
                                fid fidVar2 = (fid) obj7;
                                int intValue = ((Integer) obj8).intValue();
                                bts btsVar5 = (bts) fidVar2;
                                if (btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                                    final oay oayVar8 = oayVar7;
                                    final ety0 ety0Var4 = ety0Var;
                                    final int i22 = i2;
                                    final int i23 = i;
                                    final yny0 yny0Var5 = yny0Var3;
                                    final hoy0 hoy0Var5 = hoy0Var;
                                    final gy31 gy31Var2 = gy31Var;
                                    final f530 f530Var3 = c530Var5;
                                    final f530 f530Var4 = g;
                                    final f530 f530Var5 = y;
                                    final f530 f530Var6 = c530Var4;
                                    final pk6 pk6Var4 = pk6Var3;
                                    final j jVar4 = jVar2;
                                    final boolean z16 = z11;
                                    final boolean z17 = z3;
                                    final tls tlsVar5 = tlsVar2;
                                    final iv60 iv60Var7 = iv60Var3;
                                    final fwi fwiVar4 = fwiVar3;
                                    zls.this.invoke(wwg.S(-44346382, true, new wls() { // from class: are
                                        @Override // defpackage.wls
                                        public final Object invoke(Object obj9, Object obj10) {
                                            f530 tf31Var;
                                            fid fidVar3 = (fid) obj9;
                                            int intValue2 = ((Integer) obj10).intValue();
                                            bts btsVar6 = (bts) fidVar3;
                                            if (btsVar6.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                final oay oayVar9 = oay.this;
                                                f530 g2 = ljs0.g(c530.a, ((y7m) oayVar9.g.getValue()).a, 0.0f, 2);
                                                int i24 = i22;
                                                final int i25 = i23;
                                                v0b1.c(i24, i25);
                                                ety0 ety0Var5 = ety0Var4;
                                                if (i24 != 1 || i25 != Integer.MAX_VALUE) {
                                                    g2 = g2.k(new hfu(ety0Var5, i24, i25));
                                                }
                                                boolean e9 = btsVar6.e(oayVar9);
                                                Object Q18 = btsVar6.Q();
                                                if (e9 || Q18 == did.a) {
                                                    Q18 = new lyc(18, oayVar9);
                                                    btsVar6.o0(Q18);
                                                }
                                                sls slsVar = (sls) Q18;
                                                yny0 yny0Var6 = yny0Var5;
                                                Orientation orientation2 = (Orientation) yny0Var6.f.getValue();
                                                final hoy0 hoy0Var6 = hoy0Var5;
                                                long j6 = hoy0Var6.b;
                                                int i26 = asy0.c;
                                                int i27 = (int) (j6 >> 32);
                                                long j7 = yny0Var6.e;
                                                if (i27 == ((int) (j7 >> 32)) && (i27 = (int) (j6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) == ((int) (j7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
                                                    i27 = asy0.f(j6);
                                                }
                                                yny0Var6.e = hoy0Var6.b;
                                                vw01 a9 = iz21.a(gy31Var2, hoy0Var6.a);
                                                int i28 = vny0.a[orientation2.ordinal()];
                                                if (i28 == 1) {
                                                    tf31Var = new tf31(yny0Var6, i27, a9, slsVar);
                                                } else {
                                                    if (i28 != 2) {
                                                        w511.b();
                                                        return null;
                                                    }
                                                    tf31Var = new yqu(yny0Var6, i27, a9, slsVar);
                                                }
                                                f530 k5 = ymb1.m(g2).k(tf31Var).k(f530Var3).k(f530Var4).k(new foy0(ety0Var5)).k(f530Var5).k(f530Var6).k(new qk6(pk6Var4));
                                                final j jVar5 = jVar4;
                                                final boolean z18 = z16;
                                                final boolean z19 = z17;
                                                final tls tlsVar6 = tlsVar5;
                                                final iv60 iv60Var8 = iv60Var7;
                                                final fwi fwiVar5 = fwiVar4;
                                                zcb1.c(k5, wwg.S(1412697320, true, new wls() { // from class: bre
                                                    @Override // defpackage.wls
                                                    public final Object invoke(Object obj11, Object obj12) {
                                                        fid fidVar4 = (fid) obj11;
                                                        int intValue3 = ((Integer) obj12).intValue();
                                                        bts btsVar7 = (bts) fidVar4;
                                                        if (btsVar7.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                            oay oayVar10 = oayVar9;
                                                            gre greVar = new gre(oayVar10, tlsVar6, hoy0Var6, iv60Var8, fwiVar5, i25);
                                                            int hashCode = Long.hashCode(btsVar7.T);
                                                            r1b0 o = btsVar7.o();
                                                            f530 d = b.d(btsVar7, c530.a);
                                                            ohd.G1.getClass();
                                                            sls slsVar2 = d.b;
                                                            if (btsVar7.a == null) {
                                                                cma1.b0();
                                                                throw null;
                                                            }
                                                            btsVar7.i0();
                                                            if (btsVar7.S) {
                                                                btsVar7.n(slsVar2);
                                                            } else {
                                                                btsVar7.r0();
                                                            }
                                                            qje.W(btsVar7, d.f, greVar);
                                                            qje.W(btsVar7, d.e, o);
                                                            qje.W(btsVar7, d.g, Integer.valueOf(hashCode));
                                                            qje.M(btsVar7, d.h);
                                                            qje.W(btsVar7, d.d, d);
                                                            btsVar7.t(true);
                                                            HandleState a10 = oayVar10.a();
                                                            HandleState handleState = HandleState.None;
                                                            boolean z20 = z18;
                                                            boolean z21 = a10 != handleState && oayVar10.c() != null && oayVar10.c().d() && z20;
                                                            j jVar6 = j.this;
                                                            c.c(jVar6, z21, btsVar7, 0);
                                                            if (oayVar10.a() == HandleState.Cursor && !z19 && z20) {
                                                                btsVar7.e0(-714666198);
                                                                c.d(jVar6, btsVar7, 0);
                                                                btsVar7.t(false);
                                                            } else {
                                                                btsVar7.e0(-714589318);
                                                                btsVar7.t(false);
                                                            }
                                                        } else {
                                                            btsVar7.Y();
                                                        }
                                                        return zy11.a;
                                                    }
                                                }, btsVar6), btsVar6, 48);
                                            } else {
                                                btsVar6.Y();
                                            }
                                            return zy11.a;
                                        }
                                    }, btsVar5), btsVar5, 6);
                                } else {
                                    btsVar5.Y();
                                }
                                return zy11.a;
                            }
                        };
                        btsVar = btsVar3;
                        b(f, jVar2, wwg.S(-814563849, true, wlsVar, btsVar), btsVar, 384);
                    }
                } else {
                    eivVar2 = eivVar;
                }
                z7 = e6;
                ay11Var2 = ay11Var;
                if ((i9 & 48) != 32) {
                    z8 = false;
                    e = z7 | z8 | btsVar2.e(iv60Var6) | btsVar2.e(tseVar2) | btsVar2.e(pk6Var2) | btsVar2.e(jVar3);
                    Object Q162 = btsVar2.Q();
                    if (e) {
                    }
                    i11 = i9;
                    i12 = i18;
                    yny0Var2 = yny0Var;
                    obj4 = obj2;
                    final eiv eivVar52 = eivVar2;
                    btsVar3 = btsVar2;
                    obj3 = new tls() { // from class: androidx.compose.foundation.text.a
                        @Override // defpackage.tls
                        public final Object invoke(Object obj7) {
                            ery0 d;
                            oay oayVar72 = oay.this;
                            boolean b2 = oayVar72.b();
                            FocusStateImpl focusStateImpl = (FocusStateImpl) ((ivr) obj7);
                            boolean b22 = focusStateImpl.b();
                            zy11 zy11Var = zy11.a;
                            if (b2 != b22) {
                                oayVar72.f.setValue(Boolean.valueOf(focusStateImpl.b()));
                                boolean b3 = oayVar72.b();
                                hoy0 hoy0Var42 = hoy0Var;
                                iv60 iv60Var7 = iv60Var6;
                                if (b3 && z2 && !z3) {
                                    c.h(vpy0Var4, oayVar72, hoy0Var42, eivVar52, iv60Var7);
                                } else {
                                    c.f(oayVar72);
                                }
                                if (focusStateImpl.b() && (d = oayVar72.d()) != null) {
                                    tje.N(tseVar2, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(pk6Var2, hoy0Var42, oayVar72, d, iv60Var7, null), 3);
                                }
                                if (!focusStateImpl.b()) {
                                    jVar3.g(null);
                                }
                            }
                            return zy11Var;
                        }
                    };
                    z9 = z2;
                    vpy0Var2 = vpy0Var4;
                    jVar = jVar3;
                    oayVar2 = oayVar6;
                    eivVar3 = eivVar52;
                    pk6Var = pk6Var2;
                    tseVar = tseVar2;
                    iv60Var2 = iv60Var6;
                    hoy0Var2 = hoy0Var;
                    btsVar3.o0(obj3);
                    c530Var = c530.a;
                    c = hi91.c(ci91.f(gi91.b(c530Var, yurVar2), (tls) obj3), z9, zx40Var);
                    oz40 n2 = androidx.compose.runtime.f.n(Boolean.valueOf((z9 || z3) ? false : true), btsVar3);
                    k = btsVar3.k(n2) | btsVar3.e(oayVar2) | btsVar3.e(vpy0Var2) | btsVar3.e(jVar) | ((i10 <= 32 && btsVar3.k(eivVar3)) || (i11 & 48) == 32);
                    Object Q172 = btsVar3.Q();
                    if (k) {
                    }
                    oayVar3 = oayVar2;
                    yurVar = yurVar2;
                    f530Var2 = c;
                    vpy0 vpy0Var52 = vpy0Var2;
                    c530Var2 = c530Var;
                    i13 = i10;
                    zx40Var2 = zx40Var;
                    coreTextFieldKt$CoreTextField$5$1 = new CoreTextFieldKt$CoreTextField$5$1(oayVar3, n2, vpy0Var52, jVar, eivVar, null);
                    vpy0Var2 = vpy0Var52;
                    btsVar3.o0(coreTextFieldKt$CoreTextField$5$1);
                    zpn.e(btsVar3, (wls) coreTextFieldKt$CoreTextField$5$1, zy11.a);
                    f530 a82 = exw0.a(c530Var2, 8675309, new androidx.compose.foundation.text.selection.c(new cre(oayVar3, 4)));
                    vpy0 vpy0Var62 = vpy0Var2;
                    jVar2 = jVar;
                    final boolean z142 = z9;
                    iv60Var3 = iv60Var2;
                    final yur yurVar32 = yurVar;
                    f530 k32 = (!z2 ? androidx.compose.ui.b.a(a82, m.a(), new ays0(12, new tls() { // from class: sny0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj7) {
                            u5t0 u5t0Var2;
                            wu60 wu60Var = (wu60) obj7;
                            oay oayVar72 = oay.this;
                            if (!oayVar72.b()) {
                                yur.b(yurVar32);
                            } else if (!z3 && (u5t0Var2 = oayVar72.c) != null) {
                                ((wqh) u5t0Var2).b();
                            }
                            if (oayVar72.b() && z142) {
                                if (oayVar72.a() != HandleState.Selection) {
                                    ery0 d = oayVar72.d();
                                    if (d != null) {
                                        long j6 = wu60Var.a;
                                        jnn jnnVar2 = oayVar72.d;
                                        cre creVar2 = oayVar72.v;
                                        int j7 = iv60Var3.j(d.b(j6, true));
                                        creVar2.invoke(hoy0.a(jnnVar2.a, null, eja1.c(j7, j7), 5));
                                        if (oayVar72.a.a.b.length() > 0) {
                                            oayVar72.k.setValue(HandleState.Cursor);
                                        }
                                    }
                                } else {
                                    jVar2.g(wu60Var);
                                }
                            }
                            return zy11.a;
                        }
                    }, zx40Var2)) : a82).k(new www0(jVar2.A, jVar2.z, new ip1(2, jVar2), 4));
                    wvd0.a.getClass();
                    f530 b2 = yx91.b(k32, y5e.b0);
                    final f530 g2 = bb1.g(c530Var2, new f89(13, oayVar3, hoy0Var2, iv60Var3));
                    k651Var2 = k651Var;
                    boolean e72 = btsVar3.e(oayVar3) | (i17 != 2048) | btsVar3.k(k651Var2) | btsVar3.e(jVar2);
                    int i192 = i12;
                    e2 = e72 | (i192 != 4) | btsVar3.e(iv60Var3);
                    Q5 = btsVar3.Q();
                    if (e2) {
                    }
                    final hoy0 hoy0Var42 = hoy0Var2;
                    tls tlsVar42 = new tls() { // from class: yqe
                        @Override // defpackage.tls
                        public final Object invoke(Object obj7) {
                            xpy0 xpy0Var2;
                            rzx rzxVar;
                            rzx rzxVar2;
                            oay oayVar72 = oay.this;
                            oz40 oz40Var = oayVar72.o;
                            rzx rzxVar3 = (rzx) obj7;
                            oayVar72.h = rzxVar3;
                            ery0 d = oayVar72.d();
                            if (d != null) {
                                d.b = rzxVar3;
                            }
                            if (z2) {
                                HandleState a9 = oayVar72.a();
                                HandleState handleState = HandleState.Selection;
                                j jVar4 = jVar2;
                                hoy0 hoy0Var5 = hoy0Var42;
                                if (a9 == handleState) {
                                    if (((Boolean) oayVar72.l.getValue()).booleanValue() && k651Var2.b()) {
                                        jVar4.s();
                                    } else {
                                        jVar4.p();
                                    }
                                    oayVar72.m.setValue(Boolean.valueOf(amb1.f(jVar4, true)));
                                    oayVar72.n.setValue(Boolean.valueOf(amb1.f(jVar4, false)));
                                    oz40Var.setValue(Boolean.valueOf(asy0.c(hoy0Var5.b)));
                                } else if (oayVar72.a() == HandleState.Cursor) {
                                    oz40Var.setValue(Boolean.valueOf(amb1.f(jVar4, true)));
                                }
                                iv60 iv60Var7 = iv60Var3;
                                c.g(oayVar72, hoy0Var5, iv60Var7);
                                ery0 d2 = oayVar72.d();
                                if (d2 != null && (xpy0Var2 = oayVar72.e) != null && oayVar72.b() && (rzxVar = d2.b) != null && rzxVar.d() && (rzxVar2 = d2.c) != null) {
                                    dry0 dry0Var = d2.a;
                                    oav0 oav0Var = new oav0(4, rzxVar);
                                    zii0 g22 = rx91.g(rzxVar);
                                    zii0 j6 = rzxVar.j(rzxVar2, false);
                                    if (jl40.l((xpy0) xpy0Var2.a.b.get(), xpy0Var2)) {
                                        xpy0Var2.b.h(hoy0Var5, iv60Var7, dry0Var, oav0Var, g22, j6);
                                    }
                                }
                            }
                            return zy11.a;
                        }
                    };
                    k651Var3 = k651Var2;
                    btsVar3.o0(tlsVar42);
                    Q5 = tlsVar42;
                    final f530 y2 = eja1.y(c530Var2, (tls) Q5);
                    oayVar4 = oayVar3;
                    tse tseVar32 = tseVar;
                    jre jreVar2 = new jre(vw01Var, hoy0Var, oayVar4, z3, z2, gy31Var instanceof yp90, iv60Var3, jVar2, eivVar, yurVar);
                    if (!z2 && !z3 && k651Var3.b() && asy0.c(((asy0) oayVar4.A.getValue()).a) && asy0.c(((asy0) oayVar4.B.getValue()).a)) {
                    }
                    e3 = btsVar3.e(jVar2);
                    Q6 = btsVar3.Q();
                    if (!e3) {
                    }
                    Q6 = new zqe(jVar2, 0);
                    btsVar3.o0(Q6);
                    zpn.a(jVar2, (tls) Q6, btsVar3);
                    e4 = btsVar3.e(oayVar4) | btsVar3.e(vpy0Var62) | (i192 != 4) | ((i13 <= 32 && btsVar3.k(eivVar)) || (i11 & 48) == 32);
                    Q7 = btsVar3.Q();
                    if (e4) {
                    }
                    oayVar5 = oayVar4;
                    lc0 lc0Var2 = new lc0(oayVar5, vpy0Var62, hoy0Var, eivVar, 11);
                    eivVar4 = eivVar;
                    btsVar3.o0(lc0Var2);
                    Q7 = lc0Var2;
                    zpn.a(eivVar4, (tls) Q7, btsVar3);
                    final tls creVar2 = oayVar5.v;
                    if (i != 1) {
                    }
                    final int i202 = eivVar4.e;
                    final ay11 ay11Var32 = ay11Var2;
                    a2 = androidx.compose.ui.b.a(c530Var2, m.a(), new zls() { // from class: androidx.compose.foundation.text.e
                        @Override // defpackage.zls
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            ((Integer) obj9).getClass();
                            bts btsVar5 = (bts) ((fid) obj8);
                            btsVar5.e0(851809892);
                            Object Q18 = btsVar5.Q();
                            o430 o430Var = did.a;
                            if (Q18 == o430Var) {
                                Q18 = new vry0();
                                btsVar5.o0(Q18);
                            }
                            vry0 vry0Var = (vry0) Q18;
                            Object Q19 = btsVar5.Q();
                            if (Q19 == o430Var) {
                                Q19 = new atg();
                                btsVar5.o0(Q19);
                            }
                            dny0 dny0Var = new dny0(oay.this, jVar2, hoy0Var, z13, z15, vry0Var, iv60Var3, ay11Var32, (atg) Q19, creVar2, i202);
                            boolean e82 = btsVar5.e(dny0Var);
                            Object Q20 = btsVar5.Q();
                            if (e82 || Q20 == o430Var) {
                                TextFieldKeyInputKt$textFieldKeyInput$2$1$1 textFieldKeyInputKt$textFieldKeyInput$2$1$1 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(1, dny0Var, dny0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                                btsVar5.o0(textFieldKeyInputKt$textFieldKeyInput$2$1$1);
                                Q20 = textFieldKeyInputKt$textFieldKeyInput$2$1$1;
                            }
                            f530 c3 = lj91.c(c530.a, (tls) ((tfx) Q20));
                            btsVar5.t(false);
                            return c3;
                        }
                    });
                    int i212 = eivVar4.d;
                    if (i212 == 7) {
                        boolean booleanValue2 = ((Boolean) n2.getValue()).booleanValue();
                        a3 = btsVar3.a(z10) | btsVar3.e(w9yVar);
                        Q8 = btsVar3.Q();
                        if (!a3) {
                        }
                        Q8 = new zo1(z10, w9yVar, 6);
                        btsVar3.o0(Q8);
                        f530 e82 = s1a1.e(booleanValue2, z10, (sls) Q8);
                        obj5 = (ml6) btsVar3.m(n94.a);
                        j = ((ldc) btsVar3.m(n94.b)).a;
                        if (!ldc.c(j, rzo.d(1308617531))) {
                        }
                        e5 = btsVar3.e(oayVar5) | btsVar3.k(obj5);
                        Q9 = btsVar3.Q();
                        if (!e5) {
                        }
                        Q9 = new dke(3, oayVar5, obj5);
                        btsVar3.o0(Q9);
                        f530 k42 = lj91.d(lj91.d(bk91.f(f530Var.k(bb1.i(c530Var2, (tls) Q9)), w9yVar, oayVar5, jVar2).k(e82).k(f530Var2), new qmy0(0, durVar, oayVar5)), new tj(10, oayVar5, jVar2)).k(a2);
                        if (m.b) {
                        }
                        f530 f2 = i4a1.f(eja1.y(androidx.compose.ui.b.a(k42, a4, new qtb(yny0Var3, z2, zx40Var3, 3)).k(b2).k(jreVar2), new cre(oayVar5, 0)), new hex0(9, jVar2, tseVar32));
                        if (z2) {
                        }
                        if (z11) {
                        }
                        final f530 c530Var42 = c530Var2;
                        final pk6 pk6Var32 = pk6Var;
                        final f530 c530Var52 = c530Var3;
                        final oay oayVar72 = oayVar5;
                        wls wlsVar2 = new wls() { // from class: dre
                            @Override // defpackage.wls
                            public final Object invoke(Object obj7, Object obj8) {
                                fid fidVar2 = (fid) obj7;
                                int intValue = ((Integer) obj8).intValue();
                                bts btsVar5 = (bts) fidVar2;
                                if (btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                                    final oay oayVar8 = oayVar72;
                                    final ety0 ety0Var4 = ety0Var;
                                    final int i22 = i2;
                                    final int i23 = i;
                                    final yny0 yny0Var5 = yny0Var3;
                                    final hoy0 hoy0Var5 = hoy0Var;
                                    final gy31 gy31Var2 = gy31Var;
                                    final f530 f530Var3 = c530Var52;
                                    final f530 f530Var4 = g2;
                                    final f530 f530Var5 = y2;
                                    final f530 f530Var6 = c530Var42;
                                    final pk6 pk6Var4 = pk6Var32;
                                    final j jVar4 = jVar2;
                                    final boolean z16 = z11;
                                    final boolean z17 = z3;
                                    final tls tlsVar5 = tlsVar2;
                                    final iv60 iv60Var7 = iv60Var3;
                                    final fwi fwiVar4 = fwiVar3;
                                    zls.this.invoke(wwg.S(-44346382, true, new wls() { // from class: are
                                        @Override // defpackage.wls
                                        public final Object invoke(Object obj9, Object obj10) {
                                            f530 tf31Var;
                                            fid fidVar3 = (fid) obj9;
                                            int intValue2 = ((Integer) obj10).intValue();
                                            bts btsVar6 = (bts) fidVar3;
                                            if (btsVar6.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                final oay oayVar9 = oay.this;
                                                f530 g22 = ljs0.g(c530.a, ((y7m) oayVar9.g.getValue()).a, 0.0f, 2);
                                                int i24 = i22;
                                                final int i25 = i23;
                                                v0b1.c(i24, i25);
                                                ety0 ety0Var5 = ety0Var4;
                                                if (i24 != 1 || i25 != Integer.MAX_VALUE) {
                                                    g22 = g22.k(new hfu(ety0Var5, i24, i25));
                                                }
                                                boolean e9 = btsVar6.e(oayVar9);
                                                Object Q18 = btsVar6.Q();
                                                if (e9 || Q18 == did.a) {
                                                    Q18 = new lyc(18, oayVar9);
                                                    btsVar6.o0(Q18);
                                                }
                                                sls slsVar = (sls) Q18;
                                                yny0 yny0Var6 = yny0Var5;
                                                Orientation orientation2 = (Orientation) yny0Var6.f.getValue();
                                                final hoy0 hoy0Var6 = hoy0Var5;
                                                long j6 = hoy0Var6.b;
                                                int i26 = asy0.c;
                                                int i27 = (int) (j6 >> 32);
                                                long j7 = yny0Var6.e;
                                                if (i27 == ((int) (j7 >> 32)) && (i27 = (int) (j6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) == ((int) (j7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
                                                    i27 = asy0.f(j6);
                                                }
                                                yny0Var6.e = hoy0Var6.b;
                                                vw01 a9 = iz21.a(gy31Var2, hoy0Var6.a);
                                                int i28 = vny0.a[orientation2.ordinal()];
                                                if (i28 == 1) {
                                                    tf31Var = new tf31(yny0Var6, i27, a9, slsVar);
                                                } else {
                                                    if (i28 != 2) {
                                                        w511.b();
                                                        return null;
                                                    }
                                                    tf31Var = new yqu(yny0Var6, i27, a9, slsVar);
                                                }
                                                f530 k5 = ymb1.m(g22).k(tf31Var).k(f530Var3).k(f530Var4).k(new foy0(ety0Var5)).k(f530Var5).k(f530Var6).k(new qk6(pk6Var4));
                                                final j jVar5 = jVar4;
                                                final boolean z18 = z16;
                                                final boolean z19 = z17;
                                                final tls tlsVar6 = tlsVar5;
                                                final iv60 iv60Var8 = iv60Var7;
                                                final fwi fwiVar5 = fwiVar4;
                                                zcb1.c(k5, wwg.S(1412697320, true, new wls() { // from class: bre
                                                    @Override // defpackage.wls
                                                    public final Object invoke(Object obj11, Object obj12) {
                                                        fid fidVar4 = (fid) obj11;
                                                        int intValue3 = ((Integer) obj12).intValue();
                                                        bts btsVar7 = (bts) fidVar4;
                                                        if (btsVar7.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                            oay oayVar10 = oayVar9;
                                                            gre greVar = new gre(oayVar10, tlsVar6, hoy0Var6, iv60Var8, fwiVar5, i25);
                                                            int hashCode = Long.hashCode(btsVar7.T);
                                                            r1b0 o = btsVar7.o();
                                                            f530 d = b.d(btsVar7, c530.a);
                                                            ohd.G1.getClass();
                                                            sls slsVar2 = d.b;
                                                            if (btsVar7.a == null) {
                                                                cma1.b0();
                                                                throw null;
                                                            }
                                                            btsVar7.i0();
                                                            if (btsVar7.S) {
                                                                btsVar7.n(slsVar2);
                                                            } else {
                                                                btsVar7.r0();
                                                            }
                                                            qje.W(btsVar7, d.f, greVar);
                                                            qje.W(btsVar7, d.e, o);
                                                            qje.W(btsVar7, d.g, Integer.valueOf(hashCode));
                                                            qje.M(btsVar7, d.h);
                                                            qje.W(btsVar7, d.d, d);
                                                            btsVar7.t(true);
                                                            HandleState a10 = oayVar10.a();
                                                            HandleState handleState = HandleState.None;
                                                            boolean z20 = z18;
                                                            boolean z21 = a10 != handleState && oayVar10.c() != null && oayVar10.c().d() && z20;
                                                            j jVar6 = j.this;
                                                            c.c(jVar6, z21, btsVar7, 0);
                                                            if (oayVar10.a() == HandleState.Cursor && !z19 && z20) {
                                                                btsVar7.e0(-714666198);
                                                                c.d(jVar6, btsVar7, 0);
                                                                btsVar7.t(false);
                                                            } else {
                                                                btsVar7.e0(-714589318);
                                                                btsVar7.t(false);
                                                            }
                                                        } else {
                                                            btsVar7.Y();
                                                        }
                                                        return zy11.a;
                                                    }
                                                }, btsVar6), btsVar6, 48);
                                            } else {
                                                btsVar6.Y();
                                            }
                                            return zy11.a;
                                        }
                                    }, btsVar5), btsVar5, 6);
                                } else {
                                    btsVar5.Y();
                                }
                                return zy11.a;
                            }
                        };
                        btsVar = btsVar3;
                        b(f2, jVar2, wwg.S(-814563849, true, wlsVar2, btsVar), btsVar, 384);
                    }
                    boolean booleanValue22 = ((Boolean) n2.getValue()).booleanValue();
                    a3 = btsVar3.a(z10) | btsVar3.e(w9yVar);
                    Q8 = btsVar3.Q();
                    if (!a3) {
                    }
                    Q8 = new zo1(z10, w9yVar, 6);
                    btsVar3.o0(Q8);
                    f530 e822 = s1a1.e(booleanValue22, z10, (sls) Q8);
                    obj5 = (ml6) btsVar3.m(n94.a);
                    j = ((ldc) btsVar3.m(n94.b)).a;
                    if (!ldc.c(j, rzo.d(1308617531))) {
                    }
                    e5 = btsVar3.e(oayVar5) | btsVar3.k(obj5);
                    Q9 = btsVar3.Q();
                    if (!e5) {
                    }
                    Q9 = new dke(3, oayVar5, obj5);
                    btsVar3.o0(Q9);
                    f530 k422 = lj91.d(lj91.d(bk91.f(f530Var.k(bb1.i(c530Var2, (tls) Q9)), w9yVar, oayVar5, jVar2).k(e822).k(f530Var2), new qmy0(0, durVar, oayVar5)), new tj(10, oayVar5, jVar2)).k(a2);
                    if (m.b) {
                    }
                    f530 f22 = i4a1.f(eja1.y(androidx.compose.ui.b.a(k422, a4, new qtb(yny0Var3, z2, zx40Var3, 3)).k(b2).k(jreVar2), new cre(oayVar5, 0)), new hex0(9, jVar2, tseVar32));
                    if (z2) {
                    }
                    if (z11) {
                    }
                    final f530 c530Var422 = c530Var2;
                    final pk6 pk6Var322 = pk6Var;
                    final f530 c530Var522 = c530Var3;
                    final oay oayVar722 = oayVar5;
                    wls wlsVar22 = new wls() { // from class: dre
                        @Override // defpackage.wls
                        public final Object invoke(Object obj7, Object obj8) {
                            fid fidVar2 = (fid) obj7;
                            int intValue = ((Integer) obj8).intValue();
                            bts btsVar5 = (bts) fidVar2;
                            if (btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                                final oay oayVar8 = oayVar722;
                                final ety0 ety0Var4 = ety0Var;
                                final int i22 = i2;
                                final int i23 = i;
                                final yny0 yny0Var5 = yny0Var3;
                                final hoy0 hoy0Var5 = hoy0Var;
                                final gy31 gy31Var2 = gy31Var;
                                final f530 f530Var3 = c530Var522;
                                final f530 f530Var4 = g2;
                                final f530 f530Var5 = y2;
                                final f530 f530Var6 = c530Var422;
                                final pk6 pk6Var4 = pk6Var322;
                                final j jVar4 = jVar2;
                                final boolean z16 = z11;
                                final boolean z17 = z3;
                                final tls tlsVar5 = tlsVar2;
                                final iv60 iv60Var7 = iv60Var3;
                                final fwi fwiVar4 = fwiVar3;
                                zls.this.invoke(wwg.S(-44346382, true, new wls() { // from class: are
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj9, Object obj10) {
                                        f530 tf31Var;
                                        fid fidVar3 = (fid) obj9;
                                        int intValue2 = ((Integer) obj10).intValue();
                                        bts btsVar6 = (bts) fidVar3;
                                        if (btsVar6.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            final oay oayVar9 = oay.this;
                                            f530 g22 = ljs0.g(c530.a, ((y7m) oayVar9.g.getValue()).a, 0.0f, 2);
                                            int i24 = i22;
                                            final int i25 = i23;
                                            v0b1.c(i24, i25);
                                            ety0 ety0Var5 = ety0Var4;
                                            if (i24 != 1 || i25 != Integer.MAX_VALUE) {
                                                g22 = g22.k(new hfu(ety0Var5, i24, i25));
                                            }
                                            boolean e9 = btsVar6.e(oayVar9);
                                            Object Q18 = btsVar6.Q();
                                            if (e9 || Q18 == did.a) {
                                                Q18 = new lyc(18, oayVar9);
                                                btsVar6.o0(Q18);
                                            }
                                            sls slsVar = (sls) Q18;
                                            yny0 yny0Var6 = yny0Var5;
                                            Orientation orientation2 = (Orientation) yny0Var6.f.getValue();
                                            final hoy0 hoy0Var6 = hoy0Var5;
                                            long j6 = hoy0Var6.b;
                                            int i26 = asy0.c;
                                            int i27 = (int) (j6 >> 32);
                                            long j7 = yny0Var6.e;
                                            if (i27 == ((int) (j7 >> 32)) && (i27 = (int) (j6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) == ((int) (j7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
                                                i27 = asy0.f(j6);
                                            }
                                            yny0Var6.e = hoy0Var6.b;
                                            vw01 a9 = iz21.a(gy31Var2, hoy0Var6.a);
                                            int i28 = vny0.a[orientation2.ordinal()];
                                            if (i28 == 1) {
                                                tf31Var = new tf31(yny0Var6, i27, a9, slsVar);
                                            } else {
                                                if (i28 != 2) {
                                                    w511.b();
                                                    return null;
                                                }
                                                tf31Var = new yqu(yny0Var6, i27, a9, slsVar);
                                            }
                                            f530 k5 = ymb1.m(g22).k(tf31Var).k(f530Var3).k(f530Var4).k(new foy0(ety0Var5)).k(f530Var5).k(f530Var6).k(new qk6(pk6Var4));
                                            final j jVar5 = jVar4;
                                            final boolean z18 = z16;
                                            final boolean z19 = z17;
                                            final tls tlsVar6 = tlsVar5;
                                            final iv60 iv60Var8 = iv60Var7;
                                            final fwi fwiVar5 = fwiVar4;
                                            zcb1.c(k5, wwg.S(1412697320, true, new wls() { // from class: bre
                                                @Override // defpackage.wls
                                                public final Object invoke(Object obj11, Object obj12) {
                                                    fid fidVar4 = (fid) obj11;
                                                    int intValue3 = ((Integer) obj12).intValue();
                                                    bts btsVar7 = (bts) fidVar4;
                                                    if (btsVar7.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                        oay oayVar10 = oayVar9;
                                                        gre greVar = new gre(oayVar10, tlsVar6, hoy0Var6, iv60Var8, fwiVar5, i25);
                                                        int hashCode = Long.hashCode(btsVar7.T);
                                                        r1b0 o = btsVar7.o();
                                                        f530 d = b.d(btsVar7, c530.a);
                                                        ohd.G1.getClass();
                                                        sls slsVar2 = d.b;
                                                        if (btsVar7.a == null) {
                                                            cma1.b0();
                                                            throw null;
                                                        }
                                                        btsVar7.i0();
                                                        if (btsVar7.S) {
                                                            btsVar7.n(slsVar2);
                                                        } else {
                                                            btsVar7.r0();
                                                        }
                                                        qje.W(btsVar7, d.f, greVar);
                                                        qje.W(btsVar7, d.e, o);
                                                        qje.W(btsVar7, d.g, Integer.valueOf(hashCode));
                                                        qje.M(btsVar7, d.h);
                                                        qje.W(btsVar7, d.d, d);
                                                        btsVar7.t(true);
                                                        HandleState a10 = oayVar10.a();
                                                        HandleState handleState = HandleState.None;
                                                        boolean z20 = z18;
                                                        boolean z21 = a10 != handleState && oayVar10.c() != null && oayVar10.c().d() && z20;
                                                        j jVar6 = j.this;
                                                        c.c(jVar6, z21, btsVar7, 0);
                                                        if (oayVar10.a() == HandleState.Cursor && !z19 && z20) {
                                                            btsVar7.e0(-714666198);
                                                            c.d(jVar6, btsVar7, 0);
                                                            btsVar7.t(false);
                                                        } else {
                                                            btsVar7.e0(-714589318);
                                                            btsVar7.t(false);
                                                        }
                                                    } else {
                                                        btsVar7.Y();
                                                    }
                                                    return zy11.a;
                                                }
                                            }, btsVar6), btsVar6, 48);
                                        } else {
                                            btsVar6.Y();
                                        }
                                        return zy11.a;
                                    }
                                }, btsVar5), btsVar5, 6);
                            } else {
                                btsVar5.Y();
                            }
                            return zy11.a;
                        }
                    };
                    btsVar = btsVar3;
                    b(f22, jVar2, wwg.S(-814563849, true, wlsVar22, btsVar), btsVar, 384);
                }
                z8 = true;
                e = z7 | z8 | btsVar2.e(iv60Var6) | btsVar2.e(tseVar2) | btsVar2.e(pk6Var2) | btsVar2.e(jVar3);
                Object Q1622 = btsVar2.Q();
                if (e) {
                }
                i11 = i9;
                i12 = i18;
                yny0Var2 = yny0Var;
                obj4 = obj2;
                final eiv eivVar522 = eivVar2;
                btsVar3 = btsVar2;
                obj3 = new tls() { // from class: androidx.compose.foundation.text.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj7) {
                        ery0 d;
                        oay oayVar723 = oay.this;
                        boolean b22 = oayVar723.b();
                        FocusStateImpl focusStateImpl = (FocusStateImpl) ((ivr) obj7);
                        boolean b222 = focusStateImpl.b();
                        zy11 zy11Var = zy11.a;
                        if (b22 != b222) {
                            oayVar723.f.setValue(Boolean.valueOf(focusStateImpl.b()));
                            boolean b3 = oayVar723.b();
                            hoy0 hoy0Var422 = hoy0Var;
                            iv60 iv60Var7 = iv60Var6;
                            if (b3 && z2 && !z3) {
                                c.h(vpy0Var4, oayVar723, hoy0Var422, eivVar522, iv60Var7);
                            } else {
                                c.f(oayVar723);
                            }
                            if (focusStateImpl.b() && (d = oayVar723.d()) != null) {
                                tje.N(tseVar2, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(pk6Var2, hoy0Var422, oayVar723, d, iv60Var7, null), 3);
                            }
                            if (!focusStateImpl.b()) {
                                jVar3.g(null);
                            }
                        }
                        return zy11Var;
                    }
                };
                z9 = z2;
                vpy0Var2 = vpy0Var4;
                jVar = jVar3;
                oayVar2 = oayVar6;
                eivVar3 = eivVar522;
                pk6Var = pk6Var2;
                tseVar = tseVar2;
                iv60Var2 = iv60Var6;
                hoy0Var2 = hoy0Var;
                btsVar3.o0(obj3);
                c530Var = c530.a;
                c = hi91.c(ci91.f(gi91.b(c530Var, yurVar2), (tls) obj3), z9, zx40Var);
                oz40 n22 = androidx.compose.runtime.f.n(Boolean.valueOf((z9 || z3) ? false : true), btsVar3);
                k = btsVar3.k(n22) | btsVar3.e(oayVar2) | btsVar3.e(vpy0Var2) | btsVar3.e(jVar) | ((i10 <= 32 && btsVar3.k(eivVar3)) || (i11 & 48) == 32);
                Object Q1722 = btsVar3.Q();
                if (k) {
                }
                oayVar3 = oayVar2;
                yurVar = yurVar2;
                f530Var2 = c;
                vpy0 vpy0Var522 = vpy0Var2;
                c530Var2 = c530Var;
                i13 = i10;
                zx40Var2 = zx40Var;
                coreTextFieldKt$CoreTextField$5$1 = new CoreTextFieldKt$CoreTextField$5$1(oayVar3, n22, vpy0Var522, jVar, eivVar, null);
                vpy0Var2 = vpy0Var522;
                btsVar3.o0(coreTextFieldKt$CoreTextField$5$1);
                zpn.e(btsVar3, (wls) coreTextFieldKt$CoreTextField$5$1, zy11.a);
                f530 a822 = exw0.a(c530Var2, 8675309, new androidx.compose.foundation.text.selection.c(new cre(oayVar3, 4)));
                vpy0 vpy0Var622 = vpy0Var2;
                jVar2 = jVar;
                final boolean z1422 = z9;
                iv60Var3 = iv60Var2;
                final yur yurVar322 = yurVar;
                f530 k322 = (!z2 ? androidx.compose.ui.b.a(a822, m.a(), new ays0(12, new tls() { // from class: sny0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj7) {
                        u5t0 u5t0Var2;
                        wu60 wu60Var = (wu60) obj7;
                        oay oayVar723 = oay.this;
                        if (!oayVar723.b()) {
                            yur.b(yurVar322);
                        } else if (!z3 && (u5t0Var2 = oayVar723.c) != null) {
                            ((wqh) u5t0Var2).b();
                        }
                        if (oayVar723.b() && z1422) {
                            if (oayVar723.a() != HandleState.Selection) {
                                ery0 d = oayVar723.d();
                                if (d != null) {
                                    long j6 = wu60Var.a;
                                    jnn jnnVar2 = oayVar723.d;
                                    cre creVar22 = oayVar723.v;
                                    int j7 = iv60Var3.j(d.b(j6, true));
                                    creVar22.invoke(hoy0.a(jnnVar2.a, null, eja1.c(j7, j7), 5));
                                    if (oayVar723.a.a.b.length() > 0) {
                                        oayVar723.k.setValue(HandleState.Cursor);
                                    }
                                }
                            } else {
                                jVar2.g(wu60Var);
                            }
                        }
                        return zy11.a;
                    }
                }, zx40Var2)) : a822).k(new www0(jVar2.A, jVar2.z, new ip1(2, jVar2), 4));
                wvd0.a.getClass();
                f530 b22 = yx91.b(k322, y5e.b0);
                final f530 g22 = bb1.g(c530Var2, new f89(13, oayVar3, hoy0Var2, iv60Var3));
                k651Var2 = k651Var;
                boolean e722 = btsVar3.e(oayVar3) | (i17 != 2048) | btsVar3.k(k651Var2) | btsVar3.e(jVar2);
                int i1922 = i12;
                e2 = e722 | (i1922 != 4) | btsVar3.e(iv60Var3);
                Q5 = btsVar3.Q();
                if (e2) {
                }
                final hoy0 hoy0Var422 = hoy0Var2;
                tls tlsVar422 = new tls() { // from class: yqe
                    @Override // defpackage.tls
                    public final Object invoke(Object obj7) {
                        xpy0 xpy0Var2;
                        rzx rzxVar;
                        rzx rzxVar2;
                        oay oayVar723 = oay.this;
                        oz40 oz40Var = oayVar723.o;
                        rzx rzxVar3 = (rzx) obj7;
                        oayVar723.h = rzxVar3;
                        ery0 d = oayVar723.d();
                        if (d != null) {
                            d.b = rzxVar3;
                        }
                        if (z2) {
                            HandleState a9 = oayVar723.a();
                            HandleState handleState = HandleState.Selection;
                            j jVar4 = jVar2;
                            hoy0 hoy0Var5 = hoy0Var422;
                            if (a9 == handleState) {
                                if (((Boolean) oayVar723.l.getValue()).booleanValue() && k651Var2.b()) {
                                    jVar4.s();
                                } else {
                                    jVar4.p();
                                }
                                oayVar723.m.setValue(Boolean.valueOf(amb1.f(jVar4, true)));
                                oayVar723.n.setValue(Boolean.valueOf(amb1.f(jVar4, false)));
                                oz40Var.setValue(Boolean.valueOf(asy0.c(hoy0Var5.b)));
                            } else if (oayVar723.a() == HandleState.Cursor) {
                                oz40Var.setValue(Boolean.valueOf(amb1.f(jVar4, true)));
                            }
                            iv60 iv60Var7 = iv60Var3;
                            c.g(oayVar723, hoy0Var5, iv60Var7);
                            ery0 d2 = oayVar723.d();
                            if (d2 != null && (xpy0Var2 = oayVar723.e) != null && oayVar723.b() && (rzxVar = d2.b) != null && rzxVar.d() && (rzxVar2 = d2.c) != null) {
                                dry0 dry0Var = d2.a;
                                oav0 oav0Var = new oav0(4, rzxVar);
                                zii0 g222 = rx91.g(rzxVar);
                                zii0 j6 = rzxVar.j(rzxVar2, false);
                                if (jl40.l((xpy0) xpy0Var2.a.b.get(), xpy0Var2)) {
                                    xpy0Var2.b.h(hoy0Var5, iv60Var7, dry0Var, oav0Var, g222, j6);
                                }
                            }
                        }
                        return zy11.a;
                    }
                };
                k651Var3 = k651Var2;
                btsVar3.o0(tlsVar422);
                Q5 = tlsVar422;
                final f530 y22 = eja1.y(c530Var2, (tls) Q5);
                oayVar4 = oayVar3;
                tse tseVar322 = tseVar;
                jre jreVar22 = new jre(vw01Var, hoy0Var, oayVar4, z3, z2, gy31Var instanceof yp90, iv60Var3, jVar2, eivVar, yurVar);
                if (!z2 && !z3 && k651Var3.b() && asy0.c(((asy0) oayVar4.A.getValue()).a) && asy0.c(((asy0) oayVar4.B.getValue()).a)) {
                }
                e3 = btsVar3.e(jVar2);
                Q6 = btsVar3.Q();
                if (!e3) {
                }
                Q6 = new zqe(jVar2, 0);
                btsVar3.o0(Q6);
                zpn.a(jVar2, (tls) Q6, btsVar3);
                e4 = btsVar3.e(oayVar4) | btsVar3.e(vpy0Var622) | (i1922 != 4) | ((i13 <= 32 && btsVar3.k(eivVar)) || (i11 & 48) == 32);
                Q7 = btsVar3.Q();
                if (e4) {
                }
                oayVar5 = oayVar4;
                lc0 lc0Var22 = new lc0(oayVar5, vpy0Var622, hoy0Var, eivVar, 11);
                eivVar4 = eivVar;
                btsVar3.o0(lc0Var22);
                Q7 = lc0Var22;
                zpn.a(eivVar4, (tls) Q7, btsVar3);
                final tls creVar22 = oayVar5.v;
                if (i != 1) {
                }
                final int i2022 = eivVar4.e;
                final ay11 ay11Var322 = ay11Var2;
                a2 = androidx.compose.ui.b.a(c530Var2, m.a(), new zls() { // from class: androidx.compose.foundation.text.e
                    @Override // defpackage.zls
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        ((Integer) obj9).getClass();
                        bts btsVar5 = (bts) ((fid) obj8);
                        btsVar5.e0(851809892);
                        Object Q18 = btsVar5.Q();
                        o430 o430Var = did.a;
                        if (Q18 == o430Var) {
                            Q18 = new vry0();
                            btsVar5.o0(Q18);
                        }
                        vry0 vry0Var = (vry0) Q18;
                        Object Q19 = btsVar5.Q();
                        if (Q19 == o430Var) {
                            Q19 = new atg();
                            btsVar5.o0(Q19);
                        }
                        dny0 dny0Var = new dny0(oay.this, jVar2, hoy0Var, z13, z15, vry0Var, iv60Var3, ay11Var322, (atg) Q19, creVar22, i2022);
                        boolean e823 = btsVar5.e(dny0Var);
                        Object Q20 = btsVar5.Q();
                        if (e823 || Q20 == o430Var) {
                            TextFieldKeyInputKt$textFieldKeyInput$2$1$1 textFieldKeyInputKt$textFieldKeyInput$2$1$1 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(1, dny0Var, dny0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                            btsVar5.o0(textFieldKeyInputKt$textFieldKeyInput$2$1$1);
                            Q20 = textFieldKeyInputKt$textFieldKeyInput$2$1$1;
                        }
                        f530 c3 = lj91.c(c530.a, (tls) ((tfx) Q20));
                        btsVar5.t(false);
                        return c3;
                    }
                });
                int i2122 = eivVar4.d;
                if (i2122 == 7) {
                }
                boolean booleanValue222 = ((Boolean) n22.getValue()).booleanValue();
                a3 = btsVar3.a(z10) | btsVar3.e(w9yVar);
                Q8 = btsVar3.Q();
                if (!a3) {
                }
                Q8 = new zo1(z10, w9yVar, 6);
                btsVar3.o0(Q8);
                f530 e8222 = s1a1.e(booleanValue222, z10, (sls) Q8);
                obj5 = (ml6) btsVar3.m(n94.a);
                j = ((ldc) btsVar3.m(n94.b)).a;
                if (!ldc.c(j, rzo.d(1308617531))) {
                }
                e5 = btsVar3.e(oayVar5) | btsVar3.k(obj5);
                Q9 = btsVar3.Q();
                if (!e5) {
                }
                Q9 = new dke(3, oayVar5, obj5);
                btsVar3.o0(Q9);
                f530 k4222 = lj91.d(lj91.d(bk91.f(f530Var.k(bb1.i(c530Var2, (tls) Q9)), w9yVar, oayVar5, jVar2).k(e8222).k(f530Var2), new qmy0(0, durVar, oayVar5)), new tj(10, oayVar5, jVar2)).k(a2);
                if (m.b) {
                }
                f530 f222 = i4a1.f(eja1.y(androidx.compose.ui.b.a(k4222, a4, new qtb(yny0Var3, z2, zx40Var3, 3)).k(b22).k(jreVar22), new cre(oayVar5, 0)), new hex0(9, jVar2, tseVar322));
                if (z2) {
                }
                if (z11) {
                }
                final f530 c530Var4222 = c530Var2;
                final pk6 pk6Var3222 = pk6Var;
                final f530 c530Var5222 = c530Var3;
                final oay oayVar7222 = oayVar5;
                wls wlsVar222 = new wls() { // from class: dre
                    @Override // defpackage.wls
                    public final Object invoke(Object obj7, Object obj8) {
                        fid fidVar2 = (fid) obj7;
                        int intValue = ((Integer) obj8).intValue();
                        bts btsVar5 = (bts) fidVar2;
                        if (btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                            final oay oayVar8 = oayVar7222;
                            final ety0 ety0Var4 = ety0Var;
                            final int i22 = i2;
                            final int i23 = i;
                            final yny0 yny0Var5 = yny0Var3;
                            final hoy0 hoy0Var5 = hoy0Var;
                            final gy31 gy31Var2 = gy31Var;
                            final f530 f530Var3 = c530Var5222;
                            final f530 f530Var4 = g22;
                            final f530 f530Var5 = y22;
                            final f530 f530Var6 = c530Var4222;
                            final pk6 pk6Var4 = pk6Var3222;
                            final j jVar4 = jVar2;
                            final boolean z16 = z11;
                            final boolean z17 = z3;
                            final tls tlsVar5 = tlsVar2;
                            final iv60 iv60Var7 = iv60Var3;
                            final fwi fwiVar4 = fwiVar3;
                            zls.this.invoke(wwg.S(-44346382, true, new wls() { // from class: are
                                @Override // defpackage.wls
                                public final Object invoke(Object obj9, Object obj10) {
                                    f530 tf31Var;
                                    fid fidVar3 = (fid) obj9;
                                    int intValue2 = ((Integer) obj10).intValue();
                                    bts btsVar6 = (bts) fidVar3;
                                    if (btsVar6.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        final oay oayVar9 = oay.this;
                                        f530 g222 = ljs0.g(c530.a, ((y7m) oayVar9.g.getValue()).a, 0.0f, 2);
                                        int i24 = i22;
                                        final int i25 = i23;
                                        v0b1.c(i24, i25);
                                        ety0 ety0Var5 = ety0Var4;
                                        if (i24 != 1 || i25 != Integer.MAX_VALUE) {
                                            g222 = g222.k(new hfu(ety0Var5, i24, i25));
                                        }
                                        boolean e9 = btsVar6.e(oayVar9);
                                        Object Q18 = btsVar6.Q();
                                        if (e9 || Q18 == did.a) {
                                            Q18 = new lyc(18, oayVar9);
                                            btsVar6.o0(Q18);
                                        }
                                        sls slsVar = (sls) Q18;
                                        yny0 yny0Var6 = yny0Var5;
                                        Orientation orientation2 = (Orientation) yny0Var6.f.getValue();
                                        final hoy0 hoy0Var6 = hoy0Var5;
                                        long j6 = hoy0Var6.b;
                                        int i26 = asy0.c;
                                        int i27 = (int) (j6 >> 32);
                                        long j7 = yny0Var6.e;
                                        if (i27 == ((int) (j7 >> 32)) && (i27 = (int) (j6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) == ((int) (j7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
                                            i27 = asy0.f(j6);
                                        }
                                        yny0Var6.e = hoy0Var6.b;
                                        vw01 a9 = iz21.a(gy31Var2, hoy0Var6.a);
                                        int i28 = vny0.a[orientation2.ordinal()];
                                        if (i28 == 1) {
                                            tf31Var = new tf31(yny0Var6, i27, a9, slsVar);
                                        } else {
                                            if (i28 != 2) {
                                                w511.b();
                                                return null;
                                            }
                                            tf31Var = new yqu(yny0Var6, i27, a9, slsVar);
                                        }
                                        f530 k5 = ymb1.m(g222).k(tf31Var).k(f530Var3).k(f530Var4).k(new foy0(ety0Var5)).k(f530Var5).k(f530Var6).k(new qk6(pk6Var4));
                                        final j jVar5 = jVar4;
                                        final boolean z18 = z16;
                                        final boolean z19 = z17;
                                        final tls tlsVar6 = tlsVar5;
                                        final iv60 iv60Var8 = iv60Var7;
                                        final fwi fwiVar5 = fwiVar4;
                                        zcb1.c(k5, wwg.S(1412697320, true, new wls() { // from class: bre
                                            @Override // defpackage.wls
                                            public final Object invoke(Object obj11, Object obj12) {
                                                fid fidVar4 = (fid) obj11;
                                                int intValue3 = ((Integer) obj12).intValue();
                                                bts btsVar7 = (bts) fidVar4;
                                                if (btsVar7.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    oay oayVar10 = oayVar9;
                                                    gre greVar = new gre(oayVar10, tlsVar6, hoy0Var6, iv60Var8, fwiVar5, i25);
                                                    int hashCode = Long.hashCode(btsVar7.T);
                                                    r1b0 o = btsVar7.o();
                                                    f530 d = b.d(btsVar7, c530.a);
                                                    ohd.G1.getClass();
                                                    sls slsVar2 = d.b;
                                                    if (btsVar7.a == null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar7.i0();
                                                    if (btsVar7.S) {
                                                        btsVar7.n(slsVar2);
                                                    } else {
                                                        btsVar7.r0();
                                                    }
                                                    qje.W(btsVar7, d.f, greVar);
                                                    qje.W(btsVar7, d.e, o);
                                                    qje.W(btsVar7, d.g, Integer.valueOf(hashCode));
                                                    qje.M(btsVar7, d.h);
                                                    qje.W(btsVar7, d.d, d);
                                                    btsVar7.t(true);
                                                    HandleState a10 = oayVar10.a();
                                                    HandleState handleState = HandleState.None;
                                                    boolean z20 = z18;
                                                    boolean z21 = a10 != handleState && oayVar10.c() != null && oayVar10.c().d() && z20;
                                                    j jVar6 = j.this;
                                                    c.c(jVar6, z21, btsVar7, 0);
                                                    if (oayVar10.a() == HandleState.Cursor && !z19 && z20) {
                                                        btsVar7.e0(-714666198);
                                                        c.d(jVar6, btsVar7, 0);
                                                        btsVar7.t(false);
                                                    } else {
                                                        btsVar7.e0(-714589318);
                                                        btsVar7.t(false);
                                                    }
                                                } else {
                                                    btsVar7.Y();
                                                }
                                                return zy11.a;
                                            }
                                        }, btsVar6), btsVar6, 48);
                                    } else {
                                        btsVar6.Y();
                                    }
                                    return zy11.a;
                                }
                            }, btsVar5), btsVar5, 6);
                        } else {
                            btsVar5.Y();
                        }
                        return zy11.a;
                    }
                };
                btsVar = btsVar3;
                b(f222, jVar2, wwg.S(-814563849, true, wlsVar222, btsVar), btsVar, 384);
            }
            z6 = false;
            if (asy0Var2 != null) {
            }
            if (z5) {
            }
            zi6 zi6Var22 = jnnVar.b;
            zi6Var22.w = -1;
            zi6Var22.x = -1;
            a = hoy0.a(hoy0Var, null, 0L, 3);
            hoy0 hoy0Var32 = jnnVar.a;
            jnnVar.a = a;
            if (xpy0Var != null) {
            }
            Q = btsVar2.Q();
            obj2 = obj;
            if (Q == obj2) {
            }
            ay11Var = (ay11) Q;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!ay11Var.f) {
            }
            ay11Var.e = Long.valueOf(currentTimeMillis2);
            ay11Var.a(hoy0Var);
            Q2 = btsVar2.Q();
            if (Q2 == obj2) {
            }
            final tse tseVar22 = (tse) Q2;
            Q3 = btsVar2.Q();
            if (Q3 == obj2) {
            }
            final pk6 pk6Var22 = (pk6) Q3;
            Q4 = btsVar2.Q();
            if (Q4 == obj2) {
            }
            final j jVar32 = (j) Q4;
            final iv60 iv60Var62 = iv60Var;
            jVar32.b = iv60Var62;
            jVar32.f = gy31Var;
            jVar32.c = oayVar6.v;
            jVar32.d = oayVar6;
            jVar32.e.setValue(hoy0Var);
            jVar32.w = new asy0(j4);
            jVar32.h = (c3c) btsVar2.m(androidx.compose.ui.platform.j.f);
            jVar32.i = tseVar22;
            jVar32.k = (w6u) btsVar2.m(androidx.compose.ui.platform.j.l);
            jVar32.l = yurVar2;
            final boolean z132 = !z3;
            jVar32.m.setValue(Boolean.valueOf(z132));
            jVar32.n.setValue(Boolean.valueOf(z2));
            btsVar2.e0(1966756105);
            jVar32.j = cwc0.b(SelectedTextType.EditableText, ety0Var3.a.k, btsVar2, 6);
            btsVar2.t(false);
            oayVar6.b();
            i9 = i7;
            int i172 = i9 & 7168;
            final vpy0 vpy0Var42 = vpy0Var;
            int i182 = i8;
            boolean e62 = (i172 != 2048) | btsVar2.e(oayVar6) | ((i9 & HProv.ALG_CLASS_ALL) != 16384) | btsVar2.e(vpy0Var42) | (i182 != 4);
            i10 = (i9 & 112) ^ 48;
            if (i10 <= 32) {
            }
            z7 = e62;
            ay11Var2 = ay11Var;
            if ((i9 & 48) != 32) {
            }
            z8 = true;
            e = z7 | z8 | btsVar2.e(iv60Var62) | btsVar2.e(tseVar22) | btsVar2.e(pk6Var22) | btsVar2.e(jVar32);
            Object Q16222 = btsVar2.Q();
            if (e) {
            }
            i11 = i9;
            i12 = i182;
            yny0Var2 = yny0Var;
            obj4 = obj2;
            final eiv eivVar5222 = eivVar2;
            btsVar3 = btsVar2;
            obj3 = new tls() { // from class: androidx.compose.foundation.text.a
                @Override // defpackage.tls
                public final Object invoke(Object obj7) {
                    ery0 d;
                    oay oayVar723 = oay.this;
                    boolean b222 = oayVar723.b();
                    FocusStateImpl focusStateImpl = (FocusStateImpl) ((ivr) obj7);
                    boolean b2222 = focusStateImpl.b();
                    zy11 zy11Var = zy11.a;
                    if (b222 != b2222) {
                        oayVar723.f.setValue(Boolean.valueOf(focusStateImpl.b()));
                        boolean b3 = oayVar723.b();
                        hoy0 hoy0Var4222 = hoy0Var;
                        iv60 iv60Var7 = iv60Var62;
                        if (b3 && z2 && !z3) {
                            c.h(vpy0Var42, oayVar723, hoy0Var4222, eivVar5222, iv60Var7);
                        } else {
                            c.f(oayVar723);
                        }
                        if (focusStateImpl.b() && (d = oayVar723.d()) != null) {
                            tje.N(tseVar22, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(pk6Var22, hoy0Var4222, oayVar723, d, iv60Var7, null), 3);
                        }
                        if (!focusStateImpl.b()) {
                            jVar32.g(null);
                        }
                    }
                    return zy11Var;
                }
            };
            z9 = z2;
            vpy0Var2 = vpy0Var42;
            jVar = jVar32;
            oayVar2 = oayVar6;
            eivVar3 = eivVar5222;
            pk6Var = pk6Var22;
            tseVar = tseVar22;
            iv60Var2 = iv60Var62;
            hoy0Var2 = hoy0Var;
            btsVar3.o0(obj3);
            c530Var = c530.a;
            c = hi91.c(ci91.f(gi91.b(c530Var, yurVar2), (tls) obj3), z9, zx40Var);
            oz40 n222 = androidx.compose.runtime.f.n(Boolean.valueOf((z9 || z3) ? false : true), btsVar3);
            k = btsVar3.k(n222) | btsVar3.e(oayVar2) | btsVar3.e(vpy0Var2) | btsVar3.e(jVar) | ((i10 <= 32 && btsVar3.k(eivVar3)) || (i11 & 48) == 32);
            Object Q17222 = btsVar3.Q();
            if (k) {
            }
            oayVar3 = oayVar2;
            yurVar = yurVar2;
            f530Var2 = c;
            vpy0 vpy0Var5222 = vpy0Var2;
            c530Var2 = c530Var;
            i13 = i10;
            zx40Var2 = zx40Var;
            coreTextFieldKt$CoreTextField$5$1 = new CoreTextFieldKt$CoreTextField$5$1(oayVar3, n222, vpy0Var5222, jVar, eivVar, null);
            vpy0Var2 = vpy0Var5222;
            btsVar3.o0(coreTextFieldKt$CoreTextField$5$1);
            zpn.e(btsVar3, (wls) coreTextFieldKt$CoreTextField$5$1, zy11.a);
            f530 a8222 = exw0.a(c530Var2, 8675309, new androidx.compose.foundation.text.selection.c(new cre(oayVar3, 4)));
            vpy0 vpy0Var6222 = vpy0Var2;
            jVar2 = jVar;
            final boolean z14222 = z9;
            iv60Var3 = iv60Var2;
            final yur yurVar3222 = yurVar;
            f530 k3222 = (!z2 ? androidx.compose.ui.b.a(a8222, m.a(), new ays0(12, new tls() { // from class: sny0
                @Override // defpackage.tls
                public final Object invoke(Object obj7) {
                    u5t0 u5t0Var2;
                    wu60 wu60Var = (wu60) obj7;
                    oay oayVar723 = oay.this;
                    if (!oayVar723.b()) {
                        yur.b(yurVar3222);
                    } else if (!z3 && (u5t0Var2 = oayVar723.c) != null) {
                        ((wqh) u5t0Var2).b();
                    }
                    if (oayVar723.b() && z14222) {
                        if (oayVar723.a() != HandleState.Selection) {
                            ery0 d = oayVar723.d();
                            if (d != null) {
                                long j6 = wu60Var.a;
                                jnn jnnVar2 = oayVar723.d;
                                cre creVar222 = oayVar723.v;
                                int j7 = iv60Var3.j(d.b(j6, true));
                                creVar222.invoke(hoy0.a(jnnVar2.a, null, eja1.c(j7, j7), 5));
                                if (oayVar723.a.a.b.length() > 0) {
                                    oayVar723.k.setValue(HandleState.Cursor);
                                }
                            }
                        } else {
                            jVar2.g(wu60Var);
                        }
                    }
                    return zy11.a;
                }
            }, zx40Var2)) : a8222).k(new www0(jVar2.A, jVar2.z, new ip1(2, jVar2), 4));
            wvd0.a.getClass();
            f530 b222 = yx91.b(k3222, y5e.b0);
            final f530 g222 = bb1.g(c530Var2, new f89(13, oayVar3, hoy0Var2, iv60Var3));
            k651Var2 = k651Var;
            boolean e7222 = btsVar3.e(oayVar3) | (i172 != 2048) | btsVar3.k(k651Var2) | btsVar3.e(jVar2);
            int i19222 = i12;
            e2 = e7222 | (i19222 != 4) | btsVar3.e(iv60Var3);
            Q5 = btsVar3.Q();
            if (e2) {
            }
            final hoy0 hoy0Var4222 = hoy0Var2;
            tls tlsVar4222 = new tls() { // from class: yqe
                @Override // defpackage.tls
                public final Object invoke(Object obj7) {
                    xpy0 xpy0Var2;
                    rzx rzxVar;
                    rzx rzxVar2;
                    oay oayVar723 = oay.this;
                    oz40 oz40Var = oayVar723.o;
                    rzx rzxVar3 = (rzx) obj7;
                    oayVar723.h = rzxVar3;
                    ery0 d = oayVar723.d();
                    if (d != null) {
                        d.b = rzxVar3;
                    }
                    if (z2) {
                        HandleState a9 = oayVar723.a();
                        HandleState handleState = HandleState.Selection;
                        j jVar4 = jVar2;
                        hoy0 hoy0Var5 = hoy0Var4222;
                        if (a9 == handleState) {
                            if (((Boolean) oayVar723.l.getValue()).booleanValue() && k651Var2.b()) {
                                jVar4.s();
                            } else {
                                jVar4.p();
                            }
                            oayVar723.m.setValue(Boolean.valueOf(amb1.f(jVar4, true)));
                            oayVar723.n.setValue(Boolean.valueOf(amb1.f(jVar4, false)));
                            oz40Var.setValue(Boolean.valueOf(asy0.c(hoy0Var5.b)));
                        } else if (oayVar723.a() == HandleState.Cursor) {
                            oz40Var.setValue(Boolean.valueOf(amb1.f(jVar4, true)));
                        }
                        iv60 iv60Var7 = iv60Var3;
                        c.g(oayVar723, hoy0Var5, iv60Var7);
                        ery0 d2 = oayVar723.d();
                        if (d2 != null && (xpy0Var2 = oayVar723.e) != null && oayVar723.b() && (rzxVar = d2.b) != null && rzxVar.d() && (rzxVar2 = d2.c) != null) {
                            dry0 dry0Var = d2.a;
                            oav0 oav0Var = new oav0(4, rzxVar);
                            zii0 g2222 = rx91.g(rzxVar);
                            zii0 j6 = rzxVar.j(rzxVar2, false);
                            if (jl40.l((xpy0) xpy0Var2.a.b.get(), xpy0Var2)) {
                                xpy0Var2.b.h(hoy0Var5, iv60Var7, dry0Var, oav0Var, g2222, j6);
                            }
                        }
                    }
                    return zy11.a;
                }
            };
            k651Var3 = k651Var2;
            btsVar3.o0(tlsVar4222);
            Q5 = tlsVar4222;
            final f530 y222 = eja1.y(c530Var2, (tls) Q5);
            oayVar4 = oayVar3;
            tse tseVar3222 = tseVar;
            jre jreVar222 = new jre(vw01Var, hoy0Var, oayVar4, z3, z2, gy31Var instanceof yp90, iv60Var3, jVar2, eivVar, yurVar);
            if (!z2 && !z3 && k651Var3.b() && asy0.c(((asy0) oayVar4.A.getValue()).a) && asy0.c(((asy0) oayVar4.B.getValue()).a)) {
            }
            e3 = btsVar3.e(jVar2);
            Q6 = btsVar3.Q();
            if (!e3) {
            }
            Q6 = new zqe(jVar2, 0);
            btsVar3.o0(Q6);
            zpn.a(jVar2, (tls) Q6, btsVar3);
            e4 = btsVar3.e(oayVar4) | btsVar3.e(vpy0Var6222) | (i19222 != 4) | ((i13 <= 32 && btsVar3.k(eivVar)) || (i11 & 48) == 32);
            Q7 = btsVar3.Q();
            if (e4) {
            }
            oayVar5 = oayVar4;
            lc0 lc0Var222 = new lc0(oayVar5, vpy0Var6222, hoy0Var, eivVar, 11);
            eivVar4 = eivVar;
            btsVar3.o0(lc0Var222);
            Q7 = lc0Var222;
            zpn.a(eivVar4, (tls) Q7, btsVar3);
            final tls creVar222 = oayVar5.v;
            if (i != 1) {
            }
            final int i20222 = eivVar4.e;
            final ay11 ay11Var3222 = ay11Var2;
            a2 = androidx.compose.ui.b.a(c530Var2, m.a(), new zls() { // from class: androidx.compose.foundation.text.e
                @Override // defpackage.zls
                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    bts btsVar5 = (bts) ((fid) obj8);
                    btsVar5.e0(851809892);
                    Object Q18 = btsVar5.Q();
                    o430 o430Var = did.a;
                    if (Q18 == o430Var) {
                        Q18 = new vry0();
                        btsVar5.o0(Q18);
                    }
                    vry0 vry0Var = (vry0) Q18;
                    Object Q19 = btsVar5.Q();
                    if (Q19 == o430Var) {
                        Q19 = new atg();
                        btsVar5.o0(Q19);
                    }
                    dny0 dny0Var = new dny0(oay.this, jVar2, hoy0Var, z132, z15, vry0Var, iv60Var3, ay11Var3222, (atg) Q19, creVar222, i20222);
                    boolean e823 = btsVar5.e(dny0Var);
                    Object Q20 = btsVar5.Q();
                    if (e823 || Q20 == o430Var) {
                        TextFieldKeyInputKt$textFieldKeyInput$2$1$1 textFieldKeyInputKt$textFieldKeyInput$2$1$1 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(1, dny0Var, dny0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                        btsVar5.o0(textFieldKeyInputKt$textFieldKeyInput$2$1$1);
                        Q20 = textFieldKeyInputKt$textFieldKeyInput$2$1$1;
                    }
                    f530 c3 = lj91.c(c530.a, (tls) ((tfx) Q20));
                    btsVar5.t(false);
                    return c3;
                }
            });
            int i21222 = eivVar4.d;
            if (i21222 == 7) {
            }
            boolean booleanValue2222 = ((Boolean) n222.getValue()).booleanValue();
            a3 = btsVar3.a(z10) | btsVar3.e(w9yVar);
            Q8 = btsVar3.Q();
            if (!a3) {
            }
            Q8 = new zo1(z10, w9yVar, 6);
            btsVar3.o0(Q8);
            f530 e82222 = s1a1.e(booleanValue2222, z10, (sls) Q8);
            obj5 = (ml6) btsVar3.m(n94.a);
            j = ((ldc) btsVar3.m(n94.b)).a;
            if (!ldc.c(j, rzo.d(1308617531))) {
            }
            e5 = btsVar3.e(oayVar5) | btsVar3.k(obj5);
            Q9 = btsVar3.Q();
            if (!e5) {
            }
            Q9 = new dke(3, oayVar5, obj5);
            btsVar3.o0(Q9);
            f530 k42222 = lj91.d(lj91.d(bk91.f(f530Var.k(bb1.i(c530Var2, (tls) Q9)), w9yVar, oayVar5, jVar2).k(e82222).k(f530Var2), new qmy0(0, durVar, oayVar5)), new tj(10, oayVar5, jVar2)).k(a2);
            if (m.b) {
            }
            f530 f2222 = i4a1.f(eja1.y(androidx.compose.ui.b.a(k42222, a4, new qtb(yny0Var3, z2, zx40Var3, 3)).k(b222).k(jreVar222), new cre(oayVar5, 0)), new hex0(9, jVar2, tseVar3222));
            if (z2) {
            }
            if (z11) {
            }
            final f530 c530Var42222 = c530Var2;
            final pk6 pk6Var32222 = pk6Var;
            final f530 c530Var52222 = c530Var3;
            final oay oayVar72222 = oayVar5;
            wls wlsVar2222 = new wls() { // from class: dre
                @Override // defpackage.wls
                public final Object invoke(Object obj7, Object obj8) {
                    fid fidVar2 = (fid) obj7;
                    int intValue = ((Integer) obj8).intValue();
                    bts btsVar5 = (bts) fidVar2;
                    if (btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                        final oay oayVar8 = oayVar72222;
                        final ety0 ety0Var4 = ety0Var;
                        final int i22 = i2;
                        final int i23 = i;
                        final yny0 yny0Var5 = yny0Var3;
                        final hoy0 hoy0Var5 = hoy0Var;
                        final gy31 gy31Var2 = gy31Var;
                        final f530 f530Var3 = c530Var52222;
                        final f530 f530Var4 = g222;
                        final f530 f530Var5 = y222;
                        final f530 f530Var6 = c530Var42222;
                        final pk6 pk6Var4 = pk6Var32222;
                        final j jVar4 = jVar2;
                        final boolean z16 = z11;
                        final boolean z17 = z3;
                        final tls tlsVar5 = tlsVar2;
                        final iv60 iv60Var7 = iv60Var3;
                        final fwi fwiVar4 = fwiVar3;
                        zls.this.invoke(wwg.S(-44346382, true, new wls() { // from class: are
                            @Override // defpackage.wls
                            public final Object invoke(Object obj9, Object obj10) {
                                f530 tf31Var;
                                fid fidVar3 = (fid) obj9;
                                int intValue2 = ((Integer) obj10).intValue();
                                bts btsVar6 = (bts) fidVar3;
                                if (btsVar6.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    final oay oayVar9 = oay.this;
                                    f530 g2222 = ljs0.g(c530.a, ((y7m) oayVar9.g.getValue()).a, 0.0f, 2);
                                    int i24 = i22;
                                    final int i25 = i23;
                                    v0b1.c(i24, i25);
                                    ety0 ety0Var5 = ety0Var4;
                                    if (i24 != 1 || i25 != Integer.MAX_VALUE) {
                                        g2222 = g2222.k(new hfu(ety0Var5, i24, i25));
                                    }
                                    boolean e9 = btsVar6.e(oayVar9);
                                    Object Q18 = btsVar6.Q();
                                    if (e9 || Q18 == did.a) {
                                        Q18 = new lyc(18, oayVar9);
                                        btsVar6.o0(Q18);
                                    }
                                    sls slsVar = (sls) Q18;
                                    yny0 yny0Var6 = yny0Var5;
                                    Orientation orientation2 = (Orientation) yny0Var6.f.getValue();
                                    final hoy0 hoy0Var6 = hoy0Var5;
                                    long j6 = hoy0Var6.b;
                                    int i26 = asy0.c;
                                    int i27 = (int) (j6 >> 32);
                                    long j7 = yny0Var6.e;
                                    if (i27 == ((int) (j7 >> 32)) && (i27 = (int) (j6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) == ((int) (j7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
                                        i27 = asy0.f(j6);
                                    }
                                    yny0Var6.e = hoy0Var6.b;
                                    vw01 a9 = iz21.a(gy31Var2, hoy0Var6.a);
                                    int i28 = vny0.a[orientation2.ordinal()];
                                    if (i28 == 1) {
                                        tf31Var = new tf31(yny0Var6, i27, a9, slsVar);
                                    } else {
                                        if (i28 != 2) {
                                            w511.b();
                                            return null;
                                        }
                                        tf31Var = new yqu(yny0Var6, i27, a9, slsVar);
                                    }
                                    f530 k5 = ymb1.m(g2222).k(tf31Var).k(f530Var3).k(f530Var4).k(new foy0(ety0Var5)).k(f530Var5).k(f530Var6).k(new qk6(pk6Var4));
                                    final j jVar5 = jVar4;
                                    final boolean z18 = z16;
                                    final boolean z19 = z17;
                                    final tls tlsVar6 = tlsVar5;
                                    final iv60 iv60Var8 = iv60Var7;
                                    final fwi fwiVar5 = fwiVar4;
                                    zcb1.c(k5, wwg.S(1412697320, true, new wls() { // from class: bre
                                        @Override // defpackage.wls
                                        public final Object invoke(Object obj11, Object obj12) {
                                            fid fidVar4 = (fid) obj11;
                                            int intValue3 = ((Integer) obj12).intValue();
                                            bts btsVar7 = (bts) fidVar4;
                                            if (btsVar7.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                oay oayVar10 = oayVar9;
                                                gre greVar = new gre(oayVar10, tlsVar6, hoy0Var6, iv60Var8, fwiVar5, i25);
                                                int hashCode = Long.hashCode(btsVar7.T);
                                                r1b0 o = btsVar7.o();
                                                f530 d = b.d(btsVar7, c530.a);
                                                ohd.G1.getClass();
                                                sls slsVar2 = d.b;
                                                if (btsVar7.a == null) {
                                                    cma1.b0();
                                                    throw null;
                                                }
                                                btsVar7.i0();
                                                if (btsVar7.S) {
                                                    btsVar7.n(slsVar2);
                                                } else {
                                                    btsVar7.r0();
                                                }
                                                qje.W(btsVar7, d.f, greVar);
                                                qje.W(btsVar7, d.e, o);
                                                qje.W(btsVar7, d.g, Integer.valueOf(hashCode));
                                                qje.M(btsVar7, d.h);
                                                qje.W(btsVar7, d.d, d);
                                                btsVar7.t(true);
                                                HandleState a10 = oayVar10.a();
                                                HandleState handleState = HandleState.None;
                                                boolean z20 = z18;
                                                boolean z21 = a10 != handleState && oayVar10.c() != null && oayVar10.c().d() && z20;
                                                j jVar6 = j.this;
                                                c.c(jVar6, z21, btsVar7, 0);
                                                if (oayVar10.a() == HandleState.Cursor && !z19 && z20) {
                                                    btsVar7.e0(-714666198);
                                                    c.d(jVar6, btsVar7, 0);
                                                    btsVar7.t(false);
                                                } else {
                                                    btsVar7.e0(-714589318);
                                                    btsVar7.t(false);
                                                }
                                            } else {
                                                btsVar7.Y();
                                            }
                                            return zy11.a;
                                        }
                                    }, btsVar6), btsVar6, 48);
                                } else {
                                    btsVar6.Y();
                                }
                                return zy11.a;
                            }
                        }, btsVar5), btsVar5, 6);
                    } else {
                        btsVar5.Y();
                    }
                    return zy11.a;
                }
            };
            btsVar = btsVar3;
            b(f2222, jVar2, wwg.S(-814563849, true, wlsVar2222, btsVar), btsVar, 384);
        } else {
            btsVar = btsVar4;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ere
                @Override // defpackage.wls
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int O = vng.O(i3 | 1);
                    int O2 = vng.O(i4);
                    c.a(hoy0.this, tlsVar, f530Var, ety0Var, gy31Var, tlsVar2, zx40Var, ml6Var, z, i, i2, eivVar, xjxVar, z2, z3, zlsVar, (fid) obj7, O, O2);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(f530 f530Var, j jVar, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2036174316);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.e(jVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            z910 d = pi6.d(x4c.b, true);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            frb1.c(jVar, aVar, btsVar, (i2 >> 3) & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(f530Var, jVar, aVar, i, 18);
        }
    }

    public static final void c(j jVar, boolean z, fid fidVar, int i) {
        ery0 d;
        dry0 dry0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(626339208);
        int i2 = 2;
        int i3 = (btsVar.e(jVar) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16);
        if (!btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(1530097388);
            oay oayVar = jVar.d;
            dry0 dry0Var2 = null;
            if (oayVar != null && (d = oayVar.d()) != null && (dry0Var = d.a) != null) {
                oay oayVar2 = jVar.d;
                if (!(oayVar2 != null ? oayVar2.p : true)) {
                    dry0Var2 = dry0Var;
                }
            }
            if (dry0Var2 == null) {
                btsVar.e0(1530097387);
                btsVar.t(false);
            } else {
                btsVar.e0(1530097388);
                if (asy0.c(jVar.o().b)) {
                    btsVar.e0(2110860558);
                    btsVar.t(false);
                } else {
                    btsVar.e0(2109807302);
                    int r = jVar.b.r((int) (jVar.o().b >> 32));
                    int r2 = jVar.b.r((int) (jVar.o().b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    ResolvedTextDirection a = dry0Var2.a(r);
                    ResolvedTextDirection a2 = dry0Var2.a(Math.max(r2 - 1, 0));
                    oay oayVar3 = jVar.d;
                    if (oayVar3 == null || !((Boolean) oayVar3.m.getValue()).booleanValue()) {
                        btsVar.e0(2110490542);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(2110225306);
                        ylb1.a(true, a, jVar, btsVar, ((i3 << 6) & 896) | 6);
                        btsVar.t(false);
                    }
                    oay oayVar4 = jVar.d;
                    if (oayVar4 == null || !((Boolean) oayVar4.n.getValue()).booleanValue()) {
                        btsVar.e0(2110838734);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(2110574459);
                        ylb1.a(false, a2, jVar, btsVar, ((i3 << 6) & 896) | 6);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                }
                oay oayVar5 = jVar.d;
                if (oayVar5 != null) {
                    oz40 oz40Var = oayVar5.l;
                    if (!jl40.l(jVar.u.a.b, jVar.o().a.b)) {
                        oz40Var.setValue(Boolean.FALSE);
                    }
                    if (oayVar5.b()) {
                        if (((Boolean) oz40Var.getValue()).booleanValue()) {
                            jVar.s();
                        } else {
                            jVar.p();
                        }
                    }
                }
                btsVar.t(false);
            }
            btsVar.t(false);
        } else {
            btsVar.e0(1989076778);
            btsVar.t(false);
            jVar.p();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new uge(i, i2, jVar, z);
        }
    }

    public static final void d(j jVar, fid fidVar, int i) {
        kk2 n;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1436003720);
        int i2 = (btsVar.e(jVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            oay oayVar = jVar.d;
            if (oayVar == null || !((Boolean) oayVar.o.getValue()).booleanValue() || (n = jVar.n()) == null || n.b.length() <= 0) {
                btsVar.e0(-2111042550);
                btsVar.t(false);
            } else {
                btsVar.e0(-2112351432);
                boolean k = btsVar.k(jVar);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    Q = new zny0(jVar);
                    btsVar.o0(Q);
                }
                yly0 yly0Var = (yly0) Q;
                fwi fwiVar = (fwi) btsVar.m(androidx.compose.ui.platform.j.h);
                iv60 iv60Var = jVar.b;
                long j = jVar.o().b;
                int i3 = asy0.c;
                int r = iv60Var.r((int) (j >> 32));
                oay oayVar2 = jVar.d;
                dry0 dry0Var = (oayVar2 != null ? oayVar2.d() : null).a;
                zii0 c = dry0Var.c(y6i0.d(r, 0, dry0Var.a.a.b.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((fwiVar.w0(2.0f) / 2.0f) + c.a) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(c.d));
                boolean d = btsVar.d(floatToRawIntBits);
                Object Q2 = btsVar.Q();
                if (d || Q2 == o430Var) {
                    Q2 = new ire(floatToRawIntBits);
                    btsVar.o0(Q2);
                }
                mv60 mv60Var = (mv60) Q2;
                boolean e = btsVar.e(yly0Var) | btsVar.e(jVar);
                Object Q3 = btsVar.Q();
                if (e || Q3 == o430Var) {
                    Q3 = new b(yly0Var, jVar);
                    btsVar.o0(Q3);
                }
                f530 a = exw0.a(c530.a, yly0Var, (PointerInputEventHandler) Q3);
                boolean d2 = btsVar.d(floatToRawIntBits);
                Object Q4 = btsVar.Q();
                if (d2 || Q4 == o430Var) {
                    Q4 = new hcb(floatToRawIntBits, 26);
                    btsVar.o0(Q4);
                }
                c92.a(mv60Var, fnq0.b(a, false, (tls) Q4), 0L, btsVar, 0);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tbb(jVar, i, 9);
        }
    }

    public static final Object e(hwd0 hwd0Var, yly0 yly0Var, Continuation continuation) {
        Object n = bvf0.n(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(hwd0Var, yly0Var, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }

    public static final void f(oay oayVar) {
        xpy0 xpy0Var = oayVar.e;
        if (xpy0Var != null) {
            oayVar.v.invoke(hoy0.a(oayVar.d.a, null, 0L, 3));
            vpy0 vpy0Var = xpy0Var.a;
            AtomicReference atomicReference = vpy0Var.b;
            while (true) {
                if (atomicReference.compareAndSet(xpy0Var, null)) {
                    vpy0Var.a.a();
                    break;
                } else if (atomicReference.get() != xpy0Var) {
                    break;
                }
            }
        }
        oayVar.e = null;
    }

    public static final void g(oay oayVar, hoy0 hoy0Var, iv60 iv60Var) {
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            ery0 d = oayVar.d();
            if (d == null) {
                return;
            }
            xpy0 xpy0Var = oayVar.e;
            if (xpy0Var == null) {
                return;
            }
            rzx c = oayVar.c();
            if (c == null) {
                return;
            }
            olb1.b(hoy0Var, oayVar.a, d.a, c, xpy0Var, oayVar.b(), iv60Var);
        } finally {
            tje.W(D, O, e);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object, xpy0] */
    public static final void h(vpy0 vpy0Var, oay oayVar, hoy0 hoy0Var, eiv eivVar, iv60 iv60Var) {
        jnn jnnVar = oayVar.d;
        cre creVar = oayVar.v;
        cre creVar2 = oayVar.w;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        zjy0 zjy0Var = new zjy0(1, jnnVar, creVar, ref$ObjectRef);
        gwc0 gwc0Var = vpy0Var.a;
        gwc0Var.c(hoy0Var, eivVar, zjy0Var, creVar2);
        ?? xpy0Var = new xpy0(vpy0Var, gwc0Var);
        vpy0Var.b.set(xpy0Var);
        ref$ObjectRef.element = xpy0Var;
        oayVar.e = xpy0Var;
        g(oayVar, hoy0Var, iv60Var);
    }
}
