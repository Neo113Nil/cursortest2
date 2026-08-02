package xsna;

import android.view.ViewGroup;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;

/* compiled from: AnimatedStickerHolder.kt */
/* loaded from: classes4.dex */
public final class bm2 extends do6 {
    public final ImStickerView F;

    public bm2(ViewGroup viewGroup) {
        super(R.layout.attach_sticker_animated, viewGroup);
        this.F = (ImStickerView) this.itemView.findViewById(R.id.image_rlottie);
    }

    @Override // xsna.m56
    public final void T6(StickerAttachment stickerAttachment) {
        int i = h9l0.b;
        ImStickerView imStickerView = this.F;
        bwt0.m0(i, i, imStickerView);
        ImStickerView.b(imStickerView, stickerAttachment.f, null, 6);
    }
}
