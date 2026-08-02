package xsna;

import com.vk.dto.stickers.StickerItem;

/* compiled from: StickerAdapterItems.kt */
/* loaded from: classes2.dex */
public final class d8l0 implements hfz {
    public final StickerItem b;
    public final boolean c;

    public d8l0(StickerItem stickerItem, boolean z) {
        this.b = stickerItem;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8l0)) {
            return false;
        }
        d8l0 d8l0Var = (d8l0) obj;
        return epx.f(this.b, d8l0Var.b) && this.c == d8l0Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerViewItem(sticker=");
        sb.append(this.b);
        sb.append(", canAnimate=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
