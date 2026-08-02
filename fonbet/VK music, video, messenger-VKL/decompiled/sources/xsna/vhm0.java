package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.i;
import com.vkontakte.android.R;
import java.util.Set;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vhm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vhm0(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.stories.design.view.stats.tabs.viewers.mvi.b bVar = (com.vk.stories.design.view.stats.tabs.viewers.mvi.b) this.d;
                StoryUserViewer storyUserViewer = (StoryUserViewer) this.e;
                bVar.T(new e.a.C1825a(storyUserViewer.c, (Set) obj));
                if (this.c) {
                    f4z f4zVar = bVar.m;
                    tlo0.a aVar = tlo0.Companion;
                    Object[] objArr = {storyUserViewer.d};
                    aVar.getClass();
                    tlo0.g c = tlo0.a.c(R.string.story_statistics_viewers_snackbar_was_shown, objArr);
                    f4zVar.b(new i.c(new com.vk.movika.sdk.android.defaultplayer.container.e(25, bVar, storyUserViewer), new tlo0.f(R.string.story_statistics_viewers_snackbar_button_revert), c));
                }
                break;
            default:
                onq0 onq0Var = (onq0) this.d;
                iea0 iea0Var = (iea0) this.e;
                if (this.c) {
                    wmq0.B(onq0Var, iea0Var, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    wmq0.B(onq0Var, iea0Var, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                break;
        }
        return s3q0.a;
    }
}
