package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: EpisodeAdapter.kt */
/* loaded from: classes2.dex */
public final class lsp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ isp d;

    public lsp(RecyclerView recyclerView, int i, isp ispVar) {
        this.b = recyclerView;
        this.c = i;
        this.d = ispVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        final RecyclerView recyclerView = this.b;
        final int i = this.c;
        final isp ispVar = this.d;
        recyclerView.post(new Runnable() { // from class: xsna.ksp
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView2 = RecyclerView.this;
                View childAt = recyclerView2.getChildAt(0);
                int height = childAt != null ? childAt.getHeight() : 0;
                int g = (height / 2) + ((swe0.g(i + 1, 1, ispVar.getItemCount()) * height) - (bwt0.u0(recyclerView2) / 2));
                if (g < 0) {
                    g = 0;
                }
                recyclerView2.smoothScrollBy(0, g);
            }
        });
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
