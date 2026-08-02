package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.utils.a;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.TimeUnitsVisibility;

/* loaded from: classes11.dex */
public abstract class ppb1 {
    public static final void a(final evd evdVar, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1554435914);
        final int i2 = 2;
        int i3 = 16;
        int i4 = (btsVar2.k(evdVar) ? 4 : 2) | i | (btsVar2.e(slsVar) ? 32 : 16);
        final int i5 = 0;
        final int i6 = 1;
        if (btsVar2.V(i4 & 1, (i4 & 19) != 18)) {
            f530 d = q791.d(tra1.b(ljs0.c(c530.a, 1.0f), evdVar.f ? 1.0f : 0.4f), evdVar.f, null, new awk0(3), slsVar, 10);
            boolean z = (i4 & 14) == 4;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new vqb(i3, evdVar);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            ydb1.a(fnq0.b(d, false, (tls) Q), wwg.S(-1264872608, true, new zls() { // from class: xud
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i5;
                    zy11 zy11Var = zy11.a;
                    evd evdVar2 = evdVar;
                    switch (i7) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else if (evdVar2.b == null) {
                                btsVar3.e0(-2071669083);
                                nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar3, false);
                                break;
                            } else {
                                btsVar3.e0(-2071741282);
                                tdb1.d(ibp0Var, mja1.b(evdVar2.b, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                btsVar3.t(false);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                String str = evdVar2.c;
                                String str2 = evdVar2.d;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                p9b1.c(ebp0Var, str, null, null, null, 0, 0, str2, null, null, 0, 0, null, btsVar4, intValue2 & 14, 0, 8126);
                                break;
                            }
                        default:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar4;
                            if (!btsVar5.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar5.Y();
                                break;
                            } else {
                                wfa1.a(evdVar2.e, an91.o(c530.a, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, evdVar2.f, btsVar5, 0, 4);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), wwg.S(699460443, true, new zls() { // from class: xud
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i6;
                    zy11 zy11Var = zy11.a;
                    evd evdVar2 = evdVar;
                    switch (i7) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else if (evdVar2.b == null) {
                                btsVar3.e0(-2071669083);
                                nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar3, false);
                                break;
                            } else {
                                btsVar3.e0(-2071741282);
                                tdb1.d(ibp0Var, mja1.b(evdVar2.b, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                btsVar3.t(false);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                String str = evdVar2.c;
                                String str2 = evdVar2.d;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                p9b1.c(ebp0Var, str, null, null, null, 0, 0, str2, null, null, 0, 0, null, btsVar4, intValue2 & 14, 0, 8126);
                                break;
                            }
                        default:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar4;
                            if (!btsVar5.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar5.Y();
                                break;
                            } else {
                                wfa1.a(evdVar2.e, an91.o(c530.a, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, evdVar2.f, btsVar5, 0, 4);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), null, wwg.S(965103765, true, new zls() { // from class: xud
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i2;
                    zy11 zy11Var = zy11.a;
                    evd evdVar2 = evdVar;
                    switch (i7) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else if (evdVar2.b == null) {
                                btsVar3.e0(-2071669083);
                                nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar3, false);
                                break;
                            } else {
                                btsVar3.e0(-2071741282);
                                tdb1.d(ibp0Var, mja1.b(evdVar2.b, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                btsVar3.t(false);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                String str = evdVar2.c;
                                String str2 = evdVar2.d;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                p9b1.c(ebp0Var, str, null, null, null, 0, 0, str2, null, null, 0, 0, null, btsVar4, intValue2 & 14, 0, 8126);
                                break;
                            }
                        default:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar4;
                            if (!btsVar5.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar5.Y();
                                break;
                            } else {
                                wfa1.a(evdVar2.e, an91.o(c530.a, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, evdVar2.f, btsVar5, 0, 4);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), null, null, false, btsVar, 25008, 232);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(evdVar, slsVar, i, 25);
        }
    }

    public static final void b(fvd fvdVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1351466080);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(fvdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 29;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new fv9(29, tlsVar);
                btsVar.o0(Q);
            }
            gya1.d(false, (sls) Q, btsVar, 0, 1);
            boolean z2 = ((i2 & 14) == 4) | (i4 == 32);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new jhd(3, tlsVar, fvdVar);
                btsVar.o0(Q2);
            }
            rz20 a = a.a(false, (sls) Q2, btsVar, 0, 5);
            boolean z3 = i4 == 32;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new fv9(27, tlsVar);
                btsVar.o0(Q3);
            }
            cx20.a(null, a, tnb1.e(null, (sls) Q3, btsVar, 5), null, null, false, false, null, wwg.S(-914627374, true, new sp5(22, fvdVar, tlsVar), btsVar), btsVar, 100663296, 249);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(fvdVar, tlsVar, i, i3);
        }
    }

    public static final void c(x840 x840Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(778939756);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(x840Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, wwg.S(-776190398, true, new wg0(21, tlsVar), btsVar), wwg.S(-861453446, true, new r840(tlsVar, x840Var, i3), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(x840Var, tlsVar, i, 17);
        }
    }

    public static final void d(String str, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2093432851);
        int i2 = 4;
        int i3 = 2;
        int i4 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            f530 m = an91.m(ljs0.c(c530.a, 1.0f), 8.0f, 0.0f, 2);
            boolean z = (i4 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new s140(13, tlsVar);
                btsVar.o0(Q);
            }
            ohb1.b(m, false, null, (sls) Q, wwg.S(-1217521146, true, new jk30(str, i2), btsVar), btsVar, 24582, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hp30(str, tlsVar, i, i3);
        }
    }

    public static final void e(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(966613262);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            jeb1.f(str, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.a, btsVar, (i2 & 14) | 384, 0, 16378);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 10);
        }
    }

    public static final void f(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-801933590);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            jeb1.f(str, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).e.d, btsVar, (i2 & 14) | 384, 0, 16378);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 9);
        }
    }

    public static String g(zuj0 zuj0Var, long j, TimeUnitsVisibility timeUnitsVisibility) {
        return qpb1.c(zuj0Var, j, timeUnitsVisibility);
    }
}
