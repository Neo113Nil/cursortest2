package xsna;

import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.view.components.cell.rich.middle.VkRichCellMiddle;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.core.voip.VoipCallSource;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.media.pipeline.gl.GlException;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.api.di.StickersComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.profile.presentation.a;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collections;
import kotlin.Pair;
import xsna.khw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jcf0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jcf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        Parcelable parcelable;
        Object parcelable2;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return (kcf0) this.c;
            case 1:
                return new SearchCommunitiesOnMapFragment.a(((SearchCommunitiesOnMapFragment.b) this.c).j);
            case 2:
                return ((afi0) this.c).b();
            case 3:
                ptj0 ptj0Var = (ptj0) this.c;
                wwf0 wwf0Var = wwf0.c;
                f100 f100Var = ptj0Var.a.d;
                try {
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    wwf0.o(wwf0Var, null, 3);
                    i = iArr[0];
                } catch (Throwable th) {
                    if (f100Var != null) {
                        f100Var.a("SingleDecoderFactory", th);
                    }
                }
                if (i == 0) {
                    throw new GlException("Wrong texId=0, egl context?");
                }
                i2 = i;
                ptj0Var.i = i2;
                return s3q0.a;
            case 4:
                return com.vk.clips.sdk.shared.item.static_ads.c.q((com.vk.clips.sdk.shared.item.static_ads.c) this.c);
            case 5:
                return new bcl0(((ncl0) this.c).d);
            case 6:
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) this.c;
                VoipCallSource voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.COMMUNITY_BUTTON, MobileOfficialAppsCoreNavStat$EventScreen.MARKET);
                long j = usersUserFullDto.s1().b;
                String D0 = usersUserFullDto.D0();
                String str = D0 == null ? "" : D0;
                String a = rq.a(usersUserFullDto, new StringBuilder(), ' ');
                String y2 = usersUserFullDto.y2();
                a201.b().a().d(new khw0.a(new zqk0(null, j, str, a, y2 == null ? "" : y2, usersUserFullDto.L2() == BaseSexDto.FEMALE, usersUserFullDto.R2() == BaseBoolIntDto.YES, Collections.singleton(String.valueOf(usersUserFullDto.s1().b)), false, null, null, null, null, 0, false, null, null, null, false, false, false, 4194049), voipCallSource, null, null, null, 28));
                return s3q0.a;
            case 7:
                return ((StoryViewerComponent) ((k7m) m7m.f((jtl0) this.c)).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 8:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) this.c;
                int i3 = StoryMediaPickerFragment.d0;
                Bundle arguments = storyMediaPickerFragment.getArguments();
                if (arguments == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments.getParcelable("camera_params", StoryCameraParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = arguments.getParcelable("camera_params");
                    parcelable = (StoryCameraParams) (parcelable3 instanceof StoryCameraParams ? parcelable3 : null);
                }
                return (StoryCameraParams) parcelable;
            case 9:
                return ((StickersComponent) ((k7m) m7m.c(((o8m0) this.c).b)).a(fpf0.a(StickersComponent.class))).bc();
            case 10:
                qo6 currentStoryView = ((com.vk.story.viewer.impl.presentation.stories.b) this.c).getCurrentStoryView();
                if (currentStoryView != null) {
                    return currentStoryView.getSavedCadreSize();
                }
                return null;
            case 11:
                return ((NewsFeedComponent) ((k7m) m7m.f((p1o0) this.c)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 12:
                return zr.a("File ", ((File) this.c).getPath(), " does not exist or is not a file");
            case 13:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
                int i4 = UserProfileFragment.p0;
                return ((UserProfileComponent) ((k7m) m7m.f(userProfileFragment)).mo408a(fpf0.a(UserProfileComponent.class))).Jc();
            case 14:
                return ((ker0) this.c).vn();
            case 15:
                u76 u76Var = ((jpr0) this.c).c;
                return Long.valueOf(u76Var.k3().Kb() ? u76Var.k3().e.b : u76Var.k3().b.b);
            case 16:
                return ((CatalogLegacyComponent) ((k7m) m7m.f((b9s0) this.c)).a(fpf0.a(CatalogLegacyComponent.class))).qf();
            case 17:
                gzs<s3q0> gzsVar = ((VideoCatalogRootVh) this.c).s;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 18:
                VideoCommentThreadFragment videoCommentThreadFragment = (VideoCommentThreadFragment) this.c;
                int i5 = VideoCommentThreadFragment.B0;
                return ((BridgeComponent) m7m.d(videoCommentThreadFragment).a(fpf0.a(BridgeComponent.class))).s();
            case 19:
                VideoCommentsTreeInPlayerFragment videoCommentsTreeInPlayerFragment = (VideoCommentsTreeInPlayerFragment) this.c;
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                return videoCommentsTreeInPlayerFragment.requireContext();
            case 20:
                VideoItemListLargeVh videoItemListLargeVh = (VideoItemListLargeVh) this.c;
                LinearLayout linearLayout = videoItemListLargeVh.u;
                return new k2u0(linearLayout != null ? linearLayout : null, new cim0(videoItemListLargeVh, 10));
            case 21:
                return (VideoKidsComponent) ((f8m) this.c).a(fpf0.a(VideoKidsComponent.class));
            case 22:
                ((cys0) this.c).b0.invoke(a.e0.b);
                return s3q0.a;
            case 23:
                ((VideoPlaylistBottomSheet) this.c).b = null;
                return s3q0.a;
            case 24:
                VideoView videoView = (VideoView) this.c;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return videoView.getTopBar();
            case 25:
                VkRichCellMiddle vkRichCellMiddle = (VkRichCellMiddle) this.c;
                int i6 = VkRichCellMiddle.p;
                return new VkUserStack(vkRichCellMiddle.getContext(), null, 6);
            case 26:
                euw0 euw0Var = (euw0) this.c;
                int i7 = euw0.f1;
                euw0Var.getParentFragmentManager().k0(yfb.b(new Pair("key_on_click_share_link", Boolean.TRUE)), "result_participant_add_user_options");
                euw0Var.dismiss();
                return s3q0.a;
            case 27:
                return (TextView) ((View) ((qyw0) this.c).e.getValue()).findViewById(R.id.call_by_link_media_setting_disabled_permanent_view);
            default:
                tkx0 tkx0Var = (tkx0) ((xkx0) this.c).a;
                if (tkx0Var != null) {
                    tkx0Var.e();
                }
                return s3q0.a;
        }
    }
}
