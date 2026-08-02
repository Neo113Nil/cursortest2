package core.divkit.state;

import defpackage.c231;
import defpackage.d6x;
import defpackage.eja1;
import defpackage.j5x;
import defpackage.jx81;
import defpackage.k6x;
import defpackage.oyr;
import defpackage.r5x;
import defpackage.t6x;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class DivkitStateDaemon$context$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        c231 c231Var = (c231) obj;
        a aVar = (a) this.receiver;
        List list = (List) ((LinkedHashMap) aVar.c.c).get(c231Var.c());
        if (list == null) {
            w511.f(oyr.p("Missing path for variable '", c231Var.c(), "' in daemon's state"));
            return null;
        }
        Object d = c231Var.d();
        r5x q = eja1.q(list);
        j5x M = jx81.M(d);
        k6x k6xVar = aVar.a;
        if (k6xVar.a()) {
            d6x c = jason.statham.tools.a.c(k6xVar.b(), q, M, t6x.a);
            if (!c.equals(k6xVar.b())) {
                k6xVar.e(c);
            }
        }
        return zy11.a;
    }
}
