package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.shortcuts.impl.view.adapter.r;
import java.util.List;
import ru.yandex.taxi.recycler.SpannedGridLayoutManager;

/* loaded from: classes6.dex */
public final class o3q0 extends RecyclerView.g {
    public Boolean a;
    public final /* synthetic */ r b;

    public o3q0(r rVar) {
        this.b = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        r11 = r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r2 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r11 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        r12 = r12.T;
        r11 = r11.booleanValue();
        r13 = java.lang.Math.max(0, java.lang.Math.min(100, r0));
        r12 = ((ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView) r12.a).presenter;
        r12 = (com.yandex.go.shortcuts.impl.analytic.a) r12.D;
        r12.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r11 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        r11 = com.yandex.go.shortcuts.impl.analytic.ShortcutAnalyticsImpl$ScrollDirection.LEFT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        r12.e(r11, r2, r13, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        r11 = com.yandex.go.shortcuts.impl.analytic.ShortcutAnalyticsImpl$ScrollDirection.RIGHT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int viewLayoutPosition;
        r rVar = this.b;
        RecyclerView recyclerView2 = rVar.W;
        if (i == 0) {
            boolean canScrollHorizontally = recyclerView2.canScrollHorizontally(-1);
            boolean canScrollHorizontally2 = recyclerView2.canScrollHorizontally(1);
            if (canScrollHorizontally || canScrollHorizontally2) {
                SpannedGridLayoutManager spannedGridLayoutManager = rVar.V;
                int d0 = spannedGridLayoutManager.d0();
                List list = rVar.S.x.f;
                int right = recyclerView2.getRight();
                String str = null;
                int i3 = d0 - 1;
                String str2 = null;
                while (true) {
                    if (-1 >= i3) {
                        i2 = 0;
                        break;
                    }
                    View c0 = spannedGridLayoutManager.c0(i3);
                    if (c0 != null) {
                        viewLayoutPosition = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
                        if (viewLayoutPosition < 0 || viewLayoutPosition >= list.size()) {
                            break;
                        }
                        e6v e6vVar = (e6v) list.get(viewLayoutPosition);
                        if (e6vVar instanceof ex00) {
                            str2 = ((ex00) e6vVar).f;
                        }
                        if (e6vVar instanceof ga5) {
                            str = ((ga5) e6vVar).getBase().j;
                            int j0 = spannedGridLayoutManager.j0(c0);
                            int l0 = spannedGridLayoutManager.l0(c0);
                            if (l0 > 0 && j0 < right) {
                                i2 = ((right - j0) * 100) / l0;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i3--;
                }
                jst.e.k(new IndexOutOfBoundsException(oyr.h(viewLayoutPosition, list.size(), "Invalid index ", ", size is  ")), "ShortcutsView: adapter's current list is not consistent with layout manager");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z = i > 0;
        Boolean bool = this.a;
        if (bool == null || !bool.equals(Boolean.valueOf(z))) {
            this.a = Boolean.valueOf(z);
        }
    }
}
