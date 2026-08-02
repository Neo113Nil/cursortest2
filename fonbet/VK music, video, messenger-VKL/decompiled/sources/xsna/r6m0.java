package xsna;

import android.view.ViewTreeObserver;
import com.vk.camera.drawing.gradient.StoryEditText;

/* compiled from: StoryMentionDialogContract.kt */
/* loaded from: classes16.dex */
public final class r6m0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ q6m0 b;
    public final /* synthetic */ v3l0 c;

    public r6m0(q6m0 q6m0Var, v3l0 v3l0Var) {
        this.b = q6m0Var;
        this.c = v3l0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        q6m0 q6m0Var = this.b;
        StoryEditText storyEditText = q6m0Var.j;
        if (storyEditText == null) {
            storyEditText = null;
        }
        storyEditText.getViewTreeObserver().removeOnPreDrawListener(this);
        StoryEditText storyEditText2 = q6m0Var.j;
        if (storyEditText2 == null) {
            storyEditText2 = null;
        }
        mhy.j(storyEditText2);
        StoryEditText storyEditText3 = q6m0Var.j;
        StoryEditText storyEditText4 = storyEditText3 != null ? storyEditText3 : null;
        if (storyEditText3 == null) {
            storyEditText3 = null;
        }
        storyEditText4.setSelection(storyEditText3.getText().length());
        StoryEditText storyEditText5 = q6m0Var.j;
        (storyEditText5 != null ? storyEditText5 : null).postDelayed(new e50(8, this.c, q6m0Var), 300L);
        return true;
    }
}
