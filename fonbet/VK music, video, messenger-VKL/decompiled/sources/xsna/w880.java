package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: OnMediaTrackHolder.kt */
/* loaded from: classes4.dex */
public final class w880 implements RecyclerView.q {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ NewsEntry c;
    public final /* synthetic */ v880 d;

    public w880(RecyclerView recyclerView, NewsEntry newsEntry, v880 v880Var) {
        this.b = recyclerView;
        this.c = newsEntry;
        this.d = v880Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(View view) {
        NewsEntry newsEntry = this.c;
        RecyclerView recyclerView = this.b;
        if (vjf0.a(recyclerView, newsEntry) != null) {
            this.d.b7();
            recyclerView.removeOnChildAttachStateChangeListener(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(View view) {
    }
}
