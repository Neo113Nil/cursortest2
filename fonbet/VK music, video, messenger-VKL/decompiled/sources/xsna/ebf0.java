package xsna;

import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class ebf0 extends z6w0 {
    public final VmojiStickerPackPreviewModel b;

    public ebf0(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel) {
        this.b = vmojiStickerPackPreviewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebf0) && epx.f(this.b, ((ebf0) obj).b);
    }

    @Override // xsna.z6w0, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RecommendationsBlockStickerPackItem(pack=" + this.b + ')';
    }
}
