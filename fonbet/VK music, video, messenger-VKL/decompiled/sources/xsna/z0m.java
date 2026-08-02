package xsna;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

/* compiled from: DepthSortedSet.kt */
/* loaded from: classes11.dex */
public final class z0m {
    public static final a a = new a();

    /* compiled from: DepthSortedSet.kt */
    public static final class a implements Comparator<LayoutNode> {
        @Override // java.util.Comparator
        public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            LayoutNode layoutNode3 = layoutNode;
            LayoutNode layoutNode4 = layoutNode2;
            int g = epx.g(layoutNode3.q, layoutNode4.q);
            return g != 0 ? g : epx.g(layoutNode3.hashCode(), layoutNode4.hashCode());
        }
    }
}
