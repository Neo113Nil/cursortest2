package xsna;

import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;

/* compiled from: BaseCameraEditorViewDelegates.kt */
/* loaded from: classes16.dex */
public final class i96 implements StickersDrawingViewGroup.l {
    public final /* synthetic */ j96 a;

    public i96(j96 j96Var) {
        this.a = j96Var;
    }

    @Override // com.vk.stories.design.view.stickers.StickersDrawingViewGroup.l
    public final void M(nov novVar) {
        j96 j96Var = this.a;
        ((u76) j96Var.e.invoke()).M(novVar);
        e8m0 a = j96Var.a();
        if (a.f) {
            a.f = false;
            a.b.o5().i(StoryEditorEvents.ADD_PHOTO_CLIPBOARD);
        }
    }

    @Override // com.vk.stories.design.view.stickers.StickersDrawingViewGroup.l
    public final void f(nov novVar) {
        ((u76) this.a.e.invoke()).f(novVar);
    }
}
