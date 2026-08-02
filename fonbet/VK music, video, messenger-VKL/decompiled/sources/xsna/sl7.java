package xsna;

import android.view.ViewGroup;
import com.vk.dto.stickers.bonus.StickerStockItemDiscounts;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;

/* compiled from: BonusRewardsPageHolder.kt */
/* loaded from: classes5.dex */
public final class sl7 extends vfz<tl7> implements c.m<StickerStockItemDiscounts> {
    public final RecyclerPaginatedView l;
    public final a m;
    public final com.vk.lists.c n;
    public final bpn0 o;
    public boolean p;

    /* compiled from: BonusRewardsPageHolder.kt */
    public static final class a extends sxm implements vic {
        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public sl7(ViewGroup viewGroup, ql7 ql7Var) {
        super(R.layout.stickers_bonus_reward_page_item, viewGroup);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.itemView.findViewById(R.id.list);
        this.l = recyclerPaginatedView;
        a aVar = new a();
        aVar.x0(ol7.class, new k00(ql7Var, 11));
        this.m = aVar;
        this.o = new bpn0(new x5(5));
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        recyclerPaginatedView.getRecyclerView().setScrollBarStyle(33554432);
        f4m.y(cn70.b(12), recyclerPaginatedView.getRecyclerView());
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.setAdapter(aVar);
        c.h hVar = new c.h(this);
        hVar.i = 20;
        hVar.l = false;
        hVar.m = false;
        this.n = com.vk.lists.f.a(hVar, recyclerPaginatedView);
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<StickerStockItemDiscounts> O9(String str, com.vk.lists.c cVar) {
        return ((v8l0) this.o.getValue()).b(str, this.p);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(tl7 tl7Var) {
        this.p = tl7Var.b;
        this.n.p(false);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<StickerStockItemDiscounts> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<StickerStockItemDiscounts> qVar, boolean z, com.vk.lists.c cVar) {
        hg1.b(this.l, qVar.subscribe(new bw(new rl7(cVar, z, this, 0), 10), kwg0.b()));
    }
}
