package xsna;

import com.vk.dto.stickers.StickerStockItem;
import java.util.List;

/* compiled from: KeyboardNavigationItems.kt */
/* loaded from: classes6.dex */
public final class mgy extends ngy {
    public final StickerStockItem b;
    public final boolean c;
    public final boolean d;
    public final List<StickerStockItem> e;
    public final StickerStockItem f;

    public mgy(StickerStockItem stickerStockItem, boolean z, boolean z2, List<StickerStockItem> list, StickerStockItem stickerStockItem2) {
        this.b = stickerStockItem;
        this.c = z;
        this.d = z2;
        this.e = list;
        this.f = stickerStockItem2;
    }

    public static mgy f(mgy mgyVar, boolean z, boolean z2, StickerStockItem stickerStockItem, int i) {
        StickerStockItem stickerStockItem2 = mgyVar.b;
        if ((i & 2) != 0) {
            z = mgyVar.c;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = mgyVar.d;
        }
        boolean z4 = z2;
        List<StickerStockItem> list = mgyVar.e;
        if ((i & 16) != 0) {
            stickerStockItem = mgyVar.f;
        }
        return new mgy(stickerStockItem2, z3, z4, list, stickerStockItem);
    }

    @Override // xsna.jgy
    public final jgy a(boolean z) {
        return f(this, false, z, null, 27);
    }

    @Override // xsna.jgy
    public final boolean b() {
        return this.d;
    }

    @Override // xsna.ngy
    public final ngy c(boolean z) {
        return f(this, z, false, null, 29);
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
        if (!(obj instanceof mgy)) {
            return false;
        }
        mgy mgyVar = (mgy) obj;
        return epx.f(this.b, mgyVar.b) && this.c == mgyVar.c && this.d == mgyVar.d && epx.f(this.e, mgyVar.e) && epx.f(this.f, mgyVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + fw3.a(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "KeyboardNavigationVmojiGroupItem(pack=" + this.b + ", hasNotViewed=" + this.c + ", selected=" + this.d + ", packs=" + this.e + ", selectedPack=" + this.f + ')';
    }
}
