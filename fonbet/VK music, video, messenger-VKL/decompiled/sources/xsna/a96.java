package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class a96 extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;
    public final /* synthetic */ b96 c;

    public a96(View view, b96 b96Var) {
        this.b = view;
        this.c = b96Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setVisibility(8);
        View trashPreviewBtn = this.c.a.getTrashPreviewBtn();
        if (trashPreviewBtn != null) {
            trashPreviewBtn.setVisibility(8);
        }
    }
}
