package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.story.viewer.api.StoryViewerRouter;
import xsna.gu1;
import xsna.hfr;

/* compiled from: AllHighlightsFragment.kt */
/* loaded from: classes3.dex */
public final class fu1 implements StoryViewerRouter.a {
    public final /* synthetic */ AllHighlightsFragment b;

    public fu1(AllHighlightsFragment allHighlightsFragment) {
        this.b = allHighlightsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m5v a(String str) {
        AllHighlightsFragment allHighlightsFragment = this.b;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = allHighlightsFragment.U;
        Object obj = null;
        if (vkRecyclerPaginatedView == null) {
            vkRecyclerPaginatedView = null;
        }
        hfr.a aVar = new hfr.a(rli0.t(dli0.c(new ixt0(vkRecyclerPaginatedView.getRecyclerView())), new go1(allHighlightsFragment, 1)));
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            if (epx.f(fsk.M(((gu1.b) ((m5v) next).m).b.b), str)) {
                obj = next;
                break;
            }
        }
        return (m5v) obj;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final void j(String str) {
        m5v a = a(str);
        int adapterPosition = a != null ? a.getAdapterPosition() : -1;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.b.U;
        if (vkRecyclerPaginatedView == null) {
            vkRecyclerPaginatedView = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) vkRecyclerPaginatedView.getRecyclerView().getLayoutManager();
        if (adapterPosition == -1 || linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.K(adapterPosition, AllHighlightsFragment.g0);
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final View k(String str) {
        m5v a = a(str);
        if (a != null) {
            return a.itemView;
        }
        return null;
    }
}
