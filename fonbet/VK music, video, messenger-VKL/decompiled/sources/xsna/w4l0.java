package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.stickers.StickerItem;

/* compiled from: StickerItemDiffCallback.kt */
/* loaded from: classes15.dex */
public final class w4l0 extends m.e<StickerItem> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(StickerItem stickerItem, StickerItem stickerItem2) {
        return stickerItem.equals(stickerItem2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(StickerItem stickerItem, StickerItem stickerItem2) {
        return stickerItem.b == stickerItem2.b;
    }
}
