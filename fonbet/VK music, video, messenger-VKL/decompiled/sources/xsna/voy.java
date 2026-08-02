package xsna;

import androidx.compose.ui.node.LayoutNode;

/* compiled from: LayoutNode.kt */
/* loaded from: classes11.dex */
public final class voy {
    public static final dzl a = d370.k();

    public static final androidx.compose.ui.node.p a(LayoutNode layoutNode) {
        androidx.compose.ui.node.p pVar = layoutNode.o;
        if (pVar != null) {
            return pVar;
        }
        throw pm0.f("LayoutNode should be attached to an owner");
    }
}
