package xsna;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

/* compiled from: OneDimensionalFocusSearch.kt */
/* loaded from: classes11.dex */
public final class kxr implements Comparator<dxr> {
    public static final kxr b = new kxr();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(dxr dxrVar, dxr dxrVar2) {
        dxr dxrVar3 = dxrVar;
        dxr dxrVar4 = dxrVar2;
        int i = 0;
        if (ixr.d(dxrVar3) && ixr.d(dxrVar4)) {
            LayoutNode f = itl.f(dxrVar3);
            LayoutNode f2 = itl.f(dxrVar4);
            if (!epx.f(f, f2)) {
                LayoutNode[] layoutNodeArr = new LayoutNode[16];
                int i2 = 0;
                while (f != null) {
                    int i3 = i2 + 1;
                    if (layoutNodeArr.length < i3) {
                        int length = layoutNodeArr.length;
                        ?? r5 = new Object[Math.max(i3, length * 2)];
                        System.arraycopy(layoutNodeArr, 0, r5, 0, length);
                        layoutNodeArr = r5;
                    }
                    if (i2 != 0) {
                        System.arraycopy(layoutNodeArr, 0, layoutNodeArr, 0 + 1, i2 + 0);
                    }
                    layoutNodeArr[0] = f;
                    i2++;
                    f = f.I();
                }
                LayoutNode[] layoutNodeArr2 = new LayoutNode[16];
                int i4 = 0;
                while (f2 != null) {
                    int i5 = i4 + 1;
                    if (layoutNodeArr2.length < i5) {
                        int length2 = layoutNodeArr2.length;
                        ?? r52 = new Object[Math.max(i5, length2 * 2)];
                        System.arraycopy(layoutNodeArr2, 0, r52, 0, length2);
                        layoutNodeArr2 = r52;
                    }
                    if (i4 != 0) {
                        System.arraycopy(layoutNodeArr2, 0, layoutNodeArr2, 0 + 1, i4 + 0);
                    }
                    layoutNodeArr2[0] = f2;
                    i4++;
                    f2 = f2.I();
                }
                int min = Math.min(i2 - 1, i4 - 1);
                if (min >= 0) {
                    while (epx.f(layoutNodeArr[i], layoutNodeArr2[i])) {
                        if (i != min) {
                            i++;
                        }
                    }
                    return epx.g(layoutNodeArr[i].J(), layoutNodeArr2[i].J());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (ixr.d(dxrVar3)) {
                return -1;
            }
            if (ixr.d(dxrVar4)) {
                return 1;
            }
        }
        return 0;
    }
}
