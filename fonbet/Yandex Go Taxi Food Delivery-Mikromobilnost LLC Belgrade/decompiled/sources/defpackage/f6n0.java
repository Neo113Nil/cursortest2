package defpackage;

import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$CardButton;
import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$CardShownState;
import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$InsuranceState;
import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState;
import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$TariffIdentifier;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$InsuranceState;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$TariffIdentifierState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.analytics.i;

/* loaded from: classes13.dex */
public final class f6n0 {
    public final lx4 a;
    public final p2o0 b;
    public final c3o0 c;
    public final i5n0 d;
    public final q4o0 e;

    public f6n0(lx4 lx4Var, p2o0 p2o0Var, c3o0 c3o0Var, i5n0 i5n0Var, q4o0 q4o0Var) {
        this.a = lx4Var;
        this.b = p2o0Var;
        this.c = c3o0Var;
        this.d = i5n0Var;
        this.e = q4o0Var;
    }

    public static void a(i iVar, cpm0 cpm0Var, boolean z) {
        iVar.d("scooter_number", cpm0Var.a.a);
        iVar.d("button_name", (z ? ScootersOfferCardAnalytics$CardShownState.Opened : ScootersOfferCardAnalytics$CardShownState.Minimized).getEventValue());
    }

    public static ScootersCardV2Analytics$TariffIdentifierState e(b4p0 b4p0Var) {
        if (b4p0Var instanceof xzt0) {
            return ScootersCardV2Analytics$TariffIdentifierState.STANDARD;
        }
        if (b4p0Var instanceof eer) {
            return ScootersCardV2Analytics$TariffIdentifierState.FIX;
        }
        if (b4p0Var instanceof b590) {
            return ScootersCardV2Analytics$TariffIdentifierState.PACKAGE;
        }
        if (b4p0Var == null) {
            return ScootersCardV2Analytics$TariffIdentifierState.UNKNOWN;
        }
        w511.b();
        return null;
    }

    public static ScootersCardV2Analytics$InsuranceState f(n3o0 n3o0Var) {
        if (n3o0Var == null) {
            return ScootersCardV2Analytics$InsuranceState.UNAVAILABLE;
        }
        int i = e6n0.a[n3o0Var.a.ordinal()];
        if (i == 1) {
            return ScootersCardV2Analytics$InsuranceState.UNAVAILABLE;
        }
        if (i == 2) {
            return ScootersCardV2Analytics$InsuranceState.STANDART;
        }
        if (i == 3) {
            return ScootersCardV2Analytics$InsuranceState.FULL;
        }
        w511.b();
        return null;
    }

    public static String g(y5n0 y5n0Var, b4p0 b4p0Var, ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton) {
        if (scootersOfferCardAnalytics$CardButton == ScootersOfferCardAnalytics$CardButton.Package || scootersOfferCardAnalytics$CardButton == ScootersOfferCardAnalytics$CardButton.Book) {
            if (b4p0Var != null && (b4p0Var instanceof b590)) {
                return ((b590) b4p0Var).n.a;
            }
            i5p0 b = m4b1.b(y5n0Var.h);
            b4p0 b4p0Var2 = b != null ? b.f : null;
            b590 b590Var = b4p0Var2 instanceof b590 ? (b590) b4p0Var2 : null;
            if (b590Var != null) {
                return b590Var.n.a;
            }
        }
        return null;
    }

