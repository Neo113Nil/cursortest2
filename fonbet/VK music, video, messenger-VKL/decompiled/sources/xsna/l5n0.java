package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;

/* compiled from: SuggestedStickerBigHolder.kt */
/* loaded from: classes6.dex */
public final class l5n0 extends vfz<n5n0> {
    public final VKStickerPackView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;

    public l5n0(ViewGroup viewGroup) {
        super(R.layout.suggested_sticker_big_item, viewGroup);
        this.l = (VKStickerPackView) this.itemView.findViewById(R.id.pack_image);
        this.m = (TextView) this.itemView.findViewById(R.id.badge);
        this.n = (TextView) this.itemView.findViewById(R.id.pack_title);
        this.o = (TextView) this.itemView.findViewById(R.id.pack_subtitle);
        this.p = (TextView) this.itemView.findViewById(R.id.pack_subsubtitle);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(n5n0 n5n0Var) {
        n5n0 n5n0Var2 = n5n0Var;
        VKStickerPackView vKStickerPackView = this.l;
        vKStickerPackView.setPlaceHolder(null);
        vKStickerPackView.setPackBackground(R.drawable.shape_suggested_sticker_big);
        StickerStockItemWithStickerId stickerStockItemWithStickerId = n5n0Var2.b;
        vKStickerPackView.setSticker(new xf4(13, stickerStockItemWithStickerId, vKStickerPackView));
        StickerStockItem stickerStockItem = stickerStockItemWithStickerId.b;
        dgr0.a(vKStickerPackView, stickerStockItem);
        String str = stickerStockItem.d;
        this.n.setText(str);
        p5l0.a(this.m, stickerStockItem.E);
        p5l0.c(this.o, this.p, stickerStockItem, false);
        vKStickerPackView.setContentDescription(this.itemView.getContext().getString(R.string.sticker_details_overlay_sticker_title, str));
        jjc.g(this.itemView, new apg(stickerStockItem, this, n5n0Var2, 6));
    }
}
