package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.libvideo.live.impl.views.chat.elements.Comment;

/* compiled from: ChatInlineView.java */
/* loaded from: classes3.dex */
public final class zrb extends AnimatorListenerAdapter {
    public final /* synthetic */ Comment b;
    public final /* synthetic */ yrb c;

    public zrb(yrb yrbVar, Comment comment) {
        this.c = yrbVar;
        this.b = comment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.removeView(this.b);
    }
}
