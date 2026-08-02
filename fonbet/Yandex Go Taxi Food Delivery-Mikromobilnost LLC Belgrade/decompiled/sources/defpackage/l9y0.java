package defpackage;

import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes9.dex */
public final class l9y0 {
    public final lx4 a;
    public final ma1 b;
    public volatile String c;

    public l9y0(lx4 lx4Var, ma1 ma1Var) {
        this.a = lx4Var;
        this.b = ma1Var;
    }

    public static String b(boolean z) {
        return z ? "user" : "system";
    }

    public final i a(String str, String str2) {
        i d = ((j) this.a).d(str);
        d.a.put("open_reason", str2);
        return d;
    }
}
