package xsna;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecommendationsBottomSheet.kt */
/* loaded from: classes6.dex */
public final class hbf0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ gbf0 c;

    public hbf0(RecyclerView recyclerView, gbf0 gbf0Var) {
        this.b = recyclerView;
        this.c = gbf0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        RecyclerView recyclerView = this.b;
        if (recyclerView.getChildCount() > 0) {
            i0q0.a().postDelayed(new ja6(this.c, 8), 400L);
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
