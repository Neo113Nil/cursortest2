package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.views.sticker.StickerPackPreview;
import java.util.Collection;

/* compiled from: StickersClickHandler.kt */
/* loaded from: classes6.dex */
public interface f9l0 {
    void a(Context context, StickerStockItem stickerStockItem, String str, Collection<UserId> collection);

    void b(Context context, int i, String str, GiftData giftData, ContextUser contextUser, SearchStatsLoggingInfo searchStatsLoggingInfo);

    void c(Context context, StickerStockItem stickerStockItem, String str);

    void d(Context context, StickerPackPreview stickerPackPreview, String str);

    void e(Context context, StickerPackPreview stickerPackPreview, String str, Collection<UserId> collection);

    void f(Context context, StickerStockItem stickerStockItem, String str, GiftData giftData, ContextUser contextUser, SearchStatsLoggingInfo searchStatsLoggingInfo);
}
