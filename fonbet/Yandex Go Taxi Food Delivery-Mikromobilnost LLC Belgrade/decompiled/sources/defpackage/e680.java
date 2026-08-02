package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.shortcuts.impl.view.a;
import java.util.List;
import ru.yandex.taxi.recycler.SpannedGridLayoutManager;

/* loaded from: classes13.dex */
public final class e680 extends a {
    @Override // com.yandex.go.shortcuts.impl.view.a, androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        if (!(recyclerView.getChildViewHolder(view) instanceof co70)) {
            super.c(rect, view, recyclerView, kVar);
        } else {
            int i = (-this.N) / 2;
            rect.set(i, 0, i, 0);
        }
    }

    @Override // com.yandex.go.shortcuts.impl.view.a, androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        if (this.C) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            bys bysVar = adapter instanceof bys ? (bys) adapter : null;
            if (bysVar != null) {
                RecyclerView.e layoutManager = recyclerView.getLayoutManager();
                SpannedGridLayoutManager spannedGridLayoutManager = layoutManager instanceof SpannedGridLayoutManager ? (SpannedGridLayoutManager) layoutManager : null;
                if (spannedGridLayoutManager != null) {
                    int paddingTop = recyclerView.getPaddingTop();
                    List list = bysVar.x.f;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = list.get(i);
                        if (!(obj instanceof rr00) && !(obj instanceof t3s0)) {
                            break;
                        }
                        Rect L1 = spannedGridLayoutManager.L1(i);
                        if (L1 != null) {
                            paddingTop = L1.height() + paddingTop;
                        }
                    }
                    this.M = paddingTop - this.N;
                }
            }
        }
        super.d(canvas, recyclerView, kVar);
    }
}
