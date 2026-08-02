package xsna;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.photos.root.view.AppBarLayoutNoEmptyScrollBehavior;

/* compiled from: AppBarLayoutNoEmptyScrollBehavior.kt */
/* loaded from: classes4.dex */
public final class n13 {
    public static final void a(AppBarLayout appBarLayout, io60 io60Var, gzs gzsVar) {
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar == null) {
            return;
        }
        fVar.c(new AppBarLayoutNoEmptyScrollBehavior(appBarLayout, io60Var, gzsVar));
    }
}
