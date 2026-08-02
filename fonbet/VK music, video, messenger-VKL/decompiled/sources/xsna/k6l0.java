package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: StickerSettingsPackHolder.kt */
/* loaded from: classes6.dex */
public final class k6l0 extends qf6 {
    public static final int p = cn70.b(40);
    public final com.vk.stickers.settings.g l;
    public final VKImageView m;
    public final TextView n;
    public final ImageView o;

    public k6l0(ViewGroup viewGroup, com.vk.stickers.settings.g gVar) {
        super(R.layout.sticker_settings_pack_item, viewGroup);
        this.l = gVar;
        this.m = (VKImageView) this.itemView.findViewById(R.id.photo);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (ImageView) this.itemView.findViewById(R.id.action_icon);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        l6l0 l6l0Var = (l6l0) hfzVar;
        StickerStockItem stickerStockItem = l6l0Var.c;
        String str = stickerStockItem.d;
        TextView textView = this.n;
        textView.setText(str);
        int i = p;
        String str2 = i > 70 ? stickerStockItem.s : i > 35 ? stickerStockItem.r : stickerStockItem.q;
        VKImageView vKImageView = this.m;
        vKImageView.s0(str2);
        boolean z = l6l0Var.d;
        ImageView imageView = this.o;
        if (z) {
            textView.setAlpha(1.0f);
            vKImageView.setAlpha(1.0f);
            imageView.setImageResource(R.drawable.vk_icon_cancel_24);
            imageView.setContentDescription(this.itemView.getContext().getString(R.string.sticker_settings_accessibility_delete));
        } else {
            textView.setAlpha(0.4f);
            vKImageView.setAlpha(0.4f);
            imageView.setImageResource(R.drawable.vk_icon_add_24);
            imageView.setContentDescription(this.itemView.getContext().getString(R.string.sticker_settings_accessibility_add));
        }
        jjc.g(this.itemView, new lyb0(3, this, l6l0Var));
        jjc.g(imageView, new lx60(12, this, l6l0Var));
    }
}
