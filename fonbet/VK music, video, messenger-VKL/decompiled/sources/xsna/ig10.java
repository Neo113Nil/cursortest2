package xsna;

import com.vk.dto.stickers.StickerItem;

/* compiled from: ClickableItem.kt */
/* loaded from: classes15.dex */
public final class ig10 implements njc {
    public final StickerItem a;

    public ig10(StickerItem stickerItem) {
        this.a = stickerItem;
    }

    @Override // xsna.njc
    public final boolean a(njc njcVar) {
        return (njcVar instanceof ig10) && epx.f(this.a, njcVar);
    }

    @Override // xsna.njc
    public final boolean b(njc njcVar) {
        return (njcVar instanceof ig10) && this.a.b == ((ig10) njcVar).a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ig10) && epx.f(this.a, ((ig10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Mask(sticker=" + this.a + ')';
    }
}
