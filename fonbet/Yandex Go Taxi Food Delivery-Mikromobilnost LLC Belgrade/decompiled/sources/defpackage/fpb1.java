package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class fpb1 {
    public static final void a(f530 f530Var, final int i, final long j, long j2, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-538980712);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.c(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.d(j) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.d(j2) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.b(4.0f) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            f530 e = ljs0.e(ljs0.c(f530Var, 1.0f), 4.0f);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new f0z0(3);
                btsVar.o0(Q);
            }
            f530 b = m4m0.b(d.a(e, (tls) Q), j2, qke.q);
            boolean z = ((i3 & 112) == 32) | ((57344 & i3) == 16384) | ((i3 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new tls() { // from class: e2z0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i4;
                        int i5;
                        char c;
                        float f;
                        int i6;
                        float f2;
                        long j3;
                        long j4;
                        float f3;
                        qam qamVar = (qam) obj;
                        long c2 = qamVar.c();
                        char c3 = HexString.CHAR_SPACE;
                        float intBitsToFloat = Float.intBitsToFloat((int) (c2 >> 32));
                        float f4 = 4.0f;
                        float f5 = 2.0f;
                        float w0 = qamVar.w0(4.0f) / 2.0f;
                        int i7 = i;
                        int i8 = i7 - 1;
                        float w02 = (intBitsToFloat - (qamVar.w0(4.0f) * i7)) / i8;
                        int i9 = 0;
                        while (i9 < i7) {
                            float w03 = ((qamVar.w0(f4) + w02) * i9) + w0;
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / f5;
                            if (i9 == 0) {
                                int i10 = i7;
                                int i11 = i9;
                                long j5 = ldc.l;
                                c = c3;
                                float f6 = intBitsToFloat;
                                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                float w04 = qamVar.w0(f5);
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                i5 = i8;
                                i4 = i10;
                                qam.t0(qamVar, j5, floatToRawIntBits, (Float.floatToRawIntBits(w04) << c) | (Float.floatToRawIntBits(intBitsToFloat3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 56);
                                jb2 a = nb2.a();
                                a.m(w03, 0.0f);
                                a.l(f6, 0.0f);
                                a.l(f6, Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                a.l(w03, Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                a.g();
                                nfh N = qamVar.N();
                                long v = N.v();
                                N.q().save();
                                try {
                                    ((cot) N.a).e(a);
                                    f = f6;
                                    qamVar = qamVar;
                                    f3 = w0;
                                    i6 = i11;
                                    j4 = v;
                                } catch (Throwable th) {
                                    th = th;
                                    j4 = v;
                                }
                                try {
                                    qam.z(qamVar, j5, f3, (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w03) << c), 0.0f, null, 0, 56);
                                    b64.C(N, j4);
                                    f2 = f3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    b64.C(N, j4);
                                    throw th;
                                }
                            } else {
                                i4 = i7;
                                i5 = i8;
                                c = c3;
                                f = intBitsToFloat;
                                float f7 = w0;
                                i6 = i9;
                                if (i6 == i5) {
                                    long j6 = ldc.l;
                                    long floatToRawIntBits2 = (Float.floatToRawIntBits(w03) << c) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                    float w05 = qamVar.w0(2.0f);
                                    float intBitsToFloat4 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                    qam.t0(qamVar, j6, floatToRawIntBits2, (Float.floatToRawIntBits(intBitsToFloat4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w05) << c), 0.0f, null, 56);
                                    jb2 a2 = nb2.a();
                                    a2.m(0.0f, 0.0f);
                                    a2.l(w03, 0.0f);
                                    a2.l(w03, Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                    a2.l(0.0f, Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                    a2.g();
                                    nfh N2 = qamVar.N();
                                    long v2 = N2.v();
                                    N2.q().save();
                                    try {
                                        ((cot) N2.a).e(a2);
                                        j3 = v2;
                                        f2 = f7;
                                        try {
                                            qam.z(qamVar, j6, f2, (Float.floatToRawIntBits(w03) << c) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 56);
                                            b64.C(N2, j3);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            b64.C(N2, j3);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        j3 = v2;
                                    }
                                } else {
                                    f2 = f7;
                                    qam.z(qamVar, j, f2, (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w03) << c), 0.0f, null, 0, 120);
                                }
                            }
                            i9 = i6 + 1;
                            w0 = f2;
                            i8 = i5;
                            c3 = c;
                            intBitsToFloat = f;
                            i7 = i4;
                            f4 = 4.0f;
                            f5 = 2.0f;
                        }
                        return zy11.a;
                    }
                };
                btsVar.o0(Q2);
            }
            qeb1.a(0, btsVar, (tls) Q2, b);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new is9(i, i2, j, j2, f530Var);
        }
    }

    public static final void b(r740 r740Var, fid fidVar, int i) {
        int i2;
        long f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1406761800);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(r740Var) : btsVar.e(r740Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            b411 b411Var = r740Var.a;
            sy2.a(btsVar);
            int i4 = y640.a[srt.a(btsVar).ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    w511.b();
                    return;
                }
                f = rzo.f(4231213874L);
            } else if (jl40.l(b411Var, a411.a)) {
                f = rzo.f(4209962734L);
            } else if (jl40.l(b411Var, y311.a)) {
                f = rzo.f(4126076654L);
            } else {
                if (!jl40.l(b411Var, z311.a)) {
                    w511.b();
                    return;
                }
                f = rzo.f(4209962734L);
            }
            gpb1.c(an91.o(c530.a, 0.0f, 40.0f, 0.0f, 0.0f, 13), false, 0.0f, wwg.S(743147944, true, new q07(f, r740Var, i3), btsVar), null, btsVar, 3078, 22);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(r740Var, i, 25);
        }
    }

    public static final void c(r740 r740Var, fid fidVar, int i) {
        boolean z;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-667996946);
        int i2 = i | (btsVar.e(r740Var) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var2 = c530.a;
            f530 m = an91.m(ljs0.c(c530Var2, 1.0f), 32.0f, 0.0f, 2);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            ovi0 ovi0Var = r740Var.b;
            if (ovi0Var == null) {
                btsVar.e0(-72092395);
                btsVar.t(false);
                c530Var = c530Var2;
                z = false;
            } else {
                btsVar.e0(-72092394);
                z = false;
                c530Var = c530Var2;
                v0b1.a(ovi0Var, ljs0.m(c530Var2, 32.0f), null, null, null, new jfv(AppColor$Palette.TextMinor), null, null, 0.0f, 0, btsVar, 48, 988);
                ly3.B(c530Var, 12.0f, btsVar, false);
            }
            String str = r740Var.c;
            if (str == null) {
                btsVar.e0(-71888260);
                btsVar.t(z);
            } else {
                btsVar.e0(-71888259);
                jeb1.f(str, ljs0.c(c530Var, 1.0f), AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 2, false, 2, 0, null, xya1.d(btsVar).g.b, btsVar, 805306800, 48, 13688);
                btsVar = btsVar;
                btsVar.t(z);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sc20(r740Var, i, 11);
        }
    }

    public static final void d(final float f, final int i, long j, long j2, fid fidVar, final f530 f530Var) {
        final long j3;
        final long j4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2109856643);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.b(f) ? 32 : 16) | (btsVar.d(j) ? 256 : 128) | (btsVar.d(j2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = f.d(new btr0(fwiVar, f, 2));
                btsVar.o0(Q);
            }
            a(f530Var, ((Number) ((m3u0) Q).getValue()).intValue(), j2, j, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | ((i2 >> 3) & 896) | ((i2 << 3) & 7168));
            j3 = j2;
            j4 = j;
        } else {
            j3 = j2;
            j4 = j;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f, i, j4, j3, f530Var) { // from class: d2z0
                public final /* synthetic */ f530 a;
                public final /* synthetic */ float b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long w;

                {
                    this.a = f530Var;
                    this.c = j4;
                    this.w = j3;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    fpb1.d(this.b, O, this.c, this.w, (fid) obj, this.a);
                    return zy11.a;
                }
            };
        }
    }

    public static final void e(yfd yfdVar, sls slsVar) {
        ((agd) yfdVar).f = slsVar != null ? new ne4(slsVar) : xpb1.y;
    }
}
