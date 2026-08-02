package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.tariffs.analytics.TariffAnalytics$ChangeReason;
import ru.yandex.taxi.tariffs.analytics.TariffAnalytics$Origin;
import ru.yandex.taxi.tariffs.analytics.TariffSelectionReporter$ChangeReason;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes10.dex */
public final class jnx0 {
    public final zax0 a;

    public jnx0(zax0 zax0Var) {
        this.a = zax0Var;
    }

    public final void a(fnx0 fnx0Var, fnx0 fnx0Var2, fnx0 fnx0Var3, TariffSelectionReporter$ChangeReason tariffSelectionReporter$ChangeReason) {
        TariffAnalytics$Origin tariffAnalytics$Origin;
        pex0 pex0Var;
        TariffAnalytics$ChangeReason tariffAnalytics$ChangeReason;
        String name;
        pex0 pex0Var2;
        pex0 pex0Var3;
        pex0 pex0Var4;
        is60 is60Var;
        pex0 pex0Var5;
        wu1 wu1Var;
        pex0 pex0Var6;
        pex0 pex0Var7 = fnx0Var2.c;
        pex0 pex0Var8 = fnx0Var3.c;
        String str = (fnx0Var == null || (pex0Var6 = fnx0Var.c) == null) ? null : pex0Var6.b;
        String str2 = fnx0Var != null ? fnx0Var.d : null;
        String a = (fnx0Var == null || (pex0Var5 = fnx0Var.c) == null || (wu1Var = pex0Var5.O) == null) ? null : wu1Var.a();
        String a2 = (fnx0Var == null || (pex0Var4 = fnx0Var.c) == null || (is60Var = pex0Var4.J0.b) == null) ? null : is60Var.a();
        if (a2 == null) {
            a2 = "";
        }
        if (evu0.J(a2)) {
            a2 = null;
        }
        List list = (fnx0Var == null || (pex0Var3 = fnx0Var.c) == null) ? null : pex0Var3.A0;
        if (list == null) {
            list = EmptyList.a;
        }
        if (list.isEmpty()) {
            list = null;
        }
        String str3 = fnx0Var2.d;
        String str4 = pex0Var7.b;
        wu1 wu1Var2 = pex0Var7.O;
        String a3 = wu1Var2 != null ? wu1Var2.a() : null;
        SelectionOrigin selectionOrigin = fnx0Var3.b;
        String str5 = fnx0Var3.d;
        String str6 = pex0Var8.b;
        wu1 wu1Var3 = pex0Var8.O;
        String a4 = wu1Var3 != null ? wu1Var3.a() : null;
        String a5 = pex0Var8.J0.b.a();
        if (evu0.J(a5)) {
            a5 = null;
        }
        List list2 = pex0Var8.A0;
        if (list2.isEmpty()) {
            list2 = null;
        }
        switch (inx0.a[selectionOrigin.ordinal()]) {
            case 1:
                tariffAnalytics$Origin = TariffAnalytics$Origin.PreorderController;
                break;
            case 2:
                tariffAnalytics$Origin = TariffAnalytics$Origin.Invalidate;
                break;
            case 3:
                tariffAnalytics$Origin = TariffAnalytics$Origin.ForceTariffSwitchForIntercityOrdersExperiment;
                break;
            case 4:
                tariffAnalytics$Origin = TariffAnalytics$Origin.ForceTariffSwitchIntercityDashboard;
                break;
            case 5:
                tariffAnalytics$Origin = TariffAnalytics$Origin.Personalstate;
                break;
            case 6:
                tariffAnalytics$Origin = TariffAnalytics$Origin.Shortcut;
                break;
            case 7:
                tariffAnalytics$Origin = TariffAnalytics$Origin.TrapOnlyFallback;
                break;
            case 8:
                tariffAnalytics$Origin = TariffAnalytics$Origin.Action;
                break;
            case 9:
                tariffAnalytics$Origin = TariffAnalytics$Origin.Deeplink;
                break;
            case 10:
                tariffAnalytics$Origin = TariffAnalytics$Origin.Redirect;
                break;
            case 11:
                tariffAnalytics$Origin = TariffAnalytics$Origin.DeliveryCancel;
                break;
            case 12:
                tariffAnalytics$Origin = TariffAnalytics$Origin.UnsupportedRequirements;
                break;
            case 13:
                tariffAnalytics$Origin = TariffAnalytics$Origin.User;
                break;
            case 14:
                tariffAnalytics$Origin = TariffAnalytics$Origin.DueTimetable;
                break;
            case 15:
                tariffAnalytics$Origin = TariffAnalytics$Origin.Main;
                break;
            case 16:
                tariffAnalytics$Origin = TariffAnalytics$Origin.Promotion;
                break;
            default:
                w511.b();
                return;
        }
        if (tariffSelectionReporter$ChangeReason != null) {
            pex0Var = pex0Var7;
            int i = inx0.b[tariffSelectionReporter$ChangeReason.ordinal()];
            if (i == 1) {
                tariffAnalytics$ChangeReason = TariffAnalytics$ChangeReason.NotAvailable;
            } else if (i == 2) {
                tariffAnalytics$ChangeReason = TariffAnalytics$ChangeReason.NotFoundInSelectedVertical;
            } else if (i == 3) {
                tariffAnalytics$ChangeReason = TariffAnalytics$ChangeReason.SelectedVerticalNotFound;
            } else if (i == 4) {
                tariffAnalytics$ChangeReason = TariffAnalytics$ChangeReason.PreviouslyChangedByUser;
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                tariffAnalytics$ChangeReason = TariffAnalytics$ChangeReason.NotCanBeDefault;
            }
        } else {
            pex0Var = pex0Var7;
            tariffAnalytics$ChangeReason = null;
        }
        zax0 zax0Var = this.a;
        zax0Var.getClass();
        pho phoVar = zax0Var.a;
        TariffAnalytics$ChangeReason tariffAnalytics$ChangeReason2 = tariffAnalytics$ChangeReason;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("previous_tariff", str);
        }
        if (str2 != null) {
            hashMap.put("previous_vertical_id", str2);
        }
        if (a != null) {
            hashMap.put("previous_alt_type", a);
        }
        hashMap.put("desired_tariff", str4);
        hashMap.put("desired_vertical_id", str3);
        if (a3 != null) {
            hashMap.put("desired_alt_type", a3);
        }
        hashMap.put("selected_tariff", str6);
        hashMap.put("selected_vertical_id", str5);
        if (a4 != null) {
            hashMap.put("selected_alt_type", a4);
        }
        if (a2 != null) {
            hashMap.put("previous_offer_id", a2);
        }
        if (a5 != null) {
            hashMap.put("selected_offer_id", a5);
        }
        if (list != null) {
            hashMap.put("previous_faster_tariff_list", list);
        }
        if (list2 != null) {
            hashMap.put("selected_faster_tariff_list", list2);
        }
        if (tariffAnalytics$ChangeReason2 != null) {
            hashMap.put("change_reason", tariffAnalytics$ChangeReason2.getEventValue());
        }
        hashMap.put("origin", tariffAnalytics$Origin.getEventValue());
        phoVar.a("Tariff.Selected", hashMap, 1, new HashMap());
        String str7 = (fnx0Var == null || (pex0Var2 = fnx0Var.c) == null) ? null : pex0Var2.b;
        String str8 = fnx0Var != null ? fnx0Var.d : null;
        String str9 = pex0Var.b;
        String str10 = pex0Var8.b;
        String name2 = selectionOrigin.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name2.toLowerCase(locale);
        String lowerCase2 = (tariffSelectionReporter$ChangeReason == null || (name = tariffSelectionReporter$ChangeReason.name()) == null) ? null : name.toLowerCase(locale);
        HashMap hashMap2 = new HashMap();
        if (str7 != null) {
            hashMap2.put("before_tariff_class", str7);
        }
        if (str10 != null) {
            hashMap2.put("after_tariff_class", str10);
        }
        if (str8 != null) {
            hashMap2.put("before_vertical_id", str8);
        }
        if (str5 != null) {
            hashMap2.put("after_vertical_id", str5);
        }
        if (str9 != null) {
            hashMap2.put("desired_tariff_class", str9);
        }
        if (str3 != null) {
            hashMap2.put("desired_vertical_id", str3);
        }
        hashMap2.put("origin", lowerCase);
        if (lowerCase2 != null) {
            hashMap2.put(CRLReasonCodeExtension.REASON, lowerCase2);
        }
        phoVar.a("Tariff.Selection", hashMap2, 1, new HashMap());
    }
}
