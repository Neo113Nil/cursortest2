package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class fi91 {
    public static final void a(boolean z, w7b0 w7b0Var, sls slsVar, tls tlsVar, boolean z2, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        f530 f530Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-349977776);
        int i2 = i | (btsVar2.a(z) ? 4 : 2) | (btsVar2.k(w7b0Var) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024) | (btsVar2.a(z2) ? 16384 : 8192) | (btsVar2.k(f530Var) ? 131072 : 65536);
        if (btsVar2.V(i2 & 1, (74899 & i2) != 74898)) {
            byk0 c = cyk0.c(20.0f);
            AppColor$Palette appColor$Palette = z2 ? AppColor$Palette.Background : AppColor$Palette.BgMinor;
            c530 c530Var = c530.a;
            if (z2) {
                btsVar2.e0(1993052290);
                f530Var2 = aab1.a(2.0f, tje.n(AppColor$Palette.Control, btsVar2), c530Var, c);
                btsVar2.t(false);
            } else {
                btsVar2.e0(1993135680);
                btsVar2.t(false);
                f530Var2 = c530Var;
            }
            f530 k = ymb1.l(f530Var, c).k(f530Var2);
            boolean z3 = (57344 & i2) == 16384;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z3 || Q == o430Var) {
                Q = new yce(z2, 20);
                btsVar2.o0(Q);
            }
            f530 b = fnq0.b(k, false, (tls) Q);
            if (z2) {
                btsVar2.e0(1993438612);
                btsVar2.t(false);
                f530Var3 = c530Var;
            } else {
                btsVar2.e0(1993331786);
                boolean z4 = !z;
                boolean z5 = (i2 & 896) == 256;
                Object Q2 = btsVar2.Q();
                if (z5 || Q2 == o430Var) {
                    Q2 = new zvr(18, slsVar);
                    btsVar2.o0(Q2);
                }
                f530Var3 = q791.d(c530Var, z4, null, null, (sls) Q2, 14);
                btsVar2.t(false);
            }
            f530 l = an91.l(bzk0.c(ljs0.c(b.k(f530Var3), 1.0f), appColor$Palette, qke.q), 16.0f, 10.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, l);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
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
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            jeb1.f(w7b0Var.b, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.a, btsVar2, 384, 0, 16378);
            hk2 hk2Var = new hk2(0);
            hk2Var.d(w7b0Var.c);
            n6b1.a(hk2Var, "info_icon_inline_content", "�");
            jeb1.d(hk2Var.i(), null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, false, 0, 0, gw00.e(new Pair("info_icon_inline_content", new oxv(new r3c0(7, uh6.x(2), uh6.x(1)), wwg.S(-1405241866, true, new y740(tlsVar, 10, w7b0Var), btsVar2)))), null, xya1.e(btsVar2).h.a, btsVar2, 384, 0, 24570);
            btsVar = btsVar2;
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            b(w7b0Var, null, btsVar, (i2 >> 3) & 14);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qwa(z, w7b0Var, slsVar, tlsVar, z2, f530Var, i);
        }
    }

    public static final void b(w7b0 w7b0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1758209373);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(w7b0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            x2y d2 = n.d(btsVar, d, wlsVar4, 1.0f, false);
            z910 d3 = pi6.d(x4c.x, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, d2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            c(w7b0Var.d, 0, btsVar);
            v0b1.a(mja1.a(w7b0Var.f, null, 6), ljs0.n(c530Var, 40.0f, 28.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1020);
            btsVar.t(true);
            v0b1.a(mja1.a(w7b0Var.g, null, 6), ljs0.m(an91.o(c530Var, 0.0f, 2.0f, 0.0f, 6.0f, 5), 36.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(w7b0Var, f530Var2, i, 5);
        }
    }

    public static final void c(int i, int i2, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-146171081);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2;
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 32.0f, 0.0f, 12.0f, 0.0f, 10);
            lhl0 a = khl0.a(lr20.g, x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            byk0 c = cyk0.c(40.0f);
            btsVar.e0(721793673);
            for (int i5 = 0; i5 < i; i5++) {
                pi6.a(bzk0.c(ljs0.e(ljs0.c(ymb1.l(an91.m(c530Var, 2.0f, 0.0f, 2), c), 1.0f).k(new x2y(1.0f, true)), 4.0f), AppColor$Palette.Line, qke.q), btsVar, 0);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jj20(i, i2, i4);
        }
    }

    public static final float d(float f, float f2, long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float intBitsToFloat2 = f - Float.intBitsToFloat(i);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float[] fArr = {intBitsToFloat2, Float.intBitsToFloat(i2), f2 - Float.intBitsToFloat(i2)};
        for (int i3 = 0; i3 < 3; i3++) {
            intBitsToFloat = Math.min(intBitsToFloat, fArr[i3]);
        }
        return Math.max(intBitsToFloat, 0.0f);
    }

    public static final f530 e(f530 f530Var, tls tlsVar) {
        return f530Var.k(new sur(new tur(tlsVar)));
    }

    public static final void f(View view, int i, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        shapeDrawable.setTint(i);
        view.setBackground(shapeDrawable);
    }
}
