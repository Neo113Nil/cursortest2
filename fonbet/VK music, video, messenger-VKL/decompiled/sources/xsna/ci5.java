package xsna;

import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.hbt0;

/* compiled from: AutoPlayRecyclerListener.kt */
/* loaded from: classes2.dex */
public final class ci5 extends RecyclerView.t implements RecyclerView.q, RecyclerView.w {
    public final hbt0.c c;
    public final cbt0 d;
    public final cnt0 e;
    public long i;
    public RecyclerView b = null;
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();
    public final bi5 h = new bi5(this, 0);
    public int j = Integer.MAX_VALUE;
    public int k = Integer.MAX_VALUE;
    public long l = Long.MAX_VALUE;
    public final boolean m = fxc0.B().J().G0();

    public ci5(hbt0.c cVar, cbt0 cbt0Var, cnt0 cnt0Var) {
        this.c = cVar;
        this.d = cbt0Var;
        this.e = cnt0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.w
    public final void b(RecyclerView.e0 e0Var) {
        ViewGroup.LayoutParams layoutParams = e0Var.itemView.getLayoutParams();
        RecyclerView.p pVar = layoutParams instanceof RecyclerView.p ? (RecyclerView.p) layoutParams : null;
        if (pVar != null && pVar.b.isRemoved()) {
            l(e0Var.itemView, e0Var instanceof ent0 ? (ent0) e0Var : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g(View view) {
        Object m = m(view);
        l(view, m instanceof ent0 ? (ent0) m : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void k(View view) {
        RecyclerView.o layoutManager;
        Trace.beginSection("AutoPlayRecyclerListener.attachView");
        try {
            this.g.add(view);
            Object m = m(view);
            ent0 ent0Var = m instanceof ent0 ? (ent0) m : null;
            dnt0 q3 = ent0Var != null ? ent0Var.q3() : null;
            if (q3 instanceof lnt0) {
                RecyclerView recyclerView = ((lnt0) q3).getRecyclerView();
                if (recyclerView != null) {
                    recyclerView.addOnScrollListener(this);
                    recyclerView.addOnChildAttachStateChangeListener(this);
                    this.f.add(recyclerView);
                }
                RecyclerView recyclerView2 = ((lnt0) q3).getRecyclerView();
                if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
                    x5t0.a(recyclerView2, layoutManager, new ipg(view, 1));
                }
            } else {
                boolean z = q3 instanceof mnt0;
                cbt0 cbt0Var = this.d;
                if (z) {
                    mnt0 mnt0Var = (mnt0) q3;
                    mnt0Var.G2(view);
                    mnt0Var.setFocusController(this.e);
                    RecyclerView recyclerView3 = this.b;
                    Integer valueOf = recyclerView3 != null ? Integer.valueOf(recyclerView3.getScrollState()) : null;
                    if (valueOf != null && valueOf.intValue() == 0) {
                        cbt0Var.invoke(this);
                    }
                } else if (q3 instanceof nnt0) {
                    cbt0Var.invoke(this);
                }
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void l(View view, ent0 ent0Var) {
        RecyclerView.o layoutManager;
        Trace.beginSection("AutoPlayRecyclerListener.detachView");
        try {
            this.g.remove(view);
            dnt0 q3 = ent0Var != null ? ent0Var.q3() : null;
            if (q3 instanceof lnt0) {
                RecyclerView recyclerView = ((lnt0) q3).getRecyclerView();
                if (recyclerView != null) {
                    recyclerView.removeOnScrollListener(this);
                    recyclerView.removeOnChildAttachStateChangeListener(this);
                    this.f.remove(recyclerView);
                }
                RecyclerView recyclerView2 = ((lnt0) q3).getRecyclerView();
                if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
                    x5t0.a(recyclerView2, layoutManager, new gqe0(view, 24));
                }
            } else if (q3 instanceof mnt0) {
                mnt0 mnt0Var = (mnt0) q3;
                mnt0Var.setVideoFocused(false);
                mnt0Var.setFocusController(null);
                mnt0Var.w0(view);
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final RecyclerView.e0 m(View view) {
        Object obj;
        RecyclerView recyclerView;
        if (epx.f(this.b, view.getParent())) {
            recyclerView = this.b;
        } else {
            Iterator it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f((RecyclerView) obj, view.getParent())) {
                    break;
                }
            }
            recyclerView = (RecyclerView) obj;
        }
        if (recyclerView != null) {
            return recyclerView.getChildViewHolder(view);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        bi5 bi5Var = this.h;
        boolean z = this.m;
        if (i == 0) {
            if (z) {
                recyclerView.removeCallbacks(bi5Var);
            }
            this.d.invoke(this);
        } else if (z) {
            recyclerView.removeCallbacks(bi5Var);
            recyclerView.postDelayed(bi5Var, 500L);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.i;
        this.i = elapsedRealtime;
        if (this.m) {
            bi5 bi5Var = this.h;
            recyclerView.removeCallbacks(bi5Var);
            recyclerView.postDelayed(bi5Var, 500L);
        }
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        long j2 = this.l;
        if (j2 != Long.MAX_VALUE) {
            this.l = j2 + j;
        }
        int i3 = this.j;
        if (i3 != Integer.MAX_VALUE) {
            this.j = i3 + abs;
        }
        int i4 = this.k;
        if (i4 != Integer.MAX_VALUE) {
            this.k = i4 + abs2;
        }
        int width = recyclerView.getWidth();
        int height = recyclerView.getHeight();
        double d = width;
        if (abs < d * 0.03d) {
            double d2 = height;
            if (abs2 < 0.03d * d2) {
                if (j >= 75) {
                    this.l = 0L;
                    this.j = 0;
                    this.k = 0;
                    return;
                } else {
                    if (this.l >= 750 || this.j >= d * 0.25d || this.k >= d2 * 0.25d) {
                        this.d.invoke(this);
                        this.l = 0L;
                        this.j = 0;
                        this.k = 0;
                        return;
                    }
                    return;
                }
            }
        }
        this.l = 0L;
        this.j = 0;
        this.k = 0;
    }
}
