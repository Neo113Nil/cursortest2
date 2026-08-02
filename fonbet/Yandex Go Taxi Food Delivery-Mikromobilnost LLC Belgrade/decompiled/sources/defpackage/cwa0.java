package defpackage;

import android.os.SystemClock;
import java.util.UUID;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;

/* loaded from: classes9.dex */
public final class cwa0 {
    public final PerformanceScreenName a;
    public final String b;
    public final dwa0 c;
    public final String d;
    public final long e;
    public final yy20 f;

    public cwa0(PerformanceScreenName performanceScreenName, String str, dwa0 dwa0Var, yy20 yy20Var, int i) {
        String uuid = UUID.randomUUID().toString();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        yy20Var = (i & 32) != 0 ? xpb1.K : yy20Var;
        this.a = performanceScreenName;
        this.b = str;
        this.c = dwa0Var;
        this.d = uuid;
        this.e = elapsedRealtime;
        this.f = yy20Var;
    }
}
