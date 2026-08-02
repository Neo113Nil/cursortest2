package defpackage;

import android.content.Context;
import android.os.Trace;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class dda1 {
    public static volatile y381 a;
    public static final Object b = new Object();

    public static final void a(f530 f530Var, wp2 wp2Var, fid fidVar, int i) {
        f530 f530Var2;
        wp2 wp2Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-658883749);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(wp2Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530Var2 = f530Var;
            wp2Var2 = wp2Var;
            sya1.a(epa1.c(), f530Var2, null, wp2Var2, btsVar, ((i2 << 3) & 112) | ((i2 << 6) & 7168), 4);
        } else {
            f530Var2 = f530Var;
            wp2Var2 = wp2Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o990(f530Var2, wp2Var2, i, 11);
        }
    }

    public static final void b(int i, fid fidVar, sls slsVar, f530 f530Var) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1443171379);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | 48;
        byte b2 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            a7u0 a7u0Var = j.n;
            LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(a7u0Var);
            String e = ohb1.e(btsVar, cyh0.mt_qr_common_back);
            au2 i3 = layoutDirection == LayoutDirection.Rtl ? wza1.i() : vza1.c();
            f530Var2 = c530.a;
            f530 d = q791.d(bzk0.c(ymb1.l(ljs0.m(f530Var2, 56.0f), cyk0.a), new up2(zp2.c), qke.q), false, null, null, slsVar, 15);
            boolean k = btsVar.k(e);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new dcc0(e, 11);
                btsVar.o0(Q);
            }
            f530 b3 = fnq0.b(d, false, (tls) Q);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, b3);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            sb2.b(a7u0Var.a(LayoutDirection.Ltr), wwg.S(-727305837, true, new heg0(i3, b2, b2), btsVar), btsVar, 56);
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar, f530Var2, i, 12);
        }
    }

    public static final void c(final boolean z, final boolean z2, final boolean z3, final tls tlsVar, final f530 f530Var, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1475831749);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.a(z2) ? 256 : 128) | (btsVar.a(z3) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192) | (btsVar.k(f530Var) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            z910 d = pi6.d(x4c.B, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, f530Var);
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
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 l = an91.l(ljs0.c(c530.a, 1.0f), 16.0f, 12.0f);
            lhl0 a2 = khl0.a(lr20.g, x4c.E, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, l);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            int i3 = 57344 & i2;
            boolean z4 = i3 == 16384;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z4 || Q == o430Var) {
                Q = new ukb0(6, tlsVar);
                btsVar.o0(Q);
            }
            b(0, btsVar, (sls) Q, null);
            if (z) {
                btsVar.e0(979273801);
                String e = ohb1.e(btsVar, cyh0.mt_qr_enter_number_button);
                boolean z5 = i3 == 16384;
                Object Q2 = btsVar.Q();
                if (z5 || Q2 == o430Var) {
                    Q2 = new ukb0(7, tlsVar);
                    btsVar.o0(Q2);
                }
                d(0, btsVar, (sls) Q2, null, e, false);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(979456391);
                btsVar.t(false);
            }
            btsVar.e0(979490522);
            boolean z6 = i3 == 16384;
            Object Q3 = btsVar.Q();
            if (z6 || Q3 == o430Var) {
                Q3 = new ukb0(8, tlsVar);
                btsVar.o0(Q3);
            }
            e(z3, z2, (sls) Q3, null, btsVar, ((i2 >> 9) & 14) | ((i2 >> 3) & 112));
            tse0.t(btsVar, false, true, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(z, z2, z3, tlsVar, f530Var, i) { // from class: geg0
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ f530 x;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(49);
                    dda1.c(this.a, this.b, this.c, this.w, this.x, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void d(int i, fid fidVar, sls slsVar, f530 f530Var, String str, boolean z) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(823272992);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16) | 3456;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ButtonSize buttonSize = ButtonSize.M;
            gz6 gz6Var = new gz6(AppColor$Palette.Fog, AppColor$Palette.EverFront);
            ButtonForm buttonForm = ButtonForm.Circle;
            a S = wwg.S(-585140819, true, new jk30(str, 13), btsVar);
            int i3 = 1600950 | ((i2 << 12) & ImageMetadata.JPEG_GPS_COORDINATES);
            c530 c530Var = c530.a;
            d17.d(c530Var, true, buttonSize, gz6Var, buttonForm, slsVar, S, btsVar, i3, 0);
            f530Var = c530Var;
            z = true;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new feg0(str, slsVar, f530Var, z, i);
        }
    }

    public static final void e(boolean z, boolean z2, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        String e;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(361837942);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            if (z2) {
                btsVar.e0(-853606260);
                e = ohb1.e(btsVar, cyh0.mt_qr_flashlight_disable);
                btsVar.t(false);
            } else {
                btsVar.e0(-853536851);
                e = ohb1.e(btsVar, cyh0.mt_qr_flashlight_enable);
                btsVar.t(false);
            }
            String str = e;
            if (z2) {
                j = ldc.f;
                int i4 = up2.c;
            } else {
                j = zp2.c;
            }
            wp2 up2Var = z2 ? new up2(ldc.b) : AppColor$Palette.EverFront;
            c530 c530Var = c530.a;
            f530 d = q791.d(bzk0.c(ymb1.l(ljs0.m(c530Var, 56.0f), cyk0.a), new up2(j), qke.q), z, null, null, slsVar, 14);
            boolean k = btsVar.k(str);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new dcc0(str, 12);
                btsVar.o0(Q);
            }
            f530 b2 = fnq0.b(d, false, (tls) Q);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            a(q6a1.c(ljs0.m(c530Var, 24.0f), z), up2Var, btsVar, 0);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ieg0(z, z2, slsVar, f530Var2, i, 0);
        }
    }

    public static final void f(int i, int i2, fid fidVar, sls slsVar, f530 f530Var, String str, boolean z) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2065641356);
        int i5 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i5 | (btsVar.k(f530Var2) ? 256 : 128);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (btsVar.a(z2) ? 2048 : 1024);
        }
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            f530 f530Var3 = i6 != 0 ? c530.a : f530Var2;
            boolean z4 = i7 != 0 ? true : z2;
            int i8 = i4 >> 6;
            d17.d(f530Var3, z4, ButtonSize.M, new gz6(new up2(ldc.f), new up2(ldc.b)), ButtonForm.Circle, slsVar, wwg.S(305417625, true, new jk30(str, 12), btsVar), btsVar, (i8 & 112) | (i8 & 14) | 1600896 | ((i4 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), 0);
            z3 = z4;
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
            z3 = z2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bp1(str, slsVar, f530Var2, z3, i, i2, 1);
        }
    }

    public static final y381 g(Context context) {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new y381(s881.a(context, "YadPreferenceFile"));
                }
            }
        }
        y381 y381Var = a;
        if (y381Var != null) {
            return y381Var;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public static void h() {
        if (rf71.a >= 18) {
            Trace.endSection();
        }
    }

    public static void i(String str) {
        if (rf71.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static final j5i0 j(Throwable th) {
        return ybb1.b(th);
    }
}
