package defpackage;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$State;
import com.yx360.design.compose.atoms.DsButton$Style;
import java.io.ByteArrayInputStream;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.domesticroots.certificatetransparency.internal.exceptions.SerializationException;
import ru.domesticroots.certificatetransparency.internal.verifier.model.DigitallySigned$HashAlgorithm;
import ru.domesticroots.certificatetransparency.internal.verifier.model.DigitallySigned$SignatureAlgorithm;
import ru.domesticroots.certificatetransparency.internal.verifier.model.Version;

/* loaded from: classes4.dex */
public abstract class mo91 {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    /* JADX WARN: Removed duplicated region for block: B:116:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(kk2 kk2Var, DsButton$State dsButton$State, DsButton$Size dsButton$Size, x3 x3Var, x3 x3Var2, String str, long j, long j2, long j3, long j4, boolean z, fid fidVar, int i, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        float f;
        float f2;
        float f3;
        bts btsVar;
        c530 c530Var;
        boolean z3;
        boolean z4;
        x3 x3Var3;
        DsButton$State dsButton$State2;
        bts btsVar2;
        boolean z5;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(117895911);
        if ((i & 6) == 0) {
            i4 = (btsVar3.k(kk2Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= btsVar3.c(dsButton$State.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= btsVar3.c(dsButton$Size.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar3.e(x3Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar3.e(x3Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= btsVar3.k(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= btsVar3.d(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= btsVar3.d(j2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i4 |= btsVar3.d(j3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i) == 0) {
            i4 |= btsVar3.d(j4) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i6 = i3 & 1024;
        if (i6 != 0) {
            z2 = z;
            i5 = i2 | 6;
        } else {
            z2 = z;
            if ((i2 & 6) == 0) {
                i5 = i2 | (btsVar3.a(z2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && btsVar3.E()) {
            btsVar3.Y();
            dsButton$State2 = dsButton$State;
            x3Var3 = x3Var2;
            z5 = z2;
            btsVar2 = btsVar3;
        } else {
            boolean z6 = i6 != 0 ? true : z2;
            btsVar3.e0(5004770);
            int i7 = i4 & 896;
            boolean z7 = i7 == 256;
            Object Q = btsVar3.Q();
            o430 o430Var = did.a;
            if (z7 || Q == o430Var) {
                int i8 = lpm.b[dsButton$Size.ordinal()];
                if (i8 == 1) {
                    qnm.d.getClass();
                } else if (i8 == 2) {
                    qnm.d.getClass();
                } else if (i8 != 3) {
                    w511.b();
                    return;
                } else {
                    qnm.d.getClass();
                    f = 4.0f;
                    Q = ly3.h(f, btsVar3);
                }
                f = 8.0f;
                Q = ly3.h(f, btsVar3);
            }
            float f4 = ((y7m) Q).a;
            btsVar3.t(false);
            btsVar3.e0(5004770);
            boolean z8 = i7 == 256;
            Object Q2 = btsVar3.Q();
            float f5 = 16.0f;
            if (z8 || Q2 == o430Var) {
                int i9 = lpm.b[dsButton$Size.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        qnm.d.getClass();
                    } else {
                        if (i9 != 3) {
                            w511.b();
                            return;
                        }
                        qnm.d.getClass();
                    }
                    f2 = 16.0f;
                } else {
                    qnm.d.getClass();
                    f2 = 24.0f;
                }
                Q2 = ly3.h(f2, btsVar3);
            }
            float f6 = ((y7m) Q2).a;
            btsVar3.t(false);
            to5 to5Var = x4c.E;
            i43 i43Var = new i43(f4, true, new quz(11));
            if (z6) {
                int i10 = lpm.b[dsButton$Size.ordinal()];
                if (i10 == 1) {
                    qnm.c.getClass();
                    f5 = 20.0f;
                } else if (i10 == 2) {
                    qnm.c.getClass();
                } else if (i10 != 3) {
                    w511.b();
                    return;
                } else {
                    qnm.c.getClass();
                    f5 = 12.0f;
                }
            } else {
                f5 = 0.0f;
            }
            float f7 = f5;
            int i11 = lpm.b[dsButton$Size.ordinal()];
            if (i11 == 1) {
                qnm.d.getClass();
            } else if (i11 == 2) {
                qnm.d.getClass();
            } else {
                if (i11 != 3) {
                    w511.b();
                    return;
                }
                qnm.d.getClass();
                f3 = 4.0f;
                c530 c530Var2 = c530.a;
                f530 l = an91.l(c530Var2, f7, f3);
                lhl0 a2 = khl0.a(i43Var, to5Var, btsVar3, 48);
                int hashCode = Long.hashCode(btsVar3.T);
                r1b0 o = btsVar3.o();
                f530 d = b.d(btsVar3, l);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar3.a != null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, d.f, a2);
                qje.W(btsVar3, d.e, o);
                wls wlsVar = d.g;
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar3, hashCode, wlsVar);
                }
                qje.W(btsVar3, d.d, d);
                if (x3Var instanceof zom) {
                    btsVar3.e0(-880091365);
                    z4 = true;
                    c530Var = c530Var2;
                    z3 = false;
                    p4v.b((pa90) ((zom) x3Var).b, null, ljs0.m(c530Var2, f6), dsButton$State == DsButton$State.Disabled ? j : j4, btsVar3, 48, 0);
                    btsVar = btsVar3;
                    btsVar.t(false);
                } else {
                    btsVar = btsVar3;
                    c530Var = c530Var2;
                    z3 = false;
                    z4 = true;
                    if (x3Var instanceof apm) {
                        btsVar.e0(-879704640);
                        o4b1.b((pa90) ((apm) x3Var).b, null, ljs0.m(c530Var, f6), null, null, 0.0f, null, btsVar, 48, 120);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-879529955);
                        btsVar.t(false);
                    }
                }
                c530 c530Var3 = c530Var;
                bts btsVar4 = btsVar;
                boolean z9 = z4;
                x3Var3 = x3Var2;
                dsButton$State2 = dsButton$State;
                xab1.a(null, null, wwg.S(-126424083, z9, new kpm(f4, x3Var2, f6, dsButton$State, j, j2, dsButton$Size, kk2Var, str, j3), btsVar4), btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 7);
                btsVar2 = btsVar4;
                if (x3Var3 instanceof zom) {
                    btsVar2.e0(-877552806);
                    p4v.b((pa90) ((zom) x3Var3).b, null, ljs0.m(c530Var3, f6), dsButton$State2 == DsButton$State.Disabled ? j : j4, btsVar2, 48, 0);
                    btsVar2.t(false);
                } else if (x3Var3 instanceof apm) {
                    btsVar2.e0(-877165089);
                    o4b1.b((pa90) ((apm) x3Var3).b, null, ljs0.m(c530Var3, f6), null, null, 0.0f, null, btsVar2, 48, 120);
                    btsVar2 = btsVar2;
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(-876989443);
                    btsVar2.t(false);
                }
                btsVar2.t(z9);
                z5 = z6;
            }
            f3 = 8.0f;
            c530 c530Var22 = c530.a;
            f530 l2 = an91.l(c530Var22, f7, f3);
            lhl0 a22 = khl0.a(i43Var, to5Var, btsVar3, 48);
            int hashCode2 = Long.hashCode(btsVar3.T);
            r1b0 o2 = btsVar3.o();
            f530 d2 = b.d(btsVar3, l2);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar3.a != null) {
            }
        }
        aii0 v = btsVar2.v();
        if (v != null) {
            v.d = new ipm(kk2Var, dsButton$State2, dsButton$Size, x3Var, x3Var3, str, j, j2, j3, j4, z5, i, i2, i3);
        }
    }

    public static final void b(int i, final long j, fid fidVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1648340528);
        int i2 = i | (btsVar.d(j) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                qnm.c.getClass();
                Q = new y7m(24.0f);
                btsVar.o0(Q);
            }
            final float f = ((y7m) Q).a;
            btsVar.t(false);
            float a2 = idb1.a(f + f, btsVar);
            btsVar.e0(-1772971789);
            boolean z = true;
            final osv d = z5b1.d(z5b1.g(null, btsVar, 1), 0.0f, a2, sb2.w(sb2.K(500, 0, ubn.d, 2), RepeatMode.Restart, 0L, 4), null, btsVar, 4152, 8);
            Object k = g8e.k(1849434622, btsVar, false);
            if (k == obj) {
                k = nb2.a();
                btsVar.o0(k);
            }
            final rq90 rq90Var = (rq90) k;
            btsVar.t(false);
            btsVar.e0(-1224400529);
            boolean k2 = btsVar.k(d) | btsVar.e(rq90Var);
            if ((i2 & 14) != 4) {
                z = false;
            }
            boolean z2 = k2 | z;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == obj) {
                Object obj2 = new tls() { // from class: gpm
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        qam qamVar = (qam) obj3;
                        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        float f2 = f;
                        float w0 = qamVar.w0(f2);
                        float w02 = qamVar.w0(f2) + w0;
                        int i3 = ((int) (intBitsToFloat / w02)) + 2;
                        for (int i4 = -2; i4 < i3; i4++) {
                            float floatValue = ((Number) d.getValue()).floatValue() + (i4 * w02);
                            jb2 jb2Var = (jb2) rq90Var;
                            jb2Var.m(floatValue, intBitsToFloat2);
                            float f3 = floatValue + w0;
                            jb2Var.l(f3, intBitsToFloat2);
                            float f4 = intBitsToFloat2 - intBitsToFloat2;
                            jb2Var.l(f3 + intBitsToFloat2, f4);
                            jb2Var.l(floatValue + intBitsToFloat2, f4);
                            jb2Var.g();
                            qam.Y(qamVar, jb2Var, j, null, 60);
                            jb2Var.o();
                        }
                        return zy11.a;
                    }
                };
                btsVar.o0(obj2);
                Q2 = obj2;
            }
            btsVar.t(false);
            qeb1.a((i2 >> 3) & 14, btsVar, (tls) Q2, f530Var);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hpm(j, f530Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0430 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(kk2 kk2Var, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, DsButton$Size dsButton$Size, x3 x3Var, x3 x3Var2, String str, boolean z, String str2, boolean z2, fid fidVar, int i, int i2) {
        int i3;
        sls slsVar2;
        x3 x3Var3;
        x3 x3Var4;
        String str3;
        int i4;
        DsButton$State dsButton$State;
        long j;
        long i0;
        long j2;
        long j3;
        long j4;
        long j5;
        long V;
        long g0;
        long g02;
        long g03;
        long g04;
        int i5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        int i6;
        float f;
        int i7;
        float f2;
        int i8;
        long j11;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2115133469);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(kk2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            slsVar2 = slsVar;
            i3 |= btsVar.e(slsVar2) ? 32 : 16;
        } else {
            slsVar2 = slsVar;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.c(dsButton$Style.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.c(dsButton$Size == null ? -1 : dsButton$Size.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            x3Var3 = x3Var;
            i3 |= btsVar.e(x3Var3) ? 131072 : 65536;
        } else {
            x3Var3 = x3Var;
        }
        if ((1572864 & i) == 0) {
            x3Var4 = x3Var2;
            i3 |= btsVar.e(x3Var4) ? 1048576 : 524288;
        } else {
            x3Var4 = x3Var2;
        }
        if ((12582912 & i) == 0) {
            str3 = str;
            i3 |= btsVar.k(str3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        } else {
            str3 = str;
        }
        if ((100663296 & i) == 0) {
            i3 |= btsVar.a(z) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i) == 0) {
            i3 |= btsVar.k(str2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (btsVar.a(z2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            qnm qnmVar = qnm.a;
            long F = qnm.c(btsVar).F();
            long a0 = qnm.c(btsVar).a0();
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            int i9 = i3;
            btsVar.t(false);
            qxi a2 = ycb1.a(zx40Var, btsVar);
            boolean z4 = ((r17) a2.getValue()).a;
            btsVar.e0(-1633490746);
            boolean a3 = btsVar.a(z4) | ((i4 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (a3 || Q2 == o430Var) {
                Q2 = !z2 ? DsButton$State.Disabled : ((r17) a2.getValue()).a ? DsButton$State.Pressed : DsButton$State.Default;
                btsVar.o0(Q2);
            }
            DsButton$State dsButton$State2 = (DsButton$State) Q2;
            btsVar.t(false);
            switch (lpm.a[dsButton$Style.ordinal()]) {
                case 1:
                    dsButton$State = dsButton$State2;
                    btsVar.e0(-474801050);
                    j = qnm.b(btsVar).a;
                    long j12 = qnm.b(btsVar).c;
                    i0 = qnm.c(btsVar).i0();
                    j2 = j12;
                    j3 = qnm.b(btsVar).j;
                    j4 = qnm.b(btsVar).j;
                    j5 = qnm.b(btsVar).j;
                    btsVar.t(false);
                    long j13 = j;
                    j9 = j5;
                    g02 = j3;
                    j10 = i0;
                    j6 = a0;
                    j7 = j13;
                    i5 = i9;
                    j8 = j4;
                    float f3 = ((r17) a2.getValue()).b;
                    f530 b = gza1.b(f530Var, f3, f3);
                    int[] iArr = lpm.b;
                    long j14 = g02;
                    i6 = iArr[dsButton$Size.ordinal()];
                    if (i6 != 1) {
                        qnm.c.getClass();
                        f = 56.0f;
                    } else if (i6 == 2) {
                        qnm.c.getClass();
                        f = 40.0f;
                    } else if (i6 != 3) {
                        w511.b();
                        return;
                    } else {
                        qnm.c.getClass();
                        f = 32.0f;
                    }
                    int i10 = i5;
                    f530 g = ljs0.g(b, f, 0.0f, 2);
                    i7 = iArr[dsButton$Size.ordinal()];
                    if (i7 != 1) {
                        qnm.e.getClass();
                        f2 = 16.0f;
                    } else if (i7 == 2) {
                        qnm.e.getClass();
                        f2 = 12.0f;
                    } else if (i7 != 3) {
                        w511.b();
                        return;
                    } else {
                        qnm.e.getClass();
                        f2 = 10.0f;
                    }
                    f530 l = ymb1.l(g, cyk0.c(f2));
                    i8 = lpm.c[dsButton$State.ordinal()];
                    if (i8 != 1) {
                        j11 = F;
                    } else if (i8 == 2) {
                        j11 = j7;
                    } else {
                        if (i8 != 3) {
                            w511.b();
                            return;
                        }
                        j11 = j2;
                    }
                    f530 d = u3a1.d(ycb1.b(q791.b(m4m0.b(l, j11, qke.q), zx40Var, null, (z2 || z) ? false : true, null, new awk0(0), slsVar2, 8), z, str2), "BUTTON");
                    z910 d2 = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d3 = b.d(btsVar, d);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar.a != null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar3);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d2);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d3);
                    int i11 = i10 >> 6;
                    a(kk2Var, dsButton$State, dsButton$Size, x3Var3, x3Var4, str3, j6, j14, j8, j9, false, btsVar, (i10 & 14) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (i11 & ImageMetadata.JPEG_GPS_COORDINATES), 0, 1024);
                    btsVar.e0(-1151416490);
                    if (z) {
                        z3 = false;
                        b(0, ldc.b(j10, 0.12f, 0.0f, 0.0f, 0.0f, 14), btsVar, cj6.a.b(c530.a));
                    } else {
                        z3 = false;
                    }
                    btsVar.t(z3);
                    btsVar.t(true);
                    break;
                    break;
                case 2:
                    dsButton$State = dsButton$State2;
                    btsVar.e0(-474392129);
                    V = qnm.c(btsVar).V();
                    j2 = qnm.c(btsVar).W();
                    g0 = qnm.c(btsVar).g0();
                    g02 = qnm.c(btsVar).g0();
                    g03 = qnm.c(btsVar).g0();
                    g04 = qnm.c(btsVar).g0();
                    btsVar.t(false);
                    i5 = i9;
                    long j15 = g0;
                    j6 = a0;
                    j7 = V;
                    j8 = g03;
                    j9 = g04;
                    j10 = j15;
                    float f32 = ((r17) a2.getValue()).b;
                    f530 b2 = gza1.b(f530Var, f32, f32);
                    int[] iArr2 = lpm.b;
                    long j142 = g02;
                    i6 = iArr2[dsButton$Size.ordinal()];
                    if (i6 != 1) {
                    }
                    int i102 = i5;
                    f530 g2 = ljs0.g(b2, f, 0.0f, 2);
                    i7 = iArr2[dsButton$Size.ordinal()];
                    if (i7 != 1) {
                    }
                    f530 l2 = ymb1.l(g2, cyk0.c(f2));
                    i8 = lpm.c[dsButton$State.ordinal()];
                    if (i8 != 1) {
                    }
                    f530 d4 = u3a1.d(ycb1.b(q791.b(m4m0.b(l2, j11, qke.q), zx40Var, null, (z2 || z) ? false : true, null, new awk0(0), slsVar2, 8), z, str2), "BUTTON");
                    z910 d22 = pi6.d(x4c.y, false);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d32 = b.d(btsVar, d4);
                    ohd.G1.getClass();
                    sls slsVar32 = d.b;
                    if (btsVar.a != null) {
                    }
                    break;
                case 3:
                    dsButton$State = dsButton$State2;
                    btsVar.e0(-474006613);
                    V = qnm.c(btsVar).X();
                    j2 = qnm.c(btsVar).Y();
                    g0 = qnm.c(btsVar).f0();
                    g02 = qnm.c(btsVar).f0();
                    g03 = qnm.c(btsVar).f0();
                    g04 = qnm.c(btsVar).f0();
                    btsVar.t(false);
                    i5 = i9;
                    long j152 = g0;
                    j6 = a0;
                    j7 = V;
                    j8 = g03;
                    j9 = g04;
                    j10 = j152;
                    float f322 = ((r17) a2.getValue()).b;
                    f530 b22 = gza1.b(f530Var, f322, f322);
                    int[] iArr22 = lpm.b;
                    long j1422 = g02;
                    i6 = iArr22[dsButton$Size.ordinal()];
                    if (i6 != 1) {
                    }
                    int i1022 = i5;
                    f530 g22 = ljs0.g(b22, f, 0.0f, 2);
                    i7 = iArr22[dsButton$Size.ordinal()];
                    if (i7 != 1) {
                    }
                    f530 l22 = ymb1.l(g22, cyk0.c(f2));
                    i8 = lpm.c[dsButton$State.ordinal()];
                    if (i8 != 1) {
                    }
                    f530 d42 = u3a1.d(ycb1.b(q791.b(m4m0.b(l22, j11, qke.q), zx40Var, null, (z2 || z) ? false : true, null, new awk0(0), slsVar2, 8), z, str2), "BUTTON");
                    z910 d222 = pi6.d(x4c.y, false);
                    int hashCode22 = Long.hashCode(btsVar.T);
                    r1b0 o22 = btsVar.o();
                    f530 d322 = b.d(btsVar, d42);
                    ohd.G1.getClass();
                    sls slsVar322 = d.b;
                    if (btsVar.a != null) {
                    }
                    break;
                case 4:
                    dsButton$State = dsButton$State2;
                    btsVar.e0(-473629126);
                    V = qnm.c(btsVar).Z();
                    j2 = qnm.c(btsVar).Z();
                    g0 = qnm.c(btsVar).i0();
                    g02 = qnm.c(btsVar).i0();
                    g03 = qnm.c(btsVar).i0();
                    g04 = qnm.c(btsVar).i0();
                    btsVar.t(false);
                    i5 = i9;
                    long j1522 = g0;
                    j6 = a0;
                    j7 = V;
                    j8 = g03;
                    j9 = g04;
                    j10 = j1522;
                    float f3222 = ((r17) a2.getValue()).b;
                    f530 b222 = gza1.b(f530Var, f3222, f3222);
                    int[] iArr222 = lpm.b;
                    long j14222 = g02;
                    i6 = iArr222[dsButton$Size.ordinal()];
                    if (i6 != 1) {
                    }
                    int i10222 = i5;
                    f530 g222 = ljs0.g(b222, f, 0.0f, 2);
                    i7 = iArr222[dsButton$Size.ordinal()];
                    if (i7 != 1) {
                    }
                    f530 l222 = ymb1.l(g222, cyk0.c(f2));
                    i8 = lpm.c[dsButton$State.ordinal()];
                    if (i8 != 1) {
                    }
                    f530 d422 = u3a1.d(ycb1.b(q791.b(m4m0.b(l222, j11, qke.q), zx40Var, null, (z2 || z) ? false : true, null, new awk0(0), slsVar2, 8), z, str2), "BUTTON");
                    z910 d2222 = pi6.d(x4c.y, false);
                    int hashCode222 = Long.hashCode(btsVar.T);
                    r1b0 o222 = btsVar.o();
                    f530 d3222 = b.d(btsVar, d422);
                    ohd.G1.getClass();
                    sls slsVar3222 = d.b;
                    if (btsVar.a != null) {
                    }
                    break;
                case 5:
                    dsButton$State = dsButton$State2;
                    btsVar.e0(-473239859);
                    V = qnm.c(btsVar).G();
                    j2 = qnm.c(btsVar).I();
                    g0 = qnm.c(btsVar).i0();
                    g02 = qnm.c(btsVar).j0();
                    g03 = qnm.c(btsVar).j0();
                    g04 = qnm.c(btsVar).j0();
                    btsVar.t(false);
                    i5 = i9;
                    long j15222 = g0;
                    j6 = a0;
                    j7 = V;
                    j8 = g03;
                    j9 = g04;
                    j10 = j15222;
                    float f32222 = ((r17) a2.getValue()).b;
                    f530 b2222 = gza1.b(f530Var, f32222, f32222);
                    int[] iArr2222 = lpm.b;
                    long j142222 = g02;
                    i6 = iArr2222[dsButton$Size.ordinal()];
                    if (i6 != 1) {
                    }
                    int i102222 = i5;
                    f530 g2222 = ljs0.g(b2222, f, 0.0f, 2);
                    i7 = iArr2222[dsButton$Size.ordinal()];
                    if (i7 != 1) {
                    }
                    f530 l2222 = ymb1.l(g2222, cyk0.c(f2));
                    i8 = lpm.c[dsButton$State.ordinal()];
                    if (i8 != 1) {
                    }
                    f530 d4222 = u3a1.d(ycb1.b(q791.b(m4m0.b(l2222, j11, qke.q), zx40Var, null, (z2 || z) ? false : true, null, new awk0(0), slsVar2, 8), z, str2), "BUTTON");
                    z910 d22222 = pi6.d(x4c.y, false);
                    int hashCode2222 = Long.hashCode(btsVar.T);
                    r1b0 o2222 = btsVar.o();
                    f530 d32222 = b.d(btsVar, d4222);
                    ohd.G1.getClass();
                    sls slsVar32222 = d.b;
                    if (btsVar.a != null) {
                    }
                    break;
                case 6:
                    dsButton$State = dsButton$State2;
                    btsVar.e0(-472837045);
                    V = qnm.c(btsVar).N();
                    j2 = qnm.c(btsVar).P();
                    g0 = qnm.c(btsVar).i0();
                    g02 = qnm.c(btsVar).j0();
                    g03 = qnm.c(btsVar).j0();
                    g04 = qnm.c(btsVar).j0();
                    btsVar.t(false);
                    i5 = i9;
                    long j152222 = g0;
                    j6 = a0;
                    j7 = V;
                    j8 = g03;
                    j9 = g04;
                    j10 = j152222;
                    float f322222 = ((r17) a2.getValue()).b;
                    f530 b22222 = gza1.b(f530Var, f322222, f322222);
                    int[] iArr22222 = lpm.b;
                    long j1422222 = g02;
                    i6 = iArr22222[dsButton$Size.ordinal()];
                    if (i6 != 1) {
                    }
                    int i1022222 = i5;
                    f530 g22222 = ljs0.g(b22222, f, 0.0f, 2);
                    i7 = iArr22222[dsButton$Size.ordinal()];
                    if (i7 != 1) {
                    }
                    f530 l22222 = ymb1.l(g22222, cyk0.c(f2));
                    i8 = lpm.c[dsButton$State.ordinal()];
                    if (i8 != 1) {
                    }
                    f530 d42222 = u3a1.d(ycb1.b(q791.b(m4m0.b(l22222, j11, qke.q), zx40Var, null, (z2 || z) ? false : true, null, new awk0(0), slsVar2, 8), z, str2), "BUTTON");
                    z910 d222222 = pi6.d(x4c.y, false);
                    int hashCode22222 = Long.hashCode(btsVar.T);
                    r1b0 o22222 = btsVar.o();
                    f530 d322222 = b.d(btsVar, d42222);
                    ohd.G1.getClass();
                    sls slsVar322222 = d.b;
                    if (btsVar.a != null) {
                    }
                    break;
                case 7:
                    dsButton$State = dsButton$State2;
                    btsVar.e0(-472432309);
                    V = qnm.c(btsVar).Q();
                    j2 = qnm.c(btsVar).S();
                    g0 = qnm.c(btsVar).i0();
                    g02 = qnm.c(btsVar).j0();
                    g03 = qnm.c(btsVar).j0();
                    g04 = qnm.c(btsVar).j0();
                    btsVar.t(false);
                    i5 = i9;
                    long j1522222 = g0;
                    j6 = a0;
                    j7 = V;
                    j8 = g03;
                    j9 = g04;
                    j10 = j1522222;
                    float f3222222 = ((r17) a2.getValue()).b;
                    f530 b222222 = gza1.b(f530Var, f3222222, f3222222);
                    int[] iArr222222 = lpm.b;
                    long j14222222 = g02;
                    i6 = iArr222222[dsButton$Size.ordinal()];
                    if (i6 != 1) {
                    }
                    int i10222222 = i5;
                    f530 g222222 = ljs0.g(b222222, f, 0.0f, 2);
                    i7 = iArr222222[dsButton$Size.ordinal()];
                    if (i7 != 1) {
                    }
                    f530 l222222 = ymb1.l(g222222, cyk0.c(f2));
                    i8 = lpm.c[dsButton$State.ordinal()];
                    if (i8 != 1) {
                    }
                    f530 d422222 = u3a1.d(ycb1.b(q791.b(m4m0.b(l222222, j11, qke.q), zx40Var, null, (z2 || z) ? false : true, null, new awk0(0), slsVar2, 8), z, str2), "BUTTON");
                    z910 d2222222 = pi6.d(x4c.y, false);
                    int hashCode222222 = Long.hashCode(btsVar.T);
                    r1b0 o222222 = btsVar.o();
                    f530 d3222222 = b.d(btsVar, d422222);
                    ohd.G1.getClass();
                    sls slsVar3222222 = d.b;
                    if (btsVar.a != null) {
                    }
                    break;
                case 8:
                    btsVar.e0(-472030270);
                    j = qnm.c(btsVar).J();
                    j2 = qnm.c(btsVar).K();
                    i0 = qnm.c(btsVar).i0();
                    dsButton$State = dsButton$State2;
                    j3 = qnm.b(btsVar).j;
                    j4 = qnm.b(btsVar).j;
                    j5 = qnm.b(btsVar).j;
                    btsVar.t(false);
                    long j132 = j;
                    j9 = j5;
                    g02 = j3;
                    j10 = i0;
                    j6 = a0;
                    j7 = j132;
                    i5 = i9;
                    j8 = j4;
                    float f32222222 = ((r17) a2.getValue()).b;
                    f530 b2222222 = gza1.b(f530Var, f32222222, f32222222);
                    int[] iArr2222222 = lpm.b;
                    long j142222222 = g02;
                    i6 = iArr2222222[dsButton$Size.ordinal()];
                    if (i6 != 1) {
                    }
                    int i102222222 = i5;
                    f530 g2222222 = ljs0.g(b2222222, f, 0.0f, 2);
                    i7 = iArr2222222[dsButton$Size.ordinal()];
                    if (i7 != 1) {
                    }
                    f530 l2222222 = ymb1.l(g2222222, cyk0.c(f2));
                    i8 = lpm.c[dsButton$State.ordinal()];
                    if (i8 != 1) {
                    }
                    f530 d4222222 = u3a1.d(ycb1.b(q791.b(m4m0.b(l2222222, j11, qke.q), zx40Var, null, (z2 || z) ? false : true, null, new awk0(0), slsVar2, 8), z, str2), "BUTTON");
                    z910 d22222222 = pi6.d(x4c.y, false);
                    int hashCode2222222 = Long.hashCode(btsVar.T);
                    r1b0 o2222222 = btsVar.o();
                    f530 d32222222 = b.d(btsVar, d4222222);
                    ohd.G1.getClass();
                    sls slsVar32222222 = d.b;
                    if (btsVar.a != null) {
                    }
                    break;
                default:
                    throw unr0.y(-1123693536, btsVar, false);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fpm(kk2Var, slsVar, dsButton$Style, f530Var, dsButton$Size, x3Var, x3Var2, str, z, str2, z2, i, i2, 0);
        }
    }

    public static final void d(kk2 kk2Var, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, DsButton$Size dsButton$Size, pa90 pa90Var, pa90 pa90Var2, String str, boolean z, String str2, boolean z2, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1311400923);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(kk2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.c(dsButton$Style.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 2048 : 1024;
        } else {
            f530Var2 = f530Var;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.c(dsButton$Size == null ? -1 : dsButton$Size.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar2.e(pa90Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= btsVar2.e(pa90Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= btsVar2.k(str) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i3 |= btsVar2.a(z) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i) == 0) {
            i3 |= btsVar2.k(str2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (btsVar2.a(z2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            int i5 = 7;
            btsVar = btsVar2;
            c(kk2Var, slsVar, dsButton$Style, f530Var2, dsButton$Size, pa90Var != null ? new zom(i5, pa90Var) : null, pa90Var2 != null ? new zom(i5, pa90Var2) : null, str, z, str2, z2, btsVar, i3 & 2143354878, i4 & 14);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fpm(kk2Var, slsVar, dsButton$Style, f530Var, dsButton$Size, pa90Var, pa90Var2, str, z, str2, z2, i, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, final sls slsVar, final DsButton$Style dsButton$Style, final f530 f530Var, DsButton$Size dsButton$Size, final x3 x3Var, x3 x3Var2, boolean z, String str2, boolean z2, fid fidVar, final int i, final int i2, final int i3) {
        int i4;
        f530 f530Var2;
        x3 x3Var3;
        x3 x3Var4;
        int i5;
        boolean z3;
        int i6;
        String str3;
        int i7;
        int i8;
        int i9;
        final DsButton$Size dsButton$Size2;
        final x3 x3Var5;
        final boolean z4;
        final String str4;
        final boolean z5;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1472585911);
        if ((i & 6) == 0) {
            i4 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= btsVar.c(dsButton$Style.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar.k(f530Var2) ? 2048 : 1024;
        } else {
            f530Var2 = f530Var;
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar.c(dsButton$Size == null ? -1 : dsButton$Size.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            x3Var3 = x3Var;
            i4 |= btsVar.e(x3Var3) ? 131072 : 65536;
        } else {
            x3Var3 = x3Var;
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            x3Var4 = x3Var2;
            i4 |= btsVar.e(x3Var4) ? 1048576 : 524288;
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= btsVar.k(null) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
            }
            i5 = i3 & 256;
            if (i5 == 0) {
                i4 |= 100663296;
            } else if ((100663296 & i) == 0) {
                z3 = z;
                i4 |= btsVar.a(z3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                i6 = i3 & 512;
                if (i6 != 0) {
                    i4 |= 805306368;
                    str3 = str2;
                } else {
                    str3 = str2;
                    if ((i & 805306368) == 0) {
                        i4 |= btsVar.k(str3) ? 536870912 : SelfTester_JCP.IMITA;
                    }
                }
                i7 = i3 & 1024;
                if (i7 != 0) {
                    i9 = i2 | 6;
                    i8 = i4;
                } else if ((i2 & 6) == 0) {
                    i8 = i4;
                    i9 = i2 | (btsVar.a(z2) ? 4 : 2);
                } else {
                    i8 = i4;
                    i9 = i2;
                }
                if ((i8 & 306783379) != 306783378 && (i9 & 3) == 2 && btsVar.E()) {
                    btsVar.Y();
                    dsButton$Size2 = dsButton$Size;
                    z5 = z2;
                    x3Var5 = x3Var4;
                    str4 = str3;
                    z4 = z3;
                } else {
                    DsButton$Size dsButton$Size3 = i10 != 0 ? DsButton$Size.Md : dsButton$Size;
                    x3 x3Var6 = i11 != 0 ? null : x3Var4;
                    boolean z6 = i5 != 0 ? false : z3;
                    String str5 = i6 != 0 ? null : str3;
                    boolean z7 = i7 != 0 ? true : z2;
                    DsButton$Size dsButton$Size4 = dsButton$Size3;
                    c(new kk2(str), slsVar, dsButton$Style, f530Var2, dsButton$Size4, x3Var3, x3Var6, null, z6, str5, z7, btsVar, i8 & 2147483632, i9 & 14);
                    dsButton$Size2 = dsButton$Size4;
                    x3Var5 = x3Var6;
                    z4 = z6;
                    str4 = str5;
                    z5 = z7;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: epm
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int O = vng.O(i | 1);
                            int O2 = vng.O(i2);
                            mo91.e(str, slsVar, dsButton$Style, f530Var, dsButton$Size2, x3Var, x3Var5, z4, str4, z5, (fid) obj, O, O2, i3);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            z3 = z;
            i6 = i3 & 512;
            if (i6 != 0) {
            }
            i7 = i3 & 1024;
            if (i7 != 0) {
            }
            if ((i8 & 306783379) != 306783378) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            DsButton$Size dsButton$Size42 = dsButton$Size3;
            c(new kk2(str), slsVar, dsButton$Style, f530Var2, dsButton$Size42, x3Var3, x3Var6, null, z6, str5, z7, btsVar, i8 & 2147483632, i9 & 14);
            dsButton$Size2 = dsButton$Size42;
            x3Var5 = x3Var6;
            z4 = z6;
            str4 = str5;
            z5 = z7;
            v = btsVar.v();
            if (v != null) {
            }
        }
        x3Var4 = x3Var2;
        if ((i3 & 128) == 0) {
        }
        i5 = i3 & 256;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 512;
        if (i6 != 0) {
        }
        i7 = i3 & 1024;
        if (i7 != 0) {
        }
        if ((i8 & 306783379) != 306783378) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        DsButton$Size dsButton$Size422 = dsButton$Size3;
        c(new kk2(str), slsVar, dsButton$Style, f530Var2, dsButton$Size422, x3Var3, x3Var6, null, z6, str5, z7, btsVar, i8 & 2147483632, i9 & 14);
        dsButton$Size2 = dsButton$Size422;
        x3Var5 = x3Var6;
        z4 = z6;
        str4 = str5;
        z5 = z7;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void f(String str, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, DsButton$Size dsButton$Size, pa90 pa90Var, boolean z, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar;
        boolean z2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(977434379);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.c(dsButton$Style.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.c(dsButton$Size == null ? -1 : dsButton$Size.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar2.e(pa90Var) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= btsVar2.e(null) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= btsVar2.k(null) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= btsVar2.a(false) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= btsVar2.k(null) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((306783379 & i3) == 306783378 && btsVar2.E()) {
            btsVar2.Y();
            z2 = z;
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            d(new kk2(str), slsVar, dsButton$Style, f530Var, dsButton$Size, pa90Var, null, null, false, null, true, btsVar, i3 & 2147483632, 6);
            z2 = true;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new u07(str, slsVar, dsButton$Style, f530Var, dsButton$Size, pa90Var, z2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(String str, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, DsButton$Size dsButton$Size, boolean z, boolean z2, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        bts btsVar;
        f530 f530Var3;
        DsButton$Size dsButton$Size2;
        boolean z5;
        boolean z6;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-18562231);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.c(dsButton$Style.ordinal()) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar2.c(dsButton$Size == null ? -1 : dsButton$Size.ordinal()) ? 16384 : 8192;
            }
            i5 = 196608 | i3;
            i6 = i2 & 64;
            if (i6 == 0) {
                i5 = 1769472 | i3;
            } else if ((i & 1572864) == 0) {
                z3 = z;
                i5 |= btsVar2.a(z3) ? 1048576 : 524288;
                if ((i2 & 128) != 0) {
                    i5 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i5 |= btsVar2.k(null) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i5 |= 100663296;
                } else if ((100663296 & i) == 0) {
                    z4 = z2;
                    i5 |= btsVar2.a(z4) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    if ((38347923 & i5) == 38347922 || !btsVar2.E()) {
                        f530 f530Var4 = i8 == 0 ? c530.a : f530Var2;
                        DsButton$Size dsButton$Size3 = i4 == 0 ? DsButton$Size.Md : dsButton$Size;
                        if (i6 != 0) {
                            z3 = false;
                        }
                        boolean z7 = z3;
                        boolean z8 = i7 == 0 ? true : z4;
                        int i9 = i5 << 6;
                        btsVar = btsVar2;
                        f530 f530Var5 = f530Var4;
                        e(str, slsVar, dsButton$Style, f530Var5, dsButton$Size3, null, null, z7, null, z8, btsVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (29360128 & i9) | (234881024 & i9) | (i9 & 1879048192), (i5 >> 24) & 14, 0);
                        f530Var3 = f530Var5;
                        dsButton$Size2 = dsButton$Size3;
                        z5 = z7;
                        z6 = z8;
                    } else {
                        btsVar2.Y();
                        dsButton$Size2 = dsButton$Size;
                        btsVar = btsVar2;
                        z5 = z3;
                        f530Var3 = f530Var2;
                        z6 = z4;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new up5(str, slsVar, dsButton$Style, f530Var3, dsButton$Size2, z5, z6, i, i2);
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((38347923 & i5) == 38347922) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i6 != 0) {
                }
                boolean z72 = z3;
                if (i7 == 0) {
                }
                int i92 = i5 << 6;
                btsVar = btsVar2;
                f530 f530Var52 = f530Var4;
                e(str, slsVar, dsButton$Style, f530Var52, dsButton$Size3, null, null, z72, null, z8, btsVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (29360128 & i92) | (234881024 & i92) | (i92 & 1879048192), (i5 >> 24) & 14, 0);
                f530Var3 = f530Var52;
                dsButton$Size2 = dsButton$Size3;
                z5 = z72;
                z6 = z8;
                v = btsVar.v();
                if (v == null) {
                }
            }
            z3 = z;
            if ((i2 & 128) != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            z4 = z2;
            if ((38347923 & i5) == 38347922) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i6 != 0) {
            }
            boolean z722 = z3;
            if (i7 == 0) {
            }
            int i922 = i5 << 6;
            btsVar = btsVar2;
            f530 f530Var522 = f530Var4;
            e(str, slsVar, dsButton$Style, f530Var522, dsButton$Size3, null, null, z722, null, z8, btsVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (29360128 & i922) | (234881024 & i922) | (i922 & 1879048192), (i5 >> 24) & 14, 0);
            f530Var3 = f530Var522;
            dsButton$Size2 = dsButton$Size3;
            z5 = z722;
            z6 = z8;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = 196608 | i3;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z3 = z;
        if ((i2 & 128) != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        z4 = z2;
        if ((38347923 & i5) == 38347922) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i6 != 0) {
        }
        boolean z7222 = z3;
        if (i7 == 0) {
        }
        int i9222 = i5 << 6;
        btsVar = btsVar2;
        f530 f530Var5222 = f530Var4;
        e(str, slsVar, dsButton$Style, f530Var5222, dsButton$Size3, null, null, z7222, null, z8, btsVar, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (29360128 & i9222) | (234881024 & i9222) | (i9222 & 1879048192), (i5 >> 24) & 14, 0);
        f530Var3 = f530Var5222;
        dsButton$Size2 = dsButton$Size3;
        z5 = z7222;
        z6 = z8;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static w2d0 h() {
        return w2d0.f;
    }

    public static final List i(X509Certificate x509Certificate) {
        byte[] bArr;
        Version version;
        DigitallySigned$HashAlgorithm digitallySigned$HashAlgorithm;
        DigitallySigned$SignatureAlgorithm digitallySigned$SignatureAlgorithm;
        byte[] bArr2 = ((cqf) a3.m(v2.p(x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.4.2")).a)).a;
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
        byteArrayInputStream.read();
        if (byteArrayInputStream.read() < 0) {
            ny61.b();
            return null;
        }
        while (byteArrayInputStream.available() > 2) {
            int read = byteArrayInputStream.read();
            int read2 = byteArrayInputStream.read();
            if (read2 < 0) {
                ny61.b();
                return null;
            }
            int i = (read << 8) | read2;
            if (i < 1) {
                bArr = ijz0.a;
            } else {
                byte[] bArr3 = new byte[i];
                if (i != asu0.a(i, bArr3, byteArrayInputStream)) {
                    ny61.b();
                    return null;
                }
                bArr = bArr3;
            }
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            z931 z931Var = Version.Companion;
            int a2 = (int) o7b1.a(byteArrayInputStream2, 1);
            z931Var.getClass();
            Version[] values = Version.values();
            int length = values.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    version = null;
                    break;
                }
                version = values[i3];
                if (version.getNumber() == a2) {
                    break;
                }
                i3++;
            }
            if (version == null) {
                version = Version.UNKNOWN_VERSION;
            }
            Version version2 = version;
            if (version2 != Version.V1) {
                throw new SerializationException("Unknown version: " + version2);
            }
            byte[] bArr4 = new byte[32];
            int read3 = byteArrayInputStream2.read(bArr4);
            if (read3 < 32) {
                ny61.v(oyr.e('.', read3, "Not enough bytes: Expected 32, got "));
                return null;
            }
            long a3 = o7b1.a(byteArrayInputStream2, 8);
            byte[] b = o7b1.b(byteArrayInputStream2);
            int a4 = (int) o7b1.a(byteArrayInputStream2, 1);
            DigitallySigned$HashAlgorithm.Companion.getClass();
            DigitallySigned$HashAlgorithm[] values2 = DigitallySigned$HashAlgorithm.values();
            int length2 = values2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    digitallySigned$HashAlgorithm = null;
                    break;
                }
                digitallySigned$HashAlgorithm = values2[i4];
                if (digitallySigned$HashAlgorithm.getNumber() == a4) {
                    break;
                }
                i4++;
            }
            if (digitallySigned$HashAlgorithm == null) {
                rza.a(16);
                throw new SerializationException("Unknown hash algorithm: ".concat(Integer.toString(a4, 16)));
            }
            int a5 = (int) o7b1.a(byteArrayInputStream2, 1);
            DigitallySigned$SignatureAlgorithm.Companion.getClass();
            DigitallySigned$SignatureAlgorithm[] values3 = DigitallySigned$SignatureAlgorithm.values();
            int length3 = values3.length;
            while (true) {
                if (i2 >= length3) {
                    digitallySigned$SignatureAlgorithm = null;
                    break;
                }
                digitallySigned$SignatureAlgorithm = values3[i2];
                if (digitallySigned$SignatureAlgorithm.getNumber() == a5) {
                    break;
                }
                i2++;
            }
            if (digitallySigned$SignatureAlgorithm == null) {
                rza.a(16);
                throw new SerializationException("Unknown signature algorithm: ".concat(Integer.toString(a5, 16)));
            }
            arrayList.add(new tbs0(version2, new lez(bArr4), a3, new sjj(digitallySigned$HashAlgorithm, digitallySigned$SignatureAlgorithm, o7b1.b(byteArrayInputStream2)), b));
        }
        return a.J0(arrayList);
    }
}
