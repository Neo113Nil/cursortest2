package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vkontakte.android.R;

/* compiled from: StickerAdapterItem.kt */
/* loaded from: classes6.dex */
public final class x1l0 extends zif0 {
    public final StickerItem a;
    public final String b;
    public final boolean c = true;

    public x1l0(StickerItem stickerItem, String str) {
        this.a = stickerItem;
        this.b = str;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.pds_item_story_message_keyboard_sticker;
    }
}
