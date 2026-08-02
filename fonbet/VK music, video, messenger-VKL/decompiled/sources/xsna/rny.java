package xsna;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.sharing.core.view.grid.LayoutMode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: LayoutChangeItemAnimator.kt */
/* loaded from: classes5.dex */
public final class rny extends androidx.recyclerview.widget.g {
    public rny() {
        this.c = 200L;
        this.d = 200L;
        this.e = 200L;
        this.f = 250L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H(RecyclerView.e0 e0Var, boolean z) {
        if (e0Var instanceof zxt0) {
            zxt0 zxt0Var = (zxt0) e0Var;
            if (z) {
                zxt0Var.r5();
            } else {
                zxt0Var.R4();
            }
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final boolean g(RecyclerView.e0 e0Var, List<Object> list) {
        if (list.isEmpty()) {
            return true;
        }
        List<Object> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof LayoutMode) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final void j(RecyclerView.e0 e0Var) {
        super.j(e0Var);
        e0Var.itemView.animate().cancel();
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        e0Var.itemView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean x(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
        if (e0Var == e0Var2) {
            h(e0Var);
            return false;
        }
        View view = e0Var.itemView;
        View view2 = e0Var2.itemView;
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setAlpha(1.0f);
        view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        H(e0Var, false);
        H(e0Var2, false);
        long j = 2;
        ViewPropertyAnimator withEndAction = view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(this.f / j).withEndAction(new qny(view, this, e0Var, 0));
        ViewPropertyAnimator withEndAction2 = view2.animate().alpha(1.0f).setDuration(this.f / j).setStartDelay(this.f / j).withEndAction(new wm8(view2, this, e0Var2, 4));
        withEndAction.start();
        withEndAction2.start();
        return true;
    }
}
