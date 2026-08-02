package xsna;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.List;

/* compiled from: MultiCameraDragCallback.kt */
/* loaded from: classes16.dex */
public final class e440 extends r.d {
    public final f640 e;
    public final f440 f;

    public e440(f640 f640Var, f440 f440Var) {
        this.e = f640Var;
        this.f = f440Var;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        if (e0Var instanceof x340) {
            return 0;
        }
        return r.d.l(48, 0);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void m(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f, float f2, int i, boolean z) {
        float left = e0Var.itemView.getLeft() + f;
        float width = e0Var.itemView.getWidth() + left;
        if (left <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width >= recyclerView.getWidth()) {
            return;
        }
        super.m(canvas, recyclerView, e0Var, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        List<Item> y0;
        if (e0Var2 instanceof x340) {
            return false;
        }
        int adapterPosition = e0Var.getAdapterPosition();
        int adapterPosition2 = e0Var2.getAdapterPosition();
        f640 f640Var = this.e;
        if (f640Var != null && (y0 = f640Var.y0()) != 0) {
            Collections.swap(y0, adapterPosition, adapterPosition2);
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyItemMoved(adapterPosition, adapterPosition2);
        }
        f440 f440Var = this.f;
        if (f440Var == null) {
            return true;
        }
        f440Var.J6(adapterPosition, adapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void p(RecyclerView.e0 e0Var) {
    }
}
