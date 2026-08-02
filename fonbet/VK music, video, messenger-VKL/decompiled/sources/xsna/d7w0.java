package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.imageloader.view.VKImageView;
import com.vk.vmoji.character.model.BaseUrlImageModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vkontakte.android.R;
import java.util.Map;

/* compiled from: VmojiCharacterMyHiddenStickerPackHolder.kt */
/* loaded from: classes7.dex */
public final class d7w0 extends u6w0<e7w0> {
    public final b8w0 l;
    public final VKImageView m;
    public final TextView n;
    public final TextView o;
    public final View p;

    public d7w0(ViewGroup viewGroup, b8w0 b8w0Var) {
        super(R.layout.vmoji_character_my_hidden_sticker_pack_item, viewGroup);
        this.l = b8w0Var;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.icon);
        this.m = vKImageView;
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.description);
        this.p = this.itemView.findViewById(R.id.more);
        vKImageView.setPaintFilterBitmap(true);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        String str;
        e7w0 e7w0Var = (e7w0) hfzVar;
        VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = e7w0Var.b;
        this.n.setText(vmojiStickerPackPreviewModel.c);
        this.o.setText(vmojiStickerPackPreviewModel.e);
        jjc.g(this.p, new uwi0(7, this, e7w0Var));
        BaseUrlImageModel baseUrlImageModel = vmojiStickerPackPreviewModel.j;
        if (baseUrlImageModel != null) {
            int b = cn70.b(48);
            Serializer.c<BaseUrlImageModel> cVar = BaseUrlImageModel.CREATOR;
            str = baseUrlImageModel.zb(b, (Map) u5d0.a.getValue(), baseUrlImageModel.c);
        } else {
            str = null;
        }
        this.m.load(str);
        jjc.g(this.itemView, new np5(25, this, e7w0Var));
    }
}
