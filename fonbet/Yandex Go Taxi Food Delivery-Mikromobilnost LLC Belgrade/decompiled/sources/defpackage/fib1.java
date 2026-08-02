package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.mapkit.geometry.Point;
import java.util.HashMap;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.purchase.domain.UpgradeStatus;

/* loaded from: classes6.dex */
public abstract class fib1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final void a(y7a y7aVar, fid fidVar, int i) {
        bts btsVar;
        c530 c530Var;
        ?? r1;
        bts btsVar2;
        y7a y7aVar2 = y7aVar;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-1109937846);
        int i2 = i | (btsVar3.k(y7aVar2) ? 4 : 2);
        if (btsVar3.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var2 = c530.a;
            f530 k = an91.k(ljs0.c(c530Var2, 1.0f), 16.0f);
            lhl0 a = khl0.a(lr20.g, x4c.E, btsVar3, 54);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d = b.d(btsVar3, k);
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
            CharSequence charSequence = y7aVar2.a;
            if (charSequence == null) {
                btsVar3.e0(1249408787);
                btsVar3.t(false);
                c530Var = c530Var2;
                r1 = 0;
                btsVar2 = btsVar3;
            } else {
                btsVar3.e0(1249408788);
                c530Var = c530Var2;
                r1 = 0;
                qgy.b(charSequence, null, new x2y(1.0f, false), AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 3, 0, xya1.e(btsVar3).f.d, null, btsVar3, 805309440, 6, 10738);
                bts btsVar4 = btsVar3;
                btsVar4.t(false);
                btsVar2 = btsVar4;
            }
            oeb1.c(btsVar2, ljs0.q(c530Var, 12.0f));
            y7aVar2 = y7aVar;
            CharSequence charSequence2 = y7aVar2.b;
            if (charSequence2 == null) {
                btsVar2.e0(1249710293);
                btsVar2.t(r1);
            } else {
                btsVar2.e0(1249710294);
                b(charSequence2, btsVar2, r1);
                btsVar2.t(r1);
            }
            btsVar2.t(true);
            btsVar = btsVar2;
        } else {
            btsVar3.Y();
            btsVar = btsVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(y7aVar2, i, 17);
        }
    }

    public static final void b(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2001843230);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = an91.m(bzk0.c(c530.a, AppColor$Palette.BgMinor, cyk0.a), 6.0f, 0.0f, 2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 1, 0, ety0.a(xya1.e(btsVar).h.c, 0L, 0L, null, null, null, uh6.w(0.2d), null, null, null, 0, 0L, null, null, 16777087), null, btsVar, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 6, 11254);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 3, charSequence);
        }
    }

    public static boolean c(l0v0 l0v0Var) {
        return l0v0Var.a == ButtonAction.PLUS_BUY_INAPP;
    }

    public static boolean d(l0v0 l0v0Var) {
        PurchaseStatus purchaseStatus = l0v0Var.c;
        return (purchaseStatus == PurchaseStatus.NETWORK_OR_SERVER_ERROR || purchaseStatus == PurchaseStatus.PURCHASE_AVAILABLE) && f(l0v0Var);
    }

    public static boolean e(l0v0 l0v0Var) {
        if (l0v0Var.a != ButtonAction.PLUS_BUY_INAPP) {
            PurchaseStatus purchaseStatus = l0v0Var.c;
            boolean z = (purchaseStatus == PurchaseStatus.PURCHASE_UNAVAILABLE || purchaseStatus == PurchaseStatus.PURCHASED) ? false : true;
            if (!f(l0v0Var) || !z) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(l0v0 l0v0Var) {
        vr41 vr41Var;
        String str;
        ButtonAction buttonAction = l0v0Var.a;
        String str2 = l0v0Var.b;
        return str2 != null && !evu0.J(str2) && (buttonAction == ButtonAction.PLUS_BUY || buttonAction == ButtonAction.PLUS_BUY_WEBVIEW) && (buttonAction != ButtonAction.PLUS_BUY_WEBVIEW || ((vr41Var = l0v0Var.f) != null && (str = vr41Var.a) != null && str.length() > 0));
    }

    public static boolean g(l0v0 l0v0Var) {
        UpgradeStatus upgradeStatus = l0v0Var.d;
        if (upgradeStatus == UpgradeStatus.UPGRADE_AVAILABLE || upgradeStatus == UpgradeStatus.NETWORK_OR_SERVER_ERROR) {
            return l0v0Var.c == PurchaseStatus.PURCHASED && l0v0Var.a == ButtonAction.PLUS_UPGRADE;
        }
        return false;
    }

    public static boolean h(l0v0 l0v0Var) {
        UpgradeStatus upgradeStatus = l0v0Var.d;
        return l0v0Var.c == PurchaseStatus.PURCHASED && l0v0Var.a == ButtonAction.PLUS_UPGRADE && (upgradeStatus != UpgradeStatus.UPGRADE_UNAVAILABLE && upgradeStatus != UpgradeStatus.UPGRADED);
    }

    public static final String i(Point point) {
        return point.getLatitude() + " " + point.getLongitude();
    }

    public static final HashMap j(Point point) {
        return kotlin.collections.b.h(new Pair("lat", Double.valueOf(point.getLatitude())), new Pair("lon", Double.valueOf(point.getLongitude())));
    }
}
