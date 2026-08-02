package xsna;

import com.vk.dto.stories.model.StoryViewAction;
import com.vk.story.viewer.impl.presentation.stories.StoryViewActivity;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import xsna.dc80;

/* compiled from: StoryViewContainer.java */
/* loaded from: classes6.dex */
public final class llm0 implements dc80.b {
    public final /* synthetic */ com.vk.story.viewer.impl.presentation.stories.b a;

    public llm0(com.vk.story.viewer.impl.presentation.stories.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.dc80.b
    public final boolean a() {
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.a;
        if (!bVar.u) {
            return true;
        }
        if (bVar.getContext() instanceof StoryViewActivity) {
            bVar.V(StoryViewAction.CLOSE_SWIPE_DOWN);
        }
        bVar.finish();
        return true;
    }

    @Override // xsna.dc80.b
    public final boolean b() {
        StoriesViewPager storiesViewPager = this.a.O;
        for (int i = 0; i < storiesViewPager.getChildCount(); i++) {
            if (storiesViewPager.getChildAt(i) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i)).L0();
            }
        }
        return true;
    }
}
