package xsna;

import android.os.Handler;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import java.util.concurrent.TimeUnit;

/* compiled from: FastScroller.kt */
/* loaded from: classes15.dex */
public final class plq extends RecyclerView.t {
    public final /* synthetic */ FastScroller b;

    public plq(FastScroller fastScroller) {
        this.b = fastScroller;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        FastScroller fastScroller = this.b;
        Handler handler = fastScroller.l;
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            handler.postDelayed(new nq4(fastScroller, 5), TimeUnit.SECONDS.toMillis(1L));
        } else {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> izsVar;
        FastScroller fastScroller = this.b;
        if (fastScroller.getHeight() > 0) {
            if (i2 != 0 && !fastScroller.h && !fastScroller.i && (izsVar = fastScroller.r) != null) {
                fastScroller.i = true;
                TextView textView = fastScroller.g;
                if (textView != null) {
                    izsVar.invoke(textView.animate()).setListener(new slq(textView, fastScroller)).start();
                }
            }
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            fastScroller.e();
            if (!fastScroller.j) {
                fastScroller.setPositionFromScroll(computeVerticalScrollOffset);
            }
            fastScroller.setRecyclerViewPosition(computeVerticalScrollOffset);
        }
    }
}
