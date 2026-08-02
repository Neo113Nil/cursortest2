package defpackage;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.n;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.h;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public abstract class k4b1 {
    public static final void a(final bj6 bj6Var, final s1p0 s1p0Var, final tls tlsVar, final oip0 oip0Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(722367187);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(s1p0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(oip0Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            m1p0 m1p0Var = s1p0Var.c.c;
            if (m1p0Var.a.length() == 0) {
                v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    wlsVar = new wls() { // from class: b1p0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    int O = vng.O(i5 | 1);
                                    k4b1.a(bj6Var, s1p0Var, tlsVar, oip0Var, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    int O2 = vng.O(i5 | 1);
                                    k4b1.a(bj6Var, s1p0Var, tlsVar, oip0Var, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            jt1 jt1Var = x4c.B;
            c530 c530Var = c530.a;
            f530 k = an91.k(i9a1.d(ljs0.c(bzk0.c(hbb1.c(bj6Var.a(c530Var, jt1Var), dbb1.c(btsVar), false, 0.0f, p1b1.f(oip0Var, btsVar), 6), AppColor$Palette.BgFloating, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 1.0f)), 8.0f);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
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
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, a);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar4 = d.g;
            qje.W(btsVar, wlsVar4, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a2);
            qje.W(btsVar, wlsVar3, o2);
            vfc.v(hashCode2, btsVar, wlsVar4, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar5, d2);
            int i4 = i2 >> 3;
            e(s1p0Var, tlsVar, btsVar, i4 & HProv.PP_DELETE_SAVED_PASSWD);
            int i5 = (i2 & 896) | (i4 & 14);
            g(s1p0Var, m1p0Var, tlsVar, btsVar, i5);
            n.y(btsVar, true, c530Var, 8.0f, btsVar);
            c(s1p0Var, m1p0Var.f.c, tlsVar, btsVar, i5);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 1;
            wlsVar = new wls() { // from class: b1p0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i6;
                    zy11 zy11Var = zy11.a;
                    int i52 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).intValue();
                            int O = vng.O(i52 | 1);
                            k4b1.a(bj6Var, s1p0Var, tlsVar, oip0Var, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            int O2 = vng.O(i52 | 1);
                            k4b1.a(bj6Var, s1p0Var, tlsVar, oip0Var, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(List list, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i, int i2) {
        sls slsVar4;
        int i3;
        sls slsVar5;
        int i4;
        sls slsVar6;
        int i5;
        sls slsVar7;
        sls slsVar8;
        sls slsVar9;
        sls slsVar10;
        sls slsVar11;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-985297185);
        int i6 = 2;
        int i7 = i | (btsVar.e(list) ? 4 : 2);
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 = i7 | 48;
            slsVar4 = slsVar;
        } else {
            slsVar4 = slsVar;
            i3 = i7 | (btsVar.e(slsVar4) ? 32 : 16);
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i4 = i3 | 384;
            slsVar5 = slsVar2;
        } else {
            slsVar5 = slsVar2;
            i4 = i3 | (btsVar.e(slsVar5) ? 256 : 128);
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i5 = i4 | HProv.ALG_TYPE_SECURECHANNEL;
            slsVar6 = slsVar3;
        } else {
            slsVar6 = slsVar3;
            i5 = i4 | (btsVar.e(slsVar6) ? 2048 : 1024);
        }
        if (btsVar.V(i5 & 1, (i5 & 1171) != 1170)) {
            o430 o430Var = did.a;
            if (i8 != 0) {
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new bgc(12);
                    btsVar.o0(Q);
                }
                slsVar10 = (sls) Q;
            } else {
                slsVar10 = slsVar4;
            }
            if (i9 != 0) {
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new bgc(12);
                    btsVar.o0(Q2);
                }
                slsVar11 = (sls) Q2;
            } else {
                slsVar11 = slsVar5;
            }
            if (i10 != 0) {
                Object Q3 = btsVar.Q();
                if (Q3 == o430Var) {
                    Q3 = new bgc(12);
                    btsVar.o0(Q3);
                }
                slsVar6 = (sls) Q3;
            }
            boolean z = ((i5 & 896) == 256) | ((i5 & 112) == 32);
            Object Q4 = btsVar.Q();
            if (z || Q4 == o430Var) {
                Q4 = new ts4(0, slsVar10, slsVar11);
                btsVar.o0(Q4);
            }
            zpn.a(list, (tls) Q4, btsVar);
            long c = ((el51) btsVar.m(gl51.a)).c();
            gji0 gji0Var = qke.q;
            c530 c530Var = c530.a;
            f530 a = androidx.compose.ui.input.nestedscroll.b.a(m4m0.b(c530Var, c, gji0Var), zrb1.f(btsVar), null);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar12 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar12);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            sls slsVar13 = slsVar10;
            androidx.compose.foundation.lazy.b a3 = a7y.a(0, 3, btsVar);
            f530 c2 = ljs0.c(an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13).k(new x2y(1.0f, false)), 1.0f);
            boolean e = btsVar.e(list);
            Object Q5 = btsVar.Q();
            if (e || Q5 == o430Var) {
                Q5 = new qh2(list, i6);
                btsVar.o0(Q5);
            }
            sls slsVar14 = slsVar6;
            adb1.a(c2, a3, null, null, null, null, false, null, (tls) Q5, btsVar, 0, 508);
            f530 u = ljs0.u(ljs0.c(c530Var, 1.0f), null, 3);
            boolean z2 = !rx21.f(a3);
            a S = wwg.S(-778589648, true, new us4(0, slsVar14), btsVar);
            btsVar = btsVar;
            lbb1.b(u, z2, 0.0f, 0.0f, null, null, S, btsVar, 1572870, 60);
            btsVar.t(true);
            slsVar9 = slsVar14;
            slsVar7 = slsVar13;
            slsVar8 = slsVar11;
        } else {
            btsVar.Y();
            slsVar7 = slsVar4;
            slsVar8 = slsVar5;
            slsVar9 = slsVar6;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(list, slsVar7, slsVar8, slsVar9, i, i2);
        }
    }

    public static final void c(final s1p0 s1p0Var, final j1p0 j1p0Var, final tls tlsVar, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        aii0 v;
        wls wlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-78353804);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(s1p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(j1p0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if (!btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar = btsVar2;
            btsVar.Y();
        } else {
            if (j1p0Var == null) {
                v = btsVar2.v();
                if (v != null) {
                    final int i3 = 0;
                    wlsVar = new wls() { // from class: w0p0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            tls tlsVar2 = tlsVar;
                            j1p0 j1p0Var2 = j1p0Var;
                            s1p0 s1p0Var2 = s1p0Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    k4b1.c(s1p0Var2, j1p0Var2, tlsVar2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    k4b1.c(s1p0Var2, j1p0Var2, tlsVar2, fidVar2, vng.O(i5 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            String str = j1p0Var.a;
            ety0 ety0Var = xya1.e(btsVar2).i.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            boolean z = !s1p0Var.e;
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = new nao0(9, tlsVar, j1p0Var);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            jeb1.f(str, q791.d(c530.a, z, null, null, (sls) Q, 14), appColor$Palette, 0L, 0L, rly0.c, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, 1573248, 0, 16184);
        }
        v = btsVar.v();
        if (v != null) {
            final int i4 = 1;
            wlsVar = new wls() { // from class: w0p0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    zy11 zy11Var = zy11.a;
                    int i5 = i;
                    tls tlsVar2 = tlsVar;
                    j1p0 j1p0Var2 = j1p0Var;
                    s1p0 s1p0Var2 = s1p0Var;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).intValue();
                    switch (i42) {
                        case 0:
                            k4b1.c(s1p0Var2, j1p0Var2, tlsVar2, fidVar2, vng.O(i5 | 1));
                            break;
                        default:
                            k4b1.c(s1p0Var2, j1p0Var2, tlsVar2, fidVar2, vng.O(i5 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    public static final void d(s1p0 s1p0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2;
        long j;
        ?? r10;
        s1p0 s1p0Var2 = s1p0Var;
        tls tlsVar2 = tlsVar;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(1170303158);
        int i3 = i | (btsVar3.k(s1p0Var2) ? 4 : 2) | (btsVar3.e(tlsVar2) ? 32 : 16);
        if (btsVar3.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 l = an91.l(c530Var, 16.0f, 4.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d = b.d(btsVar3, l);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar3.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, d.f, a);
            qje.W(btsVar3, d.e, o);
            qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar3, d.h);
            qje.W(btsVar3, d.d, d);
            btsVar3.e0(-401656006);
            n1p0 n1p0Var = s1p0Var2.c;
            oeb1.c(btsVar3, ljs0.e(c530Var, 4.0f));
            CharSequence charSequence = n1p0Var.a;
            List list = n1p0Var.d;
            float f = 4.0f;
            c530 c530Var2 = c530Var;
            qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 2, 1, 0, null, null, btsVar3, 805306368, 6, 14846);
            bts btsVar4 = btsVar3;
            CharSequence charSequence2 = n1p0Var.b;
            if (charSequence2 == null) {
                btsVar4.e0(-401544966);
                btsVar2 = btsVar4;
            } else {
                btsVar4.e0(-401544965);
                qgy.b(charSequence2, null, null, null, 0L, 0L, null, 0L, 2, 1, 0, null, null, btsVar4, 805306368, 6, 14846);
                btsVar2 = btsVar4;
            }
            i2 = 0;
            btsVar2.t(false);
            oeb1.c(btsVar2, ljs0.e(c530Var2, 12.0f));
            if (list.isEmpty()) {
                btsVar2.t(false);
                s1p0Var2 = s1p0Var;
                tlsVar2 = tlsVar;
            } else {
                Iterator it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (jl40.l(((m1p0) it.next()).a, n1p0Var.c.a)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                Integer valueOf = Integer.valueOf(i4);
                if (i4 == -1) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : 0;
                btsVar2.e0(-1675510619);
                int i5 = 0;
                for (Object obj : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        scc.m();
                        throw null;
                    }
                    m1p0 m1p0Var = (m1p0) obj;
                    byk0 c = cyk0.c(24.0f);
                    boolean z = intValue == i5;
                    if (z) {
                        btsVar2.e0(1250286315);
                        j = tje.n(AppColor$Palette.Control, btsVar2);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(1250287721);
                        btsVar2.t(false);
                        j = zp2.d;
                    }
                    f530 e = ljs0.e(ymb1.l(aab1.a(2.0f, j, bzk0.c(an91.m(c530Var2, 0.0f, f, 1), z ? AppColor$Palette.Background : AppColor$Palette.ControlMinor, c), c), c), 64.0f);
                    boolean z2 = !s1p0Var.e;
                    boolean k = ((i3 & 112) == 32) | btsVar2.k(m1p0Var);
                    Object Q = btsVar2.Q();
                    if (k || Q == did.a) {
                        r10 = 1;
                        Q = new x0p0(tlsVar, m1p0Var, 1);
                        btsVar2.o0(Q);
                    } else {
                        r10 = 1;
                    }
                    ydb1.a(q791.d(e, z2, null, null, (sls) Q, 14), null, wwg.S(-251387691, r10, new y0p0(m1p0Var, r10), btsVar2), null, wwg.S(191505807, r10, new kj6(z, 6), btsVar2), null, null, false, btsVar2, 24960, MSException.ERROR_MORE_DATA);
                    i5 = i6;
                    c530Var2 = c530Var2;
                    f = 4.0f;
                }
                i2 = 0;
                s1p0Var2 = s1p0Var;
                tlsVar2 = tlsVar;
                btsVar2.t(false);
                btsVar2.t(false);
            }
            btsVar2.t(true);
            btsVar = btsVar2;
        } else {
            i2 = 0;
            btsVar3.Y();
            btsVar = btsVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(s1p0Var2, tlsVar2, i, i2);
        }
    }

    public static final void e(s1p0 s1p0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1591794819);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(s1p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            o1p0 o1p0Var = s1p0Var.d;
            Bitmap bitmap = o1p0Var.a;
            Bitmap bitmap2 = o1p0Var.b;
            f530 m = ljs0.m(c530.a, 56.0f);
            boolean z = !s1p0Var.e;
            boolean z2 = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new lao0(10, tlsVar);
                btsVar.o0(Q);
            }
            o3b1.b(bitmap, q791.d(m, z, null, null, (sls) Q, 14), bitmap2, btsVar, 48);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z0p0(s1p0Var, tlsVar, i, i3);
        }
    }

    public static final void f(ibp0 ibp0Var, fid fidVar, int i) {
        aii0 v;
        ofj ofjVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2113960845);
        int i2 = 4;
        int i3 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        if (!btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (!((Boolean) btsVar.m(n.a)).booleanValue()) {
                v = btsVar.v();
                if (v != null) {
                    ofjVar = new ofj(ibp0Var, i, i2);
                    v.d = ofjVar;
                }
                return;
            }
            s8y.a(ibp0Var, null, btsVar, i3 & 14, 1);
        }
        v = btsVar.v();
        if (v != null) {
            ofjVar = new ofj(ibp0Var, i, 5);
            v.d = ofjVar;
        }
    }

    public static final void g(s1p0 s1p0Var, m1p0 m1p0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(197271220);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(s1p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(m1p0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 b = ofb1.b(ljs0.c(c530.a, 1.0f), s1p0Var.e, null, 14);
            boolean z = !s1p0Var.e;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new x0p0(tlsVar, m1p0Var, 0);
                btsVar.o0(Q);
            }
            phb1.b((sls) Q, b, z, null, null, wwg.S(1784540467, true, new y740(22, s1p0Var, m1p0Var), btsVar), null, null, null, btsVar, ImageMetadata.EDGE_MODE, 984);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(s1p0Var, m1p0Var, tlsVar, i, 1);
        }
    }

    public static final void h(a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-317616842);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            f530 c = bzk0.c(ymb1.l(an91.l(c530.a, 16.0f, 4.0f), cyk0.c(24.0f)), AppColor$Palette.BgMinor, qke.q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
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
            aVar.invoke(uic.a, btsVar, 54);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new k2z0(i, 19, aVar);
        }
    }

    public static final void i(s1p0 s1p0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-603528833);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(s1p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(10, s1p0Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z0p0(s1p0Var, tlsVar, i, i3);
        }
    }

    public static final void j(final q1p0 q1p0Var, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-91531689);
        int i2 = 4;
        int i3 = (btsVar.k(q1p0Var) ? 4 : 2) | i;
        final int i4 = 0;
        final int i5 = 1;
        if (!btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (q1p0Var == null) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(q1p0Var, i, i4) { // from class: v0p0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ q1p0 b;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.a;
                            zy11 zy11Var = zy11.a;
                            q1p0 q1p0Var2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    k4b1.j(q1p0Var2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    k4b1.j(q1p0Var2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            h(wwg.S(-601675009, true, new w7o0(i2, q1p0Var), btsVar), btsVar, 6);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(q1p0Var, i, i5) { // from class: v0p0
                public final /* synthetic */ int a;
                public final /* synthetic */ q1p0 b;

                {
                    this.a = i5;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = this.a;
                    zy11 zy11Var = zy11.a;
                    q1p0 q1p0Var2 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            k4b1.j(q1p0Var2, fidVar2, vng.O(1));
                            break;
                        default:
                            k4b1.j(q1p0Var2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void k(String str, CharSequence charSequence, CharSequence charSequence2, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(84493382);
        int i2 = 2;
        int i3 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(charSequence) ? 32 : 16) | (btsVar.k(charSequence2) ? 256 : 128) | (btsVar.a(z) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            ydb1.a(null, wwg.S(1889430640, true, new jk30(str, 22), btsVar), wwg.S(-1930369899, true, new mfa(charSequence, charSequence2, i2), btsVar), null, null, null, null, false, btsVar, 432, 249);
            if (z) {
                btsVar.e0(292035514);
                yrl.b(6, 6, btsVar, an91.o(c530.a, 56.0f, 0.0f, 0.0f, 0.0f, 14));
                btsVar.t(false);
            } else {
                btsVar.e0(292098940);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(str, charSequence, charSequence2, z, i, 17);
        }
    }

    public static final void l(List list, fid fidVar, int i) {
        CharSequence charSequence;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1521093017);
        int i2 = (btsVar.k(list) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                p1p0 p1p0Var = (p1p0) obj;
                int i5 = i3;
                String str = p1p0Var.a;
                CharSequence charSequence2 = p1p0Var.b;
                CharSequence charSequence3 = p1p0Var.c;
                if (i5 < scc.f(list)) {
                    charSequence = charSequence3;
                    z = true;
                } else {
                    charSequence = charSequence3;
                    z = false;
                }
                k(str, charSequence2, charSequence, z, btsVar, 0);
                i3 = i4;
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sn1(i, 10, list);
        }
    }

    public static final void m(final s1p0 s1p0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2046517695);
        int i2 = (btsVar.k(s1p0Var) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            m1p0 m1p0Var = s1p0Var.c.c;
            l1p0 l1p0Var = m1p0Var.h;
            c530 c530Var = c530.a;
            if (l1p0Var != null) {
                btsVar.e0(748065602);
                ydb1.a(an91.m(c530Var, 0.0f, 0.0f, 3), null, wwg.S(-1056218221, true, new zls() { // from class: u0p0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        s1p0 s1p0Var2 = s1p0Var;
                        switch (i5) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    m9b1.b(ebp0Var, s1p0Var2.a.a, an91.o(c530.a, 0.0f, 0.0f, 4.0f, 0.0f, 11), null, xya1.d(btsVar2).e.d, 0, 0, s1p0Var2.a.b, null, null, 0, 0, null, btsVar2, (intValue & 14) | 384, 0, 32628);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    r1p0 r1p0Var = s1p0Var2.a;
                                    m9b1.b(ebp0Var2, r1p0Var.a, null, null, null, 0, 0, r1p0Var.b, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 32638);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, wwg.S(55865369, true, new y0p0(m1p0Var, i3), btsVar), null, null, false, btsVar, 24966, MSException.ERROR_MORE_DATA);
                btsVar.t(false);
            } else {
                btsVar.e0(748846244);
                ydb1.a(an91.m(c530Var, 0.0f, 0.0f, 3), null, wwg.S(1062422442, true, new zls() { // from class: u0p0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        s1p0 s1p0Var2 = s1p0Var;
                        switch (i5) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    m9b1.b(ebp0Var, s1p0Var2.a.a, an91.o(c530.a, 0.0f, 0.0f, 4.0f, 0.0f, 11), null, xya1.d(btsVar2).e.d, 0, 0, s1p0Var2.a.b, null, null, 0, 0, null, btsVar2, (intValue & 14) | 384, 0, 32628);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    r1p0 r1p0Var = s1p0Var2.a;
                                    m9b1.b(ebp0Var2, r1p0Var.a, null, null, null, 0, 0, r1p0Var.b, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 32638);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, null, false, btsVar, 390, 250);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(s1p0Var, i, 8);
        }
    }

    public static int n(List list, InputStream inputStream, g63 g63Var) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new h(inputStream, g63Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int a = ((aav) list.get(i)).a(inputStream, g63Var);
                if (a != -1) {
                    return a;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType o(List list, InputStream inputStream, g63 g63Var) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new h(inputStream, g63Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType b = ((aav) list.get(i)).b(inputStream);
                inputStream.reset();
                if (b != ImageHeaderParser$ImageType.UNKNOWN) {
                    return b;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType p(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType c = ((aav) list.get(i)).c(byteBuffer);
                AtomicReference atomicReference = g77.a;
                if (c != ImageHeaderParser$ImageType.UNKNOWN) {
                    return c;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = g77.a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
