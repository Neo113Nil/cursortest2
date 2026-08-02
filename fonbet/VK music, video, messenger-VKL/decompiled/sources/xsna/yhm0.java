package xsna;

import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.a;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yhm0 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yhm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                tu1 tu1Var = (tu1) obj;
                int i4 = StoryStatisticsViewersFragment.f0;
                xn50.a.c((StoryStatisticsViewersFragment) obj2, new a.b.C1821a(tu1Var.a, tu1Var.b));
                break;
            default:
                StoriesViewPager storiesViewPager = ((com.vk.story.viewer.impl.presentation.stories.b) obj2).O;
                for (int i5 = 0; i5 < storiesViewPager.getChildCount(); i5++) {
                    if (storiesViewPager.getChildAt(i5) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i5)).getClass();
                    }
                }
                break;
        }
    }
}
