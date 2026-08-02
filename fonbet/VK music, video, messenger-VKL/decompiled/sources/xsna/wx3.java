package xsna;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.m;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.wke;
import xsna.wx3;

/* compiled from: AsyncDiffUtilDelegationAdapter.kt */
/* loaded from: classes17.dex */
public abstract class wx3 extends qul {
    public static final tx3 i = new tx3(0, 0);
    public final androidx.recyclerview.widget.d<hfz> h;

    /* compiled from: AsyncDiffUtilDelegationAdapter.kt */
    public static final class a extends m.e<hfz> {
        public final wzs<hfz, hfz, Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wzs<? super hfz, ? super hfz, Boolean> wzsVar) {
            this.a = wzsVar;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
            return this.a.invoke(hfzVar, hfzVar2).booleanValue();
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
            hfz hfzVar3 = hfzVar;
            hfz hfzVar4 = hfzVar2;
            return hfzVar3.getClass().equals(hfzVar4.getClass()) && epx.f(hfzVar3.getItemId(), hfzVar4.getItemId());
        }
    }

    /* compiled from: AsyncDiffUtilDelegationAdapter.kt */
    public final class b implements ggz {
        public boolean b;

        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        @SuppressLint({"NotifyDataSetChanged"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(final gzs<s3q0> gzsVar) {
            boolean z;
            final wx3 wx3Var = wx3.this;
            RecyclerView recyclerView = wx3Var.f;
            if (!(recyclerView != null ? recyclerView.isComputingLayout() : false)) {
                z = true;
                try {
                    gzsVar.invoke();
                    this.b = true;
                } catch (IllegalStateException e) {
                    String message = e.getMessage();
                    if (message == null || !drm0.D(message, "is computing a layout or scrolling", false)) {
                        throw e;
                    }
                }
                if (z) {
                    this.b = false;
                    RecyclerView recyclerView2 = wx3Var.f;
                    if (recyclerView2 != null) {
                        recyclerView2.post(new Runnable() { // from class: xsna.by3
                            @Override // java.lang.Runnable
                            public final void run() {
                                wx3.b bVar = wx3.b.this;
                                if (!bVar.b) {
                                    bVar.a(gzsVar);
                                } else {
                                    bVar.a(new ra0(wx3Var, 6));
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            z = false;
            if (z) {
            }
        }

        @Override // xsna.ggz
        public final void onChanged(final int i, final int i2, final Object obj) {
            final wx3 wx3Var = wx3.this;
            a(new gzs() { // from class: xsna.ay3
                @Override // xsna.gzs
                public final Object invoke() {
                    wx3.this.notifyItemRangeChanged(i, i2, obj);
                    return s3q0.a;
                }
            });
        }

        @Override // xsna.ggz
        public final void onInserted(final int i, final int i2) {
            final wx3 wx3Var = wx3.this;
            a(new gzs() { // from class: xsna.zx3
                @Override // xsna.gzs
                public final Object invoke() {
                    wx3.this.notifyItemRangeInserted(i, i2);
                    return s3q0.a;
                }
            });
        }

        @Override // xsna.ggz
        public final void onMoved(final int i, final int i2) {
            final wx3 wx3Var = wx3.this;
            a(new gzs() { // from class: xsna.xx3
                @Override // xsna.gzs
                public final Object invoke() {
                    wx3.this.notifyItemMoved(i, i2);
                    return s3q0.a;
                }
            });
        }

        @Override // xsna.ggz
        public final void onRemoved(final int i, final int i2) {
            final wx3 wx3Var = wx3.this;
            a(new gzs() { // from class: xsna.yx3
                @Override // xsna.gzs
                public final Object invoke() {
                    wx3.this.notifyItemRangeRemoved(i, i2);
                    return s3q0.a;
                }
            });
        }
    }

    public /* synthetic */ wx3() {
        this(i);
    }

    @Override // xsna.qul
    public final void D0(vfz<hfz> vfzVar, int i2, List<Object> list) {
        List<hfz> items = getItems();
        hfz hfzVar = items.get(i2);
        p1u0<hfz> z0 = z0(hfzVar);
        A0(hfzVar);
        hfzVar.getItemId().longValue();
        items.size();
        z0.a(vfzVar, hfzVar, list);
    }

    public final void J0(List<? extends hfz> list, izs<? super Boolean, s3q0> izsVar) {
        androidx.recyclerview.widget.d<hfz> dVar = this.h;
        if (epx.f(dVar.f, list)) {
            izsVar.invoke(Boolean.FALSE);
        } else {
            dVar.b(list, new ux3(izsVar, 0));
        }
    }

    @Override // xsna.qul
    public List<hfz> getItems() {
        return this.h.f;
    }

    @Override // xsna.qul
    public void setItems(List<? extends hfz> list) {
        this.h.b(list, null);
    }

    public wx3(wzs<? super hfz, ? super hfz, Boolean> wzsVar) {
        super(false);
        a aVar = new a(wzsVar);
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
        this.h = new androidx.recyclerview.widget.d<>(new b(), new androidx.recyclerview.widget.c(null, c.a.b, aVar));
    }

    public wx3(m.e<hfz> eVar) {
        super(false);
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
        this.h = new androidx.recyclerview.widget.d<>(new b(), new androidx.recyclerview.widget.c(null, c.a.b, eVar));
    }

    public wx3(wke.a aVar, androidx.recyclerview.widget.c cVar) {
        super(false);
        this.h = new androidx.recyclerview.widget.d<>(aVar, cVar);
    }
}
