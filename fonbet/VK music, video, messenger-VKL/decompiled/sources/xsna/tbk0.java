package xsna;

import android.animation.Animator;
import com.vk.music.snippet.ui.presentation.base.view.SnippetBlurBackgroundView;
import com.vk.music.view.ThumbsImageView;

/* compiled from: SnippetBlurBackgroundView.kt */
/* loaded from: classes3.dex */
public final class tbk0 implements Animator.AnimatorListener {
    public final /* synthetic */ ThumbsImageView b;
    public final /* synthetic */ SnippetBlurBackgroundView c;

    public tbk0(ThumbsImageView thumbsImageView, SnippetBlurBackgroundView snippetBlurBackgroundView) {
        this.b = thumbsImageView;
        this.c = snippetBlurBackgroundView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setAlpha(1.0f);
        SnippetBlurBackgroundView snippetBlurBackgroundView = this.c;
        snippetBlurBackgroundView.f = !snippetBlurBackgroundView.f;
        snippetBlurBackgroundView.g = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
