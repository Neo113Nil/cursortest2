package xsna;

import com.vk.core.preference.Preference;
import java.util.Map;

/* compiled from: CountConditionChecker.kt */
/* loaded from: classes2.dex */
public final class vwj implements zqp0 {
    public final int a;
    public final String b;

    public vwj(String str, int i) {
        this.a = i;
        this.b = str.concat("_count_key");
    }

    @Override // xsna.zqp0
    public final boolean a(Map<String, ? extends Object> map) {
        String str = this.b;
        long m = Preference.m(1L, "in_app_review_prefs", str);
        boolean z = m >= ((long) this.a);
        if (z) {
            Preference.C("in_app_review_prefs", str);
            return z;
        }
        Preference.F(m + 1, "in_app_review_prefs", str);
        return z;
    }
}
