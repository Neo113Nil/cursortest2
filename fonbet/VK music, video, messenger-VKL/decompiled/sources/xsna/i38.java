package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BotKeyboardVc.kt */
/* loaded from: classes2.dex */
public final class i38 extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ com.vk.newsfeed.common.recycler.holders.attachments.a c;

    public i38(RecyclerView recyclerView, com.vk.newsfeed.common.recycler.holders.attachments.a aVar) {
        this.b = recyclerView;
        this.c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.animate().setListener(null);
        this.c.invoke();
    }
}
