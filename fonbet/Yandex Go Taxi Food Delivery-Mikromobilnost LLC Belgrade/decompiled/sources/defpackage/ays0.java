package defpackage;

import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.Path$Direction;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import com.ybsdk.feature.webview.internal.utils.DownloadBlobFileJSInterface;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class ays0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ays0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        x021 x021Var = (x021) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            so5 so5Var = x4c.G;
            sic a = qic.a(lr20.c, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
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
            o4b1.b(mt71.m(f1h0.ic_cross_ban, 0, btsVar), null, vfc.j(so5Var, ljs0.i(an91.k(c530Var, 10.0f), 40.0f)), null, null, 0.0f, null, btsVar, 56, 120);
            jeb1.f(x021Var.a, an91.o(c530Var, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).e.d, btsVar, 48, 0, 16380);
            jeb1.f(x021Var.b, an91.o(c530Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 48, 0, 16380);
            f530 n = an91.n(ljs0.c(c530Var, 1.0f), 8.0f, 4.0f, 8.0f, 8.0f);
            ButtonStyle buttonStyle = ButtonStyle.Main;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new fc01(5, tlsVar);
                btsVar.o0(Q);
            }
            afd.a.getClass();
            d17.c(n, false, null, buttonStyle, null, (sls) Q, afd.c, btsVar, 1575936, 22);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        je31 je31Var = (je31) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            te91.b(null, je31Var.a, je31Var.i, je31Var.j, tlsVar, btsVar, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        jg31 jg31Var = (jg31) this.b;
        a aVar = (a) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            f530 j = an91.j(c530.a, jg31Var.g);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, j);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            nnm.p(0, aVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        m3u0 m3u0Var = (m3u0) this.b;
        fwi fwiVar = (fwi) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            btsVar.Y();
        } else if (((Boolean) m3u0Var.getValue()).booleanValue()) {
            btsVar.e0(553957959);
            btsVar.t(false);
        } else {
            btsVar.e0(553715787);
            int a = (int) (((k651) btsVar.m(j.u)).a() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = ly3.h(fwiVar.H(a), btsVar);
            }
            ly3.B(c530.a, ((y7m) Q).a, btsVar, false);
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        ki31 ki31Var = (ki31) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            w0s w0sVar = ki31Var.c;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new ke31(3);
                btsVar.o0(Q);
            }
            mi91.d(w0sVar, null, un91.b(tlsVar, (tls) Q, btsVar), null, null, null, btsVar, 0, 58);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        o341 o341Var = (o341) this.b;
        wg6 wg6Var = (wg6) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            if (o341Var.d.isEmpty()) {
                btsVar.e0(101860462);
            } else {
                btsVar.e0(-1382188275);
                oab1.a(wg6Var, btsVar, 0);
            }
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        tls tlsVar = (tls) this.b;
        e541 e541Var = (e541) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 0;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            rab1.b(null, wwg.S(-650369649, true, new rhi0(12, tlsVar), btsVar), null, null, null, wwg.S(-1265461869, true, new v441(i, e541Var, tlsVar), btsVar), null, btsVar, 196656, 93);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [f530] */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        androidx.compose.foundation.lazy.b bVar;
        zy11 zy11Var;
        int i = this.a;
        f43 f43Var = lr20.a;
        int i2 = 15;
        g43 g43Var = lr20.c;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        int i3 = 16;
        zy11 zy11Var2 = zy11.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) obj5;
                String str = (String) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= fidVar.a(booleanValue) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    f530 c = ljs0.c(c530Var, 1.0f);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, c);
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
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d2);
                    if (booleanValue) {
                        btsVar.e0(-1615956012);
                        zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, 0, 254);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1615858579);
                        ymb1.c(str, null, ldc.f, null, lzr.G, 0L, uh6.E(23), 0L, null, 0, false, 0, null, null, btsVar, 12607872, 0, 65386);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 1:
                Spannable spannable = (Spannable) obj5;
                alb0 alb0Var = (alb0) obj4;
                bmt0 bmt0Var = (bmt0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                eyr eyrVar = bmt0Var.f;
                lzr lzrVar = bmt0Var.c;
                if (lzrVar == null) {
                    lzrVar = lzr.D;
                }
                hzr hzrVar = bmt0Var.d;
                int i4 = hzrVar != null ? hzrVar.a : 0;
                izr izrVar = bmt0Var.e;
                int i5 = izrVar != null ? izrVar.a : 65535;
                ib2 ib2Var = (ib2) alb0Var.b;
                rp11 b = ((gyr) ib2Var.x).b(eyrVar, lzrVar, i4, i5);
                if (b instanceof qp11) {
                    typeface = (Typeface) ((qp11) b).a;
                } else {
                    cjw0 cjw0Var = new cjw0(b, ib2Var.C);
                    ib2Var.C = cjw0Var;
                    typeface = (Typeface) cjw0Var.c;
                }
                spannable.setSpan(new TypefaceSpan(typeface), intValue2, intValue3, 33);
                return zy11Var2;
            case 2:
                p7u0 p7u0Var = (p7u0) obj5;
                f530 f530Var = (f530) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    sya1.a(p7u0Var.a, f530Var, null, AppColor$Palette.TextMinor, btsVar2, 3120, 4);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 3:
                q7u0 q7u0Var = (q7u0) obj5;
                f530 f530Var2 = (f530) obj4;
                fid fidVar3 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue5 & 1, (intValue5 & 17) != 16)) {
                    v0b1.a(q7u0Var.a, f530Var2, null, null, null, null, null, null, 0.0f, 0, btsVar3, 48, 1020);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 4:
                s611 s611Var = (s611) obj5;
                ety0 ety0Var = (ety0) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    qgy.b(s611Var.b, null, an91.m(c530Var, 12.0f, 0.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, null, btsVar4, 3456, 0, 12274);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 5:
                viu0 viu0Var = (viu0) obj5;
                m3u0 m3u0Var = (m3u0) obj4;
                fid fidVar5 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    lhl0 a = khl0.a(f43Var, x4c.E, btsVar5, 48);
                    int hashCode2 = Long.hashCode(btsVar5.T);
                    r1b0 o2 = btsVar5.o();
                    c530 c530Var2 = c530.a;
                    f530 d3 = b.d(btsVar5, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar2);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, d.f, a);
                    qje.W(btsVar5, d.e, o2);
                    qje.W(btsVar5, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar5, d.h);
                    qje.W(btsVar5, d.d, d3);
                    CharSequence charSequence2 = viu0Var.a;
                    ety0 ety0Var2 = xya1.e(btsVar5).h.a;
                    AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                    qgy.b(charSequence2, null, c530Var2, appColor$Palette, 0L, 0L, null, 0L, 0, 0, 0, ety0Var2, null, btsVar5, 3456, 0, 12274);
                    sya1.a(ilb1.a(), ira1.i(ljs0.m(c530Var2, 20.0f), ((Number) m3u0Var.getValue()).floatValue()), null, appColor$Palette, btsVar5, HProv.ALG_TYPE_SECURECHANNEL, 4);
                    btsVar5.t(true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
            case 6:
                rzw0 rzw0Var = (rzw0) obj5;
                tls tlsVar = (tls) obj4;
                fid fidVar6 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                boolean V = btsVar6.V(intValue8 & 1, (intValue8 & 17) != 16);
                dmw0 dmw0Var = btsVar6.a;
                if (V) {
                    f530 c2 = ljs0.c(c530Var, 1.0f);
                    so5 so5Var = x4c.G;
                    sic a2 = qic.a(g43Var, so5Var, btsVar6, 0);
                    int hashCode3 = Long.hashCode(btsVar6.T);
                    r1b0 o3 = btsVar6.o();
                    f530 d4 = b.d(btsVar6, c2);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar3);
                    } else {
                        btsVar6.r0();
                    }
                    wls wlsVar2 = d.f;
                    qje.W(btsVar6, wlsVar2, a2);
                    wls wlsVar3 = d.e;
                    qje.W(btsVar6, wlsVar3, o3);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    wls wlsVar4 = d.g;
                    qje.W(btsVar6, wlsVar4, valueOf);
                    tls tlsVar2 = d.h;
                    qje.M(btsVar6, tlsVar2);
                    wls wlsVar5 = d.d;
                    qje.W(btsVar6, wlsVar5, d4);
                    f530 k = an91.k(c530Var, 16.0f);
                    sic a3 = qic.a(g43Var, so5Var, btsVar6, 0);
                    int hashCode4 = Long.hashCode(btsVar6.T);
                    r1b0 o4 = btsVar6.o();
                    f530 d5 = b.d(btsVar6, k);
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar3);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, wlsVar2, a3);
                    qje.W(btsVar6, wlsVar3, o4);
                    vfc.v(hashCode4, btsVar6, wlsVar4, btsVar6, tlsVar2);
                    qje.W(btsVar6, wlsVar5, d5);
                    String str2 = rzw0Var.a;
                    String str3 = rzw0Var.c;
                    String str4 = rzw0Var.b;
                    if (str2 != null) {
                        btsVar6.e0(1945830915);
                        v0b1.a(mja1.a(rzw0Var.a, null, 6), ymb1.l(ljs0.c(c530Var, 1.0f), cyk0.c(16.0f)), null, null, null, null, null, mhe.e, 0.0f, 0, btsVar6, 12582912, 892);
                        ly3.B(c530Var, 16.0f, btsVar6, false);
                    } else {
                        btsVar6.e0(1946121137);
                        btsVar6.t(false);
                    }
                    if (evu0.J(str4)) {
                        btsVar6.e0(1946442545);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(1946173465);
                        Object Q = btsVar6.Q();
                        if (Q == o430Var) {
                            Q = new oxv0(i3);
                            btsVar6.o0(Q);
                        }
                        jeb1.f(str4, fnq0.b(c530Var, false, (tls) Q), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar6).d, btsVar6, 0, 0, 16380);
                        ly3.B(c530Var, 16.0f, btsVar6, false);
                    }
                    if (evu0.J(str3)) {
                        btsVar6.e0(1946681617);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(1946491339);
                        jeb1.f(str3, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar6).g.a, btsVar6, 0, 0, 16382);
                        ly3.B(c530Var, 16.0f, btsVar6, false);
                    }
                    btsVar6.t(true);
                    if (evu0.J(rzw0Var.d)) {
                        btsVar6.e0(-18229797);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(-18624768);
                        f530 k2 = an91.k(ljs0.c(c530Var, 1.0f), 8.0f);
                        boolean k3 = btsVar6.k(tlsVar);
                        Object Q2 = btsVar6.Q();
                        if (k3 || Q2 == o430Var) {
                            Q2 = new lao0(17, tlsVar);
                            btsVar6.o0(Q2);
                        }
                        ohb1.b(k2, false, null, (sls) Q2, wwg.S(-1933357895, true, new w7o0(27, rzw0Var), btsVar6), btsVar6, 24582, 6);
                        btsVar6.t(false);
                    }
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var2;
            case 7:
                uox0 uox0Var = (uox0) obj5;
                m3u0 m3u0Var2 = (m3u0) obj4;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar7 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((bts) fidVar7).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                    ucx0.b(ebp0Var, uox0Var.j, m3u0Var2, btsVar7, intValue9 & 14);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
            case 8:
                mdx0 mdx0Var = (mdx0) obj5;
                tls tlsVar3 = (tls) obj4;
                fid fidVar8 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    sic a4 = qic.a(g43Var, x4c.G, btsVar8, 0);
                    int hashCode5 = Long.hashCode(btsVar8.T);
                    r1b0 o5 = btsVar8.o();
                    f530 d6 = b.d(btsVar8, c530Var);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar8.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar8.i0();
                    if (btsVar8.S) {
                        btsVar8.n(slsVar4);
                    } else {
                        btsVar8.r0();
                    }
                    qje.W(btsVar8, d.f, a4);
                    qje.W(btsVar8, d.e, o5);
                    qje.W(btsVar8, d.g, Integer.valueOf(hashCode5));
                    qje.M(btsVar8, d.h);
                    qje.W(btsVar8, d.d, d6);
                    xuz0.a(0.0f, 48, btsVar8, null);
                    tkb1.a(mdx0Var.a, null, tlsVar3, null, btsVar8, 0, 10);
                    btsVar8.t(true);
                } else {
                    btsVar8.Y();
                }
                return zy11Var2;
            case 9:
                qor qorVar = (qor) obj5;
                sls slsVar5 = (sls) obj4;
                fid fidVar9 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    pkb1.d(qorVar, slsVar5, btsVar9, 0);
                } else {
                    btsVar9.Y();
                }
                return zy11Var2;
            case 10:
                sls slsVar6 = (sls) obj5;
                o611 o611Var = (o611) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ohb1.b(an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 12.0f, 0.0f, 12.0f, 5), false, ButtonSize.S, slsVar6, wwg.S(-2005715985, true, new jvx0(0, o611Var), btsVar10), btsVar10, 24966, 2);
                } else {
                    btsVar10.Y();
                }
                return zy11Var2;
            case 11:
                uyx0 uyx0Var = (uyx0) obj5;
                tls tlsVar4 = (tls) obj4;
                fid fidVar11 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar11;
                boolean V2 = btsVar11.V(intValue13 & 1, (intValue13 & 17) != 16);
                dmw0 dmw0Var2 = btsVar11.a;
                if (V2) {
                    Object Q3 = btsVar11.Q();
                    if (Q3 == o430Var) {
                        Q3 = f.j(uyx0Var.c);
                        btsVar11.o0(Q3);
                    }
                    oz40 oz40Var = (oz40) Q3;
                    c530 c530Var3 = c530.a;
                    f530 o6 = an91.o(c530Var3, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                    sic a5 = qic.a(g43Var, x4c.G, btsVar11, 0);
                    int hashCode6 = Long.hashCode(btsVar11.T);
                    r1b0 o7 = btsVar11.o();
                    f530 d7 = b.d(btsVar11, o6);
                    ohd.G1.getClass();
                    sls slsVar7 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar11.i0();
                    if (btsVar11.S) {
                        btsVar11.n(slsVar7);
                    } else {
                        btsVar11.r0();
                    }
                    wls wlsVar6 = d.f;
                    qje.W(btsVar11, wlsVar6, a5);
                    wls wlsVar7 = d.e;
                    qje.W(btsVar11, wlsVar7, o7);
                    Integer valueOf2 = Integer.valueOf(hashCode6);
                    wls wlsVar8 = d.g;
                    qje.W(btsVar11, wlsVar8, valueOf2);
                    tls tlsVar5 = d.h;
                    qje.M(btsVar11, tlsVar5);
                    wls wlsVar9 = d.d;
                    qje.W(btsVar11, wlsVar9, d7);
                    f530 o8 = an91.o(ljs0.c(c530Var3, 1.0f), 16.0f, 0.0f, 16.0f, 12.0f, 2);
                    lhl0 a6 = khl0.a(f43Var, x4c.D, btsVar11, 0);
                    int hashCode7 = Long.hashCode(btsVar11.T);
                    r1b0 o9 = btsVar11.o();
                    f530 d8 = b.d(btsVar11, o8);
                    btsVar11.i0();
                    if (btsVar11.S) {
                        btsVar11.n(slsVar7);
                    } else {
                        btsVar11.r0();
                    }
                    qje.W(btsVar11, wlsVar6, a6);
                    qje.W(btsVar11, wlsVar7, o9);
                    vfc.v(hashCode7, btsVar11, wlsVar8, btsVar11, tlsVar5);
                    qje.W(btsVar11, wlsVar9, d8);
                    jeb1.f(uyx0Var.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar11).e.d, btsVar11, 0, 0, 16382);
                    oeb1.c(btsVar11, new x2y(1.0f, true));
                    btsVar11.t(true);
                    androidx.compose.foundation.lazy.b a7 = a7y.a(0, 3, btsVar11);
                    Object Q4 = btsVar11.Q();
                    if (Q4 == o430Var) {
                        Q4 = f.g(-1);
                        btsVar11.o0(Q4);
                    }
                    yx40 yx40Var = (yx40) Q4;
                    Object Q5 = btsVar11.Q();
                    if (Q5 == o430Var) {
                        Q5 = f.f(0.0f);
                        btsVar11.o0(Q5);
                    }
                    tx40 tx40Var = (tx40) Q5;
                    Object Q6 = btsVar11.Q();
                    if (Q6 == o430Var) {
                        Q6 = f.j(null);
                        btsVar11.o0(Q6);
                    }
                    oz40 oz40Var2 = (oz40) Q6;
                    Object Q7 = btsVar11.Q();
                    if (Q7 == o430Var) {
                        Q7 = new va2(2, oz40Var);
                        btsVar11.o0(Q7);
                    }
                    wls wlsVar10 = (wls) Q7;
                    Object Q8 = btsVar11.Q();
                    if (Q8 == o430Var) {
                        Q8 = new ttm(29, oz40Var);
                        btsVar11.o0(Q8);
                    }
                    tls tlsVar6 = (tls) Q8;
                    boolean k4 = btsVar11.k(tlsVar4) | btsVar11.k(a7);
                    Object Q9 = btsVar11.Q();
                    if (k4 || Q9 == o430Var) {
                        Q9 = new lf10(oz40Var, tlsVar4, yx40Var, tx40Var, tlsVar6, a7, oz40Var2, wlsVar10, 3);
                        bVar = a7;
                        btsVar11.o0(Q9);
                    } else {
                        bVar = a7;
                    }
                    adb1.a(null, bVar, null, null, null, null, false, null, (tls) Q9, btsVar11, 0, 509);
                    f530 c3 = ljs0.c(an91.k(c530Var3, 8.0f), 1.0f);
                    boolean z = uyx0Var.b != ((List) oz40Var.getValue()).hashCode();
                    boolean k5 = btsVar11.k(tlsVar4);
                    Object Q10 = btsVar11.Q();
                    if (k5 || Q10 == o430Var) {
                        Q10 = new c0(tlsVar4, oz40Var, 11);
                        btsVar11.o0(Q10);
                    }
                    ded.a.getClass();
                    ohb1.b(c3, z, null, (sls) Q10, ded.c, btsVar11, 24582, 4);
                    btsVar11.t(true);
                } else {
                    btsVar11.Y();
                }
                return zy11Var2;
            case 12:
                sny0 sny0Var = (sny0) obj5;
                zx40 zx40Var = (zx40) obj4;
                ((Integer) obj3).getClass();
                bts btsVar12 = (bts) ((fid) obj2);
                btsVar12.e0(-102778667);
                Object Q11 = btsVar12.Q();
                if (Q11 == o430Var) {
                    Q11 = zpn.j(EmptyCoroutineContext.a, btsVar12);
                    btsVar12.o0(Q11);
                }
                tse tseVar = (tse) Q11;
                Object Q12 = btsVar12.Q();
                if (Q12 == o430Var) {
                    Q12 = f.j(null);
                    btsVar12.o0(Q12);
                }
                oz40 oz40Var3 = (oz40) Q12;
                oz40 n = f.n(sny0Var, btsVar12);
                boolean k6 = btsVar12.k(zx40Var);
                Object Q13 = btsVar12.Q();
                if (k6 || Q13 == o430Var) {
                    Q13 = new rmy0(r12, oz40Var3, zx40Var);
                    btsVar12.o0(Q13);
                }
                zpn.a(zx40Var, (tls) Q13, btsVar12);
                boolean e = btsVar12.e(tseVar) | btsVar12.k(zx40Var) | btsVar12.k(n);
                Object Q14 = btsVar12.Q();
                if (e || Q14 == o430Var) {
                    Q14 = new androidx.compose.foundation.text.f(tseVar, oz40Var3, zx40Var, n);
                    btsVar12.o0(Q14);
                }
                f530 a8 = exw0.a(c530Var, zx40Var, (PointerInputEventHandler) Q14);
                btsVar12.t(false);
                return a8;
            case 13:
                fwi fwiVar = (fwi) obj5;
                rr9 rr9Var = (rr9) obj4;
                rq90 rq90Var = (rq90) obj;
                cjs0 cjs0Var = (cjs0) obj2;
                float w0 = fwiVar.w0(rr9Var.h());
                float w02 = fwiVar.w0(rr9Var.g());
                jb2 a9 = nb2.a();
                float intBitsToFloat = Float.intBitsToFloat((int) (cjs0Var.a >> 32));
                long j = cjs0Var.a;
                int i6 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat2 = Float.intBitsToFloat(i6);
                long floatToRawIntBits = (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w0) << 32);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                a9.f(new sxk0(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2), Path$Direction.CounterClockwise);
                jb2 a10 = nb2.a();
                float f = -w02;
                float intBitsToFloat3 = (Float.intBitsToFloat(i6) / 2.0f) - w02;
                float intBitsToFloat4 = (Float.intBitsToFloat(i6) / 2.0f) + w02;
                Path$Direction path$Direction = Path$Direction.CounterClockwise;
                if (a10.b == null) {
                    a10.b = new RectF();
                }
                a10.b.set(f, intBitsToFloat3, w02, intBitsToFloat4);
                a10.a.addOval(a10.b, nb2.b(path$Direction));
                jb2 a11 = nb2.a();
                int i7 = (int) (j >> 32);
                float intBitsToFloat5 = Float.intBitsToFloat(i7) - w02;
                float intBitsToFloat6 = (Float.intBitsToFloat(i6) / 2.0f) - w02;
                float intBitsToFloat7 = Float.intBitsToFloat(i7) + w02;
                float intBitsToFloat8 = (Float.intBitsToFloat(i6) / 2.0f) + w02;
                if (a11.b == null) {
                    a11.b = new RectF();
                }
                a11.b.set(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8);
                a11.a.addOval(a11.b, nb2.b(path$Direction));
                jb2 a12 = nb2.a();
                if (!a12.n(a9, a10, 0)) {
                    ny61.g("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
                    return null;
                }
                jb2 a13 = nb2.a();
                if (a13.n(a12, a11, 0)) {
                    ((jb2) rq90Var).d(a13);
                    return zy11Var2;
                }
                ny61.g("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
                return null;
            case 14:
                tb01 tb01Var = (tb01) obj5;
                tls tlsVar7 = (tls) obj4;
                fid fidVar12 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar13 = (bts) fidVar12;
                if (btsVar13.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    rzo.b(null, "default", wwg.S(233081459, true, new bpn0(13, tb01Var, tlsVar7), btsVar13), btsVar13, 3456, 3);
                } else {
                    btsVar13.Y();
                }
                return zy11Var2;
            case 15:
                ed01 ed01Var = (ed01) obj5;
                tls tlsVar8 = (tls) obj4;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar13 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((bts) fidVar13).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar14 = (bts) fidVar13;
                if (btsVar14.V(intValue15 & 1, (intValue15 & 19) != 18)) {
                    boolean z2 = ed01Var.a;
                    boolean k7 = btsVar14.k(tlsVar8) | btsVar14.k(ed01Var);
                    Object Q15 = btsVar14.Q();
                    if (k7 || Q15 == o430Var) {
                        Q15 = new rmy0(22, tlsVar8, ed01Var);
                        btsVar14.o0(Q15);
                    }
                    wfa1.a(z2, an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, (tls) Q15, false, btsVar14, 0, 4);
                } else {
                    btsVar14.Y();
                }
                return zy11Var2;
            case 16:
                id01 id01Var = (id01) obj5;
                fid fidVar14 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar14;
                if (btsVar15.V(intValue16 & 1, (intValue16 & 17) != 16)) {
                    id01Var.getClass();
                    btsVar15.e0(-659359909);
                    m791.d(false, false, btsVar15, 0);
                    btsVar15.t(false);
                } else {
                    btsVar15.Y();
                }
                return zy11Var2;
            case 17:
                tls tlsVar9 = (tls) obj5;
                String str5 = (String) obj4;
                fid fidVar15 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                bts btsVar16 = (bts) fidVar15;
                if (btsVar16.V(intValue17 & 1, (intValue17 & 17) != 16)) {
                    f530 c4 = ljs0.c(an91.o(an91.m(c530Var, 8.0f, 0.0f, 2), 0.0f, 20.0f, 0.0f, 26.0f, 5), 1.0f);
                    boolean k8 = btsVar16.k(tlsVar9) | btsVar16.k(str5);
                    Object Q16 = btsVar16.Q();
                    if (k8 || Q16 == o430Var) {
                        Q16 = new a91(tlsVar9, str5, i2);
                        btsVar16.o0(Q16);
                    }
                    xed.a.getClass();
                    ohb1.b(c4, false, null, (sls) Q16, xed.b, btsVar16, 24582, 6);
                } else {
                    btsVar16.Y();
                }
                return zy11Var2;
            case 18:
                tls tlsVar10 = (tls) obj5;
                ab11 ab11Var = (ab11) obj4;
                fid fidVar16 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                bts btsVar17 = (bts) fidVar16;
                if (btsVar17.V(intValue18 & 1, (intValue18 & 17) != 16)) {
                    boolean k9 = btsVar17.k(tlsVar10) | btsVar17.k(ab11Var);
                    Object Q17 = btsVar17.Q();
                    if (k9 || Q17 == o430Var) {
                        Q17 = new zr01(10, tlsVar10, ab11Var);
                        btsVar17.o0(Q17);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q17, btsVar17, 0);
                } else {
                    btsVar17.Y();
                }
                return zy11Var2;
            case 19:
                return b(obj, obj2, obj3);
            case 20:
                je31 je31Var = (je31) obj5;
                kz6 kz6Var = (kz6) obj4;
                fid fidVar17 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar18 = (bts) fidVar17;
                if (btsVar18.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    c530 c530Var4 = c530Var;
                    if (je31Var.f) {
                        c530Var4 = ofb1.b(c530Var, false, null, 15);
                    }
                    qgy.b(kz6Var.b, null, c530Var4, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar18, 0, 0, 16378);
                } else {
                    btsVar18.Y();
                }
                return zy11Var2;
            case 21:
                return d(obj, obj2, obj3);
            case 22:
                return e(obj, obj2, obj3);
            case 23:
                return f(obj, obj2, obj3);
            case 24:
                return g(obj, obj2, obj3);
            case 25:
                return i(obj, obj2, obj3);
            case 26:
                return j(obj, obj2, obj3);
            default:
                zy11Var = WebViewFragment.setupDownloadLogic$lambda$34$lambda$31((DownloadBlobFileJSInterface) obj5, (aj51) obj4, (String) obj, (String) obj2, (String) obj3);
                return zy11Var;
        }
    }
}
