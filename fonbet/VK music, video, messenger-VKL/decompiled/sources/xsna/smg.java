package xsna;

import android.content.Context;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.views.sticker.StickerPackPreview;
import java.util.Collection;
import kotlin.InitializedLazyImpl;

/* compiled from: CommonStickersClickHandler.kt */
/* loaded from: classes6.dex */
public final class smg implements f9l0 {
    public final Object a;
    public final Object b;

    public smg(zal0 zal0Var, obl0 obl0Var) {
        InitializedLazyImpl initializedLazyImpl = new InitializedLazyImpl(zal0Var);
        InitializedLazyImpl initializedLazyImpl2 = new InitializedLazyImpl(obl0Var);
        this.a = initializedLazyImpl;
        this.b = initializedLazyImpl2;
    }

    @Override // xsna.f9l0
    public void a(Context context, StickerStockItem stickerStockItem, String str, Collection collection) {
        ver0.c(context, hg1.m(rsg0.y0(new cqt(stickerStockItem.b), null, null, 3), context, 0L, false, 62).subscribe(new gf0(new m1d(collection, stickerStockItem, this, context, str, 1), 13), new da(new c2(18), 17)));
    }

    @Override // xsna.f9l0
    public void b(Context context, int i, String str, GiftData giftData, ContextUser contextUser, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        InitializedLazyImpl initializedLazyImpl = (InitializedLazyImpl) this.a;
        Collection<UserId> collection = giftData.b;
        if (collection == null) {
            zal0.H((zal0) initializedLazyImpl.getValue(), context, i, giftData, contextUser, str, searchStatsLoggingInfo, 32);
        } else {
            ((zal0) initializedLazyImpl.getValue()).c(context, i, collection, contextUser, false, str, searchStatsLoggingInfo, new lbe(contextUser, 6));
        }
    }

    @Override // xsna.f9l0
    public void c(Context context, StickerStockItem stickerStockItem, String str) {
        if (stickerStockItem.h || !stickerStockItem.i) {
            return;
        }
        if (str == null) {
            str = X3.i.U;
        }
        stickerStockItem.O = str;
        ((obl0) ((InitializedLazyImpl) this.b).getValue()).H7(stickerStockItem, new pmg(0, stickerStockItem, context));
    }

    @Override // xsna.f9l0
    public void d(Context context, StickerPackPreview stickerPackPreview, String str) {
        if (stickerPackPreview.g || !stickerPackPreview.h) {
            return;
        }
        ver0.c(context, hg1.m(rsg0.y0(new kil0(stickerPackPreview.b, null), null, null, 3), context, 0L, false, 62).subscribe(new t00(new vd6(str, this, new ud6(3, stickerPackPreview, context), 3), 19), new j22(new pl2(16), 17)));
    }

    @Override // xsna.f9l0
    public void e(Context context, StickerPackPreview stickerPackPreview, String str, Collection collection) {
        ver0.c(context, hg1.m(rsg0.y0(new cqt(stickerPackPreview.b), null, null, 3), context, 0L, false, 62).subscribe(new defpackage.i0(new qmg(collection, stickerPackPreview, this, context, str), 14), new cp0(new dj1(19), 15)));
    }

    @Override // xsna.f9l0
    public void f(Context context, StickerStockItem stickerStockItem, String str, GiftData giftData, ContextUser contextUser, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        InitializedLazyImpl initializedLazyImpl = (InitializedLazyImpl) this.a;
        if (str == null) {
            str = X3.i.U;
        }
        stickerStockItem.O = str;
        Collection<UserId> collection = giftData.b;
        if (collection == null) {
            ((zal0) initializedLazyImpl.getValue()).q(context, stickerStockItem, giftData, contextUser, false, searchStatsLoggingInfo);
        } else {
            ((zal0) initializedLazyImpl.getValue()).E(context, stickerStockItem, collection, contextUser, false, searchStatsLoggingInfo, new rmg(contextUser, 0));
        }
    }

    public smg(zs00 zs00Var) {
        yd10 yd10Var = new yd10();
        this.a = zs00Var;
        this.b = yd10Var;
    }
}
