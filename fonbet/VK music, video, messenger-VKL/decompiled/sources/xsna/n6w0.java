package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vk.vmoji.character.view.VmojiStickerPackPreviewView;
import com.vkontakte.android.R;

/* compiled from: VmojiCharacterGridStickerPackHolder.kt */
/* loaded from: classes7.dex */
public final class n6w0 extends u6w0<o6w0> {
    public final a l;
    public final VmojiStickerPackPreviewView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;

    /* compiled from: VmojiCharacterGridStickerPackHolder.kt */
    public interface a {
        void a(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel);
    }

    public n6w0(ViewGroup viewGroup, a aVar) {
        super(R.layout.vmoji_character_owned_sticker_pack_item, viewGroup);
        this.l = aVar;
        this.m = (VmojiStickerPackPreviewView) this.itemView.findViewById(R.id.pack_image);
        this.n = (TextView) this.itemView.findViewById(R.id.badge);
        this.o = (TextView) this.itemView.findViewById(R.id.pack_title);
        this.p = (TextView) this.itemView.findViewById(R.id.pack_subtitle);
        this.q = (TextView) this.itemView.findViewById(R.id.pack_subsubtitle);
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        o6w0 o6w0Var = (o6w0) hfzVar;
        VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = o6w0Var.b;
        this.m.setPack(vmojiStickerPackPreviewModel);
        this.o.setText(vmojiStickerPackPreviewModel.c);
        p8w0.b(this.n, vmojiStickerPackPreviewModel.h);
        p8w0.c(this.p, this.q, vmojiStickerPackPreviewModel.i);
        jjc.g(this.itemView, new tyw0(1, this, o6w0Var));
    }
}
