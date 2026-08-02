package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: TabletUiHelper.kt */
/* loaded from: classes3.dex */
public final class ayn0 {
    public final RecyclerView a;
    public final boolean b;
    public final boolean c;
    public final gzs<Boolean> d;
    public int e;
    public kt9 f;
    public final n44 g;

    public ayn0() {
        throw null;
    }

    public ayn0(RecyclerView recyclerView, gzs gzsVar, int i) {
        boolean z = (i & 2) != 0;
        boolean z2 = (i & 4) != 0;
        gzsVar = (i & 16) != 0 ? new vpn0(recyclerView, 1) : gzsVar;
        this.a = recyclerView;
        this.b = z;
        this.c = z2;
        this.d = gzsVar;
        this.g = new n44(this, 8);
        b();
        recyclerView.setVerticalScrollBarEnabled(false);
    }

    public final void a() {
        this.a.removeCallbacks(this.g);
    }

    public final void b() {
        RecyclerView recyclerView = this.a;
        int i = recyclerView.getContext().getResources().getConfiguration().screenWidthDp;
        this.e = i;
        int i2 = 0;
        if (i >= 924 && this.c) {
            i2 = iah0.a(Math.max(0, (i - 924) / 2));
        }
        int i3 = i2;
        awt0.x(recyclerView, i3, 0, i3, 0, 10);
        s3q0 s3q0Var = s3q0.a;
        if (this.b && this.d.invoke().booleanValue()) {
            n44 n44Var = this.g;
            recyclerView.removeCallbacks(n44Var);
            recyclerView.post(n44Var);
        }
    }
}
