package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.catalog2.feature.music.holders.artist.ArtistBiographyVh;
import com.vk.core.view.links.LinkedTextView;

/* compiled from: ArtistBiographyVh.kt */
/* loaded from: classes16.dex */
public final class mq3 extends AnimatorListenerAdapter {
    public final /* synthetic */ ArtistBiographyVh b;
    public final /* synthetic */ LinkedTextView c;

    public mq3(ArtistBiographyVh artistBiographyVh, LinkedTextView linkedTextView) {
        this.b = artistBiographyVh;
        this.c = linkedTextView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.s = false;
        LinkedTextView linkedTextView = this.c;
        linkedTextView.getLayoutParams().height = -2;
        linkedTextView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.s = true;
    }
}
