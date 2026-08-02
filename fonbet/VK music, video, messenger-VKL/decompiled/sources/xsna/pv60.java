package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.hb60;

/* compiled from: NewsfeedPlaylistWatcherCallback.kt */
/* loaded from: classes4.dex */
public final class pv60 implements hb60.a {
    public final WeakReference<RecyclerView> a;
    public final Object b;
    public final Object c;

    public pv60(RecyclerView recyclerView) {
        this.a = new WeakReference<>(recyclerView);
        vo50 vo50Var = new vo50(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, vo50Var);
        this.c = msy.a(lazyThreadSafetyMode, new hy2(24));
    }

    @Override // xsna.hb60.a
    public final long a() {
        return 0L;
    }

    @Override // xsna.hb60.a
    public final void b(NewsEntry newsEntry, List<? extends qi6<?>> list) {
        RecyclerView recyclerView = this.a.get();
        if (recyclerView != null) {
            wjf0.c(recyclerView, new com.vk.catalog2.common.ui.holders.a(20, list, this));
        }
    }

    @Override // xsna.hb60.a
    public final void dispose() {
    }
}
