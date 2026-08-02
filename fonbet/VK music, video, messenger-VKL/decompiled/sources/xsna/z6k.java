package xsna;

import android.content.Context;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Pair;

/* compiled from: CreateChatDecoration.kt */
/* loaded from: classes2.dex */
public final class z6k extends m2i0 {
    public final Object m;

    public z6k(Context context, Map<Integer, String> map) {
        super(context, false, true, (int) (cn70.a() * 0.5f), 40);
        this.m = pn00.k(new Pair(0, 0), new Pair(1, 1), new Pair(3, 1), new Pair(2, 2));
        SparseArray<CharSequence> sparseArray = new SparseArray<>(map.size());
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            sparseArray.put(entry.getKey().intValue(), entry.getValue());
        }
        this.h = sparseArray;
    }

    @Override // xsna.m2i0
    public final CharSequence l(int i, RecyclerView recyclerView, boolean z) {
        return this.h.get(recyclerView.getAdapter().getItemViewType(i));
    }

    @Override // xsna.m2i0
    public final boolean m(RecyclerView recyclerView, int i) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (i < 1 || i >= adapter.getItemCount()) {
            return false;
        }
        int itemViewType = adapter.getItemViewType(i - 1);
        int itemViewType2 = adapter.getItemViewType(i);
        return itemViewType != itemViewType2 && zik0.a(this.h, itemViewType2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.m2i0
    public final boolean n(RecyclerView recyclerView, int i) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (i < 0 || i >= adapter.getItemCount() - 1) {
            return false;
        }
        int itemViewType = adapter.getItemViewType(i);
        int itemViewType2 = adapter.getItemViewType(i + 1);
        Integer valueOf = Integer.valueOf(itemViewType);
        ?? r0 = this.m;
        return !epx.f(r0.get(valueOf), r0.get(Integer.valueOf(itemViewType2)));
    }
}
