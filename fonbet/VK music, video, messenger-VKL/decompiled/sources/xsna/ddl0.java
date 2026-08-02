package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;

/* compiled from: StickersStyleSelectorBottomSheet.kt */
/* loaded from: classes5.dex */
public final class ddl0 implements fcn {
    public final GiftData b;
    public final ContextUser c;
    public final String d;
    public final gzs<s3q0> e;
    public dw20 f;
    public kt8 g;
    public final ucl0 h;

    public ddl0(StickerStockItem stickerStockItem, GiftData giftData, ContextUser contextUser, String str, gzs<s3q0> gzsVar, UserId userId, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        String str2;
        this.b = giftData;
        this.c = contextUser;
        this.d = str;
        this.e = gzsVar;
        this.h = (searchStatsLoggingInfo == null || (str2 = searchStatsLoggingInfo.f) == null) ? null : new ucl0(str2, stickerStockItem.b);
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.f;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
