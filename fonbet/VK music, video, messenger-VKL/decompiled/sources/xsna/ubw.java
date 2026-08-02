package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.fragment.OfflinePodcastEpisodesFragment;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.onepasspromo.impl.OnePassPromoFragment;
import com.vk.phoneactualization.impl.di.PhoneActualizationComponentImpl;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.MusicFeatures;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import com.vkontakte.android.R;
import xsna.k840;
import xsna.l310;
import xsna.mcz;
import xsna.nle;
import xsna.t4c0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ubw implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ubw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(o25.b(((ImRequestsFragment) this.c).S));
            case 1:
                v3y v3yVar = (v3y) this.c;
                return new olw((z1n0) v3yVar.f.getValue(), (uvp) v3yVar.e.getValue());
            case 2:
                return new i2y((r6y) this.c, new awz());
            case 3:
                ((zcz) this.c).e.onNext(mcz.h.a);
                return s3q0.a;
            case 4:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((a600) this.c)).a(fpf0.a(StoryEditorExtDepsComponent.class))).k7();
            case 5:
                gq00 gq00Var = (gq00) this.c;
                return new op00(gq00Var.b, gq00Var.c, ((cq00) gq00Var.a.getValue()).d, gq00Var.e);
            case 6:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) this.c;
                int i = MarketAllReviewsFragment.d0;
                return ((CommunityComponent) m7m.d(marketAllReviewsFragment).a(fpf0.a(CommunityComponent.class))).ke();
            case 7:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                int i2 = MarketItemReviewsFragment.w0;
                l310.q.e eVar = l310.q.e.b;
                marketItemReviewsFragment.getClass();
                xn50.a.c(marketItemReviewsFragment, eVar);
                return s3q0.a;
            case 8:
                MasksWrap masksWrap = (MasksWrap) this.c;
                int i3 = MasksWrap.e0;
                return new gfl(new ni10(masksWrap), new oi10(masksWrap));
            case 9:
                return ((VideoTechBugreportComponent) ((k7m) m7m.c((k120) this.c)).mo408a(fpf0.a(VideoTechBugreportComponent.class))).getReporter();
            case 10:
                ((zak0) ((az20) this.c).o).setValue(Boolean.FALSE);
                return s3q0.a;
            case 11:
                return ((mf40) this.c).E ? new nle.a() : new nle();
            case 12:
                String str = ((xp40) this.c).E;
                boolean z = true;
                if (str != null && drm0.D(str, "kids_section", false)) {
                    eqy<bek0> eqyVar = com.vk.toggle.d.a;
                    z = com.vk.toggle.b.A.a(MusicFeatures.AUDIO_NEW_KIDS_DOWNLOADED_SECTION);
                }
                return Boolean.valueOf(z);
            case 13:
                rw40 rw40Var = (rw40) this.c;
                if (((Boolean) rw40Var.F.getValue()).booleanValue()) {
                    return new sq3(rw40Var.y, new wik(rw40Var, 29), new c220(6));
                }
                return null;
            case 14:
                return (NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.common.util.g) this.c)).a(fpf0.a(NewsFeedComponent.class));
            case 15:
                return (BridgeComponent) ((h7m) ((du60) this.c).a.getValue()).a(fpf0.a(BridgeComponent.class));
            case 16:
                OfflinePodcastEpisodesFragment offlinePodcastEpisodesFragment = (OfflinePodcastEpisodesFragment) this.c;
                OfflinePodcastEpisodesFragment.b bVar = OfflinePodcastEpisodesFragment.Q;
                return ((OfflineAudioComponent) m7m.d(offlinePodcastEpisodesFragment).a(fpf0.a(OfflineAudioComponent.class))).Ja();
            case 17:
                OnePassPromoFragment onePassPromoFragment = (OnePassPromoFragment) this.c;
                int i4 = OnePassPromoFragment.R;
                return ((BridgeComponent) m7m.d(onePassPromoFragment).a(fpf0.a(BridgeComponent.class))).t();
            case 18:
                return "LivePlayerImpl.handleError() - closure state= " + wl80.this.G;
            case 19:
                ua90 ua90Var = (ua90) this.c;
                String string = ua90Var.a.getString(R.string.vkim_search_tab_title_messages);
                mkr0 mkr0Var = ua90Var.b;
                return new rwh0(string, new est(mkr0Var, 2), SearchMode.MESSAGES, MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_MESSAGES, 700L, new rx30(mkr0Var, ua90Var.c, false), R.string.vkim_search_screen_messages_tab_description, 64);
            case 20:
                return (ConstraintLayout) LayoutInflater.from(((dp90) this.c).a).inflate(R.layout.voip_history_past_call_details_view, (ViewGroup) null);
            case 21:
                PhoneActualizationComponentImpl phoneActualizationComponentImpl = (PhoneActualizationComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = PhoneActualizationComponentImpl.c;
                return new p2a0(phoneActualizationComponentImpl.getEntryPoint());
            case 22:
                ((com.vk.photogallery.c) this.c).c();
                return Boolean.TRUE;
            case 23:
                return ((e2b0) this.c).G.x0();
            case 24:
                yj40 yj40Var = (yj40) this.c;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(yj40Var);
                return s3q0.a;
            case 25:
                ThumbsImageView thumbsImageView = ((heb0) this.c).a;
                return Integer.valueOf(e3m.a(R.dimen.vkim_msg_part_playlist_lowest_thumb_size_enlarged, (thumbsImageView != null ? thumbsImageView : null).getContext()));
            case 26:
                return ((NewsFeedComponent) ((k7m) m7m.f((gqb0) this.c)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 27:
                return ((UserProfileComponent) ((k7m) m7m.f((y1c0) this.c)).mo408a(fpf0.a(UserProfileComponent.class))).Jc();
            case 28:
                ((y8c0) this.c).c().b(t4c0.f.a.b);
                return s3q0.a;
            default:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) this.c;
                qcy<Object>[] qcyVarArr2 = PostponedPostsFragment.q0;
                Bundle requireArguments = postponedPostsFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("owner_id", UserId.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("owner_id");
                    obj = (UserId) (parcelable2 instanceof UserId ? parcelable2 : null);
                }
                UserId userId = (UserId) obj;
                if (userId == null) {
                    userId = UserId.d;
                }
                return new drc0(userId);
        }
    }
}
