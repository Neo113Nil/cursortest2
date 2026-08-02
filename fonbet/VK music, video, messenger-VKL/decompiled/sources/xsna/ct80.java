package xsna;

/* compiled from: OpinionStickerViewController.kt */
/* loaded from: classes6.dex */
public final class ct80 implements nhl {
    public final /* synthetic */ com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f b;

    public ct80(com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar) {
        this.b = fVar;
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
        com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar = this.b;
        fVar.b.onDestroy();
        fVar.c.getLifecycle().removeObserver(this);
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }
}
