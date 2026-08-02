package defpackage;

import java.util.LinkedHashMap;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.force.ScootersForceCompletionViewAnalytics$TappedButton;

/* loaded from: classes6.dex */
public final class non0 {
    public final lx4 a;
    public final String b;

    public non0(lx4 lx4Var, String str) {
        this.a = lx4Var;
        this.b = str;
    }

    public final void a(ScootersForceCompletionViewAnalytics$TappedButton scootersForceCompletionViewAnalytics$TappedButton, r7p0 r7p0Var, String str) {
        i d = ((j) this.a).d(this.b.concat(".Tapped"));
        String str2 = r7p0Var.a;
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("scooter_number", str2);
        linkedHashMap.put("button_name", scootersForceCompletionViewAnalytics$TappedButton.getButtonName());
        linkedHashMap.put("order_id", str);
        d.m();
    }

    public final void b(r7p0 r7p0Var, String str) {
        i d = ((j) this.a).d(this.b.concat(".Closed"));
        String str2 = r7p0Var.a;
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("scooter_number", str2);
        linkedHashMap.put("close_reason", "button");
        linkedHashMap.put("order_id", str);
        d.m();
    }
}
