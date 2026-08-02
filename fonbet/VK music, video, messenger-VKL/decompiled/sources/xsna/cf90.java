package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagingOnLayoutChangeListenerWrapper.kt */
/* loaded from: classes3.dex */
public final class cf90 implements View.OnLayoutChangeListener {
    public final df90 b;

    public cf90(df90 df90Var) {
        this.b = df90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return cf90.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.b, ((cf90) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        if (recyclerView != null && recyclerView.isLaidOut()) {
            if (i7 - i5 == i3 - i && i8 - i6 == i4 - i2) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            this.b.e(adapter != null ? adapter.getItemCount() : 0, gkf0.a(recyclerView), gkf0.b(recyclerView), 0);
        }
    }
}
