package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.NestedScrollableRecyclerView;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StoryElongatedBlockViewHolder.kt */
/* loaded from: classes4.dex */
public final class h2m0 extends vif0<j2m0> {
    public static final int q = iah0.a(4);
    public static final int r = iah0.a(8);
    public final VkGroupHeader n;
    public final NestedScrollableRecyclerView o;
    public final g2m0 p;

    /* compiled from: StoryElongatedBlockViewHolder.kt */
    public static final class a extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (xpg0.b()) {
                int i = h2m0.q;
                rect.left = h2m0.q;
            } else {
                int i2 = h2m0.q;
                rect.right = h2m0.q;
            }
        }
    }

    /* compiled from: StoryElongatedBlockViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            String str2 = str;
            h2m0 h2m0Var = (h2m0) this.receiver;
            g2m0 g2m0Var = h2m0Var.p;
            int itemCount = g2m0Var.getItemCount();
            int i = 0;
            while (true) {
                if (i >= itemCount) {
                    break;
                }
                if (epx.f(((StoriesContainer) g2m0Var.c.c(i)).Ob(), str2)) {
                    h2m0Var.o.scrollToPosition(i);
                    break;
                }
                i++;
            }
            return s3q0.a;
        }
    }

    public h2m0(ViewGroup viewGroup, boolean z, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, wvl0 wvl0Var, StoryViewerRouter storyViewerRouter) {
        super(viewGroup, R.layout.layout_story_search_stories_block_view_holder, 0);
        this.n = (VkGroupHeader) this.itemView.findViewById(R.id.stories_block_title);
        NestedScrollableRecyclerView nestedScrollableRecyclerView = (NestedScrollableRecyclerView) this.itemView.findViewById(R.id.list);
        this.o = nestedScrollableRecyclerView;
        g2m0 g2m0Var = new g2m0(new b(1, this, h2m0.class, "scrollStoriesListToUniqueId", "scrollStoriesListToUniqueId(Ljava/lang/String;)V", 0), z, mobileOfficialAppsConStoriesStat$ViewEntryPoint, str, wvl0Var, storyViewerRouter);
        this.p = g2m0Var;
        this.itemView.getContext();
        nestedScrollableRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        nestedScrollableRecyclerView.setNestedScrollingEnabled(false);
        nestedScrollableRecyclerView.setClipToPadding(false);
        int i = q;
        int i2 = r;
        nestedScrollableRecyclerView.setPaddingRelative(i2, 0, i2 - i, 0);
        nestedScrollableRecyclerView.addItemDecoration(new a());
        nestedScrollableRecyclerView.setAdapter(g2m0Var);
    }

    @Override // xsna.vif0
    public final void i6(j2m0 j2m0Var) {
        j2m0 j2m0Var2 = j2m0Var;
        VkGroupHeader.d dVar = new VkGroupHeader.d(j2m0Var2.b, null, null, null, 0, null, 510);
        VkGroupHeader vkGroupHeader = this.n;
        vkGroupHeader.setTitle(dVar);
        vkGroupHeader.setSize(VkGroupHeader.Size.Small);
        this.p.setItems(j2m0Var2.a);
    }
}
