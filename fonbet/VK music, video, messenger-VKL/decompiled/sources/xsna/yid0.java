package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.good.ui.d;
import com.vk.ecomm.market.impl.di.MarketInternalComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeEventTypeAddItem;
import com.vk.stat.scheme.CommonMarketStat$TypeEventTypeRemoveItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeAddItemToCart;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import java.util.Collections;
import java.util.List;

/* compiled from: ProductButtonsBinderCallbackImpl.kt */
/* loaded from: classes18.dex */
public final class yid0 implements d.a {
    public final cxo a;
    public final CommonMarketStat$TypeRefSource b;
    public final long c;
    public final UserId d;
    public final maz e;
    public final sv9 f;
    public final io.reactivex.rxjava3.subjects.f<by9> g = new io.reactivex.rxjava3.subjects.f<>();
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;
    public int j;

    /* compiled from: ProductButtonsBinderCallbackImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[by9.values().length];
            try {
                iArr[by9.Remove.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[by9.Add.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yid0(cxo cxoVar, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, long j, UserId userId, maz mazVar, sv9 sv9Var) {
        this.a = cxoVar;
        this.b = commonMarketStat$TypeRefSource;
        this.c = j;
        this.d = userId;
        this.e = mazVar;
        this.f = sv9Var;
    }

    @Override // com.vk.ecomm.market.good.ui.d.a
    public final void a(Context context) {
        cxo cxoVar = this.a;
        cxoVar.a.d().a(context, this.d, Integer.valueOf(cxoVar.w));
    }

    @Override // com.vk.ecomm.market.good.ui.d.a
    public final void b() {
        ffp0.b(this.a.a.e(), MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.ADD_ITEM_TO_CART, this.a, this.b);
        l(CommonMarketStat$TypeEventTypeAddItem.ADD_ITEM);
        this.g.onNext(by9.Add);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.ecomm.market.good.ui.d.a
    public final void c(r19 r19Var) {
        Owner owner;
        MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = r19Var.e ? MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CALL_CLICK : MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CALL_CLICK_2;
        cxo cxoVar = this.a;
        ffp0.b(cxoVar.a.e(), eventType, this.a, this.b);
        Good good = cxoVar.r;
        if (good == null || (owner = good.M) == null) {
            return;
        }
        String str = r19Var.a;
        String str2 = owner.c;
        Image image = owner.g;
        boolean z = r19Var.b;
        InaccessibilityMessage inaccessibilityMessage = r19Var.c;
        ((kz00) cxoVar.a.z.getValue()).b(r19Var.f, new jz00(str, str2, image, z, inaccessibilityMessage != null ? inaccessibilityMessage.b : null, inaccessibilityMessage != null ? inaccessibilityMessage.c : null, r19Var.d, new lx60(8, this, r19Var)));
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.ecomm.market.good.ui.d.a
    public final void d(Context context, UserId userId, boolean z) {
        MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = z ? MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER : MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER_2;
        cxo cxoVar = this.a;
        ffp0.b(cxoVar.a.e(), eventType, this.a, this.b);
        ((j2y0) cxoVar.a.p0.getValue()).getClass();
        j2y0.a("", new i2y0(userId, context, this.a, this.c, this.d, this.b), context.getString(R.string.market_chat_greetings));
    }

    @Override // com.vk.ecomm.market.good.ui.d.a
    public final void e(Context context, boolean z) {
        cxo cxoVar = this.a;
        Good good = cxoVar.r;
        if (good != null) {
            String str = good.K;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ffp0.b(cxoVar.a.e(), z ? MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK : MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK_2, this.a, this.b);
            this.e.a(context, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.ecomm.market.good.ui.d.a
    public final void f() {
        l(CommonMarketStat$TypeEventTypeAddItem.SET_ITEM_AMOUNT);
        ((gwh0) this.a.a.h0.getValue()).a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_ONE_MORE_OUT);
        this.g.onNext(by9.Add);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.ecomm.market.good.ui.d.a
    public final void g(Context context, boolean z) {
        cxo cxoVar = this.a;
        Good good = cxoVar.r;
        y4u y4uVar = cxoVar.a;
        UserId userId = cxoVar.q;
        if (good == null || userId == null) {
            return;
        }
        ffp0.b(y4uVar.e(), z ? MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER : MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER_2, this.a, this.b);
        ((j2y0) y4uVar.p0.getValue()).getClass();
        j2y0.a("", new i2y0(userId, context, this.a, this.c, this.d, this.b), context.getString(R.string.market_chat_greetings));
    }

    @Override // com.vk.ecomm.market.good.ui.d.a
    public final void h(Context context, String str, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String queryParameter = z ? jeq0.g(str).getQueryParameter("click_id") : null;
        MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = z2 ? MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK : MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK_2;
        cxo cxoVar = this.a;
        cxoVar.a.e().getClass();
        ffp0.a(eventType, "", cxoVar, this.b, queryParameter);
        this.e.a(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.ecomm.market.good.ui.d.a
    @SuppressLint({"ResourceType", "SuspiciousIndentation"})
    public final void i(Context context, Action action) {
        Good good = this.a.r;
        if (good != null) {
            String string = good.V ? context.getString(R.string.market_services_chat_greetings) : context.getString(R.string.market_chat_greetings);
            fz5 fz5Var = ((MarketInternalComponent) ((k7m) m7m.f((w8i) context)).mo408a(fpf0.a(MarketInternalComponent.class))).b;
            List singletonList = Collections.singletonList(new MarketAttachment(good));
            if ((39 & 8) != 0) {
                singletonList = null;
            }
            com.vk.extensions.a.b(action, context, null, null, null, singletonList, (39 & 16) != 0 ? null : string, null, null, 128);
        }
    }

    @Override // com.vk.ecomm.market.good.ui.d.a
    public final void j() {
        Good good = this.a.r;
        if (good != null) {
            CommonMarketStat$TypeEventTypeRemoveItem commonMarketStat$TypeEventTypeRemoveItem = good.x == 1 ? CommonMarketStat$TypeEventTypeRemoveItem.ALL : CommonMarketStat$TypeEventTypeRemoveItem.SET_ITEM_AMOUNT;
            UserId userId = good.c;
            long j = good.b;
            iid0 iid0Var = new iid0();
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            UiTrackingScreen b = UiTracker.j.b();
            SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, new MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem(userId.b, commonMarketStat$TypeEventTypeRemoveItem, Integer.valueOf((int) j), null, this.b, 8, null), 1);
            iid0Var.f = c;
            iid0Var.g = b2;
            iid0Var.q();
        }
        this.g.onNext(by9.Remove);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i, Context context) {
        cxo cxoVar = this.a;
        Good good = cxoVar.r;
        if (good != null) {
            int i2 = good.x + i;
            good.x = i2;
            UserId userId = good.c;
            long j = good.b;
            ((MarketComponent) ((k7m) m7m.f((w8i) context)).a(fpf0.a(MarketComponent.class))).U1().b((i2 == 1 && i == 1) ? new gu00(userId, j, i2) : i2 == 0 ? new iu00(userId, j, Math.abs(i)) : new hu00(i2 - i, i2, j, userId));
            Intent intent = new Intent("com.vkontakte.android.RELOAD_PROFILE");
            h010 h010Var = cxoVar.f;
            intent.putExtra("id", h010Var != null ? h010Var.c : null);
            n2i0.a(context, hf8.a, intent);
        }
    }

    public final void l(CommonMarketStat$TypeEventTypeAddItem commonMarketStat$TypeEventTypeAddItem) {
        Good good = this.a.r;
        if (good != null) {
            UserId userId = good.c;
            long j = good.b;
            iid0 iid0Var = new iid0();
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            UiTrackingScreen b = UiTracker.j.b();
            SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, new MobileOfficialAppsMarketStat$TypeAddItemToCart(userId.b, commonMarketStat$TypeEventTypeAddItem, Integer.valueOf((int) j), this.b), 1);
            iid0Var.f = c;
            iid0Var.g = b2;
            iid0Var.q();
        }
    }
}
