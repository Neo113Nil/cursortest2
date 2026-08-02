package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiscoverStoryView.kt */
/* loaded from: classes6.dex */
public final class can implements StoryViewerRouter.a {
    public final /* synthetic */ y9n b;

    public can(y9n y9nVar) {
        this.b = y9nVar;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final void j(String str) {
        RecyclerView recyclerView;
        List<? extends hfz> list;
        StoriesContainer storiesContainer;
        y9n y9nVar = this.b;
        k9n k9nVar = y9nVar.M;
        int i = -1;
        if (k9nVar != null && (list = k9nVar.h) != null) {
            Iterator<? extends hfz> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hfz next = it.next();
                rrl0 rrl0Var = next instanceof rrl0 ? (rrl0) next : null;
                if (epx.f((rrl0Var == null || (storiesContainer = rrl0Var.b) == null) ? null : storiesContainer.Ob(), str)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = y9nVar.K;
        Object layoutManager = (vkRecyclerPaginatedView == null || (recyclerView = vkRecyclerPaginatedView.getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.K(i, iah0.a(32));
        }
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final View k(String str) {
        RecyclerView recyclerView;
        RecyclerView.o layoutManager;
        List<? extends hfz> list;
        StoriesContainer storiesContainer;
        y9n y9nVar = this.b;
        k9n k9nVar = y9nVar.M;
        int i = -1;
        if (k9nVar != null && (list = k9nVar.h) != null) {
            Iterator<? extends hfz> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hfz next = it.next();
                rrl0 rrl0Var = next instanceof rrl0 ? (rrl0) next : null;
                if (epx.f((rrl0Var == null || (storiesContainer = rrl0Var.b) == null) ? null : storiesContainer.Ob(), str)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = y9nVar.K;
        if (vkRecyclerPaginatedView == null || (recyclerView = vkRecyclerPaginatedView.getRecyclerView()) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.findViewByPosition(i);
    }
}
