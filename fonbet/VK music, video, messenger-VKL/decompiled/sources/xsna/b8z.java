package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes13.dex */
public final class b8z extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b8z(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 1:
                ((SelectionStickerView) this.c).setVisibility(8);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.b) {
            case 0:
                super.onAnimationRepeat(animator);
                d8z d8zVar = (d8z) this.c;
                d8zVar.g = (d8zVar.g + 1) % d8zVar.f.c.length;
                d8zVar.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
