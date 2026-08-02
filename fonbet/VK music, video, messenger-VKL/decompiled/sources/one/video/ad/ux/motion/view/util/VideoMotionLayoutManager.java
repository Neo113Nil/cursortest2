package one.video.ad.ux.motion.view.util;

import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import xsna.x5r0;

/* compiled from: VideoMotionLayoutManager.kt */
/* loaded from: classes8.dex */
public final class VideoMotionLayoutManager extends LinearLayoutManager {
    public boolean r;

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(View view, int i, int i2) {
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        Object obj = x5r0.a;
        Size size = new Size(getPaddingEnd() + getPaddingStart() + (height - ((int) x5r0.a(this.r ? 56 : 20, 1))), height);
        view.measure(View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size.getHeight(), 1073741824));
    }
}
