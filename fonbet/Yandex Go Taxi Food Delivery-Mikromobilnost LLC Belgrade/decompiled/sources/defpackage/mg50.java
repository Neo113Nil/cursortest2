package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import ru.yandex.taxi.TimeUnitsVisibility;

/* loaded from: classes8.dex */
public final class mg50 {
    public final Context a;
    public final zuj0 b;

    public mg50(zuj0 zuj0Var, Context context) {
        this.a = context;
        this.b = zuj0Var;
    }

    public final String a(long j) {
        return ppb1.g(this.b, TimeUnit.SECONDS.toMillis(j), TimeUnitsVisibility.TWO_TIME_UNITS);
    }
}
