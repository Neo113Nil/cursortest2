package yads;

import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes10.dex */
public final class ru1 extends ho {
    public final dn2 a;
    public final h92 b;
    public final b21 c;
    public final f21 d;

    public ru1(SSLSocketFactory sSLSocketFactory, dn2 dn2Var, h92 h92Var, b21 b21Var, g21 g21Var) {
        this.a = dn2Var;
        this.b = h92Var;
        this.c = b21Var;
        g21Var.getClass();
        this.d = g21.a(sSLSocketFactory);
    }

    @Override // yads.ho
    public final a21 a(qp2 qp2Var, Map map) {
        boolean z;
        synchronized (fv1.a) {
            z = fv1.b;
        }
        return z ? (a21) new qu1(this, map).invoke(qp2Var) : b(qp2Var, map);
    }

    public final a21 b(qp2 qp2Var, Map map) {
        g92 a = this.b.a(qp2Var);
        if (a == null) {
            return this.d.a(qp2Var, map);
        }
        this.a.getClass();
        ArrayList arrayList = new ArrayList();
        Map map2 = a.c;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new r01((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return new a21(a.a, arrayList, a.b);
    }
}
