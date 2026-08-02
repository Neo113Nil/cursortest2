package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.domain.Me2MeResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.ljs0;
import defpackage.mjb1;
import defpackage.o430;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tua;
import defpackage.unr0;
import defpackage.uua;
import defpackage.vua;
import defpackage.wls;
import defpackage.wua;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class mjb1 {
    public static final void a(final wua wuaVar, final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-769768530);
        int i2 = (btsVar.k(wuaVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, null, wwg.S(2121864032, true, new zls() { // from class: com.yandex.go.chargers.subscription.presentation.polling.c
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                        f530 c = ljs0.c(ljs0.e(c530.a, 480.0f), 1.0f);
                        z910 d = pi6.d(x4c.y, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar2, c);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        if (btsVar2.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, d.f, d);
                        qje.W(btsVar2, d.e, o);
                        qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, d.h);
                        qje.W(btsVar2, d.d, d2);
                        wua wuaVar2 = wua.this;
                        if (wuaVar2 instanceof uua) {
                            btsVar2.e0(1843559006);
                            mjb1.b((uua) wuaVar2, btsVar2, 0);
                            btsVar2.t(false);
                        } else {
                            boolean z = wuaVar2 instanceof vua;
                            tls tlsVar2 = tlsVar;
                            o430 o430Var = did.a;
                            if (z) {
                                btsVar2.e0(1843627609);
                                mjb1.c((vua) wuaVar2, btsVar2, 0);
                                boolean k = btsVar2.k(tlsVar2);
                                Object Q = btsVar2.Q();
                                if (k || Q == o430Var) {
                                    Q = new ChargersSubscriptionPollingScreenKt$ChargersSubscriptionPollingScreen$1$1$1$1(tlsVar2, null);
                                    btsVar2.o0(Q);
                                }
                                zpn.e(btsVar2, (wls) Q, wuaVar2);
                                btsVar2.t(false);
                            } else {
                                if (!(wuaVar2 instanceof tua)) {
                                    throw unr0.y(-1326004545, btsVar2, false);
                                }
                                btsVar2.e0(1843791289);
                                boolean k2 = btsVar2.k(tlsVar2) | btsVar2.k(wuaVar2);
                                Object Q2 = btsVar2.Q();
                                if (k2 || Q2 == o430Var) {
                                    Q2 = new ChargersSubscriptionPollingScreenKt$ChargersSubscriptionPollingScreen$1$1$2$1(tlsVar2, wuaVar2, null);
                                    btsVar2.o0(Q2);
                                }
                                zpn.e(btsVar2, (wls) Q2, wuaVar2);
                                btsVar2.t(false);
                            }
                        }
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 100663296, 255);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(wuaVar, tlsVar, i, 8);
        }
    }

    public static final void b(uua uuaVar, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1568595298);
        int i2 = i | (btsVar.k(uuaVar) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(c530Var, 60.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            ffb1.d(null, null, null, btsVar, 0, 7);
            CharSequence charSequence = uuaVar.a;
            if (charSequence == null) {
                btsVar.e0(-541826050);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(-541826049);
                oeb1.c(btsVar, ljs0.e(c530Var, 26.0f));
                z = true;
                qgy.b(charSequence, null, null, null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16254);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(uuaVar, i, 24);
        }
    }

    public static final void c(vua vuaVar, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(798335148);
        int i2 = (btsVar.k(vuaVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(c530Var, 60.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            o4b1.b(mt71.m(w1h0.ic_chargers_subscription_polling_complete, 0, btsVar), null, ljs0.m(c530Var, 64.0f), null, null, 0.0f, null, btsVar, 440, 120);
            CharSequence charSequence = vuaVar.a;
            if (charSequence == null) {
                btsVar.e0(-2089815280);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(-2089815279);
                oeb1.c(btsVar, ljs0.e(c530Var, 26.0f));
                qgy.b(charSequence, null, null, null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16254);
                btsVar = btsVar;
                btsVar.t(false);
                z = true;
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(vuaVar, i, 23);
        }
    }

    public static final void d(rzw0 rzw0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1997173743);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(rzw0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(276511243, true, new c1p0(27, rzw0Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(rzw0Var, tlsVar, i, 28);
        }
    }

    public static final k910 e(Me2MeResultPageEntity me2MeResultPageEntity, ct11 ct11Var) {
        String error = ct11Var.getError();
        String description = ct11Var.getDescription();
        if (description == null) {
            description = me2MeResultPageEntity.getDescription();
        }
        return new k910(Me2MeResultPageEntity.copy$default(me2MeResultPageEntity, null, null, error, description, 3, null), Me2MeDebitResultEntity$Status.FAILED, null, ct11Var.a(), 92);
    }

    public static final k910 f(Me2MeResultPageEntity me2MeResultPageEntity, Me2MeDebitResultEntity$Status me2MeDebitResultEntity$Status) {
        return new k910(me2MeResultPageEntity, me2MeDebitResultEntity$Status, null, null, HProv.PP_SAME_MEDIA);
    }
}
