package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;

/* loaded from: classes15.dex */
public final class gmg implements vji0 {
    public final /* synthetic */ DashboardV3Fragment a;

    public gmg(DashboardV3Fragment dashboardV3Fragment) {
        this.a = dashboardV3Fragment;
    }

    @Override // defpackage.vji0
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        z = this.a.isRecyclerScrollEnabled;
        return !z;
    }

    @Override // defpackage.vji0
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // defpackage.vji0
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
