package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g1a1;
import defpackage.gi91;
import defpackage.kbe0;
import defpackage.lr20;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.ttm;
import defpackage.vfc;
import defpackage.vuz;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yur;
import defpackage.zpn;
import defpackage.zy11;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes5.dex */
public abstract class g1a1 {
    public static final String[] a = {"⚽️", "🏀️", "🏈️", "⚾️", "🎾️", "🏐️", "🏉️", "🎱️", "🏓️", "🏸️", "🥅️", "🏒️", "🏑️", "🏏️", "⛳️", "🏹️", "🎣️", "🥊️", "🥋️", "⛸️", "🎿️", "⛷️", "🏂️", "🏋️\u200d♀️️", "🏋️", "🤺️", "🤼️", "🤼\u200d♀️️", "🤼\u200d♂️️", "🤸️", "🤸\u200d♀️️", "🤸\u200d♂️️", "⛹️\u200d♀️️", "⛹️", "🤾️", "🤾\u200d♀️️", "🤾\u200d♂️️", "🏌️\u200d♀️️", "🏌️", "🏄\u200d♀️️", "🏄️", "🏊\u200d♀️️", "🏊️", "🤽️", "🤽\u200d♀️️", "🤽\u200d♂️️", "🚣\u200d♀️️", "🚣️", "🏇️", "🚴\u200d♀️️", "🚴️", "🚵\u200d♀️️", "🚵️", "🎽️", "🏅️", "🎖️", "🥇️", "🥈️", "🥉️", "🏆️", "🏵️", "🎗️", "🎫️", "🎟️", "🎪️", "🤹️", "🤹\u200d♀️️", "🤹\u200d♂️️", "🎭️", "🎨️", "🎬️", "🎤️", "🎧️", "🎼️", "🎹️", "🥁️", "🎷️", "🎺️", "🎸️", "🎻️", "🎲️", "🎯️", "🎳️", "🎮️", "🎰️", "⛹️\u200d♂️️", "🏋️\u200d♂️️", "🏌️\u200d♂️️", "🏄\u200d♂️️", "🏊\u200d♂️️", "🚣\u200d♂️️", "🚴\u200d♂️️", "🚵\u200d♂️"};

    public static final void a(q6n q6nVar, tls tlsVar, wls wlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1735103759);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(q6nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(wlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            qrb1.c(q6nVar.d, tlsVar, wlsVar, false, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, 8);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(q6nVar, tlsVar, wlsVar, i, 5);
        }
    }

