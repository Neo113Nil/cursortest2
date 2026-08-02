package defpackage;

import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class bpu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoryModalView b;
    public final /* synthetic */ xou0 c;

    public /* synthetic */ bpu0(StoryModalView storyModalView, xou0 xou0Var, int i) {
        this.a = i;
        this.b = storyModalView;
        this.c = xou0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        xou0 xou0Var = this.c;
        StoryModalView storyModalView = this.b;
        switch (i) {
            case 0:
                StoryModalView.animateToPageBackward$lambda$0(storyModalView, xou0Var);
                break;
            default:
                StoryModalView.animateToPageForward$lambda$0(storyModalView, xou0Var);
                break;
        }
    }
}
