package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes.dex */
public abstract class d1y {
    public static final iwi a = vng.a();

    public static final m390 a(LayoutNode layoutNode) {
        m390 m390Var = layoutNode.G;
        if (m390Var != null) {
            return m390Var;
        }
        throw x4e.v("LayoutNode should be attached to an owner");
    }
}
