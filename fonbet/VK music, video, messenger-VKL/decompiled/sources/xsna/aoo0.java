package xsna;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import xsna.yno0;

/* compiled from: Animator.kt */
/* loaded from: classes4.dex */
public final class aoo0 implements Animator.AnimatorListener {
    public final /* synthetic */ yno0 b;

    public aoo0(yno0 yno0Var) {
        this.b = yno0Var;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yno0 yno0Var = this.b;
        xno0 xno0Var = yno0Var.G;
        xno0Var.getLayoutParams().height = -2;
        xno0Var.setTextIsSelectableInFullExcerptType(true);
        yno0Var.f7(yno0Var.d7());
        xno0Var.requestLayout();
        yno0.c cVar = (yno0.c) yno0Var.P.getValue();
        yno0 yno0Var2 = yno0.this;
        ?? q6 = yno0Var2.q6();
        if (q6 == 0) {
            return;
        }
        p4r p4rVar = (p4r) cVar.a.getValue();
        UserId o = k9q0.o(q6);
        Integer valueOf = Integer.valueOf(di60.n(q6));
        String str = yno0Var2.v;
        iko0 J0 = yno0Var2.J0();
        Integer valueOf2 = Integer.valueOf(J0 != null ? J0.k : 0);
        p4rVar.getClass();
        p4r.b(o, valueOf, valueOf2, str);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        yno0 yno0Var = this.b;
        Rect rect = yno0Var.K;
        rect.setEmpty();
        yno0Var.G.getLocalVisibleRect(rect);
        if (rect.top > 0) {
            int layoutPosition = yno0Var.getLayoutPosition();
            ViewParent parent = yno0Var.itemView.getParent();
            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
            if (recyclerView != null) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.K(layoutPosition, 0);
                }
            }
        }
        yno0Var.G.setTextIsSelectable(false);
        yno0Var.G.setTextIsSelectableInFullExcerptType(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
