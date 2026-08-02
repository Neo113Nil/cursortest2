package com.yandex.go.chargers.feedback.ui.components;

import android.content.Context;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.chargers.feedback.ui.components.a;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c36;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dzg0;
import defpackage.f530;
import defpackage.fid;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.ly3;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.ohd;
import defpackage.oyr;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.q791;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rh10;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse0;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wya1;
import defpackage.x4c;
import defpackage.x7i0;
import defpackage.xo1;
import defpackage.ymg0;
import defpackage.yx40;
import defpackage.zpn;
import defpackage.zx40;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(f530 f530Var, int i, int i2, wp2 wp2Var, wp2 wp2Var2, float f, long j, final tls tlsVar, fid fidVar, final int i3) {
        final int i4;
        final f530 f530Var2;
        final int i5;
        final wp2 wp2Var3;
        final wp2 wp2Var4;
        final float f2;
        final long j2;
        c530 c530Var;
        boolean z;
        o430 o430Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2113099516);
        int i6 = i3 | 6;
        if ((i3 & 48) == 0) {
            i4 = i;
            i6 |= btsVar.c(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        int i7 = i6 | 1797504;
        if ((i3 & 12582912) == 0) {
            i7 |= btsVar.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if (btsVar.V(i7 & 1, (4793491 & i7) != 4793490)) {
            AppColor$Palette appColor$Palette = AppColor$Palette.Control;
            AppColor$Palette appColor$Palette2 = AppColor$Palette.ControlMinor;
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                Q = f.g(i4);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var2) {
                Q2 = f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            lhl0 a = khl0.a(rh10.b, x4c.D, btsVar, 6);
            o430 o430Var3 = o430Var2;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-1605774574);
            int i8 = 1;
            while (i8 < 6) {
                if (i8 <= yx40Var.getIntValue()) {
                    c530Var = c530Var2;
                    z = true;
                } else {
                    c530Var = c530Var2;
                    z = false;
                }
                int intValue = yx40Var.getIntValue();
                boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                boolean c2 = ((i7 & 29360128) == 8388608) | btsVar.c(i8);
                Object Q3 = btsVar.Q();
                if (c2) {
                    o430Var = o430Var3;
                } else {
                    o430Var = o430Var3;
                    if (Q3 != o430Var) {
                        b(i8, z, intValue, booleanValue, appColor$Palette, appColor$Palette2, 1.2f, 100L, (sls) Q3, btsVar, (i7 << 6) & 268427264);
                        i8++;
                        o430Var3 = o430Var;
                        c530Var2 = c530Var;
                    }
                }
                Q3 = new x7i0(i8, tlsVar, oz40Var, yx40Var);
                btsVar.o0(Q3);
                b(i8, z, intValue, booleanValue, appColor$Palette, appColor$Palette2, 1.2f, 100L, (sls) Q3, btsVar, (i7 << 6) & 268427264);
                i8++;
                o430Var3 = o430Var;
                c530Var2 = c530Var;
            }
            o430 o430Var4 = o430Var3;
            c530 c530Var3 = c530Var2;
            btsVar.t(false);
            btsVar.t(true);
            Boolean bool = (Boolean) oz40Var.getValue();
            bool.getClass();
            boolean z2 = (i7 & 3670016) == 1048576;
            Object Q4 = btsVar.Q();
            if (z2 || Q4 == o430Var4) {
                Q4 = new RatingBarComponentKt$RatingBarComponent$3$1(100L, oz40Var, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, bool);
            i5 = 48;
            f530Var2 = c530Var3;
            j2 = 100;
            wp2Var3 = appColor$Palette;
            wp2Var4 = appColor$Palette2;
            f2 = 1.2f;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            i5 = i2;
            wp2Var3 = wp2Var;
            wp2Var4 = wp2Var2;
            f2 = f;
            j2 = j;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: y7i0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.a(f530.this, i4, i5, wp2Var3, wp2Var4, f2, j2, tlsVar, (fid) obj, vng.O(i3 | 1));
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static final void b(int i, final boolean z, final int i2, final boolean z2, final wp2 wp2Var, final wp2 wp2Var2, final float f, final long j, final sls slsVar, fid fidVar, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        bts btsVar;
        Boolean bool;
        ?? r12;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-196570103);
        if ((i3 & 6) == 0) {
            i4 = (btsVar2.c(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= btsVar2.a(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i2;
            i4 |= btsVar2.c(i5) ? 256 : 128;
        } else {
            i5 = i2;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z3 = z2;
            i4 |= btsVar2.a(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.c(48) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= btsVar2.k(wp2Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= btsVar2.k(wp2Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= btsVar2.b(f) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i3) == 0) {
            i4 |= btsVar2.d(j) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i3) == 0) {
            i4 |= btsVar2.e(slsVar) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (btsVar2.V(i4 & 1, (306783379 & i4) != 306783378)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Integer valueOf = Integer.valueOf(i5);
            Boolean valueOf2 = Boolean.valueOf(z3);
            int i7 = i4;
            boolean z4 = ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((i7 & 14) == 4) | ((i7 & 234881024) == 67108864);
            Object Q2 = btsVar2.Q();
            if (z4 || Q2 == o430Var) {
                bool = valueOf2;
                r12 = 0;
                RatingBarComponentKt$RatingStar$1$1 ratingBarComponentKt$RatingStar$1$1 = new RatingBarComponentKt$RatingStar$1$1(z3, i5, i, j, oz40Var, null);
                i6 = i;
                btsVar2.o0(ratingBarComponentKt$RatingStar$1$1);
                Q2 = ratingBarComponentKt$RatingStar$1$1;
            } else {
                bool = valueOf2;
                r12 = 0;
                i6 = i;
            }
            zpn.f(valueOf, bool, (wls) Q2, btsVar2);
            c36 c36Var = null;
            bts btsVar3 = btsVar2;
            m3u0 b = androidx.compose.animation.core.b.b(((Boolean) oz40Var.getValue()).booleanValue() ? f : 1.0f, sb2.G(0.5f, 200.0f, 4, null), oyr.i(i6, "star_scale_"), null, btsVar3, 48, 20);
            Context context = (Context) btsVar3.m(AndroidCompositionLocals_androidKt.b);
            Object Q3 = btsVar3.Q();
            if (Q3 == o430Var) {
                Q3 = context.getResources().getStringArray(ymg0.rating_view_titles);
                btsVar3.o0(Q3);
            }
            int i8 = dzg0.ic_rating_star;
            String str = ((String[]) Q3)[i6 - 1];
            wp2 wp2Var3 = z ? wp2Var : wp2Var2;
            f530 m = ljs0.m(c530.a, 48.0f);
            Object Q4 = btsVar3.Q();
            if (Q4 == o430Var) {
                Q4 = ly3.i(btsVar3);
            }
            f530 b2 = q791.b(m, (zx40) Q4, null, false, null, null, slsVar, 28);
            boolean k = btsVar3.k(b);
            Object Q5 = btsVar3.Q();
            if (k || Q5 == o430Var) {
                Q5 = new xo1(b, 12);
                btsVar3.o0(Q5);
            }
            f530 a = androidx.compose.ui.graphics.d.a(b2, (tls) Q5);
            pa90 a2 = wya1.a(i8, r12, btsVar3);
            if (wp2Var3 == null) {
                btsVar3.e0(-1411607277);
                btsVar3.t(r12);
            } else {
                btsVar3.e0(-1411607276);
                c36Var = tse0.e(tje.n(wp2Var3, btsVar3), 5, btsVar3, r12);
            }
            o4b1.b(a2, str, a, null, null, 0.0f, c36Var, btsVar3, 8, 56);
            btsVar = btsVar3;
        } else {
            i6 = i;
            bts btsVar4 = btsVar2;
            btsVar4.Y();
            btsVar = btsVar4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final int i9 = i6;
            v.d = new wls() { // from class: z7i0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.b(i9, z, i2, z2, wp2Var, wp2Var2, f, j, slsVar, (fid) obj, vng.O(i3 | 1));
                    return zy11.a;
                }
            };
        }
    }
}
