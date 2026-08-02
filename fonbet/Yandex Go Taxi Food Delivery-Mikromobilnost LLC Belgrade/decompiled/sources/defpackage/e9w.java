package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.intercity.IntercityPreorderInfo;
import defpackage.ylw;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class e9w implements d9w {
    public final dqe0 a;
    public final qqo b;
    public final r0 c;
    public final r0 d;

    public e9w(rqo rqoVar, dqe0 dqe0Var) {
        this.a = dqe0Var;
        this.b = ((jbh) rqoVar).c(new ylw(0));
        r0 c = bvf0.c(null);
        this.c = c;
        this.d = c;
    }

    public final ylw.c a(ylw ylwVar, String str) {
        Object obj;
        if (!ylwVar.b) {
            return null;
        }
        Iterator it = ((ylw) this.b.b()).d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((ylw.a) obj).a, str)) {
                break;
            }
        }
        ylw.a aVar = (ylw.a) obj;
        if (aVar == null) {
            return null;
        }
        return aVar.b.a;
    }

    public final bgq0 b() {
        return (bgq0) this.c.getValue();
    }

    public final void c(bgq0 bgq0Var) {
        this.a.a.J = new IntercityPreorderInfo(bgq0Var);
        this.c.l(bgq0Var);
    }
}
