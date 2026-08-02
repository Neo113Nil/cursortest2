package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.n;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class apa1 {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d6, code lost:
    
        if (r10 == defpackage.did.a) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v3, types: [qor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(List list, tls tlsVar, fid fidVar, int i) {
        ?? r3;
        Object obj;
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-675227462);
        int i3 = 32;
        int i4 = (btsVar.e(list) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        ?? r5 = 0;
        boolean z = true;
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            Throwable th = null;
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
            byk0 c = cyk0.c(12.0f);
            btsVar.e0(2133815930);
            int i5 = 0;
            for (Object obj2 : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    Throwable th2 = th;
                    scc.m();
                    throw th2;
                }
                h71 h71Var = (h71) obj2;
                PlainAddress plainAddress = h71Var.a;
                c530 c530Var2 = c530Var;
                f530 o2 = an91.o(c530Var2, 0.0f, 0.0f, 16.0f, 4.0f, 3);
                boolean z2 = ((i4 & 112) == i3 ? z : r5) | (btsVar.e(plainAddress) ? 1 : 0);
                Object Q = btsVar.Q();
                int i7 = 19;
                if (z2 == 0) {
                    obj = Q;
                }
                j0 j0Var = new j0(i7, tlsVar, plainAddress);
                btsVar.o0(j0Var);
                obj = j0Var;
                ?? r9 = th;
                byk0 byk0Var = c;
                int i8 = i5;
                int i9 = i4;
                ydb1.a(q791.b(o2, null, null, false, null, new awk0(r5), (sls) obj, 12), wwg.S(1807244544, z, new u5(i7, c, plainAddress), btsVar), wwg.S(-64188293, z, new bj0(9, plainAddress), btsVar), null, wwg.S(140228277, z, new bj0(10, h71Var), btsVar), null, null, false, btsVar, 25008, 232);
                if (i8 != scc.f(list)) {
                    btsVar.e0(1291710225);
                    yrl.e(an91.o(c530Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), r9, btsVar, 6, 6);
                    i2 = 0;
                    btsVar.t(false);
                } else {
                    i2 = 0;
                    btsVar.e0(1291809208);
                    btsVar.t(false);
                }
                r5 = i2;
                th = r9;
                c530Var = c530Var2;
                i5 = i6;
                c = byk0Var;
                i4 = i9;
                z = true;
                i3 = 32;
            }
            boolean z3 = r5;
            btsVar.t(z3);
            btsVar.t(true);
            r3 = z3;
        } else {
            r3 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new l71(list, tlsVar, i, r3);
        }
    }

    public static final void b(f530 f530Var, r7k0 r7k0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(939584405);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(r7k0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = false;
            ButtonSize buttonSize = ButtonSize.L;
            ButtonStyle buttonStyle = r7k0Var instanceof o7k0 ? ButtonStyle.Minor : ButtonStyle.Main;
            ButtonForm buttonForm = ButtonForm.Squircle;
            ButtonStyle buttonStyle2 = buttonStyle;
            boolean z2 = r7k0Var instanceof p7k0;
            boolean z3 = (i2 & 112) == 32;
            if ((i2 & 896) == 256) {
                z = true;
            }
            boolean z4 = z | z3;
            Object Q = btsVar.Q();
            if (z4 || Q == did.a) {
                Q = new agc0(29, r7k0Var, tlsVar);
                btsVar.o0(Q);
            }
            d17.c(f530Var, z2, buttonSize, buttonStyle2, buttonForm, (sls) Q, wwg.S(2135200121, true, new pdf0(13, r7k0Var), btsVar), btsVar, (i2 & 14) | 1597824, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(f530Var, (Object) r7k0Var, (Object) tlsVar, i, 7);
        }
    }

    public static final void c(f530 f530Var, final s7k0 s7k0Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1032899330);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(s7k0Var) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530Var2 = f530Var;
            ydb1.a(f530Var2, wwg.S(-2031942996, true, new zls() { // from class: n5k0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    s7k0 s7k0Var2 = s7k0Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else if (!((Boolean) btsVar2.m(n.a)).booleanValue()) {
                                btsVar2.e0(-344514760);
                                Object Q = btsVar2.Q();
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    Q = new nqi0(23);
                                    btsVar2.o0(Q);
                                }
                                tls tlsVar = (tls) Q;
                                boolean k = btsVar2.k(s7k0Var2);
                                Object Q2 = btsVar2.Q();
                                if (k || Q2 == o430Var) {
                                    Q2 = new odf0(23, s7k0Var2);
                                    btsVar2.o0(Q2);
                                }
                                androidx.compose.ui.viewinterop.b.a(tlsVar, null, (tls) Q2, btsVar2, 6, 2);
                                btsVar2.t(false);
                                break;
                            } else {
                                btsVar2.e0(-344678781);
                                pi6.a(bzk0.c(ljs0.m(c530.a, 56.0f), new up2(rzo.f(4279262992L)), qke.q), btsVar2, 6);
                                btsVar2.t(false);
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
                                p9b1.c(ebp0Var, s7k0Var2.a.a, null, null, xya1.e(btsVar3).g.a, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 8182);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-287797615, true, new zls() { // from class: n5k0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    s7k0 s7k0Var2 = s7k0Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else if (!((Boolean) btsVar2.m(n.a)).booleanValue()) {
                                btsVar2.e0(-344514760);
                                Object Q = btsVar2.Q();
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    Q = new nqi0(23);
                                    btsVar2.o0(Q);
                                }
                                tls tlsVar = (tls) Q;
                                boolean k = btsVar2.k(s7k0Var2);
                                Object Q2 = btsVar2.Q();
                                if (k || Q2 == o430Var) {
                                    Q2 = new odf0(23, s7k0Var2);
                                    btsVar2.o0(Q2);
                                }
                                androidx.compose.ui.viewinterop.b.a(tlsVar, null, (tls) Q2, btsVar2, 6, 2);
                                btsVar2.t(false);
                                break;
                            } else {
                                btsVar2.e0(-344678781);
                                pi6.a(bzk0.c(ljs0.m(c530.a, 56.0f), new up2(rzo.f(4279262992L)), qke.q), btsVar2, 6);
                                btsVar2.t(false);
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
                                p9b1.c(ebp0Var, s7k0Var2.a.a, null, null, xya1.e(btsVar3).g.a, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 8182);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, null, null, false, btsVar, (i2 & 14) | 432, 248);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o990(f530Var2, s7k0Var, i, 17);
        }
    }

    public static final void d(r7k0 r7k0Var, s7k0 s7k0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(929607048);
        int i2 = (btsVar.k(r7k0Var) ? 4 : 2) | i | (btsVar.k(s7k0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            dta1.a(null, false, null, false, false, wwg.S(-910962420, true, new ls40(8, s7k0Var, r7k0Var, tlsVar), btsVar), btsVar, 221184, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) r7k0Var, (Object) s7k0Var, tlsVar, i, 6);
        }
    }

    public static final boolean e(FeatureFlag featureFlag) {
        xl2 xl2Var = (xl2) pfr.b.a.get(featureFlag.getFlagName());
        Object a = xl2Var != null ? xl2Var.c.b.a() : null;
        String str = a instanceof String ? (String) a : null;
        return str != null ? str.equals("true") : featureFlag.getDefaultValue();
    }

    public static String f(int i) {
        if (i == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i == 2) {
            return "THROTTLE_NEVER";
        }
        w511.q();
        return null;
    }
}
