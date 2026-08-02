package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.stickers.bonus.StickerStockItemDiscount;
import com.vk.dto.stickers.bonus.StickerStockItemDiscounts;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.tlo0;

/* compiled from: BonusCatalogRewardsHolderDs.kt */
/* loaded from: classes5.dex */
public final class mk7 extends qf6 implements c.m<StickerStockItemDiscounts> {
    public final BonusCatalogFragment l;
    public final RecyclerPaginatedView m;
    public final bpn0 n;
    public final a o;
    public final com.vk.lists.c p;

    /* compiled from: BonusCatalogRewardsHolderDs.kt */
    public static final class a extends sxm implements vic {
        public final void J0(List<StickerStockItemDiscount> list) {
            ArrayList arrayList = new ArrayList();
            if (list.size() == 1) {
                arrayList.add(new lk7((StickerStockItemDiscount) j5g.Y(list), true));
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new lk7((StickerStockItemDiscount) it.next(), false));
                }
            }
            setItems(arrayList);
        }

        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    /* compiled from: BonusCatalogRewardsHolderDs.kt */
    public static final class b extends RecyclerView.n {
        public final int b = cn70.b(16);
        public final int c = cn70.b(6);

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            int i = this.c;
            int i2 = this.b;
            int i3 = childAdapterPosition == 0 ? i2 : i;
            if (childAdapterPosition == (recyclerView.getAdapter() != null ? r5.getItemCount() : 0) - 1) {
                i = i2;
            }
            rect.left += i3;
            rect.right += i;
        }
    }

    public mk7(ViewGroup viewGroup, BonusCatalogFragment bonusCatalogFragment) {
        super(viewGroup, R.layout.stickers_bonus_catalog_rewards_item_ds, 1);
        this.l = bonusCatalogFragment;
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView.findViewById(R.id.bonus_rewards_group_header);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.itemView.findViewById(R.id.paginated_view);
        this.m = recyclerPaginatedView;
        this.n = new bpn0(new pr6(1));
        a aVar = new a();
        aVar.x0(lk7.class, new mb(bonusCatalogFragment, 11));
        this.o = aVar;
        androidx.recyclerview.widget.w wVar = new androidx.recyclerview.widget.w();
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.stickers_bonus_catalog_rewards), null, null, null, 0, 510));
        tlo0.f fVar = new tlo0.f(R.string.stickers_bonus_catalog_show_all);
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        vkGroupHeader.setRight(new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(fVar, new hh1(this, 7), VkButton.Size.Small, null, appearance, null, 488), null, null, 6));
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
        dVar.f = 0;
        dVar.a();
        recyclerPaginatedView.setSwipeRefreshEnabled(false);
        recyclerPaginatedView.setAdapter(aVar);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setItemDecoration(new b());
        wVar.attachToRecyclerView(recyclerPaginatedView.getRecyclerView());
        c.h hVar = new c.h(this);
        hVar.i = 20;
        hVar.l = false;
        hVar.m = false;
        this.p = com.vk.lists.f.a(hVar, recyclerPaginatedView);
        this.itemView.setOnClickListener(new ci0(this, 2));
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<StickerStockItemDiscounts> O9(String str, com.vk.lists.c cVar) {
        return ((v8l0) this.n.getValue()).b(str, false);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        StickerStockItemDiscounts stickerStockItemDiscounts = ((nk7) hfzVar).c;
        this.p.s(stickerStockItemDiscounts.c);
        this.o.J0(stickerStockItemDiscounts.b);
        this.m.f0();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<StickerStockItemDiscounts> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<StickerStockItemDiscounts> qVar, boolean z, com.vk.lists.c cVar) {
        hg1.b(this.m, qVar.subscribe(new bg1(new mh1(cVar, z, this), 5), kwg0.b()));
    }
}
