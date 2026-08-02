package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.fave.entities.FaveSource;
import com.vk.story.viewer.api.StoryViewerRouter;

/* compiled from: FaveSearchAdapter.kt */
/* loaded from: classes18.dex */
public final class xrq extends zoj0<z990, c990> implements mf7 {
    public final FaveSource e;
    public final StoryViewerRouter f;

    public xrq(FaveSource faveSource, StoryViewerRouter storyViewerRouter) {
        this.e = faveSource;
        this.f = storyViewerRouter;
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((c990) e0Var).V5((z990) this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new c990(viewGroup, this.e, this.f);
        }
        throw new IllegalStateException();
    }
}
