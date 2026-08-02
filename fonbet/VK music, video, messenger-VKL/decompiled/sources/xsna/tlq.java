package xsna;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.mediapicker.views.FastScrollerView;

/* compiled from: FastScrollerView.kt */
/* loaded from: classes17.dex */
public final class tlq extends RecyclerView.t {
    public final /* synthetic */ FastScrollerView b;

    public tlq(FastScrollerView fastScrollerView) {
        this.b = fastScrollerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        FastScrollerView fastScrollerView = this.b;
        Handler handler = fastScrollerView.f;
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            handler.postDelayed(new pu5(fastScrollerView, 8), 1000L);
        } else {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        FastScrollerView fastScrollerView = this.b;
        if (fastScrollerView.getHeight() > 0) {
            if (i2 != 0) {
                fastScrollerView.b();
            }
            fastScrollerView.d(recyclerView);
        }
    }
}
