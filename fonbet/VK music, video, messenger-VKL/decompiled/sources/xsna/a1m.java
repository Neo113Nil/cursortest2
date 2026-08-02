package xsna;

import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SortedSet;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DepthSortedSet.kt */
/* loaded from: classes11.dex */
public final class a1m {
    public final os9 a = new os9(7);
    public final os9 b = new os9(7);
    public final os9 c = new os9(7);

    /* compiled from: DepthSortedSet.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Invalidation.values().length];
            try {
                iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Invalidation.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Invalidation.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void a(LayoutNode layoutNode, Invalidation invalidation) {
        int i = a.$EnumSwitchMapping$0[invalidation.ordinal()];
        os9 os9Var = this.a;
        os9 os9Var2 = this.c;
        if (i == 1) {
            os9Var.a(layoutNode);
            os9Var2.a(layoutNode);
            return;
        }
        os9 os9Var3 = this.b;
        if (i == 2) {
            os9Var3.a(layoutNode);
            os9Var2.a(layoutNode);
            return;
        }
        if (i == 3) {
            if (layoutNode.i != null) {
                os9Var2.a(layoutNode);
                return;
            } else {
                os9Var.a(layoutNode);
                return;
            }
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (layoutNode.i != null) {
            os9Var2.a(layoutNode);
        } else {
            os9Var3.a(layoutNode);
        }
    }

    public final boolean b(LayoutNode layoutNode) {
        return !(layoutNode.i == null) && (((SortedSet) this.a.c).contains(layoutNode) || ((SortedSet) this.b.c).contains(layoutNode));
    }

    public final boolean c() {
        return !(((SortedSet) this.a.c).isEmpty() && ((SortedSet) this.c.c).isEmpty() && ((SortedSet) this.b.c).isEmpty());
    }
}
