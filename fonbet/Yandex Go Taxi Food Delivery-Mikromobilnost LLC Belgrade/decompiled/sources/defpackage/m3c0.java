package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes5.dex */
public abstract class m3c0 {
    public static final byk0 a = cyk0.c(12.0f);

    public static final void a(boolean z, final f530 f530Var, final au2 au2Var, final String str, final boolean z2, final sls slsVar, fid fidVar, final int i, final int i2) {
        boolean z3;
        int i3;
        final boolean z4;
        aii0 v;
        wls wlsVar;
        int i4;
        final boolean z5;
        f530 b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1989096232);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            i3 = i | (btsVar.a(z3) ? 4 : 2);
        }
        int i6 = i3 | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.k(au2Var) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024) | (btsVar.a(z2) ? 16384 : 8192) | (btsVar.e(slsVar) ? 131072 : 65536);
        if (btsVar.V(i6 & 1, (74899 & i6) != 74898)) {
            if (i5 != 0) {
                i4 = 2;
                z5 = true;
            } else {
                i4 = 2;
                z5 = z3;
            }
            if (!z5) {
                v = btsVar.v();
                if (v != null) {
                    final int i7 = 0;
                    wlsVar = new wls(z5, f530Var, au2Var, str, z2, slsVar, i, i2, i7) { // from class: l3c0
                        public final /* synthetic */ int A;
                        public final /* synthetic */ int a;
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ f530 c;
                        public final /* synthetic */ au2 w;
                        public final /* synthetic */ String x;
                        public final /* synthetic */ boolean y;
                        public final /* synthetic */ sls z;

                        {
                            this.a = i7;
                            this.A = i2;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(1);
                                    m3c0.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O, this.A);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(1);
                                    m3c0.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O2, this.A);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            boolean z6 = z5;
            byk0 byk0Var = a;
            if (z2) {
                btsVar.e0(-497717592);
                btsVar.t(false);
                b = bzk0.c(ljs0.e(f530Var, 40.0f), AppColor$Palette.Text, byk0Var);
            } else {
                btsVar.e0(-497629490);
                f530 e = ljs0.e(f530Var, 40.0f);
                xa6 a2 = eab1.a(0.5f, tje.n(AppColor$Palette.Line, btsVar));
                b = aab1.b(e, a2.a, a2.b, byk0Var);
                btsVar.t(false);
            }
            f530 m = an91.m(q791.b(b, null, null, false, null, new awk0(0), slsVar, 12), 12.0f, 0.0f, i4);
            lhl0 a3 = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            AppColor$Palette appColor$Palette = z2 ? AppColor$Palette.TextInvert : AppColor$Palette.Text;
            sya1.a(au2Var, null, null, appColor$Palette, btsVar, (i6 >> 6) & 14, 6);
            oeb1.c(btsVar, ljs0.q(c530.a, 4.0f));
            jeb1.f(str, null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, (i6 >> 9) & 14, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
            z4 = z6;
        } else {
            btsVar.Y();
            z4 = z3;
        }
        v = btsVar.v();
        if (v != null) {
            final int i8 = 1;
            wlsVar = new wls(z4, f530Var, au2Var, str, z2, slsVar, i, i2, i8) { // from class: l3c0
                public final /* synthetic */ int A;
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ f530 c;
                public final /* synthetic */ au2 w;
                public final /* synthetic */ String x;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ sls z;

                {
                    this.a = i8;
                    this.A = i2;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i82 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i82) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(1);
                            m3c0.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O, this.A);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(1);
                            m3c0.a(this.b, this.c, this.w, this.x, this.y, this.z, (fid) obj, O2, this.A);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(final n3c0 n3c0Var, final tls tlsVar, fid fidVar, final int i) {
        final tls tlsVar2;
        final n3c0 n3c0Var2;
        bts btsVar;
        aii0 v;
        wls wlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-15201048);
        int i2 = (btsVar2.k(n3c0Var) ? 4 : 2) | i | (btsVar2.e(tlsVar) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            PlaceType placeType = n3c0Var.a;
            boolean z = n3c0Var.b;
            boolean z2 = n3c0Var.c;
            if (!z2 && !z) {
                v = btsVar2.v();
                if (v != null) {
                    wlsVar = new wls(n3c0Var, tlsVar, i, i3) { // from class: k3c0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ n3c0 b;
                        public final /* synthetic */ tls c;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            tls tlsVar3 = this.c;
                            n3c0 n3c0Var3 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    m3c0.b(n3c0Var3, tlsVar3, fidVar2, vng.O(1));
                                    break;
                                default:
                                    m3c0.b(n3c0Var3, tlsVar3, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            tlsVar2 = tlsVar;
            n3c0Var2 = n3c0Var;
            btsVar = btsVar2;
            xab1.a(an91.o(ljs0.c(c530.a, 1.0f), 16.0f, 0.0f, 16.0f, 8.0f, 2), null, wwg.S(-1771932078, true, new fi0(z, placeType, tlsVar, z2, n3c0Var), btsVar2), btsVar, 3078, 6);
        } else {
            tlsVar2 = tlsVar;
            n3c0Var2 = n3c0Var;
            btsVar = btsVar2;
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(n3c0Var2, tlsVar2, i, i4) { // from class: k3c0
                public final /* synthetic */ int a;
                public final /* synthetic */ n3c0 b;
                public final /* synthetic */ tls c;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar3 = this.c;
                    n3c0 n3c0Var3 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            m3c0.b(n3c0Var3, tlsVar3, fidVar2, vng.O(1));
                            break;
                        default:
                            m3c0.b(n3c0Var3, tlsVar3, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
