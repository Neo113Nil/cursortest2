package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;
import xsna.xaf0;

/* compiled from: RecommendedPackHolder.kt */
/* loaded from: classes6.dex */
public final class pdf0 extends vfz<qdf0> {
    public final xaf0.b l;
    public final VKStickerPackView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;

    public pdf0(ViewGroup viewGroup, xaf0.b bVar) {
        super(R.layout.sticker_details_recommendation_pack_item, viewGroup);
        this.l = bVar;
        this.m = (VKStickerPackView) this.itemView.findViewById(R.id.pack_image);
        this.n = (TextView) this.itemView.findViewById(R.id.badge);
        this.o = (TextView) this.itemView.findViewById(R.id.pack_title);
        this.p = (TextView) this.itemView.findViewById(R.id.pack_subtitle);
        this.q = (TextView) this.itemView.findViewById(R.id.pack_subsubtitle);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(qdf0 qdf0Var) {
        StickerStockItem stickerStockItem = qdf0Var.b;
        VKStickerPackView vKStickerPackView = this.m;
        dgr0.a(vKStickerPackView, stickerStockItem);
        String str = stickerStockItem.d;
        this.o.setText(str);
        p5l0.a(this.n, stickerStockItem.E);
        p5l0.c(this.p, this.q, stickerStockItem, false);
        vKStickerPackView.setContentDescription(this.itemView.getContext().getString(R.string.sticker_details_overlay_sticker_title, str));
        jjc.g(this.itemView, new qt5(25, this, stickerStockItem));
    }
}
