package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import java.util.Collections;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class b2q0 {
    public static final void a(final myp0 myp0Var, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, fid fidVar, final int i) {
        int i2;
        byk0 a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1813917259);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(myp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z3) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.a(z4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.a(z5) ? 131072 : 65536;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            boolean z6 = z2 && z4;
            boolean z7 = z && z5;
            if (z3) {
                btsVar.e0(582247827);
                a = YandexShapes.c(((YandexShapes) btsVar.m(qm51.a)).d, YandexShapes.Corner.TOP);
                btsVar.t(false);
            } else if (z6 && z7) {
                btsVar.e0(582250381);
                btsVar.t(false);
                a = cyk0.c(0.0f);
            } else if (z7) {
                btsVar.e0(582252886);
                a = YandexShapes.c(((YandexShapes) btsVar.m(qm51.a)).d, YandexShapes.Corner.BOTTOM);
                btsVar.t(false);
            } else if (z6) {
                btsVar.e0(582255763);
                a = YandexShapes.c(((YandexShapes) btsVar.m(qm51.a)).d, YandexShapes.Corner.TOP);
                btsVar.t(false);
            } else {
                btsVar.e0(582258074);
                a = ((YandexShapes) btsVar.m(qm51.a)).a();
                btsVar.t(false);
            }
            zh4 zh4Var = myp0Var.b;
            if (zh4Var == null) {
                btsVar.e0(582260230);
                zh4Var = new zh4(Collections.singletonList(new ug4(new ldc(((el51) btsVar.m(gl51.a)).c()))));
                btsVar.t(false);
            } else {
                btsVar.e0(582259641);
                btsVar.t(false);
            }
            s3b1.a(zh4Var, bb1.i(ljs0.c(c530.a, 1.0f), new a2q0(a, i3)), null, wwg.S(1067051978, true, new w7o0(7, myp0Var), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: z1q0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b2q0.a(myp0.this, z, z2, z3, z4, z5, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fd, code lost:
    
        if (r2 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0252, code lost:
    
        if (defpackage.jl40.l(r1.Q(), java.lang.Integer.valueOf(r7)) == false) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, final float f, long j, boolean z, boolean z2, Object obj, final tls tlsVar, fid fidVar, final int i, final int i2) {
        f530 f530Var2;
        int i3;
        long j2;
        boolean z3;
        int i4;
        int i5;
        dmw0 dmw0Var;
        bts btsVar;
        final boolean z4;
        final Object obj2;
        final f530 f530Var3;
        final long j3;
        final boolean z5;
        aii0 v;
        boolean z6;
        int i6;
        long j4;
        boolean z7;
        Object obj3;
        boolean k;
        Object Q;
        Iterator it;
        f530 f530Var4;
        f530 f530Var5;
        Object obj4;
        c530 c530Var;
        myp0 myp0Var;
        c2q0 c2q0Var;
        byk0 byk0Var;
        g43 g43Var;
        sls slsVar;
        wls wlsVar;
        qgg qggVar;
        Object obj5;
        ?? r3;
        bts btsVar2;
        so5 so5Var = x4c.G;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-1759642849);
        dmw0 dmw0Var2 = btsVar3.a;
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar3.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar3.b(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && btsVar3.d(j2)) ? 256 : 128;
        } else {
            j2 = j;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z3 = z;
            i3 |= btsVar3.a(z3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar3.a(z2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((i & ImageMetadata.EDGE_MODE) == 0) {
                    dmw0Var = dmw0Var2;
                    i3 |= btsVar3.e(obj) ? 131072 : 65536;
                    if ((i & 1572864) == 0) {
                        i3 |= btsVar3.e(tlsVar) ? 1048576 : 524288;
                    }
                    if (btsVar3.V(i3 & 1, (i3 & 599187) == 599186)) {
                        btsVar = btsVar3;
                        btsVar.Y();
                        z4 = z2;
                        obj2 = obj;
                        f530Var3 = f530Var2;
                        j3 = j2;
                        z5 = z3;
                    } else {
                        btsVar3.a0();
                        int i9 = i & 1;
                        c530 c530Var2 = c530.a;
                        if (i9 == 0 || btsVar3.C()) {
                            if (i7 != 0) {
                                f530Var2 = c530Var2;
                            }
                            if ((i2 & 4) != 0) {
                                j2 = ((el51) btsVar3.m(gl51.a)).e();
                                i3 &= -897;
                            }
                            if (i8 != 0) {
                                z3 = false;
                            }
                            z6 = i4 != 0 ? false : z2;
                            i6 = i3;
                            j4 = j2;
                            z7 = z3;
                            if (i5 != 0) {
                                obj3 = null;
                                btsVar3.u();
                                k = btsVar3.k(obj3);
                                Q = btsVar3.Q();
                                if (!k || Q == did.a) {
                                    Q = new c2q0();
                                    tlsVar.invoke(Q);
                                    btsVar3.o0(Q);
                                }
                                c2q0 c2q0Var2 = (c2q0) Q;
                                byk0 a = ((YandexShapes) btsVar3.m(qm51.a)).a();
                                f530 b = m4m0.b(f530Var2, j4, qke.q);
                                boolean z8 = z7;
                                sic a2 = qic.a(new i43(f, true, new quz(11)), so5Var, btsVar3, 0);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d = b.d(btsVar3, b);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (dmw0Var != null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                f530 f530Var6 = f530Var2;
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a2);
                                qje.W(btsVar3, d.e, o);
                                wls wlsVar2 = d.g;
                                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                                    b64.z(hashCode, btsVar3, hashCode, wlsVar2);
                                }
                                qje.W(btsVar3, d.d, d);
                                btsVar3.e0(1678021728);
                                Iterator it2 = c2q0Var2.a.iterator();
                                int i10 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    int i11 = i10 + 1;
                                    if (i10 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    myp0 myp0Var2 = (myp0) next;
                                    boolean z9 = myp0Var2.c;
                                    qgg qggVar2 = myp0Var2.d;
                                    if (z9) {
                                        it = it2;
                                        f530Var4 = new x2y(1.0f, true);
                                    } else {
                                        it = it2;
                                        f530Var4 = c530Var2;
                                    }
                                    int i12 = i10;
                                    if (qggVar2 != null) {
                                        f530Var5 = m4m0.b(ymb1.l(c530Var2, a), qggVar2.b, a);
                                    }
                                    f530Var5 = c530Var2;
                                    f530 k2 = myp0Var2.e.k(f530Var4);
                                    g43 g43Var2 = lr20.c;
                                    long j5 = j4;
                                    sic a3 = qic.a(g43Var2, so5Var, btsVar3, 0);
                                    int hashCode2 = Long.hashCode(btsVar3.T);
                                    r1b0 o2 = btsVar3.o();
                                    f530 d2 = b.d(btsVar3, k2);
                                    ohd.G1.getClass();
                                    sls slsVar3 = d.b;
                                    btsVar3.i0();
                                    if (btsVar3.S) {
                                        btsVar3.n(slsVar3);
                                    } else {
                                        btsVar3.r0();
                                    }
                                    wls wlsVar3 = d.f;
                                    qje.W(btsVar3, wlsVar3, a3);
                                    wls wlsVar4 = d.e;
                                    qje.W(btsVar3, wlsVar4, o2);
                                    wls wlsVar5 = d.g;
                                    if (btsVar3.S) {
                                        obj4 = obj3;
                                    } else {
                                        obj4 = obj3;
                                    }
                                    b64.z(hashCode2, btsVar3, hashCode2, wlsVar5);
                                    wls wlsVar6 = d.d;
                                    qje.W(btsVar3, wlsVar6, d2);
                                    if (myp0Var2.a != null) {
                                        btsVar3.e0(-1260118006);
                                        String str = myp0Var2.a;
                                        f530 l = an91.l(c530Var2, 16.0f, 4.0f);
                                        ety0 ety0Var = ((zm51) btsVar3.m(an51.a)).g;
                                        lzr lzrVar = lzr.E;
                                        long o3 = ((el51) btsVar3.m(gl51.a)).o();
                                        byk0Var = a;
                                        obj5 = obj4;
                                        qggVar = qggVar2;
                                        c530Var = c530Var2;
                                        c2q0Var = c2q0Var2;
                                        slsVar = slsVar3;
                                        myp0Var = myp0Var2;
                                        wlsVar = wlsVar3;
                                        r3 = 0;
                                        bts btsVar4 = btsVar3;
                                        g43Var = g43Var2;
                                        wqy0.b(str, l, o3, 0L, null, lzrVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar4, 196656, 0, 65496);
                                        bts btsVar5 = btsVar4;
                                        btsVar5.t(false);
                                        btsVar2 = btsVar5;
                                    } else {
                                        bts btsVar6 = btsVar3;
                                        c530Var = c530Var2;
                                        myp0Var = myp0Var2;
                                        c2q0Var = c2q0Var2;
                                        byk0Var = a;
                                        g43Var = g43Var2;
                                        slsVar = slsVar3;
                                        wlsVar = wlsVar3;
                                        qggVar = qggVar2;
                                        obj5 = obj4;
                                        r3 = 0;
                                        btsVar6.e0(-1259770527);
                                        btsVar6.t(false);
                                        btsVar2 = btsVar6;
                                    }
                                    sic a4 = qic.a(g43Var, so5Var, btsVar2, r3);
                                    int hashCode3 = Long.hashCode(btsVar2.T);
                                    r1b0 o4 = btsVar2.o();
                                    f530 d3 = b.d(btsVar2, f530Var5);
                                    btsVar2.i0();
                                    if (btsVar2.S) {
                                        btsVar2.n(slsVar);
                                    } else {
                                        btsVar2.r0();
                                    }
                                    qje.W(btsVar2, wlsVar, a4);
                                    qje.W(btsVar2, wlsVar4, o4);
                                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode3))) {
                                        b64.z(hashCode3, btsVar2, hashCode3, wlsVar5);
                                    }
                                    qje.W(btsVar2, wlsVar6, d3);
                                    if (qggVar == null) {
                                        btsVar2.e0(-597327374);
                                        btsVar2.t(r3);
                                    } else {
                                        btsVar2.e0(-597327373);
                                        c(qggVar, btsVar2, r3);
                                        btsVar2.t(r3);
                                    }
                                    c2q0 c2q0Var3 = c2q0Var;
                                    bts btsVar7 = btsVar2;
                                    a(myp0Var, i12 == 0 ? true : r3, i12 == scc.f(c2q0Var3.a) ? true : r3, qggVar != null ? true : r3, z8, z6, btsVar7, (i6 << 3) & 516096);
                                    btsVar7.t(true);
                                    btsVar7.t(true);
                                    j4 = j5;
                                    c530Var2 = c530Var;
                                    c2q0Var2 = c2q0Var3;
                                    btsVar3 = btsVar7;
                                    i10 = i11;
                                    a = byk0Var;
                                    obj3 = obj5;
                                    it2 = it;
                                }
                                btsVar = btsVar3;
                                btsVar.t(false);
                                btsVar.t(true);
                                f530Var3 = f530Var6;
                                j3 = j4;
                                z5 = z8;
                                z4 = z6;
                                obj2 = obj3;
                            }
                        } else {
                            btsVar3.Y();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            z6 = z2;
                            i6 = i3;
                            j4 = j2;
                            z7 = z3;
                        }
                        obj3 = obj;
                        btsVar3.u();
                        k = btsVar3.k(obj3);
                        Q = btsVar3.Q();
                        if (!k) {
                        }
                        Q = new c2q0();
                        tlsVar.invoke(Q);
                        btsVar3.o0(Q);
                        c2q0 c2q0Var22 = (c2q0) Q;
                        byk0 a5 = ((YandexShapes) btsVar3.m(qm51.a)).a();
                        f530 b2 = m4m0.b(f530Var2, j4, qke.q);
                        boolean z82 = z7;
                        sic a22 = qic.a(new i43(f, true, new quz(11)), so5Var, btsVar3, 0);
                        int hashCode4 = Long.hashCode(btsVar3.T);
                        r1b0 o5 = btsVar3.o();
                        f530 d4 = b.d(btsVar3, b2);
                        ohd.G1.getClass();
                        sls slsVar22 = d.b;
                        if (dmw0Var != null) {
                        }
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: y1q0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj6, Object obj7) {
                                ((Integer) obj7).getClass();
                                b2q0.b(f530.this, f, j3, z5, z4, obj2, tlsVar, (fid) obj6, vng.O(i | 1), i2);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                dmw0Var = dmw0Var2;
                if ((i & 1572864) == 0) {
                }
                if (btsVar3.V(i3 & 1, (i3 & 599187) == 599186)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            dmw0Var = dmw0Var2;
            if ((i & 1572864) == 0) {
            }
            if (btsVar3.V(i3 & 1, (i3 & 599187) == 599186)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        z3 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        dmw0Var = dmw0Var2;
        if ((i & 1572864) == 0) {
        }
        if (btsVar3.V(i3 & 1, (i3 & 599187) == 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(qgg qggVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-449893009);
        int i2 = (btsVar.k(qggVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 b = m4m0.b(ymb1.l(c530.a, YandexShapes.c(((YandexShapes) btsVar.m(qm51.a)).d, YandexShapes.Corner.TOP)), qggVar.b, qke.q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            nnm.p(0, (a) qggVar.c, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(qggVar, i, 10);
        }
    }
}
