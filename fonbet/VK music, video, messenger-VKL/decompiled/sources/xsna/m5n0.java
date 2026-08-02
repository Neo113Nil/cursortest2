package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.stickers.Badge;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.p5l0;
import xsna.u5d0;

/* compiled from: SuggestedStickerHolder.kt */
/* loaded from: classes6.dex */
public final class m5n0 extends vfz<n5n0> {
    public final VKImageView l;
    public final TextView m;

    public m5n0(ViewGroup viewGroup) {
        super(R.layout.suggested_sticker_item, viewGroup);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.pack_image);
        this.l = vKImageView;
        this.m = (TextView) this.itemView.findViewById(R.id.badge);
        vKImageView.getHierarchy().q(100);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(n5n0 n5n0Var) {
        Object obj;
        String z0;
        n5n0 n5n0Var2 = n5n0Var;
        StickerStockItemWithStickerId stickerStockItemWithStickerId = n5n0Var2.b;
        int i = stickerStockItemWithStickerId.c;
        StickerStockItem stickerStockItem = stickerStockItemWithStickerId.b;
        Iterator<T> it = stickerStockItem.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((StickerItem) obj).b == i) {
                    break;
                }
            }
        }
        StickerItem stickerItem = (StickerItem) obj;
        int b = cn70.b(60);
        if (stickerItem == null) {
            bpn0 bpn0Var = u5d0.a;
            z0 = u5d0.a.a(stickerStockItem, b);
        } else {
            t6g0 t6g0Var = t6g0.b;
            z0 = t6g0.d().z0(stickerItem, b, true);
        }
        VKImageView vKImageView = this.l;
        vKImageView.s0(z0);
        Badge badge = stickerStockItem.E;
        TextView textView = this.m;
        if (badge != null) {
            textView.setVisibility(0);
            textView.setText(badge.getText());
            Context context = textView.getContext();
            textView.setBackgroundTintList(p5l0.a.$EnumSwitchMapping$0[badge.zb().ordinal()] == 1 ? e3m.c(R.attr.vk_ui_background_accent, context) : e3m.c(R.attr.vk_ui_accent_red, context));
        } else {
            f4m.j(textView);
        }
        vKImageView.setContentDescription(this.itemView.getContext().getString(R.string.sticker_details_overlay_sticker_title, stickerStockItem.d));
        jjc.g(vKImageView, new v63(stickerStockItem, this, n5n0Var2, 12));
    }
}
