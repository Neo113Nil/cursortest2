package xsna;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stickers.details.AuthorSubscriptionRef;

/* compiled from: Contracts.kt */
/* loaded from: classes6.dex */
public interface g3l0 {
    void B(StickerStockItem stickerStockItem);

    void e();

    void j0(StickerStockItem stickerStockItem);

    void l0(StickerStockItem stickerStockItem);

    void m0(long j, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action);

    default void R(StickerStockItem stickerStockItem) {
    }

    default void k0(boolean z) {
    }

    default void N(StickerStockItem stickerStockItem, AuthorSubscriptionRef authorSubscriptionRef) {
    }
}
