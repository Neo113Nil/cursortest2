package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class q {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LayoutNode.LayoutState.values().length];
        try {
            iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
