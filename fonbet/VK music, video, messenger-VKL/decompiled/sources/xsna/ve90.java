package xsna;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import xsna.se90;

/* compiled from: PaginationScreenContent.kt */
/* loaded from: classes18.dex */
public final class ve90 implements Animator.AnimatorListener {
    public final /* synthetic */ se90 b;
    public final /* synthetic */ ke90 c;

    public ve90(se90 se90Var, ke90 ke90Var) {
        this.b = se90Var;
        this.c = ke90Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewPager2 viewPager2;
        if (this.b.e() != se90.a.Progress || (viewPager2 = (ViewPager2) this.c.invoke()) == null || viewPager2.getScrollState() == 1) {
            return;
        }
        int currentItem = viewPager2.getCurrentItem() + 1;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        viewPager2.setCurrentItem(currentItem < (adapter != null ? adapter.getItemCount() : 0) ? viewPager2.getCurrentItem() + 1 : 0);
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
