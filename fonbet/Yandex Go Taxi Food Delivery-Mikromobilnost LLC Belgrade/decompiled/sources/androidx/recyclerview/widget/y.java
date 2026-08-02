package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.kqy;
import defpackage.lb7;
import defpackage.pa3;
import defpackage.y5e;
import defpackage.zij;
import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public abstract class y extends RecyclerView.Adapter {
    final c mDiffer;
    private final pa3 mListener;

    public y(zij zijVar) {
        kqy kqyVar = new kqy(this);
        this.mListener = kqyVar;
        b bVar = new b(this);
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = new c(bVar, new lb7(9, y5e.b, zijVar));
        this.mDiffer = cVar;
        cVar.d.add(kqyVar);
    }

    public List<Object> getCurrentList() {
        return this.mDiffer.f;
    }

    public Object getItem(int i) {
        return this.mDiffer.f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.mDiffer.f.size();
    }

    public void onCurrentListChanged(List<Object> list, List<Object> list2) {
    }

    public void submitList(List<Object> list) {
        this.mDiffer.b(list, null);
    }

    public void submitList(List<Object> list, Runnable runnable) {
        this.mDiffer.b(list, runnable);
    }
}
