package xsna;

import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.music.fragment.impl.MusicCatalogShowAllFragment;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.podcast.api.di.PodcastComponent;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xsna.i0c0;
import xsna.mf40;
import xsna.rfa0.m;
import xsna.rye;
import xsna.s1c0;
import xsna.t2g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fm20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fm20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((gm20) this.c).l.C();
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((MiniPlayerControllersWrapper) this.c).w);
            case 2:
                ((zak0) ((az20) this.c).o).setValue(Boolean.FALSE);
                return s3q0.a;
            case 3:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.c;
                ChatFragment.j jVar = aVar.s;
                if (jVar != null) {
                    jVar.e(ImSearchAnalytics.ClickAction.SET_REACTION_OUT);
                }
                aVar.i1();
                return s3q0.a;
            case 4:
                MusicCatalogShowAllFragment musicCatalogShowAllFragment = (MusicCatalogShowAllFragment) this.c;
                int i = MusicCatalogShowAllFragment.R;
                return ((PlayerUIComponent) m7m.d(musicCatalogShowAllFragment).a(fpf0.a(PlayerUIComponent.class))).Ne();
            case 5:
                return new mca((zia) ((mf40.d) this.c).v.invoke());
            case 6:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return new AtomicReference(newsfeedCustomFragment2.eo().c);
            case 7:
                return (NewsfeedRouterComponent) ((mo60) this.c).c().a(fpf0.a(NewsfeedRouterComponent.class));
            case 8:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) this.c;
                qcy<Object>[] qcyVarArr2 = NewsfeedSearchFragment.p0;
                return newsfeedSearchFragment.ho();
            case 9:
                return com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.b.a(((ev70) this.c).getCurrentState());
            case 10:
                return "LivePlayerImpl.onFirstFrameDecoded() - state= " + wl80.this.G;
            case 11:
                OnlineBookingInternalComponent onlineBookingInternalComponent = (OnlineBookingInternalComponent) this.c;
                OnlineBookingInternalComponent.a aVar2 = OnlineBookingInternalComponent.n;
                return new kx7(onlineBookingInternalComponent.Ef());
            case 12:
                return (Flow) ((dp90) this.c).b().findViewById(R.id.past_call_details_actions_flow);
            case 13:
                return ((rfa0) this.c).new m();
            case 14:
                return ((e2b0) this.c).e;
            case 15:
                PodcastFragment podcastFragment = (PodcastFragment) this.c;
                int i2 = PodcastFragment.m0;
                return ((PodcastComponent) m7m.d(podcastFragment).a(fpf0.a(PodcastComponent.class))).x2();
            case 16:
                ((i0c0.a) this.c).a();
                return s3q0.a;
            case 17:
                return ((BridgeComponent) ((k7m) m7m.f((com.vk.newsfeed.common.util.j) this.c)).a(fpf0.a(BridgeComponent.class))).s();
            case 18:
                sbc0 sbc0Var = ((ikc0) this.c).x;
                if (sbc0Var == null) {
                    sbc0Var = null;
                }
                return Boolean.valueOf(sbc0Var.Q);
            case 19:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) this.c;
                qcy<Object>[] qcyVarArr3 = PostponedPostsFragment.q0;
                s1c0.a aVar3 = new s1c0.a();
                aVar3.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = postponedPostsFragment.g0.get();
                aVar3.s = sf2Var.a();
                return aVar3.a();
            case 20:
                float intValue = ((wak0) ((jgh0) this.c).a).getIntValue();
                List<String> list = gb5.a;
                return Float.valueOf(swe0.f(swe0.f(intValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 500.0f) / 500.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            case 21:
                ((m2g0) this.c).a(t2g0.b.a);
                return s3q0.a;
            case 22:
                ((rye.b) this.c).a();
                return s3q0.a;
            case 23:
                return Float.valueOf(((wfh0) this.c).p.f());
            case 24:
                return ((NarrativeComponent) ((k7m) m7m.f((s8i0) this.c)).a(fpf0.a(NarrativeComponent.class))).h3();
            case 25:
                ov70 ov70Var = (ov70) ((zak0) ((bei0) this.c).q).getValue();
                return new ov70(ov70Var != null ? ov70Var.a : 9205357640488583168L);
            case 26:
                return ((afi0) this.c).b();
            case 27:
                return (TextView) ((com.vk.sharing.core.view.f) this.c).findViewById(R.id.empty_text);
            case 28:
                return com.vk.clips.sdk.shared.item.static_ads.c.o((com.vk.clips.sdk.shared.item.static_ads.c) this.c);
            default:
                return ((StoryEditorComponent) ((k7m) m7m.c(((vfm0) this.c).b)).a(fpf0.a(StoryEditorComponent.class))).G3();
        }
    }
}
