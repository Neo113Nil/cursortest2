package xsna;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ObtainVerificationFragment;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.reporters.api.engine.LongPollExpiredReporter;
import com.vk.musc.kidsmode.impl.di.MusicKidsModeComponentImpl;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.mytarget.AdsSdkComponent;
import com.vk.mytarget.report.MyTargetReportFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboardingscreens.impl.di.OnboardingScreensComponentImpl;
import com.vk.photos.legacy.EditAlbumFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.poll.views.PollSettingView;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.ab0;
import xsna.cqc0;
import xsna.e3m;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class lo10 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lo10(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        PhotoAlbum photoAlbum;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                mo10 mo10Var = (mo10) obj;
                return new osg0(mo10Var.c, mo10Var.a);
            case 1:
                oj20 oj20Var = (oj20) obj;
                otu0 otu0Var = oj20Var.D;
                Context requireContext = oj20Var.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.PRIMARY_FACTOR_CHOICE;
                otu0Var.getClass();
                otu0.b(requireContext, schemeStatSak$EventScreen);
                return s3q0.a;
            case 2:
                Context t = ((xt30) obj).t();
                e3m.a aVar = e3m.a;
                return new PorterDuffColorFilter(t.getColor(R.color.vk_gray_1000), PorterDuff.Mode.SRC_ATOP);
            case 3:
                int i2 = MusicCatalogFragment.W;
                VkOnboardingComponent vkOnboardingComponent = (VkOnboardingComponent) m7m.d((MusicCatalogFragment) obj).a(fpf0.a(VkOnboardingComponent.class));
                return new tiy(vkOnboardingComponent.p3(), new bn7(vkOnboardingComponent, 10));
            case 4:
                MusicKidsModeComponentImpl musicKidsModeComponentImpl = (MusicKidsModeComponentImpl) obj;
                nwy nwyVar = musicKidsModeComponentImpl.c;
                qcy<Object> qcyVar = MusicKidsModeComponentImpl.f[0];
                return new zl40((lm40) nwyVar.c(), new bpn0(new hvz(musicKidsModeComponentImpl, 13)), musicKidsModeComponentImpl.b.q2(), musicKidsModeComponentImpl.a.s());
            case 5:
                Set<String> set = MusicTrackCellVh.A;
                return new ms1(((MusicTrackCellVh) obj).e(), new wxt(k840.a.i, 2));
            case 6:
                int i3 = MyTargetReportFragment.X;
                return ((AdsSdkComponent) ((MyTargetReportFragment) obj).U.getValue()).yd();
            case 7:
                Context context = ((sm60) obj).a.getContext();
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.d(context));
            case 8:
                qcy<Object>[] qcyVarArr = ObtainVerificationFragment.T;
                return ((BridgeComponent) ((k7m) m7m.f((ObtainVerificationFragment) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 9:
                qcy<Object>[] qcyVarArr2 = OnboardingScreensComponentImpl.h;
                return new ezq0(((OnboardingScreensComponentImpl) obj).Ye());
            case 10:
                if (((tw90) obj).c.a(PerformanceEventType.LONG_POLL_EXPIRED)) {
                    return new g400();
                }
                LongPollExpiredReporter.a.getClass();
                return LongPollExpiredReporter.a.b;
            case 11:
                ((StoryProgressView) ((x2a0) obj).u0.getValue()).setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 12:
                PhotoAlbumFragment photoAlbumFragment = (PhotoAlbumFragment) obj;
                f5a0 f5a0Var = photoAlbumFragment.p0;
                if (f5a0Var != null && (photoAlbum = f5a0Var.g) != null) {
                    ((ClipboardManager) photoAlbumFragment.kn().getSystemService("clipboard")).setText(dz5.r(photoAlbum));
                    cvk.u(R.string.link_copied, false);
                }
                return s3q0.a;
            case 13:
                return x6a0.this.V;
            case 14:
                ((PhotoFlowFragment) obj).l0 = true;
                return s3q0.a;
            case 15:
                return ((NewsFeedComponent) ((k7m) m7m.f((daa0) obj)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 16:
                ((nma0) obj).g.j("as90");
                return s3q0.a;
            case 17:
                return (PollSettingView) ((hpb0) obj).g(R.id.poll_option_anonymous);
            case 18:
                for (UsableRecyclerView.j jVar : (List) obj) {
                    FeedGoodsPhotoHolder feedGoodsPhotoHolder = jVar instanceof FeedGoodsPhotoHolder ? (FeedGoodsPhotoHolder) jVar : null;
                    if (feedGoodsPhotoHolder != null) {
                        feedGoodsPhotoHolder.n1();
                    }
                }
                return s3q0.a;
            case 19:
                hb0<nha0> hb0Var = ((dcc0) obj).r;
                if (hb0Var != null) {
                    hb0Var.a(oha0.a(ab0.c.a));
                }
                return s3q0.a;
            case 20:
                int i4 = PostingFragment.s0;
                return ((BridgeComponent) m7m.d((PostingFragment) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 21:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) obj).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.clips_posting_privacy_available_everyone);
                return modalSettingsPrivacyOption;
            case 22:
                xvy xvyVar = (xvy) obj;
                xuy xuyVar = (xuy) j5g.k0(xvyVar.j().f());
                return Boolean.valueOf(xuyVar != null && xuyVar.getIndex() == xvyVar.j().d() - 1);
            case 23:
                qcy<Object>[] qcyVarArr3 = ycd0.m1;
                Bundle requireArguments = ((ycd0) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("donut_level", DonutLevel.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable5 = requireArguments.getParcelable("donut_level");
                    parcelable = (DonutLevel) (parcelable5 instanceof DonutLevel ? parcelable5 : null);
                }
                return (DonutLevel) parcelable;
            case 24:
                ProfileMainPhotosFragment profileMainPhotosFragment = (ProfileMainPhotosFragment) obj;
                int i5 = ProfileMainPhotosFragment.F0;
                Bundle bundle = new Bundle();
                bundle.putParcelable("owner_id", profileMainPhotosFragment.y0.f);
                oz50 oz50Var = new oz50(EditAlbumFragment.class, null, bundle);
                TabletDialogActivity.a aVar2 = new TabletDialogActivity.a(0);
                aVar2.b();
                qz50.a(oz50Var, aVar2);
                oz50Var.s(true);
                oz50Var.g(8295, profileMainPhotosFragment);
                return s3q0.a;
            case 25:
                return ((MusicPrefsComponent) ((k7m) m7m.f((e6e0) obj)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 26:
                PublishFragmentInternalComponent.a aVar3 = PublishFragmentInternalComponent.v;
                nwy nwyVar2 = ((PublishFragmentInternalComponent) obj).n;
                qcy<Object> qcyVar2 = PublishFragmentInternalComponent.w[5];
                return ((g7s0) nwyVar2.c()).J();
            case 27:
                Context ctx = ((e2f0) obj).a.getCtx();
                bpn0 bpn0Var = enj.a;
                return ((StoryReactionsComponent) m7m.a(e3m.h(ctx)).mo408a(fpf0.a(StoryReactionsComponent.class))).b();
            case 28:
                int i6 = osf0.q1;
                Bundle requireArguments2 = ((osf0) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = requireArguments2.getParcelable("arg_clicked_user", UserId.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    Parcelable parcelable6 = requireArguments2.getParcelable("arg_clicked_user");
                    parcelable3 = (UserId) (parcelable6 instanceof UserId ? parcelable6 : null);
                }
                UserId userId = (UserId) parcelable3;
                return userId == null ? UserId.d : userId;
            default:
                xdg0 xdg0Var = (xdg0) obj;
                ((gzs) ((zak0) xdg0Var.c).getValue()).invoke();
                dw20 dw20Var = (dw20) ((zak0) xdg0Var.e).getValue();
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
        }
    }
}
