package xsna;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;

/* compiled from: StickyHeadersLinearLayoutManager.kt */
/* loaded from: classes17.dex */
public final class wel0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ StickyHeadersLinearLayoutManager<RecyclerView.Adapter<?>> c;

    public wel0(ViewTreeObserver viewTreeObserver, StickyHeadersLinearLayoutManager<RecyclerView.Adapter<?>> stickyHeadersLinearLayoutManager) {
        this.b = viewTreeObserver;
        this.c = stickyHeadersLinearLayoutManager;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.removeOnGlobalLayoutListener(this);
        this.c.W();
    }
}
