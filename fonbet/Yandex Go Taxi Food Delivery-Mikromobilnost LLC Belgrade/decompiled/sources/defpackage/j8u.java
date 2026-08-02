package defpackage;

import java.util.HashMap;

/* loaded from: classes8.dex */
public final class j8u implements t3d0 {
    public final HashMap a = new HashMap();

    @Override // defpackage.t3d0
    public final void a(exf0 exf0Var) {
        this.a.put(exf0.class, exf0Var);
    }

    @Override // defpackage.t3d0
    public final exf0 getPlugin() {
        Object obj = this.a.get(exf0.class);
        if (obj instanceof exf0) {
            return (exf0) obj;
        }
        return null;
    }
}
