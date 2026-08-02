package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: HorizontalRecyclerItem.kt */
/* loaded from: classes5.dex */
public class jfv extends we6 {
    public final int g;
    public final RecyclerView.Adapter<?> h;
    public final izs<Context, UsableRecyclerView> i;
    public izs<? super UsableRecyclerView, s3q0> j;
    public b5h k;

    /* compiled from: HorizontalRecyclerItem.kt */
    public final class a extends vif0<jfv> {
        public final UsableRecyclerView n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0, viewGroup);
            UsableRecyclerView invoke = jfv.this.i.invoke(viewGroup.getContext());
            izs<? super UsableRecyclerView, s3q0> izsVar = jfv.this.j;
            if (izsVar != null) {
                izsVar.invoke(invoke);
            }
            UsableRecyclerView usableRecyclerView = (UsableRecyclerView) this.itemView;
            this.n = usableRecyclerView;
            usableRecyclerView.setLayoutParams(new RecyclerView.p(-1, -2));
        }

        @Override // xsna.vif0
        public final void i6(jfv jfvVar) {
            RecyclerView.Adapter<?> adapter = jfvVar.h;
            UsableRecyclerView usableRecyclerView = this.n;
            if (!epx.f(adapter, usableRecyclerView.getAdapter())) {
                usableRecyclerView.setAdapter(adapter);
            }
            b5h b5hVar = jfv.this.k;
            if (b5hVar != null) {
                b5hVar.invoke(Integer.valueOf(getAbsoluteAdapterPosition()));
            }
        }
    }

    public /* synthetic */ jfv(int i, zoj0 zoj0Var) {
        this(i, zoj0Var, new zos(3));
    }

    @Override // xsna.we6
    public final int h() {
        return this.g;
    }

    @Override // xsna.we6
    /* renamed from: k */
    public a a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jfv(int i, RecyclerView.Adapter<?> adapter, izs<? super Context, ? extends UsableRecyclerView> izsVar) {
        this.g = i;
        this.h = adapter;
        this.i = izsVar;
    }
}
