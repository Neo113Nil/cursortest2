package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: SharingV2View.kt */
/* loaded from: classes5.dex */
public final class qcj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ com.vk.sharing.core.view.f b;

    public qcj0(com.vk.sharing.core.view.f fVar) {
        this.b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View createChatButtonRedesign;
        createChatButtonRedesign = this.b.getCreateChatButtonRedesign();
        f4m.j(createChatButtonRedesign);
    }
}
