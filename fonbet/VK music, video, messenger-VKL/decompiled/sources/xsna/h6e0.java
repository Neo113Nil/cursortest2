package xsna;

import com.vk.dto.stickers.StickerItem;

/* compiled from: PromotedStickerEntity.kt */
/* loaded from: classes5.dex */
public final class h6e0 {
    public final int a;
    public final StickerItem b;
    public final long c;

    public h6e0(int i, StickerItem stickerItem, long j) {
        this.a = i;
        this.b = stickerItem;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6e0)) {
            return false;
        }
        h6e0 h6e0Var = (h6e0) obj;
        return this.a == h6e0Var.a && epx.f(this.b, h6e0Var.b) && this.c == h6e0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotedStickerEntity(id=");
        sb.append(this.a);
        sb.append(", sticker=");
        sb.append(this.b);
        sb.append(", lastUsedTime=");
        return vu5.a(')', this.c, sb);
    }
}
