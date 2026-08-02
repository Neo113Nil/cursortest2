package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class h450 {
    public final HashMap a = new HashMap();

    public final void a(jrb1 jrb1Var) {
        tls tlsVar = (tls) this.a.get(qoi0.a(jrb1Var.getClass()).d());
        if (tlsVar != null) {
            tlsVar.invoke(jrb1Var);
        }
    }
}
