package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyType;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: ProductPropertyVariantsImageGridHolder.kt */
/* loaded from: classes18.dex */
public final class ord0 extends vif0<ird0> {
    public final RecyclerView n;
    public final TextView o;
    public final View p;
    public final GridLayoutManager q;
    public final lrd0 r;
    public boolean s;
    public ird0 t;

    /* compiled from: ProductPropertyVariantsImageGridHolder.kt */
    public final class a implements ja80 {
        public final GoodFragment b;

        public a(GoodFragment goodFragment) {
            this.b = goodFragment;
        }

        @Override // xsna.ja80
        public final void V3(krd0 krd0Var, krd0 krd0Var2) {
            ord0 ord0Var = ord0.this;
            ird0 ird0Var = ord0Var.t;
            if (ird0Var != null) {
                String str = ird0Var.a;
                TextView textView = ord0Var.o;
                if (krd0Var != null) {
                    str = ord0Var.itemView.getContext().getString(R.string.good_property_name_mask, str, krd0Var.c);
                }
                textView.setText(str);
            }
            this.b.V3(krd0Var, krd0Var2);
        }
    }

    public ord0(ViewGroup viewGroup, GoodFragment goodFragment) {
        super(viewGroup, R.layout.product_property_variants_image_grid, 0);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.variants);
        this.n = recyclerView;
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        View findViewById = this.itemView.findViewById(R.id.show_all_btn);
        this.p = findViewById;
        this.itemView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(10, 1);
        this.q = gridLayoutManager;
        lrd0 lrd0Var = new lrd0(ProductPropertyType.TYPE_IMAGE, new a(goodFragment));
        this.r = lrd0Var;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(lrd0Var);
        bwt0.R(recyclerView, new kqp(this, 1));
        findViewById.setOnClickListener(new v3o(this, 8));
    }

    @Override // xsna.vif0
    public final void i6(ird0 ird0Var) {
        ird0 ird0Var2 = ird0Var;
        this.t = ird0Var2;
        String str = ird0Var2.a;
        krd0 krd0Var = ird0Var2.d;
        if (krd0Var != null) {
            str = this.itemView.getContext().getString(R.string.good_property_name_mask, str, krd0Var.c);
        }
        this.o.setText(str);
        q6(ird0Var2);
        this.r.L0(ird0Var2.d);
    }

    public final void q6(ird0 ird0Var) {
        GridLayoutManager gridLayoutManager = this.q;
        if (gridLayoutManager.s <= 0) {
            return;
        }
        this.s = true;
        View view = this.p;
        f4m.j(view);
        boolean z = this.s;
        lrd0 lrd0Var = this.r;
        if (z) {
            lrd0Var.setItems(ird0Var.c);
            return;
        }
        int i = gridLayoutManager.s * 2;
        ArrayList arrayList = ird0Var.c;
        int indexOf = arrayList.indexOf(ird0Var.d);
        if (i >= arrayList.size() || indexOf >= i) {
            f4m.j(view);
            this.s = true;
            i = arrayList.size();
        } else {
            view.setVisibility(0);
        }
        lrd0Var.setItems(arrayList.subList(0, i));
    }
}
