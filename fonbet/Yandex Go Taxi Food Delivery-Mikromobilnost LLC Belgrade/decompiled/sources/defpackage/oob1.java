package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public abstract class oob1 {
    public static final void a(final hk30 hk30Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2079384460);
        int i2 = i | (btsVar.e(hk30Var) ? 4 : 2) | (btsVar.e(tlsVar2) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        final int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 c = bzk0.c(ljs0.c(f530Var, 1.0f), AppColor$Palette.Background, qke.q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            c530 c530Var = c530.a;
            e5v.a(an91.o(c530Var, 10.0f, 10.0f, 0.0f, 0.0f, 12), new hdu(AppColor$Palette.Error, AppColor$Palette.EverFront), null, IconSpotSize.M, wwg.S(1279099574, true, new zls() { // from class: ik30
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    c36 e;
                    int i4 = i3;
                    zy11 zy11Var = zy11.a;
                    hk30 hk30Var2 = hk30Var;
                    switch (i4) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                f530 m = ljs0.m(c530.a, 24.0f);
                                int i5 = hk30Var2.a;
                                AppColor$Palette appColor$Palette = AppColor$Palette.EverFront;
                                pa90 a2 = wya1.a(i5, 0, btsVar2);
                                if (appColor$Palette == null) {
                                    btsVar2.e0(-1411607277);
                                    btsVar2.t(false);
                                    e = null;
                                } else {
                                    btsVar2.e0(-1411607276);
                                    e = tse0.e(tje.n(appColor$Palette, btsVar2), 5, btsVar2, false);
                                }
                                o4b1.b(a2, null, m, null, null, 0.0f, e, btsVar2, 392, 56);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                jeb1.f(hk30Var2.d, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 0, 0, 16382);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 27702, 4);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
            String str = hk30Var.b;
            ety0 ety0Var = xya1.d(btsVar).e.d;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            jeb1.f(str, m, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 432, 0, 16376);
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            jeb1.f(hk30Var.c, an91.m(c530Var, 16.0f, 0.0f, 2), appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 432, 0, 16376);
            btsVar = btsVar;
            f530 m2 = an91.m(n.e(c530Var, 24.0f, btsVar, c530Var, 1.0f), 8.0f, 0.0f, 2);
            boolean e = btsVar.e(hk30Var) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                tlsVar2 = tlsVar;
                Q = new ve30(4, tlsVar2, hk30Var);
                btsVar.o0(Q);
            } else {
                tlsVar2 = tlsVar;
            }
            final int i4 = 1;
            ohb1.b(m2, false, null, (sls) Q, wwg.S(1359810229, true, new zls() { // from class: ik30
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    c36 e2;
                    int i42 = i4;
                    zy11 zy11Var = zy11.a;
                    hk30 hk30Var2 = hk30Var;
                    switch (i42) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                f530 m3 = ljs0.m(c530.a, 24.0f);
                                int i5 = hk30Var2.a;
                                AppColor$Palette appColor$Palette2 = AppColor$Palette.EverFront;
                                pa90 a2 = wya1.a(i5, 0, btsVar2);
                                if (appColor$Palette2 == null) {
                                    btsVar2.e0(-1411607277);
                                    btsVar2.t(false);
                                    e2 = null;
                                } else {
                                    btsVar2.e0(-1411607276);
                                    e2 = tse0.e(tje.n(appColor$Palette2, btsVar2), 5, btsVar2, false);
                                }
                                o4b1.b(a2, null, m3, null, null, 0.0f, e2, btsVar2, 392, 56);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                jeb1.f(hk30Var2.d, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 0, 0, 16382);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 24582, 6);
            ly3.B(c530Var, 8.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(hk30Var, tlsVar2, f530Var, i, 28);
        }
    }

    public static final Object b(blc blcVar) {
        if (blcVar instanceof hlc) {
            return Boolean.valueOf(((hlc) blcVar).b);
        }
        if (blcVar instanceof qlc) {
            return Integer.valueOf(((qlc) blcVar).b);
        }
        if (blcVar instanceof rlc) {
            return ((rlc) blcVar).b;
        }
        if (blcVar instanceof tlc) {
            return ((tlc) blcVar).b;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            String str5 = null;
            if (i < 0) {
                scc.m();
                throw null;
            }
            oyy0 oyy0Var = (oyy0) obj;
            boolean z = oyy0Var instanceof lyy0;
            myy0 myy0Var = myy0.a;
            String str6 = "";
            if (z) {
                str2 = ((lyy0) oyy0Var).j;
            } else {
                if (jl40.l(oyy0Var, myy0Var)) {
                    str6 = oyr.i(i, "shimmering-");
                } else {
                    if (!(oyy0Var instanceof nyy0)) {
                        w511.b();
                        return;
                    }
                    str2 = ((nyy0) oyy0Var).e;
                }
                if (!linkedHashSet.add(str6)) {
                    if (z) {
                        lyy0 lyy0Var = (lyy0) oyy0Var;
                        str3 = lyy0Var.j;
                        str4 = lyy0Var.k;
                    } else if (oyy0Var instanceof nyy0) {
                        nyy0 nyy0Var = (nyy0) oyy0Var;
                        str3 = nyy0Var.e;
                        str4 = nyy0Var.f;
                    } else {
                        if (!jl40.l(oyy0Var, myy0Var)) {
                            w511.b();
                            return;
                        }
                        if (str5 == null) {
                            xby.l(jst.e, "ThreadsError.NotUniqueThreadIds", null, new Exception(), b64.l("There is not unique thread id on stop ", str, " - ", str5), 2);
                        }
                    }
                    str5 = b64.l("threadId: ", str3, ", lineId: ", str4);
                    if (str5 == null) {
                    }
                }
                i = i2;
            }
        }
    }
}
