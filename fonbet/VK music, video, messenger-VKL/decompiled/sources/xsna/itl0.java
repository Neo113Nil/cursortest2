package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.hfr;

/* compiled from: StoriesItemHolderImpl.kt */
/* loaded from: classes6.dex */
public final class itl0 implements StoryViewerRouter.a {
    public final /* synthetic */ jtl0 b;

    public itl0(jtl0 jtl0Var) {
        this.b = jtl0Var;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final void j(String str) {
        opl0 opl0Var = this.b.n;
        Iterator it = ((ArrayList) opl0Var.y0()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (epx.f(((StoriesContainer) it.next()).Ob(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + (opl0Var.t ? 1 : 0);
        RecyclerView.o layoutManager = opl0Var.g.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.K(i2, opl0.u);
        }
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final View k(String str) {
        Object obj;
        ViewGroup viewGroup = this.b.l;
        if (viewGroup != null) {
            hfr.a aVar = new hfr.a(rli0.t(new i5g(swe0.q(0, viewGroup.getChildCount())), new j6l0(viewGroup, 2)));
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
        }
        return null;
    }
}
