package androidx.compose.ui.window;

import android.view.View;
import defpackage.n751;
import defpackage.q651;
import defpackage.u1w;
import defpackage.u651;
import java.util.List;

/* loaded from: classes10.dex */
public final class f extends androidx.core.view.e {
    public final /* synthetic */ DialogLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DialogLayout dialogLayout) {
        super(1);
        this.a = dialogLayout;
    }

    @Override // androidx.core.view.e
    public final n751 onProgress(n751 n751Var, List list) {
        DialogLayout dialogLayout = this.a;
        if (!dialogLayout.decorFitsSystemWindows) {
            View childAt = dialogLayout.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
            int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return n751Var.a.n(max, max2, max3, max4);
            }
        }
        return n751Var;
    }

    @Override // androidx.core.view.e
    public final q651 onStart(u651 u651Var, q651 q651Var) {
        DialogLayout dialogLayout = this.a;
        if (!dialogLayout.decorFitsSystemWindows) {
            View childAt = dialogLayout.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
            int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                u1w c = u1w.c(max, max2, max3, max4);
                int i = c.a;
                u1w u1wVar = q651Var.a;
                int i2 = c.b;
                int i3 = c.c;
                int i4 = c.d;
                return new q651(n751.e(u1wVar, i, i2, i3, i4), n751.e(q651Var.b, i, i2, i3, i4));
            }
        }
        return q651Var;
    }
}
