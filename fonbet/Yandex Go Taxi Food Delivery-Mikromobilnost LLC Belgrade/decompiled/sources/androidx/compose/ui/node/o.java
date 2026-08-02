package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LayoutNode.LayoutState.values().length];
        try {
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
        try {
            iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
