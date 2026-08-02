package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.hv9;
import xsna.iv9;

/* compiled from: CarouselPromosListViewHolder.kt */
/* loaded from: classes6.dex */
public final class jv9 extends vfz<iv9> {
    public final hv9.a l;
    public final a m;

    /* compiled from: CarouselPromosListViewHolder.kt */
    public static final class a extends qul {
    }

    public jv9(ViewGroup viewGroup, hv9.a aVar) {
        super(R.layout.vk_pay_checkout_bonuses_carousel_promos_list_item, viewGroup);
        this.l = aVar;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.vk_pay_checkout_bonuses_carousel_recyclerview);
        a aVar2 = new a(true);
        aVar2.x0(iv9.a.class, new w5(this, 12));
        this.m = aVar2;
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(aVar2);
        int a2 = iah0.a(6);
        recyclerView.addItemDecoration(new dhk0(a2, a2, a2, a2));
        new g6e0().attachToRecyclerView(recyclerView);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(iv9 iv9Var) {
        this.m.setItems(iv9Var.b);
    }
}
