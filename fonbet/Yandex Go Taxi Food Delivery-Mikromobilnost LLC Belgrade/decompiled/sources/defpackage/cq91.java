package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.taxi_order.ws.WebSocketClient$CloseReason;
import com.yandex.go.taxi_order.ws.XivaWsAnalytics$ConnectionCloseReason;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public abstract class cq91 {
    public static final byte[] a = {48, 49, 53, 0};
    public static final byte[] b = {48, 49, 48, 0};
    public static final byte[] c = {48, 48, 57, 0};
    public static final byte[] d = {48, 48, 53, 0};
    public static final byte[] e = {48, 48, 49, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, Alerts.alert_decode_error, 0};
    public static au2 h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String str2, f530 f530Var, wls wlsVar, wls wlsVar2, fid fidVar, int i, int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        wls wlsVar3;
        int i5;
        wls wlsVar4;
        String str5;
        String str6;
        c530 c530Var;
        boolean z;
        bts btsVar;
        wls wlsVar5;
        String str7;
        wls wlsVar6;
        String str8;
        String str9;
        wls wlsVar7;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1795941294);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 6) == 0) {
            str3 = str;
            i3 = (btsVar2.k(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str4 = str2;
            i3 |= btsVar2.k(str4) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar2.k(f530Var) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                wlsVar3 = wlsVar;
                i3 |= btsVar2.e(wlsVar3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    wlsVar4 = wlsVar2;
                    i3 |= btsVar2.e(wlsVar4) ? 16384 : 8192;
                    if ((i3 & 9363) == 9362 || !btsVar2.E()) {
                        if (i6 != 0) {
                            str3 = null;
                        }
                        String str10 = i7 == 0 ? null : str4;
                        wls wlsVar8 = i4 == 0 ? null : wlsVar3;
                        if (i5 != 0) {
                            wlsVar4 = null;
                        }
                        qnm qnmVar = qnm.a;
                        qnm.c.getClass();
                        f530 c2 = ljs0.c(an91.k(f530Var, 32.0f), 1.0f);
                        sic a2 = qic.a(lr20.e, x4c.H, btsVar2, 54);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = b.d(btsVar2, c2);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        if (btsVar2.a != null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, d.f, a2);
                        qje.W(btsVar2, d.e, o);
                        wls wlsVar9 = d.g;
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                            b64.z(hashCode, btsVar2, hashCode, wlsVar9);
                        }
                        qje.W(btsVar2, d.d, d2);
                        btsVar2.e0(-1141826900);
                        c530 c530Var2 = c530.a;
                        if (wlsVar8 != null) {
                            wlsVar8.invoke(btsVar2, Integer.valueOf((i3 >> 9) & 14));
                            oeb1.c(btsVar2, ljs0.e(c530Var2, 16.0f));
                        }
                        btsVar2.t(false);
                        btsVar2.e0(-1141822667);
                        if (str3 != null) {
                            long g0 = qnm.c(btsVar2).g0();
                            ety0 o2 = ltm.b(btsVar2).o(btsVar2);
                            String str11 = str3;
                            c530Var = c530Var2;
                            str5 = str10;
                            wlsVar5 = wlsVar4;
                            z = false;
                            vqy0.c(str11, null, g0, 0L, null, 0L, new sjy0(3), 0L, 0, false, 0, 0, o2, btsVar2, i3 & 14, 0, 130042);
                            str6 = str11;
                            btsVar = btsVar2;
                            if (str5 != null) {
                                oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
                            }
                        } else {
                            str5 = str10;
                            str6 = str3;
                            c530Var = c530Var2;
                            z = false;
                            btsVar = btsVar2;
                            wlsVar5 = wlsVar4;
                        }
                        btsVar.t(z);
                        btsVar.e0(-1141811310);
                        if (str5 != null) {
                            long h0 = qnm.c(btsVar).h0();
                            ety0 a3 = ltm.b(btsVar).a(btsVar);
                            bts btsVar3 = btsVar;
                            String str12 = str5;
                            vqy0.c(str12, null, h0, 0L, null, 0L, new sjy0(3), 0L, 0, false, 0, 0, a3, btsVar3, (i3 >> 3) & 14, 0, 130042);
                            str7 = str12;
                            btsVar = btsVar3;
                        } else {
                            str7 = str5;
                        }
                        btsVar.t(z);
                        btsVar.e0(-1141803154);
                        if (wlsVar5 != null) {
                            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                            wlsVar5.invoke(btsVar, Integer.valueOf((i3 >> 12) & 14));
                        }
                        btsVar.t(z);
                        btsVar.t(true);
                        wlsVar6 = wlsVar8;
                        str8 = str7;
                        str9 = str6;
                        wlsVar7 = wlsVar5;
                    } else {
                        btsVar2.Y();
                        str9 = str3;
                        str8 = str4;
                        wlsVar6 = wlsVar3;
                        wlsVar7 = wlsVar4;
                        btsVar = btsVar2;
                    }
                    aii0 v = btsVar.v();
                    if (v != null) {
                        v.d = new xg0(str9, str8, f530Var, wlsVar6, wlsVar7, i, i2, 6);
                        return;
                    }
                    return;
                }
                wlsVar4 = wlsVar2;
                if ((i3 & 9363) == 9362) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                qnm qnmVar2 = qnm.a;
                qnm.c.getClass();
                f530 c22 = ljs0.c(an91.k(f530Var, 32.0f), 1.0f);
                sic a22 = qic.a(lr20.e, x4c.H, btsVar2, 54);
                int hashCode2 = Long.hashCode(btsVar2.T);
                r1b0 o3 = btsVar2.o();
                f530 d22 = b.d(btsVar2, c22);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                if (btsVar2.a != null) {
                }
            }
            wlsVar3 = wlsVar;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            wlsVar4 = wlsVar2;
            if ((i3 & 9363) == 9362) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            qnm qnmVar22 = qnm.a;
            qnm.c.getClass();
            f530 c222 = ljs0.c(an91.k(f530Var, 32.0f), 1.0f);
            sic a222 = qic.a(lr20.e, x4c.H, btsVar2, 54);
            int hashCode22 = Long.hashCode(btsVar2.T);
            r1b0 o32 = btsVar2.o();
            f530 d222 = b.d(btsVar2, c222);
            ohd.G1.getClass();
            sls slsVar22 = d.b;
            if (btsVar2.a != null) {
            }
        }
        str4 = str2;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        wlsVar3 = wlsVar;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        wlsVar4 = wlsVar2;
        if ((i3 & 9363) == 9362) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        qnm qnmVar222 = qnm.a;
        qnm.c.getClass();
        f530 c2222 = ljs0.c(an91.k(f530Var, 32.0f), 1.0f);
        sic a2222 = qic.a(lr20.e, x4c.H, btsVar2, 54);
        int hashCode222 = Long.hashCode(btsVar2.T);
        r1b0 o322 = btsVar2.o();
        f530 d2222 = b.d(btsVar2, c2222);
        ohd.G1.getClass();
        sls slsVar222 = d.b;
        if (btsVar2.a != null) {
        }
    }

    public static final au2 b() {
        au2 au2Var = h;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("PlusL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(11.0f, 3.0f);
        uq90Var.p(8.0f);
        uq90Var.f(3.0f);
        uq90Var.p(2.0f);
        uq90Var.g(8.0f);
        uq90Var.p(8.0f);
        uq90Var.g(2.0f);
        uq90Var.p(-8.0f);
        uq90Var.g(8.0f);
        uq90Var.p(-2.0f);
        uq90Var.g(-8.0f);
        uq90Var.o(3.0f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        h = a2;
        return a2;
    }

    public static final XivaWsAnalytics$ConnectionCloseReason c(WebSocketClient$CloseReason webSocketClient$CloseReason) {
        int i = be51.a[webSocketClient$CloseReason.ordinal()];
        if (i == 1) {
            return XivaWsAnalytics$ConnectionCloseReason.ClientDisconnected;
        }
        if (i == 2) {
            return XivaWsAnalytics$ConnectionCloseReason.ConnectionError;
        }
        if (i == 3) {
            return XivaWsAnalytics$ConnectionCloseReason.ServerError;
        }
        if (i == 4 || i == 5) {
            return XivaWsAnalytics$ConnectionCloseReason.ServerError;
        }
        w511.b();
        return null;
    }
}
