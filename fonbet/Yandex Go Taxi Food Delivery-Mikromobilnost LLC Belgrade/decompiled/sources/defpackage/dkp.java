package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes10.dex */
public final class dkp extends gkp {
    public final long b;
    public final long c;
    public final boolean d;

    public dkp(List list, long j, long j2, boolean z) {
        super(list);
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.gkp
    public final gkp a(krl0 krl0Var) {
        ListBuilder a = rcc.a();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a.add(((jdf) list.get(i)).e(krl0Var));
        }
        return new dkp(a.j(), pw91.t(this.b, krl0Var), pw91.t(this.c, krl0Var), this.d);
    }

    public final String toString() {
        return "Corner: vertex=" + ((Object) ior.b(this.b)) + ", center=" + ((Object) ior.b(this.c)) + ", convex=" + this.d;
    }
}
