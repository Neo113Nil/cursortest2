package xsna;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagingOnScrollListenerWrapper.kt */
/* loaded from: classes3.dex */
public final class ef90 extends RecyclerView.t {
    public final df90 b;

    public ef90(df90 df90Var) {
        this.b = df90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ef90.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.b, ((ef90) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        df90 df90Var = this.b;
        if (i == 0) {
            df90Var.l(0);
        } else if (i == 1) {
            df90Var.l(1);
        } else {
            if (i != 2) {
                return;
            }
            df90Var.l(2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Trace.beginSection("PagingOnScrollListenerWrapper.onScrolled");
        try {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            this.b.e(adapter != null ? adapter.getItemCount() : 0, gkf0.a(recyclerView), gkf0.b(recyclerView), i2);
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
