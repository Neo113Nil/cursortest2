package defpackage;

import com.yandex.feedsdk.di.a;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class f3r0 implements dw, dez {
    public final a b;
    public final gqq c;
    public final s231 a = new s231();
    public final zjr w = new zjr(new hwn(), EmptyList.a);

    public f3r0(a aVar, gqq gqqVar) {
        this.b = aVar;
        this.c = gqqVar;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.w;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        d3r0 d3r0Var = (d3r0) krVar;
        s231 s231Var = this.a;
        s8o.S(this, s231Var);
        e3r0 e3r0Var = new e3r0(vng.C(gwk0.D(d3r0Var.a), new o5o(2, s231Var)), d3r0Var.b, 0);
        Iterator it = ((Iterable) this.b.invoke()).iterator();
        while (it.hasNext()) {
            e3r0Var.invoke((com.yandex.div.core.expression.variables.a) it.next());
        }
        gqq gqqVar = this.c;
        if (gqqVar != null) {
            gqqVar.e.add(e3r0Var);
        }
    }
}
