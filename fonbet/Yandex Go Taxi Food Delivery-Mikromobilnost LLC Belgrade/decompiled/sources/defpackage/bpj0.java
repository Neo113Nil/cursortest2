package defpackage;

import com.yandex.go.zone.model.Zone;
import defpackage.oqj0;

/* loaded from: classes6.dex */
public final class bpj0 {
    public final dqe0 a;
    public final k7x0 b;
    public final b8r c;
    public final viv0 d;

    public bpj0(dqe0 dqe0Var, k7x0 k7x0Var, b8r b8rVar, viv0 viv0Var) {
        this.a = dqe0Var;
        this.b = k7x0Var;
        this.c = b8rVar;
        this.d = viv0Var;
    }

    public final String a(lmw0 lmw0Var) {
        if (this.d.i()) {
            return lmw0Var.l().a;
        }
        String name = lmw0Var.getName();
        dqe0 dqe0Var = this.a;
        Zone c = dqe0Var.c();
        oqj0.b a = (c != null ? (oqj0) c.d(oqj0.e) : oqj0.e).a(name);
        if (a != null && a.a) {
            Zone c2 = dqe0Var.c();
            rhj0 a2 = shj0.a(lmw0Var, c2 != null ? (oqj0) c2.d(oqj0.e) : oqj0.e);
            String str = a2 != null ? a2.a : null;
            if (str != null && str.length() != 0) {
                return str;
            }
        }
        return null;
    }
}
