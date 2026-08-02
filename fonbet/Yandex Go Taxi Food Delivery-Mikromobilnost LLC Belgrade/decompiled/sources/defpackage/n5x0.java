package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes15.dex */
public final class n5x0 {
    public final RecyclerView a;
    public final RecyclerView b;
    public final m5x0 c;
    public final krv d;
    public int e = -1;

    public n5x0(RecyclerView recyclerView, RecyclerView recyclerView2, m5x0 m5x0Var) {
        this.a = recyclerView;
        this.b = recyclerView2;
        this.c = m5x0Var;
        Context context = recyclerView2.getContext();
        krv krvVar = new krv();
        krvVar.b = 0;
        Paint paint = new Paint();
        krvVar.a = paint;
        paint.setColor(fxa1.c(jng0.messagingCommonAccentColor, context).data);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(gvg0.emoji_sticker_tab_indicator_height));
        krvVar.c = context.getResources().getDimensionPixelSize(gvg0.emoji_sticker_tab_indicator_padding);
        this.d = krvVar;
        recyclerView2.addItemDecoration(krvVar);
        recyclerView.addOnScrollListener(new l5x0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r0 > r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r0 < r9) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(n5x0 n5x0Var) {
        x0 childViewHolder;
        int F;
        int l;
        int i;
        int i2;
        RecyclerView recyclerView = n5x0Var.a;
        RecyclerView recyclerView2 = n5x0Var.b;
        RecyclerView.Adapter adapter = recyclerView2.getAdapter();
        if (((LinearLayoutManager) recyclerView2.getLayoutManager()) == null || adapter == null || adapter.getItemCount() == 0) {
            return;
        }
        z83.h(null, ((LinearLayoutManager) recyclerView.getLayoutManager()).J == 1);
        float computeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent();
        float computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int height = recyclerView.getHeight();
        int i3 = (int) ((computeVerticalScrollOffset / computeVerticalScrollRange) * height);
        if (i3 <= height) {
            height = i3;
        }
        View findChildViewUnder = recyclerView.findChildViewUnder(0.0f, height);
        if (findChildViewUnder == null || (childViewHolder = recyclerView.getChildViewHolder(findChildViewUnder)) == null || (F = childViewHolder.F()) == -1 || (l = n5x0Var.c.l(F)) == n5x0Var.e) {
            return;
        }
        n5x0Var.e = l;
        if (l == -1) {
            return;
        }
        n5x0Var.b();
        RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
        if (linearLayoutManager == null || adapter2 == null || adapter2.getItemCount() == 0) {
            return;
        }
        int H1 = linearLayoutManager.H1();
        int L1 = linearLayoutManager.L1();
        int i4 = (L1 - H1) + 1;
        int i5 = n5x0Var.e;
        if (i5 >= H1) {
            if (i5 > L1) {
                i = Math.min(adapter2.getItemCount() - 1, n5x0Var.e + i4);
                i2 = n5x0Var.e;
            } else {
                i = -1;
            }
            if (i != -1) {
                recyclerView2.smoothScrollToPosition(i);
                return;
            }
            return;
        }
        i = Math.max(0, i5 - i4);
        i2 = n5x0Var.e;
    }

    public final void b() {
        RecyclerView.Adapter adapter = this.b.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return;
        }
        krv krvVar = this.d;
        int i = krvVar.b;
        krvVar.b = this.e;
        adapter.notifyItemChanged(i);
        adapter.notifyItemChanged(this.e);
    }
}
