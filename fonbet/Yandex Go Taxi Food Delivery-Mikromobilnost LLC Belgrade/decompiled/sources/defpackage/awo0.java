package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation.ScootersShowNavigationBubbleAnalytics$BubbleButton;
import ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation.ScootersShowNavigationBubbleAnalytics$CloseReason;

/* loaded from: classes6.dex */
public final class awo0 {
    public final x770 a;
    public final String b;
    public final String c;

    public awo0(x770 x770Var, String str, String str2) {
        this.a = x770Var;
        this.b = str;
        this.c = str2;
    }

    public final void a(ScootersShowNavigationBubbleAnalytics$CloseReason scootersShowNavigationBubbleAnalytics$CloseReason) {
        String reason = scootersShowNavigationBubbleAnalytics$CloseReason.getReason();
        x770 x770Var = this.a;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        String str = this.b;
        if (str != null) {
            hashMap.put("scooter_parking", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        x770Var.a.a("ScootersBuildRouteBubble.Closed", hashMap, 1, tse0.r("close_reason", hashMap, reason));
    }

    public final void b(ScootersShowNavigationBubbleAnalytics$BubbleButton scootersShowNavigationBubbleAnalytics$BubbleButton) {
        String buttonName = scootersShowNavigationBubbleAnalytics$BubbleButton.getButtonName();
        x770 x770Var = this.a;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        String str = this.b;
        if (str != null) {
            hashMap.put("scooter_parking", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        x770Var.a.a("ScootersBuildRouteBubble.Tapped", hashMap, 1, tse0.r("button_name", hashMap, buttonName));
    }
}
