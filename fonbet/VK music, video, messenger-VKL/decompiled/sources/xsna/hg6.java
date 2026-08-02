package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BaseListDataSet.kt */
/* loaded from: classes3.dex */
public abstract class hg6<T> implements uuk<T> {
    public final ArrayList<RecyclerView.i> b = new ArrayList<>();
    public final ArrayList<RecyclerView.i> c = new ArrayList<>();

    public final void a() {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).b();
        }
    }

    public final void b() {
        Iterator<RecyclerView.i> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void d(int i) {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).c(i, 1);
        }
    }

    public final void e(int i, Object obj) {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).d(i, 1, obj);
        }
    }

    public final void f(int i) {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).e(i, 1);
        }
    }

    public final void g(int i, int i2) {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.get(i3).f(i, i2);
        }
    }

    public final void h(int i) {
        Iterator<RecyclerView.i> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().c(i, 1);
        }
    }

    public final void i(int i, Object obj) {
        Iterator<RecyclerView.i> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().d(i, 1, obj);
        }
    }

    public final void j(int i) {
        Iterator<RecyclerView.i> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().e(i, 1);
        }
    }

    public final void k(int i) {
        Iterator<RecyclerView.i> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().g(i, 1);
        }
    }

    public final void l(int i, int i2) {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.get(i3).c(i, i2);
        }
    }

    public final void m(int i, int i2) {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.get(i3).e(i, i2);
        }
    }

    public final void n(int i, int i2) {
        Iterator<RecyclerView.i> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().g(i, i2);
        }
    }

    public final void o(int i, int i2) {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.get(i3).g(i, i2);
        }
    }

    public void onChanged(int i, int i2, Object obj) {
        l(i, i2);
    }

    public void onInserted(int i, int i2) {
        m(i, i2);
    }

    public void onMoved(int i, int i2) {
        g(i, i2);
    }

    public void onRemoved(int i, int i2) {
        o(i, i2);
    }

    public final void p(int i) {
        ArrayList<RecyclerView.i> arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).g(i, 1);
        }
    }

    public final void q(RecyclerView.i iVar) {
        this.b.remove(iVar);
    }

    public void r(int i, T t, Object obj) {
        ((ListDataSet) this).F(i, t);
    }
}
