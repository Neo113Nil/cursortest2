package xsna;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: UiTrackingRecyclerListener.kt */
/* loaded from: classes17.dex */
public final class w1q0 extends RecyclerView.t {
    public final LinearLayoutManager b;
    public final androidx.recyclerview.widget.o0 c;
    public final MobileOfficialAppsCoreNavStat$EventScreen d;
    public final a5 e;
    public boolean f;

    public w1q0(LinearLayoutManager linearLayoutManager, atn0 atn0Var, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, a5 a5Var) {
        this.b = linearLayoutManager;
        this.c = atn0Var;
        this.d = mobileOfficialAppsCoreNavStat$EventScreen;
        this.e = a5Var;
        new Handler(Looper.getMainLooper()).post(new hod(this, 18));
    }

    public final void l() {
        if (this.f) {
            return;
        }
        this.f = true;
        UiTracker.i.j(new UiTrackingScreen(this.d), false);
    }

    public final void m() {
        if (this.f) {
            return;
        }
        androidx.recyclerview.widget.o0 o0Var = this.c;
        LinearLayoutManager linearLayoutManager = this.b;
        View findSnapView = o0Var.findSnapView(linearLayoutManager);
        if (findSnapView != null) {
            UiTrackingScreen uiTrackingScreen = (UiTrackingScreen) this.e.invoke(Integer.valueOf(linearLayoutManager.getPosition(findSnapView)));
            if (uiTrackingScreen != null) {
                UiTracker.i.j(uiTrackingScreen, true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            m();
        }
    }
}
