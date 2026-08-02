package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: SuperAppWidgetScrollStubHolder.kt */
/* loaded from: classes6.dex */
public final class ddn0 extends ucn0<edn0> {
    public static final int s = iah0.a(4);
    public static final int t = iah0.a(6);
    public final ShimmerFrameLayout p;
    public final a q;
    public final RecyclerView r;

    /* compiled from: SuperAppWidgetScrollStubHolder.kt */
    public static final class a extends gf6<c> {
        @Override // xsna.gf6
        public final hf6 K0(int i, View view) {
            b bVar = new b(view, null);
            ((ShimmerFrameLayout) view.findViewById(R.id.shimmer_layout)).b(bmf0.a(0, 30, bVar.itemView.getContext()));
            return bVar;
        }
    }

    /* compiled from: SuperAppWidgetScrollStubHolder.kt */
    public static final class b extends ucn0<c> {
        @Override // xsna.hf6
        public final /* bridge */ /* synthetic */ void W5(zif0 zif0Var) {
        }
    }

    /* compiled from: SuperAppWidgetScrollStubHolder.kt */
    public static final class c extends zif0 {
        @Override // xsna.zif0
        public final int b() {
            return R.layout.vk_super_app_widget_scroll_stub_item;
        }
    }

    public ddn0(View view) {
        super(view, null);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_layout);
        this.p = shimmerFrameLayout;
        a aVar = new a(null, 3);
        this.q = aVar;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.rv_apps);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        int i = t;
        int i2 = s;
        recyclerView.setPadding(i, 0, i2, i2);
        recyclerView.setAdapter(aVar);
        this.r = recyclerView;
        shimmerFrameLayout.b(bmf0.a(0, 30, this.itemView.getContext()));
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        ArrayList arrayList = new ArrayList(17);
        for (int i = 0; i < 17; i++) {
            arrayList.add(new c());
        }
        this.q.setItems(arrayList);
        ShimmerFrameLayout shimmerFrameLayout = this.p;
        if (!shimmerFrameLayout.isLaidOut() || shimmerFrameLayout.isLayoutRequested()) {
            shimmerFrameLayout.addOnLayoutChangeListener(new amf0(shimmerFrameLayout));
        } else {
            shimmerFrameLayout.a();
        }
        this.r.suppressLayout(true);
    }
}
