package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.nestedscroll.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;

/* loaded from: classes5.dex */
public final class gt0 implements wni {
    public final y30 a;
    public final e b;
    public final hwy0 c;
    public final dci w;
    public final tgg x;
    public final wt0 y;
    public final oy60 z;

    public gt0(y30 y30Var, e eVar, hwy0 hwy0Var, dci dciVar, tgg tggVar, wt0 wt0Var, oy60 oy60Var) {
        this.a = y30Var;
        this.b = eVar;
        this.c = hwy0Var;
        this.w = dciVar;
        this.x = tggVar;
        this.y = wt0Var;
        this.z = oy60Var;
    }

    public final void a(vs0 vs0Var, qkg qkgVar, j17 j17Var, qkg qkgVar2, y7m y7mVar, ldc ldcVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(687989190);
        int i2 = i | (btsVar.a(false) ? 4 : 2) | (btsVar.k(vs0Var) ? 32 : 16) | (btsVar.k(qkgVar) ? 256 : 128) | (btsVar.k(j17Var) ? 2048 : 1024) | (btsVar.k(qkgVar2) ? 16384 : 8192) | (btsVar.k(y7mVar) ? 131072 : 65536) | (btsVar.k(ldcVar) ? 1048576 : 524288) | (btsVar.e(this) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar.V(i2 & 1, (i2 & 4793491) != 4793490)) {
            oip0 o = pw91.o(btsVar);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (yx40) Q;
            f530 a = b.a(c530.a, zrb1.f(btsVar), null);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
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
            qje.W(btsVar, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            int i3 = i2 >> 3;
            c(qkgVar, vs0Var, oz40Var, o, y7mVar, ldcVar, btsVar, 3078 | (i3 & 112) | ((i2 << 3) & 896) | (i2 & ImageMetadata.JPEG_GPS_COORDINATES) | (i2 & 3670016) | (i2 & 29360128));
            b(qkgVar2, j17Var, oz40Var, o, btsVar, 3078 | ((i2 >> 9) & 112) | (i3 & 896) | ((i2 >> 6) & ImageMetadata.JPEG_GPS_COORDINATES));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new et0(this, vs0Var, qkgVar, j17Var, qkgVar2, y7mVar, ldcVar, i);
        }
    }

    public final void b(qkg qkgVar, j17 j17Var, oz40 oz40Var, oip0 oip0Var, fid fidVar, int i) {
        int i2;
        oip0 oip0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1753271240);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(qkgVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(j17Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(oz40Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            oip0Var2 = oip0Var;
            i2 |= btsVar.k(oip0Var2) ? 16384 : 8192;
        } else {
            oip0Var2 = oip0Var;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(this) ? 131072 : 65536;
        }
        int i4 = 1;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            f530 u = ljs0.u(ljs0.c(c530.a, 1.0f), null, 3);
            boolean z = (i2 & 7168) == 2048;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new w5(i4, oz40Var);
                btsVar.o0(Q);
            }
            lbb1.b(cj6Var.a(eja1.y(u, (tls) Q), x4c.B), oip0Var2.b(), 0.0f, 0.0f, null, null, wwg.S(1056089101, true, new xx8(5, this, qkgVar, j17Var), btsVar), btsVar, 1572864, 60);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(this, qkgVar, j17Var, oz40Var, oip0Var, i, 3);
        }
    }

    public final void c(qkg qkgVar, vs0 vs0Var, oz40 oz40Var, oip0 oip0Var, y7m y7mVar, ldc ldcVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        boolean z;
        long j;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(55036944);
        if ((i & 48) == 0) {
            i2 = (btsVar2.k(qkgVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(vs0Var) ? 256 : 128;
        }
        int i3 = i2 | (btsVar2.k(oip0Var) ? 16384 : 8192) | (btsVar2.k(y7mVar) ? 131072 : 65536) | (btsVar2.k(ldcVar) ? 1048576 : 524288) | (btsVar2.e(this) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar2.V(i3 & 1, (4793491 & i3) != 4793490)) {
            oz40 b = rhd.b(btsVar2);
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            c530 c530Var = c530.a;
            f530 u = pw91.u(an91.o(cj6.a.a(ljs0.c(c530Var, 1.0f), x4c.c), 0.0f, 0.0f, 0.0f, ((Boolean) b.getValue()).booleanValue() ? fwiVar.H(((Number) oz40Var.getValue()).intValue()) : 0.0f, 7), oip0Var, 14);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, u);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            if (vs0Var == null) {
                btsVar2.e0(-1678363511);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1678363510);
                boolean e = btsVar2.e(this);
                Object Q = btsVar2.Q();
                if (e || Q == did.a) {
                    Q = new d4(18, this);
                    btsVar2.o0(Q);
                }
                ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.header.d.b(vs0Var, (sls) Q, btsVar2, (i3 >> 6) & 14);
                btsVar2.t(false);
            }
            float f = y7mVar != null ? y7mVar.a : 2.0f;
            if (ldcVar == null) {
                btsVar2.e0(-1716696466);
                j = ((el51) btsVar2.m(gl51.a)).i();
                z = false;
                btsVar2.t(false);
            } else {
                z = false;
                btsVar2.e0(-1716697551);
                btsVar2.t(false);
                j = ldcVar.a;
            }
            this.x.a(qkgVar, null, f, j, true, true, null, btsVar2, ((i3 >> 3) & 14) | 16998400, 66);
            btsVar = btsVar2;
            if (((Boolean) b.getValue()).booleanValue()) {
                btsVar.e0(-1677551620);
                btsVar.t(false);
            } else {
                btsVar.e0(-1677826466);
                pi6.a(m4m0.b(ljs0.c(ljs0.e(c530Var, fwiVar.H(((Number) oz40Var.getValue()).intValue())), 1.0f), ((el51) btsVar.m(gl51.a)).c(), qke.q), btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ft0(this, qkgVar, vs0Var, oz40Var, oip0Var, y7mVar, ldcVar, i, 0);
        }
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a.a(), null, 0, 6, null);
        composeView.setContent(new a(-1035946676, new dt0(this, (es0) uniVar, 0), true));
        return composeView;
    }
}
