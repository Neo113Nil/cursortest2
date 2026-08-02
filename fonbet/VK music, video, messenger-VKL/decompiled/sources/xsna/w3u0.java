package xsna;

import androidx.recyclerview.widget.m;
import com.vk.stories.design.view.stats.tabs.viewers.adapter.ViewerPayload;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import java.util.ArrayList;

/* compiled from: ViewersUserDiffUtilItemCallback.kt */
/* loaded from: classes6.dex */
public final class w3u0 extends m.e<StoryUserViewer> {
    public static boolean a(StoryUserViewer storyUserViewer, StoryUserViewer storyUserViewer2) {
        return epx.f(storyUserViewer.e, storyUserViewer2.e) && epx.f(storyUserViewer.O, storyUserViewer2.O) && epx.f(storyUserViewer.h, storyUserViewer2.h) && storyUserViewer.h0 == storyUserViewer2.h0 && epx.f(storyUserViewer.i0, storyUserViewer2.i0) && storyUserViewer.j0 == storyUserViewer2.j0 && epx.f(storyUserViewer.d, storyUserViewer2.d) && storyUserViewer.d() == storyUserViewer2.d();
    }

    public static ArrayList b(StoryUserViewer storyUserViewer, StoryUserViewer storyUserViewer2) {
        ArrayList arrayList = new ArrayList();
        if (!epx.f(storyUserViewer.e, storyUserViewer2.e)) {
            arrayList.add(ViewerPayload.FULL_NAME);
        }
        if (!epx.f(storyUserViewer.O, storyUserViewer2.O) || !epx.f(storyUserViewer.h, storyUserViewer2.h)) {
            arrayList.add(ViewerPayload.AVATAR);
        }
        if (storyUserViewer.h0 != storyUserViewer2.h0 || !epx.f(storyUserViewer.i0, storyUserViewer2.i0)) {
            arrayList.add(ViewerPayload.REACTION);
        }
        if (storyUserViewer.j0 != storyUserViewer2.j0) {
            arrayList.add(ViewerPayload.VIEWING);
        }
        if (epx.f(storyUserViewer.d, storyUserViewer2.d) && storyUserViewer.d() == storyUserViewer2.d()) {
            return arrayList;
        }
        arrayList.add(ViewerPayload.OPTIONS);
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(StoryUserViewer storyUserViewer, StoryUserViewer storyUserViewer2) {
        return a(storyUserViewer, storyUserViewer2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(StoryUserViewer storyUserViewer, StoryUserViewer storyUserViewer2) {
        return epx.f(storyUserViewer.c, storyUserViewer2.c);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ Object getChangePayload(StoryUserViewer storyUserViewer, StoryUserViewer storyUserViewer2) {
        return b(storyUserViewer, storyUserViewer2);
    }
}
