package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class lip0 extends RecyclerView.g {
    public boolean a;
    public boolean b = true;
    public final /* synthetic */ mip0 c;

    public lip0(mip0 mip0Var) {
        this.c = mip0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView.e layoutManager;
        this.a = i == 2 && (layoutManager = recyclerView.getLayoutManager()) != null && layoutManager.A0();
        mip0 mip0Var = this.c;
        if (mip0Var.f || i == 0) {
            return;
        }
        mip0Var.f = true;
        recyclerView.removeOnLayoutChangeListener(mip0Var.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View childAt;
        int scrollState = recyclerView.getScrollState();
        if (scrollState == 1 || this.a) {
            this.b = true;
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if ((adapter instanceof cfx) && (((u0x) a.S(0, ((cfx) adapter).f())) instanceof hla0) && (childAt = recyclerView.getChildAt(0)) != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == 1 && scrollState == 0 && childAt.getTop() == recyclerView.getPaddingTop()) {
                this.b = true;
                return;
            }
            if (childAdapterPosition != 0) {
                this.b = false;
                return;
            }
            if (this.b || i2 >= 0) {
                return;
            }
            int bottom = childAt.getBottom() - recyclerView.getPaddingTop();
            if (bottom == 0 && scrollState == 0) {
                this.b = true;
            } else {
                if (bottom <= 0 || scrollState != 2) {
                    return;
                }
                recyclerView.stopScroll();
                recyclerView.scrollBy(0, bottom);
                this.b = true;
            }
        }
    }
}
