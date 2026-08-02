package defpackage;

import android.app.Notification;
import android.content.Context;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ptb1 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1134367772);
        if (btsVar.V(i & 1, i != 0)) {
            long n = tje.n(AppColor$Palette.TextMinor, btsVar);
            osv d = z5b1.d(z5b1.g("liveDot", btsVar, 0), 0.0f, 1.0f, sb2.w(sb2.K(1000, 0, null, 6), RepeatMode.Reverse, 0L, 4), "liveDotAlpha", btsVar, 29112, 0);
            f530 m = ljs0.m(c530.a, 4.0f);
            boolean d2 = btsVar.d(n) | btsVar.k(d);
            Object Q = btsVar.Q();
            if (d2 || Q == did.a) {
                Q = new v9d(n, d, 3);
                btsVar.o0(Q);
            }
            qeb1.a(6, btsVar, (tls) Q, m);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jiz0(i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final ib11 ib11Var, final boolean z, f530 f530Var, sls slsVar, final boolean z2, Integer num, String str, CharSequence charSequence, ldc ldcVar, String str2, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        sls slsVar2;
        int i5;
        Integer num2;
        char c;
        int i6;
        String str3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final CharSequence charSequence2;
        final String str4;
        final Integer num3;
        final f530 f530Var3;
        final String str5;
        final sls slsVar3;
        final ldc ldcVar2;
        bts btsVar;
        aii0 v;
        String str6;
        long j;
        long j2;
        CharSequence charSequence3;
        int i12;
        Integer num4;
        f530 f530Var4;
        sls slsVar4;
        long j3;
        f530 b;
        f530 f530Var5;
        f530 l;
        o430 o430Var;
        long j4;
        int i13;
        float f;
        boolean z3;
        ?? r10;
        bts btsVar2;
        Object obj;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-431577740);
        dmw0 dmw0Var = btsVar3.a;
        if ((i & 6) == 0) {
            i3 = (btsVar3.e(ib11Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar3.a(z) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar3.k(f530Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                slsVar2 = slsVar;
                i3 |= btsVar3.e(slsVar2) ? 2048 : 1024;
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i3 |= btsVar3.a(z2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                    num2 = num;
                    c = 2;
                } else {
                    num2 = num;
                    c = 2;
                    if ((i & ImageMetadata.EDGE_MODE) == 0) {
                        i3 |= btsVar3.k(num2) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    str3 = str;
                } else {
                    str3 = str;
                    if ((i & 1572864) == 0) {
                        i3 |= btsVar3.k(str3) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                int i15 = 12582912;
                if (i7 == 0) {
                    if ((i & 12582912) == 0) {
                        i15 = (i & 16777216) == 0 ? btsVar3.k(charSequence) : btsVar3.e(charSequence) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= btsVar3.k(ldcVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                        i10 = i2 & 512;
                        if (i10 != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 = i10;
                            i3 |= btsVar3.k(str2) ? 536870912 : SelfTester_JCP.IMITA;
                            if (btsVar3.V(i3 & 1, (i3 & 306783379) == 306783378)) {
                                bts btsVar4 = btsVar3;
                                btsVar4.Y();
                                charSequence2 = charSequence;
                                str4 = str2;
                                num3 = num2;
                                f530Var3 = f530Var2;
                                str5 = str3;
                                slsVar3 = slsVar2;
                                ldcVar2 = ldcVar;
                                btsVar = btsVar4;
                            } else {
                                c530 c530Var = c530.a;
                                f530 f530Var6 = i14 != 0 ? c530Var : f530Var2;
                                sls slsVar5 = i4 != 0 ? null : slsVar2;
                                if (i5 != 0) {
                                    num2 = null;
                                }
                                String str7 = i6 != 0 ? null : str3;
                                CharSequence charSequence4 = i7 != 0 ? null : charSequence;
                                ldc ldcVar3 = i9 != 0 ? null : ldcVar;
                                String str8 = i11 != 0 ? null : str2;
                                Context context = (Context) btsVar3.m(AndroidCompositionLocals_androidKt.b);
                                kdc kdcVar = ib11Var.c;
                                String str9 = ib11Var.f;
                                String str10 = ib11Var.e;
                                long d = kdcVar != null ? rzo.d(s8o.m(kdcVar, context)) : ldc.l;
                                if (ldcVar3 == null) {
                                    btsVar3.e0(1865637374);
                                    if (((ry2) btsVar3.m(uy2.a)).b) {
                                        str6 = str9;
                                        float c2 = 1.0f - y6i0.c(0.24f, 0.0f, 1.0f);
                                        j2 = ldc.b(d, 0.0f, ldc.h(d) * c2, ldc.g(d) * c2, ldc.e(d) * c2, 1);
                                    } else {
                                        str6 = str9;
                                        float c3 = y6i0.c(0.2f, 0.0f, 1.0f);
                                        j2 = ldc.b(d, 0.0f, ((1.0f - ldc.h(d)) * c3) + ldc.h(d), ((1.0f - ldc.g(d)) * c3) + ldc.g(d), ((1.0f - ldc.e(d)) * c3) + ldc.e(d), 1);
                                    }
                                    j = d;
                                    btsVar3.t(false);
                                } else {
                                    str6 = str9;
                                    j = d;
                                    btsVar3.e0(1865636909);
                                    btsVar3.t(false);
                                    j2 = ldcVar3.a;
                                }
                                CharSequence charSequence5 = charSequence4;
                                ldc ldcVar4 = ldcVar3;
                                long n = tje.n(AppColor$Palette.ControlMinor, btsVar3);
                                int f2 = xob1.f(ib11Var.a, z2);
                                if (charSequence5 == null) {
                                    if (!z || str10.length() <= 0) {
                                        str10 = ib11Var.b;
                                    }
                                    charSequence3 = str10;
                                } else {
                                    charSequence3 = charSequence5;
                                }
                                String str11 = (str8 == null || str8.length() <= 0) ? null : str8;
                                CharSequence charSequence6 = charSequence3.length() > 0 ? charSequence3 : null;
                                String str12 = str6.length() > 0 ? str6 : null;
                                CharSequence[] charSequenceArr = new CharSequence[3];
                                charSequenceArr[0] = str11;
                                charSequenceArr[1] = charSequence6;
                                charSequenceArr[c] = str12;
                                String X = a.X(j73.A(charSequenceArr), ". ", null, null, null, 62);
                                o430 o430Var2 = did.a;
                                if (slsVar5 != null) {
                                    btsVar3.e0(2000814691);
                                    num4 = num2;
                                    f530 b2 = q791.b(f530Var6, null, null, false, null, new awk0(0), slsVar5, 12);
                                    i12 = f2;
                                    f530Var4 = f530Var6;
                                    slsVar4 = slsVar5;
                                    j3 = j2;
                                    boolean k = btsVar3.k(X) | ((i3 & 7168) == 2048);
                                    Object Q = btsVar3.Q();
                                    if (k || Q == o430Var2) {
                                        kp1 kp1Var = new kp1(X, slsVar4, 3);
                                        btsVar3.o0(kp1Var);
                                        obj = kp1Var;
                                    } else {
                                        obj = Q;
                                    }
                                    f530 a = fnq0.a(b2, (tls) obj);
                                    btsVar3.t(false);
                                    b = a;
                                } else {
                                    i12 = f2;
                                    num4 = num2;
                                    f530Var4 = f530Var6;
                                    slsVar4 = slsVar5;
                                    j3 = j2;
                                    btsVar3.e0(2001049764);
                                    boolean k2 = btsVar3.k(X);
                                    Object Q2 = btsVar3.Q();
                                    Object obj2 = Q2;
                                    if (k2 || Q2 == o430Var2) {
                                        il01 il01Var = new il01(X, 5);
                                        btsVar3.o0(il01Var);
                                        obj2 = il01Var;
                                    }
                                    b = fnq0.b(f530Var4, true, (tls) obj2);
                                    btsVar3.t(false);
                                }
                                f530 l2 = ymb1.l(ljs0.e(b, 32.0f), cyk0.a(50));
                                gji0 gji0Var = qke.q;
                                f530 o = an91.o(m4m0.b(l2, n, gji0Var), 4.0f, 0.0f, 12.0f, 0.0f, 10);
                                lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar3, 48);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o2 = btsVar3.o();
                                f530 d2 = b.d(btsVar3, o);
                                ohd.G1.getClass();
                                sls slsVar6 = d.b;
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                sls slsVar7 = slsVar4;
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar6);
                                } else {
                                    btsVar3.r0();
                                }
                                wls wlsVar = d.f;
                                qje.W(btsVar3, wlsVar, a2);
                                wls wlsVar2 = d.e;
                                qje.W(btsVar3, wlsVar2, o2);
                                Integer valueOf = Integer.valueOf(hashCode);
                                wls wlsVar3 = d.g;
                                qje.W(btsVar3, wlsVar3, valueOf);
                                tls tlsVar = d.h;
                                qje.M(btsVar3, tlsVar);
                                int i16 = i3;
                                wls wlsVar4 = d.d;
                                qje.W(btsVar3, wlsVar4, d2);
                                if (num4 == null && str7 == null) {
                                    f530Var5 = f530Var4;
                                    l = m4m0.b(ymb1.l(ljs0.m(c530Var, 24.0f), cyk0.a), j, gji0Var);
                                } else {
                                    f530Var5 = f530Var4;
                                    l = ymb1.l(ljs0.m(c530Var, 24.0f), cyk0.a);
                                }
                                z910 d3 = pi6.d(x4c.y, false);
                                int hashCode2 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d4 = b.d(btsVar3, l);
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar6);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, wlsVar, d3);
                                qje.W(btsVar3, wlsVar2, o3);
                                vfc.v(hashCode2, btsVar3, wlsVar3, btsVar3, tlsVar);
                                qje.W(btsVar3, wlsVar4, d4);
                                int i17 = 20;
                                if (str7 != null) {
                                    btsVar3.e0(-670027966);
                                    ovi0 a3 = mja1.a(str7, null, 6);
                                    f530 m = ljs0.m(c530Var, 24.0f);
                                    ued.a.getClass();
                                    j4 = j3;
                                    z3 = true;
                                    r10 = 0;
                                    i13 = 3;
                                    o430Var = o430Var2;
                                    f = 1.0f;
                                    v0b1.a(a3, m, null, ued.b, null, null, null, null, 0.0f, 0, btsVar3, 3120, 1012);
                                    bts btsVar5 = btsVar3;
                                    btsVar5.t(false);
                                    btsVar2 = btsVar5;
                                } else {
                                    bts btsVar6 = btsVar3;
                                    o430Var = o430Var2;
                                    j4 = j3;
                                    i13 = 3;
                                    f = 1.0f;
                                    z3 = true;
                                    r10 = 0;
                                    r10 = 0;
                                    r10 = 0;
                                    if (num4 != null) {
                                        btsVar6.e0(-670016831);
                                        o4b1.b(vfc.k(num4.intValue(), (((i16 >> 15) & 14) | 3504) & 14, -1411607277, btsVar6, false), null, ljs0.m(c530Var, 24.0f), null, null, 0.0f, null, btsVar6, 440, 56);
                                        btsVar6.t(false);
                                        btsVar2 = btsVar6;
                                    } else if (ib11Var.g.length() > 0) {
                                        btsVar6.e0(704542323);
                                        String str13 = ib11Var.g;
                                        Object Q3 = btsVar6.Q();
                                        Object obj3 = Q3;
                                        if (Q3 == o430Var) {
                                            teb tebVar = new teb(i17);
                                            btsVar6.o0(tebVar);
                                            obj3 = tebVar;
                                        }
                                        jeb1.f(str13, fnq0.a(c530Var, (tls) obj3), AppColor$Palette.EverFront, 0L, 0L, null, null, 0L, 0, false, 1, 0, null, xya1.d(btsVar6).h.b, btsVar6, 384, 48, 14328);
                                        btsVar6.t(false);
                                        btsVar2 = btsVar6;
                                    } else {
                                        btsVar6.e0(-670001678);
                                        o4b1.b(vfc.k(i12, 0, -1411607277, btsVar6, false), null, ljs0.m(c530Var, 16.0f), null, null, 0.0f, null, btsVar6, 440, 56);
                                        btsVar6.t(false);
                                        btsVar2 = btsVar6;
                                    }
                                }
                                btsVar2.t(z3);
                                oeb1.c(btsVar2, ljs0.q(c530Var, 4.0f));
                                if (charSequence3.length() > 0) {
                                    btsVar2.e0(1520351988);
                                    boolean d5 = btsVar2.d(j4);
                                    Object Q4 = btsVar2.Q();
                                    Object obj4 = Q4;
                                    if (d5 || Q4 == o430Var) {
                                        fhp0 fhp0Var = new fhp0(j4, i13);
                                        btsVar2.o0(fhp0Var);
                                        obj4 = fhp0Var;
                                    }
                                    xfc xfcVar = (xfc) obj4;
                                    x2y x2yVar = new x2y(f, r10);
                                    Object Q5 = btsVar2.Q();
                                    Object obj5 = Q5;
                                    if (Q5 == o430Var) {
                                        teb tebVar2 = new teb(i17);
                                        btsVar2.o0(tebVar2);
                                        obj5 = tebVar2;
                                    }
                                    qgy.a(charSequence3, xfcVar, null, fnq0.a(x2yVar, (tls) obj5), 0L, 0L, null, 0L, 2, 1, 0, xya1.d(btsVar2).h.b, btsVar2, 805306368, 6, 10740);
                                    btsVar2.t(r10);
                                } else {
                                    btsVar2.e0(1520632786);
                                    btsVar2.t(r10);
                                }
                                if (str6.length() > 0) {
                                    btsVar2.e0(1520726654);
                                    if (ib11Var.i) {
                                        btsVar2.e0(1520714502);
                                        oeb1.c(btsVar2, ljs0.q(c530Var, 8.0f));
                                        a(btsVar2, r10);
                                        oeb1.c(btsVar2, ljs0.q(c530Var, 6.0f));
                                        btsVar2.t(r10);
                                    } else {
                                        btsVar2.e0(1520825668);
                                        oeb1.c(btsVar2, ljs0.q(c530Var, 8.0f));
                                        btsVar2.t(r10);
                                    }
                                    String str14 = ib11Var.f;
                                    Object Q6 = btsVar2.Q();
                                    Object obj6 = Q6;
                                    if (Q6 == o430Var) {
                                        zp01 zp01Var = new zp01(12);
                                        btsVar2.o0(zp01Var);
                                        obj6 = zp01Var;
                                    }
                                    tls tlsVar2 = (tls) obj6;
                                    Object Q7 = btsVar2.Q();
                                    Object obj7 = Q7;
                                    if (Q7 == o430Var) {
                                        zp01 zp01Var2 = new zp01(13);
                                        btsVar2.o0(zp01Var2);
                                        obj7 = zp01Var2;
                                    }
                                    ued.a.getClass();
                                    androidx.compose.animation.a.b(str14, null, tlsVar2, null, "scheduleTextTransition", (tls) obj7, ued.c, btsVar2, 1794432, 10);
                                    btsVar2.t(r10);
                                } else {
                                    btsVar2.e0(1522283474);
                                    btsVar2.t(r10);
                                }
                                btsVar2.t(z3);
                                ldcVar2 = ldcVar4;
                                num3 = num4;
                                str5 = str7;
                                str4 = str8;
                                slsVar3 = slsVar7;
                                f530Var3 = f530Var5;
                                charSequence2 = charSequence5;
                                btsVar = btsVar2;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new wls() { // from class: o011
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj8, Object obj9) {
                                        ((Integer) obj9).getClass();
                                        ptb1.b(ib11.this, z, f530Var3, slsVar3, z2, num3, str5, charSequence2, ldcVar2, str4, (fid) obj8, vng.O(i | 1), i2);
                                        return zy11.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        if (btsVar3.V(i3 & 1, (i3 & 306783379) == 306783378)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    i9 = i8;
                    i10 = i2 & 512;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if (btsVar3.V(i3 & 1, (i3 & 306783379) == 306783378)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                i3 |= i15;
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                if (btsVar3.V(i3 & 1, (i3 & 306783379) == 306783378)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            slsVar2 = slsVar;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            int i152 = 12582912;
            if (i7 == 0) {
            }
            i3 |= i152;
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            if (btsVar3.V(i3 & 1, (i3 & 306783379) == 306783378)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        slsVar2 = slsVar;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        int i1522 = 12582912;
        if (i7 == 0) {
        }
        i3 |= i1522;
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        if (btsVar3.V(i3 & 1, (i3 & 306783379) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final boolean c(Notification notification) {
        boolean hasPromotableCharacteristics;
        if (smw0.a() < 3600001) {
            return false;
        }
        hasPromotableCharacteristics = notification.hasPromotableCharacteristics();
        return hasPromotableCharacteristics;
    }
}
