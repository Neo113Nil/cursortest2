package xsna;

import android.content.Context;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: RedesignUtils.kt */
/* loaded from: classes6.dex */
public final class bmf0 {
    public static final bmf0 a = new bmf0();

    public static Shimmer a(int i, int i2, Context context) {
        int a2 = iah0.a(100);
        int a3 = iah0.a(20);
        if ((i2 & 8) != 0) {
            i = e3m.f(R.attr.vk_ui_skeleton_from, context);
        }
        int f = e3m.f(R.attr.vk_ui_skeleton_to, context);
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(false)).i();
        cVar.k(i);
        cVar.a.d = f;
        Shimmer.c f2 = ((Shimmer.c) cVar.d()).f(a2);
        if (a3 < 0) {
            throw new IllegalArgumentException(lhg.a(a3, "Given invalid height: ").toString());
        }
        f2.a.g = a3;
        return f2.a();
    }

    public static void b(ShimmerFrameLayout shimmerFrameLayout) {
        if (!shimmerFrameLayout.isLaidOut() || shimmerFrameLayout.isLayoutRequested()) {
            shimmerFrameLayout.addOnLayoutChangeListener(new amf0(shimmerFrameLayout));
        } else {
            shimmerFrameLayout.a();
        }
    }
}
