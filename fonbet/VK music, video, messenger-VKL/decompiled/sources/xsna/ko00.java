package xsna;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.core.fragments.FragmentEntry;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.ecomm.market.good.ui.d;
import com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ObtainVerificationFragment;
import com.vk.feed.settings.api.di.NewsfeedSettingsComponent;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.mediapicker.impl.presentation.fragment.MediaPickerFragment;
import com.vk.music.audioeffect.AudioEffectSettingsComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.mytarget.AdsSdkComponent;
import com.vk.mytarget.report.MyTargetReportFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.poll.views.PollSettingView;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import kotlin.Pair;
import xsna.bx1;
import xsna.cz40;
import xsna.e3m;
import xsna.fiq;
import xsna.fx40;
import xsna.m680.a;
import xsna.rtk0;
import xsna.xhz;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ko00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ko00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        PodcastPage podcastPage;
        MusicTrack musicTrack;
        ww50<?> Y;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 1:
                return ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) obj)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 2:
                return Integer.valueOf(((mc90) obj).k());
            case 3:
                int i2 = MediaPickerFragment.Q;
                ((MediaPickerFragment) obj).getParentFragmentManager().k0(yfb.b(new Pair("media_picker_cancelled", Boolean.TRUE)), "media_picker_result");
                return s3q0.a;
            case 4:
                return ((SearchUiComponent) ((k7m) m7m.f((n620) obj)).a(fpf0.a(SearchUiComponent.class))).Td();
            case 5:
                ((com.vk.translate.impl.views.b) obj).a.d1();
                return s3q0.a;
            case 6:
                oj20 oj20Var = (oj20) obj;
                com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) oj20Var.s;
                View findViewById = bVar.findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    bVar.o().X(3);
                    oj20Var.Ln(findViewById);
                }
                return s3q0.a;
            case 7:
                Context t = ((xt30) obj).t();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.vkim_msg_part_transparent_border_bg, t).mutate();
            case 8:
                z550 z550Var = (z550) obj;
                fx40.a aVar2 = new fx40.a(new bx1.a(true, true), new fiq.a(5), new rtk0.a(true), null, 99);
                return new hx40(cz40.b.C2691b.a, z550Var.getContext(), (otp) null, aVar2, new oh6(aVar2.b, ((AudioEffectSettingsComponent) m7m.e().a(fpf0.a(AudioEffectSettingsComponent.class))).f0()), 20);
            case 9:
                int i3 = MyTargetReportFragment.X;
                return ((AdsSdkComponent) ((MyTargetReportFragment) obj).U.getValue()).A1();
            case 10:
                int i4 = NewsfeedFilteredSourcesFragment.a0;
                return ((NewsfeedSettingsComponent) ((k7m) m7m.f((NewsfeedFilteredSourcesFragment) obj)).a(fpf0.a(NewsfeedSettingsComponent.class))).Da();
            case 11:
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                FragmentEntry Kn = ((NewsfeedSearchFragment) obj).Kn();
                return new tr60(Kn != null ? Kn.d : null, false, null, FullSourceJoinApi.EntryServiceType.SEARCH, null, null, 441);
            case 12:
                qcy<Object>[] qcyVarArr2 = ObtainVerificationFragment.T;
                return ((VerifiedSellerComponent) ((k7m) m7m.f((ObtainVerificationFragment) obj)).a(fpf0.a(VerifiedSellerComponent.class))).d();
            case 13:
                return ((m680) obj).new a();
            case 14:
                return ((QrWebToAppComponent) ((wl90) obj).k0().a(fpf0.a(QrWebToAppComponent.class))).getHandler();
            case 15:
                tw90 tw90Var = (tw90) obj;
                if (tw90Var.c.a(PerformanceEventType.LITE_SYNC)) {
                    return new yhz(tw90Var.a);
                }
                xhz.a.getClass();
                return xhz.a.b;
            case 16:
                ((StoryProgressView) ((x2a0) obj).u0.getValue()).setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 17:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) obj;
                int i5 = PhotoFlowFragment.m0;
                a.s.d dVar = a.s.d.b;
                photoFlowFragment.getClass();
                xn50.a.c(photoFlowFragment, dVar);
                return s3q0.a;
            case 18:
                return ((PlayerAnalyticsComponent) j6i.b(m7m.f((e2b0) obj), PlayerAnalyticsComponent.class)).c2();
            case 19:
                int i6 = PodcastEpisodeFragment.u0;
                com.vk.music.podcast.impl.ui.episode.b bVar2 = (com.vk.music.podcast.impl.ui.episode.b) ((PodcastEpisodeFragment) obj).S;
                if (bVar2 == null || (podcastPage = bVar2.e) == null || (musicTrack = podcastPage.b) == null) {
                    return s3q0.a;
                }
                bVar2.b(musicTrack);
                return s3q0.a;
            case 20:
                return (PollSettingView) ((hpb0) obj).g(R.id.poll_option_multivariants);
            case 21:
                return ((NewsFeedComponent) ((k7m) m7m.f((dcc0) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 22:
                return Integer.valueOf(e3m.a(R.dimen.vk_ui_spacing_size_xs, ((com.vk.profile.core.info_items.a) obj).itemView.getContext()));
            case 23:
                int i7 = PostingFragment.L0;
                return ((ClipsUploadUiVkComponent) ((k7m) m7m.f((PostingFragment) obj)).mo408a(fpf0.a(ClipsUploadUiVkComponent.class))).f();
            case 24:
                return ((NewsFeedComponent) ((k7m) m7m.f((pgc0) obj)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 25:
                pkc0 pkc0Var = (pkc0) obj;
                pkc0Var.a.invoke();
                pkc0Var.b.invoke();
                return s3q0.a;
            case 26:
                d.a aVar3 = ((com.vk.ecomm.market.good.ui.e) obj).m;
                if (aVar3 != null) {
                    aVar3.f();
                }
                return s3q0.a;
            case 27:
                ProfileMainPhotosFragment profileMainPhotosFragment = (ProfileMainPhotosFragment) obj;
                int i8 = ProfileMainPhotosFragment.F0;
                FragmentActivity activity = profileMainPhotosFragment.getActivity();
                ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                    Y.H(profileMainPhotosFragment.n0);
                }
                return s3q0.a;
            case 28:
                return ((CommunityStrikesComponent) ((k7m) m7m.f((com.vk.upload.impl.tasks.u) obj)).a(fpf0.a(CommunityStrikesComponent.class))).ge();
            default:
                PublishFragmentInternalComponent.a aVar4 = PublishFragmentInternalComponent.v;
                nwy nwyVar = ((PublishFragmentInternalComponent) obj).q;
                qcy<Object> qcyVar = PublishFragmentInternalComponent.w[8];
                return new hn1((cde0) nwyVar.c());
        }
    }
}
