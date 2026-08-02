package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.chargers.discounts.list.ui.ChargersDiscountsListUiState$Content$DiscountsTabType;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class ohb1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    public static final void a(oip0 oip0Var, yv9 yv9Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        Object obj;
        Object obj2;
        boolean z;
        dmw0 dmw0Var;
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType;
        List list;
        vv9 vv9Var;
        float f;
        int i2;
        f530 o;
        float f2;
        f530 c;
        tls tlsVar2;
        int i3;
        vv9 vv9Var2;
        c530 c530Var;
        ?? r0;
        boolean z2;
        int i4;
        g43 g43Var;
        float f3;
        int i5;
        boolean z3;
        Object obj3;
        gji0 gji0Var = qke.q;
        so5 so5Var = x4c.G;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1070159668);
        dmw0 dmw0Var2 = btsVar.a;
        int i6 = (i & 6) == 0 ? (btsVar.k(oip0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= btsVar.k(yv9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i7 = i6 | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i7 & 1, (i7 & 1171) != 1170)) {
            List list2 = yv9Var.c;
            vv9 vv9Var3 = yv9Var.e;
            Iterator it = list2.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((wv9) obj2).c) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            wv9 wv9Var = (wv9) obj2;
            if (wv9Var == null) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new s09(oip0Var, yv9Var, tlsVar, i);
                    return;
                }
                return;
            }
            ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType2 = wv9Var.a;
            List list3 = wv9Var.f;
            boolean k = btsVar.k(wv9Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            Object obj4 = Q;
            if (k || Q == o430Var) {
                if (list3.size() > 1 && ev9.a[chargersDiscountsListUiState$Content$DiscountsTabType2.ordinal()] == 1) {
                    List list4 = list3;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((tu9) it2.next()) instanceof pu9) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                Boolean valueOf = Boolean.valueOf(z);
                btsVar.o0(valueOf);
                obj4 = valueOf;
            }
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            c530 c530Var2 = c530.a;
            if (booleanValue) {
                dmw0Var = dmw0Var2;
                chargersDiscountsListUiState$Content$DiscountsTabType = chargersDiscountsListUiState$Content$DiscountsTabType2;
                list = list3;
                f = 24.0f;
                vv9Var = vv9Var3;
                i2 = 12;
                o = an91.o(bzk0.c(ymb1.l(ljs0.c(c530Var2, 1.0f), cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3)), AppColor$Palette.Background, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 0.0f, 4.0f, 0.0f, 4.0f, 5);
            } else {
                dmw0Var = dmw0Var2;
                chargersDiscountsListUiState$Content$DiscountsTabType = chargersDiscountsListUiState$Content$DiscountsTabType2;
                list = list3;
                vv9Var = vv9Var3;
                f = 24.0f;
                i2 = 12;
                o = an91.o(bzk0.c(ljs0.c(c530Var2, 1.0f), AppColor$Palette.Background, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            }
            if (booleanValue) {
                c = an91.o(bzk0.c(ymb1.l(ljs0.c(c530Var2, 1.0f), cyk0.e(f, f, 0.0f, 0.0f, i2)), AppColor$Palette.Background, gji0Var), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                f2 = 1.0f;
            } else {
                f2 = 1.0f;
                c = bzk0.c(ljs0.c(c530Var2, 1.0f), AppColor$Palette.Background, gji0Var);
            }
            f530 c2 = bzk0.c(pw91.u(ljs0.c(c530Var2, f2), oip0Var, 14), AppColor$Palette.CardDivider, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12));
            g43 g43Var2 = lr20.c;
            sic a = qic.a(g43Var2, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, c2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf2 = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf2);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            f530 f530Var3 = c;
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            sic a2 = qic.a(g43Var2, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, o);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            rhb1.a(yv9Var.b, btsVar, 0);
            if (yv9Var.c.size() > 1) {
                btsVar.e0(-284824462);
                ArrayList arrayList = yv9Var.g;
                nwa nwaVar = new nwa(wv9Var.d, wv9Var.b, chargersDiscountsListUiState$Content$DiscountsTabType.name());
                f530 m = an91.m(c530Var2, 14.0f, 0.0f, 2);
                boolean z4 = (i7 & 896) == 256;
                Object Q2 = btsVar.Q();
                if (z4 || Q2 == o430Var) {
                    tlsVar2 = tlsVar;
                    z3 = false;
                    dv9 dv9Var = new dv9(false ? 1 : 0, tlsVar2);
                    btsVar.o0(dv9Var);
                    obj3 = dv9Var;
                } else {
                    tlsVar2 = tlsVar;
                    z3 = false;
                    obj3 = Q2;
                }
                tls tlsVar4 = (tls) obj3;
                c530Var = c530Var2;
                i3 = 1;
                vv9Var2 = vv9Var;
                h791.b(m, arrayList, nwaVar, tlsVar4, null, btsVar, 6);
                ly3.B(c530Var, 12.0f, btsVar, z3);
                r0 = z3;
            } else {
                tlsVar2 = tlsVar;
                i3 = 1;
                vv9Var2 = vv9Var;
                c530Var = c530Var2;
                r0 = 0;
                btsVar.e0(-284470814);
                btsVar.t(false);
            }
            if (ev9.a[chargersDiscountsListUiState$Content$DiscountsTabType.ordinal()] == i3) {
                btsVar.e0(-284379550);
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (((tu9) next) instanceof pu9) {
                        obj = next;
                        break;
                    }
                }
                tu9 tu9Var = (tu9) obj;
                if (tu9Var == null) {
                    btsVar.e0(-284231867);
                    btsVar.t(r0);
                    i5 = i3;
                    i4 = i7;
                    g43Var = g43Var2;
                    f3 = 1.0f;
                } else {
                    btsVar.e0(-284231866);
                    g43Var = g43Var2;
                    f3 = 1.0f;
                    i4 = i7;
                    i5 = i3;
                    khb1.a(tu9Var, yv9Var.f, vv9Var2 == null ? i3 : r0, tlsVar2, an91.o(ljs0.c(c530Var, 1.0f), 12.0f, 0.0f, 12.0f, 8.0f, 2), btsVar, ((i7 << 3) & 7168) | HProv.ALG_CLASS_DATA_ENCRYPT);
                    btsVar.t(r0);
                }
                btsVar.t(r0);
                z2 = i5;
            } else {
                z2 = i3;
                i4 = i7;
                g43Var = g43Var2;
                f3 = 1.0f;
                btsVar.e0(2069053892);
                btsVar.t(r0);
            }
            btsVar.t(z2);
            if (booleanValue) {
                tse0.s(btsVar, -628600126, c530Var, 6.0f, btsVar);
                btsVar.t(r0);
            } else {
                btsVar.e0(-628548232);
                btsVar.t(r0);
            }
            sic a3 = qic.a(g43Var, so5Var, btsVar, r0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d3 = b.d(btsVar, f530Var3);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar5 = d.f;
            qje.W(btsVar, wlsVar5, a3);
            wls wlsVar6 = d.e;
            qje.W(btsVar, wlsVar6, o4);
            Integer valueOf3 = Integer.valueOf(hashCode3);
            wls wlsVar7 = d.g;
            qje.W(btsVar, wlsVar7, valueOf3);
            tls tlsVar5 = d.h;
            qje.M(btsVar, tlsVar5);
            wls wlsVar8 = d.d;
            qje.W(btsVar, wlsVar8, d3);
            if (vv9Var2 == null) {
                btsVar.e0(-782732972);
                btsVar.t(r0);
            } else {
                btsVar.e0(-782732971);
                nhb1.a(vv9Var2, btsVar, r0);
                btsVar.t(r0);
            }
            f530 c3 = ljs0.c(c530Var, f3);
            sic a4 = qic.a(g43Var, so5Var, btsVar, r0);
            vv9 vv9Var4 = vv9Var2;
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o5 = btsVar.o();
            f530 d4 = b.d(btsVar, c3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar5, a4);
            qje.W(btsVar, wlsVar6, o5);
            vfc.v(hashCode4, btsVar, wlsVar7, btsVar, tlsVar5);
            qje.W(btsVar, wlsVar8, d4);
            btsVar.e0(-724157690);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj5 : list) {
                if (!(((tu9) obj5) instanceof pu9)) {
                    arrayList2.add(obj5);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                khb1.a((tu9) it4.next(), yv9Var.f, vv9Var4 == null, tlsVar, an91.o(ljs0.c(c530Var, f3), 12.0f, 0.0f, 12.0f, 8.0f, 2), btsVar, ((i4 << 3) & 7168) | HProv.ALG_CLASS_DATA_ENCRYPT);
            }
            ly3.A(btsVar, false, true, true, true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new g0((Object) oip0Var, tlsVar, (Object) yv9Var, (Object) f530Var2, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, boolean z, ButtonSize buttonSize, sls slsVar, zls zlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        ButtonSize buttonSize2;
        boolean z3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1434358994);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= btsVar.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 256 : 128;
            }
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.e(slsVar) ? 2048 : 1024;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar.e(zlsVar) ? 16384 : 8192;
            }
            if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                btsVar.Y();
                buttonSize2 = buttonSize;
                z3 = z2;
            } else {
                f530 f530Var3 = i5 != 0 ? c530.a : f530Var2;
                boolean z4 = i6 != 0 ? true : z2;
                ButtonSize buttonSize3 = i4 != 0 ? ButtonSize.L : buttonSize;
                int i7 = i3 << 6;
                d17.c(f530Var3, z4, buttonSize3, ButtonStyle.Main, ButtonForm.Squircle, slsVar, zlsVar, btsVar, (i3 & 14) | 27648 | (i3 & 112) | (i3 & 896) | (458752 & i7) | (i7 & 3670016), 0);
                f530Var2 = f530Var3;
                z3 = z4;
                buttonSize2 = buttonSize3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new cpr(f530Var2, z3, buttonSize2, slsVar, zlsVar, i, i2, 1);
                return;
            }
            return;
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final String c(int i, int i2, fid fidVar) {
        return ((Resources) ((bts) fidVar).m(AndroidCompositionLocals_androidKt.c)).getQuantityString(i, i2);
    }

    public static final String d(int i, Object[] objArr, fid fidVar) {
        return ((Resources) ((bts) fidVar).m(AndroidCompositionLocals_androidKt.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String e(fid fidVar, int i) {
        return ((Resources) ((bts) fidVar).m(AndroidCompositionLocals_androidKt.c)).getString(i);
    }
}
