package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;

/* compiled from: AnimExt.kt */
/* loaded from: classes5.dex */
public final class p8h extends AnimatorListenerAdapter {
    public final /* synthetic */ com.vk.profile.community.impl.ui.cover.redesign.delegate.a b;

    public p8h(com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar) {
        this.b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.g.a.invoke(CommunityProfileAction.g.d.c.b);
    }
}
