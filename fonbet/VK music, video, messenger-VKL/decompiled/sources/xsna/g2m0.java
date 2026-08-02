package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import xsna.h2m0;

/* compiled from: StoryElongatedAdapter.kt */
/* loaded from: classes4.dex */
public final class g2m0 extends zoj0<StoriesContainer, vif0<?>> {
    public final h2m0.b e;
    public final boolean f;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint g;
    public final String h;
    public final wvl0 i;
    public final StoryViewerRouter j;
    public hvz k;

    public g2m0(h2m0.b bVar, boolean z, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, wvl0 wvl0Var, StoryViewerRouter storyViewerRouter) {
        this.e = bVar;
        this.f = z;
        this.g = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.h = str;
        this.i = wvl0Var;
        this.j = storyViewerRouter;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f ? super.getItemCount() + 1 : super.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (i == 0 && this.f) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        if (vif0Var instanceof m2m0) {
            m2m0 m2m0Var = (m2m0) vif0Var;
            if (this.f) {
                i--;
            }
            m2m0Var.V5(this.c.c(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            i2m0 i2m0Var = new i2m0(viewGroup, R.layout.layout_story_elongated_create_view_holder, 0);
            bwt0.i0(i2m0Var.itemView, new wze0(3, i2m0Var, viewGroup));
            i2m0Var.n = this.k;
            return i2m0Var;
        }
        if (i != 1) {
            throw new IllegalArgumentException(lhg.a(i, "Can't create view holder by "));
        }
        return new m2m0(viewGroup, this, this.e, this.g, this.h, this.i, this.j);
    }
}
