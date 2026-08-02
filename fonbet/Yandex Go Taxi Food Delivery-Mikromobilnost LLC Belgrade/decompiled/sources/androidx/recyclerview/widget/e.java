package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ak00;
import defpackage.b64;
import defpackage.d6z;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.swd;
import defpackage.yf3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class e extends RecyclerView.Adapter {
    public final f a;

    public e(RecyclerView.Adapter... adapterArr) {
        ArrayList arrayList;
        int size;
        swd swdVar = swd.b;
        List asList = Arrays.asList(adapterArr);
        this.a = new f(this);
        Iterator it = asList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                super.setHasStableIds(this.a.g != ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS);
                return;
            }
            RecyclerView.Adapter adapter = (RecyclerView.Adapter) it.next();
            f fVar = this.a;
            arrayList = fVar.e;
            size = arrayList.size();
            if (size < 0 || size > arrayList.size()) {
                break;
            }
            if (fVar.g != ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS) {
                d6z.m("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", adapter.hasStableIds());
            } else {
                adapter.hasStableIds();
            }
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    i = -1;
                    break;
                } else if (((a0) arrayList.get(i)).c == adapter) {
                    break;
                } else {
                    i++;
                }
            }
            if ((i == -1 ? null : (a0) arrayList.get(i)) == null) {
                a0 a0Var = new a0(adapter, fVar, fVar.b, fVar.h.a());
                arrayList.add(size, a0Var);
                Iterator it2 = fVar.c.iterator();
                while (it2.hasNext()) {
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) it2.next()).get();
                    if (recyclerView != null) {
                        adapter.onAttachedToRecyclerView(recyclerView);
                    }
                }
                if (a0Var.e > 0) {
                    fVar.a.notifyItemRangeInserted(fVar.b(a0Var), a0Var.e);
                }
                fVar.a();
            }
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
    }

    public final void f(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int findRelativeAdapterPositionIn(RecyclerView.Adapter adapter, x0 x0Var, int i) {
        f fVar = this.a;
        a0 a0Var = (a0) fVar.d.get(x0Var);
        if (a0Var == null) {
            return -1;
        }
        RecyclerView.Adapter adapter2 = a0Var.c;
        int b = i - fVar.b(a0Var);
        int itemCount = adapter2.getItemCount();
        if (b >= 0 && b < itemCount) {
            return adapter2.findRelativeAdapterPositionIn(adapter, x0Var, b);
        }
        StringBuilder s = b64.s(b, itemCount, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        s.append(x0Var);
        s.append("adapter:");
        s.append(adapter);
        throw new IllegalStateException(s.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Iterator it = this.a.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((a0) it.next()).e;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        f fVar = this.a;
        yf3 c = fVar.c(i);
        a0 a0Var = (a0) c.c;
        long h = a0Var.b.h(a0Var.c.getItemId(c.a));
        c.b = false;
        c.c = null;
        c.a = -1;
        fVar.f = c;
        return h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        f fVar = this.a;
        yf3 c = fVar.c(i);
        a0 a0Var = (a0) c.c;
        int a = a0Var.a.a(a0Var.c.getItemViewType(c.a));
        c.b = false;
        c.c = null;
        c.a = -1;
        fVar.f = c;
        return a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        f fVar = this.a;
        ArrayList arrayList = fVar.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = fVar.e.iterator();
        while (it2.hasNext()) {
            ((a0) it2.next()).c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        f fVar = this.a;
        yf3 c = fVar.c(i);
        fVar.d.put(x0Var, (a0) c.c);
        a0 a0Var = (a0) c.c;
        a0Var.c.bindViewHolder(x0Var, c.a);
        c.b = false;
        c.c = null;
        c.a = -1;
        fVar.f = c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        a0 a0Var = (a0) this.a.b.a.get(i);
        if (a0Var == null) {
            ny61.g(oyr.i(i, "Cannot find the wrapper for global view type "));
            a0Var = null;
        }
        return a0Var.c.onCreateViewHolder(viewGroup, a0Var.a.b(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        f fVar = this.a;
        ArrayList arrayList = fVar.c;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = fVar.e.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(x0 x0Var) {
        f fVar = this.a;
        IdentityHashMap identityHashMap = fVar.d;
        a0 a0Var = (a0) identityHashMap.get(x0Var);
        if (a0Var == null) {
            ak00.h("Cannot find wrapper for ", x0Var, ", seems like it is not bound by this adapter: ", fVar);
            return false;
        }
        boolean onFailedToRecycleView = a0Var.c.onFailedToRecycleView(x0Var);
        identityHashMap.remove(x0Var);
        return onFailedToRecycleView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        this.a.d(x0Var).c.onViewAttachedToWindow(x0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        this.a.d(x0Var).c.onViewDetachedFromWindow(x0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        f fVar = this.a;
        IdentityHashMap identityHashMap = fVar.d;
        a0 a0Var = (a0) identityHashMap.get(x0Var);
        if (a0Var == null) {
            ak00.h("Cannot find wrapper for ", x0Var, ", seems like it is not bound by this adapter: ", fVar);
        } else {
            a0Var.c.onViewRecycled(x0Var);
            identityHashMap.remove(x0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
}
