package xsna;

import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class g7w0 extends z6w0 {
    public final VmojiStickerPackPreviewModel b;
    public final boolean c;

    public g7w0(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel, boolean z) {
        this.b = vmojiStickerPackPreviewModel;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7w0)) {
            return false;
        }
        g7w0 g7w0Var = (g7w0) obj;
        return epx.f(this.b, g7w0Var.b) && this.c == g7w0Var.c;
    }

    @Override // xsna.z6w0, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiCharacterMyStickerPackItem(pack=");
        sb.append(this.b);
        sb.append(", isMyCharacter=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
