package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public abstract class d890 extends RecyclerView.Adapter {
    public final b890 a;
    public tls b;
    public wls c;
    public final gjj w;

    public d890(b890 b890Var, zij zijVar) {
        this.a = b890Var;
        this.w = new gjj(zijVar);
        c890 c890Var = new c890(this);
        b890Var.b();
        b890Var.g(c890Var);
    }

    public final Object getItem(int i) {
        this.a.c(i);
        gjj gjjVar = this.w;
        Object obj = gjjVar.c.get(i);
        if (obj != null) {
            return obj;
        }
        ny61.m(oyr.h(i, gjjVar.c.size(), "Index: ", "; Data size: "));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.c.size();
    }
}
