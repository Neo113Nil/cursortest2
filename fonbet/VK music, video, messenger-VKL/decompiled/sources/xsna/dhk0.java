package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;

/* compiled from: SpacesItemDecoration2.kt */
/* loaded from: classes3.dex */
public final class dhk0 extends RecyclerView.n {
    public static final a j = new a();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final HashSet<Integer> f = new HashSet<>();
    public b g = j;
    public boolean h = true;
    public boolean i = true;

    /* compiled from: SpacesItemDecoration2.kt */
    public static final class a implements b {
        @Override // xsna.dhk0.b
        public final boolean a(int i) {
            return true;
        }
    }

    /* compiled from: SpacesItemDecoration2.kt */
    public interface b {
        boolean a(int i);
    }

    public dhk0(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        boolean z = view.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
        if (this.g.a(childAdapterPosition)) {
            HashSet<Integer> hashSet = this.f;
            if (!hashSet.isEmpty()) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (j5g.P(hashSet, adapter != null ? Integer.valueOf(adapter.getItemViewType(childAdapterPosition)) : null)) {
                    return;
                }
            }
            if (childAdapterPosition != 0 || this.h) {
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                if (childAdapterPosition != (adapter2 != null ? adapter2.getItemCount() : -1) - 1 || this.i) {
                    rect.top = this.c;
                    rect.bottom = this.e;
                    int i = this.b;
                    int i2 = this.d;
                    rect.left = z ? i2 : i;
                    if (!z) {
                        i = i2;
                    }
                    rect.right = i;
                }
            }
        }
    }

    public final void l(boolean z) {
        this.h = z;
    }
}