    public final void b(y5n0 y5n0Var, b4p0 b4p0Var, String str, ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton, boolean z, Boolean bool) {
        String str2;
        ScootersOfferCardAnalytics$CardShownState scootersOfferCardAnalytics$CardShownState;
        ScootersOfferCardAnalytics$TariffIdentifier evgenValue;
        ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState scootersOfferCardAnalytics$SubscriptionPromoblockToggleState;
        Double valueOf;
        Integer valueOf2;
        p2o0 p2o0Var;
        String str3;
        Integer num;
        String str4;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton2;
        ScootersOfferCardAnalytics$InsuranceState scootersOfferCardAnalytics$InsuranceState;
        String str5;
        ScootersCardV2Analytics$TariffIdentifierState e;
        ScootersCardV2Analytics$TariffIdentifierState e2;
        int i;
        ScootersCardV2Analytics$TariffIdentifierState e3;
        if (y5n0Var != null) {
            n3o0 n3o0Var = y5n0Var.g;
            vbn0 vbn0Var = y5n0Var.j;
            boolean z2 = vbn0Var instanceof rbn0;
            q4o0 q4o0Var = this.e;
            i5n0 i5n0Var = this.d;
            if (z2) {
                cpm0 cpm0Var = ((rbn0) vbn0Var).e;
                str2 = cpm0Var.a.a;
                q7p0 q7p0Var = cpm0Var.d;
                int i2 = q7p0Var.a;
                int i3 = (int) q7p0Var.b;
                double d = q7p0Var.c;
                ScootersOfferCardAnalytics$InsuranceState evgenValue2 = f(n3o0Var).getEvgenValue();
                ScootersOfferCardAnalytics$CardShownState scootersOfferCardAnalytics$CardShownState2 = z ? ScootersOfferCardAnalytics$CardShownState.Opened : ScootersOfferCardAnalytics$CardShownState.Minimized;
                if (str == null) {
                    str4 = g(y5n0Var, b4p0Var, scootersOfferCardAnalytics$CardButton);
                    i = i2;
                } else {
                    i = i2;
                    str4 = str;
                }
                ScootersOfferCardAnalytics$TariffIdentifier evgenValue3 = (b4p0Var == null || (e3 = e(b4p0Var)) == null) ? null : e3.getEvgenValue();
                scootersOfferCardAnalytics$CardShownState = scootersOfferCardAnalytics$CardShownState2;
                str3 = i5n0Var.a();
                String str6 = q4o0Var.a().c.a;
                scootersOfferCardAnalytics$SubscriptionPromoblockToggleState = bool != null ? bool.booleanValue() ? ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState.Enabled : ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState.Disabled : null;
                Integer valueOf3 = Integer.valueOf(i);
                Double valueOf4 = Double.valueOf(d);
                Integer valueOf5 = Integer.valueOf(i3);
                p2o0Var = this.b;
                ScootersOfferCardAnalytics$TariffIdentifier scootersOfferCardAnalytics$TariffIdentifier = evgenValue3;
                num = valueOf3;
                scootersOfferCardAnalytics$CardButton2 = scootersOfferCardAnalytics$CardButton;
                scootersOfferCardAnalytics$InsuranceState = evgenValue2;
                str5 = str6;
                valueOf = valueOf4;
                valueOf2 = valueOf5;
                evgenValue = scootersOfferCardAnalytics$TariffIdentifier;
            } else {
                if (vbn0Var instanceof sbn0) {
                    for (cpm0 cpm0Var2 : ((sbn0) vbn0Var).e) {
                        String str7 = cpm0Var2.a.a;
                        q7p0 q7p0Var2 = cpm0Var2.d;
                        int i4 = q7p0Var2.a;
                        int i5 = (int) q7p0Var2.b;
                        i5n0 i5n0Var2 = i5n0Var;
                        n3o0 n3o0Var2 = n3o0Var;
                        p2o0.b(this.b, scootersOfferCardAnalytics$CardButton, Integer.valueOf(i4), q4o0Var.a().c.a, f(n3o0Var).getEvgenValue(), i5n0Var2.a(), str == null ? g(y5n0Var, b4p0Var, scootersOfferCardAnalytics$CardButton) : str, Double.valueOf(q7p0Var2.c), Integer.valueOf(i5), str7, (b4p0Var == null || (e2 = e(b4p0Var)) == null) ? null : e2.getEvgenValue(), z ? ScootersOfferCardAnalytics$CardShownState.Opened : ScootersOfferCardAnalytics$CardShownState.Minimized, bool != null ? bool.booleanValue() ? ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState.Enabled : ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState.Disabled : null);
                        q4o0Var = q4o0Var;
                        n3o0Var = n3o0Var2;
                        i5n0Var = i5n0Var2;
                    }
                    return;
                }
                if (!(vbn0Var instanceof ubn0)) {
                    w511.b();
                    return;
                }
                cpm0 cpm0Var3 = ((ubn0) vbn0Var).e;
                str2 = cpm0Var3.a.a;
                q7p0 q7p0Var3 = cpm0Var3.d;
                int i6 = q7p0Var3.a;
                int i7 = (int) q7p0Var3.b;
                double d2 = q7p0Var3.c;
                ScootersOfferCardAnalytics$InsuranceState evgenValue4 = f(n3o0Var).getEvgenValue();
                scootersOfferCardAnalytics$CardShownState = z ? ScootersOfferCardAnalytics$CardShownState.Opened : ScootersOfferCardAnalytics$CardShownState.Minimized;
                String g = str == null ? g(y5n0Var, b4p0Var, scootersOfferCardAnalytics$CardButton) : str;
                evgenValue = (b4p0Var == null || (e = e(b4p0Var)) == null) ? null : e.getEvgenValue();
                String a = i5n0Var.a();
                String str8 = q4o0Var.a().c.a;
                scootersOfferCardAnalytics$SubscriptionPromoblockToggleState = bool != null ? bool.booleanValue() ? ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState.Enabled : ScootersOfferCardAnalytics$SubscriptionPromoblockToggleState.Disabled : null;
                Integer valueOf6 = Integer.valueOf(i6);
                valueOf = Double.valueOf(d2);
                valueOf2 = Integer.valueOf(i7);
                p2o0Var = this.b;
                str3 = a;
                num = valueOf6;
                str4 = g;
                scootersOfferCardAnalytics$CardButton2 = scootersOfferCardAnalytics$CardButton;
                scootersOfferCardAnalytics$InsuranceState = evgenValue4;
                str5 = str8;
            }
            p2o0.b(p2o0Var, scootersOfferCardAnalytics$CardButton2, num, str5, scootersOfferCardAnalytics$InsuranceState, str3, str4, valueOf, valueOf2, str2, evgenValue, scootersOfferCardAnalytics$CardShownState, scootersOfferCardAnalytics$SubscriptionPromoblockToggleState);
        }
    }

