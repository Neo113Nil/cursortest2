package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ImItemListViewAnalyticsObserver.kt */
/* loaded from: classes2.dex */
public final class m7w implements RecyclerView.q {
    public final RecyclerView b;
    public final jpf c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);

    public m7w(RecyclerView recyclerView, jpf jpfVar) {
        this.b = recyclerView;
        this.c = jpfVar;
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

    public final boolean b() {
        return !this.d.get() && ((jtm) this.c.invoke()).isEnabled();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(View view) {
        if (!b()) {
            a();
            return;
        }
        RecyclerView.e0 findContainingViewHolder = this.b.findContainingViewHolder(view);
        if (findContainingViewHolder instanceof ujm) {
            ujm ujmVar = (ujm) findContainingViewHolder;
            if (ujmVar.m) {
                awt0.i(ujmVar.itemView, new wo1(6, this, (ujm) findContainingViewHolder));
                return;
            }
            return;
        }
        if ((findContainingViewHolder instanceof jmm) || (findContainingViewHolder instanceof n0b)) {
            awt0.i(((vfz) findContainingViewHolder).itemView, new fbh(this, 28));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(View view) {
    }
}
