package xsna;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class poy implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        LayoutNode layoutNode = (LayoutNode) obj;
        LayoutNode layoutNode2 = (LayoutNode) obj2;
        float f = layoutNode.H.p.G;
        float f2 = layoutNode2.H.p.G;
        return f == f2 ? epx.g(layoutNode.J(), layoutNode2.J()) : Float.compare(f, f2);
    }
}
