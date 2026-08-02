package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.payments.paymentlist.ui.IconType;
import com.ybsdk.core.design.design.DesignTextStyle;
import java.util.Locale;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes6.dex */
public abstract class oe91 {
    public static final byte[] a = {-93, Alerts.alert_no_renegotiation, PKIBody._CANN, 4, 121, -60, -34, -67};
    public static final byte[] b = {-63, 5, Byte.MAX_VALUE, Alerts.alert_certificate_unobtainable, 38, -73, -70, -42, -4, 20, Alerts.alert_no_application_protocol, 106, 38, -81, -69, -60};

    public static final void a(y9o y9oVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-593565493);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(y9oVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 l = an91.l(bzk0.c(an91.m(ljs0.c(f530Var, 1.0f), 16.0f, 0.0f, 2), AppColor$Palette.BgMinor, cyk0.c(20.0f)), 16.0f, 10.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
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
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            to5 to5Var = x4c.E;
            f530 k = x2yVar.k(new pa31(to5Var));
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            i3 = 0;
            jeb1.f(y9oVar.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 0, 0, 16382);
            btsVar = btsVar;
            if (y9oVar.b != null) {
                btsVar.e0(459975276);
                jeb1.f(y9oVar.b, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 384, 0, 16378);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(460122557);
                btsVar.t(false);
            }
            btsVar.t(true);
            o4b1.b(vfc.k(f1h0.brick_sign, 0, -1411607277, btsVar, false), null, new pa31(to5Var), null, null, 0.0f, null, btsVar, 56, 56);
            btsVar.t(true);
        } else {
            i3 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gb31(y9oVar, f530Var, i, i3);
        }
    }

    public static final k0a0 b() {
        return new k0a0(IconType.SHARED_FAMILY);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static IconType c(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        switch (upperCase.hashCode()) {
            case -2048371625:
                if (upperCase.equals("DINERSCLUBCARTEBLANCHE")) {
                    return IconType.DINERS;
                }
                break;
            case -1776311499:
                if (upperCase.equals("UZCARD")) {
                    return IconType.UZCARD;
                }
                break;
            case -1553624974:
                if (upperCase.equals("MASTERCARD")) {
                    return IconType.MASTERCARD;
                }
                break;
            case -799687047:
                if (upperCase.equals("DISCOVERCARD")) {
                    return IconType.DISCOVER;
                }
                break;
            case 73257:
                if (upperCase.equals("JCB")) {
                    return IconType.JCB;
                }
                break;
            case 76342:
                if (upperCase.equals("MIR")) {
                    return IconType.MIR;
                }
                break;
            case 2358463:
                if (upperCase.equals("MAAL")) {
                    return IconType.MAAL;
                }
                break;
            case 2583784:
                if (upperCase.equals("TROY")) {
                    return IconType.TROY;
                }
                break;
            case 2634817:
                if (upperCase.equals("VISA")) {
                    return IconType.VISA;
                }
                break;
            case 232055600:
                if (upperCase.equals("AMERICANEXPRESS")) {
                    return IconType.AMERICAN_EXPRESS;
                }
                break;
            case 486122361:
                if (upperCase.equals("UNIONPAY")) {
                    return IconType.UNIONPAY;
                }
                break;
            case 493599233:
                if (upperCase.equals("BELKART")) {
                    return IconType.BELKART;
                }
                break;
            case 910441480:
                if (upperCase.equals("DINACARD")) {
                    return IconType.DINACARD;
                }
                break;
            case 1336157951:
                if (upperCase.equals("HUMOCARD")) {
                    return IconType.HUMO;
                }
                break;
            case 1545480463:
                if (upperCase.equals("MAESTRO")) {
                    return IconType.MAESTRO;
                }
                break;
            case 2047660103:
                if (upperCase.equals("ELCART")) {
                    return IconType.ELCART;
                }
                break;
        }
        return IconType.GENERIC_CARD;
    }

    public static final k0a0 d(String str) {
        return new k0a0(c(str));
    }

    public static final k0a0 e(SharedAccountType sharedAccountType) {
        return (sharedAccountType == null ? -1 : z7a0.a[sharedAccountType.ordinal()]) == 1 ? new k0a0(IconType.SHARED_BUSINESS) : new k0a0(IconType.SHARED_FAMILY);
    }

    public static final int f(DesignTextStyle designTextStyle) {
        switch (oyi.a[designTextStyle.ordinal()]) {
            case 1:
                return l1i0.Widget_YB_Text_Numbers0;
            case 2:
                return l1i0.Widget_YB_Text_Numbers1;
            case 3:
                return l1i0.Widget_YB_Text_Numbers2;
            case 4:
                return l1i0.Widget_YB_Text_Numbers3;
            case 5:
                return l1i0.Widget_YB_Text_Numbers4;
            case 6:
                return l1i0.Widget_YB_Text_Numbers5;
            case 7:
                return l1i0.Widget_YB_Text_Numbers6;
            case 8:
                return l1i0.Widget_YB_Text_Numbers7;
            case 9:
                return l1i0.Widget_YB_Text_Headline1_Bold;
            case 10:
                return l1i0.Widget_YB_Text_Headline2_Bold;
            case 11:
                return l1i0.Widget_YB_Text_Headline1;
            case 12:
                return l1i0.Widget_YB_Text_Headline2;
            case 13:
                return l1i0.Widget_YB_Text_Headline3;
            case 14:
                return l1i0.Widget_YB_Text_Headline4;
            case 15:
                return l1i0.Widget_YB_Text_Headline1_Black;
            case 16:
                return l1i0.Widget_YB_Text_Headline0_BoldCond;
            case 17:
                return l1i0.Widget_YB_Text_Headline1_BoldCond;
            case 18:
                return l1i0.Widget_YB_Text_Headline2_BoldCond;
            case 19:
                return l1i0.Widget_YB_Text_Headline3_BoldCond;
            case 20:
                return l1i0.Widget_YB_Text_Headline4_BoldCond;
            case 21:
                return l1i0.Widget_YB_Text_Headline41_BoldCond;
            case 22:
                return l1i0.Widget_YB_Text_Headline5_BoldCond;
            case 23:
                return l1i0.Widget_YB_Text_Headline6_BoldCond;
            case 24:
                return l1i0.Widget_YB_Text_Title1;
            case 25:
                return l1i0.Widget_YB_Text_Title2;
            case 26:
                return l1i0.Widget_YB_Text_Title3;
            case 27:
                return l1i0.Widget_YB_Text_Body1;
            case 28:
                return l1i0.Widget_YB_Text_Body2;
            case 29:
                return l1i0.Widget_YB_Text_Body3;
            case 30:
                return l1i0.Widget_YB_Text_Caption1_Regular;
            case 31:
                return l1i0.Widget_YB_Text_Caption2_Regular;
            case 32:
                return l1i0.Widget_YB_Text_Caption3_Regular;
            case 33:
                return l1i0.Widget_YB_Text_Caption1_Medium;
            case 34:
                return l1i0.Widget_YB_Text_Caption2_Medium;
            case 35:
                return l1i0.Widget_YB_Text_Caption3_Medium;
            case 36:
                return l1i0.Widget_YB_Text_Caption3_Bold;
            default:
                w511.b();
                return 0;
        }
    }
}
