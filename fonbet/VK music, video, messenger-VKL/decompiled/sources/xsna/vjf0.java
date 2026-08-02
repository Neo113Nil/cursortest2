package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: RecyclerViewExt.kt */
/* loaded from: classes4.dex */
public final class vjf0 {
    public static final View a(RecyclerView recyclerView, NewsEntry newsEntry) {
        if (newsEntry != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                UsableRecyclerView.j jVar = childViewHolder instanceof qi6 ? (qi6) childViewHolder : null;
                if (jVar instanceof n880) {
                    n880 n880Var = (n880) jVar;
                    if (epx.f(n880Var.H0(), newsEntry)) {
                        return n880Var.R3();
                    }
                }
            }
        }
        return null;
    }
}
