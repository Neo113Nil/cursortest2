package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.design.view.recommended.RecommendedView;

/* compiled from: RecommendedView.java */
/* loaded from: classes2.dex */
public final class ref0 extends RecyclerView.t {
    public final /* synthetic */ RecommendedView b;

    public ref0(RecommendedView recommendedView) {
        this.b = recommendedView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.b.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
    }
}
