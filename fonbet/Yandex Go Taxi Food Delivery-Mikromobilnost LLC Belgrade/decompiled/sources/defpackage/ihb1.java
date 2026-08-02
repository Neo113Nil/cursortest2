package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public abstract class ihb1 {
    public static final void a(sr9 sr9Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-183581032);
        int i2 = 16;
        int i3 = (btsVar.k(sr9Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (!btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            btsVar.Y();
        } else if (sr9Var instanceof pna) {
            btsVar.e0(-327706861);
            c((pna) sr9Var, tlsVar, btsVar, (i3 & 112) | 8 | (i3 & 14));
            btsVar.t(false);
        } else if (sr9Var instanceof kna) {
            btsVar.e0(-327703593);
            b((kna) sr9Var, tlsVar, btsVar, (i3 & 112) | 8 | (i3 & 14));
            btsVar.t(false);
        } else {
            if (!(sr9Var instanceof mya)) {
                throw unr0.y(-327708115, btsVar, false);
            }
            btsVar.e0(-327700307);
            d((mya) sr9Var, tlsVar, btsVar, (i3 & 112) | 8 | (i3 & 14));
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(sr9Var, tlsVar, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0182, code lost:
    
        if (r5 == r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(kna knaVar, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        kna knaVar2;
        o430 o430Var;
        boolean z;
        boolean z2;
        Object Q;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-574377218);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(knaVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            AppColor$Palette appColor$Palette = AppColor$Palette.Background;
            gji0 gji0Var = qke.q;
            f530 c2 = bzk0.c(c, appColor$Palette, gji0Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c2);
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
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            CharSequence charSequence = knaVar.l;
            uo9 uo9Var = knaVar.m;
            ety0 ety0Var = xya1.e(btsVar).h.a;
            AppColor$Palette appColor$Palette2 = AppColor$Palette.TextMinor;
            f530 n = an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 8.0f, 16.0f, 14.0f);
            int i3 = i2 & 112;
            boolean z4 = i3 == 32;
            Object Q2 = btsVar.Q();
            o430 o430Var2 = did.a;
            if (z4 || Q2 == o430Var2) {
                Q2 = new a0(29, tlsVar);
                btsVar.o0(Q2);
            }
            qgy.b(charSequence, null, n, appColor$Palette2, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, (tls) Q2, btsVar, 3456, 0, 4082);
            btsVar = btsVar;
            if (uo9Var == null) {
                btsVar.e0(-617911959);
                btsVar.t(false);
                z3 = true;
                knaVar2 = knaVar;
                tlsVar2 = tlsVar;
            } else {
                btsVar.e0(-617911958);
                f530 k = an91.k(i9a1.d(bzk0.c(ymb1.l(ljs0.c(c530Var, 1.0f), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), AppColor$Palette.BgFloating, gji0Var)), 8.0f);
                boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
                Object Q3 = btsVar.Q();
                if (b) {
                    o430Var = o430Var2;
                } else {
                    o430Var = o430Var2;
                }
                Q3 = new jg0(5);
                btsVar.o0(Q3);
                z910 z910Var = (z910) Q3;
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = b.d(btsVar, k);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, z910Var);
                qje.W(btsVar, wlsVar2, o2);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
                qje.W(btsVar, wlsVar4, d2);
                ButtonStyle buttonStyle = ButtonStyle.Main;
                f530 c3 = ljs0.c(c530Var, 1.0f);
                boolean z5 = uo9Var.c;
                boolean z6 = i3 == 32;
                if ((i2 & 14) != 4) {
                    knaVar2 = knaVar;
                    if (!btsVar.e(knaVar2)) {
                        z = false;
                        z2 = z | z6;
                        Q = btsVar.Q();
                        if (!z2 || Q == o430Var) {
                            tlsVar2 = tlsVar;
                            Q = new u08(18, tlsVar2, knaVar2);
                            btsVar.o0(Q);
                        } else {
                            tlsVar2 = tlsVar;
                        }
                        z3 = true;
                        d17.c(c3, z5, null, buttonStyle, null, (sls) Q, wwg.S(-1517267273, true, new bj0(26, knaVar2), btsVar), btsVar, 1575942, 20);
                        btsVar.t(true);
                        btsVar.t(false);
                    }
                } else {
                    knaVar2 = knaVar;
                }
                z = true;
                z2 = z | z6;
                Q = btsVar.Q();
                if (z2) {
                }
                tlsVar2 = tlsVar;
                Q = new u08(18, tlsVar2, knaVar2);
                btsVar.o0(Q);
                z3 = true;
                d17.c(c3, z5, null, buttonStyle, null, (sls) Q, wwg.S(-1517267273, true, new bj0(26, knaVar2), btsVar), btsVar, 1575942, 20);
                btsVar.t(true);
                btsVar.t(false);
            }
            btsVar.t(z3);
        } else {
            tlsVar2 = tlsVar;
            knaVar2 = knaVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(knaVar2, tlsVar2, i, 19);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c8, code lost:
    
        if (r5 == r4) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final pna pnaVar, final tls tlsVar, fid fidVar, int i) {
        final tls tlsVar2;
        final pna pnaVar2;
        o430 o430Var;
        boolean z;
        boolean z2;
        Object Q;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-926442248);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(pnaVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        final int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            AppColor$Palette appColor$Palette = AppColor$Palette.CardDivider;
            gji0 gji0Var = qke.q;
            f530 c2 = bzk0.c(bzk0.c(c, appColor$Palette, gji0Var), AppColor$Palette.Background, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12));
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c2);
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
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            CharSequence charSequence = pnaVar.f;
            uo9 uo9Var = pnaVar.h;
            int i4 = i2 & 112;
            int i5 = i2 & 14;
            boolean z4 = (i4 == 32) | (i5 == 4 || btsVar.e(pnaVar));
            Object Q2 = btsVar.Q();
            o430 o430Var2 = did.a;
            if (z4 || Q2 == o430Var2) {
                Q2 = new sls() { // from class: qr9
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i3;
                        zy11 zy11Var = zy11.a;
                        pna pnaVar3 = pnaVar;
                        tls tlsVar4 = tlsVar;
                        switch (i6) {
                            case 0:
                                tlsVar4.invoke(new cs9(pnaVar3.a));
                                break;
                            default:
                                uj9 uj9Var = pnaVar3.h.d;
                                if (uj9Var == null) {
                                    uj9Var = tj9.a;
                                }
                                tlsVar4.invoke(new es9(uj9Var));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q2);
            }
            e(charSequence, (sls) Q2, btsVar, 0);
            CharSequence charSequence2 = pnaVar.g;
            ety0 ety0Var = xya1.e(btsVar).h.a;
            AppColor$Palette appColor$Palette2 = AppColor$Palette.TextMinor;
            f530 n = an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 8.0f, 16.0f, 14.0f);
            boolean z5 = i4 == 32;
            Object Q3 = btsVar.Q();
            if (z5 || Q3 == o430Var2) {
                Q3 = new a0(28, tlsVar);
                btsVar.o0(Q3);
            }
            qgy.b(charSequence2, null, n, appColor$Palette2, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, (tls) Q3, btsVar, 3456, 0, 4082);
            btsVar = btsVar;
            if (uo9Var == null) {
                btsVar.e0(1793659503);
                btsVar.t(false);
                z3 = true;
                pnaVar2 = pnaVar;
                tlsVar2 = tlsVar;
            } else {
                btsVar.e0(1793659504);
                f530 k = an91.k(i9a1.d(bzk0.c(ymb1.l(ljs0.c(c530Var, 1.0f), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), AppColor$Palette.BgFloating, gji0Var)), 8.0f);
                boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
                Object Q4 = btsVar.Q();
                if (b) {
                    o430Var = o430Var2;
                } else {
                    o430Var = o430Var2;
                }
                Q4 = new jg0(6);
                btsVar.o0(Q4);
                z910 z910Var = (z910) Q4;
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = b.d(btsVar, k);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, z910Var);
                qje.W(btsVar, wlsVar2, o2);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
                qje.W(btsVar, wlsVar4, d2);
                ButtonStyle buttonStyle = ButtonStyle.Main;
                f530 c3 = ljs0.c(c530Var, 1.0f);
                boolean z6 = uo9Var.c;
                boolean z7 = i4 == 32;
                if (i5 != 4) {
                    pnaVar2 = pnaVar;
                    if (!btsVar.e(pnaVar2)) {
                        z = false;
                        z2 = z | z7;
                        Q = btsVar.Q();
                        if (!z2 || Q == o430Var) {
                            tlsVar2 = tlsVar;
                            z3 = true;
                            final char c4 = 1 == true ? 1 : 0;
                            Q = new sls() { // from class: qr9
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i6 = c4;
                                    zy11 zy11Var = zy11.a;
                                    pna pnaVar3 = pnaVar2;
                                    tls tlsVar4 = tlsVar2;
                                    switch (i6) {
                                        case 0:
                                            tlsVar4.invoke(new cs9(pnaVar3.a));
                                            break;
                                        default:
                                            uj9 uj9Var = pnaVar3.h.d;
                                            if (uj9Var == null) {
                                                uj9Var = tj9.a;
                                            }
                                            tlsVar4.invoke(new es9(uj9Var));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            btsVar.o0(Q);
                        } else {
                            tlsVar2 = tlsVar;
                            z3 = true;
                        }
                        d17.c(c3, z6, null, buttonStyle, null, (sls) Q, wwg.S(-1820208783, z3, new bj0(25, pnaVar2), btsVar), btsVar, 1575942, 20);
                        btsVar.t(z3);
                        btsVar.t(false);
                    }
                } else {
                    pnaVar2 = pnaVar;
                }
                z = true;
                z2 = z | z7;
                Q = btsVar.Q();
                if (z2) {
                }
                tlsVar2 = tlsVar;
                z3 = true;
                final int c42 = 1 == true ? 1 : 0;
                Q = new sls() { // from class: qr9
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = c42;
                        zy11 zy11Var = zy11.a;
                        pna pnaVar3 = pnaVar2;
                        tls tlsVar4 = tlsVar2;
                        switch (i6) {
                            case 0:
                                tlsVar4.invoke(new cs9(pnaVar3.a));
                                break;
                            default:
                                uj9 uj9Var = pnaVar3.h.d;
                                if (uj9Var == null) {
                                    uj9Var = tj9.a;
                                }
                                tlsVar4.invoke(new es9(uj9Var));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q);
                d17.c(c3, z6, null, buttonStyle, null, (sls) Q, wwg.S(-1820208783, z3, new bj0(25, pnaVar2), btsVar), btsVar, 1575942, 20);
                btsVar.t(z3);
                btsVar.t(false);
            }
            btsVar.t(z3);
        } else {
            tlsVar2 = tlsVar;
            pnaVar2 = pnaVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(pnaVar2, tlsVar2, i, 18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0184, code lost:
    
        if (r5 == r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(mya myaVar, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        int i2;
        mya myaVar2;
        o430 o430Var;
        boolean z;
        boolean z2;
        Object Q;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2032287438);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | (btsVar.e(myaVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            AppColor$Palette appColor$Palette = AppColor$Palette.Background;
            gji0 gji0Var = qke.q;
            f530 c2 = bzk0.c(c, appColor$Palette, gji0Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c2);
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
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            CharSequence charSequence = myaVar.k;
            uo9 uo9Var = myaVar.l;
            ety0 ety0Var = xya1.e(btsVar).h.a;
            AppColor$Palette appColor$Palette2 = AppColor$Palette.TextMinor;
            f530 n = an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 8.0f, 16.0f, 14.0f);
            int i4 = i3 & 112;
            boolean z4 = i4 == 32;
            Object Q2 = btsVar.Q();
            o430 o430Var2 = did.a;
            if (z4 || Q2 == o430Var2) {
                Q2 = new a0(27, tlsVar);
                btsVar.o0(Q2);
            }
            qgy.b(charSequence, null, n, appColor$Palette2, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, (tls) Q2, btsVar, 3456, 0, 4082);
            btsVar = btsVar;
            if (uo9Var == null) {
                btsVar.e0(73363897);
                btsVar.t(false);
                i2 = 17;
                z3 = true;
                myaVar2 = myaVar;
                tlsVar2 = tlsVar;
            } else {
                btsVar.e0(73363898);
                f530 k = an91.k(i9a1.d(bzk0.c(ymb1.l(ljs0.c(c530Var, 1.0f), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), AppColor$Palette.BgFloating, gji0Var)), 8.0f);
                boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
                Object Q3 = btsVar.Q();
                if (b) {
                    o430Var = o430Var2;
                } else {
                    o430Var = o430Var2;
                }
                Q3 = new jg0(7);
                btsVar.o0(Q3);
                z910 z910Var = (z910) Q3;
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = b.d(btsVar, k);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, z910Var);
                qje.W(btsVar, wlsVar2, o2);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
                qje.W(btsVar, wlsVar4, d2);
                ButtonStyle buttonStyle = ButtonStyle.Main;
                f530 c3 = ljs0.c(c530Var, 1.0f);
                boolean z5 = uo9Var.c;
                boolean z6 = i4 == 32;
                if ((i3 & 14) != 4) {
                    myaVar2 = myaVar;
                    if (!btsVar.e(myaVar2)) {
                        z = false;
                        z2 = z | z6;
                        Q = btsVar.Q();
                        if (!z2 || Q == o430Var) {
                            tlsVar2 = tlsVar;
                            i2 = 17;
                            Q = new u08(i2, tlsVar2, myaVar2);
                            btsVar.o0(Q);
                        } else {
                            tlsVar2 = tlsVar;
                            i2 = 17;
                        }
                        z3 = true;
                        d17.c(c3, z5, null, buttonStyle, null, (sls) Q, wwg.S(10922887, true, new bj0(24, myaVar2), btsVar), btsVar, 1575942, 20);
                        btsVar.t(true);
                        btsVar.t(false);
                    }
                } else {
                    myaVar2 = myaVar;
                }
                z = true;
                z2 = z | z6;
                Q = btsVar.Q();
                if (z2) {
                }
                tlsVar2 = tlsVar;
                i2 = 17;
                Q = new u08(i2, tlsVar2, myaVar2);
                btsVar.o0(Q);
                z3 = true;
                d17.c(c3, z5, null, buttonStyle, null, (sls) Q, wwg.S(10922887, true, new bj0(24, myaVar2), btsVar), btsVar, 1575942, 20);
                btsVar.t(true);
                btsVar.t(false);
            }
            btsVar.t(z3);
        } else {
            tlsVar2 = tlsVar;
            i2 = 17;
            myaVar2 = myaVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(myaVar2, tlsVar2, i, i2);
        }
    }

    public static final void e(CharSequence charSequence, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1118895828);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        int i3 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (charSequence == null || charSequence.length() <= 0) {
            btsVar.e0(-214724146);
            btsVar.t(false);
        } else {
            btsVar.e0(-215444059);
            f530 l = ymb1.l(c530.a, zr9.a);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new jc0(13, slsVar);
                btsVar.o0(Q);
            }
            f530 d = q791.d(l, false, null, null, (sls) Q, 15);
            a S = wwg.S(1727405736, true, new or9(i3, charSequence), btsVar);
            l4d.a.getClass();
            ydb1.a(d, null, S, null, l4d.b, null, null, false, btsVar, 24960, MSException.ERROR_MORE_DATA);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pr9(charSequence, slsVar, i, i3);
        }
    }

    public static boolean f(Object obj) {
        if (obj instanceof String) {
            return evu0.J((CharSequence) obj);
        }
        throw oyr.y(obj, "Function \"blank\" is not defined for ");
    }

    public static boolean g(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return cvu0.s((String) obj, (String) obj2, false);
        }
        throw jason.statham.interpreter.error.a.a("Function \"endswith\" is not defined for " + obj + Extension.FIX_SPACE + obj2);
    }

    public static String h(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).toLowerCase(Locale.ROOT);
        }
        throw oyr.y(obj, "Function \"lower\" is not defined for ");
    }

    public static long i(File file, ArrayList arrayList) {
        long j = 0;
        if (file.exists()) {
            z83.h(null, file.isDirectory());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        j = i(file2, arrayList) + j;
                    } else {
                        long length = file2.length();
                        arrayList.add(new nzz(length, file2.lastModified(), file2));
                        j += length;
                    }
                }
                return j;
            }
        }
        return 0L;
    }

    public static String j(Object obj, Object obj2, Object obj3) {
        if ((obj instanceof String) && (obj2 instanceof String) && (obj3 instanceof String)) {
            return cvu0.v((String) obj, (String) obj2, (String) obj3, false);
        }
        throw jason.statham.interpreter.error.a.a("Function \"replace\" is not defined for " + rhb1.e(obj) + Extension.FIX_SPACE + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
    }

    public static boolean k(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return cvu0.x((String) obj, (String) obj2, false);
        }
        throw jason.statham.interpreter.error.a.a("Function \"startswith\" is not defined for " + obj + Extension.FIX_SPACE + obj2);
    }

    public static String l(Object obj, Object obj2, Object obj3) {
        if (!(obj instanceof String) || !(obj2 instanceof Long) || !(obj3 instanceof Long)) {
            throw jason.statham.interpreter.error.a.a("Function \"substring\" is not defined for " + obj + Extension.FIX_SPACE + obj2 + Extension.FIX_SPACE + obj3);
        }
        Number number = (Number) obj2;
        if (number.longValue() < 0) {
            throw jason.statham.interpreter.error.a.a("Range start " + obj2 + " is less than zero");
        }
        Number number2 = (Number) obj3;
        String str = (String) obj;
        if (number2.longValue() > str.length()) {
            throw jason.statham.interpreter.error.a.a("Range end " + obj3 + " is more than string length " + str.length());
        }
        if (number.longValue() <= number2.longValue()) {
            return str.substring((int) number.longValue(), (int) number2.longValue());
        }
        throw jason.statham.interpreter.error.a.a("Range start " + obj2 + " is more than end " + obj3);
    }

    public static String m(Object obj) {
        if (obj instanceof String) {
            return evu0.k0((String) obj).toString();
        }
        throw oyr.y(obj, "Function \"trim\" is not defined for ");
    }

    public static void n(File file, long j, float f) {
        ArrayList arrayList = new ArrayList();
        long i = i(file, arrayList);
        if (i <= j) {
            return;
        }
        Collections.sort(arrayList, new rvr(11));
        long j2 = (long) (i - (j * f));
        if (ydz.a.a()) {
            ydz.a();
        }
        while (j2 > 0 && !arrayList.isEmpty()) {
            nzz nzzVar = (nzz) arrayList.remove(arrayList.size() - 1);
            if (nzzVar.a.delete()) {
                j2 -= nzzVar.b;
            }
        }
    }

    public static String o(Object obj) {
        if (obj instanceof String) {
            return evu0.m0((String) obj).toString();
        }
        throw oyr.y(obj, "Function \"trimend\" is not defined for ");
    }

    public static String p(Object obj) {
        if (obj instanceof String) {
            return evu0.o0((String) obj).toString();
        }
        throw oyr.y(obj, "Function \"trimstart\" is not defined for ");
    }

    public static String q(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).toUpperCase(Locale.ROOT);
        }
        throw oyr.y(obj, "Function \"upper\" is not defined for ");
    }
}
