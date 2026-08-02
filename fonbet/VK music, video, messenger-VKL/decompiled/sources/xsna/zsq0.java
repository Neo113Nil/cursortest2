package xsna;

import android.view.View;
import com.vk.story.viewer.api.StoryViewerRouter;

/* compiled from: UserProfileNavigator.kt */
/* loaded from: classes5.dex */
public final class zsq0 implements StoryViewerRouter.a {
    public final /* synthetic */ cwl0 b;

    public zsq0(cwl0 cwl0Var) {
        this.b = cwl0Var;
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final View k(String str) {
        return this.b.d.get();
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public final void j(String str) {
    }
}
