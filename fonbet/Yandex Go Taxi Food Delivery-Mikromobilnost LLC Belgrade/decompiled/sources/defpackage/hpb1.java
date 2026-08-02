package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.summary.ui.compose.util.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class hpb1 {
    public static final void a(sls slsVar, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1676238665);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            a7u0 a7u0Var = vz20.a;
            wz20 wz20Var = (wz20) btsVar.m(a7u0Var);
            boolean k = btsVar.k(wz20Var);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new wz20(new mth(new b(wz20Var.a, slsVar), 6));
                btsVar.o0(Q);
            }
            sb2.b(a7u0Var.a((wz20) Q), wwg.S(1402978953, true, new k2z0(aVar, 13), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ngd(slsVar, aVar, i, i3);
        }
    }

    public static final void b(s740 s740Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-206629129);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(s740Var) : btsVar.e(s740Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            gpb1.c(an91.o(c530.a, 0.0f, jl40.l(s740Var.a, a411.a) ? 40.0f : 98.0f, 0.0f, 0.0f, 13), false, 0.0f, wwg.S(451810455, true, new bj0(i3, s740Var), btsVar), null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 22);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(s740Var, i, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, final wp2 wp2Var, final wp2 wp2Var2, final rr9 rr9Var, float f, long j, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        long j2;
        int i5;
        f530 f530Var2;
        bts btsVar;
        final float f3;
        final long j3;
        final f530 f530Var3;
        aii0 v;
        ety0 a;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-511046665);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(wp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.k(wp2Var2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= (i & 4096) == 0 ? btsVar2.k(rr9Var) : btsVar2.e(rr9Var) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            f2 = f;
            i3 |= btsVar2.b(f2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
                j2 = j;
            } else {
                j2 = j;
                if ((196608 & i) == 0) {
                    i3 |= btsVar2.d(j2) ? 131072 : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f530Var2 = f530Var;
                i3 |= btsVar2.k(f530Var2) ? 1048576 : 524288;
                if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
                    if (i6 != 0) {
                        f2 = 0.0f;
                    }
                    long j4 = i4 != 0 ? ldc.b : j2;
                    f530 f530Var4 = c530.a;
                    f530 f530Var5 = i5 != 0 ? f530Var4 : f530Var2;
                    fwi fwiVar = (fwi) btsVar2.m(j.h);
                    boolean k = btsVar2.k(fwiVar) | ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && btsVar2.e(rr9Var)));
                    Object Q = btsVar2.Q();
                    if (k || Q == did.a) {
                        Q = new ays0(13, fwiVar, rr9Var);
                        btsVar2.o0(Q);
                    }
                    uys uysVar = new uys((zls) Q);
                    f530 k2 = an91.k(f530Var5, 2.0f * f2);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar2, k2);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar2, wlsVar, d);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar2, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar2, wlsVar3, valueOf);
                    tls tlsVar = d.h;
                    qje.M(btsVar2, tlsVar);
                    int i7 = i3;
                    wls wlsVar4 = d.d;
                    qje.W(btsVar2, wlsVar4, d2);
                    uo5 uo5Var = x4c.y;
                    f530 f530Var6 = f530Var5;
                    f530 n = ljs0.n(f530Var4, rr9Var.r(), rr9Var.o());
                    if (y7m.a(f2, 0.0f) > 0 && y7m.a(f2, 0.0f) > 0) {
                        f530Var4 = new androidx.compose.ui.draw.d(f2, uysVar, false, j4, j4);
                    }
                    long j5 = j4;
                    f530 c = bzk0.c(ymb1.l(n.k(f530Var4), uysVar), wp2Var2, qke.q);
                    z910 d3 = pi6.d(uo5Var, false);
                    float f4 = f2;
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d4 = androidx.compose.ui.b.d(btsVar2, c);
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, wlsVar, d3);
                    qje.W(btsVar2, wlsVar2, o2);
                    vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
                    qje.W(btsVar2, wlsVar4, d4);
                    if (rr9Var.equals(l76.z)) {
                        btsVar2.e0(-1028870757);
                        a = ety0.a(xya1.b(btsVar2).d, 0L, uh6.E(22), null, null, null, 0L, null, null, null, 0, uh6.E(23), null, null, 16646141);
                        btsVar2.t(false);
                    } else {
                        if (!rr9Var.equals(vvb1.x)) {
                            throw unr0.y(-1834306951, btsVar2, false);
                        }
                        btsVar2.e0(-1028717989);
                        a = ety0.a(xya1.b(btsVar2).d, 0L, uh6.E(38), null, null, null, 0L, null, null, null, 0, uh6.E(41), null, null, 16646141);
                        btsVar2.t(false);
                    }
                    jeb1.f(str, null, wp2Var, 0L, 0L, null, new sjy0(3), 0L, 1, false, 1, 0, null, a, btsVar2, (i7 & 14) | 805306368 | ((i7 << 3) & 896), 48, 13690);
                    btsVar = btsVar2;
                    btsVar.t(true);
                    btsVar.t(true);
                    f530Var3 = f530Var6;
                    f3 = f4;
                    j3 = j5;
                } else {
                    btsVar = btsVar2;
                    btsVar.Y();
                    f3 = f2;
                    j3 = j2;
                    f530Var3 = f530Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: t2z0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            hpb1.c(str, wp2Var, wp2Var2, rr9Var, f3, j3, f530Var3, (fid) obj, vng.O(i | 1), i2);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            f530Var2 = f530Var;
            if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f2 = f;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        f530Var2 = f530Var;
        if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }
}
