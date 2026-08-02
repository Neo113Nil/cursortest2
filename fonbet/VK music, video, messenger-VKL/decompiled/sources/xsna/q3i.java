package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CommunitySuggestionsView.kt */
/* loaded from: classes5.dex */
public final class q3i extends RecyclerView.n {
    public final /* synthetic */ int b;

    public q3i(int i) {
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.b;
        boolean z = childAdapterPosition % i == 0;
        boolean z2 = childAdapterPosition % i == i - 1;
        if (z) {
            rect.right = an10.b(cn70.a() * 3.75f);
            rect.left = cn70.b(16);
        } else if (z2) {
            rect.right = cn70.b(16);
            rect.left = an10.b(cn70.a() * 3.75f);
        } else {
            rect.right = an10.b(cn70.a() * 3.75f);
            rect.left = an10.b(cn70.a() * 3.75f);
        }
        rect.top = cn70.b(5);
        rect.bottom = cn70.b(8);
    }
}
