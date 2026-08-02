package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vk.vmoji.character.view.VmojiStickerPackPreviewView;
import com.vkontakte.android.R;

/* compiled from: VmojiRecommendationsBlockStickerPackHolder.kt */
/* loaded from: classes7.dex */
public final class paw0 extends u6w0<ebf0> {
    public final b8w0 l;
    public final VmojiStickerPackPreviewView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;

    public paw0(ViewGroup viewGroup, b8w0 b8w0Var) {
        super(R.layout.vmoji_character_stock_sticker_pack_item, viewGroup);
        this.l = b8w0Var;
        this.m = (VmojiStickerPackPreviewView) this.itemView.findViewById(R.id.pack_image);
        this.n = (TextView) this.itemView.findViewById(R.id.badge);
        this.o = (TextView) this.itemView.findViewById(R.id.pack_title);
        this.p = (TextView) this.itemView.findViewById(R.id.pack_subtitle);
        this.q = (TextView) this.itemView.findViewById(R.id.pack_subsubtitle);
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        ebf0 ebf0Var = (ebf0) hfzVar;
        VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = ebf0Var.b;
        this.m.setPack(vmojiStickerPackPreviewModel);
        this.o.setText(vmojiStickerPackPreviewModel.c);
        p8w0.b(this.n, vmojiStickerPackPreviewModel.h);
        p8w0.c(this.p, this.q, vmojiStickerPackPreviewModel.i);
        jjc.g(this.itemView, new x7t0(4, this, ebf0Var));
    }
}
