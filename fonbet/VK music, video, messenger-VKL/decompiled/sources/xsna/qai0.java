package xsna;

import com.vk.dto.stickers.StickerStockItem;

/* compiled from: SelectablePackItem.kt */
/* loaded from: classes6.dex */
public final class qai0 {
    public final StickerStockItem a;
    public boolean b;
    public boolean c;

    public qai0(StickerStockItem stickerStockItem, boolean z, boolean z2) {
        this.a = stickerStockItem;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qai0)) {
            return false;
        }
        qai0 qai0Var = (qai0) obj;
        return epx.f(this.a, qai0Var.a) && this.b == qai0Var.b && this.c == qai0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectablePackItem(pack=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", isViewed=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
