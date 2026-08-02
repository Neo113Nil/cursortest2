package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;

/* compiled from: NewsfeedAsyncListDiffer.kt */
/* loaded from: classes4.dex */
public final class sc60 implements xo60 {
    public final ho60 a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public List<? extends ol60> c = EmptyList.b;
    public c9x d = d9x.a;
    public int e;

    public sc60(ho60 ho60Var, mh60 mh60Var) {
        this.a = ho60Var;
    }

    @Override // xsna.xo60
    public final boolean a(List<? extends ol60> list) {
        return list.equals(this.c);
    }

    @Override // xsna.xo60
    public final ol60 b(int i) {
        return (ol60) j5g.b0(i, this.c);
    }

    @Override // xsna.xo60
    public final long c(int i) {
        c9x c9xVar = this.d;
        int a = c9xVar.a(i);
        if (a >= 0) {
            return c9xVar.c[a];
        }
        return 0L;
    }

    @Override // xsna.xo60
    public final void clear() {
        this.b.e();
        this.c = EmptyList.b;
        this.d = d9x.a;
        this.a.notifyItemRangeChanged(0, 0);
    }

    @Override // xsna.xo60
    public final void d(List<? extends ol60> list, c9x c9xVar) {
        this.b.e();
        this.c = list;
        this.d = c9xVar;
        this.a.notifyItemRangeChanged(0, list.size());
    }

    @Override // xsna.xo60
    public final void e(RecyclerView recyclerView, Runnable runnable, Runnable runnable2, final List list, final c9x c9xVar) {
        int i = this.e + 1;
        this.e = i;
        if (list == this.c && c9xVar == this.d) {
            wjf0.c(recyclerView, new j6k(runnable, new se0(29), runnable2, 4));
            return;
        }
        if (list.isEmpty()) {
            int size = this.c.size();
            this.c = EmptyList.b;
            this.d = c9xVar;
            wjf0.c(recyclerView, new j6k(runnable, new qkq(this, size, 1), runnable2, 4));
            return;
        }
        if (this.c.isEmpty()) {
            this.c = list;
            this.d = c9xVar;
            wjf0.c(recyclerView, new j6k(runnable, new pw(18, this, list), runnable2, 4));
        } else {
            final List<? extends ol60> list2 = this.c;
            final c9x c9xVar2 = this.d;
            io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable(this) { // from class: xsna.pc60
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ArrayList a = i7o0.a(list2);
                    c9x c9xVar3 = c9xVar2;
                    og50 og50Var = new og50(c9xVar3.e);
                    og50Var.e(c9xVar3);
                    return androidx.recyclerview.widget.m.a(new lh60(a, list, og50Var, c9xVar), true);
                }
            });
            asu0 asu0Var = asu0.a;
            this.b.b(io.reactivex.rxjava3.subjects.c.b(asu0Var, vVar).m(asu0Var.d()).subscribe(new kjs(new qc60(this, i, recyclerView, runnable, runnable2, list, c9xVar), 7), new zk30(new h2w(12), 6)));
        }
    }

    @Override // xsna.xo60
    public final ol60 getItem(int i) {
        return this.c.get(i);
    }

    @Override // xsna.xo60
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // xsna.xo60
    public final List<ol60> getItems() {
        return this.c;
    }
}
