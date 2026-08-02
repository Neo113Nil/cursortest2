package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import xsna.z6w0;

/* compiled from: VmojiCharacterLoadingHolders.kt */
/* loaded from: classes7.dex */
public abstract class c7w0<I extends z6w0> extends u6w0<I> {
    public c7w0(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        View view = this.itemView;
        ShimmerFrameLayout shimmerFrameLayout = view instanceof ShimmerFrameLayout ? (ShimmerFrameLayout) view : null;
        if (shimmerFrameLayout != null) {
            int f = e3m.f(R.attr.vk_legacy_skeleton_foreground_from, view.getContext());
            int f2 = e3m.f(R.attr.vk_legacy_skeleton_foreground_to, this.itemView.getContext());
            Shimmer.c c = new Shimmer.c().c(true);
            c.k(f);
            c.a.d = f2;
            shimmerFrameLayout.b(c.a());
        }
    }

    @Override // xsna.vfz
    /* renamed from: h6, reason: merged with bridge method [inline-methods] */
    public void W5(I i) {
    }
}
