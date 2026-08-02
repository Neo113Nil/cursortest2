package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import skeletor.render.SkeletonContentView;

/* loaded from: classes6.dex */
public abstract class cpb1 {
    public static mgv a;

    public static final void a(final lyy0 lyy0Var, wls wlsVar, f530 f530Var, boolean z, fid fidVar, int i) {
        f530 f530Var2;
        boolean z2;
        m540 m540Var = lyy0Var.i;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1219553202);
        int i2 = i | (btsVar.k(lyy0Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new teb(20);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 b = fnq0.b(c530Var, true, (tls) Q);
            boolean z3 = m540Var != null;
            boolean z4 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (z4 || Q2 == o430Var) {
                Q2 = new ve30(11, lyy0Var, wlsVar);
                btsVar.o0(Q2);
            }
            ydb1.a(q791.d(b, z3, null, null, (sls) Q2, 14), wwg.S(-715152420, true, new zls() { // from class: e640
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    final lyy0 lyy0Var2 = lyy0Var;
                    Object[] objArr = 0;
                    final int i7 = 1;
                    switch (i6) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                cpb1.c(ibp0Var.c().getSize(), xob1.f(lyy0Var2.a, true), 0, tje.n(lyy0Var2.h, btsVar2), btsVar2, null);
                                break;
                            }
                        default:
                            final ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                v9b1.a(ebp0Var, wwg.S(1964872769, true, new wls() { // from class: d640
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i8 = objArr2;
                                        zy11 zy11Var2 = zy11.a;
                                        lyy0 lyy0Var3 = lyy0Var2;
                                        switch (i8) {
                                            case 0:
                                                fid fidVar4 = (fid) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                bts btsVar4 = (bts) fidVar4;
                                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    btsVar4.Y();
                                                    break;
                                                } else {
                                                    p9b1.c(ebp0Var, lyy0Var3.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, ohb1.d(kyh0.mt_destination_stop_prefix, new Object[]{lyy0Var3.c}, btsVar4), AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, 0, 0, 0);
                                                    break;
                                                }
                                            default:
                                                boolean z5 = lyy0Var3.f;
                                                fid fidVar5 = (fid) obj4;
                                                int intValue4 = ((Integer) obj5).intValue();
                                                bts btsVar5 = (bts) fidVar5;
                                                if (!btsVar5.V(1 & intValue4, (intValue4 & 3) != 2)) {
                                                    btsVar5.Y();
                                                    break;
                                                } else {
                                                    hk2 hk2Var = new hk2(0);
                                                    if (z5) {
                                                        n6b1.a(hk2Var, "circle", "�");
                                                    }
                                                    hk2Var.d(lyy0Var3.d);
                                                    kk2 i9 = hk2Var.i();
                                                    r3c0 r3c0Var = new r3c0(4, uh6.E(16), uh6.E(16));
                                                    l9d.a.getClass();
                                                    Map e = gw00.e(new Pair("circle", new oxv(r3c0Var, l9d.b)));
                                                    wp2 up2Var = z5 ? new up2(eq2.b) : AppColor$Palette.Text;
                                                    ety0 ety0Var = xya1.e(btsVar5).g.b;
                                                    hk2 hk2Var2 = new hk2(0);
                                                    hk2Var2.d(lyy0Var3.e);
                                                    p9b1.b(ebp0Var, i9, e, null, up2Var, ety0Var, 0, 0, hk2Var2.i(), null, AppColor$Palette.Text, null, 0, 0, btsVar5, 0, 6, 32100);
                                                    break;
                                                }
                                        }
                                        return zy11Var2;
                                    }
                                }, btsVar3), wwg.S(927862368, true, new wls() { // from class: d640
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i8 = i7;
                                        zy11 zy11Var2 = zy11.a;
                                        lyy0 lyy0Var3 = lyy0Var2;
                                        switch (i8) {
                                            case 0:
                                                fid fidVar4 = (fid) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                bts btsVar4 = (bts) fidVar4;
                                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    btsVar4.Y();
                                                    break;
                                                } else {
                                                    p9b1.c(ebp0Var, lyy0Var3.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, ohb1.d(kyh0.mt_destination_stop_prefix, new Object[]{lyy0Var3.c}, btsVar4), AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, 0, 0, 0);
                                                    break;
                                                }
                                            default:
                                                boolean z5 = lyy0Var3.f;
                                                fid fidVar5 = (fid) obj4;
                                                int intValue4 = ((Integer) obj5).intValue();
                                                bts btsVar5 = (bts) fidVar5;
                                                if (!btsVar5.V(1 & intValue4, (intValue4 & 3) != 2)) {
                                                    btsVar5.Y();
                                                    break;
                                                } else {
                                                    hk2 hk2Var = new hk2(0);
                                                    if (z5) {
                                                        n6b1.a(hk2Var, "circle", "�");
                                                    }
                                                    hk2Var.d(lyy0Var3.d);
                                                    kk2 i9 = hk2Var.i();
                                                    r3c0 r3c0Var = new r3c0(4, uh6.E(16), uh6.E(16));
                                                    l9d.a.getClass();
                                                    Map e = gw00.e(new Pair("circle", new oxv(r3c0Var, l9d.b)));
                                                    wp2 up2Var = z5 ? new up2(eq2.b) : AppColor$Palette.Text;
                                                    ety0 ety0Var = xya1.e(btsVar5).g.b;
                                                    hk2 hk2Var2 = new hk2(0);
                                                    hk2Var2.d(lyy0Var3.e);
                                                    p9b1.b(ebp0Var, i9, e, null, up2Var, ety0Var, 0, 0, hk2Var2.i(), null, AppColor$Palette.Text, null, 0, 0, btsVar5, 0, 6, 32100);
                                                    break;
                                                }
                                        }
                                        return zy11Var2;
                                    }
                                }, btsVar3), null, 0.0f, null, null, btsVar3, (intValue2 & 14) | 432);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-198638079, true, new zls() { // from class: e640
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    final lyy0 lyy0Var2 = lyy0Var;
                    Object[] objArr = 0;
                    final int i7 = 1;
                    switch (i6) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                cpb1.c(ibp0Var.c().getSize(), xob1.f(lyy0Var2.a, true), 0, tje.n(lyy0Var2.h, btsVar2), btsVar2, null);
                                break;
                            }
                        default:
                            final ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                final int objArr2 = objArr == true ? 1 : 0;
                                v9b1.a(ebp0Var, wwg.S(1964872769, true, new wls() { // from class: d640
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i8 = objArr2;
                                        zy11 zy11Var2 = zy11.a;
                                        lyy0 lyy0Var3 = lyy0Var2;
                                        switch (i8) {
                                            case 0:
                                                fid fidVar4 = (fid) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                bts btsVar4 = (bts) fidVar4;
                                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    btsVar4.Y();
                                                    break;
                                                } else {
                                                    p9b1.c(ebp0Var, lyy0Var3.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, ohb1.d(kyh0.mt_destination_stop_prefix, new Object[]{lyy0Var3.c}, btsVar4), AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, 0, 0, 0);
                                                    break;
                                                }
                                            default:
                                                boolean z5 = lyy0Var3.f;
                                                fid fidVar5 = (fid) obj4;
                                                int intValue4 = ((Integer) obj5).intValue();
                                                bts btsVar5 = (bts) fidVar5;
                                                if (!btsVar5.V(1 & intValue4, (intValue4 & 3) != 2)) {
                                                    btsVar5.Y();
                                                    break;
                                                } else {
                                                    hk2 hk2Var = new hk2(0);
                                                    if (z5) {
                                                        n6b1.a(hk2Var, "circle", "�");
                                                    }
                                                    hk2Var.d(lyy0Var3.d);
                                                    kk2 i9 = hk2Var.i();
                                                    r3c0 r3c0Var = new r3c0(4, uh6.E(16), uh6.E(16));
                                                    l9d.a.getClass();
                                                    Map e = gw00.e(new Pair("circle", new oxv(r3c0Var, l9d.b)));
                                                    wp2 up2Var = z5 ? new up2(eq2.b) : AppColor$Palette.Text;
                                                    ety0 ety0Var = xya1.e(btsVar5).g.b;
                                                    hk2 hk2Var2 = new hk2(0);
                                                    hk2Var2.d(lyy0Var3.e);
                                                    p9b1.b(ebp0Var, i9, e, null, up2Var, ety0Var, 0, 0, hk2Var2.i(), null, AppColor$Palette.Text, null, 0, 0, btsVar5, 0, 6, 32100);
                                                    break;
                                                }
                                        }
                                        return zy11Var2;
                                    }
                                }, btsVar3), wwg.S(927862368, true, new wls() { // from class: d640
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i8 = i7;
                                        zy11 zy11Var2 = zy11.a;
                                        lyy0 lyy0Var3 = lyy0Var2;
                                        switch (i8) {
                                            case 0:
                                                fid fidVar4 = (fid) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                bts btsVar4 = (bts) fidVar4;
                                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    btsVar4.Y();
                                                    break;
                                                } else {
                                                    p9b1.c(ebp0Var, lyy0Var3.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, ohb1.d(kyh0.mt_destination_stop_prefix, new Object[]{lyy0Var3.c}, btsVar4), AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, 0, 0, 0);
                                                    break;
                                                }
                                            default:
                                                boolean z5 = lyy0Var3.f;
                                                fid fidVar5 = (fid) obj4;
                                                int intValue4 = ((Integer) obj5).intValue();
                                                bts btsVar5 = (bts) fidVar5;
                                                if (!btsVar5.V(1 & intValue4, (intValue4 & 3) != 2)) {
                                                    btsVar5.Y();
                                                    break;
                                                } else {
                                                    hk2 hk2Var = new hk2(0);
                                                    if (z5) {
                                                        n6b1.a(hk2Var, "circle", "�");
                                                    }
                                                    hk2Var.d(lyy0Var3.d);
                                                    kk2 i9 = hk2Var.i();
                                                    r3c0 r3c0Var = new r3c0(4, uh6.E(16), uh6.E(16));
                                                    l9d.a.getClass();
                                                    Map e = gw00.e(new Pair("circle", new oxv(r3c0Var, l9d.b)));
                                                    wp2 up2Var = z5 ? new up2(eq2.b) : AppColor$Palette.Text;
                                                    ety0 ety0Var = xya1.e(btsVar5).g.b;
                                                    hk2 hk2Var2 = new hk2(0);
                                                    hk2Var2.d(lyy0Var3.e);
                                                    p9b1.b(ebp0Var, i9, e, null, up2Var, ety0Var, 0, 0, hk2Var2.i(), null, AppColor$Palette.Text, null, 0, 0, btsVar5, 0, 6, 32100);
                                                    break;
                                                }
                                        }
                                        return zy11Var2;
                                    }
                                }, btsVar3), null, 0.0f, null, null, btsVar3, (intValue2 & 14) | 432);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, m540Var != null ? na01.a : ka01.a, null, null, false, btsVar, 432, 232);
            z2 = true;
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(lyy0Var, wlsVar, f530Var2, z2, i, 17);
        }
    }

    public static final void b(final nyy0 nyy0Var, f530 f530Var, boolean z, fid fidVar, int i) {
        f530 f530Var2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1226313110);
        int i2 = i | (btsVar.e(nyy0Var) ? 4 : 2) | 432;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            a S = wwg.S(-1108758208, true, new zls() { // from class: c640
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    nyy0 nyy0Var2 = nyy0Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                cpb1.c(ibp0Var.c().getSize(), xob1.f(nyy0Var2.a, true), 0, tje.n(nyy0Var2.d, btsVar2), btsVar2, null);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, nyy0Var2.b, c530.a, tp2.a, xya1.e(btsVar3).g.a, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar3).h.a, 2, Integer.MAX_VALUE, null, btsVar3, intValue2 & 14, 0, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            a S2 = wwg.S(-10693851, true, new zls() { // from class: c640
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    nyy0 nyy0Var2 = nyy0Var;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                cpb1.c(ibp0Var.c().getSize(), xob1.f(nyy0Var2.a, true), 0, tje.n(nyy0Var2.d, btsVar2), btsVar2, null);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, nyy0Var2.b, c530.a, tp2.a, xya1.e(btsVar3).g.a, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar3).h.a, 2, Integer.MAX_VALUE, null, btsVar3, intValue2 & 14, 0, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            c530 c530Var = c530.a;
            ydb1.a(c530Var, S, S2, null, null, null, null, false, btsVar, 438, 248);
            f530Var2 = c530Var;
            z2 = true;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(nyy0Var, f530Var2, z2, i, 15);
        }
    }

    public static final void c(float f, int i, int i2, long j, fid fidVar, f530 f530Var) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2082854821);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i2 | (btsVar.c(i) ? 4 : 2) | (btsVar.d(j) ? 32 : 16) | (btsVar.b(f) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(ljs0.a(c530Var, f, f), 2.0f);
            uo5 uo5Var = x4c.y;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 b = m4m0.b(ljs0.m(c530Var, 24.0f), j, cyk0.c(8.0f));
            z910 d3 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            o4b1.b(vfc.k(i, ((i3 & 14) | 432) & 14, -1411607277, btsVar, false), null, ljs0.m(c530Var, 16.0f), null, null, 0.0f, null, btsVar, 440, 56);
            btsVar.t(true);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new btm(i, j, f, f530Var2, i2);
        }
    }

    public static final void d(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1855371710);
        int i2 = i | 6;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            l9d.a.getClass();
            a aVar = l9d.c;
            a S = wwg.S(20192205, true, new sed(28), btsVar);
            c530 c530Var = c530.a;
            ydb1.a(c530Var, aVar, S, null, null, null, null, false, btsVar, 438, 248);
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 25);
        }
    }

    public static Drawable e(float f, int i) {
        int argb = Color.argb((int) (Color.alpha(i) * 0.5f), Color.red(i), Color.green(i), Color.blue(i));
        vbb vbbVar = new vbb(i, f);
        vbbVar.X(argb);
        vbbVar.Y(lhc.c(i) < 0.75d ? Color.argb(225, 255, 255, 255) : Color.argb(225, 0, 0, 0));
        return (Drawable) vbbVar.b;
    }

    public static Drawable f(float f, int i, int i2) {
        int argb = Color.argb((int) (Color.alpha(i) * 0.5f), Color.red(i), Color.green(i), Color.blue(i));
        vbb vbbVar = new vbb(i, f);
        vbbVar.X(argb);
        vbbVar.Y(i2);
        return (Drawable) vbbVar.b;
    }

    public static RoundRectShape g(float f, float f2, float f3, float f4) {
        return new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null);
    }

    public static final mgv h() {
        mgv mgvVar = a;
        if (mgvVar != null) {
            return mgvVar;
        }
        lgv lgvVar = new lgv("TickOutlineXxs", 8.0f, 8.0f, 8.0f, 8.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
        uq90 g = tse0.g(7.1738f, 2.5f, 3.294f, 6.3799f);
        g.h(0.8262f, 3.9121f);
        g.h(1.8867f, 2.8516f);
        g.h(3.294f, 4.2588f);
        tse0.u(g, 6.1133f, 1.4395f, 7.1738f, 2.5f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", g.a);
        mgv d = lgvVar.d();
        a = d;
        return d;
    }

    public static vbb i(float f, int i) {
        return new vbb(i, f);
    }
}
