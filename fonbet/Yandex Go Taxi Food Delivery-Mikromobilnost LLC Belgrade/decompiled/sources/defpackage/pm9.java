package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.n;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class pm9 {
    public static final long a;
    public static final float b;

    static {
        long o = cl91.o(85.0f, 55.0f);
        a = o;
        b = c8m.a(o) + 12.0f;
    }

    public static final void a(f530 f530Var, CharSequence charSequence, String str, long j, String str2, SlotSize slotSize, fid fidVar, int i) {
        int i2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1542419174);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.d(j) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(str2) ? 16384 : 8192;
        }
        int i3 = i2 | ImageMetadata.EDGE_MODE;
        if ((1572864 & i) == 0) {
            i3 |= btsVar.c(slotSize.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= btsVar.b(24.0f) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        int i4 = i3;
        if (btsVar.V(i4 & 1, (i4 & 4793491) != 4793490)) {
            f530 o = an91.o(m4m0.b(ljs0.e(ljs0.c(f530Var, 1.0f), b), j, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 16.0f, 0.0f, 14.0f, 0.0f, 10);
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, o);
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            long j2 = a;
            float b2 = c8m.b(j2);
            float a2 = c8m.a(j2);
            c530 c530Var = c530.a;
            f530 f = sm91.f(ljs0.n(c530Var, b2, a2), 0.0f, -6.0f, 1);
            uo5 uo5Var2 = x4c.w;
            cj6 cj6Var = cj6.a;
            f530 a3 = cj6Var.a(f, uo5Var2);
            f530 o3 = an91.o(cj6Var.a(ljs0.c(ljs0.e(c530Var, slotSize.getSize()), 1.0f), uo5Var), 0.0f, 0.0f, c8m.b(j2) + 8.0f, 0.0f, 11);
            lhl0 a4 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d3 = b.d(btsVar, o3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a4);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            if (str == null) {
                btsVar.e0(-1800333612);
                z = false;
                btsVar.t(false);
                z2 = true;
            } else {
                z = false;
                btsVar.e0(-1800333611);
                z2 = true;
                v0b1.a(mja1.a(str, null, 6), ljs0.m(c530Var, 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
                btsVar = btsVar;
                nnm.s(c530Var, 16.0f, btsVar, false);
            }
            boolean z4 = z2;
            bts btsVar2 = btsVar;
            str3 = str2;
            qgy.b(charSequence, null, null, AppColor$Palette.TextInvert, 0L, 0L, null, 0L, 2, 2, 0, xya1.e(btsVar).g.a, null, btsVar2, ((i4 >> 3) & 14) | 805309440, 6, 10742);
            btsVar = btsVar2;
            btsVar.t(z4);
            ((Boolean) btsVar.m(n.a)).getClass();
            btsVar.e0(1437108197);
            if (str3 == null) {
                btsVar.e0(1437108196);
                z3 = false;
                btsVar.t(false);
            } else {
                btsVar.e0(1437108197);
                v0b1.a(mja1.a(str3, null, 6), a3, null, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1020);
                z3 = false;
                btsVar.t(false);
            }
            btsVar.t(z3);
            btsVar.t(z4);
        } else {
            str3 = str2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new om9(f530Var, charSequence, str, j, str3, slotSize, i);
        }
    }
}
