package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.lists.RecyclerPaginatedView;
import org.webrtc.HardwareVideoEncoderV2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class duu implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ duu(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        switch (this.b) {
            case 0:
                ((HardwareVideoEncoderV2) this.d).lambda$deliverEncodedImage$8(this.c);
                break;
            default:
                final HorizontalListVh horizontalListVh = (HorizontalListVh) this.d;
                RecyclerPaginatedView recyclerPaginatedView = horizontalListVh.n;
                if (recyclerPaginatedView == null) {
                    recyclerPaginatedView = null;
                }
                RecyclerView.o layoutManager = (recyclerPaginatedView == null || (recyclerView2 = recyclerPaginatedView.getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                final int i = this.c;
                View findViewByPosition = linearLayoutManager != null ? linearLayoutManager.findViewByPosition(i) : null;
                RecyclerPaginatedView recyclerPaginatedView2 = horizontalListVh.n;
                if (recyclerPaginatedView2 == null) {
                    recyclerPaginatedView2 = null;
                }
                final int width = findViewByPosition != null ? (((recyclerPaginatedView2 == null || (recyclerView = recyclerPaginatedView2.getRecyclerView()) == null) ? iah0.f().widthPixels : recyclerView.getWidth()) - findViewByPosition.getWidth()) / 2 : 0;
                if (i >= 0) {
                    RecyclerPaginatedView recyclerPaginatedView3 = horizontalListVh.n;
                    RecyclerPaginatedView recyclerPaginatedView4 = recyclerPaginatedView3 != null ? recyclerPaginatedView3 : null;
                    if (recyclerPaginatedView4 != null) {
                        recyclerPaginatedView4.post(new Runnable() { // from class: xsna.oev
                            @Override // java.lang.Runnable
                            public final void run() {
                                RecyclerView recyclerView3;
                                RecyclerPaginatedView recyclerPaginatedView5 = HorizontalListVh.this.n;
                                if (recyclerPaginatedView5 == null) {
                                    recyclerPaginatedView5 = null;
                                }
                                RecyclerView.o layoutManager2 = (recyclerPaginatedView5 == null || (recyclerView3 = recyclerPaginatedView5.getRecyclerView()) == null) ? null : recyclerView3.getLayoutManager();
                                LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                                if (linearLayoutManager2 != null) {
                                    linearLayoutManager2.K(i, width);
                                }
                            }
                        });
                        break;
                    }
                }
                break;
        }
    }
}
