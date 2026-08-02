package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.view.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DiscoverDefaultTagsProvider.kt */
/* loaded from: classes4.dex */
public final class x1n implements fan {
    public static final int d = cn70.b(6);
    public final r1o0 a;
    public final ArrayList<RecyclerView.e0> b;
    public final m2c0 c;

    public x1n() {
        throw null;
    }

    public x1n(m2c0 m2c0Var) {
        r1o0 r1o0Var = new r1o0(0);
        ArrayList<RecyclerView.e0> arrayList = new ArrayList<>(1);
        this.a = r1o0Var;
        this.b = arrayList;
        this.c = m2c0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fan
    public final View a(int i, FlowLayout flowLayout) {
        rru rruVar = (rru) this.c.b.getValue();
        r1o0 r1o0Var = this.a;
        RecyclerView.e0 recycledView = rruVar.getRecycledView(r1o0Var.getItemViewType(i));
        if (recycledView == null) {
            recycledView = r1o0Var.createViewHolder(flowLayout, r1o0Var.getItemViewType(i));
        }
        this.b.add(recycledView);
        ViewGroup.LayoutParams layoutParams = recycledView.itemView.getLayoutParams();
        FlowLayout.a aVar = layoutParams instanceof FlowLayout.a ? (FlowLayout.a) layoutParams : null;
        if (aVar == null) {
            int i2 = d;
            aVar = new FlowLayout.a(i2, i2);
        }
        recycledView.itemView.setLayoutParams(aVar);
        if (recycledView instanceof m0o0) {
            r1o0Var.bindViewHolder(recycledView, i);
        }
        return recycledView.itemView;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        ArrayList<RecyclerView.e0> arrayList = this.b;
        if (arrayList.size() > 0) {
            Iterator<RecyclerView.e0> it = arrayList.iterator();
            while (it.hasNext()) {
                ((rru) this.c.b.getValue()).putRecycledView(it.next());
            }
            arrayList.clear();
        }
    }

    @Override // xsna.fan
    public final int getTagsCount() {
        return this.a.c.size();
    }
}
