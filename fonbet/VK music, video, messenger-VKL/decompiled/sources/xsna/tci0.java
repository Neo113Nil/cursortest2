package xsna;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SelectionDecoration.kt */
/* loaded from: classes2.dex */
public final class tci0 implements Drawable.Callback {
    public final /* synthetic */ vci0 b;

    public tci0(vci0 vci0Var) {
        this.b = vci0Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        RecyclerView recyclerView = this.b.k.get();
        if (recyclerView != null) {
            recyclerView.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
