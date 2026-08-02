package xsna;

import com.vk.core.preference.Preference;
import java.util.Map;

/* compiled from: GarlandConditionChecker.kt */
/* loaded from: classes2.dex */
public final class bht implements zqp0 {
    @Override // xsna.zqp0
    public final boolean a(Map<String, ? extends Object> map) {
        long m = Preference.m(0L, "in_app_review_prefs", "garland_key");
        Object obj = map.get("garland_trigger_reset");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null ? bool.booleanValue() : false) {
            Preference.C("in_app_review_prefs", "garland_key");
            return false;
        }
        long j = m + 1;
        if (j >= 3) {
            Preference.C("in_app_review_prefs", "garland_key");
            return true;
        }
        Preference.F(j, "in_app_review_prefs", "garland_key");
        return false;
    }
}
