package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: CompositeOnScrollListener.kt */
/* loaded from: classes4.dex */
public class dui extends RecyclerView.t {
    public final ArrayList<RecyclerView.t> b = new ArrayList<>();
    public final ArrayList<RecyclerView.t> c = new ArrayList<>();

    public final void l(RecyclerView.t tVar) {
        this.b.add(tVar);
        this.c.add(tVar);
    }

    public final void m(RecyclerView.t tVar) {
        this.b.remove(tVar);
        this.c.remove(tVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList<RecyclerView.t> arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                arrayList.get(size).onScrollStateChanged(recyclerView, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList<RecyclerView.t> arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                arrayList.get(size).onScrolled(recyclerView, i, i2);
            }
        }
    }
}
