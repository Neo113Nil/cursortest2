package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.views.sticker.StickerPackPreview;
import java.util.Collection;
import xsna.u4a;

/* compiled from: VkAndroidAutoEntryPointFactory.kt */
/* loaded from: classes16.dex */
public final class g8u0 implements t4a {
    public final t4a a;

    public g8u0(t4a t4aVar) {
        this.a = t4aVar;
    }

    @Override // xsna.t4a
    public final u4a.a a(Bundle bundle, String str) {
        return this.a.a(bundle, str);
    }

    /* compiled from: VkAndroidAutoEntryPointFactory.kt */
    public static final class a implements f9l0 {
        public static final a a = new a();

        @Override // xsna.f9l0
        public final void c(Context context, StickerStockItem stickerStockItem, String str) {
        }

        @Override // xsna.f9l0
        public final void d(Context context, StickerPackPreview stickerPackPreview, String str) {
        }

        @Override // xsna.f9l0
        public final void a(Context context, StickerStockItem stickerStockItem, String str, Collection<UserId> collection) {
        }

        @Override // xsna.f9l0
        public final void e(Context context, StickerPackPreview stickerPackPreview, String str, Collection<UserId> collection) {
        }

        @Override // xsna.f9l0
        public final void b(Context context, int i, String str, GiftData giftData, ContextUser contextUser, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        }

        @Override // xsna.f9l0
        public final void f(Context context, StickerStockItem stickerStockItem, String str, GiftData giftData, ContextUser contextUser, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        }
    }
}
