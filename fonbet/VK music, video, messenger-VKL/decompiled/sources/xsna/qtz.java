package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.x7a;

/* compiled from: LoadingStubHolder.kt */
/* loaded from: classes6.dex */
public final class qtz extends e9r0<x7a.c> {
    public final View m;
    public final View n;
    public final ShimmerFrameLayout o;
    public final qrm0 p;

    public qtz(ViewGroup viewGroup) {
        super(R.layout.vk_item_apps_catalog_loading_stub, viewGroup);
        this.m = this.itemView.findViewById(R.id.stub_header);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.stub_items_recycler);
        this.n = this.itemView.findViewById(R.id.stub_indicator);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.stub_items_shimmer);
        this.o = shimmerFrameLayout;
        qrm0 qrm0Var = new qrm0();
        this.p = qrm0Var;
        recyclerView.setHasFixedSize(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4, 1));
        recyclerView.setAdapter(qrm0Var);
        shimmerFrameLayout.b(m3r0.a(krv0.m(R.attr.vk_ui_background_secondary, this.itemView.getContext()), this.itemView.getContext()));
    }

    @Override // xsna.v96
    public final void W5(Object obj) {
        x7a.c cVar = (x7a.c) obj;
        awt0.v(this.m, cVar.e);
        awt0.v(this.n, cVar.f);
        int i = cVar.d * 4;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(s3q0.a);
        }
        qrm0 qrm0Var = this.p;
        ArrayList arrayList2 = qrm0Var.c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        qrm0Var.notifyDataSetChanged();
        boolean z = cVar.g;
        ShimmerFrameLayout shimmerFrameLayout = this.o;
        if (z) {
            shimmerFrameLayout.c();
        } else {
            shimmerFrameLayout.d();
        }
    }
}
