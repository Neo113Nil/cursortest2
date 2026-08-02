package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.divider.VkDivider;
import com.vk.core.view.components.group.header.VkGroupHeader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: CreateChatGroupHeaderDecoration.kt */
/* loaded from: classes2.dex */
public final class a7k extends RecyclerView.n {
    public final Context b;
    public final boolean c = true;
    public final Object d = pn00.k(new Pair(0, 0), new Pair(1, 1), new Pair(3, 1), new Pair(2, 2));
    public final LinkedHashMap e;
    public final VkDivider f;
    public final bpn0 g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final bpn0 l;
    public final bpn0 m;

    public a7k(Context context, Map map) {
        this.b = context;
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            VkGroupHeader vkGroupHeader = new VkGroupHeader(this.b, null, 6);
            vkGroupHeader.setSize(VkGroupHeader.Size.Small);
            vkGroupHeader.setTitle(new VkGroupHeader.d(str, null, null, null, 0, null, 510));
            vkGroupHeader.setShowTopDivider(this.c);
            linkedHashMap.put(key, vkGroupHeader);
        }
        this.e = linkedHashMap;
        VkDivider vkDivider = new VkDivider(this.b, null, 6, 0);
        vkDivider.setAlignment(VkDivider.Alignment.Top);
        this.f = vkDivider;
        this.g = new bpn0(new ncg(this, 12));
        this.h = cn70.b(12);
        this.i = cn70.b(12);
        this.j = cn70.b(8);
        this.k = cn70.b(16);
        this.l = new bpn0(new r5i(this, 2));
        this.m = new bpn0(new ocg(this, 10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.Adapter adapter;
        rect.setEmpty();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (l(recyclerView, childAdapterPosition) && (adapter = recyclerView.getAdapter()) != null) {
            rect.top = this.e.containsKey(Integer.valueOf(adapter.getItemViewType(childAdapterPosition))) ? ((Number) this.l.getValue()).intValue() : ((Number) this.m.getValue()).intValue();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final boolean l(RecyclerView recyclerView, int i) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || i < 1 || i >= adapter.getItemCount()) {
            return false;
        }
        int itemViewType = adapter.getItemViewType(i - 1);
        int itemViewType2 = adapter.getItemViewType(i);
        Integer valueOf = Integer.valueOf(itemViewType);
        ?? r1 = this.d;
        return !epx.f(r1.get(valueOf), r1.get(Integer.valueOf(itemViewType2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.Adapter adapter;
        int save;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i));
            if (l(recyclerView, childAdapterPosition) && (adapter = recyclerView.getAdapter()) != null) {
                VkGroupHeader vkGroupHeader = (VkGroupHeader) this.e.get(Integer.valueOf(adapter.getItemViewType(childAdapterPosition)));
                if (vkGroupHeader != null) {
                    vkGroupHeader.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    vkGroupHeader.layout(0, 0, vkGroupHeader.getMeasuredWidth(), vkGroupHeader.getMeasuredHeight());
                    save = canvas.save();
                    canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (r2.getTop() - ((Number) this.l.getValue()).intValue()) + this.h);
                    try {
                        vkGroupHeader.draw(canvas);
                    } finally {
                    }
                } else if (this.c) {
                    int width = recyclerView.getWidth();
                    int i2 = this.k;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width - (i2 * 2), 1073741824);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((Number) this.g.getValue()).intValue(), 1073741824);
                    VkDivider vkDivider = this.f;
                    vkDivider.measure(makeMeasureSpec, makeMeasureSpec2);
                    vkDivider.layout(0, 0, vkDivider.getMeasuredWidth(), vkDivider.getMeasuredHeight());
                    save = canvas.save();
                    canvas.translate(i2, (r2.getTop() - ((Number) this.m.getValue()).intValue()) + this.i);
                    try {
                        vkDivider.draw(canvas);
                        canvas.restoreToCount(save);
                    } finally {
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
