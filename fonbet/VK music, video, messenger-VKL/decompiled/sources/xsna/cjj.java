package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.fave.di.FaveComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ckj;
import xsna.mut0;
import xsna.tzp0;
import xsna.wcy;

/* compiled from: ContentProductsBottomSheet.kt */
/* loaded from: classes18.dex */
public final class cjj extends jmu0 {
    public static final b l1;
    public static final /* synthetic */ qcy<Object>[] m1;
    public final UserId h1;
    public final long i1;
    public final ujj j1;
    public final nzw k1;

    /* compiled from: ContentProductsBottomSheet.kt */
    public static final class a extends kmu0 implements w8i {
        public final UserId h;
        public final long i;
        public final q530 j;
        public final MarketComponent k;
        public final kw00 l;
        public final m08 m;
        public final rw9 n;
        public final isq o;
        public final sz00 p;
        public final kz00 q;
        public final fy9 r;
        public final maz s;
        public final lt00 t;
        public final yd10 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, UserId userId, long j) {
            super(context, new tzp0.c.a(new djj(), true));
            cjj.l1.getClass();
            this.h = userId;
            this.i = j;
            AppCompatActivity appCompatActivity = (AppCompatActivity) context;
            this.j = ((ModerationComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(ModerationComponent.class))).pa().b(context, appCompatActivity, false);
            MarketComponent marketComponent = (MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class));
            this.k = marketComponent;
            this.l = marketComponent.Y4();
            this.m = marketComponent.lc().b(appCompatActivity);
            this.n = new tw9(appCompatActivity, marketComponent.I1().a);
            this.o = ((FaveComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(FaveComponent.class))).xf();
            this.p = ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).Ob();
            this.q = ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).rc();
            this.r = ((CartComponent) ((k7m) m7m.f(this)).a(fpf0.a(CartComponent.class))).f8();
            this.s = ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).p().e();
            this.t = ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).l7();
            this.u = new yd10();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            F0(true);
            w();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new cjj(this.h, this.i, new ujj(this.j, this.l, this.m, this.n, this.o, this.u, this.p, this.q, this.r, this.s, this.t));
        }
    }

    /* compiled from: ContentProductsBottomSheet.kt */
    public static final class b {
    }

    /* compiled from: ContentProductsBottomSheet.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ckj, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ckj ckjVar) {
            String str;
            String str2;
            ckj ckjVar2 = ckjVar;
            cjj cjjVar = (cjj) this.receiver;
            UserId userId = cjjVar.h1;
            long j = cjjVar.i1;
            ujj ujjVar = cjjVar.j1;
            if (epx.f(ckjVar2, ckj.a.a)) {
                cjjVar.dismiss();
            } else if (epx.f(ckjVar2, ckj.b.a)) {
                fy9.a(ujjVar.i, cjjVar.requireContext(), cjjVar.h1, null, CommonMarketStat$TypeRefSource.POST_ATTACHED_MARKET_ITEMS, 4);
            } else if (ckjVar2 instanceof ckj.c) {
                sz00 sz00Var = ujjVar.g;
                Context requireContext = cjjVar.requireContext();
                hpd0 hpd0Var = ((ckj.c) ckjVar2).a;
                sz00Var.d(requireContext, new qz00(hpd0Var.a, hpd0Var.b, CommonMarketStat$TypeRefSource.POST_ATTACHED_MARKET_ITEMS, null, null, null, null, null, null, null, CommonMarketStat$TypeMarketContextContent.Type.POST, Integer.valueOf((int) j), Long.valueOf(userId.b), 987128));
            } else if (ckjVar2 instanceof ckj.d) {
                maz.c(ujjVar.j, cjjVar.requireContext(), ((ckj.d) ckjVar2).a, new LaunchContext(false, false, false, null, null, null, null, null, null, "POST_ATTACHED_MARKET_ITEMS", null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108351), null, null, 24);
            } else if (ckjVar2 instanceof bkj) {
                cjjVar.eo(((bkj) ckjVar2).a);
            } else if (ckjVar2 instanceof yjj) {
                yjj yjjVar = (yjj) ckjVar2;
                hpd0 hpd0Var2 = yjjVar.a;
                zjk zjkVar = hpd0Var2.g;
                if (zjkVar != null && (str2 = zjkVar.e) != null) {
                    if (zjkVar.g) {
                        ujjVar.h.d(cjjVar.requireContext(), str2, new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(str2))));
                        cjjVar.fo(hpd0Var2, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CALL_CLICK);
                    } else {
                        InaccessibilityMessage inaccessibilityMessage = zjkVar.h;
                        if (inaccessibilityMessage != null) {
                            ujjVar.h.c(cjjVar.requireContext(), inaccessibilityMessage, zjkVar.d, new bp7(10, cjjVar, yjjVar));
                        }
                    }
                }
            } else if (ckjVar2 instanceof zjj) {
                hpd0 hpd0Var3 = ((zjj) ckjVar2).a;
                zjk zjkVar2 = hpd0Var3.g;
                if (zjkVar2 != null && (str = zjkVar2.c) != null) {
                    maz.c(ujjVar.j, cjjVar.requireContext(), str, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 66584575), null, null, 24);
                    cjjVar.fo(hpd0Var3, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK);
                }
            } else if (ckjVar2 instanceof akj) {
                cjjVar.fo(((akj) ckjVar2).a, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.ADD_ITEM_TO_CART);
            } else if (ckjVar2 instanceof xjj) {
                lt00 lt00Var = ujjVar.k;
                xjj xjjVar = (xjj) ckjVar2;
                hpd0 hpd0Var4 = xjjVar.a;
                lt00.h(lt00Var, Long.valueOf(hpd0Var4.a), Long.valueOf(hpd0Var4.b.b), Integer.valueOf(xjjVar.b + 1), CommonMarketStat$TypeRefSource.POST_ATTACHED_MARKET_ITEMS, null, Integer.valueOf((int) j), Long.valueOf(userId.b), CommonMarketStat$TypeMarketContextContent.Type.POST, 16);
            } else {
                if (!(ckjVar2 instanceof wjj)) {
                    throw new NoWhenBranchMatchedException();
                }
                lt00 lt00Var2 = ujjVar.k;
                wjj wjjVar = (wjj) ckjVar2;
                MarketFavable marketFavable = wjjVar.a.e;
                marketFavable.f = marketFavable.f;
                lt00Var2.d(marketFavable, CommonMarketStat$TypeRefSource.POST_ATTACHED_MARKET_ITEMS, Integer.valueOf(wjjVar.c), "");
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(cjj.class, X3.i.U, "getStore()Lcom/vk/mvi/MviStore;", 0);
        fpf0.a.getClass();
        m1 = new qcy[]{propertyReference1Impl};
        l1 = new b();
    }

    public cjj(UserId userId, long j, ujj ujjVar) {
        this.h1 = userId;
        this.i1 = j;
        this.j1 = ujjVar;
        akh akhVar = new akh(this, 4);
        int i = wcy.c;
        this.k1 = new nzw(fpf0.e(mm50.class, wcy.a.a(fpf0.d(mkj.class)), wcy.a.a(fpf0.d(xij.class)), wcy.a.a(fpf0.d(ckj.class))).toString(), this, akhVar);
    }

    @Override // xsna.vpi
    public final ComposeView ao() {
        Context requireContext = requireContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setLayoutParams(layoutParams);
        return composeView;
    }

    @Override // xsna.vpi
    public final void bo(b33 b33Var) {
        View view = Hn().Y;
        if (view != null) {
            this.e0 = new jgj(view, 0, 0, 42);
        }
        nw20 nw20Var = b33Var instanceof nw20 ? (nw20) b33Var : null;
        if (nw20Var != null) {
            ViewGroup viewGroup = nw20Var.l0;
            ViewGroup viewGroup2 = viewGroup != null ? viewGroup : null;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-78919447);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-78919447, 8, -1, "com.vk.ecomm.contentproducts.view.ContentProductsBottomSheet.ThemedContent (ContentProductsBottomSheet.kt:87)");
        }
        qcy<Object> qcyVar = m1[0];
        mm50 mm50Var = (mm50) this.k1.getValue();
        boolean y = aVar.y(this);
        Object x = aVar.x();
        if (y || x == a.C0011a.a) {
            c cVar = new c(1, this, cjj.class, "handleEvent", "handleEvent(Lcom/vk/ecomm/contentproducts/ContentProductsEvent;)V", 0);
            aVar.R(cVar);
            x = cVar;
        }
        ojj.a(mm50Var, (izs) ((fcy) x), aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final void eo(hpd0 hpd0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        sz00 sz00Var = this.j1.g;
        Context requireContext = requireContext();
        UserId userId = hpd0Var.b;
        String string = requireContext().getString(R.string.content_product_write_to_owner_text);
        MarketProductTileConfig marketProductTileConfig = hpd0Var.c;
        String str5 = marketProductTileConfig.j;
        if (str5 == null) {
            str2 = "";
            str = str2;
        } else {
            str = str5;
            str2 = "";
        }
        long j = hpd0Var.a;
        List list = marketProductTileConfig.f;
        Image image = list != null ? (Image) j5g.a0(new wow(list)) : null;
        MarketProductTileConfig.e eVar = marketProductTileConfig.i;
        if (eVar == null || (str4 = eVar.c) == null) {
            str3 = eVar != null ? eVar.a : null;
            if (str3 == null) {
                str3 = str2;
            }
        } else {
            str3 = str4;
        }
        sz00Var.a(requireContext, new j910(userId, userId, string, j, str, image, str3));
        fo(hpd0Var, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER);
    }

    public final void fo(hpd0 hpd0Var, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        lt00 lt00Var = this.j1.k;
        long j = hpd0Var.a;
        UserId userId = hpd0Var.b;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.POST_ATTACHED_MARKET_ITEMS;
        UiTrackingScreen b2 = UiTracker.j.b();
        if (b2 == null || (mobileOfficialAppsCoreNavStat$EventScreen = b2.a) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        lt00Var.f(new MarketCtaButtonAnalyticsParams(eventType, j, userId, "", commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, null, -1, null, null, null, null, null, null, null, null, null, null, null, null, null, 2096960, null));
    }
}
