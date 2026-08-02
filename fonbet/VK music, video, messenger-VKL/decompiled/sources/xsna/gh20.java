package xsna;

import com.vk.core.preference.Preference;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: MessengerGiftsConditionChecker.kt */
/* loaded from: classes2.dex */
public final class gh20 implements zqp0 {
    @Override // xsna.zqp0
    public final boolean a(Map<String, ? extends Object> map) {
        Set R0 = j5g.R0(Preference.u(EmptySet.b, "in_app_review_prefs", "messenger_gifts_keys"));
        Object obj = map.get("gift_id_key");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && !drm0.N(str)) {
            R0.add(str);
            Preference.K(R0, "in_app_review_prefs", "messenger_gifts_keys");
            r3 = R0.size() >= 3;
            if (r3) {
                Preference.C("in_app_review_prefs", "messenger_gifts_keys");
            }
        }
        return r3;
    }
}
