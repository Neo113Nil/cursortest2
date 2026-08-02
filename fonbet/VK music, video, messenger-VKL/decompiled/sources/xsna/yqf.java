package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.photoviewer.di.MarketPhotoviewerComponent;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.photoviewer.PhotoViewer;
import com.vk.profile.community.impl.ui.events.CommunityEventsFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.webrtc.RTCLog;
import xsna.acx;
import xsna.bzx;
import xsna.dzh;
import xsna.mem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class yqf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yqf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        RTCLog lambda$new$0;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = ClipsWrapperFragment.Q0;
                return ((ClipsConfigViewersComponent) m7m.d((ClipsWrapperFragment) obj2).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 1:
                qcy<Object>[] qcyVarArr = CommunityEventsFragment.P;
                Bundle requireArguments = ((CommunityEventsFragment) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("events_arg_group_id", UserId.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("events_arg_group_id");
                    obj = (UserId) (parcelable2 instanceof UserId ? parcelable2 : null);
                }
                UserId userId = (UserId) obj;
                if (userId == null) {
                    userId = UserId.d;
                }
                return new v2h(userId);
            case 2:
                ((d3h) ((d4h) obj2).c.invoke()).g();
                return s3q0.a;
            case 3:
                return new i1t0(true, ((reh) obj2).n.J().Y1());
            case 4:
                return (YandexAdFeatureComponent) ((k7m) m7m.f((hrh) obj2)).a(fpf0.a(YandexAdFeatureComponent.class));
            case 5:
                ryh ryhVar = (ryh) obj2;
                dw20 dw20Var = ryhVar.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                ryhVar.b.c(dzh.n.k.a);
                return s3q0.a;
            case 6:
                return (TextView) ((c1j) obj2).itemView.findViewById(R.id.voip_room_participant_status);
            case 7:
                lambda$new$0 = ((ConversationFactory) obj2).lambda$new$0();
                return lambda$new$0;
            case 8:
                ((puj) obj2).x.f(true);
                return Boolean.TRUE;
            case 9:
                ugl uglVar = (ugl) obj2;
                uglVar.A = true;
                uglVar.a(new acx.g(false, false, false));
                return s3q0.a;
            case 10:
                mem.a aVar = ((sem) obj2).l;
                if (aVar != null) {
                    mem memVar = mem.this;
                    io.reactivex.rxjava3.disposables.c cVar = memVar.p;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    memVar.p = null;
                }
                return s3q0.a;
            case 11:
                View view = ((gfm) obj2).a.g;
                LinearInterpolator linearInterpolator = gfm.n;
                return new vtt0(view, linearInterpolator, linearInterpolator, 200L, 16);
            case 12:
                return new idm(((ksm) obj2).a);
            case 13:
                qcy<Object>[] qcyVarArr2 = DiscoverSimilarFeedFragment.s0;
                return ((DiscoverSimilarFeedFragment) obj2).io();
            case 14:
                ((xuo) obj2).c();
                return s3q0.a;
            case 15:
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText = ((opp) obj2).u;
                return String.valueOf((vkAuthErrorStatedEditText != null ? vkAuthErrorStatedEditText : null).getText());
            case 16:
                EntriesListFragment entriesListFragment = (EntriesListFragment) obj2;
                int i3 = EntriesListFragment.m0;
                entriesListFragment.ko().t0(entriesListFragment);
                return s3q0.a;
            case 17:
                return ((MarketPhotoviewerComponent) ((k7m) m7m.f((a0r) obj2)).mo408a(fpf0.a(MarketPhotoviewerComponent.class))).G5();
            case 18:
                f6s f6sVar = (f6s) obj2;
                return new ga60(f6sVar.itemView.getContext(), (neg) f6sVar.O.getValue(), (NewsfeedRouter) f6sVar.P.getValue());
            case 19:
                tn10 q3 = ((evs) obj2).q3();
                return (VideoTextureView) (q3 != null ? q3.b() : null);
            case 20:
                GeoFragment geoFragment = (GeoFragment) obj2;
                return Integer.valueOf(((Boolean) geoFragment.T.getValue()).booleanValue() ? 0 : ((Number) geoFragment.U.getValue()).intValue());
            case 21:
                fzt fztVar = (fzt) obj2;
                vqt0 vqt0Var = fztVar.g;
                PhotoViewer.e eVar = fztVar.d;
                eVar.getWidth();
                eVar.getHeight();
                vqt0Var.getClass();
                twt0.c(fztVar.i, 100L, null, 6);
                return s3q0.a;
            case 22:
                return ((VideoKidsComponent) ((k7m) m7m.f((GlobalSearchVideoRootVh) obj2)).a(fpf0.a(VideoKidsComponent.class))).I4();
            case 23:
                y4u y4uVar = (y4u) obj2;
                return new com.vk.ecomm.market.good.c((fy9) y4uVar.q.getValue(), (bbj0) y4uVar.J.getValue(), (a84) y4uVar.K.getValue(), (d70) y4uVar.L.getValue(), (dhc) y4uVar.M.getValue(), (gwh0) y4uVar.k0.getValue(), (isq) y4uVar.C.getValue(), (vrq) y4uVar.D.getValue(), (y110) y4uVar.G.getValue());
            case 24:
                return new eyv((und0) obj2);
            case 25:
                return bwt0.G((View) obj2);
            case 26:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar2 = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) obj2;
                cVar2.c.a();
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar = cVar2.c;
                dVar.f(false);
                dVar.c();
                return s3q0.a;
            case 27:
                ((StoryProgressView) ((wex) obj2).v0.getValue()).setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 28:
                ((kzx) obj2).C(bzx.b.b);
                return s3q0.a;
            default:
                return ((oly) obj2).a.findViewById(R.id.ads_image_container);
        }
    }
}
