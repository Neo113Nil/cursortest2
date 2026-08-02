package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.scooters.insurance.suggest.v2.ScootersInsuranceSuggestV2UiState$Item$Action;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.utils.UnderlineSpanFix;

/* loaded from: classes11.dex */
public abstract class n2b1 {
    public static final void a(sun0 sun0Var, tls tlsVar, yx40 yx40Var, oip0 oip0Var, fid fidVar, int i) {
        yx40 yx40Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(935694145);
        int i2 = i | (btsVar.k(sun0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.k(oip0Var) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            uo5 uo5Var = x4c.B;
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(bzk0.c(hbb1.c(cj6Var.a(c530Var, uo5Var), dbb1.c(btsVar), false, 0.0f, p1b1.f(oip0Var, btsVar), 6), AppColor$Palette.BgFloating, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 1.0f);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                yx40Var2 = yx40Var;
                Q = new dx2(yx40Var2, 11);
                btsVar.o0(Q);
            } else {
                yx40Var2 = yx40Var;
            }
            f530 k = an91.k(i9a1.d(eja1.y(c, (tls) Q)), 8.0f);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            int i3 = (i2 >> 3) & HProv.PP_DELETE_SAVED_PASSWD;
            g(sun0Var, tlsVar, btsVar, i3);
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            b(sun0Var, tlsVar, btsVar, i3);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            f(sun0Var, tlsVar, btsVar, i3);
            btsVar.t(true);
        } else {
            yx40Var2 = yx40Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(sun0Var, tlsVar, yx40Var2, oip0Var, i, 10);
        }
    }

    public static final void b(sun0 sun0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1183447506);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(sun0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = !sun0Var.a;
            f530 b = ofb1.b(ljs0.c(c530.a, 1.0f), sun0Var.a, null, 14);
            boolean z2 = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new wzl0(23, tlsVar);
                btsVar.o0(Q);
            }
            phb1.b((sls) Q, b, z, null, null, wwg.S(-1655197295, true, new jun0(sun0Var, i3), btsVar), null, null, null, btsVar, ImageMetadata.EDGE_MODE, 984);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kun0(sun0Var, tlsVar, i, 2);
        }
    }

    public static final void c(final sun0 sun0Var, final tls tlsVar, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-343239632);
        int i2 = (btsVar.k(sun0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        final int i3 = 1;
        final int i4 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (sun0Var.e.isEmpty()) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(sun0Var, tlsVar, i, i4) { // from class: lun0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ sun0 b;
                        public final /* synthetic */ tls c;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            tls tlsVar2 = this.c;
                            sun0 sun0Var2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    n2b1.c(sun0Var2, tlsVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    n2b1.c(sun0Var2, tlsVar2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            for (List list : sun0Var.e) {
                f530 l = ymb1.l(bzk0.c(an91.o(c530.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), AppColor$Palette.BgMinor, cyk0.c(24.0f)), cyk0.c(24.0f));
                sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, l);
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
                btsVar.e0(-84361244);
                int i5 = 0;
                for (Object obj : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        scc.m();
                        throw null;
                    }
                    e((run0) obj, tlsVar, btsVar, i2 & 112);
                    if (i5 < scc.f(list)) {
                        btsVar.e0(-14094361);
                        yrl.e(null, null, btsVar, 0, 7);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-14050155);
                        btsVar.t(false);
                    }
                    i5 = i6;
                }
                btsVar.t(false);
                btsVar.t(true);
            }
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(sun0Var, tlsVar, i, i3) { // from class: lun0
                public final /* synthetic */ int a;
                public final /* synthetic */ sun0 b;
                public final /* synthetic */ tls c;

                {
                    this.a = i3;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj22) {
                    int i52 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar2 = this.c;
                    sun0 sun0Var2 = this.b;
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj22).getClass();
                    switch (i52) {
                        case 0:
                            n2b1.c(sun0Var2, tlsVar2, fidVar2, vng.O(1));
                            break;
                        default:
                            n2b1.c(sun0Var2, tlsVar2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void d(f530 f530Var, yzu yzuVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2002192863);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(yzuVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            hub1.b(f530Var, yzuVar.b, yzuVar.g, yzuVar.h, slsVar, wwg.S(94083818, true, new q0v(i3, yzuVar, slsVar2 == null ? slsVar : slsVar2), btsVar), btsVar, (i2 & 14) | ImageMetadata.EDGE_MODE | ((i2 << 6) & HProv.ALG_CLASS_ALL));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(f530Var, (Object) yzuVar, (Object) slsVar, slsVar2, i, 3);
        }
    }

    public static final void e(final run0 run0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1852387995);
        int i2 = (btsVar.k(run0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ScootersInsuranceSuggestV2UiState$Item$Action scootersInsuranceSuggestV2UiState$Item$Action = run0Var.d;
            a aVar = scootersInsuranceSuggestV2UiState$Item$Action != null ? na01.a : ka01.a;
            f530 f530Var = c530.a;
            if (scootersInsuranceSuggestV2UiState$Item$Action != null) {
                btsVar.e0(-1543653118);
                boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object Q = btsVar.Q();
                if (z || Q == did.a) {
                    Q = new tmm0(run0Var, tlsVar);
                    btsVar.o0(Q);
                }
                f530Var = q791.d(f530Var, false, null, null, (sls) Q, 15);
                btsVar.t(false);
            } else {
                btsVar.e0(-1543272655);
                btsVar.t(false);
            }
            ydb1.a(f530Var, wwg.S(1199332785, true, new zls() { // from class: mun0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    run0 run0Var2 = run0Var;
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
                                tdb1.d(ibp0Var, mja1.a(run0Var2.c, null, 6), null, null, null, null, 0.0f, 0, null, btsVar2, intValue & 14, 510);
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
                                m9b1.b(ebp0Var, run0Var2.a, null, null, null, 0, 0, run0Var2.b, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 32638);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(2086879532, true, new zls() { // from class: mun0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    run0 run0Var2 = run0Var;
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
                                tdb1.d(ibp0Var, mja1.a(run0Var2.c, null, 6), null, null, null, null, 0.0f, 0, null, btsVar2, intValue & 14, 510);
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
                                m9b1.b(ebp0Var, run0Var2.a, null, null, null, 0, 0, run0Var2.b, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 32638);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, aVar, null, null, false, btsVar, 432, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(run0Var, tlsVar, i, 22);
        }
    }

    public static final void f(sun0 sun0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-861535141);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(sun0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (sun0Var.h.length() > 0) {
            btsVar.e0(731369861);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(sun0Var.h);
            spannableStringBuilder.setSpan(new UnderlineSpanFix(), 0, spannableStringBuilder.length(), 33);
            SpannedString spannedString = new SpannedString(spannableStringBuilder);
            ety0 ety0Var = xya1.e(btsVar).i.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new wzl0(22, tlsVar);
                btsVar.o0(Q);
            }
            qgy.b(spannedString, null, q791.d(c530.a, false, null, null, (sls) Q, 15), appColor$Palette, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, ety0Var, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12146);
            btsVar = btsVar;
            btsVar.t(false);
        } else {
            btsVar.e0(731837031);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kun0(sun0Var, tlsVar, i, 1);
        }
    }

    public static final void g(sun0 sun0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-493694131);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(sun0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = !sun0Var.a;
            f530 b = ofb1.b(ljs0.c(c530.a, 1.0f), sun0Var.a, null, 14);
            boolean z2 = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new wzl0(24, tlsVar);
                btsVar.o0(Q);
            }
            xlb1.a((sls) Q, b, z, null, null, wwg.S(643979164, true, new jun0(sun0Var, i3), btsVar), null, null, null, btsVar, ImageMetadata.EDGE_MODE, 984);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kun0(sun0Var, tlsVar, i, 0);
        }
    }

    public static final void h(sun0 sun0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1042598128);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(sun0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 3;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(tlsVar, i3, sun0Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kun0(sun0Var, tlsVar, i, 3);
        }
    }

    public static final void i(sun0 sun0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(793556693);
        int i2 = (btsVar.k(sun0Var) ? 4 : 2) | i;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (sun0Var.b.length() > 0) {
            btsVar.e0(1347563207);
            ovi0 a = mja1.a(sun0Var.b, null, 6);
            f530 o = an91.o(ljs0.b(ljs0.c(c530.a, 1.0f), 0.0f, 132.0f, 1), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            ecd.a.getClass();
            v0b1.a(a, o, null, ecd.b, null, null, null, mhe.a, 0.0f, 0, btsVar, 12586032, 884);
            btsVar.t(false);
        } else {
            btsVar.e0(1348034221);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lbb0(sun0Var, i, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean j(u04 u04Var) {
        String str;
        boolean l;
        MoneyEntity moneyEntity;
        String str2;
        String str3;
        boolean z;
        MoneyEntity moneyEntity2;
        MoneyEntity moneyEntity3;
        u8j0 u8j0Var = u04Var.a;
        s24 s24Var = u04Var.d;
        r24 r24Var = u04Var.e;
        n04 n04Var = (n04) u8j0Var.a();
        String str4 = null;
        Boolean valueOf = n04Var != null ? Boolean.valueOf(n04Var.f.a) : null;
        SettingStatus settingStatus = r24Var != null ? r24Var.a : null;
        SettingStatus settingStatus2 = SettingStatus.ENABLED;
        boolean z2 = settingStatus == settingStatus2;
        n04 n04Var2 = (n04) u8j0Var.a();
        Boolean valueOf2 = n04Var2 != null ? Boolean.valueOf(n04Var2.e.a) : null;
        boolean z3 = (s24Var != null ? s24Var.a : null) == settingStatus2;
        if (z2) {
            n04 n04Var3 = (n04) u8j0Var.a();
            if (n04Var3 != null) {
                nr3 nr3Var = n04Var3.f;
                Locale locale = tm60.a;
                str = tm60.b(nr3Var.b.getAmount());
            } else {
                str = null;
            }
            l = jl40.l((r24Var == null || (moneyEntity = r24Var.b) == null) ? null : moneyEntity.getFormattedAmount(), str);
        } else {
            l = true;
        }
        Boolean bool = Boolean.TRUE;
        if (!jl40.l(valueOf, bool)) {
            if (jl40.l(valueOf, Boolean.FALSE)) {
                if (z2) {
                    z2 = false;
                }
            } else if (valueOf != null) {
                w511.b();
                return false;
            }
            z2 = true;
        }
        if (z3) {
            n04 n04Var4 = (n04) u8j0Var.a();
            if (n04Var4 != null) {
                b24 b24Var = n04Var4.e;
                Locale locale2 = tm60.a;
                str2 = tm60.b(b24Var.b.getAmount());
            } else {
                str2 = null;
            }
            n04 n04Var5 = (n04) u8j0Var.a();
            if (n04Var5 != null) {
                b24 b24Var2 = n04Var5.e;
                Locale locale3 = tm60.a;
                str3 = tm60.b(b24Var2.c.getAmount());
            } else {
                str3 = null;
            }
            boolean l2 = jl40.l(str2, (s24Var == null || (moneyEntity3 = s24Var.c) == null) ? null : moneyEntity3.getFormattedAmount());
            if (s24Var != null && (moneyEntity2 = s24Var.d) != null) {
                str4 = moneyEntity2.getFormattedAmount();
            }
            boolean l3 = jl40.l(str3, str4);
            if (!l2 || !l3) {
                z = false;
                if (!jl40.l(valueOf2, bool)) {
                    if (jl40.l(valueOf2, Boolean.FALSE)) {
                        if (z3) {
                            z3 = false;
                        }
                    } else if (valueOf2 != null) {
                        w511.b();
                        return false;
                    }
                    z3 = true;
                }
                return !l && z2 && z && z3;
            }
        }
        z = true;
        if (!jl40.l(valueOf2, bool)) {
        }
        if (l) {
        }
    }
}
