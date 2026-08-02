package defpackage;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.b;
import androidx.compose.animation.m;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.d;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class iex0 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwi b;

    public /* synthetic */ iex0(fwi fwiVar, int i) {
        this.a = i;
        this.b = fwiVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        Object c;
        ety0 ety0Var;
        ety0 ety0Var2;
        int i2 = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        Object obj5 = did.a;
        fwi fwiVar = this.b;
        switch (i2) {
            case 0:
                mg2 mg2Var = (mg2) obj;
                d1f0 d1f0Var = (d1f0) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = ((intValue & 8) == 0 ? ((bts) fidVar).k(mg2Var) : fidVar.e(mg2Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((bts) fidVar).k(d1f0Var) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    m3u0 b = b.b(fwiVar.w0(d1f0Var.d), null, "PriceOffsetX", null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 22);
                    m3u0 a = m.a(tje.n(d1f0Var.b, btsVar), null, null, btsVar, 0, 14);
                    zx01 a2 = mg2Var.a();
                    kex0 kex0Var = kex0.a;
                    gl11 gl11Var = gtq0.f;
                    if (a2.g()) {
                        z = false;
                        btsVar.e0(1666827533);
                        btsVar.t(false);
                        c = a2.c();
                    } else {
                        btsVar.e0(1666573488);
                        boolean k = btsVar.k(a2);
                        c = btsVar.Q();
                        if (k || c == obj5) {
                            i2t0 D = tje.D();
                            tls e = D != null ? D.e() : null;
                            i2t0 O = tje.O(D);
                            try {
                                Object c2 = a2.c();
                                tje.W(D, O, e);
                                btsVar.o0(c2);
                                c = c2;
                            } catch (Throwable th) {
                                tje.W(D, O, e);
                                throw th;
                            }
                        }
                        z = false;
                        btsVar.t(false);
                    }
                    EnterExitState enterExitState = (EnterExitState) c;
                    btsVar.e0(2021461122);
                    EnterExitState enterExitState2 = EnterExitState.Visible;
                    float f = enterExitState == enterExitState2 ? 1.0f : 0.0f;
                    btsVar.t(z);
                    Float valueOf = Float.valueOf(f);
                    boolean k2 = btsVar.k(a2);
                    Object Q = btsVar.Q();
                    if (k2 || Q == obj5) {
                        Q = f.d(new fw0(a2, 8));
                        btsVar.o0(Q);
                    }
                    EnterExitState enterExitState3 = (EnterExitState) ((m3u0) Q).getValue();
                    btsVar.e0(2021461122);
                    float f2 = enterExitState3 == enterExitState2 ? 1.0f : 0.0f;
                    btsVar.t(false);
                    Float valueOf2 = Float.valueOf(f2);
                    boolean k3 = btsVar.k(a2);
                    Object Q2 = btsVar.Q();
                    if (k3 || Q2 == obj5) {
                        Q2 = f.d(new fw0(a2, 9));
                        btsVar.o0(Q2);
                    }
                    tx01 s = bvf0.s(a2, valueOf, valueOf2, (qar) kex0Var.invoke(((m3u0) Q2).getValue(), btsVar, 0), gl11Var, btsVar, ImageMetadata.EDGE_MODE);
                    boolean k4 = btsVar.k(b);
                    Object Q3 = btsVar.Q();
                    if (k4 || Q3 == obj5) {
                        Q3 = new xo1(b, 24);
                        btsVar.o0(Q3);
                    }
                    f530 m = an91.m(bb1.i(d.a(d.a(c530Var, (tls) Q3), new iws(8)), new xo1(s, 9)), 4.0f, 0.0f, 2);
                    CharSequence charSequence = d1f0Var.a;
                    int i3 = lex0.b[d1f0Var.c.ordinal()];
                    if (i3 == 1) {
                        btsVar.e0(-439599073);
                        ety0Var = xya1.e(btsVar).g.b;
                        btsVar.t(false);
                    } else {
                        if (i3 != 2) {
                            throw unr0.y(-439601444, btsVar, false);
                        }
                        btsVar.e0(-439596736);
                        ety0Var = xya1.e(btsVar).g.a;
                        btsVar.t(false);
                    }
                    ety0 c3 = bza1.c(ety0Var, fwiVar);
                    boolean k5 = btsVar.k(a);
                    Object Q4 = btsVar.Q();
                    if (k5 || Q4 == obj5) {
                        Q4 = new w9d(a, 7);
                        btsVar.o0(Q4);
                    }
                    qgy.a(charSequence, (xfc) Q4, null, m, 0L, 0L, new sjy0(5), 0L, 0, 0, 0, c3, btsVar, 0, 0, 12148);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                oco ocoVar = (oco) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ocoVar) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                    boolean k6 = btsVar2.k(fwiVar);
                    Object Q5 = btsVar2.Q();
                    if (k6 || Q5 == obj5) {
                        float w0 = fwiVar.w0(4.0f);
                        Q5 = new vre((Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w0) << 32));
                        btsVar2.o0(Q5);
                    }
                    long j = ((vre) Q5).a;
                    m3u0 b2 = b.b(fwiVar.w0(ocoVar.e), null, "EtaOffsetX", null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 22);
                    m3u0 a3 = m.a(tje.n(ocoVar.b, btsVar2), null, null, btsVar2, 0, 14);
                    m3u0 a4 = m.a(tje.n(ocoVar.d, btsVar2), null, null, btsVar2, 0, 14);
                    boolean k7 = btsVar2.k(b2);
                    Object Q6 = btsVar2.Q();
                    if (k7 || Q6 == obj5) {
                        Q6 = new xo1(b2, 25);
                        btsVar2.o0(Q6);
                    }
                    f530 a5 = d.a(c530Var, (tls) Q6);
                    boolean k8 = btsVar2.k(a4) | btsVar2.d(j);
                    Object Q7 = btsVar2.Q();
                    if (k8 || Q7 == obj5) {
                        Q7 = new v9d(a4, j, 2);
                        btsVar2.o0(Q7);
                    }
                    f530 l = an91.l(bb1.g(a5, (tls) Q7), 4.0f, 1.0f);
                    CharSequence charSequence2 = ocoVar.a;
                    int i4 = lex0.a[ocoVar.c.ordinal()];
                    if (i4 == 1) {
                        btsVar2.e0(-439599009);
                        ety0Var2 = xya1.e(btsVar2).i.b;
                        btsVar2.t(false);
                    } else {
                        if (i4 != 2) {
                            throw unr0.y(-439601500, btsVar2, false);
                        }
                        btsVar2.e0(-439596544);
                        ety0Var2 = xya1.e(btsVar2).i.a;
                        btsVar2.t(false);
                    }
                    ety0 c4 = bza1.c(ety0Var2, fwiVar);
                    boolean k9 = btsVar2.k(a3);
                    Object Q8 = btsVar2.Q();
                    if (k9 || Q8 == obj5) {
                        Q8 = new w9d(a3, 6);
                        btsVar2.o0(Q8);
                    }
                    qgy.a(charSequence2, (xfc) Q8, null, l, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, c4, btsVar2, 0, 0, 12148);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
