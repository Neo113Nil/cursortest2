package defpackage;

import androidx.compose.animation.m;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ijb1 {
    public static final void a(int i, int i2, CharSequence charSequence, f530 f530Var, fid fidVar, int i3) {
        to5 to5Var = x4c.D;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1082324719);
        dmw0 dmw0Var = btsVar.a;
        int i4 = i3 | (btsVar.c(i) ? 4 : 2) | (btsVar.c(i2) ? 32 : 16) | (btsVar.k(charSequence) ? 256 : 128);
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            i43 i43Var = new i43(4.0f, true, new quz(11));
            f530 k = an91.k(f530Var, 16.0f);
            sic a = qic.a(i43Var, x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, wlsVar4, d);
            i43 i43Var2 = new i43(4.0f, true, new quz(11));
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a2 = khl0.a(i43Var2, to5Var, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            btsVar.i0();
            c530 c530Var2 = c530Var;
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(274838695);
            int i5 = 0;
            while (i5 < i) {
                c530 c530Var3 = c530Var2;
                pi6.a(bzk0.c(ljs0.e(c530Var3, 4.0f).k(new x2y(1.0f, true)), i5 < i2 ? new up2(eq2.a) : AppColor$Palette.Line, cyk0.c(4.0f)), btsVar, 0);
                i5++;
                c530Var2 = c530Var3;
            }
            btsVar.t(false);
            btsVar.t(true);
            i43 i43Var3 = new i43(8.0f, true, new quz(11));
            f530 c2 = ljs0.c(c530Var2, 1.0f);
            lhl0 a3 = khl0.a(i43Var3, to5Var, btsVar, 6);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, c2);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o3);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode3));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            ety0 ety0Var = xya1.e(btsVar).h.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            qgy.b(charSequence, null, new x2y(1.0f, true), appColor$Palette, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, null, btsVar, ((i4 >> 6) & 14) | HProv.ALG_TYPE_SECURECHANNEL, 0, 12274);
            jeb1.f(ohb1.d(kyh0.chargers_discount_details_progress, new Object[]{Integer.valueOf(i - i2), Integer.valueOf(i)}, btsVar), null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 384, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i, i2, charSequence, f530Var, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006d  */
    /* JADX WARN: Type inference failed for: r5v25, types: [f530] */
    /* JADX WARN: Type inference failed for: r7v1, types: [bts, fid] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z, f530 f530Var, szw0 szw0Var, wp2 wp2Var, wp2 wp2Var2, tls tlsVar, boolean z2, fid fidVar, int i, int i2) {
        szw0 szw0Var2;
        int i3;
        tls tlsVar2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        wp2 wp2Var3;
        tls tlsVar3;
        szw0 szw0Var3;
        bts btsVar;
        boolean z4;
        wp2 wp2Var4;
        aii0 v;
        final szw0 szw0Var4;
        ?? r7 = (bts) fidVar;
        r7.g0(2105022031);
        int i7 = i | (r7.a(z) ? 4 : 2);
        if ((i & 48) == 0) {
            i7 |= r7.k(f530Var) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i7 | 384;
            szw0Var2 = szw0Var;
        } else {
            szw0Var2 = szw0Var;
            i3 = i7 | (r7.k(szw0Var2) ? 256 : 128);
        }
        int i9 = i3 | 27648;
        int i10 = i2 & 32;
        if (i10 != 0) {
            i9 = 224256 | i3;
        } else if ((i & ImageMetadata.EDGE_MODE) == 0) {
            tlsVar2 = tlsVar;
            i9 |= r7.e(tlsVar2) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i5 = i9 | 1572864;
                z3 = z2;
            } else {
                z3 = z2;
                i5 = i9 | (r7.a(z3) ? 1048576 : 524288);
            }
            i6 = i5;
            int i11 = 0;
            if (r7.V(i6 & 1, (599187 & i6) == 599186)) {
                r7.Y();
                wp2Var3 = wp2Var2;
                tlsVar3 = tlsVar2;
                szw0Var3 = szw0Var2;
                btsVar = r7;
                z4 = z3;
                wp2Var4 = wp2Var;
            } else {
                szw0 szw0Var5 = i8 != 0 ? szw0.d : szw0Var2;
                AppColor$Palette appColor$Palette = AppColor$Palette.Control;
                AppColor$Palette appColor$Palette2 = AppColor$Palette.ControlMinor;
                if (i10 != 0) {
                    tlsVar2 = null;
                }
                final boolean z5 = i4 != 0 ? true : z3;
                final igr0 a = dbb1.a(r7);
                final eb2 h = hbb1.h(a, r7);
                final long n = tje.n(AppColor$Palette.EverFront, r7);
                c530 c530Var = null;
                final m3u0 b = androidx.compose.animation.core.b.b(z ? 1.0f : 0.0f, sb2.K(0, 0, null, 7), "Switch Position Animation", null, r7, 3120, 20);
                final m3u0 a2 = m.a(tje.n(z ? appColor$Palette : appColor$Palette2, r7), sb2.K(0, 0, null, 7), "Switch Color Animation", r7, 432, 8);
                c530 c530Var2 = c530.a;
                Object obj = did.a;
                if (tlsVar2 == null) {
                    r7.e0(-105325258);
                    r7.t(false);
                } else {
                    r7.e0(-105325257);
                    isk0 a3 = fsk0.a(6, false);
                    awk0 awk0Var = new awk0(2);
                    int i12 = i6 & 14;
                    boolean k = r7.k(tlsVar2) | (i12 == 4);
                    Object Q = r7.Q();
                    if (k || Q == obj) {
                        Q = new nih(tlsVar2, z, 4);
                        r7.o0(Q);
                    }
                    boolean z6 = z5;
                    f530 b2 = q791.b(c530Var2, null, a3, z6, null, awk0Var, (sls) Q, 8);
                    z5 = z6;
                    boolean z7 = i12 == 4;
                    Object Q2 = r7.Q();
                    if (z7 || Q2 == obj) {
                        Q2 = new dzw0(z, i11);
                        r7.o0(Q2);
                    }
                    ?? b3 = fnq0.b(b2, false, (tls) Q2);
                    r7.t(false);
                    c530Var = b3;
                }
                if (c530Var == null) {
                    c530Var = c530Var2;
                }
                f530 k2 = tra1.b(ljs0.j(f530Var, szw0Var5.a, szw0Var5.b), z5 ? 1.0f : 0.5f).k(c530Var);
                boolean k3 = r7.k(b) | ((i6 & 896) == 256) | r7.k(a2) | ((3670016 & i6) == 1048576) | r7.k(a) | r7.e(h) | r7.d(n);
                Object Q3 = r7.Q();
                if (k3 || Q3 == obj) {
                    szw0Var4 = szw0Var5;
                    Q3 = new tls() { // from class: fzw0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            qam qamVar = (qam) obj2;
                            float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
                            float f = intBitsToFloat * 2.0f;
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() >> 32)) - f;
                            m3u0 m3u0Var = b;
                            long floatToRawIntBits = (Float.floatToRawIntBits((((Number) m3u0Var.getValue()).floatValue() * intBitsToFloat2) + intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            float f2 = szw0.this.c;
                            float w0 = qamVar.w0(f2) / 2.0f;
                            qam.g0(qamVar, ((ldc) a2.getValue()).a, 0L, 0L, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, 246);
                            if (z5) {
                                i28 q = qamVar.N().q();
                                float w02 = qamVar.w0(0.0f);
                                float w03 = qamVar.w0(a.c);
                                q.t(w0, wu60.f(floatToRawIntBits, (Float.floatToRawIntBits(w03) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w02) << 32)), h);
                            }
                            qam.z(qamVar, n, qamVar.w0(f2) / 2.0f, (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits((((Number) m3u0Var.getValue()).floatValue() * (Float.intBitsToFloat((int) (qamVar.c() >> 32)) - f)) + intBitsToFloat) << 32), 0.0f, null, 0, 120);
                            return zy11.a;
                        }
                    };
                    r7.o0(Q3);
                } else {
                    szw0Var4 = szw0Var5;
                }
                qeb1.a(0, r7, (tls) Q3, k2);
                tlsVar3 = tlsVar2;
                btsVar = r7;
                szw0Var3 = szw0Var4;
                z4 = z5;
                wp2Var4 = appColor$Palette;
                wp2Var3 = appColor$Palette2;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new up5(z, f530Var, szw0Var3, wp2Var4, wp2Var3, tlsVar3, z4, i, i2);
                return;
            }
            return;
        }
        tlsVar2 = tlsVar;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i6 = i5;
        int i112 = 0;
        if (r7.V(i6 & 1, (599187 & i6) == 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static float c(float f, float f2, float f3, float f4, float f5) {
        return d(f, f2, Math.max(0.0f, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static float d(float f, float f2, float f3) {
        return g8e.b(f2, f, f3, f);
    }
}
