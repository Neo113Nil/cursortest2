package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.io.File;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class o2f implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ o2f(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 1:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 2:
                return jl40.q(((zvw) obj).b, ((zvw) obj2).b);
            case 3:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                z0y z0yVar = LayoutNode.m0;
                float f = layoutNode.b0.p.a0;
                float f2 = layoutNode2.b0.p.a0;
                return f == f2 ? jl40.q(layoutNode.t(), layoutNode2.t()) : Float.compare(f, f2);
            case 4:
                lc7 lc7Var = (lc7) obj;
                lc7 lc7Var2 = (lc7) obj2;
                long j = lc7Var.y;
                long j2 = lc7Var2.y;
                return j - j2 == 0 ? lc7Var.compareTo(lc7Var2) : j < j2 ? -1 : 1;
            case 5:
                m041 m041Var = (m041) obj;
                m041 m041Var2 = (m041) obj2;
                int q = jl40.q(m041Var2.a, m041Var.a);
                return q == 0 ? jl40.r(m041Var.b, m041Var2.b) : q;
            case 6:
                return Long.compare(((qbp0) obj).a, ((qbp0) obj2).a);
            default:
                return ((vku) obj).a.compareTo(((vku) obj2).a);
        }
    }
}
