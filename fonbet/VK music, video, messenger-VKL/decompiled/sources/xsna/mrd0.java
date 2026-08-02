package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyType;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: ProductPropertyVariantsGridHolder.kt */
/* loaded from: classes18.dex */
public final class mrd0 extends vif0<ird0> {
    public final GoodFragment n;
    public final RecyclerView o;
    public final TextView p;

    public mrd0(ViewGroup viewGroup, GoodFragment goodFragment) {
        super(viewGroup, R.layout.product_property_variants_grid, 0);
        this.n = goodFragment;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.variants);
        this.o = recyclerView;
        this.p = (TextView) this.itemView.findViewById(R.id.title);
        recyclerView.setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new ehk0(iah0.a(8), true));
    }

    @Override // xsna.vif0
    public final void i6(ird0 ird0Var) {
        ird0 ird0Var2 = ird0Var;
        this.p.setText(ird0Var2.a);
        RecyclerView recyclerView = this.o;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        lrd0 lrd0Var = new lrd0(ProductPropertyType.TYPE_COLOR, this.n);
        lrd0Var.setItems(ird0Var2.c);
        lrd0Var.L0(ird0Var2.d);
        recyclerView.setAdapter(lrd0Var);
    }
}
