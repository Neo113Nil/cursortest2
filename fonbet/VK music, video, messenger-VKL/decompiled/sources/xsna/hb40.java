package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.vk.api.base.VkPaginationList;
import com.vk.camera.editor.common.text.views.CreateStoryEditText;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.censoredsettings.presentation.obscenetext.c;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.fullscreen.promo.core.FullscreenPromoComponent;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.log.L;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;
import com.vk.music.view.MusicRoundPlayView;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.socialgraph.SocialGraphActivity;
import com.vk.socialgraph.SocialGraphOpenParams;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dz40;
import xsna.egp0;
import xsna.fhc0;
import xsna.hbb0;
import xsna.ikv0;
import xsna.khm0;
import xsna.l7h0;
import xsna.q7h0;
import xsna.qr60;
import xsna.tj50;
import xsna.tsb0;
import xsna.tzp0;
import xsna.vf60;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hb40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hb40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        r80 a;
        Bundle extras;
        PromoSessionInfo promoSessionInfo;
        int i = this.b;
        int i2 = 4;
        int i3 = 6;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                MusicBaseVkMixInteractiveVh musicBaseVkMixInteractiveVh = (MusicBaseVkMixInteractiveVh) obj2;
                ((View) obj).performHapticFeedback(0);
                UiBlockInteractiveVkMix b = musicBaseVkMixInteractiveVh.b();
                if (b != null) {
                    musicBaseVkMixInteractiveVh.j.a(new cfp0(b, new MusicAnalyticsInfo((musicBaseVkMixInteractiveVh.g() && musicBaseVkMixInteractiveVh.b.m0().h()) ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play)));
                }
                MusicRoundPlayView musicRoundPlayView = musicBaseVkMixInteractiveVh.o;
                if (musicRoundPlayView == null) {
                    musicRoundPlayView = null;
                }
                boolean a2 = musicRoundPlayView.a();
                l4v0 l4v0Var = musicBaseVkMixInteractiveVh.i;
                MusicVkMixVh.h(musicBaseVkMixInteractiveVh, a2, (l4v0Var == null || (a = l4v0Var.a()) == null) ? null : (MixSettingsEntity) a.c, null, 4);
                return s3q0.a;
            case 1:
                rt40 rt40Var = (rt40) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                tzp0.c.a aVar = rt40.s1;
                xn50.a.c(rt40Var, new es40(booleanValue));
                ru40 ru40Var = rt40Var.k1;
                if (ru40Var != null) {
                    ru40Var.g(booleanValue);
                }
                return s3q0.a;
            case 2:
                ao8 ao8Var = ao8.d;
                my40 my40Var = (my40) obj2;
                tj50.a aVar2 = (tj50.a) obj;
                int i4 = 9;
                if (!MusicFeatures.AUDIO_PLAYER_REDESIGN.h()) {
                    m450 m450Var = (m450) my40Var.e.getValue();
                    m450Var.getClass();
                    return new dz40.l(new dz40.f(aVar2.a(g450.b, ao8Var), aVar2.a(h450.b, ao8Var), aVar2.a(i450.b, ao8Var), aVar2.a(j450.b, ao8Var), aVar2.a(new xpt(i4), ao8Var), aVar2.a(new oqu(15), ao8Var), aVar2.a(new bqt(11), ao8Var), aVar2.a(k450.b, ao8Var), aVar2.a(l450.b, ao8Var)), aVar2.a(new a450(1, m450Var, m450.class, "composeCovers", "composeCovers(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$Covers;", 0), ao8Var), aVar2.a(new wo40(m450Var, i2), ao8Var), aVar2.a(new b450(1, m450Var, m450.class, "getTrackData", "getTrackData(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/domain/TrackData$Music;", 0), ao8Var), aVar2.a(new x8m(24), ao8Var), aVar2.a(d450.b, ao8Var), aVar2.a(e450.b, ao8Var), aVar2.a(new f450(1, m450Var, m450.class, "composePlaybackQueue", "composePlaybackQueue(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$PlaybackQueueData$Music;", 0), ao8Var), aVar2.a(new t810(i3), ao8Var), aVar2.a(new c450(1, m450Var, m450.class, "composeChips", "composeChips-SLYZRjA(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Ljava/util/Set;", 0), ao8Var), aVar2.a(new w350(1, m450Var, m450.class, "composeLyrics", "composeLyrics(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$LyricsData;", 0), ao8Var), aVar2.a(x350.b, ao8Var), aVar2.a(y350.b, ao8Var), aVar2.a(z350.b, ao8Var));
                }
                llf0 llf0Var = (llf0) my40Var.f.getValue();
                llf0Var.getClass();
                int i5 = 1;
                int i6 = 22;
                return new dz40.t(new dz40.f(aVar2.a(flf0.b, ao8Var), aVar2.a(glf0.b, ao8Var), aVar2.a(hlf0.b, ao8Var), aVar2.a(ilf0.b, ao8Var), aVar2.a(new qcw(21), ao8Var), aVar2.a(new nc90(i4), ao8Var), aVar2.a(new h3e0(i5), ao8Var), aVar2.a(jlf0.b, ao8Var), aVar2.a(klf0.b, ao8Var)), aVar2.a(new alf0(1, llf0Var, llf0.class, "composeCovers", "composeCovers(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$Covers;", 0), ao8Var), aVar2.a(new z410(llf0Var), ao8Var), aVar2.a(new blf0(1, llf0Var, llf0.class, "getTrackData", "getTrackData(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/domain/TrackData$Music;", 0), ao8Var), aVar2.a(new pey(i6), ao8Var), aVar2.a(clf0.b, ao8Var), aVar2.a(dlf0.b, ao8Var), aVar2.a(new elf0(1, llf0Var, llf0.class, "composePlaybackQueue", "composePlaybackQueue(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$PlaybackQueueData$Music;", 0), ao8Var), aVar2.a(new p6e0(i5), ao8Var), aVar2.a(new pyz(i6), ao8Var), aVar2.a(new ykf0(1, llf0Var, llf0.class, "composeLyrics", "composeLyrics(Lcom/vk/music/stickyplayer/mvi/MusicPlayerState;)Lcom/vk/music/stickyplayer/mvi/MusicPlayerViewState$LyricsData;", 0), ao8Var), aVar2.a(zkf0.b, ao8Var));
            case 3:
                qgi0.r((tgi0) obj, ((l050) obj2).a == MusicTrackPlayState.PLAYING ? "listenPlaylistButtonPauseIcon" : "listenPlaylistButtonPlayIcon");
                return s3q0.a;
            case 4:
                sg60 sg60Var = (sg60) obj2;
                xg60 xg60Var = (xg60) obj;
                String str = xg60Var.e;
                String str2 = xg60Var.f;
                if (str != null && str.length() != 0) {
                    sg60Var.e(new vf60.b(xg60Var.e));
                }
                if (str2 != null && str2.length() != 0 && epx.f(((xf60) sg60Var.b.getCurrentState()).e, "unknown")) {
                    sg60Var.e(new vf60.a(str2));
                }
                return new uf60(new qr60.a.f(xg60Var.a, xg60Var.b, xg60Var.d));
            case 5:
                ((com.vk.censoredsettings.presentation.obscenetext.b) obj2).T(new c.a(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 6:
                tt80.q0(0, 0, 0, null, null, null);
                return ((OptionalNativeAdEntry) ((NewsEntry) obj2)).i;
            case 7:
                return nv90.m((nv90) obj2, ((Integer) obj).intValue());
            case 8:
                cbb0 cbb0Var = (cbb0) obj2;
                hbb0 hbb0Var = (hbb0) obj;
                int i7 = cbb0.q1;
                Context u = cbb0Var.requireArguments().getBoolean("FORCE_DARK_THEME", false) ? bwt0.u(cbb0Var.requireContext()) : cbb0Var.requireContext();
                if (!(hbb0Var instanceof hbb0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ikv0.a aVar3 = new ikv0.a(u);
                aVar3.u = new ikv0.d(u.getString(((hbb0.a) hbb0Var).a), (String) r6, (ikv0.d.a) r6, i3);
                aVar3.n();
                return s3q0.a;
            case 9:
                ((h440) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 10:
                ((lsb0) obj2).U(tsb0.e.a);
                return s3q0.a;
            case 11:
                ikc0 ikc0Var = (ikc0) obj2;
                wxu wxuVar = ikc0Var.y;
                if (wxuVar == null) {
                    wxuVar = null;
                }
                wxuVar.c.H6();
                ikc0Var.j7(null);
                return s3q0.a;
            case 12:
                enc0 enc0Var = (enc0) obj2;
                PostingAction postingAction = (PostingAction) obj;
                if (postingAction instanceof PostingAction.Navigation) {
                    enc0Var.n.clearFocus();
                }
                enc0Var.d.invoke(postingAction);
                return s3q0.a;
            case 13:
                cqc0 cqc0Var = (cqc0) obj2;
                cqc0Var.V0();
                ((fhc0.c) cqc0Var.s.getValue()).j();
                cqc0Var.j.invoke();
                return s3q0.a;
            case 14:
                ggj ggjVar = (ggj) obj;
                if (((Boolean) ((wh50) obj2).getValue()).booleanValue()) {
                    ggjVar.s1();
                }
                return s3q0.a;
            case 15:
                q7h0.a aVar4 = (q7h0.a) obj;
                return new l7h0.b(aVar4.c, ((c7h0) obj2).l.a(aVar4.a), aVar4.b);
            case 16:
                ((tdu) obj).b(((Number) ((mtk0) obj2).getValue()).floatValue());
                return s3q0.a;
            case 17:
                ixi0 ixi0Var = (ixi0) obj2;
                Integer num = (Integer) obj;
                int i8 = r9i0.j1;
                if (num != null) {
                    ((Toolbar) ixi0Var.g.getValue()).setTitle(num.intValue());
                }
                return s3q0.a;
            case 18:
                z2j0 z2j0Var = (z2j0) obj2;
                jr20 jr20Var = z2j0Var.p;
                Object obj3 = z2j0Var.l;
                jr20Var.P0(((bjf0) (obj3 != null ? obj3 : 0)).a.d(), z2j0Var.getAdapterPosition());
                return Boolean.TRUE;
            case 19:
                return ((s2a) obj2).a((CatalogBlockState) obj);
            case 20:
                SocialGraphActivity socialGraphActivity = (SocialGraphActivity) obj2;
                SocialGraphOpenParams socialGraphOpenParams = (SocialGraphOpenParams) obj;
                com.vk.socialgraph.a aVar5 = socialGraphActivity.g;
                if (aVar5 != null) {
                    aVar5.a(null, socialGraphOpenParams, false);
                }
                socialGraphActivity.setResult(-1);
                socialGraphActivity.finish();
                Intent intent = socialGraphActivity.getIntent();
                if (intent != null && (extras = intent.getExtras()) != null && (promoSessionInfo = (PromoSessionInfo) extras.getParcelable("promoSessionInfo")) != null) {
                    ((FullscreenPromoComponent) m7m.a(socialGraphActivity).a(fpf0.a(FullscreenPromoComponent.class))).n().a(promoSessionInfo);
                }
                return s3q0.a;
            case 21:
                qvl0 qvl0Var = (qvl0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Context context = qvl0Var.b;
                    ikv0.a aVar6 = new ikv0.a(context);
                    aVar6.u = new ikv0.d(context.getString(R.string.stories_interesting_block_hide_success), (String) r6, (ikv0.d.a) r6, i3);
                    aVar6.e = 2000L;
                    aVar6.n();
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = qvl0Var.j;
                    (izsVar != null ? izsVar : null).invoke(b.a0.a.b);
                } else {
                    qvl0Var.b();
                }
                return s3q0.a;
            case 22:
                ((mfm0) obj2).e.setPrivacy((khm0.e) obj);
                return s3q0.a;
            case 23:
                int i9 = StoryStatisticsViewersFragment.f0;
                ((q9i0) obj2).invoke((ikv0) obj);
                return s3q0.a;
            case 24:
                ((rg50) obj2).C(((Integer) obj).intValue());
                return s3q0.a;
            case 25:
                cmo0 cmo0Var = (cmo0) obj2;
                String str3 = (String) obj;
                CreateStoryEditText createStoryEditText = cmo0Var.i;
                if (createStoryEditText == null) {
                    createStoryEditText = null;
                }
                Editable text = createStoryEditText.getText();
                if (text != null) {
                    CreateStoryEditText createStoryEditText2 = cmo0Var.i;
                    text.insert((createStoryEditText2 != null ? createStoryEditText2 : null).getSelectionStart(), str3);
                }
                return s3q0.a;
            case 26:
                zfp0 zfp0Var = (zfp0) obj2;
                egp0 egp0Var = (egp0) obj;
                int i10 = zfp0.x1;
                Context u2 = zfp0Var.requireArguments().getBoolean("FORCE_DARK_THEME", false) ? bwt0.u(zfp0Var.requireContext()) : zfp0Var.requireContext();
                if (!(egp0Var instanceof egp0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ikv0.a aVar7 = new ikv0.a(u2);
                aVar7.u = new ikv0.d(u2.getString(((egp0.a) egp0Var).a), (String) r6, (ikv0.d.a) r6, i3);
                aVar7.n();
                return s3q0.a;
            case 27:
                ((ss3) obj2).invoke();
                cvk.u(R.string.error_network, false);
                L.i((Throwable) obj);
                return s3q0.a;
            case 28:
                mlq0 mlq0Var = (mlq0) obj2;
                lqs lqsVar = (lqs) obj;
                List<UserProfile> list = lqsVar.a;
                List<UserProfile> list2 = lqsVar.b;
                List<UserProfile> list3 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (UserProfile userProfile : list3) {
                    Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                    Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                    arrayList.add(new ProfileFriendItem(userProfile.c, userProfile.d, userProfile.f, ImageList.a.a(userProfile.g), new ArrayList(), userProfile.Y));
                }
                mlq0Var.i = new VkPaginationList<>(arrayList, lqsVar.a.size(), false, 0, 8, null);
                mlq0Var.h = new VkPaginationList<>(new ArrayList(list2), list2.size(), false, 0, 8, null);
                mlq0Var.a();
                return s3q0.a;
            default:
                ((ubr0) obj2).c.j(JsApiMethodType.SHOW_LEADER_BOARD_BOX, VkAppsErrors.b((Throwable) obj));
                return s3q0.a;
        }
    }

    public /* synthetic */ hb40(tt80 tt80Var, NewsEntry newsEntry) {
        this.b = 6;
        this.c = newsEntry;
    }
}