    public final void c(ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton) {
        String eventValue = scootersCardV2Analytics$CardButton.getEvgenValue().getEventValue();
        c3o0 c3o0Var = this.c;
        c3o0Var.getClass();
        c3o0Var.a.a("ScootersOfferDetails.Tapped", x4e.p("button_name", eventValue), 1, new HashMap());
    }

    public final void d(y5n0 y5n0Var, boolean z, ArrayList arrayList) {
        String str;
        ScootersCardV2Analytics$TariffIdentifierState e;
        String str2;
        ScootersCardV2Analytics$TariffIdentifierState e2;
        String str3;
        ScootersCardV2Analytics$TariffIdentifierState e3;
        vbn0 vbn0Var = y5n0Var.j;
        n3o0 n3o0Var = y5n0Var.g;
        List list = y5n0Var.h;
        boolean z2 = vbn0Var instanceof rbn0;
        q4o0 q4o0Var = this.e;
        i5n0 i5n0Var = this.d;
        int i = 10;
        if (z2) {
            cpm0 cpm0Var = ((rbn0) vbn0Var).e;
            String str4 = cpm0Var.a.a;
            q7p0 q7p0Var = cpm0Var.d;
            int i2 = q7p0Var.a;
            int i3 = (int) q7p0Var.b;
            double d = q7p0Var.c;
            ArrayList e4 = m1b1.e(list);
            ArrayList arrayList2 = new ArrayList(tcc.n(e4, 10));
            Iterator it = e4.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ScootersCardV2Analytics$TariffIdentifierState) it.next()).getEvgenValue().getEventValue());
            }
            String X = a.X(arrayList2, ",", null, null, null, 62);
            i5p0 b = m4b1.b(list);
            ScootersOfferCardAnalytics$TariffIdentifier evgenValue = (b == null || (e3 = e(b.f)) == null) ? null : e3.getEvgenValue();
            if (arrayList != null) {
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((ScootersCardV2Analytics$TariffIdentifierState) it2.next()).getEvgenValue().getEventValue());
                }
                str3 = a.X(arrayList3, ",", null, null, null, 62);
            } else {
                str3 = null;
            }
            p2o0.a(this.b, Integer.valueOf(i2), q4o0Var.a().c.a, f(n3o0Var).getEvgenValue(), X, i5n0Var.a(), Double.valueOf(d), Integer.valueOf(i3), str4, evgenValue, z ? ScootersOfferCardAnalytics$CardShownState.Opened : ScootersOfferCardAnalytics$CardShownState.Minimized, str3);
            return;
        }
        if (vbn0Var instanceof sbn0) {
            for (cpm0 cpm0Var2 : ((sbn0) vbn0Var).e) {
                String str5 = cpm0Var2.a.a;
                q7p0 q7p0Var2 = cpm0Var2.d;
                int i4 = q7p0Var2.a;
                int i5 = (int) q7p0Var2.b;
                double d2 = q7p0Var2.c;
                ArrayList e5 = m1b1.e(list);
                ArrayList arrayList4 = new ArrayList(tcc.n(e5, i));
                Iterator it3 = e5.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((ScootersCardV2Analytics$TariffIdentifierState) it3.next()).getEvgenValue().getEventValue());
                }
                String X2 = a.X(arrayList4, ",", null, null, null, 62);
                i5p0 b2 = m4b1.b(list);
                ScootersOfferCardAnalytics$TariffIdentifier evgenValue2 = (b2 == null || (e2 = e(b2.f)) == null) ? null : e2.getEvgenValue();
                if (arrayList != null) {
                    ArrayList arrayList5 = new ArrayList(tcc.n(arrayList, i));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((ScootersCardV2Analytics$TariffIdentifierState) it4.next()).getEvgenValue().getEventValue());
                    }
                    str2 = a.X(arrayList5, ",", null, null, null, 62);
                } else {
                    str2 = null;
                }
                p2o0.a(this.b, Integer.valueOf(i4), q4o0Var.a().c.a, f(n3o0Var).getEvgenValue(), X2, i5n0Var.a(), Double.valueOf(d2), Integer.valueOf(i5), str5, evgenValue2, z ? ScootersOfferCardAnalytics$CardShownState.Opened : ScootersOfferCardAnalytics$CardShownState.Minimized, str2);
                i = 10;
            }
            return;
        }
        if (!(vbn0Var instanceof ubn0)) {
            w511.b();
            return;
        }
        cpm0 cpm0Var3 = ((ubn0) vbn0Var).e;
        String str6 = cpm0Var3.a.a;
        q7p0 q7p0Var3 = cpm0Var3.d;
        int i6 = q7p0Var3.a;
        int i7 = (int) q7p0Var3.b;
        double d3 = q7p0Var3.c;
        ArrayList e6 = m1b1.e(list);
        ArrayList arrayList6 = new ArrayList(tcc.n(e6, 10));
        Iterator it5 = e6.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((ScootersCardV2Analytics$TariffIdentifierState) it5.next()).getEvgenValue().getEventValue());
        }
        String X3 = a.X(arrayList6, ",", null, null, null, 62);
        i5p0 b3 = m4b1.b(list);
        ScootersOfferCardAnalytics$TariffIdentifier evgenValue3 = (b3 == null || (e = e(b3.f)) == null) ? null : e.getEvgenValue();
        if (arrayList != null) {
            ArrayList arrayList7 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList7.add(((ScootersCardV2Analytics$TariffIdentifierState) it6.next()).getEvgenValue().getEventValue());
            }
            str = a.X(arrayList7, ",", null, null, null, 62);
        } else {
            str = null;
        }
        p2o0.a(this.b, Integer.valueOf(i6), q4o0Var.a().c.a, f(n3o0Var).getEvgenValue(), X3, i5n0Var.a(), Double.valueOf(d3), Integer.valueOf(i7), str6, evgenValue3, z ? ScootersOfferCardAnalytics$CardShownState.Opened : ScootersOfferCardAnalytics$CardShownState.Minimized, str);
    }
}
