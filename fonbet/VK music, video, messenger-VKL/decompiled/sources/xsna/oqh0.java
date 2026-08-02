package xsna;

import android.os.Parcelable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.catalog2.common.ui.holders.search.SearchStaticMapPreviewVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.documents.impl.SearchDocumentsListFragment.d;
import com.vk.geo.api.data.IconDrawConfig;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarLayout2;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.screen.VideoFragment;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.editor.verticalization.VerticalizationLoadingView;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vk.storycamera.upload.VideoStoryUploadTask;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.frq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class oqh0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oqh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        yks0 yks0Var;
        int i = 4;
        switch (this.b) {
            case 0:
                SearchDocumentsListFragment searchDocumentsListFragment = (SearchDocumentsListFragment) this.c;
                int i2 = SearchDocumentsListFragment.h0;
                return searchDocumentsListFragment.new d();
            case 1:
                IconDrawConfig iconDrawConfig = (IconDrawConfig) ((SearchStaticMapPreviewVh) this.c).m.getValue();
                Parcelable.Creator<IconDrawConfig> creator = IconDrawConfig.CREATOR;
                return new IconDrawConfig(iconDrawConfig.b, iconDrawConfig.c, iconDrawConfig.d, iconDrawConfig.e, -1, -7829368, iconDrawConfig.h, iconDrawConfig.i, iconDrawConfig.j, iconDrawConfig.k, iconDrawConfig.l, iconDrawConfig.m, iconDrawConfig.n, iconDrawConfig.o, iconDrawConfig.p, iconDrawConfig.q, iconDrawConfig.r, iconDrawConfig.s, iconDrawConfig.t, iconDrawConfig.u, iconDrawConfig.v);
            case 2:
                SelectAlbumBottomSheet selectAlbumBottomSheet = (SelectAlbumBottomSheet) this.c;
                int i3 = SelectAlbumBottomSheet.p1;
                return new k6i0(selectAlbumBottomSheet.bo().b, (AlbumsRepository) selectAlbumBottomSheet.l1.getValue(), selectAlbumBottomSheet.getFeature().e, selectAlbumBottomSheet.bo().g, new bl30(selectAlbumBottomSheet, 17), new yd4(selectAlbumBottomSheet, i), new yde(selectAlbumBottomSheet, 6));
            case 3:
                return ((vcy) ((ArrayList) this.c).get(0)).k();
            case 4:
                com.vk.pushes.notifications.base.a aVar = (com.vk.pushes.notifications.base.a) this.c;
                return aVar.z() ? aVar.m() : EmptyList.b;
            case 5:
                com.vk.clips.sdk.shared.item.static_ads.c cVar = (com.vk.clips.sdk.shared.item.static_ads.c) this.c;
                int i4 = cVar.i;
                lvk0 lvk0Var = cVar.m;
                return new zvk0(cVar, i4, lvk0Var.d(), lvk0Var.e(), cVar.B);
            case 6:
                return new v4n0(((i5n0) this.c).h.a, ur60.h);
            case 7:
                UserEditProfileModalBottomSheet userEditProfileModalBottomSheet = (UserEditProfileModalBottomSheet) this.c;
                qcy<Object>[] qcyVarArr = UserEditProfileModalBottomSheet.s1;
                return ((UserProfileComponent) m7m.d(userEditProfileModalBottomSheet).mo408a(fpf0.a(UserProfileComponent.class))).mc();
            case 8:
                ((UserProfileDialogs) this.c).h.B(new f.e.o0(MobileOfficialAppsCoreNavStat$EventScreen.CELEBRITY_VERIFICATION_FAQ, i5s.a(new StringBuilder("https://"), a0a.d, "/blog/verification")));
                return s3q0.a;
            case 9:
                throw null;
            case 10:
                VerticalizationLoadingView verticalizationLoadingView = (VerticalizationLoadingView) this.c;
                List<Integer> list = VerticalizationLoadingView.A;
                return ((CommonEditorComponent) ((k7m) m7m.f(verticalizationLoadingView)).a(fpf0.a(CommonEditorComponent.class))).Ha();
            case 11:
                return (TextView) ((VideoAutoPlaySeekBarLayout2) this.c).findViewById(R.id.seek_time);
            case 12:
                dis0 dis0Var = (dis0) this.c;
                awt0.u(dis0Var.c, true);
                VkSpinner vkSpinner = dis0Var.f;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(4);
                }
                dis0Var.setClickable(true);
                return s3q0.a;
            case 13:
                VideoFragment videoFragment = (VideoFragment) this.c;
                int i5 = VideoFragment.c0;
                return ((VideoSeekComponent) m7m.d(videoFragment).mo408a(fpf0.a(VideoSeekComponent.class))).E1();
            case 14:
                FrameLayout frameLayout = ((VideoItemListLargeVh) this.c).t;
                if (frameLayout == null) {
                    return null;
                }
                return frameLayout;
            case 15:
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = ((VideoMinimizableDiscoveryFragment) this.c).X;
                if (miniPlayerControllersWrapper == null || (yks0Var = miniPlayerControllersWrapper.t) == null) {
                    return null;
                }
                return yks0Var.e;
            case 16:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) this.c;
                return Boolean.valueOf((mVar.r || mVar.x || !mVar.v) ? false : true);
            case 17:
                ((cys0) this.c).b0.invoke(a.q.b);
                return s3q0.a;
            case 18:
                return (VideoPlaylistReversionComponent) ((k7m) m7m.f((n4t0) this.c)).a(fpf0.a(VideoPlaylistReversionComponent.class));
            case 19:
                return Boolean.valueOf(((com.vk.newsfeed.common.recycler.holders.i) this.c).t);
            case 20:
                return ((StoriesSettingsComponent) ((k7m) m7m.f((VideoStoryUploadTask) this.c)).a(fpf0.a(StoriesSettingsComponent.class))).B7();
            case 21:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) this.c).element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 22:
                yg5 yg5Var = ((VideoView) this.c).I;
                return Boolean.valueOf(yg5Var != null && yg5Var.P0());
            case 23:
                ((d5u0) this.c).l();
                return s3q0.a;
            case 24:
                return (zia) ((xhu0) this.c).b.getValue();
            case 25:
                ((com.vk.core.compose.component.datetime.d) this.c).e(false);
                return s3q0.a;
            case 26:
                ((fuv0) this.c).close();
                return s3q0.a;
            case 27:
                f69 f69Var = (f69) this.c;
                com.vk.voip.ui.c.b.getClass();
                f69Var.a(new izy(((r6x0) com.vk.voip.ui.c.l0()).o()));
                return s3q0.a;
            default:
                return ((VoipCallComponent) ((k7m) m7m.f((nvw0) this.c)).a(fpf0.a(VoipCallComponent.class))).L1();
        }
    }

    public /* synthetic */ oqh0(frq0.b bVar, frq0.a aVar) {
        this.b = 9;
        this.c = bVar;
    }
}
