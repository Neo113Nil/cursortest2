package xsna;

import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.vk.dto.stickers.StickerStockItem;
import com.vkontakte.android.R;

/* compiled from: PackStyleHeaderHolder.kt */
/* loaded from: classes6.dex */
public final class x690 extends yr6<y690> {
    public final g3l0 l;
    public final TextView m;
    public final ImageButton n;
    public final ImageButton o;

    public x690(g3l0 g3l0Var, ViewGroup viewGroup) {
        super(R.layout.stickerpack_style_header_view_item, viewGroup);
        this.l = g3l0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.style_title_text);
        this.n = (ImageButton) this.itemView.findViewById(R.id.style_title_close);
        this.o = (ImageButton) this.itemView.findViewById(R.id.wish_list_button);
    }

    @Override // xsna.yr6
    /* renamed from: i6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void i6(y690 y690Var) {
        StickerStockItem stickerStockItem = y690Var.b;
        this.m.setText(stickerStockItem.d);
        boolean z = y690Var.c;
        ImageButton imageButton = this.n;
        bwt0.p0(imageButton, z);
        jjc.g(imageButton, new mm1(22, this, y690Var));
        Boolean bool = y690Var.d;
        ImageButton imageButton2 = this.o;
        if (bool == null) {
            bwt0.p0(imageButton2, false);
            return;
        }
        boolean booleanValue = bool.booleanValue();
        bwt0.p0(imageButton2, true);
        jjc.g(imageButton2, new il7(12, this, stickerStockItem));
        if (booleanValue) {
            imageButton2.setImageResource(R.drawable.vk_icon_list_like_fill_28);
            imageButton2.setColorFilter(krv0.m(R.attr.vk_ui_icon_accent, this.itemView.getContext()));
            imageButton2.setContentDescription(b6().getString(R.string.stickers_wish_list_added_content_descr));
        } else {
            imageButton2.setImageResource(R.drawable.vk_icon_list_like_outline_28);
            imageButton2.setColorFilter(krv0.m(R.attr.vk_ui_icon_tertiary, this.itemView.getContext()));
            imageButton2.setContentDescription(b6().getString(R.string.stickers_wish_list_add_content_descr));
        }
    }
}
