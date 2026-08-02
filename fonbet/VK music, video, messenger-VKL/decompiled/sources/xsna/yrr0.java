package xsna;

import android.view.View;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: VhLoading.kt */
/* loaded from: classes2.dex */
public final class yrr0 extends vfz<ftz> {
    public static final /* synthetic */ int m = 0;
    public final ShimmerFrameLayout l;

    public yrr0(View view) {
        super(view);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.skeleton);
        this.l = shimmerFrameLayout;
        h6(R.id.header_icon1);
        h6(R.id.header_icon2);
        h6(R.id.header_icon3);
        h6(R.id.header_icon4);
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(true).i();
        cVar.k(b6g.a(R.attr.vk_legacy_im_bubble_incoming, this.itemView.getContext()));
        cVar.a.d = b6g.a(R.attr.vk_legacy_loader_track_fill, this.itemView.getContext());
        shimmerFrameLayout.b(((Shimmer.c) cVar.d()).a());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(ftz ftzVar) {
        Integer num = ftzVar.b;
        if (num != null) {
            int intValue = num.intValue();
            if (4 <= intValue) {
                intValue = 4;
            }
            i6(new int[]{R.id.skeleton_row_2, R.id.skeleton_row_3, R.id.skeleton_row_4}, true);
            if (intValue == 0 || intValue == 1) {
                i6(Arrays.copyOf(new int[]{R.id.skeleton_row_2, R.id.skeleton_row_3, R.id.skeleton_row_4}, 3), false);
            } else if (intValue == 2) {
                i6(Arrays.copyOf(new int[]{R.id.skeleton_row_3, R.id.skeleton_row_4}, 2), false);
            } else if (intValue == 3) {
                i6(Arrays.copyOf(new int[]{R.id.skeleton_row_4}, 1), false);
            }
        }
        this.l.d();
    }

    public final void h6(int i) {
        ShimmerFrameLayout shimmerFrameLayout = this.l;
        VKAvatarView.Z0((VKAvatarView) shimmerFrameLayout.findViewById(i), null, dhr0.w(R.drawable.skeleton_member_icon_background, shimmerFrameLayout.getContext()), null, null, 13);
    }

    public final void i6(int[] iArr, boolean z) {
        for (int i : iArr) {
            awt0.v(this.l.findViewById(i), z);
        }
    }
}
