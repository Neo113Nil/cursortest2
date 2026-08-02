package xsna;

import com.vk.core.preference.Preference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: TimeCountConditionChecker.kt */
/* loaded from: classes2.dex */
public final class oto0 implements zqp0 {
    public final int a;
    public final long b;
    public final String c;
    public final String d;

    public oto0(String str, int i) {
        long millis = TimeUnit.DAYS.toMillis(7L);
        this.a = i;
        this.b = millis;
        this.c = str.concat("count_key");
        this.d = str.concat("times_key");
    }

    @Override // xsna.zqp0
    public final boolean a(Map<String, ? extends Object> map) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = this.c;
        long m = Preference.m(0L, "in_app_review_prefs", str);
        int i = this.a;
        Long[] lArr = new Long[i];
        for (int i2 = 0; i2 < i; i2++) {
            lArr[i2] = 0L;
        }
        Preference preference = Preference.a;
        Preference.Type type = Preference.Type.NumberArray;
        preference.getClass();
        String str2 = this.d;
        Long[] lArr2 = (Long[]) Preference.z("in_app_review_prefs", str2, type, lArr).get();
        if (lArr2 != null) {
            lArr = lArr2;
        }
        ArrayList w0 = rl3.w0(lArr);
        Preference.F(m + 1, "in_app_review_prefs", str);
        w0.add(0, Long.valueOf(currentTimeMillis));
        w0.remove(e43.h(w0));
        Long l = (Long) j5g.k0(w0);
        long longValue = l != null ? l.longValue() : 0L;
        Preference.J("in_app_review_prefs", str2, (Long[]) w0.toArray(new Long[0]));
        boolean z = currentTimeMillis - longValue < this.b;
        if (z) {
            Preference.C("in_app_review_prefs", str2);
            Preference.C("in_app_review_prefs", str);
        }
        return z;
    }
}
