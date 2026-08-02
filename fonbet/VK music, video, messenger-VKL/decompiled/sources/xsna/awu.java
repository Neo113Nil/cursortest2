package xsna;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;

/* compiled from: HeaderAdapter.java */
/* loaded from: classes3.dex */
public abstract class awu<T> extends zoj0<T, RecyclerView.e0> {
    public final ArrayList<b<T>> e;
    public final SparseArray<b<T>> f;
    public final ArrayList<b<T>> g;
    public boolean h;

    /* compiled from: HeaderAdapter.java */
    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            awu.this.R0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            awu.this.S0(i - 10, i + i2 + 10, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            awu.this.S0(i - 10, i + i2 + 10, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            awu.this.R0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            awu.this.S0(i - 10, i + i2 + 10, false);
        }
    }

    /* compiled from: HeaderAdapter.java */
    public static abstract class b<T> {
        public abstract int a();

        public abstract void b(RecyclerView.e0 e0Var);

        public abstract RecyclerView.e0 c(ViewGroup viewGroup);

        public abstract boolean d(T t);

        public abstract boolean e(T t);

        public abstract boolean f(int i, Object obj, Object obj2);
    }

    public awu() {
        this.e = new ArrayList<>();
        this.f = new SparseArray<>();
        this.g = new ArrayList<>();
        this.h = false;
        registerAdapterDataObserver(new a());
    }

    public final void K0(b<T> bVar) {
        ArrayList<b<T>> arrayList = this.e;
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
        R0();
    }

    public long L0(int i) {
        return -1L;
    }

    public abstract int N0(int i);

    public abstract void O0(RecyclerView.e0 e0Var, int i);

    public abstract RecyclerView.e0 P0(int i, ViewGroup viewGroup);

    public final void R0() {
        S0(0, ((ListDataSet) this.c).d.size(), false);
    }

    public final void S0(int i, int i2, boolean z) {
        SparseArray<b<T>> sparseArray;
        int i3;
        T t;
        b<T> bVar;
        b<T> bVar2;
        b<T> bVar3;
        if (this.h) {
            return;
        }
        ArrayList<b<T>> arrayList = this.e;
        if (z || !(arrayList.size() == 0 || E0() == 0)) {
            this.h = true;
            ListDataSet listDataSet = (ListDataSet) this.c;
            ListDataSet.ArrayListImpl<T> arrayListImpl = listDataSet.d;
            if (i < 0) {
                i = 0;
            }
            if (i2 > arrayListImpl.size()) {
                i2 = arrayListImpl.size();
            }
            ArrayList<b<T>> arrayList2 = this.g;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            int size = arrayListImpl.size() - 1;
            while (true) {
                sparseArray = this.f;
                if (size < 0) {
                    break;
                }
                if (arrayListImpl.get(size) == null) {
                    if (size > i2 || size < i) {
                        arrayList2.remove(sparseArray.get(size));
                    } else {
                        i2--;
                        listDataSet.A(size);
                        sparseArray.remove(size);
                    }
                }
                size--;
            }
            while (i <= i2 && i <= arrayListImpl.size() && arrayList2.size() > 0) {
                if (i == 0) {
                    T t2 = i < arrayListImpl.size() ? arrayListImpl.get(i) : null;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            bVar3 = null;
                            break;
                        } else {
                            if (arrayList2.get(i4).e(t2)) {
                                bVar3 = arrayList2.remove(i4);
                                break;
                            }
                            i4++;
                        }
                    }
                    if (bVar3 != null) {
                        sparseArray.put(i, bVar3);
                        listDataSet.x(i, null);
                        i2++;
                        i++;
                    } else {
                        i++;
                    }
                } else if (i == arrayListImpl.size()) {
                    T t3 = i > 0 ? arrayListImpl.get(i - 1) : null;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            bVar2 = null;
                            break;
                        } else {
                            if (arrayList2.get(i5).d(t3)) {
                                bVar2 = arrayList2.remove(i5);
                                break;
                            }
                            i5++;
                        }
                    }
                    if (bVar2 != null) {
                        sparseArray.put(i, bVar2);
                        listDataSet.x(i, null);
                        i2++;
                        i++;
                    } else {
                        i++;
                    }
                } else {
                    T t4 = i > 0 ? arrayListImpl.get(i - 1) : null;
                    if (i < arrayListImpl.size()) {
                        t = arrayListImpl.get(i);
                        i3 = i;
                    } else {
                        i3 = -1;
                        t = null;
                    }
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            bVar = null;
                            break;
                        } else {
                            if (arrayList2.get(i6).f(i3, t4, t)) {
                                bVar = arrayList2.remove(i6);
                                break;
                            }
                            i6++;
                        }
                    }
                    if (bVar != null) {
                        sparseArray.put(i, bVar);
                        listDataSet.x(i, null);
                        i2++;
                        i++;
                    } else {
                        i++;
                    }
                }
            }
            Q0();
            this.h = false;
        }
    }

    public final void T0(b<T> bVar) {
        if (this.e.remove(bVar)) {
            S0(0, ((ListDataSet) this.c).d.size(), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (this.c.c(i) != null) {
            return L0(i);
        }
        this.f.get(i);
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (this.c.c(i) != null) {
            return N0(i);
        }
        b<T> bVar = this.f.get(i);
        if (bVar != null) {
            return bVar.a();
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (this.c.c(i) != null) {
            O0(e0Var, i);
            return;
        }
        b<T> bVar = this.f.get(i);
        if (bVar != null) {
            bVar.b(e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 0;
        while (true) {
            SparseArray<b<T>> sparseArray = this.f;
            if (i2 >= sparseArray.size()) {
                return P0(i, viewGroup);
            }
            b<T> valueAt = sparseArray.valueAt(i2);
            if (valueAt.a() == i) {
                return valueAt.c(viewGroup);
            }
            i2++;
        }
    }

    public awu(ListDataSet<T> listDataSet) {
        super(listDataSet);
        this.e = new ArrayList<>();
        this.f = new SparseArray<>();
        this.g = new ArrayList<>();
        this.h = false;
        registerAdapterDataObserver(new a());
    }

    public void Q0() {
    }
}
