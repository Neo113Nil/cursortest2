package xsna;

import android.view.View;
import com.vk.core.view.shimmer.ShimmerFrameLayout;

/* compiled from: View.kt */
/* loaded from: classes6.dex */
public final class amf0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ShimmerFrameLayout b;

    public amf0(ShimmerFrameLayout shimmerFrameLayout) {
        this.b = shimmerFrameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.a();
    }
}
