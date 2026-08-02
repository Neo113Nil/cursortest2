package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.a;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes6.dex */
public final class p4j {
    public final o2y0 a;
    public final lx4 b;
    public final co40 c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final i3y e = a.a(new amh(18, this));

    public p4j(o2y0 o2y0Var, lx4 lx4Var, co40 co40Var) {
        this.a = o2y0Var;
        this.b = lx4Var;
        this.c = co40Var;
    }

    public static String a(ActionType actionType) {
        switch (o4j.a[actionType.ordinal()]) {
            case 1:
                return "Cancel";
            case 2:
                return "Call";
            case 3:
                return "Chat";
            case 4:
                return "CommunicationToDriver";
            case 5:
                return "ShareRoute";
            case 6:
                return "SafetyCenter";
            case 7:
                return "OnMyWay";
            case 8:
                return "HardOfHearingDriver";
            case 9:
                return "Driver";
            default:
                String name = actionType.name();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                if (lowerCase.length() <= 0) {
                    return lowerCase;
                }
                return ((Object) String.valueOf(lowerCase.charAt(0)).toUpperCase(locale)) + lowerCase.substring(1);
        }
    }

    public final synchronized void b(String str) {
        if (!this.d.contains(str) && ((DriveState) this.e.getValue()) == this.a.c()) {
            lx4 lx4Var = this.b;
            String str2 = this.a.b().a;
            j jVar = (j) lx4Var;
            jVar.getClass();
            new i(jVar, "OrderDetails." + str + ".Show", str2).m();
            this.d.add(str);
        }
    }

    public final void c(String str) {
        String str2 = this.a.b().a;
        String p = oyr.p("OrderDetails.", str, ".Tapped");
        j jVar = (j) this.b;
        jVar.getClass();
        new i(jVar, p, str2).m();
    }

    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        co40 co40Var = this.c;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("visible_button_list", arrayList);
        hashMap.put("invisible_button_list", arrayList2);
        co40Var.a.a("OrderDetails.ButtonsVisibility", hashMap, 1, new HashMap());
    }
}
