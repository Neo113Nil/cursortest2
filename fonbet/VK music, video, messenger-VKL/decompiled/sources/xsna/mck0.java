package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnippetScrollListener.kt */
/* loaded from: classes3.dex */
public final class mck0 extends RecyclerView.t {
    public final androidx.recyclerview.widget.o0 b;
    public final a c;
    public int d = -1;
    public int e = -1;
    public boolean f;

    /* compiled from: SnippetScrollListener.kt */
    public interface a {
        void a(int i, boolean z);

        void b(int i);
    }

    public mck0(androidx.recyclerview.widget.g0 g0Var, a aVar) {
        this.b = g0Var;
        this.c = aVar;
    }

    public final void l(RecyclerView recyclerView, boolean z) {
        View findSnapView;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        int i = -1;
        if (layoutManager != null && (findSnapView = this.b.findSnapView(layoutManager)) != null) {
            i = layoutManager.getPosition(findSnapView);
        }
        if (z) {
            if (this.e == i) {
                return;
            }
        } else if (this.d == i) {
            return;
        }
        a aVar = this.c;
        if (!z) {
            this.d = i;
            aVar.b(i);
        } else {
            this.e = i;
            aVar.a(i, this.f);
            this.f = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            l(recyclerView, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        l(recyclerView, false);
    }
}
