package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VmojiPromoInSuggestsEntity.kt */
/* loaded from: classes5.dex */
public final class kaw0 {
    public final List<StickersDictionaryItemLight> a;
    public final List<StickerItem> b;

    public kaw0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaw0)) {
            return false;
        }
        kaw0 kaw0Var = (kaw0) obj;
        return epx.f(this.a, kaw0Var.a) && epx.f(this.b, kaw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiPromoInSuggestsEntity(dictionary=");
        sb.append(this.a);
        sb.append(", stickers=");
        return ms9.a(')', sb, this.b);
    }

    public kaw0(List<StickersDictionaryItemLight> list, List<StickerItem> list2) {
        this.a = list;
        this.b = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kaw0(int i) {
        this(r1, r1);
        EmptyList emptyList = EmptyList.b;
    }
}
