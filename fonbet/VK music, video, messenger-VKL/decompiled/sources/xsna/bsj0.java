package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.csj0;

/* compiled from: SimplePostingListAdapter.kt */
/* loaded from: classes4.dex */
public final class bsj0 extends zoj0<csj0, RecyclerView.e0> {
    public final izs<csj0, s3q0> e;

    /* compiled from: SimplePostingListAdapter.kt */
    public final class a extends vif0<csj0> {
        public final ImageView n;
        public final TextView o;

        public a(bsj0 bsj0Var, ViewGroup viewGroup) {
            super(viewGroup, R.layout.holder_simple_posting, 0);
            this.n = (ImageView) this.itemView.findViewById(R.id.iv_type_image);
            this.o = (TextView) this.itemView.findViewById(R.id.tv_type_title);
            bwt0.i0(this.itemView, new g86(20, bsj0Var, this));
        }

        @Override // xsna.vif0
        public final void i6(csj0 csj0Var) {
            csj0 csj0Var2 = csj0Var;
            this.n.setImageResource(csj0Var2.a);
            this.o.setText(csj0Var2.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bsj0(izs<? super csj0, s3q0> izsVar) {
        this.e = izsVar;
        setItems(rl3.I(new csj0[]{csj0.d.c, csj0.c.c, g620.f().getExperiments().c() ? csj0.a.c : null, csj0.e.c}));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        a aVar = e0Var instanceof a ? (a) e0Var : null;
        if (aVar != null) {
            aVar.V5(this.c.c(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this, viewGroup);
    }
}
