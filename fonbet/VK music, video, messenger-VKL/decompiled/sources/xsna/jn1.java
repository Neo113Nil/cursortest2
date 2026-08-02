package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AlbumsItem.kt */
/* loaded from: classes4.dex */
public final class jn1 extends xe6 {
    public final RecyclerView.Adapter<?> b;
    public final oa c;
    public wss0 d;

    /* compiled from: AlbumsItem.kt */
    public final class a extends vif0<jn1> {
        public final RecyclerView n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0, viewGroup);
            RecyclerView recyclerView = (RecyclerView) jn1.this.c.invoke(viewGroup.getContext());
            recyclerView.addOnItemTouchListener(new j0n());
            wss0 wss0Var = jn1.this.d;
            if (wss0Var != null) {
                wss0Var.invoke(recyclerView);
            }
            RecyclerView recyclerView2 = (RecyclerView) this.itemView;
            this.n = recyclerView2;
            recyclerView2.setLayoutParams(new RecyclerView.p(-1, -2));
        }

        @Override // xsna.vif0
        public final void i6(jn1 jn1Var) {
            RecyclerView.Adapter<?> adapter = jn1Var.b;
            RecyclerView recyclerView = this.n;
            if (!epx.f(adapter, recyclerView.getAdapter())) {
                recyclerView.setAdapter(adapter);
            }
            jn1.this.getClass();
        }
    }

    public jn1() {
        throw null;
    }

    public jn1(em1 em1Var) {
        oa oaVar = new oa(3);
        this.b = em1Var;
        this.c = oaVar;
    }

    @Override // xsna.xe6
    public final vif0 a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.xe6
    public final int b() {
        return 0;
    }

    public final void d(wss0 wss0Var) {
        this.d = wss0Var;
    }
}
