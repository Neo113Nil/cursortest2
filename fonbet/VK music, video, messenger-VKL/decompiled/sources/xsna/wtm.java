package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DialogsListVcAnalyticsObserver.kt */
/* loaded from: classes2.dex */
public final class wtm implements RecyclerView.q {
    public final RecyclerView b;
    public final ltm c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public wtm(RecyclerView recyclerView, ltm ltmVar) {
        this.b = recyclerView;
        this.c = ltmVar;
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
        return !this.d.get() && this.c.isEnabled();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(View view) {
        if (!b()) {
            a();
            return;
        }
        RecyclerView.e0 findContainingViewHolder = this.b.findContainingViewHolder(view);
        if (findContainingViewHolder instanceof yqr0) {
            awt0.i(((yqr0) findContainingViewHolder).itemView, new odm(this, 2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(View view) {
    }
}
