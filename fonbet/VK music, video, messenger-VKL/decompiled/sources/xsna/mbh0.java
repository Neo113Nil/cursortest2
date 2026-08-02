package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.ui.holders.video.VideoHidingToolbarVh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mbh0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mbh0(View view, wh50 wh50Var) {
        this.c = view;
        this.d = wh50Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.d;
                View view = this.c;
                wh50Var.setValue(Boolean.valueOf(view.isShown() && view.isAttachedToWindow()));
                break;
            default:
                VideoHidingToolbarVh videoHidingToolbarVh = (VideoHidingToolbarVh) this.d;
                AppBarLayout appBarLayout = videoHidingToolbarVh.f;
                ViewGroup.LayoutParams layoutParams = appBarLayout != null ? appBarLayout.getLayoutParams() : null;
                CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
                if (fVar != null) {
                    fVar.c(this.c.getVisibility() != 0 ? videoHidingToolbarVh.l : null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mbh0(VideoHidingToolbarVh videoHidingToolbarVh, View view) {
        this.d = videoHidingToolbarVh;
        this.c = view;
    }
}
