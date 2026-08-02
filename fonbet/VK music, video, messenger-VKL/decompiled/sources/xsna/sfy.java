package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;

/* compiled from: StickersKeyboardItems.kt */
/* loaded from: classes6.dex */
public final class sfy extends rf6 {
    public final String b;
    public final int c;
    public final StickerStockItem d;
    public final gzs<ContextUser> e;
    public final gzs<UserId> f;

    public sfy() {
        throw null;
    }

    public sfy(String str, int i, StickerStockItem stickerStockItem, gzs gzsVar, gzs gzsVar2, int i2) {
        stickerStockItem = (i2 & 4) != 0 ? null : stickerStockItem;
        gzsVar = (i2 & 16) != 0 ? qfy.c : gzsVar;
        gzsVar2 = (i2 & 32) != 0 ? rfy.c : gzsVar2;
        this.b = str;
        this.c = i;
        this.d = stickerStockItem;
        this.e = gzsVar;
        this.f = gzsVar2;
    }

    @Override // xsna.rf6
    public final int a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfy)) {
            return false;
        }
        sfy sfyVar = (sfy) obj;
        return epx.f(this.b, sfyVar.b) && this.c == sfyVar.c && epx.f(this.d, sfyVar.d) && epx.f(this.e, sfyVar.e) && epx.f(this.f, sfyVar.f);
    }

    @Override // xsna.rf6, xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.c);
    }

    public final int hashCode() {
        int a = shy.a(this.c, this.b.hashCode() * 31, 31);
        StickerStockItem stickerStockItem = this.d;
        return this.f.hashCode() + sf3.a((a + (stickerStockItem == null ? 0 : stickerStockItem.hashCode())) * 961, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardHeaderItem(title=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", pack=");
        sb.append(this.d);
        sb.append(", ref=null, contextUserProvider=");
        sb.append(this.e);
        sb.append(", currentUserProvider=");
        return uf3.d(sb, this.f, ')');
    }
}
