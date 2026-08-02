package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yx360.design.compose.atoms.DsBadge$Size;
import com.yx360.design.compose.atoms.DsBadge$Variant;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class oom {
    public static final qwd a = new qwd(new jbm(19));
    public static final qwd b = new qwd(new jbm(20));

    /* JADX WARN: Removed duplicated region for block: B:146:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final lom lomVar, f530 f530Var, DsBadge$Size dsBadge$Size, final DsBadge$Variant dsBadge$Variant, boolean z, long j, String str, fid fidVar, final int i, final int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        int i6;
        DsBadge$Size dsBadge$Size2;
        int i7;
        String str3;
        boolean z3;
        long j2;
        boolean b2;
        Object Q;
        int i8;
        float f;
        boolean b3;
        Object Q2;
        boolean z4;
        int i9;
        f530 f530Var3;
        long h0;
        f530 f530Var4;
        int i10;
        long j3;
        long T;
        boolean k;
        Object Q3;
        long j4;
        float f2;
        String str4;
        final boolean z5;
        final DsBadge$Size dsBadge$Size3;
        final String str5;
        final f530 f530Var5;
        final long j5;
        ety0 b4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1806809299);
        int i11 = ((i & 8) == 0 ? btsVar.k(lomVar) : btsVar.e(lomVar) ? 4 : 2) | i;
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 = i11 | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i11 | (btsVar.k(f530Var2) ? 32 : 16);
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.c(dsBadge$Size == null ? -1 : dsBadge$Size.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.c(dsBadge$Variant != null ? dsBadge$Variant.ordinal() : -1) ? 2048 : 1024;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 16384 : 8192;
            int i15 = 65536 | i3;
            i4 = i2 & 64;
            if (i4 == 0) {
                i5 = i3 | 1638400;
                str2 = str;
            } else {
                str2 = str;
                i5 = i15 | (btsVar.k(str2) ? 1048576 : 524288);
            }
            if ((599187 & i5) == 599186 || !btsVar.E()) {
                btsVar.a0();
                i6 = i & 1;
                c530 c530Var = c530.a;
                if (i6 != 0 || btsVar.C()) {
                    if (i12 != 0) {
                        f530Var2 = c530Var;
                    }
                    dsBadge$Size2 = i13 == 0 ? DsBadge$Size.Md : dsBadge$Size;
                    if (i14 != 0) {
                        z2 = false;
                    }
                    qnm qnmVar = qnm.a;
                    long a2 = qnm.c(btsVar).a();
                    i7 = i5 & (-458753);
                    if (i4 == 0) {
                        z3 = z2;
                        str3 = null;
                    } else {
                        str3 = str2;
                        z3 = z2;
                    }
                    j2 = a2;
                } else {
                    btsVar.Y();
                    str3 = str2;
                    i7 = i5 & (-458753);
                    z3 = z2;
                    dsBadge$Size2 = dsBadge$Size;
                    j2 = j;
                }
                btsVar.u();
                btsVar.e0(-1587373892);
                float f3 = ((Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a)).fontScale;
                btsVar.t(false);
                btsVar.e0(-1633490746);
                b2 = ((i7 & 896) != 256) | btsVar.b(f3);
                Q = btsVar.Q();
                o430 o430Var = did.a;
                if (!b2 || Q == o430Var) {
                    i8 = nom.a[dsBadge$Size2.ordinal()];
                    if (i8 != 1) {
                        f = 24.0f;
                    } else {
                        if (i8 != 2) {
                            w511.b();
                            return;
                        }
                        f = 16.0f;
                    }
                    Q = ly3.h(f * f3, btsVar);
                }
                float f4 = ((y7m) Q).a;
                btsVar.t(false);
                float a3 = idb1.a(f4, btsVar);
                btsVar.e0(5004770);
                b3 = btsVar.b(a3);
                Q2 = btsVar.Q();
                if (!b3 || Q2 == o430Var) {
                    Q2 = f.f(a3);
                    btsVar.o0(Q2);
                }
                tx40 tx40Var = (tx40) Q2;
                btsVar.t(false);
                int[] iArr = nom.b;
                z4 = z3;
                i9 = iArr[dsBadge$Variant.ordinal()];
                DsBadge$Size dsBadge$Size4 = dsBadge$Size2;
                if (i9 != 1 || i9 == 2) {
                    f530Var3 = f530Var2;
                    btsVar.e0(-1176923814);
                    qnm qnmVar2 = qnm.a;
                    h0 = qnm.c(btsVar).h0();
                    btsVar.t(false);
                } else if (i9 == 3) {
                    btsVar.e0(-1176921860);
                    qnm qnmVar3 = qnm.a;
                    f530Var3 = f530Var2;
                    h0 = qnm.b(btsVar).j;
                    btsVar.t(false);
                } else {
                    if (i9 != 4) {
                        throw unr0.y(-1176926662, btsVar, false);
                    }
                    btsVar.e0(-1176919972);
                    qnm qnmVar4 = qnm.a;
                    long j0 = qnm.c(btsVar).j0();
                    btsVar.t(false);
                    f530Var3 = f530Var2;
                    h0 = j0;
                }
                if (z4) {
                    f530Var4 = c530Var;
                } else {
                    f530 b5 = m4m0.b(c530Var, j2, cyk0.c(f4));
                    qnm.d.getClass();
                    f530Var4 = an91.k(b5, 2.0f);
                }
                f530 f530Var6 = f530Var3;
                f530 l = ymb1.l(ljs0.a(f530Var6.k(f530Var4), idb1.e(tx40Var.getFloatValue(), btsVar), f4), cyk0.c(f4));
                i10 = iArr[dsBadge$Variant.ordinal()];
                if (i10 != 1) {
                    j3 = h0;
                    btsVar.e0(-1176898949);
                    qnm qnmVar5 = qnm.a;
                    T = qnm.c(btsVar).T();
                    btsVar.t(false);
                } else if (i10 == 2) {
                    j3 = h0;
                    btsVar.e0(-1176896610);
                    qnm qnmVar6 = qnm.a;
                    T = qnm.c(btsVar).U();
                    btsVar.t(false);
                } else if (i10 == 3) {
                    btsVar.e0(-1176894151);
                    qnm qnmVar7 = qnm.a;
                    j3 = h0;
                    T = qnm.b(btsVar).a;
                    btsVar.t(false);
                } else {
                    if (i10 != 4) {
                        throw unr0.y(-1176900969, btsVar, false);
                    }
                    btsVar.e0(-1176891966);
                    qnm qnmVar8 = qnm.a;
                    long G = qnm.c(btsVar).G();
                    btsVar.t(false);
                    j3 = h0;
                    T = G;
                }
                f530 b6 = m4m0.b(l, T, qke.q);
                btsVar.e0(5004770);
                k = btsVar.k(tx40Var);
                Q3 = btsVar.Q();
                if (!k || Q3 == o430Var) {
                    Q3 = new aq5(tx40Var, 4);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                f530 b7 = xm91.b(b6, (tls) Q3);
                z910 d = pi6.d(x4c.y, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d2 = b.d(btsVar, b7);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a != null) {
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
                qje.W(btsVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d2);
                boolean z6 = lomVar instanceof jom;
                qwd qwdVar = a;
                if (z6) {
                    btsVar.e0(1200157138);
                    int i16 = nom.a[dsBadge$Size4.ordinal()];
                    if (i16 == 1) {
                        btsVar.e0(1839832191);
                        b4 = ltm.b(btsVar).b(btsVar);
                        btsVar.t(false);
                    } else {
                        if (i16 != 2) {
                            throw unr0.y(1839830201, btsVar, false);
                        }
                        btsVar.e0(1839834306);
                        b4 = ltm.b(btsVar).h(btsVar);
                        btsVar.t(false);
                    }
                    jom jomVar = (jom) lomVar;
                    int i17 = jomVar.a;
                    Integer num = jomVar.b;
                    btsVar.e0(1839836484);
                    int intValue = num == null ? ((Number) btsVar.m(b)).intValue() : num.intValue();
                    btsVar.t(false);
                    btsVar.e0(-1633490746);
                    boolean c = btsVar.c(i17) | btsVar.c(intValue);
                    Object Q4 = btsVar.Q();
                    if (c || Q4 == o430Var) {
                        Q4 = i17 < 1 ? "1" : i17 > intValue ? b64.e(intValue, "+") : String.valueOf(i17);
                        btsVar.o0(Q4);
                    }
                    String str6 = (String) Q4;
                    btsVar.t(false);
                    qnm.c.getClass();
                    f530 m = an91.m(c530Var, 4.0f, 0.0f, 2);
                    btsVar.e0(-1633490746);
                    boolean z7 = ((3670016 & i7) == 1048576) | ((i7 & 14) == 4 || ((i7 & 8) != 0 && btsVar.e(lomVar)));
                    Object Q5 = btsVar.Q();
                    if (z7 || Q5 == o430Var) {
                        Q5 = new t8j(12, str3, lomVar);
                        btsVar.o0(Q5);
                    }
                    btsVar.t(false);
                    f530 a4 = fnq0.a(m, (tls) Q5);
                    long j6 = b4.a.b;
                    float floatValue = ((Number) btsVar.m(qwdVar)).floatValue();
                    uh6.g(j6);
                    j4 = j2;
                    vqy0.c(str6, a4, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ety0.a(b4, 0L, uh6.K(sty0.c(j6) / floatValue, 1095216660480L & j6), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, 0, 0, 131064);
                    btsVar = btsVar;
                    btsVar.t(false);
                    str4 = str3;
                } else {
                    j4 = j2;
                    long j7 = j3;
                    if (!(lomVar instanceof kom)) {
                        throw unr0.y(1839829038, btsVar, false);
                    }
                    btsVar.e0(1201285910);
                    int i18 = nom.a[dsBadge$Size4.ordinal()];
                    if (i18 == 1) {
                        qnm.c.getClass();
                        f2 = 4.0f;
                    } else if (i18 != 2) {
                        w511.b();
                        return;
                    } else {
                        qnm.c.getClass();
                        f2 = 2.0f;
                    }
                    str4 = str3;
                    p4v.b(null, str4, ljs0.m(an91.k(c530Var, f2), (f4 - f2) - (f2 / ((Number) btsVar.m(qwdVar)).floatValue())), j7, btsVar, (i7 >> 15) & 112, 0);
                    btsVar.t(false);
                }
                btsVar.t(true);
                z5 = z4;
                dsBadge$Size3 = dsBadge$Size4;
                str5 = str4;
                f530Var5 = f530Var6;
                j5 = j4;
            } else {
                btsVar.Y();
                dsBadge$Size3 = dsBadge$Size;
                j5 = j;
                str5 = str2;
                f530Var5 = f530Var2;
                z5 = z2;
            }
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new wls() { // from class: mom
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        oom.a(lom.this, f530Var5, dsBadge$Size3, dsBadge$Variant, z5, j5, str5, (fid) obj, vng.O(i | 1), i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        int i152 = 65536 | i3;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        btsVar.a0();
        i6 = i & 1;
        c530 c530Var2 = c530.a;
        if (i6 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 == 0) {
        }
        if (i14 != 0) {
        }
        qnm qnmVar9 = qnm.a;
        long a22 = qnm.c(btsVar).a();
        i7 = i5 & (-458753);
        if (i4 == 0) {
        }
        j2 = a22;
        btsVar.u();
        btsVar.e0(-1587373892);
        float f32 = ((Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a)).fontScale;
        btsVar.t(false);
        btsVar.e0(-1633490746);
        b2 = ((i7 & 896) != 256) | btsVar.b(f32);
        Q = btsVar.Q();
        o430 o430Var2 = did.a;
        if (!b2) {
        }
        i8 = nom.a[dsBadge$Size2.ordinal()];
        if (i8 != 1) {
        }
        Q = ly3.h(f * f32, btsVar);
        float f42 = ((y7m) Q).a;
        btsVar.t(false);
        float a32 = idb1.a(f42, btsVar);
        btsVar.e0(5004770);
        b3 = btsVar.b(a32);
        Q2 = btsVar.Q();
        if (!b3) {
        }
        Q2 = f.f(a32);
        btsVar.o0(Q2);
        tx40 tx40Var2 = (tx40) Q2;
        btsVar.t(false);
        int[] iArr2 = nom.b;
        z4 = z3;
        i9 = iArr2[dsBadge$Variant.ordinal()];
        DsBadge$Size dsBadge$Size42 = dsBadge$Size2;
        if (i9 != 1) {
        }
        f530Var3 = f530Var2;
        btsVar.e0(-1176923814);
        qnm qnmVar22 = qnm.a;
        h0 = qnm.c(btsVar).h0();
        btsVar.t(false);
        if (z4) {
        }
        f530 f530Var62 = f530Var3;
        f530 l2 = ymb1.l(ljs0.a(f530Var62.k(f530Var4), idb1.e(tx40Var2.getFloatValue(), btsVar), f42), cyk0.c(f42));
        i10 = iArr2[dsBadge$Variant.ordinal()];
        if (i10 != 1) {
        }
        f530 b62 = m4m0.b(l2, T, qke.q);
        btsVar.e0(5004770);
        k = btsVar.k(tx40Var2);
        Q3 = btsVar.Q();
        if (!k) {
        }
        Q3 = new aq5(tx40Var2, 4);
        btsVar.o0(Q3);
        btsVar.t(false);
        f530 b72 = xm91.b(b62, (tls) Q3);
        z910 d3 = pi6.d(x4c.y, false);
        int hashCode2 = Long.hashCode(btsVar.T);
        r1b0 o2 = btsVar.o();
        f530 d22 = b.d(btsVar, b72);
        ohd.G1.getClass();
        sls slsVar2 = d.b;
        if (btsVar.a != null) {
        }
    }
}
