package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NewsfeedSyncListDiffer.kt */
/* loaded from: classes4.dex */
public final class q070 implements xo60 {
    public final ho60 a;
    public final ArrayList<ol60> b = new ArrayList<>();
    public final og50 c = new og50();

    public q070(ho60 ho60Var, mh60 mh60Var) {
        this.a = ho60Var;
    }

    @Override // xsna.xo60
    public final boolean a(List<? extends ol60> list) {
        return list.equals(this.b);
    }

    @Override // xsna.xo60
    public final ol60 b(int i) {
        return (ol60) j5g.b0(i, this.b);
    }

    @Override // xsna.xo60
    public final long c(int i) {
        og50 og50Var = this.c;
        int a = og50Var.a(i);
        if (a >= 0) {
            return og50Var.c[a];
        }
        return 0L;
    }

    @Override // xsna.xo60
    public final void clear() {
        this.b.clear();
        this.c.b();
        this.a.notifyItemRangeChanged(0, 0);
    }

    @Override // xsna.xo60
    public final void d(List<? extends ol60> list, c9x c9xVar) {
        ArrayList<ol60> arrayList = this.b;
        arrayList.clear();
        arrayList.addAll(list);
        og50 og50Var = this.c;
        og50Var.b();
        og50Var.e(c9xVar);
        this.a.notifyItemRangeChanged(0, list.size());
    }

    @Override // xsna.xo60
    public final void e(RecyclerView recyclerView, final Runnable runnable, final Runnable runnable2, final List list, final c9x c9xVar) {
        wjf0.c(recyclerView, new gzs() { // from class: xsna.p070
            @Override // xsna.gzs
            public final Object invoke() {
                runnable.run();
                q070 q070Var = this;
                ArrayList<ol60> arrayList = q070Var.b;
                ArrayList a = i7o0.a(arrayList);
                og50 og50Var = q070Var.c;
                og50 og50Var2 = new og50(og50Var.e);
                og50Var2.e(og50Var);
                List list2 = list;
                c9x c9xVar2 = c9xVar;
                m.d a2 = androidx.recyclerview.widget.m.a(new lh60(a, list2, og50Var2, c9xVar2), true);
                arrayList.clear();
                arrayList.addAll(list2);
                og50Var.b();
                og50Var.e(c9xVar2);
                a2.b(q070Var.a);
                runnable2.run();
                return s3q0.a;
            }
        });
    }

    @Override // xsna.xo60
    public final ol60 getItem(int i) {
        return this.b.get(i);
    }

    @Override // xsna.xo60
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // xsna.xo60
    public final List getItems() {
        return this.b;
    }
}
