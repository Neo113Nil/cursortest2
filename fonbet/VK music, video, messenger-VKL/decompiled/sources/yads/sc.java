package yads;

import android.view.View;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class sc implements o0 {
    public final id a;
    public final za b;
    public final lv c;

    public sc(id idVar, za zaVar, lv lvVar) {
        this.a = idVar;
        this.b = zaVar;
        this.c = lvVar;
    }

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        rc rcVar = (rc) m0Var;
        Iterator it = rcVar.d.iterator();
        while (it.hasNext()) {
            za.a(this.b, (String) it.next(), o93.b);
        }
        this.a.a(view, rcVar);
        lv lvVar = this.c;
        dp2 dp2Var = dp2.j;
        lvVar.getClass();
        lvVar.d.a(lvVar.a(dp2Var, new HashMap()));
        return new p01(false, null);
    }
}
