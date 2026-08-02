package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import xsna.nzl;

/* compiled from: BottomSheetCommentsFragment.kt */
/* loaded from: classes4.dex */
public final class s78 extends ModalBottomSheetBehavior.d {
    public final /* synthetic */ BottomSheetCommentsFragment a;
    public final /* synthetic */ ModalBottomSheetBehavior<View> b;
    public final /* synthetic */ LinearLayoutManager c;

    public s78(BottomSheetCommentsFragment bottomSheetCommentsFragment, ModalBottomSheetBehavior<View> modalBottomSheetBehavior, LinearLayoutManager linearLayoutManager) {
        this.a = bottomSheetCommentsFragment;
        this.b = modalBottomSheetBehavior;
        this.c = linearLayoutManager;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        u3g0 u3g0Var;
        int i;
        int i2;
        nzl.a aVar = BottomSheetCommentsFragment.f1;
        BottomSheetCommentsFragment bottomSheetCommentsFragment = this.a;
        k6s0 Y4 = bottomSheetCommentsFragment.Ro().Y4();
        if (Y4 != null) {
            Y4.a(view, f);
        }
        int i3 = ify.a;
        if (ify.e(ify.c) || (u3g0Var = bottomSheetCommentsFragment.X) == null) {
            return;
        }
        int i4 = BottomSheetCommentsFragment.g1;
        RecyclerPaginatedView recyclerPaginatedView = bottomSheetCommentsFragment.W;
        int top = recyclerPaginatedView != null ? recyclerPaginatedView.getTop() : 0;
        LinearLayoutManager linearLayoutManager = this.c;
        int x = linearLayoutManager.x();
        if (x >= 0) {
            int i5 = 0;
            while (true) {
                View findViewByPosition = linearLayoutManager.findViewByPosition(i5);
                if (findViewByPosition != null && findViewByPosition.getMeasuredHeight() >= i4) {
                    i = Math.min(findViewByPosition.getBottom(), iah0.a(56)) + top;
                    break;
                } else if (i5 == x) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        i = i4 + top;
        ColorDrawable So = bottomSheetCommentsFragment.So();
        h88 h88Var = (h88) bottomSheetCommentsFragment.c1.getValue();
        if (h88Var == null || !h88Var.b()) {
            i2 = 0;
        } else {
            if (Float.isNaN(f)) {
                f = 0.0f;
            }
            i2 = swe0.h(l8g.b(Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f) + 1), 1.0f) * 0.6f), new k9x(0, 255, 1));
        }
        So.setAlpha(i2);
        u3g0Var.A(Math.max(i - (u3g0Var.e != null ? r1.getTop() : 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        bottomSheetCommentsFragment.To();
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        nzl.a aVar = BottomSheetCommentsFragment.f1;
        BottomSheetCommentsFragment bottomSheetCommentsFragment = this.a;
        k6s0 Y4 = bottomSheetCommentsFragment.Ro().Y4();
        if (Y4 != null) {
            Y4.b(i, view);
        }
        if (i == 4 || i == 5) {
            if (i == 5 || this.b.j) {
                bottomSheetCommentsFragment.finish();
                bottomSheetCommentsFragment.tn();
                mdg mdgVar = bottomSheetCommentsFragment.S;
                if (mdgVar != null) {
                    mdgVar.Q7();
                }
            }
        }
    }
}
