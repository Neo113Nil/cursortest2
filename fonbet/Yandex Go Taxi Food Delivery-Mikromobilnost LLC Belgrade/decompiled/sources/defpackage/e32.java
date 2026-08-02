package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import ru.yandex.taxi.analytics.AnalyticsContext$ElementState;

/* loaded from: classes13.dex */
public final class e32 {
    public final String a;
    public final AnalyticsContext$ElementState b;
    public final LinkedHashSet c;

    public e32(String str, AnalyticsContext$ElementState analyticsContext$ElementState, Set set) {
        this.a = str;
        this.b = analyticsContext$ElementState;
        this.c = new LinkedHashSet(set);
    }

    public final LinkedHashSet a() {
        return this.c;
    }

    public final AnalyticsContext$ElementState b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final void d(String str) {
        this.c.add(str);
    }

    public final void e(String str) {
        this.c.remove(str);
    }
}
