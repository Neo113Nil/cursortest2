package androidx.compose.ui.node;

import defpackage.ba10;
import defpackage.ny61;
import defpackage.uz40;
import defpackage.w511;
import defpackage.yuw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class r {
    public static final ArrayList a(yuw yuwVar) {
        LayoutNode Q = ((ba10) yuwVar).Q();
        boolean b = b(Q);
        List l = Q.l();
        uz40 uz40Var = (uz40) l;
        ArrayList arrayList = new ArrayList(uz40Var.a.c);
        int size = l.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = (LayoutNode) uz40Var.get(i);
            arrayList.add(b ? layoutNode.i() : layoutNode.j());
        }
        return arrayList;
    }

    public static final boolean b(LayoutNode layoutNode) {
        int i = q.a[layoutNode.b0.d.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                LayoutNode s = layoutNode.s();
                if (s != null) {
                    return b(s);
                }
                ny61.g("no parent for idle node");
                return false;
            }
            w511.b();
        }
        return false;
    }
}
