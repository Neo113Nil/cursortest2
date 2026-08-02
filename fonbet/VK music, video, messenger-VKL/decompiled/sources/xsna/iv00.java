package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vkontakte.android.R;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.ev00;
import xsna.gm50;
import xsna.mk50;

/* compiled from: MarketCategoriesFilterBottomSheet.kt */
/* loaded from: classes18.dex */
public final class iv00 extends tl50<mv00, sv00, ev00> {
    public static final /* synthetic */ int p1 = 0;
    public di30 i1;
    public b j1;
    public Integer k1;
    public RecyclerView l1;
    public boolean n1;
    public final LinkedList<gzs<s3q0>> m1 = new LinkedList<>();
    public boolean o1 = true;

    /* compiled from: MarketCategoriesFilterBottomSheet.kt */
    public static final class a extends dw20.b {
        public final MarketBridgeCategory e;
        public di30 f;
        public MarketBridgeCategory g;

        public a(Context context, MarketBridgeCategory marketBridgeCategory) {
            super(context, tzp0.a(null, 3));
            this.e = marketBridgeCategory;
            w0(context.getString(R.string.market_filter_categories_title));
            c(new a470());
            q0(true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            iv00 iv00Var = new iv00();
            Pair pair = new Pair("categories_tree", this.e);
            MarketBridgeCategory marketBridgeCategory = this.g;
            iv00Var.setArguments(yfb.b(pair, new Pair("picked_category", marketBridgeCategory != null ? Integer.valueOf(marketBridgeCategory.b) : null)));
            iv00Var.i1 = this.f;
            return iv00Var;
        }
    }

    /* compiled from: MarketCategoriesFilterBottomSheet.kt */
    public static final class b extends sxm {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.market_filter_categories);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        b bVar = new b();
        bVar.x0(vv00.class, new dam(16));
        bVar.setHasStableIds(true);
        this.j1 = bVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setAdapter(this.j1);
        wy00 wy00Var = new wy00(new krh(this, 28));
        wy00Var.g = false;
        wy00Var.c = 250L;
        wy00Var.d = 250L;
        wy00Var.e = 400L;
        recyclerView.setItemAnimator(wy00Var);
        jv00 jv00Var = new jv00();
        gpu0 gpu0Var = new gpu0(recyclerView.getContext());
        gpu0Var.j = jv00Var;
        gpu0Var.i = iah0.a(16);
        gpu0Var.h = iah0.a(10.0f);
        recyclerView.addItemDecoration(gpu0Var);
        this.l1 = recyclerView;
        gm50.a.b(this, ((sv00) ao50Var).a, new bq00(this, 2));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((mv00) vk50Var).h.a(new d9j(this, 24), this);
    }

    @Override // xsna.tl50
    public final void Yn(sv00 sv00Var, View view) {
        hvt0.a(R.id.market_apply_category, view, new lwh(this, 23));
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        return new mk50.b(R.layout.market_filter_categories_bottom);
    }

    public final void bo(int i, List list) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (this.n1 && (((recyclerView = this.l1) != null && recyclerView.isComputingLayout()) || (recyclerView2 = this.l1) == null || recyclerView2.getScrollState() != 0)) {
            RecyclerView recyclerView3 = this.l1;
            if (recyclerView3 != null) {
                recyclerView3.post(new fv00(this, list, i, 0));
                return;
            }
            return;
        }
        b bVar = this.j1;
        if (bVar != null) {
            bVar.setItems(list);
        }
        if (this.k1 != null || this.o1) {
            return;
        }
        this.m1.add(new hv00(this, i, 0));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        List list;
        MarketBridgeCategory marketBridgeCategory = (MarketBridgeCategory) bundle.getParcelable("categories_tree");
        Integer d = bo8.d(bundle, "picked_category");
        if (d != null) {
            this.k1 = d;
        }
        if (marketBridgeCategory == null || (list = marketBridgeCategory.e) == null) {
            list = EmptyList.b;
        }
        MarketBridgeCategory marketBridgeCategory2 = null;
        if (d != null) {
            int intValue = d.intValue();
            if (marketBridgeCategory != null) {
                marketBridgeCategory2 = marketBridgeCategory.a(intValue);
            }
        }
        return new mv00(list, marketBridgeCategory2, ev00.b.b, new qv00(new rv00(0)));
    }
}
