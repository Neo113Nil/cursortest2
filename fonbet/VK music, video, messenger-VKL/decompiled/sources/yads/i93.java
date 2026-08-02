package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import xsna.c5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class i93 implements da2 {
    public final f61 a;
    public final h61 b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;

    public i93(f61 f61Var, h61 h61Var) {
        this.a = f61Var;
        this.b = h61Var;
    }

    public final Map a(vc3 vc3Var) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("failure_tracked", Boolean.valueOf(this.e));
        if (!vc3Var.a.isEmpty()) {
            List list = vc3Var.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((wc3) it.next()).b);
            }
            mapBuilder.put("warnings", arrayList);
        }
        return mapBuilder.h();
    }

    @Override // yads.da2
    public final void invalidate() {
        this.c = false;
        this.d = 0;
        this.e = false;
        this.f = false;
    }

    @Override // yads.da2
    public final void a(uz2 uz2Var, uc3 uc3Var) {
        int i = this.d + 1;
        this.d = i;
        if (i == 20) {
            this.e = true;
            f61 f61Var = this.a;
            f61Var.a(this.b.c, f61Var.a(uc3Var));
        }
    }

    @Override // yads.da2
    public final void a(List list) {
        ia2 ia2Var = (ia2) j5g.a0(list);
        if (ia2Var == null) {
            return;
        }
        f61 f61Var = this.a;
        f61Var.a(this.b.d, f61Var.a(ia2Var.b));
    }

    @Override // yads.da2
    public final void a(uz2 uz2Var, List list, vc3 vc3Var) {
        if (this.f) {
            return;
        }
        this.f = true;
        Map a = a(vc3Var);
        f61 f61Var = this.a;
        dp2 dp2Var = this.b.a;
        gp2 a2 = f61Var.a();
        a2.a.putAll(a);
        f61Var.a(dp2Var, a2);
    }

    @Override // yads.da2
    public final void a(uz2 uz2Var, vc3 vc3Var) {
        if (this.c) {
            return;
        }
        this.c = true;
        Map a = a(vc3Var);
        f61 f61Var = this.a;
        dp2 dp2Var = this.b.b;
        gp2 a2 = f61Var.a();
        a2.a.putAll(a);
        f61Var.a(dp2Var, a2);
    }

    @Override // yads.da2
    public final void a(v9 v9Var) {
        this.a.a = v9Var;
    }
}
