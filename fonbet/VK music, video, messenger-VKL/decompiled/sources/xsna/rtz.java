package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.x7a;

/* compiled from: LoadingStubRedesignHolder.kt */
/* loaded from: classes6.dex */
public final class rtz extends e9r0<x7a.c> {
    public final ShimmerFrameLayout m;
    public final a n;

    /* compiled from: LoadingStubRedesignHolder.kt */
    public static final class a extends RecyclerView.Adapter<C3632a> {
        public final ArrayList c = new ArrayList();

        /* compiled from: LoadingStubRedesignHolder.kt */
        /* renamed from: xsna.rtz$a$a, reason: collision with other inner class name */
        public static final class C3632a extends v96<s3q0> {
            @Override // xsna.v96
            public final /* bridge */ /* synthetic */ void W5(s3q0 s3q0Var) {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(C3632a c3632a, int i) {
            this.c.get(i);
            c3632a.V5(s3q0.a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final C3632a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C3632a(R.layout.vk_item_apps_catalog_loading_stub_item_redesign, viewGroup);
        }
    }

    public rtz(ViewGroup viewGroup) {
        super(R.layout.vk_item_apps_catalog_loading_stub_redesign, viewGroup);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.stub_items_recycler);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.stub_items_shimmer);
        this.m = shimmerFrameLayout;
        a aVar = new a();
        this.n = aVar;
        recyclerView.setHasFixedSize(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4, 1));
        recyclerView.setAdapter(aVar);
        recyclerView.addItemDecoration(new hgu(iah0.a(8)));
        shimmerFrameLayout.b(m3r0.a(krv0.m(R.attr.vk_ui_background_secondary, this.itemView.getContext()), this.itemView.getContext()));
    }

    @Override // xsna.v96
    public final void W5(Object obj) {
        x7a.c cVar = (x7a.c) obj;
        int i = cVar.d * 4;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(s3q0.a);
        }
        a aVar = this.n;
        ArrayList arrayList2 = aVar.c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        aVar.notifyDataSetChanged();
        boolean z = cVar.g;
        ShimmerFrameLayout shimmerFrameLayout = this.m;
        if (z) {
            shimmerFrameLayout.c();
        } else {
            shimmerFrameLayout.d();
        }
    }
}
