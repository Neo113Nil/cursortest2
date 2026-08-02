package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a4r;
import defpackage.a92;
import defpackage.agc;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c1p0;
import defpackage.c530;
import defpackage.c8p;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.dgc;
import defpackage.did;
import defpackage.e8p;
import defpackage.ehr0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.g8w;
import defpackage.gtq0;
import defpackage.hh;
import defpackage.hob1;
import defpackage.hz6;
import defpackage.id00;
import defpackage.j690;
import defpackage.jl40;
import defpackage.jxe0;
import defpackage.kj2;
import defpackage.l690;
import defpackage.ltu;
import defpackage.ly3;
import defpackage.mnw0;
import defpackage.mx20;
import defpackage.nvs0;
import defpackage.nx20;
import defpackage.ny61;
import defpackage.o0t0;
import defpackage.o430;
import defpackage.ogo0;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.ppr0;
import defpackage.q27;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rdd;
import defpackage.rx3;
import defpackage.rz6;
import defpackage.s07;
import defpackage.sls;
import defpackage.sq20;
import defpackage.tls;
import defpackage.tse;
import defpackage.twt0;
import defpackage.tz6;
import defpackage.u07;
import defpackage.va2;
import defpackage.vhb1;
import defpackage.w3r;
import defpackage.wk6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wyh0;
import defpackage.x4c;
import defpackage.xvz;
import defpackage.y7m;
import defpackage.z07;
import defpackage.z910;
import defpackage.zir0;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:157:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sls slsVar, f530 f530Var, boolean z, ehr0 ehr0Var, hz6 hz6Var, tz6 tz6Var, j690 j690Var, zls zlsVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z2;
        ehr0 ehr0Var2;
        hz6 hz6Var2;
        tz6 tz6Var2;
        int i4;
        j690 j690Var2;
        bts btsVar;
        boolean z3;
        ehr0 ehr0Var3;
        hz6 hz6Var3;
        tz6 tz6Var3;
        j690 j690Var3;
        aii0 v;
        long j;
        zx40 zx40Var;
        hz6 hz6Var4;
        tz6 tz6Var4;
        boolean z4;
        kj2 kj2Var;
        int i5;
        int i6;
        int i7;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1310015664);
        if ((i & 6) == 0) {
            i3 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                if ((i2 & 8) == 0) {
                    ehr0Var2 = ehr0Var;
                    if (btsVar2.k(ehr0Var2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    ehr0Var2 = ehr0Var;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                ehr0Var2 = ehr0Var;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                if ((i2 & 16) == 0) {
                    hz6Var2 = hz6Var;
                    if (btsVar2.k(hz6Var2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    hz6Var2 = hz6Var;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                hz6Var2 = hz6Var;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    tz6Var2 = tz6Var;
                    if (btsVar2.k(tz6Var2)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    tz6Var2 = tz6Var;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                tz6Var2 = tz6Var;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= btsVar2.k(null) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                j690Var2 = j690Var;
                i3 |= btsVar2.k(j690Var2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= btsVar2.k(null) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                }
                if ((805306368 & i) == 0) {
                    i3 |= btsVar2.e(zlsVar) ? 536870912 : SelfTester_JCP.IMITA;
                }
                if (btsVar2.V(i3 & 1, (i3 & 306783379) != 306783378)) {
                    btsVar2.a0();
                    if ((i & 1) == 0 || btsVar2.C()) {
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            l690 l690Var = rz6.a;
                            i3 &= -7169;
                            ehr0Var2 = zir0.b(q27.a, btsVar2);
                        }
                        if ((i2 & 16) != 0) {
                            l690 l690Var2 = rz6.a;
                            i3 &= -57345;
                            hz6Var2 = rz6.b((agc) btsVar2.m(dgc.a));
                        }
                        if ((i2 & 32) != 0) {
                            l690 l690Var3 = rz6.a;
                            tz6Var2 = new tz6(w3r.f);
                            i3 &= -458753;
                        }
                        if (i4 != 0) {
                            j690Var2 = rz6.a;
                        }
                    } else {
                        btsVar2.Y();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                    }
                    boolean z5 = z2;
                    ehr0 ehr0Var4 = ehr0Var2;
                    j690 j690Var4 = j690Var2;
                    btsVar2.u();
                    btsVar2.e0(1691726283);
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    if (Q == o430Var) {
                        Q = ly3.i(btsVar2);
                    }
                    zx40 zx40Var2 = (zx40) Q;
                    btsVar2.t(false);
                    long j2 = z5 ? hz6Var2.a : hz6Var2.c;
                    long j3 = z5 ? hz6Var2.b : hz6Var2.d;
                    if (tz6Var2 == null) {
                        btsVar2.e0(1691909926);
                        btsVar2.t(false);
                        zx40Var = zx40Var2;
                        j = j3;
                        hz6Var4 = hz6Var2;
                        tz6Var4 = tz6Var2;
                        z4 = z5;
                        kj2Var = null;
                    } else {
                        btsVar2.e0(-499611589);
                        int i9 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                        Object Q2 = btsVar2.Q();
                        if (Q2 == o430Var) {
                            Q2 = new SnapshotStateList();
                            btsVar2.o0(Q2);
                        }
                        SnapshotStateList snapshotStateList = (SnapshotStateList) Q2;
                        boolean k = btsVar2.k(zx40Var2);
                        j = j3;
                        Object Q3 = btsVar2.Q();
                        if (k || Q3 == o430Var) {
                            Q3 = new ButtonElevation$animateElevation$1$1(zx40Var2, snapshotStateList, null);
                            btsVar2.o0(Q3);
                        }
                        zpn.e(btsVar2, (wls) Q3, zx40Var2);
                        g8w g8wVar = (g8w) kotlin.collections.a.b0(snapshotStateList);
                        float f = (z5 && !(g8wVar instanceof jxe0) && (g8wVar instanceof ltu)) ? tz6Var2.a : 0.0f;
                        Object Q4 = btsVar2.Q();
                        if (Q4 == o430Var) {
                            zx40Var = zx40Var2;
                            hz6Var4 = hz6Var2;
                            Q4 = new androidx.compose.animation.core.a(new y7m(f), gtq0.h, (Object) null, 12);
                            btsVar2.o0(Q4);
                        } else {
                            zx40Var = zx40Var2;
                            hz6Var4 = hz6Var2;
                        }
                        androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q4;
                        y7m y7mVar = new y7m(f);
                        boolean e = ((((i9 & 896) ^ 384) > 256 && btsVar2.k(tz6Var2)) || (i9 & 384) == 256) | btsVar2.e(aVar) | btsVar2.b(f) | ((((i9 & 14) ^ 6) > 4 && btsVar2.a(z5)) || (i9 & 6) == 4) | btsVar2.e(g8wVar);
                        Object Q5 = btsVar2.Q();
                        if (e || Q5 == o430Var) {
                            tz6Var4 = tz6Var2;
                            z4 = z5;
                            Q5 = new ButtonElevation$animateElevation$2$1(aVar, f, z4, tz6Var4, g8wVar, null);
                            btsVar2.o0(Q5);
                        } else {
                            tz6Var4 = tz6Var2;
                            z4 = z5;
                        }
                        zpn.e(btsVar2, (wls) Q5, y7mVar);
                        kj2Var = aVar.d;
                        btsVar2.t(false);
                    }
                    float f2 = kj2Var != null ? ((y7m) kj2Var.b.getValue()).a : 0.0f;
                    Object Q6 = btsVar2.Q();
                    if (Q6 == o430Var) {
                        Q6 = new wk6(7);
                        btsVar2.o0(Q6);
                    }
                    long j4 = j;
                    boolean z6 = z4;
                    btsVar = btsVar2;
                    mnw0.b(slsVar, fnq0.b(f530Var, false, (tls) Q6), z6, ehr0Var4, j2, j4, 0.0f, f2, zx40Var, wwg.S(-535639973, true, new a92(j4, j690Var4, zlsVar, 1), btsVar2), btsVar, (i3 & 8078) | ((i3 << 6) & 234881024), 64);
                    j690Var3 = j690Var4;
                    ehr0Var3 = ehr0Var4;
                    z3 = z6;
                    tz6Var3 = tz6Var4;
                    hz6Var3 = hz6Var4;
                } else {
                    btsVar = btsVar2;
                    btsVar.Y();
                    z3 = z2;
                    ehr0Var3 = ehr0Var2;
                    hz6Var3 = hz6Var2;
                    tz6Var3 = tz6Var2;
                    j690Var3 = j690Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new s07(slsVar, f530Var, z3, ehr0Var3, hz6Var3, tz6Var3, j690Var3, zlsVar, i, i2);
                    return;
                }
                return;
            }
            j690Var2 = j690Var;
            if ((i2 & 256) != 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if (btsVar2.V(i3 & 1, (i3 & 306783379) != 306783378)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z2 = z;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        j690Var2 = j690Var;
        if ((i2 & 256) != 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if (btsVar2.V(i3 & 1, (i3 & 306783379) != 306783378)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(final o0t0 o0t0Var, f530 f530Var, zls zlsVar, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-977568115);
        int i2 = (i & 6) == 0 ? (btsVar.k(o0t0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(zlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            final String b = vhb1.b(btsVar, wyh0.m3c_snackbar_pane_title);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new e8p();
                btsVar.o0(Q);
            }
            final e8p e8pVar = (e8p) Q;
            Object obj = e8pVar.a;
            ArrayList arrayList = e8pVar.b;
            if (jl40.l(o0t0Var, obj)) {
                z = false;
                btsVar.e0(1428992245);
            } else {
                btsVar.e0(1441886385);
                e8pVar.a = o0t0Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((o0t0) ((c8p) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(o0t0Var)) {
                    arrayList3.add(o0t0Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj2 = arrayList3.get(i4);
                    if (obj2 != null) {
                        arrayList4.add(obj2);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    final o0t0 o0t0Var2 = (o0t0) arrayList4.get(i5);
                    arrayList.add(new c8p(o0t0Var2, wwg.S(-1952400805, true, new zls() { // from class: androidx.compose.material3.x
                        @Override // defpackage.zls
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            wls wlsVar = (wls) obj3;
                            fid fidVar2 = (fid) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= fidVar2.e(wlsVar) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                Object obj6 = o0t0.this;
                                boolean l = jl40.l(obj6, o0t0Var);
                                twt0 e = hob1.e(MotionSchemeKeyTokens.FastEffects, btsVar2);
                                boolean k = btsVar2.k(obj6);
                                Object obj7 = e8pVar;
                                boolean e2 = k | btsVar2.e(obj7);
                                Object Q2 = btsVar2.Q();
                                Object obj8 = did.a;
                                if (e2 || Q2 == obj8) {
                                    Q2 = new ppr0(23, obj6, obj7);
                                    btsVar2.o0(Q2);
                                }
                                sls slsVar = (sls) Q2;
                                Object Q3 = btsVar2.Q();
                                if (Q3 == obj8) {
                                    Q3 = id00.a(!l ? 1.0f : 0.0f);
                                    btsVar2.o0(Q3);
                                }
                                androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q3;
                                Boolean valueOf = Boolean.valueOf(l);
                                boolean e3 = btsVar2.e(aVar) | btsVar2.a(l) | btsVar2.e(e) | btsVar2.k(slsVar);
                                Object Q4 = btsVar2.Q();
                                if (e3 || Q4 == obj8) {
                                    Object snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(aVar, l, e, slsVar, null);
                                    btsVar2.o0(snackbarHostKt$animatedOpacity$2$1);
                                    Q4 = snackbarHostKt$animatedOpacity$2$1;
                                }
                                zpn.e(btsVar2, (wls) Q4, valueOf);
                                kj2 kj2Var = aVar.d;
                                twt0 e4 = hob1.e(MotionSchemeKeyTokens.FastSpatial, btsVar2);
                                Object Q5 = btsVar2.Q();
                                if (Q5 == obj8) {
                                    Q5 = id00.a(l ? 0.8f : 1.0f);
                                    btsVar2.o0(Q5);
                                }
                                androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) Q5;
                                Boolean valueOf2 = Boolean.valueOf(l);
                                boolean e5 = btsVar2.e(aVar2) | btsVar2.a(l) | btsVar2.e(e4);
                                Object Q6 = btsVar2.Q();
                                if (e5 || Q6 == obj8) {
                                    Q6 = new SnackbarHostKt$animatedScale$1$1(aVar2, l, e4, null);
                                    btsVar2.o0(Q6);
                                }
                                zpn.e(btsVar2, (wls) Q6, valueOf2);
                                kj2 kj2Var2 = aVar2.d;
                                f530 b2 = androidx.compose.ui.graphics.d.b(((Number) kj2Var2.b.getValue()).floatValue(), ((Number) kj2Var2.b.getValue()).floatValue(), ((Number) kj2Var.b.getValue()).floatValue(), 0.0f, null, 131064);
                                boolean a = btsVar2.a(l) | btsVar2.k(obj6);
                                Object obj9 = b;
                                boolean k2 = a | btsVar2.k(obj9);
                                Object Q7 = btsVar2.Q();
                                if (k2 || Q7 == obj8) {
                                    Q7 = new rx3(l, obj9, obj6, 15);
                                    btsVar2.o0(Q7);
                                }
                                f530 b3 = fnq0.b(b2, false, (tls) Q7);
                                z910 d = pi6.d(x4c.b, false);
                                int S = cma1.S(btsVar2);
                                r1b0 o = btsVar2.o();
                                f530 d2 = androidx.compose.ui.b.d(btsVar2, b3);
                                ohd.G1.getClass();
                                sls slsVar2 = androidx.compose.ui.node.d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar2);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
                                qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                                wls wlsVar2 = androidx.compose.ui.node.d.g;
                                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                                    b64.z(S, btsVar2, S, wlsVar2);
                                }
                                qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
                                xvz.u(intValue & 14, wlsVar, btsVar2, true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar)));
                }
                z = false;
            }
            btsVar.t(z);
            z910 d = pi6.d(x4c.b, z);
            int S = cma1.S(btsVar);
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
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            aii0 B = btsVar.B();
            if (B == null) {
                ny61.r("no recompose scope found");
                return;
            }
            B.b |= 1;
            e8pVar.c = B;
            btsVar.e0(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                c8p c8pVar = (c8p) arrayList.get(i6);
                o0t0 o0t0Var3 = (o0t0) c8pVar.a;
                androidx.compose.runtime.internal.a aVar = c8pVar.b;
                btsVar.c0(1325010085, o0t0Var3);
                aVar.invoke(wwg.S(-1893791890, true, new c1p0(21, zlsVar, o0t0Var3), btsVar), btsVar, 6);
                btsVar.t(false);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0((Object) o0t0Var, f530Var, (Object) zlsVar, i, 16);
        }
    }

    public static final void c(sls slsVar, f530 f530Var, boolean z, ehr0 ehr0Var, hz6 hz6Var, tz6 tz6Var, j690 j690Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        tz6 tz6Var2;
        j690 j690Var2;
        int i3;
        j690 j690Var3;
        tz6 tz6Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-102343472);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(ehr0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.k(hz6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        int i4 = i2 | 114819072;
        if ((805306368 & i) == 0) {
            i4 |= btsVar2.e(aVar) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (btsVar2.V(i4 & 1, (306783379 & i4) != 306783378)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                l690 l690Var = rz6.a;
                tz6 tz6Var4 = new tz6(a4r.a);
                i3 = i4 & (-458753);
                j690Var3 = rz6.a;
                tz6Var3 = tz6Var4;
            } else {
                btsVar2.Y();
                i3 = i4 & (-458753);
                tz6Var3 = tz6Var;
                j690Var3 = j690Var;
            }
            btsVar2.u();
            btsVar = btsVar2;
            a(slsVar, f530Var, z, ehr0Var, hz6Var, tz6Var3, j690Var3, aVar, btsVar, i3 & 2147483646, 0);
            tz6Var2 = tz6Var3;
            j690Var2 = j690Var3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            tz6Var2 = tz6Var;
            j690Var2 = j690Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z07(slsVar, f530Var, z, ehr0Var, hz6Var, tz6Var2, j690Var2, aVar, i);
        }
    }

    public static final void d(final sls slsVar, final long j, final mx20 mx20Var, androidx.compose.animation.core.a aVar, androidx.compose.runtime.internal.a aVar2, fid fidVar, int i) {
        int i2;
        mx20 mx20Var2;
        int i3;
        Object obj;
        o430 o430Var;
        int i4;
        int i5;
        LayoutDirection layoutDirection;
        Object obj2;
        int i6;
        Object obj3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(766784632);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.d(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            mx20Var2 = mx20Var;
            i2 |= btsVar.k(mx20Var2) ? 256 : 128;
        } else {
            mx20Var2 = mx20Var;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(aVar) : btsVar.e(aVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(aVar2) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
            fwi fwiVar = (fwi) btsVar.m(androidx.compose.ui.platform.j.h);
            LayoutDirection layoutDirection2 = (LayoutDirection) btsVar.m(androidx.compose.ui.platform.j.n);
            androidx.compose.runtime.c y0 = cma1.y0(btsVar);
            oz40 n = androidx.compose.runtime.f.n(aVar2, btsVar);
            Object[] objArr = new Object[0];
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                i3 = i2;
                sq20 sq20Var = new sq20(10);
                btsVar.o0(sq20Var);
                obj = sq20Var;
            } else {
                i3 = i2;
                obj = Q;
            }
            UUID uuid = (UUID) cvw.V(objArr, (sls) obj, btsVar, 48);
            Object Q2 = btsVar.Q();
            Object obj4 = Q2;
            if (Q2 == o430Var2) {
                tse j2 = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(j2);
                obj4 = j2;
            }
            tse tseVar = (tse) obj4;
            boolean k = btsVar.k(view) | btsVar.k(fwiVar);
            Object Q3 = btsVar.Q();
            if (k || Q3 == o430Var2) {
                o430Var = o430Var2;
                i4 = i3;
                i5 = 1;
                layoutDirection = layoutDirection2;
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = new ModalBottomSheetDialogWrapper(slsVar, mx20Var2, j, view, layoutDirection, fwiVar, uuid, aVar, tseVar, null);
                modalBottomSheetDialogWrapper.setContent(y0, new androidx.compose.runtime.internal.a(-1051373467, new va2(i5, n), true));
                btsVar.o0(modalBottomSheetDialogWrapper);
                obj2 = modalBottomSheetDialogWrapper;
            } else {
                layoutDirection = layoutDirection2;
                o430Var = o430Var2;
                i4 = i3;
                i5 = 1;
                obj2 = Q3;
            }
            final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = (ModalBottomSheetDialogWrapper) obj2;
            boolean e = btsVar.e(modalBottomSheetDialogWrapper2);
            Object Q4 = btsVar.Q();
            o430 o430Var3 = o430Var;
            if (e || Q4 == o430Var3) {
                i6 = 0;
                q qVar = new q(modalBottomSheetDialogWrapper2, 0);
                btsVar.o0(qVar);
                obj3 = qVar;
            } else {
                i6 = 0;
                obj3 = Q4;
            }
            zpn.a(modalBottomSheetDialogWrapper2, (tls) obj3, btsVar);
            int i7 = i4;
            int i8 = (btsVar.e(modalBottomSheetDialogWrapper2) ? 1 : 0) | ((i7 & 14) == 4 ? i5 : i6) | ((i7 & 896) == 256 ? i5 : i6) | ((i7 & 112) == 32 ? i5 : i6) | (btsVar.c(layoutDirection.ordinal()) ? 1 : 0);
            Object Q5 = btsVar.Q();
            Object obj5 = Q5;
            if (i8 != 0 || Q5 == o430Var3) {
                final LayoutDirection layoutDirection3 = layoutDirection;
                sls slsVar2 = new sls() { // from class: androidx.compose.material3.r
                    @Override // defpackage.sls
                    public final Object invoke() {
                        ModalBottomSheetDialogWrapper.this.m41updateParameters9LQNqLg(slsVar, mx20Var, j, layoutDirection3);
                        return zy11.a;
                    }
                };
                btsVar.o0(slsVar2);
                obj5 = slsVar2;
            }
            zpn.i((sls) obj5, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nx20(slsVar, j, mx20Var, aVar, aVar2, i);
        }
    }

    public static final void e(y yVar, f530 f530Var, zls zlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1077081618);
        int i2 = (btsVar.k(yVar) ? 4 : 2) | i | 432;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            rdd.a.getClass();
            zlsVar = rdd.b;
            o0t0 o0t0Var = (o0t0) yVar.b.getValue();
            hh hhVar = (hh) btsVar.m(androidx.compose.ui.platform.j.a);
            boolean k = btsVar.k(o0t0Var) | btsVar.e(hhVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new SnackbarHostKt$SnackbarHost$1$1(o0t0Var, hhVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, o0t0Var);
            o0t0 o0t0Var2 = (o0t0) yVar.b.getValue();
            c530 c530Var = c530.a;
            b(o0t0Var2, c530Var, zlsVar, btsVar, 432);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        zls zlsVar2 = zlsVar;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(yVar, f530Var2, zlsVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(sls slsVar, f530 f530Var, boolean z, ehr0 ehr0Var, hz6 hz6Var, j690 j690Var, zls zlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        hz6 hz6Var2;
        int i3;
        int i4;
        boolean z2;
        ehr0 ehr0Var2;
        j690 j690Var2;
        f530 f530Var3;
        hz6 hz6Var3;
        aii0 v;
        f530 f530Var4;
        int i5;
        ehr0 ehr0Var3;
        boolean z3;
        j690 j690Var3;
        hz6 hz6Var4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1061374109);
        int i6 = i | (btsVar.e(slsVar) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i6 |= btsVar.k(f530Var2) ? 32 : 16;
            int i8 = i6 | 1408;
            if ((i2 & 16) != 0) {
                hz6Var2 = hz6Var;
                if (btsVar.k(hz6Var2)) {
                    i3 = 16384;
                    i4 = i8 | i3 | 115015680;
                    if (btsVar.V(i4 & 1, (306783379 & i4) != 306783378)) {
                        btsVar.a0();
                        if ((i & 1) == 0 || btsVar.C()) {
                            f530Var4 = i7 != 0 ? c530.a : f530Var2;
                            l690 l690Var = rz6.a;
                            ehr0 b = zir0.b(q27.a, btsVar);
                            int i9 = i4 & (-7169);
                            if ((i2 & 16) != 0) {
                                hz6Var2 = rz6.c((agc) btsVar.m(dgc.a));
                                i5 = i4 & (-64513);
                            } else {
                                i5 = i9;
                            }
                            hz6 hz6Var5 = hz6Var2;
                            ehr0Var3 = b;
                            z3 = true;
                            j690Var3 = rz6.b;
                            hz6Var4 = hz6Var5;
                        } else {
                            btsVar.Y();
                            int i10 = i4 & (-7169);
                            if ((i2 & 16) != 0) {
                                i10 = i4 & (-64513);
                            }
                            j690Var3 = j690Var;
                            i5 = i10;
                            f530Var4 = f530Var2;
                            hz6Var4 = hz6Var2;
                            z3 = z;
                            ehr0Var3 = ehr0Var;
                        }
                        btsVar.u();
                        a(slsVar, f530Var4, z3, ehr0Var3, hz6Var4, null, j690Var3, zlsVar, btsVar, i5 & 2147483646, 0);
                        f530Var3 = f530Var4;
                        z2 = z3;
                        ehr0Var2 = ehr0Var3;
                        hz6Var3 = hz6Var4;
                        j690Var2 = j690Var3;
                    } else {
                        btsVar.Y();
                        z2 = z;
                        ehr0Var2 = ehr0Var;
                        j690Var2 = j690Var;
                        f530Var3 = f530Var2;
                        hz6Var3 = hz6Var2;
                    }
                    v = btsVar.v();
                    if (v != null) {
                        v.d = new u07(slsVar, f530Var3, z2, ehr0Var2, hz6Var3, j690Var2, zlsVar, i, i2);
                        return;
                    }
                    return;
                }
            } else {
                hz6Var2 = hz6Var;
            }
            i3 = 8192;
            i4 = i8 | i3 | 115015680;
            if (btsVar.V(i4 & 1, (306783379 & i4) != 306783378)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        int i82 = i6 | 1408;
        if ((i2 & 16) != 0) {
        }
        i3 = 8192;
        i4 = i82 | i3 | 115015680;
        if (btsVar.V(i4 & 1, (306783379 & i4) != 306783378)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final boolean g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
