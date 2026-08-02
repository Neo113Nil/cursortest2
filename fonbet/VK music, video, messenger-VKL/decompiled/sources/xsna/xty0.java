package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xty0 extends LinearLayoutManager {
    public final int r;
    public int s;
    public bj50 t;
    public int u;
    public int v;
    public int w;
    public int x;

    public xty0(Context context) {
        super(0, false);
        this.r = (int) tj0.a(1, 4, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(View view, int i, int i2) {
        int height = getHeight();
        int width = getWidth();
        if (height != this.x || width != this.w || this.u <= 0 || this.v <= 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
            float width2 = getWidth() / view.getMeasuredWidth();
            if (width2 > 1.0f) {
                this.u = (int) (width / (Math.floor(width2) + 0.5d));
            } else {
                this.u = (int) (width / 1.5f);
            }
            this.v = height;
            this.w = width;
            this.x = height;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (view != getChildAt(0)) {
            ((ViewGroup.MarginLayoutParams) pVar).leftMargin = c1z0.d(this.s / 2, view.getContext());
        }
        if (view != getChildAt(getChildCount())) {
            ((ViewGroup.MarginLayoutParams) pVar).rightMargin = c1z0.d(this.s / 2, view.getContext());
        }
        int childMeasureSpec = RecyclerView.o.getChildMeasureSpec(width, getWidthMode(), 0, this.u, canScrollHorizontally());
        int heightMode = getHeightMode();
        int i3 = this.r;
        view.measure(childMeasureSpec, RecyclerView.o.getChildMeasureSpec(height, heightMode, i3, height - (i3 * 2), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        bj50 bj50Var = this.t;
        if (bj50Var != null) {
            ((ovy0) bj50Var.c).c();
        }
    }
}
