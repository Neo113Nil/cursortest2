package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class abb1 {
    public static final void a(final lj6 lj6Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(265171576);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(lj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = lj6Var.d != null;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(1281858332);
                awk0 awk0Var = new awk0(0);
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object Q = btsVar.Q();
                if (z2 || Q == o430Var) {
                    Q = new lu5(11, tlsVar, lj6Var);
                    btsVar.o0(Q);
                }
                b = q791.d(f530Var, false, null, awk0Var, (sls) Q, 11);
                btsVar.t(false);
            } else {
                btsVar.e0(1282003908);
                f530 o = an91.o(f530Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new teb(20);
                    btsVar.o0(Q2);
                }
                b = fnq0.b(o, true, (tls) Q2);
                btsVar.t(false);
            }
            ydb1.a(b, wwg.S(2138976910, true, new zls() { // from class: jj6
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    lj6 lj6Var2 = lj6Var;
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
                                to5 to5Var = x4c.E;
                                ibp0Var.getClass();
                                tdb1.d(ibp0Var, lj6Var2.a.a, ljs0.m(an91.l(new pa31(to5Var), 8.0f, 16.0f), SlotSize.S.getSize()), null, null, null, 0.0f, 0, wwg.S(-869962274, true, new q0v(25, ibp0Var, lj6Var2), btsVar2), btsVar2, (intValue & 14) | 805306368, 252);
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
                                int length = lj6Var2.b.length();
                                c530 c530Var = c530.a;
                                if (length != 0) {
                                    btsVar3.e0(593670432);
                                    p9b1.c(ebp0Var, lj6Var2.b, an91.o(c530Var, 0.0f, 12.0f, 0.0f, 12.0f, 5), AppColor$Palette.Text, xya1.e(btsVar3).g.b, 2, Integer.MAX_VALUE, lj6Var2.c, AppColor$Palette.TextMinor, xya1.e(btsVar3).h.a, 2, 2, null, btsVar3, ((102239616 | (intValue2 & 14)) & 14) | 100666752, 48, 0);
                                    btsVar3.t(false);
                                    break;
                                } else {
                                    btsVar3.e0(593417658);
                                    p9b1.c(ebp0Var, lj6Var2.c, an91.m(c530Var, 0.0f, 12.0f, 1), AppColor$Palette.Text, xya1.e(btsVar3).g.b, 0, 0, null, null, null, 0, 0, null, btsVar3, (intValue2 & 14) | 3456, 0, 8176);
                                    btsVar3.t(false);
                                    break;
                                }
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-439121783, true, new zls() { // from class: jj6
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    lj6 lj6Var2 = lj6Var;
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
                                to5 to5Var = x4c.E;
                                ibp0Var.getClass();
                                tdb1.d(ibp0Var, lj6Var2.a.a, ljs0.m(an91.l(new pa31(to5Var), 8.0f, 16.0f), SlotSize.S.getSize()), null, null, null, 0.0f, 0, wwg.S(-869962274, true, new q0v(25, ibp0Var, lj6Var2), btsVar2), btsVar2, (intValue & 14) | 805306368, 252);
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
                                int length = lj6Var2.b.length();
                                c530 c530Var = c530.a;
                                if (length != 0) {
                                    btsVar3.e0(593670432);
                                    p9b1.c(ebp0Var, lj6Var2.b, an91.o(c530Var, 0.0f, 12.0f, 0.0f, 12.0f, 5), AppColor$Palette.Text, xya1.e(btsVar3).g.b, 2, Integer.MAX_VALUE, lj6Var2.c, AppColor$Palette.TextMinor, xya1.e(btsVar3).h.a, 2, 2, null, btsVar3, ((102239616 | (intValue2 & 14)) & 14) | 100666752, 48, 0);
                                    btsVar3.t(false);
                                    break;
                                } else {
                                    btsVar3.e0(593417658);
                                    p9b1.c(ebp0Var, lj6Var2.c, an91.m(c530Var, 0.0f, 12.0f, 1), AppColor$Palette.Text, xya1.e(btsVar3).g.b, 0, 0, null, null, null, 0, 0, null, btsVar3, (intValue2 & 14) | 3456, 0, 8176);
                                    btsVar3.t(false);
                                    break;
                                }
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, wwg.S(1184354755, true, new kj6(z, i3), btsVar), x4c.E, SlotSize.L, false, btsVar, 1794480, HProv.PP_LCD_QUERY);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0((Object) lj6Var, (Object) tlsVar, f530Var, i, 22);
        }
    }

    public static bgr0 b() {
        return bgr0.d;
    }

    public static final void c(kdx kdxVar, String str, Boolean bool) {
        kdxVar.b(str, qcx.a(bool));
    }

    public static final void d(kdx kdxVar, String str, String str2) {
        kdxVar.b(str, qcx.c(str2));
    }
}
