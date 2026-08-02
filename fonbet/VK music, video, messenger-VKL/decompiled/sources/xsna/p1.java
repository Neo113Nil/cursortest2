package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.view.components.button.VkHorizontalArrow;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.feed.blacklist.impl.presentation.blacklist.f;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.log.LogLevel;
import com.vk.libvideo.bottomsheet.about.delegate.a0;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.BaseModalPostReactionsTabFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.presentation.about.AboutAppFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b4;
import xsna.ca9;
import xsna.dob;
import xsna.fha;
import xsna.g0v;
import xsna.g8b;
import xsna.ir5;
import xsna.knb;
import xsna.t130;
import xsna.tj50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class p1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1(WebAdConfig webAdConfig, com.vk.superapp.advertisement.b bVar) {
        this.b = 4;
        this.c = webAdConfig;
    }

    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = AboutAppFragment.X;
                ((g1) obj2).V();
                return s3q0.a;
            case 1:
                ((a0.a) obj2).l.d(b4.g0.a);
                return s3q0.a;
            case 2:
                e40 e40Var = ((yn) obj2).d;
                f.b.a aVar = new f.b.a((Throwable) obj);
                BlacklistFragment blacklistFragment = (BlacklistFragment) e40Var.c;
                int i3 = BlacklistFragment.V;
                blacklistFragment.getFeature().g.b(aVar);
                return s3q0.a;
            case 3:
                ((b11) obj2).b.a(AdsItemViewEvent.a.b);
                return s3q0.a;
            case 4:
                WebAdConfig webAdConfig = (WebAdConfig) obj2;
                AdvertisementConfig advertisementConfig = (AdvertisementConfig) obj;
                List I = rl3.I(new Integer[]{webAdConfig != null ? Integer.valueOf(webAdConfig.b) : null, webAdConfig != null ? Integer.valueOf(webAdConfig.c) : null});
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : I) {
                    if (((Number) obj3).intValue() != -1) {
                        arrayList.add(obj3);
                    }
                }
                return com.vk.superapp.advertisement.b.t(advertisementConfig, arrayList);
            case 5:
                km3 km3Var = (km3) obj2;
                VkHorizontalArrow vkHorizontalArrow = new VkHorizontalArrow((Context) obj);
                vkHorizontalArrow.setSize(VkHorizontalArrow.ArrowSize.valueOf(km3Var.a.name()));
                vkHorizontalArrow.setDirection(VkHorizontalArrow.ArrowDirection.valueOf(km3Var.b.name()));
                vkHorizontalArrow.setEnabledArrow(true);
                vkHorizontalArrow.setOnClickListener(new o44(0));
                vkHorizontalArrow.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                return vkHorizontalArrow;
            case 6:
                yt3 yt3Var = (yt3) obj2;
                g0v g0vVar = ((iyu0) obj).f;
                if (epx.f(g0vVar, g0v.b.a)) {
                    yt3Var.j();
                } else {
                    if (!(g0vVar instanceof g0v.c) && !(g0vVar instanceof g0v.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yt3Var.i();
                }
                return s3q0.a;
            case 7:
                return (ir5.c) obj2;
            case 8:
                return rsg0.y0(yfb.x(((my80) ((d06) obj2).d.getValue()).a((Boolean) obj, Boolean.TRUE)), null, null, 3).U(new xl0(new rl2(i2), 5));
            case 9:
                int i4 = BaseModalPostReactionsTabFragment.X;
                xn50.a.c((BaseModalPostReactionsTabFragment) obj2, t130.a.b);
                return s3q0.a;
            case 10:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj2;
                int i5 = BasePhotoListFragment.m0;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    basePhotoListFragment.po().notifyItemChanged(((Number) ((Pair) it.next()).i()).intValue());
                }
                return s3q0.a;
            case 11:
                qgi0.h((tgi0) obj, (String) obj2);
                return s3q0.a;
            case 12:
                return new zj7((ViewGroup) obj, (BonusCatalogFragment) obj2);
            case 13:
                tgi0 tgi0Var = (tgi0) obj;
                if (!((b48) obj2).b) {
                    qgi0.a(tgi0Var);
                }
                return s3q0.a;
            case 14:
                m99 m99Var = (m99) obj2;
                Set set = (Set) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, null, null, null, null, null, null, false, null, set, null, null, false, null, false, null, false, null, -536870913, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 15:
                a9s0 a9s0Var = (a9s0) obj;
                CatalogVh catalogVh = ((g3a) obj2).t;
                gha ghaVar = catalogVh instanceof gha ? (gha) catalogVh : null;
                if (ghaVar != null) {
                    ghaVar.A2(a9s0Var.a);
                }
                return s3q0.a;
            case 16:
                return ((s2a) obj2).a((CatalogBlockState) obj);
            case 17:
                fha.a aVar2 = (fha.a) obj;
                ((StoryViewerRouter) ((fha) obj2).e.getValue()).l(aVar2.a, aVar2.b, aVar2.c, aVar2.d, aVar2.e);
                return s3q0.a;
            case 18:
                ((com.vk.im.channelcreation.impl.h) obj2).O(g.f.b);
                return s3q0.a;
            case 19:
                return new g8b.a(((tj50.a) obj).a(new c8b(1, (d8b) obj2, d8b.class, "composeContent", "composeContent(Lcom/vk/channels/impl/payout/presentation/feature/ChannelPayoutState;)Lcom/vk/channels/impl/payout/presentation/ui/state/ChannelPayoutViewState$Data$Content;", 0), ao8.d));
            case 20:
                Throwable th = (Throwable) obj;
                f9w f9wVar = ((veb) obj2).d;
                if (!f9wVar.d(LogLevel.ERROR)) {
                    String str = f9wVar.a;
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.w(l, L.LogType.e, th, new Object[]{str, "channels carousel channels events error: "}, null, null, 24);
                    }
                }
                return s3q0.a;
            case 21:
                return new dob.a(((knb.c) obj).c.d, ((nnb) obj2).d.get());
            case 22:
                ((ftb) obj2).e.A0();
                return s3q0.a;
            case 23:
                Throwable th2 = (Throwable) obj;
                xyb.C.a(th2);
                if (((xyb) obj2).A != null) {
                    zk70.e(th2);
                }
                return s3q0.a;
            case 24:
                r0c r0cVar = (r0c) obj2;
                r0cVar.L0(new MethodSelectorCodeState.OfficialMessenger(((bii0) obj).a));
                r0cVar.X0();
                return s3q0.a;
            case 25:
                ((a8c) obj2).getClass();
                a8c.f((tr90) obj);
                return s3q0.a;
            case 26:
                hjj0 hjj0Var = (hjj0) obj;
                int i6 = ClipFeedListFragment.a2;
                iwc wo = ((ClipFeedListFragment) obj2).wo();
                if (wo != null) {
                    wo.j(hjj0Var);
                }
                return s3q0.a;
            case 27:
                return o1d.k((o1d) obj2, (j0d) obj);
            case 28:
                ((x6d) obj2).e.a.a(l5d.b);
                return s3q0.a;
            default:
                return e43.l((u2e) obj, (u2e) obj2);
        }
    }

    public /* synthetic */ p1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
