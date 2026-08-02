package xsna;

import com.vk.core.preference.Preference;
import java.util.Map;

/* compiled from: MusicAlbumConditionChecker.kt */
/* loaded from: classes2.dex */
public final class n940 implements zqp0 {
    @Override // xsna.zqp0
    public final boolean a(Map<String, ? extends Object> map) {
        long m = Preference.m(0L, "in_app_review_prefs", "albums_count_key") + 1;
        if (m >= 3) {
            Preference.C("in_app_review_prefs", "albums_count_key");
            return true;
        }
        Preference.F(m, "in_app_review_prefs", "albums_count_key");
        return false;
    }
}
