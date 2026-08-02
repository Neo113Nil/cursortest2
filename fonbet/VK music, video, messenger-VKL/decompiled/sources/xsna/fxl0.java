package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.archive.impl.presentation.list.StoryArchiveRecyclerPaginatedView;
import com.vk.story.viewer.api.StoryViewerRouter;

/* compiled from: StoryArchiveFragment.kt */
/* loaded from: classes6.dex */
public final class fxl0 implements StoryViewerRouter.a {
    public final /* synthetic */ StoryArchiveFragment b;

    public fxl0(StoryArchiveFragment storyArchiveFragment) {
        this.b = storyArchiveFragment;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final void j(String str) {
        RecyclerView recyclerView;
        int i;
        StoryArchiveFragment storyArchiveFragment = this.b;
        StoryArchiveRecyclerPaginatedView storyArchiveRecyclerPaginatedView = storyArchiveFragment.Y;
        if (storyArchiveRecyclerPaginatedView == null || (recyclerView = storyArchiveRecyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        bxl0 bxl0Var = storyArchiveFragment.f0;
        if (bxl0Var == null) {
            bxl0Var = null;
        }
        bpn0 bpn0Var = cqm0.a;
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
            i = 0;
        }
        recyclerView.scrollToPosition(bxl0Var.P0(i));
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final View k(String str) {
        RecyclerView recyclerView;
        RecyclerView.o layoutManager;
        int i;
        StoryArchiveFragment storyArchiveFragment = this.b;
        StoryArchiveRecyclerPaginatedView storyArchiveRecyclerPaginatedView = storyArchiveFragment.Y;
        if (storyArchiveRecyclerPaginatedView == null || (recyclerView = storyArchiveRecyclerPaginatedView.getRecyclerView()) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        bxl0 bxl0Var = storyArchiveFragment.f0;
        bxl0 bxl0Var2 = bxl0Var != null ? bxl0Var : null;
        bpn0 bpn0Var = cqm0.a;
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
            i = 0;
        }
        return layoutManager.findViewByPosition(bxl0Var2.P0(i));
    }
}
