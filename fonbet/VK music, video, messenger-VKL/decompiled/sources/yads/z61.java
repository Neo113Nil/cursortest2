package yads;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.random.Random;
import xsna.c5g;
import xsna.fo8;
import xsna.g5g;
import xsna.j5g;
import xsna.j8y;
import xsna.j9x;
import xsna.k9x;
import xsna.vlb;

/* loaded from: classes10.dex */
public final class z61 {
    public final j8y a;
    public final jn b;

    public z61(j8y j8yVar, jn jnVar) {
        this.a = j8yVar;
        this.b = jnVar;
    }

    public final String a(m80 m80Var) {
        ArrayList arrayList;
        j8y j8yVar = this.a;
        j8y.d.getClass();
        String b = j8yVar.b(m80.Companion.serializer(), m80Var);
        this.b.getClass();
        String a = jn.a(b);
        if (a == null) {
            a = "";
        }
        Iterable vlbVar = new vlb('A', 'Z');
        vlb vlbVar2 = new vlb('a', 'z');
        if (vlbVar instanceof Collection) {
            arrayList = j5g.u0(vlbVar2, (Collection) vlbVar);
        } else {
            ArrayList arrayList2 = new ArrayList();
            g5g.y(vlbVar, arrayList2);
            g5g.y(vlbVar2, arrayList2);
            arrayList = arrayList2;
        }
        k9x k9xVar = new k9x(1, 3, 1);
        ArrayList arrayList3 = new ArrayList(c5g.u(k9xVar, 10));
        j9x it = k9xVar.iterator();
        while (it.d) {
            it.nextInt();
            Character ch = (Character) j5g.w0(arrayList, Random.b);
            ch.getClass();
            arrayList3.add(ch);
        }
        return fo8.a(j5g.g0(arrayList3, "", null, null, 0, null, 62), a);
    }
}
