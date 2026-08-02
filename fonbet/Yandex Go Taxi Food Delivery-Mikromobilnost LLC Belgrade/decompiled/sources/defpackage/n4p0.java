package defpackage;

import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$CardButton;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class n4p0 {
    public final lx4 a;
    public final u8w b;
    public final ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason c;

    public n4p0(lx4 lx4Var, u8w u8wVar, ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason scootersTariffFixSelectionAnalytics$FixSelectionOpenReason) {
        this.a = lx4Var;
        this.b = u8wVar;
        this.c = scootersTariffFixSelectionAnalytics$FixSelectionOpenReason;
    }

    public final void a(ScootersTariffFixSelectionAnalytics$CardButton scootersTariffFixSelectionAnalytics$CardButton) {
        String buttonName = scootersTariffFixSelectionAnalytics$CardButton.getButtonName();
        u8w u8wVar = this.b;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", buttonName);
        u8wVar.a.a("ScootersParkingSelectionCard.Tapped", hashMap, 1, new HashMap());
    }
}
