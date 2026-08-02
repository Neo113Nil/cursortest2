package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vk.story.viewer.api.StoryViewerRouter;

/* compiled from: AppGroupedStoryView.kt */
/* loaded from: classes6.dex */
public final class b53 implements StoryViewerRouter.a {
    public final /* synthetic */ w43 b;

    public b53(w43 w43Var) {
        this.b = w43Var;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final void j(String str) {
        w43 w43Var = this.b;
        lou louVar = w43Var.N;
        int w = louVar != null ? ((ListDataSet) louVar.c).w(new y43(new x43(str, 0), 0)) : -1;
        RecyclerView recyclerView = w43Var.M;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.K(w, iah0.a(32));
        }
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final View k(String str) {
        int i;
        RecyclerView.o layoutManager;
        w43 w43Var = this.b;
        lou louVar = w43Var.N;
        if (louVar != null) {
            int i2 = 0;
            i = ((ListDataSet) louVar.c).w(new a53(new z43(str, i2), i2));
        } else {
            i = -1;
        }
        RecyclerView recyclerView = w43Var.M;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.findViewByPosition(i);
    }
}
