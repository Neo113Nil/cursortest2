package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: StickerSettingsVmojiPackHolder.kt */
/* loaded from: classes6.dex */
public final class u6l0 extends qf6 {
    public static final int p = cn70.b(40);
    public final com.vk.stickers.settings.g l;
    public final VKImageView m;
    public final TextView n;
    public final ImageView o;

    public u6l0(ViewGroup viewGroup, com.vk.stickers.settings.g gVar) {
        super(R.layout.sticker_settings_vmoji_pack_item, viewGroup);
        this.l = gVar;
        this.m = (VKImageView) this.itemView.findViewById(R.id.photo);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (ImageView) this.itemView.findViewById(R.id.more);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        ImageSize Cb;
        ImageSize Cb2;
        v6l0 v6l0Var = (v6l0) hfzVar;
        VmojiAvatarModel vmojiAvatarModel = v6l0Var.c;
        boolean Cb3 = vmojiAvatarModel.b.Cb();
        String string = this.itemView.getContext().getString(R.string.vmoji_my_character);
        TextView textView = this.n;
        textView.setText(string);
        boolean M = dhr0.M();
        String str = null;
        int i = p;
        if (M) {
            Image image = vmojiAvatarModel.d;
            if (image != null && (Cb2 = image.Cb(i, false, false)) != null) {
                str = Cb2.d.d;
            }
        } else {
            Image image2 = vmojiAvatarModel.c;
            if (image2 != null && (Cb = image2.Cb(i, false, false)) != null) {
                str = Cb.d.d;
            }
        }
        VKImageView vKImageView = this.m;
        vKImageView.s0(str);
        if (Cb3) {
            textView.setAlpha(1.0f);
            vKImageView.setAlpha(1.0f);
        } else {
            textView.setAlpha(0.4f);
            vKImageView.setAlpha(0.4f);
        }
        jjc.g(this.o, new h5n(this, Cb3, v6l0Var, 1));
        jjc.g(this.itemView, new uwi0(1, this, v6l0Var));
    }
}
