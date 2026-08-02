package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import com.vk.clips.interests.impl.ui.FlyAnimationConsumer;
import com.vk.core.view.components.text.VkText;
import java.util.LinkedHashSet;

/* compiled from: CategoryItemViewAnimationDelegate.kt */
/* loaded from: classes16.dex */
public final class ela extends AnimatorListenerAdapter {
    public final /* synthetic */ fla b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ VkText e;

    public ela(fla flaVar, int i, FrameLayout frameLayout, VkText vkText) {
        this.b = flaVar;
        this.c = i;
        this.d = frameLayout;
        this.e = vkText;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        this.d.removeView(this.e);
        sge sgeVar = this.b.d;
        if (sgeVar != null) {
            tge tgeVar = sgeVar.a;
            LinkedHashSet linkedHashSet = tgeVar.h;
            linkedHashSet.remove(sgeVar.b);
            if (linkedHashSet.isEmpty()) {
                tgeVar.f.a();
                tgeVar.g.c();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        sge sgeVar = this.b.d;
        if (sgeVar != null) {
            tge tgeVar = sgeVar.a;
            LinkedHashSet linkedHashSet = tgeVar.h;
            if (linkedHashSet.isEmpty()) {
                tgeVar.f.b(tgeVar.g, this.c > 3 ? FlyAnimationConsumer.FlyCandidatesAmount.NORMAL : FlyAnimationConsumer.FlyCandidatesAmount.FEW);
            }
            linkedHashSet.add(sgeVar.b);
        }
    }
}
