package xsna;

import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kaz0 extends RecyclerView {
    public a b;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrollStateChanged(int i) {
        a aVar;
        super.onScrollStateChanged(i);
        if (i == 0 && (aVar = this.b) != null) {
            ((zey0) aVar).a();
        }
    }

    public void setMoveStopListener(@Nullable a aVar) {
        this.b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollBy(int i, int i2) {
        super.smoothScrollBy(i, i2, new AccelerateDecelerateInterpolator());
    }
}
