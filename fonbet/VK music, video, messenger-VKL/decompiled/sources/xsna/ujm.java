package xsna;

import android.view.ViewGroup;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.im.ui.views.dialogs.DialogSkeletonView;
import com.vk.toggle.features.ImFeatures;

/* compiled from: DialogSkeletonViewHolder.kt */
/* loaded from: classes18.dex */
public final class ujm extends vfz<s990> {
    public static final /* synthetic */ int n = 0;
    public final DialogSkeletonView l;
    public boolean m;

    /* compiled from: DialogSkeletonViewHolder.kt */
    public static final class a {
        public static ujm a(ViewGroup viewGroup) {
            DialogSkeletonView dialogSkeletonView = new DialogSkeletonView(viewGroup.getContext(), null, 6);
            dialogSkeletonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new ujm(dialogSkeletonView);
        }
    }

    public ujm(DialogSkeletonView dialogSkeletonView) {
        super(dialogSkeletonView);
        this.l = dialogSkeletonView;
    }

    @Override // xsna.vfz
    public final void V5() {
        DialogSkeletonView dialogSkeletonView = this.l;
        dialogSkeletonView.getClass();
        ImFeatures imFeatures = ImFeatures.IM_CHATS_SKELETONS_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            dialogSkeletonView.g.b();
        } else {
            ShimmerFrameLayout shimmerFrameLayout = dialogSkeletonView.d;
            if (shimmerFrameLayout == null) {
                shimmerFrameLayout = null;
            }
            shimmerFrameLayout.d();
        }
        dialogSkeletonView.postDelayed(new oh(this, 2), 300L);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(s990 s990Var) {
        boolean z = this.m;
        boolean z2 = s990Var.b;
        if (z != z2) {
            this.l.e.requestLayout();
        }
        this.m = z2;
    }

    @Override // xsna.vfz
    public final void a6() {
        this.l.a();
    }
}
