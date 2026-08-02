package xsna;

import android.view.ViewTreeObserver;
import com.vk.camera.drawing.gradient.StoryEditText;

/* compiled from: StoryHashtagDialogContract.kt */
/* loaded from: classes16.dex */
public final class o4m0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ n4m0 b;
    public final /* synthetic */ v3l0 c;

    public o4m0(n4m0 n4m0Var, v3l0 v3l0Var) {
        this.b = n4m0Var;
        this.c = v3l0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        n4m0 n4m0Var = this.b;
        StoryEditText storyEditText = n4m0Var.k;
        if (storyEditText == null) {
            storyEditText = null;
        }
        storyEditText.getViewTreeObserver().removeOnPreDrawListener(this);
        StoryEditText storyEditText2 = n4m0Var.k;
        if (storyEditText2 == null) {
            storyEditText2 = null;
        }
        mhy.j(storyEditText2);
        StoryEditText storyEditText3 = n4m0Var.k;
        StoryEditText storyEditText4 = storyEditText3 != null ? storyEditText3 : null;
        if (storyEditText3 == null) {
            storyEditText3 = null;
        }
        storyEditText4.setSelection(storyEditText3.getText().length());
        StoryEditText storyEditText5 = n4m0Var.k;
        (storyEditText5 != null ? storyEditText5 : null).postDelayed(new kw6(9, this.c, n4m0Var), 300L);
        return true;
    }
}
