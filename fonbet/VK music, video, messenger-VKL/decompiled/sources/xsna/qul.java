package xsna;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: DelegationAdapter.kt */
/* loaded from: classes17.dex */
public abstract class qul extends RecyclerView.Adapter<vfz<hfz>> {
    public boolean c;
    public List<? extends hfz> d;
    public final SparseArray<p1u0<?>> e;
    public RecyclerView f;
    public int g;

    public qul() {
        this(false);
    }

    public final int A0(hfz hfzVar) {
        SparseArray<p1u0<?>> sparseArray = this.e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            if (sparseArray.valueAt(i).c(hfzVar)) {
                return keyAt;
            }
        }
        throw new UnsupportedOperationException("No adapterDelegate for item " + hfzVar + " in " + this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(vfz<hfz> vfzVar, int i) {
        D0(vfzVar, i, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(vfz<hfz> vfzVar, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(vfzVar, i);
        } else {
            D0(vfzVar, i, list);
        }
    }

    public void D0(vfz<hfz> vfzVar, int i, List<Object> list) {
        hfz hfzVar = getItems().get(i);
        z0(hfzVar).a(vfzVar, hfzVar, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public vfz onCreateViewHolder(int i, ViewGroup viewGroup) {
        SparseArray<p1u0<?>> sparseArray = this.e;
        if (zik0.a(sparseArray, i)) {
            return sparseArray.get(i).b(viewGroup);
        }
        throw new UnsupportedOperationException(lhg.a(i, "No adapterDelegate for viewType: "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(vfz<hfz> vfzVar) {
        vfzVar.a6();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(vfz<hfz> vfzVar) {
        vfzVar.g6();
    }

    public final <T extends hfz, VH extends vfz<T>> void H0(Pair<? extends dcy<T>, ? extends izs<? super ViewGroup, ? extends VH>> pair) {
        x0(((pfc) pair.i()).a(), pair.j());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getItems().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (A0(r5) << 32) | getItems().get(i).getItemId().longValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < 0 || i >= getItems().size()) {
            return 0;
        }
        return A0(getItems().get(i));
    }

    public List<hfz> getItems() {
        return this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(vfz<hfz> vfzVar) {
        vfzVar.V5();
    }

    public void setItems(List<? extends hfz> list) {
        RecyclerView recyclerView;
        this.d = list;
        if (!this.c || (recyclerView = this.f) == null) {
            return;
        }
        wjf0.d(recyclerView);
    }

    public final <T extends hfz, VH extends vfz<T>> void x0(Class<T> cls, izs<? super ViewGroup, ? extends VH> izsVar) {
        int i = this.g;
        this.g = i + 1;
        this.e.put(i, new fqj0(cls, izsVar));
    }

    public final void y0(p1u0<?> p1u0Var) {
        int i = this.g;
        this.g = i + 1;
        this.e.put(i, p1u0Var);
    }

    public final p1u0<hfz> z0(hfz hfzVar) {
        p1u0<?> p1u0Var;
        SparseArray<p1u0<?>> sparseArray = this.e;
        int size = sparseArray.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                p1u0Var = null;
                break;
            }
            p1u0Var = sparseArray.valueAt(i);
            if (p1u0Var.c(hfzVar)) {
                break;
            }
            i++;
        }
        p1u0<hfz> p1u0Var2 = p1u0Var instanceof p1u0 ? p1u0Var : null;
        if (p1u0Var2 != null) {
            return p1u0Var2;
        }
        throw new UnsupportedOperationException("No adapterDelegate for item " + hfzVar + " in " + this);
    }

    public qul(boolean z) {
        this.c = z;
        this.d = EmptyList.b;
        this.e = new SparseArray<>();
    }
}
