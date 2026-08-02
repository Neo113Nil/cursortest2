package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ToolbarAnimatorListener.kt */
/* loaded from: classes6.dex */
public final class z2p0 extends RecyclerView.t {
    public static final int f = cn70.b(16);
    public final View b;
    public final View c;
    public final View d;
    public int e;

    public z2p0(View view, View view2, View view3) {
        this.b = view;
        this.c = view2;
        this.d = view3;
        f4m.j(view);
        f4m.j(view2);
        if (view3 != null) {
            view3.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.e + i2;
        this.e = i3;
        View view = this.d;
        View view2 = this.c;
        View view3 = this.b;
        int i4 = f;
        if (i3 > i4) {
            view3.setAlpha(1.0f);
            view3.setVisibility(0);
            view2.setAlpha(1.0f);
            view2.setVisibility(0);
            if (view != null) {
                f4m.j(view);
                return;
            }
            return;
        }
        if (i3 <= 0) {
            f4m.j(view3);
            f4m.j(view2);
            if (view != null) {
                view.setAlpha(1.0f);
                view.setVisibility(0);
                return;
            }
            return;
        }
        float f2 = i3 / i4;
        float f3 = 1.0f / f2;
        view3.setAlpha(f2);
        view3.setVisibility(0);
        view2.setAlpha(f2);
        view2.setVisibility(0);
        if (view != null) {
            view.setAlpha(f3);
            view.setVisibility(0);
        }
    }
}
