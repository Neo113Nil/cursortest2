package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class c1z0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v12 */
    public static final void a(f530 f530Var, List list, tls tlsVar, boolean z, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        c530 c530Var;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1821774616);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        ?? r15 = 1;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var2 = c530.a;
            if (i4 != 0) {
                f530Var2 = c530Var2;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                w3z0 w3z0Var = (w3z0) it.next();
                boolean z4 = w3z0Var instanceof r3z0;
                o430 o430Var = did.a;
                if (z4) {
                    btsVar.e0(-352986);
                    r3z0 r3z0Var = (r3z0) w3z0Var;
                    f530 k = an91.m(c530Var2, 0.0f, 2.0f, r15).k(f530Var2);
                    boolean k2 = btsVar.k(w3z0Var) | ((i3 & 896) == 256 ? r15 : false);
                    Object Q = btsVar.Q();
                    if (k2 || Q == o430Var) {
                        Q = new rmy0(10, tlsVar, r3z0Var);
                        btsVar.o0(Q);
                    }
                    b(z2, r3z0Var, (tls) Q, k, btsVar, (i3 >> 9) & 14);
                    btsVar.t(false);
                } else if (w3z0Var instanceof t3z0) {
                    btsVar.e0(-40413);
                    t3z0 t3z0Var = (t3z0) w3z0Var;
                    f530 k3 = an91.m(c530Var2, 0.0f, 2.0f, r15).k(f530Var2);
                    boolean k4 = btsVar.k(w3z0Var) | ((i3 & 896) == 256 ? r15 : false);
                    Object Q2 = btsVar.Q();
                    if (k4 || Q2 == o430Var) {
                        Q2 = new rmy0(11, tlsVar, t3z0Var);
                        btsVar.o0(Q2);
                    }
                    d(z, t3z0Var, (tls) Q2, k3, btsVar, (i3 >> 9) & 14);
                    btsVar.t(false);
                } else if (w3z0Var instanceof v3z0) {
                    btsVar.e0(278577);
                    v3z0 v3z0Var = (v3z0) w3z0Var;
                    f530 k5 = an91.m(c530Var2, 0.0f, 2.0f, r15).k(f530Var2);
                    boolean k6 = btsVar.k(w3z0Var) | ((i3 & 896) == 256 ? r15 : false);
                    Object Q3 = btsVar.Q();
                    if (k6 || Q3 == o430Var) {
                        Q3 = new i5y0(11, tlsVar, v3z0Var);
                        btsVar.o0(Q3);
                    }
                    f(z, v3z0Var, (sls) Q3, k5, btsVar, (i3 >> 9) & 14);
                    btsVar.t(false);
                } else {
                    if (w3z0Var instanceof u3z0) {
                        btsVar.e0(613067);
                        Object Q4 = btsVar.Q();
                        if (Q4 == o430Var) {
                            Q4 = f.j(Boolean.FALSE);
                            btsVar.o0(Q4);
                        }
                        oz40 oz40Var = (oz40) Q4;
                        u3z0 u3z0Var = (u3z0) w3z0Var;
                        f530 k7 = an91.m(c530Var2, 0.0f, 2.0f, r15).k(f530Var2);
                        boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                        boolean k8 = btsVar.k(w3z0Var) | ((i3 & 896) == 256);
                        Object Q5 = btsVar.Q();
                        if (k8 || Q5 == o430Var) {
                            Q5 = new zjy0(5, tlsVar, u3z0Var, oz40Var);
                            btsVar.o0(Q5);
                        }
                        bts btsVar2 = btsVar;
                        c530Var = c530Var2;
                        e(z, u3z0Var, booleanValue, (tls) Q5, k7, btsVar2, (i3 >> 9) & 14);
                        btsVar = btsVar2;
                        btsVar.t(false);
                        z3 = true;
                    } else {
                        c530Var = c530Var2;
                        if (!(w3z0Var instanceof s3z0)) {
                            throw unr0.y(-1385485013, btsVar, false);
                        }
                        btsVar.e0(1081756);
                        s3z0 s3z0Var = (s3z0) w3z0Var;
                        z3 = true;
                        f530 k9 = an91.m(c530Var, 0.0f, 2.0f, 1).k(f530Var2);
                        boolean k10 = btsVar.k(w3z0Var) | ((i3 & 896) == 256);
                        Object Q6 = btsVar.Q();
                        if (k10 || Q6 == o430Var) {
                            Q6 = new i5y0(12, tlsVar, s3z0Var);
                            btsVar.o0(Q6);
                        }
                        c(z, s3z0Var, (sls) Q6, k9, btsVar, (i3 >> 9) & 14);
                        btsVar.t(false);
                    }
                    c530 c530Var3 = c530Var;
                    r15 = z3;
                    c530Var2 = c530Var3;
                    z2 = z;
                }
                boolean z5 = r15;
                c530Var = c530Var2;
                z3 = z5;
                c530 c530Var32 = c530Var;
                r15 = z3;
                c530Var2 = c530Var32;
                z2 = z;
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fo1(f530Var2, list, tlsVar, z, i, i2, 6);
        }
    }

    public static final void b(boolean z, r3z0 r3z0Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1264593548);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(r3z0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.TRUE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            f530 c = ljs0.c(f530Var, 1.0f);
            gz6 gz6Var = new gz6(r3z0Var.e, r3z0Var.a.b);
            ButtonSize buttonSize = z ? ButtonSize.S : ButtonSize.L;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new xlp0(26, tlsVar, r3z0Var, oz40Var);
                btsVar.o0(Q2);
            }
            d17.d(c, false, buttonSize, gz6Var, null, (sls) Q2, wwg.S(531015065, true, new qtb(r3z0Var, z, oz40Var, 4), btsVar), btsVar, 1572864, 18);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(z, r3z0Var, tlsVar, f530Var, i, 29);
        }
    }

    public static final void c(boolean z, s3z0 s3z0Var, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2084408000);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(s3z0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            d17.d(ljs0.c(f530Var, 1.0f), s3z0Var.c, z ? ButtonSize.S : ButtonSize.L, new gz6(s3z0Var.d, s3z0Var.a.b), null, slsVar, wwg.S(324184269, true, new my8(s3z0Var, z, 12), btsVar), btsVar, ((i2 << 9) & ImageMetadata.JPEG_GPS_COORDINATES) | 1572864, 16);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a1z0(z, s3z0Var, slsVar, f530Var, i, 0);
        }
    }

    public static final void d(boolean z, t3z0 t3z0Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(97519423);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(t3z0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            ButtonSize buttonSize = z ? ButtonSize.S : ButtonSize.L;
            gz6 gz6Var = new gz6(t3z0Var.b, t3z0Var.a.b);
            boolean z2 = t3z0Var.c;
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new i5y0(10, tlsVar, t3z0Var);
                btsVar.o0(Q);
            }
            d17.d(c, z2, buttonSize, gz6Var, null, (sls) Q, wwg.S(-1021374452, true, new my8(t3z0Var, z, 13), btsVar), btsVar, 1572864, 16);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a1z0(z, t3z0Var, tlsVar, f530Var, i, 1);
        }
    }

    public static final void e(final boolean z, final u3z0 u3z0Var, final boolean z2, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(868848857);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(u3z0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(f530Var) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            ButtonSize buttonSize = z ? ButtonSize.S : ButtonSize.L;
            boolean z3 = u3z0Var.b && !z2;
            boolean z4 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z4 || Q == did.a) {
                Q = new i5y0(13, tlsVar, u3z0Var);
                btsVar.o0(Q);
            }
            d17.d(c, z3, buttonSize, null, null, (sls) Q, wwg.S(-646341018, true, new zls() { // from class: b1z0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                        ety0 ety0Var = xya1.d(btsVar2).g.b;
                        jeb1.f(u3z0Var.a, pfb1.b(c530.a, z2, 14), null, nwa1.i(ety0Var.a.b, z), 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar2, 0, 0, 16372);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 1572864, 24);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new osm(z, u3z0Var, z2, tlsVar, f530Var, i);
        }
    }

    public static final void f(boolean z, v3z0 v3z0Var, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(564610494);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(v3z0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        boolean z2 = false;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ButtonSize buttonSize = z ? ButtonSize.S : ButtonSize.L;
            f530 c = ljs0.c(f530Var, 1.0f);
            gz6 gz6Var = new gz6(v3z0Var.e, v3z0Var.a.b);
            if (v3z0Var.g && !v3z0Var.f) {
                z2 = true;
            }
            d17.d(c, z2, buttonSize, gz6Var, null, slsVar, wwg.S(-168967989, true, new my8(v3z0Var, z, 11), btsVar), btsVar, ((i2 << 9) & ImageMetadata.JPEG_GPS_COORDINATES) | 1572864, 16);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(z, v3z0Var, slsVar, f530Var, i, 28);
        }
    }

    public static final void g(f530 f530Var, boolean z, List list, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1418198532);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | 6 | (btsVar.a(z) ? 32 : 16) | (btsVar.k(list) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(41003556);
                f530 c = ljs0.c(an91.l(c530Var, 8.0f, 6.0f), 1.0f);
                lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, c);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, a);
                qje.W(btsVar, d.e, o);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                int i3 = i2 >> 3;
                a(n.d(btsVar, d, d.d, 1.0f, true), list, tlsVar, true, btsVar, (i3 & 112) | HProv.ALG_TYPE_SECURECHANNEL | (i3 & 896), 0);
                btsVar.t(true);
                btsVar.t(false);
            } else {
                btsVar.e0(41357824);
                f530 c2 = ljs0.c(an91.l(c530Var, 8.0f, 10.0f), 1.0f);
                sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = b.d(btsVar, c2);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, a2);
                qje.W(btsVar, d.e, o2);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode2));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d2);
                int i4 = i2 >> 3;
                a(null, list, tlsVar, false, btsVar, (i4 & 112) | HProv.ALG_TYPE_SECURECHANNEL | (i4 & 896), 1);
                btsVar.t(true);
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(f530Var2, z, list, tlsVar, i, 19);
        }
    }
}
