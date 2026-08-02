package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.unity3d.services.core.misc.JsonStorage;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cameraui.impl.QrScannerUi;
import com.vk.catalog2.common.ui.mvp.holder.video.offline.di.component.api.VideoCatalogComponent;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.push.rustore.impl.di.RuStoreComponentImpl;
import com.vk.search.ui.SearchLocationPermissionsController;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.story.viewer.impl.presentation.stories.util.StoryQuestionMessageDialog;
import com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase_Impl;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import xsna.cqc0;
import xsna.pr90;
import xsna.r7d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b290 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b290(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int a;
        JsonStorage publicJsonStorage;
        GetPrivacyUpdateRequest initialize$lambda$220$lambda$125;
        int i = this.b;
        int i2 = 16;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((c290) obj).k = null;
                return s3q0.a;
            case 1:
                return new pr90.b((or90) ((pr90) obj).h);
            case 2:
                int i3 = PhotoFlowFragment.m0;
                return ((BridgeComponent) ((PhotoFlowFragment) obj).e0.getValue()).h8();
            case 3:
                int i4 = PodcastEpisodeFragment.u0;
                h3p0.b((PodcastEpisodeFragment) obj);
                return s3q0.a;
            case 4:
                return (ThumbsImageView) ((rhb0) obj).itemView.findViewById(R.id.audio_image);
            case 5:
                sjb0 sjb0Var = (sjb0) obj;
                MusicTrack musicTrack = ((PodcastInfo) sjb0Var.m).d;
                if (musicTrack == null) {
                    return s3q0.a;
                }
                sjb0Var.n.x5(musicTrack);
                return s3q0.a;
            case 6:
                return ((NewsFeedComponent) ((k7m) m7m.f((xzb0) obj)).a(fpf0.a(NewsFeedComponent.class))).X5();
            case 7:
                dw20 dw20Var = ((wdc0) obj).c;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 8:
                int i5 = PostingFragment.s0;
                return ((PostingFragment) obj).getParentFragmentManager();
            case 9:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) obj).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.clips_posting_privacy_friends_and_friends_of_friends);
                return modalSettingsPrivacyOption;
            case 10:
                ((d8d0) obj).w().invoke(r7d0.g.a);
                return s3q0.a;
            case 11:
                int i6 = ProfileMainPhotosFragment.F0;
                return new daa0(new c4r((ProfileMainPhotosFragment) obj), new c220(i2), null, 28);
            case 12:
                QrScannerUi qrScannerUi = (QrScannerUi) obj;
                if (qrScannerUi.b.c4() == StoryCameraMode.QR_SCANNER) {
                    a = iah0.a(60);
                } else {
                    View findViewById = qrScannerUi.a.findViewById(R.id.shutter);
                    if (findViewById == null) {
                        a = iah0.a(60);
                    } else {
                        qcy<Object>[] qcyVarArr = bwt0.a;
                        a = iah0.a(16) + ((bwt0.M(findViewById) + findViewById.getBottom()) - findViewById.getTop());
                    }
                }
                return Integer.valueOf(a);
            case 13:
                qcy<Object>[] qcyVarArr2 = RuStoreComponentImpl.f;
                return new frg0(((RuStoreComponentImpl) obj).Bf());
            case 14:
                String str = (String) obj;
                if (SearchLocationPermissionsController.a.C1775a.$EnumSwitchMapping$0[SearchLocationPermissionsController.PermissionSettingsAction.Open.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                SearchLocationPermissionsController.a.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_GEO_SETTINGS, str);
                return s3q0.a;
            case 15:
                ((izs) ((zak0) ((u8i0) obj).d).getValue()).invoke(Boolean.FALSE);
                return s3q0.a;
            case 16:
                idi0 idi0Var = (idi0) obj;
                idi0Var.b.t.a();
                idi0Var.b(false);
                return s3q0.a;
            case 17:
                publicJsonStorage = ((UnityAdsModule) obj).publicJsonStorage();
                return publicJsonStorage;
            case 18:
                initialize$lambda$220$lambda$125 = ServiceProvider.initialize$lambda$220$lambda$125((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$125;
            case 19:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_comment_input_common_top_shadow);
            case 20:
                return ((ModerationComponent) ((k7m) m7m.f((wjl0) obj)).mo408a(fpf0.a(ModerationComponent.class))).bd();
            case 21:
                int i7 = StoryAvatarView.G;
                return ((StoriesComponent) ((k7m) m7m.c((StoryAvatarView) obj)).a(fpf0.a(StoriesComponent.class))).eb();
            case 22:
                return ((StoryEditorExtDepsComponent) m7m.a(((e7m0) obj).l).a(fpf0.a(StoryEditorExtDepsComponent.class))).M0();
            case 23:
                int i8 = StoryQuestionMessageDialog.W;
                return ((StoryViewerComponent) m7m.d((StoryQuestionMessageDialog) obj).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 24:
                return new tem0((StoryStatisticsDatabase_Impl) obj);
            case 25:
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                qg90 i9 = vua0.i(true);
                Integer num = (Integer) i9.a;
                Uri N = com.vk.core.files.a.N((File) i9.b);
                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                intent.putExtra("output", N);
                if (intent.resolveActivity(fragmentImpl.kn().getPackageManager()) != null) {
                    fragmentImpl.startActivityForResult(intent, num.intValue());
                }
                return s3q0.a;
            case 26:
                Context context = ((b5p0) obj).p.getContext();
                ScrollView scrollView = new ScrollView(context);
                scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(-16711936);
                float f = 276;
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, iah0.a(f)));
                View view2 = new View(context);
                view2.setBackgroundColor(-65536);
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, iah0.a(f)));
                linearLayout.addView(view);
                linearLayout.addView(view2);
                scrollView.addView(linearLayout);
                return scrollView;
            case 27:
                ((ww50) obj).j0();
                return s3q0.a;
            case 28:
                ((kfr0) obj).c.m(JsApiMethodType.RECOMMEND_APP, VkAppsErrors.Client.USER_DENIED, null, null);
                return s3q0.a;
            default:
                int i10 = VideoCatalogFragment.l0;
                ((VideoCatalogComponent) m7m.d((VideoCatalogFragment) obj).mo408a(fpf0.a(VideoCatalogComponent.class))).getClass();
                return null;
        }
    }
}
