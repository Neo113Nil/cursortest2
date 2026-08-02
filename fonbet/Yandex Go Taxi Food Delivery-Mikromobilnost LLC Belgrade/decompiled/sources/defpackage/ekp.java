package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes10.dex */
public final class ekp extends gkp {
    @Override // defpackage.gkp
    public final gkp a(krl0 krl0Var) {
        ListBuilder a = rcc.a();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a.add(((jdf) list.get(i)).e(krl0Var));
        }
        return new ekp(a.j());
    }

    public final String toString() {
        return "Edge";
    }
}
