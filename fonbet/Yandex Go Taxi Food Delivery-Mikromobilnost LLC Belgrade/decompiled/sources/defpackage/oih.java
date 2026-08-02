package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.radio.RadioSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class oih {
    public static final oih a = new oih();

    public final void a(boolean z, f530 f530Var, RadioSize radioSize, tls tlsVar, boolean z2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        boolean z3;
        f530 b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1745786814);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar2.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.c(radioSize.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.a(z2) ? 16384 : 8192;
        }
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            c530 c530Var = c530.a;
            if (tlsVar == null) {
                btsVar2.e0(-975780630);
                btsVar2.t(false);
                z3 = z2;
                b = null;
            } else {
                btsVar2.e0(-975780629);
                awk0 awk0Var = new awk0(3);
                int i4 = i2 & 14;
                boolean k = btsVar2.k(tlsVar) | (i4 == 4);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    Q = new nih(tlsVar, z, 0);
                    btsVar2.o0(Q);
                }
                z3 = z2;
                f530 d = q791.d(c530Var, z3, null, awk0Var, (sls) Q, 10);
                boolean z4 = i4 == 4;
                Object Q2 = btsVar2.Q();
                if (z4 || Q2 == o430Var) {
                    Q2 = new yce(z, i3);
                    btsVar2.o0(Q2);
                }
                b = fnq0.b(d, false, (tls) Q2);
                btsVar2.t(false);
            }
            if (b == null) {
                b = c530Var;
            }
            f530 k2 = r6b1.b(bzk0.c(q6a1.c(ymb1.l(ljs0.i(f530Var, radioSize.getControlSize()), cyk0.a), z3), z ? AppColor$Palette.Control : AppColor$Palette.ControlMinor, qke.q), !z && z3, r6b1.c(btsVar2), 0.0f, 28).k(b);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, k2);
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
            qje.W(btsVar2, d.f, d2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d3);
            if (z) {
                btsVar2.e0(640510695);
                btsVar = btsVar2;
                sya1.a(wkb1.i(), cj6.a.a(ljs0.i(c530Var, radioSize.getIconSize()), x4c.y), null, AppColor$Palette.TextOnControl, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                btsVar.e0(640721402);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rz9(this, z, f530Var, radioSize, tlsVar, z2, i);
        }
    }
}
