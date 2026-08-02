package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.m;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: ClipsLockableAdapter.kt */
/* loaded from: classes17.dex */
public abstract class wke extends wx3 implements b9e {
    public final xzz j;
    public final uzz k;
    public final int l;

    /* compiled from: ClipsLockableAdapter.kt */
    public static final class a implements ggz {
        public wke b;

        @Override // xsna.ggz
        public final void onChanged(int i, int i2, Object obj) {
            wke wkeVar = this.b;
            if (wkeVar == null) {
                wkeVar = null;
            }
            wkeVar.notifyItemRangeChanged(i, i2, obj);
        }

        @Override // xsna.ggz
        public final void onInserted(int i, int i2) {
            wke wkeVar = this.b;
            if (wkeVar == null) {
                wkeVar = null;
            }
            wkeVar.notifyItemRangeInserted(i, i2);
        }

        @Override // xsna.ggz
        public final void onMoved(int i, int i2) {
            wke wkeVar = this.b;
            if (wkeVar == null) {
                wkeVar = null;
            }
            wkeVar.notifyItemMoved(i, i2);
        }

        @Override // xsna.ggz
        public final void onRemoved(int i, int i2) {
            wke wkeVar = this.b;
            if (wkeVar == null) {
                wkeVar = null;
            }
            wkeVar.notifyItemRangeRemoved(i, i2);
        }
    }

    /* compiled from: ClipsLockableAdapter.kt */
    public static final class b extends m.e<hfz> {
        public final tx3 a = wx3.i;

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
            return ((Boolean) this.a.invoke(hfzVar, hfzVar2)).booleanValue();
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
            hfz hfzVar3 = hfzVar;
            hfz hfzVar4 = hfzVar2;
            return hfzVar3.getClass().equals(hfzVar4.getClass()) && epx.f(hfzVar3.getItemId(), hfzVar4.getItemId());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wke(int i) {
        super(r0, new androidx.recyclerview.widget.c(r2, c.a.b, r3));
        a aVar = new a();
        xzz xzzVar = new xzz();
        uzz uzzVar = new uzz();
        b bVar = new b();
        synchronized (c.a.a) {
            try {
                if (c.a.b == null) {
                    asu0.a.getClass();
                    ExecutorService D = asu0.D();
                    c.a.b = D == null ? Executors.newFixedThreadPool(2) : D;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.j = xzzVar;
        this.k = uzzVar;
        this.l = i;
        aVar.b = this;
    }

    public static void K0(wke wkeVar, List list) {
        super.setItems(list);
    }

    public final void L0() {
        uzz uzzVar = this.k;
        synchronized (uzzVar) {
            uzzVar.c.set(false);
            Runnable runnable = uzzVar.d;
            if (runnable == null) {
                return;
            }
            uzzVar.d = null;
            uzzVar.execute(runnable);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void N0(List<? extends hfz> list) {
        xzz xzzVar = this.j;
        if (xzzVar.b.get()) {
            xzzVar.execute(new e6(2, this, list));
        } else {
            super.setItems(list);
        }
    }

    @Override // xsna.b9e
    public final void g0() {
        xzz xzzVar = this.j;
        synchronized (xzzVar) {
            xzzVar.b.set(true);
            s3q0 s3q0Var = s3q0.a;
        }
        uzz uzzVar = this.k;
        synchronized (uzzVar) {
            uzzVar.c.set(true);
        }
    }

    @Override // xsna.wx3, xsna.qul
    public final List<hfz> getItems() {
        return this.h.f;
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView.getId() == this.l) {
            uzz uzzVar = this.k;
            synchronized (uzzVar) {
                uzzVar.e = recyclerView;
                Runnable runnable = uzzVar.d;
                if (runnable != null) {
                    uzzVar.d = null;
                    uzzVar.execute(runnable);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }
        this.f = recyclerView;
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f = null;
        uzz uzzVar = this.k;
        synchronized (uzzVar) {
            try {
                if (recyclerView.equals(uzzVar.e)) {
                    uzzVar.e = null;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.wx3, xsna.qul
    public final void setItems(List<? extends hfz> list) {
        N0(list);
    }

    @Override // xsna.b9e
    public final void unlock() {
        xzz xzzVar = this.j;
        synchronized (xzzVar) {
            xzzVar.b.set(false);
            Runnable runnable = xzzVar.d;
            if (runnable != null) {
                xzzVar.d = null;
                xzzVar.execute(runnable);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        L0();
    }

    @Override // xsna.b9e
    public final boolean y() {
        return this.j.b.get();
    }
}
