package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.Good;
import com.vk.dto.market.GoodVariantItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketEditAlbumGoodsAdapter.kt */
/* loaded from: classes18.dex */
public final class tx00 extends RecyclerView.Adapter<sx00> {
    public final izs<Good, s3q0> c;
    public final izs<Good, Boolean> d;
    public List<Good> e = new ArrayList();
    public List<Long> f = EmptyList.b;

    /* JADX WARN: Multi-variable type inference failed */
    public tx00(izs<? super Good, s3q0> izsVar, izs<? super Good, Boolean> izsVar2) {
        this.c = izsVar;
        this.d = izsVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(sx00 sx00Var, int i) {
        boolean z;
        sx00 sx00Var2 = sx00Var;
        Good good = this.e.get(i);
        izs<Good, Boolean> izsVar = this.d;
        if (!izsVar.invoke(good).booleanValue()) {
            Iterable iterable = good.u;
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            Iterable iterable2 = iterable;
            ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((GoodVariantItem) it.next()).b));
            }
            if (p4g.b(arrayList, this.f)) {
                z = true;
                sx00Var2.q6(good, !this.f.contains(Long.valueOf(good.b)) || z, izsVar.invoke(good).booleanValue());
            }
        }
        z = false;
        sx00Var2.q6(good, !this.f.contains(Long.valueOf(good.b)) || z, izsVar.invoke(good).booleanValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final sx00 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new sx00(viewGroup, this.c);
    }
}
