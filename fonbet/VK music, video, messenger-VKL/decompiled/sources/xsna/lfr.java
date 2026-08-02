package xsna;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.lists.ListDataSet;

/* compiled from: FiltersAdapter.kt */
/* loaded from: classes16.dex */
public final class lfr extends zoj0<CatalogFilterData, ngr> {
    public final izs<String, s3q0> e;

    /* JADX WARN: Multi-variable type inference failed */
    public lfr(ListDataSet<CatalogFilterData> listDataSet, izs<? super String, s3q0> izsVar) {
        super(listDataSet);
        this.e = izsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ngr ngrVar = (ngr) e0Var;
        CatalogFilterData catalogFilterData = (CatalogFilterData) this.c.c(i);
        ngrVar.l.setText(catalogFilterData.c);
        ImageView imageView = ngrVar.m;
        int a = i4a.a(catalogFilterData.d);
        Drawable a2 = a != 0 ? dhr0.t.a(a) : null;
        imageView.setImageDrawable(a2);
        imageView.setVisibility(a2 == null ? 8 : 0);
        bwt0.p0(ngrVar.n, catalogFilterData.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ngr ngrVar = new ngr(viewGroup);
        ngrVar.itemView.setOnClickListener(new lkc(1, this, ngrVar));
        return ngrVar;
    }
}
