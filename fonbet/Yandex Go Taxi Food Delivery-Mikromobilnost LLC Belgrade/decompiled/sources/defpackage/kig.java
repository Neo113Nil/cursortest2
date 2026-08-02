package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardCollapsedAnimation$CollapsedState;

/* loaded from: classes3.dex */
public final class kig extends RecyclerView.g {
    public final /* synthetic */ lig a;

    public kig(lig ligVar) {
        this.a = ligVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        lig ligVar = this.a;
        int i2 = ligVar.h;
        int a = ligVar.a();
        if (i == 0 && a > (-i2) && ligVar.g == DashboardCollapsedAnimation$CollapsedState.COLLAPSED) {
            RecyclerView recyclerView2 = ligVar.a;
            if (recyclerView2.canScrollVertically(-1) && recyclerView2.canScrollVertically(1)) {
                recyclerView.smoothScrollBy(0, ligVar.a() + i2);
            }
        }
        super.onScrollStateChanged(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.a.b();
    }
}
