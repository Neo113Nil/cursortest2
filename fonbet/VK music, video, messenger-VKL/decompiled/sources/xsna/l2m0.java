package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.story.viewer.api.StoryViewerRouter;
import xsna.hfr;

/* compiled from: StoryElongatedViewHolder.kt */
/* loaded from: classes4.dex */
public final class l2m0 implements StoryViewerRouter.a {
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ m2m0 c;

    public l2m0(ViewGroup viewGroup, m2m0 m2m0Var) {
        this.b = viewGroup;
        this.c = m2m0Var;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final void j(String str) {
        this.c.o.invoke(str);
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final View k(String str) {
        Object obj;
        ViewGroup viewGroup = this.b;
        hfr.a aVar = new hfr.a(rli0.t(new i5g(swe0.q(0, viewGroup.getChildCount())), new ut30(viewGroup, 23)));
        while (true) {
            if (!aVar.hasNext()) {
                obj = null;
                break;
            }
            obj = aVar.next();
            StoriesContainer story = ((y8m0) obj).getStory();
            if (epx.f(story != null ? story.Ob() : null, str)) {
                break;
            }
        }
        y8m0 y8m0Var = (y8m0) obj;
        if (y8m0Var != null) {
            return y8m0Var.getStoryImageView();
        }
        return null;
    }
}
