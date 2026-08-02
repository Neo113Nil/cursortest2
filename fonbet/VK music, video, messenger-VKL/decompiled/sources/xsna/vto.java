package xsna;

import android.view.ViewGroup;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.design.view.newsfeed.dzen.storyitem.DzenStoryItemView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.xto;

/* compiled from: DzenStoryItemHolder.kt */
/* loaded from: classes4.dex */
public final class vto extends rp6<xto, DzenStory> {
    public final DzenStoryItemView E;

    public vto(ViewGroup viewGroup) {
        super(R.layout.dzen_story_item, viewGroup);
        DzenStoryItemView dzenStoryItemView = (DzenStoryItemView) this.itemView;
        this.E = dzenStoryItemView;
        dzenStoryItemView.setOnSubtitleClickListener(new mxj(this, 6));
    }

    @Override // xsna.rp6
    public final void R6(xto xtoVar) {
        DzenStoryItemView.a.C1052a c1052a;
        xto xtoVar2 = xtoVar;
        xto.a aVar = xtoVar2.h;
        if (aVar instanceof xto.a.C4047a) {
            c1052a = new DzenStoryItemView.a.C1052a(((xto.a.C4047a) aVar).a);
        } else {
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            c1052a = null;
        }
        DzenStoryItemView dzenStoryItemView = this.E;
        dzenStoryItemView.setContent(c1052a);
        dzenStoryItemView.setTitleStyle(xtoVar2.i);
        dzenStoryItemView.setTitle(xtoVar2.j);
        dzenStoryItemView.setSubtitle(xtoVar2.k);
    }
}
