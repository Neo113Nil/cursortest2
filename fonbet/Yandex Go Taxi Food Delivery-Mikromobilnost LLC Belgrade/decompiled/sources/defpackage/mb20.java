package defpackage;

import java.util.Map;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class mb20 implements lb20 {
    public final wnt a;
    public final lx4 b;

    public mb20(lx4 lx4Var, wnt wntVar) {
        this.a = wntVar;
        this.b = lx4Var;
    }

    public final void a(String str, String str2, Throwable th) {
        jst.e.h(str, str2, th);
    }

    public final void b(String str, Map map) {
        lx4 lx4Var = this.b;
        if (map == null) {
            ((j) lx4Var).n(str);
            return;
        }
        j jVar = (j) lx4Var;
        jVar.q(str, ((xnt) this.a).e(map, cm2.a));
    }
}
