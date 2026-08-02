package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.details.fragment.StickerDetailsFragment;
import com.vkontakte.android.R;

/* compiled from: StickersDetailsRouter.kt */
/* loaded from: classes5.dex */
public final class u9l0 {
    public final FragmentManager a;
    public final UiTracker.a b;

    public u9l0(FragmentActivity fragmentActivity, FragmentManager fragmentManager) {
        this.a = fragmentManager;
        UiTracker uiTracker = UiTracker.a;
        this.b = UiTracker.f(fragmentActivity);
    }

    public final void a(StickerStockItem stickerStockItem, ContextUser contextUser, GiftData giftData, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        StickerDetailsFragment.a aVar = new StickerDetailsFragment.a(StickerDetailsFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("sticker_pack_data", stickerStockItem);
        bundle.putParcelable("key_context_user", contextUser);
        bundle.putParcelable("key_gift_data", giftData);
        if (searchStatsLoggingInfo != null) {
            bundle.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
        }
        FragmentImpl f = aVar.f();
        StringBuilder sb = new StringBuilder("sticker_pack_");
        sb.append(stickerStockItem.b);
        sb.append('_');
        FragmentManager fragmentManager = this.a;
        sb.append(fragmentManager.K());
        String sb2 = sb.toString();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
        aVar2.i(R.anim.fade_in_200ms, R.anim.fade_out_200ms, 0, 0);
        aVar2.r = true;
        aVar2.g(R.id.fragment_container, f, sb2);
        aVar2.d(sb2);
        aVar2.k(false);
        fragmentManager.F();
        this.b.a(null, f, true);
    }
}
