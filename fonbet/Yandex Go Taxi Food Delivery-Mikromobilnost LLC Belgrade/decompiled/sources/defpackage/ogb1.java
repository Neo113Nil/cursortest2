package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.cartech.dynamic.domain.g;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.Iterator;
import java.util.Set;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.yandex.tankerapp.go.domain.managers.a;
import ru.yandex.tankerapp.go.domain.managers.c;
import ru.yandex.tankerapp.go.domain.registrant.FlutterPluginRegistrant;

/* loaded from: classes5.dex */
public abstract class ogb1 {
    public static final void a(final egu0 egu0Var, tls tlsVar, boolean z, fid fidVar, int i) {
        boolean z2 = egu0Var.b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(985479566);
        int i2 = 2;
        int i3 = i | (btsVar.k(egu0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        final int i4 = 1;
        final int i5 = 0;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            p5l0 p5l0Var = egu0Var.f;
            ihu0 ihu0Var = egu0Var.e;
            boolean z3 = z2 && ihu0Var != null;
            boolean z4 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object Q = btsVar.Q();
            if (z4 || Q == did.a) {
                Q = new gyt0(i2, egu0Var, tlsVar);
                btsVar.o0(Q);
            }
            ydb1.a(q791.b(c530.a, null, null, z3, null, new awk0(0), (sls) Q, 8), wwg.S(1612712740, true, new zls() { // from class: dgu0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    egu0 egu0Var2 = egu0Var;
                    switch (i6) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                p5l0 p5l0Var2 = egu0Var2.f;
                                btsVar2.e0(821092775);
                                r5l0.b(ibp0Var, p5l0Var2, btsVar2, intValue & 14);
                                btsVar2.t(false);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                boolean z5 = egu0Var2.b;
                                c530 c530Var = c530.a;
                                f530 c = q6a1.c(c530Var, z5);
                                sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d = b.d(btsVar3, c);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a);
                                qje.W(btsVar3, d.e, o);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d);
                                CharSequence charSequence = egu0Var2.c;
                                if (charSequence == null) {
                                    btsVar3.e0(1891843946);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(1891843947);
                                    qgy.b(charSequence, null, ljs0.c(c530Var, 1.0f), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, 3456, 0, 12274);
                                    btsVar3.t(false);
                                }
                                qgy.b(egu0Var2.a, null, ljs0.c(c530Var, 1.0f), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.a, null, btsVar3, 3456, 0, 12274);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(1292969439, true, new zls() { // from class: dgu0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    egu0 egu0Var2 = egu0Var;
                    switch (i6) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                p5l0 p5l0Var2 = egu0Var2.f;
                                btsVar2.e0(821092775);
                                r5l0.b(ibp0Var, p5l0Var2, btsVar2, intValue & 14);
                                btsVar2.t(false);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                boolean z5 = egu0Var2.b;
                                c530 c530Var = c530.a;
                                f530 c = q6a1.c(c530Var, z5);
                                sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d = b.d(btsVar3, c);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a);
                                qje.W(btsVar3, d.e, o);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d);
                                CharSequence charSequence = egu0Var2.c;
                                if (charSequence == null) {
                                    btsVar3.e0(1891843946);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(1891843947);
                                    qgy.b(charSequence, null, ljs0.c(c530Var, 1.0f), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).h.a, null, btsVar3, 3456, 0, 12274);
                                    btsVar3.t(false);
                                }
                                qgy.b(egu0Var2.a, null, ljs0.c(c530Var, 1.0f), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.a, null, btsVar3, 3456, 0, 12274);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, (!z2 || ihu0Var == null) ? ka01.a : na01.a, null, SlotSize.L, false, btsVar, 1573296, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
            if (z) {
                btsVar.e0(-1973544506);
                r5l0.a(p5l0Var, null, btsVar, 0);
                btsVar.t(false);
            } else {
                btsVar.e0(-1973500300);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(egu0Var, tlsVar, z, i, 28);
        }
    }

    public static void b(String str) {
        if (((we51) zdz.a.get("default")) != null) {
            we51.a("generic_error", str);
        }
    }

    public static void c(FlutterEngine flutterEngine) {
        FlutterPluginRegistrant.registerWith(flutterEngine);
        xrr xrrVar = flutterEngine.d;
        w3i w3iVar = n19.b;
        if (w3iVar == null) {
            w3iVar = null;
        }
        com.yandex.go.cartech.dynamic.domain.d dVar = (com.yandex.go.cartech.dynamic.domain.d) w3iVar.c;
        use useVar = (use) w3iVar.z;
        Set f0 = j73.f0(new tsr[]{new a(dVar, useVar), new ru.yandex.tankerapp.go.domain.managers.b((g) w3iVar.w, useVar), new e4j0((jhu0) w3iVar.b), new ljw0((vm7) w3iVar.x), (j1h) w3iVar.A, new c((com.yandex.go.cartech.dynamic.domain.a) w3iVar.y, useVar), (cwy0) w3iVar.B});
        xrrVar.getClass();
        Iterator it = f0.iterator();
        while (it.hasNext()) {
            xrrVar.f((tsr) it.next());
        }
    }
}
