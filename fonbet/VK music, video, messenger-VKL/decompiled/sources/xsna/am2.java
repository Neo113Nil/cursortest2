package xsna;

import android.view.ViewGroup;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;

/* compiled from: AnimatedStickerHolder.kt */
/* loaded from: classes6.dex */
public final class am2 extends vfz<zl2> {
    public final ImStickerView l;

    public am2(g3l0 g3l0Var, ViewGroup viewGroup) {
        super(new ImStickerView(viewGroup.getContext(), null, 6));
        ImStickerView imStickerView = (ImStickerView) this.itemView;
        this.l = imStickerView;
        viewGroup.getContext();
        int a = iah0.a(8);
        imStickerView.setPadding(a, a, a, a);
        imStickerView.setClickable(true);
        imStickerView.setContentDescription(imStickerView.getContext().getString(R.string.stickers_accessibility_sticker));
        imStickerView.setFadeDuration(100);
    }

    @Override // xsna.vfz
    public final void W5(zl2 zl2Var) {
        StickerItem stickerItem = zl2Var.c;
        ImStickerView imStickerView = this.l;
        ImStickerView.b(imStickerView, stickerItem, null, 4);
        imStickerView.setTag(R.id.id, Integer.valueOf(stickerItem.b));
    }
}
