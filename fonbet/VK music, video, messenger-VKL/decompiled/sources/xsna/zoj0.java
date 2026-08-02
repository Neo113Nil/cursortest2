package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: SimpleAdapter.java */
/* loaded from: classes3.dex */
public abstract class zoj0<T, VH extends RecyclerView.e0> extends RecyclerView.Adapter<VH> implements uuk<T>, vic {
    public final hg6<T> c;
    public RecyclerView d;

    public zoj0() {
        this(new ListDataSet());
    }

    public final void A0(int i, int i2) {
        ListDataSet listDataSet = (ListDataSet) this.c;
        Iterator<RecyclerView.i> it = listDataSet.c.iterator();
        while (it.hasNext()) {
            it.next().f(i, i2);
        }
        Collections.swap(listDataSet.d, i, i2);
        listDataSet.g(i, i2);
    }

    public final void B0(T t) {
        ListDataSet listDataSet = (ListDataSet) this.c;
        ListDataSet.ArrayListImpl<T> arrayListImpl = listDataSet.d;
        int size = arrayListImpl.size();
        int i = 0;
        while (true) {
            if (i < size) {
                T t2 = arrayListImpl.get(i);
                if ((t2 == null && t == null) || (t2 != null && t2.equals(t))) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            listDataSet.k(i);
            arrayListImpl.remove(i);
            listDataSet.p(i);
        }
    }

    public final void C0(izs<? super T, Boolean> izsVar) {
        ListDataSet listDataSet = (ListDataSet) this.c;
        ListDataSet.ArrayListImpl<T> arrayListImpl = listDataSet.d;
        int size = arrayListImpl.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (izsVar.invoke(arrayListImpl.get(i)).booleanValue()) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            listDataSet.k(i);
            arrayListImpl.remove(i);
            listDataSet.p(i);
        }
    }

    public final void D0(int i) {
        ((ListDataSet) this.c).A(i);
    }

    public final int E0() {
        return ((ListDataSet) this.c).d.size();
    }

    public final void F0(T t, T t2) {
        ((ListDataSet) this.c).D(t, t2);
    }

    public final void G0(Object obj, izs izsVar) {
        ListDataSet listDataSet = (ListDataSet) this.c;
        ListDataSet.ArrayListImpl<T> arrayListImpl = listDataSet.d;
        int size = arrayListImpl.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((Boolean) izsVar.invoke(arrayListImpl.get(i))).booleanValue()) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            listDataSet.h(i);
            arrayListImpl.set(i, obj);
            listDataSet.d(i);
        }
    }

    public final void H0(izs<? super T, Boolean> izsVar, izs<? super T, ? extends T> izsVar2) {
        ((ListDataSet) this.c).E(izsVar, izsVar2);
    }

    @Override // xsna.uuk
    public final boolean J(l6u l6uVar) {
        return ((ListDataSet) this.c).J(l6uVar);
    }

    public final void J0(int i, T t) {
        ((ListDataSet) this.c).F(i, t);
    }

    @Override // xsna.uuk
    public final void S(List<T> list) {
        this.c.S(list);
    }

    public T c(int i) {
        return this.c.c(i);
    }

    public void clear() {
        this.c.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return ((ListDataSet) this.c).d.size();
    }

    @Nullable
    public RecyclerView getRecyclerView() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h0(List<PhotoAlbum> list) {
        n0(list);
    }

    public void n0(List<T> list) {
        this.c.n0(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (this.d == recyclerView) {
            this.d = null;
        }
    }

    public void setItems(List<? extends T> list) {
        this.c.setItems(list);
    }

    public final void x0(T t) {
        ((ListDataSet) this.c).s(t);
    }

    public List<T> y0() {
        return ((ListDataSet) this.c).d;
    }

    public final void z0(int i, T t) {
        ((ListDataSet) this.c).x(i, t);
    }

    public zoj0(hg6<T> hg6Var) {
        hg6Var = hg6Var == null ? new ListDataSet<>() : hg6Var;
        this.c = hg6Var;
        gg6 gg6Var = new gg6(this, new fg6());
        ArrayList<RecyclerView.i> arrayList = hg6Var.b;
        if (arrayList.contains(gg6Var)) {
            return;
        }
        arrayList.add(gg6Var);
    }
}
