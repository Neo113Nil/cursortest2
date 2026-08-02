package defpackage;

import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class cpu0 implements ypu0, cf3 {
    public final /* synthetic */ StoryModalView a;

    public /* synthetic */ cpu0(StoryModalView storyModalView) {
        this.a = storyModalView;
    }

    @Override // defpackage.ypu0
    public void b() {
        this.a.closeClicked();
    }

    @Override // defpackage.cf3
    public void setVolume(float f) {
        StoryModalView._init_$lambda$2(this.a, f);
    }
}
