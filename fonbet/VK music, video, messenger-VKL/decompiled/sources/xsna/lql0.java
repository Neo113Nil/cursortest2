package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import xsna.lwq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lql0 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lql0(Object obj, int i) {
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
                com.vk.story.viewer.impl.presentation.stories.b bVar = (com.vk.story.viewer.impl.presentation.stories.b) this.c;
                zjm0 zjm0Var = (zjm0) obj;
                bVar.y0.a(104, zjm0Var);
                StoriesViewPager storiesViewPager = bVar.O;
                for (int i3 = 0; i3 < storiesViewPager.getChildCount(); i3++) {
                    if (storiesViewPager.getChildAt(i3) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i3)).setUploadFailed(zjm0Var);
                    }
                }
                break;
            default:
                ((uvq0) this.c).a(new lwq0.b.C3306b(((Post) obj).o.b, false));
                break;
        }
    }
}
