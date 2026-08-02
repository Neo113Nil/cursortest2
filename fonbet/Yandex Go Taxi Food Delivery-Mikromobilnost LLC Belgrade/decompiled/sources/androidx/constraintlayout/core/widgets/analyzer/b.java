package androidx.constraintlayout.core.widgets.analyzer;

import defpackage.xwi;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class b extends a {
    public int m;

    public b(h hVar) {
        super(hVar);
        if (hVar instanceof e) {
            this.e = DependencyNode$Type.HORIZONTAL_DIMENSION;
        } else {
            this.e = DependencyNode$Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.a
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            xwi xwiVar = (xwi) it.next();
            xwiVar.a(xwiVar);
        }
    }
}
