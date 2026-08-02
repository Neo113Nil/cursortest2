package xsna;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.design.view.wheel.ImWheelSelectorView;

/* compiled from: ImWheelSelectorView.kt */
/* loaded from: classes2.dex */
public final class uew extends RecyclerView.t {
    public final /* synthetic */ ImWheelSelectorView b;

    public uew(ImWheelSelectorView imWheelSelectorView) {
        this.b = imWheelSelectorView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            int i2 = ImWheelSelectorView.l;
            this.b.e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager layoutManager;
        LinearLayoutManager layoutManager2;
        ImWheelSelectorView imWheelSelectorView = this.b;
        androidx.recyclerview.widget.w wVar = imWheelSelectorView.c;
        layoutManager = imWheelSelectorView.getLayoutManager();
        View findSnapView = wVar.findSnapView(layoutManager);
        if (findSnapView == null) {
            return;
        }
        layoutManager2 = imWheelSelectorView.getLayoutManager();
        int position = layoutManager2.getPosition(findSnapView);
        if (position == imWheelSelectorView.j || position < 0) {
            return;
        }
        imWheelSelectorView.performHapticFeedback(Build.VERSION.SDK_INT >= 29 ? 4 : 1);
        imWheelSelectorView.j = position;
    }
}
