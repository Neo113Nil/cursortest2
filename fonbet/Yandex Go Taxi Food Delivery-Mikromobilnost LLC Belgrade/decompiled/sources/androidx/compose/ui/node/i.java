package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LayoutNode.LayoutState.values().length];
        try {
            iArr[LayoutNode.LayoutState.Idle.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
