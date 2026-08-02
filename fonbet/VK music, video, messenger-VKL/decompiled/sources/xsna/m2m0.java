package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.stories.model.PromoStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import xsna.h2m0;

/* compiled from: StoryElongatedViewHolder.kt */
/* loaded from: classes4.dex */
public final class m2m0 extends vif0<StoriesContainer> {
    public final g2m0 n;
    public final izs<String, s3q0> o;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint p;
    public final String q;
    public final wvl0 r;
    public final StoryViewerRouter s;
    public final hcm0 t;

    public m2m0(ViewGroup viewGroup, g2m0 g2m0Var, h2m0.b bVar, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, wvl0 wvl0Var, StoryViewerRouter storyViewerRouter) {
        super(new hcm0(viewGroup.getContext()));
        this.n = g2m0Var;
        this.o = bVar;
        this.p = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.q = str;
        this.r = wvl0Var;
        this.s = storyViewerRouter;
        View view = this.itemView;
        this.t = view instanceof hcm0 ? (hcm0) view : null;
        bwt0.i0(view, new h57(24, this, viewGroup));
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.k2m0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                if (jjc.b()) {
                    return false;
                }
                m2m0 m2m0Var = m2m0.this;
                StoriesContainer storiesContainer = (StoriesContainer) m2m0Var.m;
                if (storiesContainer == null || storiesContainer.Qb() || !storiesContainer.Eb() || (storiesContainer instanceof PromoStoriesContainer)) {
                    return false;
                }
                or1 or1Var = new or1(m2m0Var.itemView.getContext());
                or1Var.a(fkq0.d(storiesContainer.Ab()) ? R.string.open_profile : R.string.open_community, new dxt(6, m2m0Var, storiesContainer));
                or1Var.d();
                return true;
            }
        });
    }

    @Override // xsna.vif0
    public final void i6(StoriesContainer storiesContainer) {
        hcm0 hcm0Var;
        StoriesContainer storiesContainer2 = storiesContainer;
        if (storiesContainer2 == null || (hcm0Var = this.t) == null) {
            return;
        }
        hcm0Var.b(storiesContainer2, false);
    }
}
