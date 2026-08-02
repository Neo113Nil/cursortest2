package defpackage;

import android.os.SystemClock;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes8.dex */
public final class gqt0 {
    public final lx4 a;
    public final dei0 b;
    public final e400 c;

    public gqt0(lx4 lx4Var, dei0 dei0Var, e400 e400Var) {
        this.a = lx4Var;
        this.b = dei0Var;
        this.c = e400Var;
    }

    public final void a(long j, String str) {
        i d = ((j) this.a).d("Main.Splash.LoadingError");
        d.j((r2 & 1) == 0);
        d.d("id", str);
        d.c(SystemClock.elapsedRealtime() - j, "duration");
        d.m();
    }
}
