package defpackage;

import com.yandex.go.scooters.api.analytics.AnalyticsCameraState;
import com.yandex.go.scooters.api.analytics.CameraTappedButton;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes6.dex */
public final class ban0 {
    public final x770 a;

    public ban0(x770 x770Var) {
        this.a = x770Var;
    }

    public final void a(CameraTappedButton cameraTappedButton, AnalyticsCameraState analyticsCameraState, r7p0 r7p0Var, String str) {
        String buttonName = cameraTappedButton.getButtonName();
        String str2 = r7p0Var.a;
        String state = analyticsCameraState.getState();
        x770 x770Var = this.a;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        if (buttonName != null) {
            hashMap.put("button_name", buttonName);
        }
        if (str != null) {
            hashMap.put("order_id", str);
        }
        if (str2 != null) {
            hashMap.put("scooter_number", str2);
        }
        if (state != null) {
            hashMap.put(ClidProvider.STATE, state);
        }
        x770Var.a.a("ScootersPhotoOfCompletionCard.Tapped", hashMap, 1, new HashMap());
    }
}
