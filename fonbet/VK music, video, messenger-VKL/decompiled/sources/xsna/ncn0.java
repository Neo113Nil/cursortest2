package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.ui.SuperAppTilesRowLayoutManager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: SuperAppTileWidgetsRowHolder.kt */
/* loaded from: classes6.dex */
public final class ncn0 extends ucn0<mcn0> implements w160 {
    public static final int u = cn70.b(4);
    public final a p;
    public final SuperAppTilesRowLayoutManager q;
    public Pair<Integer, Integer> r;
    public final RecyclerView s;
    public final RecyclerView t;

    /* compiled from: SuperAppTileWidgetsRowHolder.kt */
    public static final class a extends ksl<zif0> {
        public final u7n0 j;

        public a(u7n0 u7n0Var) {
            super(new com.vk.lists.a(w8n0.a));
            this.j = u7n0Var;
        }

        @Override // xsna.gf6
        public final hf6 K0(int i, View view) {
            u7n0 u7n0Var = this.j;
            if (i == R.layout.vk_super_app_tile_widget_background_icon) {
                return new hcn0(view, u7n0Var);
            }
            if (i == R.layout.vk_super_app_tile_widget_big_icon) {
                return new jcn0(view, u7n0Var);
            }
            if (i == R.layout.vk_super_app_tile_widget_overlaped_icon) {
                return new lcn0(view, u7n0Var);
            }
            if (i == R.layout.vk_super_app_tile_widget_grid_icons) {
                return new kcn0(view, u7n0Var);
            }
            if (i == R.layout.vk_super_app_showcase_half_tile_widget) {
                return new sdn0(view, u7n0Var);
            }
            if (i == R.layout.vk_super_app_showcase_user_stack_half_tile_widget) {
                return new fen0(view, u7n0Var);
            }
            if (i == R.layout.vk_super_app_showcase_progress_half_tile_widget) {
                return new mdn0(view, u7n0Var);
            }
            throw new IllegalStateException(lhg.a(i, "Unsupported viewType = "));
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ ncn0 e;

        public b(RecyclerView recyclerView, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, ncn0 ncn0Var) {
            this.b = recyclerView;
            this.c = ref$IntRef;
            this.d = ref$IntRef2;
            this.e = ncn0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            RecyclerView recyclerView = this.b;
            int measuredWidth = recyclerView.getMeasuredWidth();
            int measuredHeight = recyclerView.getMeasuredHeight();
            Ref$IntRef ref$IntRef = this.c;
            int i = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.d;
            if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                ref$IntRef.element = measuredWidth;
                ref$IntRef2.element = measuredHeight;
                ncn0 ncn0Var = this.e;
                if (ncn0Var.r.i().intValue() != measuredWidth || ncn0Var.r.j().intValue() != measuredHeight) {
                    ncn0Var.p.notifyDataSetChanged();
                }
                ncn0Var.r = new Pair<>(Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
            }
            return s3q0.a;
        }
    }

    public ncn0(View view, u7n0 u7n0Var, RecyclerView.u uVar) {
        super(view, null);
        a aVar = new a(u7n0Var);
        this.p = aVar;
        SuperAppTilesRowLayoutManager superAppTilesRowLayoutManager = new SuperAppTilesRowLayoutManager(u, aVar);
        this.q = superAppTilesRowLayoutManager;
        this.r = new Pair<>(0, 0);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.tiles_row_recycler_view);
        recyclerView.setClipToPadding(false);
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.setLayoutManager(superAppTilesRowLayoutManager);
        recyclerView.setAdapter(aVar);
        awt0.g(recyclerView);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = recyclerView.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = recyclerView.getMeasuredHeight();
        f4m.a(recyclerView, new b(recyclerView, ref$IntRef, ref$IntRef2, this));
        this.s = recyclerView;
        this.t = recyclerView;
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        boolean z;
        mcn0 mcn0Var = (mcn0) zif0Var;
        ArrayList arrayList = mcn0Var.e;
        int i = mcn0Var.d;
        SuperAppTilesRowLayoutManager superAppTilesRowLayoutManager = this.q;
        superAppTilesRowLayoutManager.e = i;
        if (arrayList.size() <= i) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((f9n0) it.next()) instanceof y8n0)) {
                    }
                }
            }
            z = true;
            superAppTilesRowLayoutManager.d = z;
            this.p.setItems(arrayList);
        }
        z = false;
        superAppTilesRowLayoutManager.d = z;
        this.p.setItems(arrayList);
    }

    @Override // xsna.w160
    public final RecyclerView v4() {
        return this.t;
    }
}
