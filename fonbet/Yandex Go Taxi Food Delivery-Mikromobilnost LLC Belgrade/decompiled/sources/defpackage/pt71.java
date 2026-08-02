package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import yads.o30;

/* loaded from: classes7.dex */
public final class pt71 implements oy71 {
    public final e971 a;
    public final bp5 b;
    public final qu71 c;
    public final Iterator d;
    public final z081 e;

    public pt71(e971 e971Var, bp5 bp5Var, qu71 qu71Var, Iterator it, z081 z081Var) {
        this.a = e971Var;
        this.b = bp5Var;
        this.c = qu71Var;
        this.d = it;
        this.e = z081Var;
    }

    @Override // defpackage.oy71
    public final void a() {
        Iterator it = this.d;
        if (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Iterator it2 = this.d;
            z081 z081Var = this.e;
            e971 e971Var = this.a;
            bp5 bp5Var = this.b;
            qu71 qu71Var = this.c;
            qu71Var.b(str, new pt71(e971Var, bp5Var, qu71Var, it2, z081Var), str2);
        }
    }

    @Override // defpackage.oy71
    public final void b() {
        this.e.a(o30.f);
    }

    @Override // defpackage.oy71
    public final void c() {
        a();
    }
}
