package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: EndlessHorizontalGalleryAdapter.kt */
/* loaded from: classes4.dex */
public final class ilp extends skf0<qi6<?>> {
    public final pdv d;

    public ilp(pdv pdvVar) {
        super(pdvVar);
        this.d = pdvVar;
    }

    @Override // xsna.skf0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // xsna.skf0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        pdv pdvVar = this.d;
        return pdvVar.getItemViewType(i % pdvVar.getItemCount());
    }

    @Override // xsna.skf0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        pdv pdvVar = this.d;
        pdvVar.onBindViewHolder((qi6) e0Var, i % pdvVar.getItemCount());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.skf0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        pdv pdvVar = this.d;
        t2r t2rVar = pdvVar.f;
        cr4 cr4Var = (cr4) pdvVar.g.getValue();
        d5r d5rVar = pdvVar.h;
        if (d5rVar == null) {
            d5rVar = null;
        }
        return t2rVar.a(viewGroup, i, cr4Var, d5rVar, (kdg0) pdvVar.i.getValue());
    }
}
