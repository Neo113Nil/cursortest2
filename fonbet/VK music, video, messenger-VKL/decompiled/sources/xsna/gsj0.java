package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: SimpleProgressHolder.kt */
/* loaded from: classes4.dex */
public final class gsj0 extends qi6<NewsEntry> {
    public static final int R6(gsj0 gsj0Var, ViewGroup viewGroup) {
        int absoluteAdapterPosition = gsj0Var.getAbsoluteAdapterPosition();
        Integer valueOf = Integer.valueOf(absoluteAdapterPosition);
        if (absoluteAdapterPosition <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        int intValue = valueOf.intValue();
        RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        View findViewByPosition = linearLayoutManager != null ? linearLayoutManager.findViewByPosition(intValue - 1) : null;
        if (findViewByPosition != null) {
            return findViewByPosition.getHeight();
        }
        return 0;
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
    }
}
