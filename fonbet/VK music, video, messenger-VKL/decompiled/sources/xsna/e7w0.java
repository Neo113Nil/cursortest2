package xsna;

import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class e7w0 extends z6w0 {
    public final VmojiStickerPackPreviewModel b;

    public e7w0(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel) {
        this.b = vmojiStickerPackPreviewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7w0) && epx.f(this.b, ((e7w0) obj).b);
    }

    @Override // xsna.z6w0, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VmojiCharacterMyHiddenStickerPackItem(pack=" + this.b + ')';
    }
}
