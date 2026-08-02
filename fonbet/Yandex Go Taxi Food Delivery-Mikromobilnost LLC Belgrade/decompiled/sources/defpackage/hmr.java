package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class hmr implements gmr {
    public final cne0 a;

    public hmr(dne0 dne0Var) {
        this.a = dne0Var.a("flex_testing_hosts_preferences");
    }

    @Override // defpackage.gmr
    public final boolean a(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.r((String) it.next(), str);
        }
        return true;
    }

    @Override // defpackage.gmr
    public final boolean clear() {
        this.a.a();
        return true;
    }
}
