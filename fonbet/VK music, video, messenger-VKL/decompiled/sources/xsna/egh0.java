package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.utils.recyclerview.carousel.CenterLayoutManager;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: ScrollReporter.kt */
/* loaded from: classes2.dex */
public final class egh0 extends RecyclerView.t {
    public final int b = 1;
    public final LinkedHashSet c = new LinkedHashSet();
    public int d;

    /* compiled from: ScrollReporter.kt */
    public interface a {
        void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        View findViewByPosition;
        if (i == 0) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            CenterLayoutManager centerLayoutManager = layoutManager instanceof CenterLayoutManager ? (CenterLayoutManager) layoutManager : null;
            if (centerLayoutManager == null) {
                return;
            }
            float x = recyclerView.getX() + (recyclerView.getWidth() / 2);
            int s = centerLayoutManager.s();
            int w = centerLayoutManager.w();
            while (s <= w && (findViewByPosition = centerLayoutManager.findViewByPosition(s)) != null) {
                if (findViewByPosition.getX() <= x && x < findViewByPosition.getX() + findViewByPosition.getWidth()) {
                    break;
                } else {
                    s++;
                }
            }
            s = -1;
            if (s == this.b) {
                this.d = 0;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this.d);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.d += i;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this.d);
        }
    }
}
