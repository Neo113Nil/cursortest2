package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.stickers.ContextUser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyboardPageData.kt */
/* loaded from: classes6.dex */
public final class tgy {
    public final List<StickerStockItem> a;
    public final List<StickerStockItem> b;
    public final List<ewp0> c;
    public final List<StickerItem> d;
    public final List<StickerItem> e;
    public final ContextUser f;
    public final UGCChatSettingsModel g;
    public final vbf0 h;

    public tgy(ArrayList arrayList, List list, List list2, List list3, List list4, ContextUser contextUser, UGCChatSettingsModel uGCChatSettingsModel, vbf0 vbf0Var) {
        this.a = arrayList;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = contextUser;
        this.g = uGCChatSettingsModel;
        this.h = vbf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgy)) {
            return false;
        }
        tgy tgyVar = (tgy) obj;
        return epx.f(this.a, tgyVar.a) && epx.f(this.b, tgyVar.b) && epx.f(this.c, tgyVar.c) && epx.f(this.d, tgyVar.d) && epx.f(this.e, tgyVar.e) && epx.f(this.f, tgyVar.f) && epx.f(this.g, tgyVar.g) && epx.f(this.h, tgyVar.h);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        ContextUser contextUser = this.f;
        int hashCode = (this.g.hashCode() + ((a + (contextUser == null ? 0 : contextUser.hashCode())) * 31)) * 31;
        vbf0 vbf0Var = this.h;
        return hashCode + (vbf0Var != null ? vbf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardPageData(stickers=" + this.a + ", vmojiStickers=" + this.b + ", ugcStickers=" + this.c + ", recentStickers=" + this.d + ", favoritesStickers=" + this.e + ", contextUser=" + this.f + ", ugcSettings=" + this.g + ", recommendations=" + this.h + ')';
    }
}
