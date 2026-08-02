package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class b261 implements zo31 {
    public final /* synthetic */ int a;
    public final ShimmerFrameLayout b;
    public final ShimmerFrameLayout c;

    public /* synthetic */ b261(ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, int i) {
        this.a = i;
        this.b = shimmerFrameLayout;
        this.c = shimmerFrameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
