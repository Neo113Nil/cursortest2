package xsna;

import com.vk.stories.design.view.text.StorySeekBar;
import com.vk.stories.design.view.text.TextStickerFrameLayout;

/* compiled from: TextStickerDialogImpl.kt */
/* loaded from: classes16.dex */
public final class fmo0 implements TextStickerFrameLayout.a {
    public final /* synthetic */ cmo0 a;

    public fmo0(cmo0 cmo0Var) {
        this.a = cmo0Var;
    }

    @Override // com.vk.stories.design.view.text.TextStickerFrameLayout.a
    public final void a(float f) {
        float f2 = 1 - f;
        StorySeekBar storySeekBar = this.a.j;
        StorySeekBar storySeekBar2 = storySeekBar == null ? null : storySeekBar;
        if (storySeekBar == null) {
            storySeekBar = null;
        }
        storySeekBar2.setProgress(storySeekBar.getProgress() - f2);
    }
}
