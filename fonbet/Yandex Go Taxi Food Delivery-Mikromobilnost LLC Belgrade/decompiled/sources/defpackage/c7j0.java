package defpackage;

import java.util.UUID;

/* loaded from: classes8.dex */
public final class c7j0 implements xf7 {
    public final i3y a;

    public c7j0(i3y i3yVar) {
        this.a = i3yVar;
    }

    @Override // defpackage.xf7
    public final yf7 newCall(d5j0 d5j0Var) {
        String uuid;
        t4j0 b = d5j0Var.b();
        synchronized (b7j0.class) {
            uuid = UUID.randomUUID().toString();
        }
        b.g(b7j0.class, new b7j0(uuid));
        d5j0 d5j0Var2 = new d5j0(b);
        return new k3y(d5j0Var2, new xot(this, d5j0Var2, 2));
    }
}
