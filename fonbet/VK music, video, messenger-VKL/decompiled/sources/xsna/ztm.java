package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DialogsListViewAnalyticsObserver.kt */
/* loaded from: classes18.dex */
public final class ztm implements RecyclerView.q {
    public final RecyclerView b;
    public final mxj c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);

    public ztm(RecyclerView recyclerView, mxj mxjVar) {
        this.b = recyclerView;
        this.c = mxjVar;
        if (b()) {
            recyclerView.addOnChildAttachStateChangeListener(this);
        } else {
            a();
        }
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.b.removeOnChildAttachStateChangeListener(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean b() {
        return !this.d.get() && ((jtm) ((fum) this.c.c).s.getValue()).isEnabled();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(View view) {
        if (!b()) {
            a();
            return;
        }
        RecyclerView.e0 findContainingViewHolder = this.b.findContainingViewHolder(view);
        if (findContainingViewHolder instanceof x990) {
            x990 x990Var = (x990) findContainingViewHolder;
            if (x990Var.l) {
                awt0.i(x990Var.itemView, new com.vk.movika.sdk.base.ui.r(7, this, (x990) findContainingViewHolder));
                return;
            }
            return;
        }
        if (!(findContainingViewHolder instanceof ujm)) {
            if (findContainingViewHolder instanceof jmm) {
                awt0.i(((jmm) findContainingViewHolder).itemView, new mag(this, 12));
            }
        } else {
            ujm ujmVar = (ujm) findContainingViewHolder;
            if (ujmVar.m) {
                awt0.i(ujmVar.itemView, new com.vk.movika.sdk.base.ui.s(7, this, (ujm) findContainingViewHolder));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(View view) {
    }
}
