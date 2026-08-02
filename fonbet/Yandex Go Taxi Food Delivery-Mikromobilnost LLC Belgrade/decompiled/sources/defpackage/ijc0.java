package defpackage;

import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.cashback.sdk.c0;
import ru.yandex.taxi.plus.sdk.badge.widget.a;

/* loaded from: classes6.dex */
public final class ijc0 implements hjc0 {
    public final a a;
    public final wwx0 b;
    public final n5c c;
    public final gk4 d;
    public final c0 e;
    public final ljz0 f;

    public ijc0(a aVar, wwx0 wwx0Var, n5c n5cVar, gk4 gk4Var, c0 c0Var, ljz0 ljz0Var) {
        this.a = aVar;
        this.b = wwx0Var;
        this.c = n5cVar;
        this.d = gk4Var;
        this.e = c0Var;
        this.f = ljz0Var;
    }

    public final void a(qoc0 qoc0Var, boolean z, Object obj) {
        hoc0 hoc0Var;
        Long l;
        soc0 soc0Var = obj instanceof soc0 ? (soc0) obj : null;
        if (soc0Var == null) {
            soc0Var = soc0.d;
        }
        Map map = soc0Var.a;
        if (!z) {
            ioc0 ioc0Var = qoc0Var instanceof ioc0 ? (ioc0) qoc0Var : null;
            this.b.a(qoc0Var.d(), map, new b6d0((ioc0Var == null || (hoc0Var = ioc0Var.f) == null || (l = hoc0Var.a) == null) ? 0L : l.longValue()));
            n5c n5cVar = this.c;
            String d = qoc0Var.d();
            String a = this.e.a.a();
            r0 r0Var = n5cVar.a;
            r0Var.m(null, v4r0.i((Set) r0Var.getValue(), new m5c(d, a)));
            return;
        }
        this.b.a(qoc0Var.d(), map, c6d0.b);
        gk4 gk4Var = this.d;
        vhu vhuVar = gk4Var.a.a.b;
        if (vhuVar == null || !vhuVar.b()) {
            return;
        }
        r0 r0Var2 = gk4Var.b.a;
        Boolean bool = Boolean.TRUE;
        r0Var2.getClass();
        r0Var2.m(null, bool);
    }
}
