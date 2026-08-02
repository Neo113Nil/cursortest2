package defpackage;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.w;
import ru.yandex.taxi.widget.recycler.SnappyLinearLayoutManager;

/* loaded from: classes6.dex */
public final class f2t0 extends w {
    public final /* synthetic */ SnappyLinearLayoutManager p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2t0(SnappyLinearLayoutManager snappyLinearLayoutManager, Context context) {
        super(context);
        this.p = snappyLinearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final PointF a(int i) {
        return this.p.d(i);
    }
}
