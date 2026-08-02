package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.im.ui.views.dialogs.DialogSkeletonView;
import com.vk.toggle.features.ImFeatures;

/* compiled from: VhDialogSkeleton.kt */
/* loaded from: classes2.dex */
public final class arr0 extends RecyclerView.e0 implements hqr0 {
    public static final /* synthetic */ int m = 0;
    public final DialogSkeletonView l;

    public arr0(DialogSkeletonView dialogSkeletonView) {
        super(dialogSkeletonView);
        this.l = dialogSkeletonView;
    }

    @Override // xsna.hqr0
    public final void b() {
        DialogSkeletonView dialogSkeletonView = this.l;
        dialogSkeletonView.getClass();
        ImFeatures imFeatures = ImFeatures.IM_CHATS_SKELETONS_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            dialogSkeletonView.g.b();
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout = dialogSkeletonView.d;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        shimmerFrameLayout.d();
    }

    @Override // xsna.hqr0
    public final void c() {
        this.l.a();
    }
}