    public static final void b(String str, String str2, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(518102931);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | 384 | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 8.0f);
            boolean z = false;
            gz6 gz6Var = d17.a;
            boolean z2 = (i2 & 7168) == 2048;
            if ((i2 & 112) == 32) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new a91(tlsVar, str2, 12);
                btsVar.o0(Q);
            }
            d17.d(k, false, null, gz6Var, null, (sls) Q, wwg.S(629610208, true, new jk30(str, 10), btsVar), btsVar, 1572864, 22);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(str, str2, f530Var2, tlsVar, i, 2);
        }
    }

    public static final void c(String str, boolean z, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1064623168);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16) | (btsVar2.k(f530Var) ? 2048 : 1024);
        int i3 = 0;
        int i4 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 112) == 32;
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = z ? new lkx(i4, i4, i3, 122) : new lkx(i3, 3, i3, HProv.PP_PASSWD_TERM);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            heb1.b(str, tlsVar, an91.m(ljs0.e(ljs0.c(f530Var, 1.0f), 74.0f), 0.0f, 8.0f, 1), false, null, null, null, null, null, null, null, null, null, null, null, false, null, 0.0f, null, null, (lkx) Q, null, true, 0, 0, null, null, null, null, null, null, btsVar, (i2 & 14) | 48, 0, HProv.ALG_TYPE_SECURECHANNEL, 0, 2136997880, 1);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(str, z, tlsVar, f530Var, i, 13);
        }
    }

    public static final void d(final kbe0 kbe0Var, f530 f530Var, final tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(574485131);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(kbe0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            cx20.a(c530Var, null, null, null, null, false, false, wwg.S(920204661, true, new wg0(24, tlsVar), btsVar), wwg.S(-1782074563, true, new zls() { // from class: ru.yandex.taxi.address.entrances.ui.v2.a
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    boolean V = btsVar2.V(intValue & 1, (intValue & 17) != 16);
                    zy11 zy11Var = zy11.a;
                    if (!V) {
                        btsVar2.Y();
                        return zy11Var;
                    }
                    Object Q = btsVar2.Q();
                    kbe0 kbe0Var2 = kbe0Var;
                    Object obj4 = did.a;
                    if (Q == obj4) {
                        Q = f.j(kbe0Var2.c);
                        btsVar2.o0(Q);
                    }
                    oz40 oz40Var = (oz40) Q;
                    Object Q2 = btsVar2.Q();
                    if (Q2 == obj4) {
                        Q2 = vfc.g(btsVar2);
                    }
                    yur yurVar = (yur) Q2;
                    Object Q3 = btsVar2.Q();
                    if (Q3 == obj4) {
                        Q3 = new PorchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$1$1(yurVar, null);
                        btsVar2.o0(Q3);
                    }
                    zpn.e(btsVar2, (wls) Q3, zy11Var);
                    WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                    boolean f = vuz.o(btsVar2).c.f();
                    Object Q4 = btsVar2.Q();
                    if (Q4 == obj4) {
                        Q4 = f.j(Boolean.FALSE);
                        btsVar2.o0(Q4);
                    }
                    oz40 oz40Var2 = (oz40) Q4;
                    Boolean valueOf = Boolean.valueOf(f);
                    boolean a2 = btsVar2.a(f);
                    tls tlsVar2 = tls.this;
                    boolean k = a2 | btsVar2.k(tlsVar2);
                    Object Q5 = btsVar2.Q();
                    if (k || Q5 == obj4) {
                        Q5 = new PorchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$2$1(f, tlsVar2, oz40Var2, null);
                        btsVar2.o0(Q5);
                    }
                    zpn.e(btsVar2, (wls) Q5, valueOf);
                    sic a3 = qic.a(lr20.c, x4c.H, btsVar2, 48);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    c530 c530Var2 = c530.a;
                    f530 d = b.d(btsVar2, c530Var2);
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
                    qje.W(btsVar2, d.f, a3);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d);
                    g1a1.e(0, btsVar2, null, kbe0Var2.a);
                    f530 b = gi91.b(c530Var2, yurVar);
                    String str = (String) oz40Var.getValue();
                    boolean z = kbe0Var2.d;
                    Object Q6 = btsVar2.Q();
                    if (Q6 == obj4) {
                        Q6 = new ttm(12, oz40Var);
                        btsVar2.o0(Q6);
                    }
                    g1a1.c(str, z, (tls) Q6, b, btsVar2, 384);
                    g1a1.b(kbe0Var2.b, (String) oz40Var.getValue(), null, tlsVar2, btsVar2, 0);
                    btsVar2.t(true);
                    return zy11Var;
                }
            }, btsVar), btsVar, ((i3 >> 3) & 14) | 113246208, HProv.PP_DELETE_SAVED_PASSWD);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(kbe0Var, f530Var2, tlsVar, i, 26);
        }
    }

    public static final void e(int i, fid fidVar, f530 f530Var, String str) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1856065289);
        int i2 = (btsVar2.k(str) ? 4 : 2) | i | 48;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            jeb1.f(str, an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 20.0f, 0.0f, 12.0f, 5), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar2).d, btsVar, i2 & 14, 0, 16380);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kga(str, f530Var2, i, 3);
        }
    }

    public static nb61 f(ob61 ob61Var) {
        mb61 mb61Var = new mb61(new oz2());
        ob61Var.invoke(mb61Var);
        return new nb61(mb61Var.build());
    }
}
