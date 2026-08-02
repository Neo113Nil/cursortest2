package xsna;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import androidx.recyclerview.widget.c;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bsm;
import xsna.ixm;

/* compiled from: DiffAdapter.kt */
/* loaded from: classes17.dex */
public abstract class ixm<T, VH extends RecyclerView.e0> extends RecyclerView.Adapter<VH> {
    public final androidx.recyclerview.widget.d<T> c;
    public RecyclerView d;

    /* compiled from: DiffAdapter.kt */
    public static final class a implements ggz {
        public final RecyclerView.Adapter<?> b;
        public final FunctionReferenceImpl c;
        public final Handler d = new Handler(Looper.getMainLooper());

        /* JADX WARN: Multi-variable type inference failed */
        public a(RecyclerView.Adapter<?> adapter, gzs<Boolean> gzsVar) {
            this.b = adapter;
            this.c = (FunctionReferenceImpl) gzsVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
        public final void a(gzs<s3q0> gzsVar) {
            if (((Boolean) this.c.invoke()).booleanValue()) {
                try {
                    gzsVar.invoke();
                    return;
                } catch (IllegalStateException e) {
                    String message = e.getMessage();
                    if (message == null || !drm0.D(message, "is computing a layout or scrolling", false)) {
                        throw e;
                    }
                }
            }
            this.d.post(new y(4, this, gzsVar));
        }

        @Override // xsna.ggz
        public final void onChanged(final int i, final int i2, final Object obj) {
            a(new gzs() { // from class: xsna.gxm
                @Override // xsna.gzs
                public final Object invoke() {
                    ixm.a.this.b.notifyItemRangeChanged(i, i2, obj);
                    return s3q0.a;
                }
            });
        }

        @Override // xsna.ggz
        public final void onInserted(final int i, final int i2) {
            a(new gzs() { // from class: xsna.hxm
                @Override // xsna.gzs
                public final Object invoke() {
                    ixm.a.this.b.notifyItemRangeInserted(i, i2);
                    return s3q0.a;
                }
            });
        }

        @Override // xsna.ggz
        public final void onMoved(final int i, final int i2) {
            a(new gzs() { // from class: xsna.exm
                @Override // xsna.gzs
                public final Object invoke() {
                    ixm.a.this.b.notifyItemMoved(i, i2);
                    return s3q0.a;
                }
            });
        }

        @Override // xsna.ggz
        public final void onRemoved(final int i, final int i2) {
            a(new gzs() { // from class: xsna.fxm
                @Override // xsna.gzs
                public final Object invoke() {
                    ixm.a.this.b.notifyItemRangeRemoved(i, i2);
                    return s3q0.a;
                }
            });
        }
    }

    public ixm(bsm.b bVar) {
        a aVar = new a(this, new jxm(0, this, ixm.class, "isSafeToNotify", "isSafeToNotify()Z", 0));
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
        this.c = new androidx.recyclerview.widget.d<>(aVar, new androidx.recyclerview.widget.c(null, c.a.b, bVar));
    }

    public final T getItem(int i) {
        return this.c.f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.d = null;
    }

    public final void submitList(List<? extends T> list) {
        this.c.b(list, null);
    }
}
