package defpackage;

import defpackage.f0z;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class g0z implements xi70 {
    public final ro0 a;
    public final qqo b;

    public g0z(ro0 ro0Var, rqo rqoVar) {
        this.a = ro0Var;
        f0z.Companion.getClass();
        this.b = ((jbh) rqoVar).c(f0z.f);
    }

    @Override // defpackage.xi70
    public final Object a(vi70 vi70Var, Continuation continuation) {
        Object obj;
        ro0 ro0Var = this.a;
        if (ro0Var.a() && ro0Var.c.b().d.b.c) {
            return null;
        }
        boolean z = vi70Var.c;
        mi31 mi31Var = vi70Var.a;
        if (z) {
            f0z f0zVar = (f0z) this.b.b();
            if (f0zVar.b()) {
                String str = mi31Var.a.b0;
                if (str == null) {
                    str = mi31Var.f;
                }
                Iterator it = f0zVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((f0z.a) obj).a, str)) {
                        break;
                    }
                }
                f0z.a aVar = (f0z.a) obj;
                if (aVar != null) {
                    return hay.m(d6z.Y(f0zVar, aVar.b), d6z.Y(f0zVar, aVar.c), null, mi31Var.a.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 4);
                }
            }
        }
        return null;
    }

    @Override // defpackage.xi70
    public final String b() {
        return "LoadingOrderButtonInteractor";
    }
}
