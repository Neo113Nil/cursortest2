package xsna;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;

/* compiled from: CommunityProfileContentMarketInfoBlockAdapter.kt */
/* loaded from: classes5.dex */
public final class rjh extends zoj0<a010, a> {
    public final cq6 e;

    /* compiled from: CommunityProfileContentMarketInfoBlockAdapter.kt */
    public static final class a extends vif0<a010> {
        public final gzs<s3q0> n;
        public final boolean o;
        public final ComposeView p;

        public a(ViewGroup viewGroup, cq6 cq6Var) {
            super(new ComposeView(viewGroup.getContext(), null, 6));
            this.n = cq6Var;
            TypedValue typedValue = krv0.a;
            this.o = epx.f(krv0.i(this.itemView.getContext()), Boolean.FALSE);
            this.p = (ComposeView) this.itemView;
        }

        @Override // xsna.vif0
        public final void i6(a010 a010Var) {
            this.p.setContent(new jai(1356126768, new a6(3, a010Var, this), true));
        }
    }

    public rjh(cq6 cq6Var) {
        this.e = cq6Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ListDataSet) this.c).d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        a aVar = (a) e0Var;
        a010 a010Var = (a010) this.c.c(i);
        awt0.v(aVar.itemView, a010Var != null);
        if (a010Var != null) {
            aVar.V5(a010Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.community_item_content_market_new_info_block_item, viewGroup, false);
        return new a(viewGroup, this.e);
    }
}
