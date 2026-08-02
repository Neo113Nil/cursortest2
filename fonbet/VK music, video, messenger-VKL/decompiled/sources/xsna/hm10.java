package xsna;

import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.view.Window;
import androidx.core.graphics.BlendModeCompat;

/* compiled from: MaterialContainerTransformSharedElementCallback.java */
/* loaded from: classes13.dex */
public final class hm10 extends wmp0 {
    public final /* synthetic */ Window a;

    public hm10(Window window) {
        this.a = window;
    }

    @Override // xsna.wmp0, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Drawable background = this.a.getDecorView().getBackground();
        if (background == null) {
            return;
        }
        background.mutate().setColorFilter(pe7.a(0, BlendModeCompat.CLEAR));
    }
}
