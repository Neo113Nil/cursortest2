package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.dto.common.Good;
import com.vk.dto.common.Price;

/* compiled from: CommunityProfileContentServicesRowAdapter.kt */
/* loaded from: classes5.dex */
public final class ykh extends zoj0<f5u, b> {
    public final n8 e;

    /* compiled from: CommunityProfileContentServicesRowAdapter.kt */
    public static final class a extends m.e<f5u> {
        public static boolean a(f5u f5uVar, f5u f5uVar2) {
            return f5uVar.getItemId().longValue() == f5uVar2.getItemId().longValue() && epx.f(f5uVar.b.c, f5uVar2.b.c);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(f5u f5uVar, f5u f5uVar2) {
            f5u f5uVar3 = f5uVar;
            f5u f5uVar4 = f5uVar2;
            Good good = f5uVar3.b;
            Good good2 = f5uVar4.b;
            return a(f5uVar3, f5uVar4) && epx.f(good.d, good2.d) && epx.f(good.h, good2.h);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final /* bridge */ /* synthetic */ boolean areItemsTheSame(f5u f5uVar, f5u f5uVar2) {
            return a(f5uVar, f5uVar2);
        }
    }

    /* compiled from: CommunityProfileContentServicesRowAdapter.kt */
    public static final class b extends vif0<f5u> {
        public final izs<Good, s3q0> n;
        public final noi0 o;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(ViewGroup viewGroup, n8 n8Var) {
            super(r0);
            noi0 noi0Var = new noi0(viewGroup.getContext());
            noi0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.n = n8Var;
            View view = this.itemView;
            this.o = (noi0) view;
            bwt0.i0(view, new zkh(this, 0));
        }

        @Override // xsna.vif0
        public final void i6(f5u f5uVar) {
            Good good = f5uVar.b;
            String str = good.d;
            noi0 noi0Var = this.o;
            noi0Var.setTitle(str);
            Price price = good.h;
            noi0Var.setOldPrice(price.f);
            noi0Var.setPrice(price.e);
        }
    }

    public ykh(n8 n8Var) {
        super(new com.vk.lists.a(new a()));
        this.e = n8Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(viewGroup, this.e);
    }
}
