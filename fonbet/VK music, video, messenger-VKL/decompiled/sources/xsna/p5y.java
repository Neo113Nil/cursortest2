package xsna;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.attaches.CarouselRatio;
import com.vk.ecomm.fave.api.di.MarketFaveComponent;
import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.views.clips.NewsFeedControlsLayout;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.widget.MenuListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import one.video.exo.offline.e;
import xsna.mbc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class p5y implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p5y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ovv0 J;
        dvv0 a;
        CarouselRatio carouselRatio;
        switch (this.b) {
            case 0:
                fvv0 M = ((q5y) this.c).a.M();
                if (M != null && (J = M.J()) != null && (a = J.a(VkUiCommand.OPEN_CONTACTS)) != null) {
                    a.a(null);
                }
                return s3q0.a;
            case 1:
                return ((x6y) this.c).l;
            case 2:
                return Boolean.valueOf(((VideoLargeListState) ((b2a) ((ars0) this.c).b.b).getCurrentState()).o);
            case 3:
                return Boolean.valueOf(((xvy) this.c).j.a());
            case 4:
                return efz.b(((a500) this.c).w.g, "ms...", new StringBuilder("waiting for network for "));
            case 5:
                return com.vk.clips.sdk.shared.item.market_ads.b.n((com.vk.clips.sdk.shared.item.market_ads.b) this.c);
            case 6:
                return new o810(((f910) this.c).A, 1);
            case 7:
                return (ProfileFragmentProviderComponent) j6i.b(m7m.f((MenuListView) this.c), ProfileFragmentProviderComponent.class);
            case 8:
                String str = (String) this.c;
                NativeLibLoader.a.getClass();
                Set f = NativeLibLoader.f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()) + str);
                }
                return j5g.S0(arrayList);
            case 9:
                return ((jl30) this.c).b.a(OpenMessagesHistoryReporter.Span.MESSAGES_ADAPTER_RENDER);
            case 10:
                ym30 ym30Var = ((vm30) this.c).t0;
                if (ym30Var != null) {
                    ym30Var.C0();
                }
                return s3q0.a;
            case 11:
                return ((VideoTopBarView) this.c).getSettingsButtonBoundsInWindow();
            case 12:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) this.c;
                return Boolean.valueOf((musicCatalogRootVh.w || !epx.f(musicCatalogRootVh.I.r, vyh0.a) || epx.f(musicCatalogRootVh.B.r, "")) ? false : true);
            case 13:
                ValueAnimator valueAnimator = ((vg40) this.c).s;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                return s3q0.a;
            case 14:
                NewsFeedControlsLayout newsFeedControlsLayout = (NewsFeedControlsLayout) this.c;
                int i = NewsFeedControlsLayout.D;
                return (ImageView) newsFeedControlsLayout.findViewById(R.id.feed_carousel_product_sound_control);
            case 15:
                return new rt60(new uv20((ni60) this.c, 12));
            case 16:
                return (MarketFaveComponent) ((mo60) this.c).c().mo408a(fpf0.a(MarketFaveComponent.class));
            case 17:
                si70 si70Var = (si70) this.c;
                com.vk.im.ui.views.avatars.a aVar = new com.vk.im.ui.views.avatars.a(si70Var.a, null, 6);
                int i2 = si70Var.d;
                aVar.setBounds(0, 0, i2, i2);
                return aVar;
            case 18:
                ((ygp0) this.c).a(new one.video.exo.offline.f((e.c) null, (e.c) null, 7));
                return s3q0.a;
            case 19:
                ((hv80) this.c).a.invoke(new OrderListAction.i(OrderPaymentResult.Success));
                return s3q0.a;
            case 20:
                tma0 tma0Var = (tma0) this.c;
                return ((bna0) tma0Var.l1.getValue()).invoke(tma0Var.eo().getCurrentState());
            case 21:
                hpb0 hpb0Var = ((PollEditorFragment) this.c).S;
                (hpb0Var != null ? hpb0Var : null).p().a();
                return s3q0.a;
            case 22:
                ((bzb0) this.c).d = null;
                return s3q0.a;
            case 23:
                return ((NewsFeedComponent) ((y1c0) this.c).f.getValue()).w();
            case 24:
                return ((y8c0) this.c).c();
            case 25:
                return new mbc0.d((mbc0) this.c);
            case 26:
                return ((BridgeComponent) ((k7m) m7m.f((ikc0) this.c)).a(fpf0.a(BridgeComponent.class))).s();
            case 27:
                return ((PostingComponent) ((k7m) m7m.f((dmc0) this.c)).mo408a(fpf0.a(PostingComponent.class))).H6().x();
            case 28:
                PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) this.c;
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                return new luc0(new by20(postsFromNotificationsFragment, 19));
            default:
                l5d0 l5d0Var = (l5d0) this.c;
                if (l5d0Var.b) {
                    return l5d0Var.c;
                }
                zbc0 zbc0Var = l5d0Var.a;
                if (zbc0Var == null) {
                    return new CarouselRatio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
                }
                AttachmentsArrangementConfig attachmentsArrangementConfig = zbc0Var.a;
                return (attachmentsArrangementConfig == null || (carouselRatio = attachmentsArrangementConfig.f) == null) ? new CarouselRatio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null) : carouselRatio;
        }
    }
}
