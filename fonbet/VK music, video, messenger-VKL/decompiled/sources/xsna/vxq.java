package xsna;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FeedCompositeDecoration.kt */
/* loaded from: classes4.dex */
public final class vxq extends RecyclerView.n implements too0 {
    public final ArrayList<lyq> b = new ArrayList<>();

    @Override // xsna.too0
    public final void Ng() {
        Iterator<lyq> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().Ng();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.e0 childViewHolder;
        ArrayList<lyq> arrayList = this.b;
        Iterator<lyq> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null && (childViewHolder = recyclerView.getChildViewHolder(childAt)) != null) {
                Iterator<lyq> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().Eb(canvas, childAt, childViewHolder);
                }
            }
        }
        Iterator<lyq> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            it3.next().Xd(canvas);
        }
    }
}
