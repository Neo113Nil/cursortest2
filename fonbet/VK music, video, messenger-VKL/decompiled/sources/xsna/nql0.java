package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import xsna.ds60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nql0 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nql0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        switch (this.b) {
            case 0:
                ((qql0) this.c).getClass();
                break;
            case 1:
                StoriesViewPager storiesViewPager = ((com.vk.story.viewer.impl.presentation.stories.b) this.c).O;
                for (int i3 = 0; i3 < storiesViewPager.getChildCount(); i3++) {
                    if (storiesViewPager.getChildAt(i3) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i3)).G();
                    }
                }
                break;
            default:
                ((uvq0) this.c).a(new mwq0(new ds60.b(new NewsfeedExternalAction.c.f0((NewsEntry) obj))));
                break;
        }
    }
}
