package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Stack;
import xsna.rel0;

/* compiled from: StickyContainerDelegate.kt */
/* loaded from: classes16.dex */
public final class sel0 extends RecyclerView.t {
    public final /* synthetic */ rel0 b;

    public sel0(rel0 rel0Var) {
        this.b = rel0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        rel0 rel0Var = this.b;
        Stack<rel0.a> stack = rel0Var.e;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0));
        while (!stack.isEmpty() && childAdapterPosition < stack.peek().c) {
            stack.pop();
            rel0Var.c();
        }
        int i3 = rel0Var.d;
        if (i3 <= childAdapterPosition) {
            j9x it = new k9x(i3, childAdapterPosition, 1).iterator();
            while (it.d) {
                int nextInt = it.nextInt();
                if (rel0Var.a.c(nextInt)) {
                    rel0Var.a(nextInt);
                }
            }
        }
        rel0Var.d = childAdapterPosition;
    }
}
