package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewPager2.java */
/* loaded from: classes12.dex */
public final class fzt0 implements RecyclerView.q {
    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(@NonNull View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) pVar).width != -1 || ((ViewGroup.MarginLayoutParams) pVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(@NonNull View view) {
    }
}
