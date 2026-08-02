package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: KeyboardNavigationItems.kt */
/* loaded from: classes6.dex */
public final class kgy extends ngy {
    public final StickerStockItem b;
    public final boolean c;
    public final boolean d;

    public kgy(StickerStockItem stickerStockItem, boolean z, boolean z2) {
        this.b = stickerStockItem;
        this.c = z;
        this.d = z2;
    }

    public static kgy f(kgy kgyVar, boolean z, boolean z2, int i) {
        StickerStockItem stickerStockItem = kgyVar.b;
        if ((i & 2) != 0) {
            z = kgyVar.c;
        }
        if ((i & 4) != 0) {
            z2 = kgyVar.d;
        }
        return new kgy(stickerStockItem, z, z2);
    }

    @Override // xsna.jgy
    public final jgy a(boolean z) {
        return f(this, false, z, 3);
    }

    @Override // xsna.jgy
    public final boolean b() {
        return this.d;
    }

    @Override // xsna.ngy
    public final ngy c(boolean z) {
        return f(this, z, false, 5);
    }

    @Override // xsna.ngy
    public final boolean d() {
        return this.c;
    }

    @Override // xsna.ngy
    public final StickerStockItem e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgy)) {
            return false;
        }
        kgy kgyVar = (kgy) obj;
        return epx.f(this.b, kgyVar.b) && this.c == kgyVar.c && this.d == kgyVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardNavigationStickerPackItem(pack=");
        sb.append(this.b);
        sb.append(", hasNotViewed=");
        sb.append(this.c);
        sb.append(", selected=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
