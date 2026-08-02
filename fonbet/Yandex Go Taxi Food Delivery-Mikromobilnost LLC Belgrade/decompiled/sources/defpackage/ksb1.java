package defpackage;

import android.net.NetworkRequest;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.k;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes11.dex */
public abstract class ksb1 {
    public static j1b1 a;

    public static final void a(b711 b711Var, f530 f530Var, boolean z, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2066232366);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(b711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        }
        if (!btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(343127944);
            int i3 = i2 & HProv.PP_DELETE_SAVED_PASSWD;
            int i4 = i2 >> 3;
            c(b711Var, f530Var, tlsVar, tlsVar2, btsVar, i3 | (i4 & 896) | (i4 & 7168));
            btsVar.t(false);
        } else {
            btsVar.e0(343205320);
            int i5 = i2 & HProv.PP_DELETE_SAVED_PASSWD;
            int i6 = i2 >> 3;
            b(b711Var, f530Var, tlsVar, tlsVar2, btsVar, i5 | (i6 & 896) | (i6 & 7168));
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(b711Var, f530Var, z, tlsVar, tlsVar2, i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    public static final void b(b711 b711Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        tls tlsVar3;
        boolean z;
        ?? r0;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-980109061);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(b711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar4 = d.h;
            qje.M(btsVar, tlsVar4);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var = c530.a;
            pi6.a(ljs0.n(c530Var, 56.0f, 36.0f), btsVar, 6);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar4);
            qje.W(btsVar, wlsVar4, d2);
            ee01 ee01Var = b711Var.a;
            Object obj = did.a;
            if (ee01Var == null) {
                btsVar.e0(1336751545);
                z = false;
                btsVar.t(false);
                r0 = 1;
            } else {
                z = false;
                btsVar.e0(1336751546);
                ButtonSize buttonSize = ButtonSize.S;
                boolean e = ((i3 & 896) == 256) | btsVar.e(ee01Var);
                Object Q = btsVar.Q();
                if (e || Q == obj) {
                    Q = new md01(tlsVar, ee01Var, 2);
                    btsVar.o0(Q);
                }
                a S = wwg.S(-794424753, true, new jvx0(17, ee01Var), btsVar);
                r0 = 1;
                ohb1.b(null, false, buttonSize, (sls) Q, S, btsVar, 24960, 3);
                btsVar.t(false);
            }
            ge01 ge01Var = b711Var.b;
            if (ge01Var == null) {
                btsVar.e0(1337166263);
                btsVar.t(z);
                tlsVar3 = tlsVar2;
            } else {
                btsVar.e0(1337166264);
                ButtonSize buttonSize2 = ButtonSize.S;
                boolean e2 = btsVar.e(ge01Var) | ((i3 & 7168) == 2048 ? r0 : z);
                Object Q2 = btsVar.Q();
                if (e2 || Q2 == obj) {
                    tlsVar3 = tlsVar2;
                    Q2 = new ld01(tlsVar3, ge01Var, r0);
                    btsVar.o0(Q2);
                } else {
                    tlsVar3 = tlsVar2;
                }
                ulb1.a(null, false, buttonSize2, (sls) Q2, wwg.S(531740032, r0, new jvx0(18, ge01Var), btsVar), btsVar, 24960, 3);
                btsVar.t(z);
            }
            btsVar.t(r0);
            btsVar.t(r0);
        } else {
            tlsVar3 = tlsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nd01(b711Var, f530Var, tlsVar, tlsVar3, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    public static final void c(b711 b711Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        boolean z;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        ?? r3;
        Object obj3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1504954650);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(b711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ge01 ge01Var = b711Var.b;
            ee01 ee01Var = b711Var.a;
            boolean z4 = (ge01Var != null) ^ (ee01Var != null);
            f530 o = an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 8.0f, 16.0f, 8.0f, 1);
            to5 to5Var = x4c.D;
            lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            float f = a5l0.a - 4.0f;
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.q(c530Var, f));
            lhl0 a3 = khl0.a(new i43(8.0f, true, new quz(11)), to5Var, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            ge01 ge01Var2 = b711Var.b;
            o430 o430Var = did.a;
            if (ge01Var2 == null) {
                btsVar.e0(-1671866382);
                btsVar.t(false);
                z = false;
            } else {
                btsVar.e0(-1671866381);
                CharSequence charSequence = ge01Var2.a;
                boolean e = ((i2 & 7168) == 2048) | btsVar.e(ge01Var2);
                Object Q = btsVar.Q();
                if (e || Q == o430Var) {
                    z = false;
                    ld01 ld01Var = new ld01(tlsVar2, ge01Var2, 0);
                    btsVar.o0(ld01Var);
                    obj = ld01Var;
                } else {
                    z = false;
                    obj = Q;
                }
                d(charSequence, (sls) obj, btsVar, z ? 1 : 0);
                btsVar.t(z);
            }
            if (ee01Var == null) {
                btsVar.e0(-1671676383);
                btsVar.t(z);
                z2 = true;
            } else {
                CharSequence charSequence2 = ee01Var.a;
                btsVar.e0(-1671676382);
                if (z4) {
                    btsVar.e0(1834653303);
                    boolean e2 = ((i2 & 896) == 256) | btsVar.e(ee01Var);
                    Object Q2 = btsVar.Q();
                    if (e2 || Q2 == o430Var) {
                        r3 = 0;
                        md01 md01Var = new md01(tlsVar, ee01Var, 0);
                        btsVar.o0(md01Var);
                        obj3 = md01Var;
                    } else {
                        r3 = 0;
                        obj3 = Q2;
                    }
                    d(charSequence2, (sls) obj3, btsVar, r3);
                    btsVar.t(r3);
                    z3 = r3;
                    z2 = true;
                } else {
                    btsVar.e0(1834807094);
                    boolean e3 = ((i2 & 896) == 256) | btsVar.e(ee01Var);
                    Object Q3 = btsVar.Q();
                    if (e3 || Q3 == o430Var) {
                        z2 = true;
                        md01 md01Var2 = new md01(tlsVar, ee01Var, 1);
                        btsVar.o0(md01Var2);
                        obj2 = md01Var2;
                    } else {
                        z2 = true;
                        obj2 = Q3;
                    }
                    z3 = false;
                    e(charSequence2, (sls) obj2, btsVar, 0);
                    btsVar.t(false);
                }
                btsVar.t(z3);
            }
            btsVar.t(z2);
            btsVar.t(z2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nd01(b711Var, f530Var, tlsVar, tlsVar2, i, 0);
        }
    }

    public static final void d(CharSequence charSequence, sls slsVar, fid fidVar, int i) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1796970652);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        int i3 = 18;
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            slsVar2 = slsVar;
            ohb1.b(null, false, ButtonSize.S, slsVar2, wwg.S(-91268209, true, new or9(i3, charSequence), btsVar), btsVar, ((i2 << 6) & 7168) | 24960, 3);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pr9(charSequence, slsVar2, i, i4);
        }
    }

    public static final void e(CharSequence charSequence, sls slsVar, fid fidVar, int i) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1257297074);
        int i2 = 2;
        int i3 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            slsVar2 = slsVar;
            ulb1.a(null, false, ButtonSize.S, slsVar2, wwg.S(-1186686351, true, new or9(17, charSequence), btsVar), btsVar, ((i3 << 6) & 7168) | 24960, 3);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pr9(charSequence, slsVar2, i, i2);
        }
    }

    public static jz50 f(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException unused) {
                hgz g = hgz.g();
                int i2 = jz50.b;
                int i3 = jz50.b;
                g.getClass();
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = nm91.a[i4];
            if (!j73.w(i5, iArr)) {
                try {
                    builder.removeCapability(i5);
                } catch (IllegalArgumentException unused2) {
                    hgz g2 = hgz.g();
                    int i6 = jz50.b;
                    int i7 = jz50.b;
                    g2.getClass();
                }
            }
        }
        for (int i8 : iArr2) {
            builder.addTransportType(i8);
        }
        return new jz50(builder.build());
    }

    public static final TariffOrderFlow g(String str) {
        TariffOrderFlow.Companion.getClass();
        return ijx0.a(str);
    }

    public static synchronized k h() {
        k kVar;
        synchronized (ksb1.class) {
            bqb1 bqb1Var = new bqb1();
            bqb1Var.a = "subject-segmentation";
            bqb1Var.b = true;
            byte b = (byte) (bqb1Var.d | 1);
            bqb1Var.c = 1;
            bqb1Var.d = (byte) (b | 2);
            gqb1 a2 = bqb1Var.a();
            synchronized (ksb1.class) {
                try {
                    if (a == null) {
                        a = new j1b1(3);
                    }
                    kVar = (k) a.b(a2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return kVar;
        }
        return kVar;
    }
}
