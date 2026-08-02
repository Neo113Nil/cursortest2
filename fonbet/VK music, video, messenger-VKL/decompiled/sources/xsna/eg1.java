package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.home.HomeFragment2;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.impl.di.VkVideoPromoComponentImpl;
import com.vk.music.player.PlayerTrack;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.popupmanager.api.di.PopupManagerComponent;
import com.vk.profile.community.subscription.impl.di.CommunitySubscriptionComponentImpl;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import one.video.calls.sdk.net.signaling.WSSignaling;
import one.video.player.BaseVideoPlayer;
import one.video.player.RepeatMode;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.b4;
import xsna.gpp0;
import xsna.n5p;
import xsna.o4e0;
import xsna.omt0;
import xsna.r5e0;
import xsna.s0s0;
import xsna.s7d0;
import xsna.sst0;
import xsna.sx40;
import xsna.ws00;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class eg1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eg1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 loadMoreElements$lambda$0;
        okhttp3.o http_delegate$lambda$0;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((gg1) obj2).C(a.d.a((a.d) obj));
                return s3q0.a;
            case 1:
                ((cpi) obj2).c = (gzs) obj;
                return s3q0.a;
            case 2:
                vw3 vw3Var = BaseVideoPlayer.H;
                return "RepeatMode adjusted " + ((RepeatMode) obj2) + " -> " + ((RepeatMode) obj);
            case 3:
                d8e d8eVar = (d8e) obj;
                return new n4r((Context) obj2, d8eVar.g.f, new o99(d8eVar, 2));
            case 4:
                avh avhVar = (avh) obj2;
                s6s0 s6 = avh.s6((sst0.b) obj);
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    if (((Boolean) avhVar.s.getValue()).booleanValue()) {
                        new w6s0(s6, null).e(b);
                    } else {
                        new e6s0(b, s6, null).c();
                    }
                }
                return s3q0.a;
            case 5:
                qcy<Object>[] qcyVarArr = CommunitySubscriptionComponentImpl.e;
                return new p6h(((BridgeComponent) obj2).F(), ((DataRepositoryComponent) obj).D());
            case 6:
                gzs gzsVar = (gzs) obj;
                gzs<s3q0> gzsVar2 = ((n5p.a) obj2).b;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                gzsVar.invoke();
                return s3q0.a;
            case 7:
                csj0 csj0Var = (csj0) obj;
                ggc0 ggc0Var = ((HomeFragment2) obj2).o0;
                if (ggc0Var != null) {
                    ggc0Var.a(csj0Var, PostingCreationEntryPoint.FeedPlus);
                }
                return s3q0.a;
            case 8:
                ((izs) obj2).invoke(((dqj) obj).c);
                return s3q0.a;
            case 9:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) obj2;
                int i2 = MarketAllReviewsFragment.d0;
                a.g.b bVar = new a.g.b(((ws00.b) obj).b);
                marketAllReviewsFragment.getClass();
                xn50.a.c(marketAllReviewsFragment, bVar);
                return s3q0.a;
            case 10:
                MsgListEmptyViewState.ForDialog forDialog = (MsgListEmptyViewState.ForDialog) obj2;
                com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar = (com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) obj;
                qtd0 zb = forDialog.b.zb(forDialog.a.Zb());
                if (zb != null) {
                    aVar.e(new b.o(zb));
                }
                return s3q0.a;
            case 11:
                u2b0.v0(((rw40) obj2).y, (PlayerTrack) obj, null, 14);
                return s3q0.a;
            case 12:
                ((vtu) obj2).a(0);
                ((izs) obj).invoke(sx40.j.b);
                return s3q0.a;
            case 13:
                ((m8d0) obj2).g().invoke(s7d0.a.a);
                ((p8s) obj).invoke();
                return s3q0.a;
            case 14:
                o4e0.c cVar = (o4e0.c) ((o4e0) obj);
                ((b5e0) obj2).g.b(new r5e0.b(cVar.c, cVar.d));
                return s3q0.a;
            case 15:
                qh50 qh50Var = (qh50) obj2;
                hqj hqjVar = (hqj) obj;
                Object[] objArr = qh50Var.b;
                long[] jArr = qh50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    hqjVar.v(objArr[(i3 << 3) + i5]);
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                return s3q0.a;
            case 16:
                loadMoreElements$lambda$0 = StereoRoomHandsQueueImpl.loadMoreElements$lambda$0((izs) obj2, (StereoRoomHandsQueueImpl) obj);
                return loadMoreElements$lambda$0;
            case 17:
                ((gpp0.a) obj2).l.d(new b4.r(((AboutVideoItem.a0) obj).c));
                return s3q0.a;
            case 18:
                s0s0 s0s0Var = (s0s0) obj2;
                g2d0 g2d0Var = ((s0s0.b) obj).a;
                String str = g2d0Var != null ? g2d0Var.a : null;
                if (str != null && s0s0Var.j.add(str)) {
                    x11.a(str, s0s0Var.k.P0().a, "OVERLAY").q(io.reactivex.rxjava3.schedulers.a.b()).subscribe();
                }
                return s3q0.a;
            case 19:
                ((izs) obj2).invoke(new omt0.f.b((BlockId) obj));
                return s3q0.a;
            case 20:
                qcy<Object>[] qcyVarArr2 = VkVideoPromoComponentImpl.c;
                return new VkVideoPromoComponentImpl.b((VideoGrowthComponent) obj2, ((PopupManagerComponent) obj).Dc());
            case 21:
                ((gvw0) obj2).f = false;
                ((y84) obj).invoke();
                return s3q0.a;
            default:
                http_delegate$lambda$0 = WSSignaling.http_delegate$lambda$0((SignalingTransport.Timeouts) obj2, (WSSignaling) obj);
                return http_delegate$lambda$0;
        }
    }
}
