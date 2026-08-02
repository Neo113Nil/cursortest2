package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: OnMediaPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final class r880 implements RecyclerView.q {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ NewsEntry c;
    public final /* synthetic */ q880 d;

    public r880(RecyclerView recyclerView, NewsEntry newsEntry, q880 q880Var) {
        this.b = recyclerView;
        this.c = newsEntry;
        this.d = q880Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(View view) {
        NewsEntry newsEntry = this.c;
        RecyclerView recyclerView = this.b;
        if (vjf0.a(recyclerView, newsEntry) != null) {
            this.d.f7();
            recyclerView.removeOnChildAttachStateChangeListener(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(View view) {
    }
}
