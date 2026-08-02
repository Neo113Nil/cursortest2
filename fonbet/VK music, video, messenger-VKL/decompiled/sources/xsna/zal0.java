package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.UserProfile;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: StickersBridge.kt */
/* loaded from: classes5.dex */
public interface zal0 {
    static /* synthetic */ void D(zal0 zal0Var, Context context, int i, Collection collection, String str, String str2, int i2) {
        if ((i2 & 4) != 0) {
            collection = null;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        zal0Var.k(context, i, collection, str, str2);
    }

    static /* synthetic */ void H(zal0 zal0Var, Context context, int i, GiftData giftData, ContextUser contextUser, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, int i2) {
        if ((i2 & 4) != 0) {
            giftData = GiftData.d;
        }
        zal0Var.l(context, i, giftData, (i2 & 8) != 0 ? null : contextUser, (i2 & 16) != 0 ? null : str, true, (i2 & 64) != 0 ? null : searchStatsLoggingInfo);
    }

    static void e(zal0 zal0Var, Context context, List list, String str, int i) {
        if ((i & 2) != 0) {
            list = EmptyList.b;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str = null;
        }
        zal0Var.d(context, list2, false, str, null);
    }

    static /* synthetic */ void m(zal0 zal0Var, Context context, StickerStockItem stickerStockItem, GiftData giftData, ContextUser contextUser, int i) {
        if ((i & 4) != 0) {
            giftData = GiftData.d;
        }
        GiftData giftData2 = giftData;
        if ((i & 8) != 0) {
            contextUser = null;
        }
        zal0Var.q(context, stickerStockItem, giftData2, contextUser, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void z(zal0 zal0Var, Context context, StickerStockItem stickerStockItem, GiftData giftData, ContextUser contextUser, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, gzs gzsVar, int i) {
        if ((i & 32) != 0) {
            searchStatsLoggingInfo = null;
        }
        if ((i & 64) != 0) {
            gzsVar = null;
        }
        zal0Var.s(context, stickerStockItem, giftData, contextUser, str, searchStatsLoggingInfo, gzsVar);
    }

    void B(Context context, List list, StickerStockItem stickerStockItem, String str);

    void E(Context context, StickerStockItem stickerStockItem, Collection<UserId> collection, ContextUser contextUser, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, izs<? super Collection<Integer>, s3q0> izsVar);

    void F(Context context, String str);

    void G(Context context, String str, SearchStatsLoggingInfo searchStatsLoggingInfo);

    void a(Context context, int i, izs izsVar, String str);

    void b(Context context, GiftData giftData, ContextUser contextUser);

    void c(Context context, int i, Collection<UserId> collection, ContextUser contextUser, boolean z, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, izs<? super Collection<Integer>, s3q0> izsVar);

    void d(Context context, List<UserId> list, boolean z, String str, String str2);

    void g(Context context, Collection collection, CatalogedGift catalogedGift, String str);

    void j(Context context, int i, GiftData giftData, ContextUser contextUser, String str);

    void k(Context context, int i, Collection collection, String str, String str2);

    void l(Context context, int i, GiftData giftData, ContextUser contextUser, String str, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo);

    void n(Context context, String str, Map<String, String> map);

    void p(Context context, boolean z);

    void q(Context context, StickerStockItem stickerStockItem, GiftData giftData, ContextUser contextUser, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo);

    void r(Context context, UserId userId, String str);

    void s(Context context, StickerStockItem stickerStockItem, GiftData giftData, ContextUser contextUser, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, gzs<s3q0> gzsVar);

    void t(Context context, int i, UserId userId, String str, String str2);

    void u(Context context, boolean z, List<Long> list, ContextUser contextUser, String str);

    void v(Context context, String str, String str2, List list);

    void w(Context context, ArrayList arrayList, Collection collection, String str);

    void y(c5l0 c5l0Var, List<? extends n1l0> list, int i, View view);

    default void C(Context context) {
    }

    default void h(Context context) {
    }

    default void f(Context context, UserProfile userProfile, String str) {
    }

    default void o(Context context, Attach attach, Boolean bool, long j) {
    }

    default void x(Context context, String str, String str2, long j) {
    }

    default void A(Context context, ArrayList arrayList, List list, da7 da7Var, String str) {
    }
}
