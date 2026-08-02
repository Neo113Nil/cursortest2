package defpackage;

import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class apu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoryModalView b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ apu0(StoryModalView storyModalView, Runnable runnable, int i) {
        this.a = i;
        this.b = storyModalView;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.c;
        StoryModalView storyModalView = this.b;
        switch (i) {
            case 0:
                StoryModalView.animateShow$lambda$0(storyModalView, runnable);
                break;
            default:
                StoryModalView.animateDismiss$lambda$0(storyModalView, runnable);
                break;
        }
    }
}
