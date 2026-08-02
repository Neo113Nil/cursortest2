package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.holders.group.GroupVh;

/* compiled from: BottomAppBar.java */
/* loaded from: classes13.dex */
public final class w38 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w38(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = BottomAppBar.j0;
                ((BottomAppBar) obj).W = null;
                break;
            case 1:
                GroupVh groupVh = (GroupVh) obj;
                com.vk.catalog2.common.ui.holders.group.a aVar = groupVh.q;
                if (aVar != null) {
                    GroupSubscriptionState groupSubscriptionState = GroupSubscriptionState.Subscribed;
                    if (epx.f(groupVh.F, aVar.d)) {
                        aVar.f = groupSubscriptionState;
                        aVar.f();
                        break;
                    }
                }
                break;
            default:
                ((pl70) obj).setVa(null);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.b) {
            case 0:
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
