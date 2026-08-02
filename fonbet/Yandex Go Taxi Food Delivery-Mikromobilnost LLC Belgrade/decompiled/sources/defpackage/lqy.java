package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lqy implements b70 {
    public final b70 a;

    public lqy(b70 b70Var) {
        this.a = b70Var;
    }

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.l();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            this.a.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        ArrayList z = oyr.z(xdxVar);
        while (xdxVar.hasNext()) {
            z.add(this.a.b(xdxVar, cVar));
        }
        xdxVar.j();
        return z;
    }

    public final void c(bfx bfxVar, c cVar, List list) {
        bfxVar.l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
    }
}
