package xsna;

import com.vk.dto.stickers.StickerStockItem;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VmojiSelectorViewState.kt */
/* loaded from: classes15.dex */
public final class ebw0 {
    public final List<StickerStockItem> a;
    public final StickerStockItem b;
    public final boolean c;

    public ebw0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebw0)) {
            return false;
        }
        ebw0 ebw0Var = (ebw0) obj;
        return epx.f(this.a, ebw0Var.a) && epx.f(this.b, ebw0Var.b) && this.c == ebw0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        StickerStockItem stickerStockItem = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (stickerStockItem == null ? 0 : stickerStockItem.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiSelectorViewState(packs=");
        sb.append(this.a);
        sb.append(", selectedPack=");
        sb.append(this.b);
        sb.append(", isExpanded=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public ebw0(List<StickerStockItem> list, StickerStockItem stickerStockItem, boolean z) {
        this.a = list;
        this.b = stickerStockItem;
        this.c = z;
    }

    public ebw0(int i) {
        this(EmptyList.b, null, false);
    }
}
