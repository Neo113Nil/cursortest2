package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class c96 extends AnimatorListenerAdapter {
    public final /* synthetic */ b96 b;
    public final /* synthetic */ View c;

    public c96(View view, b96 b96Var) {
        this.b = b96Var;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View trashPreviewBtn = this.b.a.getTrashPreviewBtn();
        if (trashPreviewBtn != null) {
            trashPreviewBtn.setVisibility(8);
        }
        this.c.setVisibility(8);
    }
}
