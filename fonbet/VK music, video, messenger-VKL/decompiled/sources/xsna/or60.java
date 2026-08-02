package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.xn60;
import xsna.yo60;

/* compiled from: NewsfeedListPager.kt */
/* loaded from: classes4.dex */
public final class or60 extends RecyclerView.t implements zjf0<ol60> {
    public final fo60 b;
    public final Lazy d;
    public final int c = 25;
    public final AtomicReference<String> e = new AtomicReference<>();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);

    public or60(Lazy lazy, fo60 fo60Var) {
        this.b = fo60Var;
        this.d = lazy;
    }

    @Override // xsna.zjf0
    public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
        String str;
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean.get() || this.g.get() || (str = this.e.get()) == null || str.length() == 0 || ((RecyclerView.Adapter) this.d.getValue()).getItemCount() - e0Var.getLayoutPosition() >= this.c || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        this.b.a(xn60.d.c.b);
    }

    public final void l(yo60.j jVar) {
        boolean z = jVar instanceof yo60.j.b;
        AtomicBoolean atomicBoolean = this.g;
        AtomicBoolean atomicBoolean2 = this.f;
        boolean z2 = false;
        if (z) {
            this.e.set(((yo60.j.b) jVar).a);
            atomicBoolean2.set(false);
            atomicBoolean.set(false);
            return;
        }
        if (jVar instanceof yo60.j.c) {
            atomicBoolean2.set(true);
            atomicBoolean.set(false);
            return;
        }
        if (!(jVar instanceof yo60.j.d)) {
            if (!(jVar instanceof yo60.j.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        ListLoadingState listLoadingState = ((yo60.j.d) jVar).a;
        boolean z3 = listLoadingState == ListLoadingState.ERROR;
        if (!z3 && listLoadingState != ListLoadingState.IDLE) {
            z2 = true;
        }
        atomicBoolean2.set(z2);
        atomicBoolean.set(z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        String str;
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean.get() || this.g.get() || (str = this.e.get()) == null || str.length() == 0) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int b = gkf0.b(recyclerView);
        if (itemCount - this.c > b || b > itemCount || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        this.b.a(xn60.d.c.b);
    }

    @Override // xsna.zjf0
    public final void b(RecyclerView.e0 e0Var) {
    }

    @Override // xsna.zjf0
    public final void e(RecyclerView.e0 e0Var) {
    }
}
