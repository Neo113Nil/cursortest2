package xsna;

import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.f;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantBannerVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.api.params.ClipsFavoritesFolderRenamingParams;
import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.libvideo.coldstart.api.di.VideoColdStartComponent;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vkontakte.android.R;
import xsna.c99;
import xsna.epb;
import xsna.mo6;
import xsna.xn50;
import xsna.z31;
import xsna.zws;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ra0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ra0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        RecyclerPaginatedView recyclerPaginatedView;
        Object obj2;
        Object parcelable2;
        Object obj3;
        Object parcelable3;
        int i = this.b;
        int i2 = 0;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                return ((NewsFeedComponent) ((ta0) obj4).E.getValue()).Vb();
            case 1:
                AiAssistantBannerVh aiAssistantBannerVh = (AiAssistantBannerVh) obj4;
                VkBanner vkBanner = aiAssistantBannerVh.c;
                aiAssistantBannerVh.onClick(vkBanner != null ? vkBanner : null);
                return s3q0.a;
            case 2:
                int i3 = xp1.l1;
                Parcelable parcelable4 = ((xp1) obj4).requireArguments().getParcelable("uid");
                if (parcelable4 != null) {
                    return (UserId) parcelable4;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 3:
                return Integer.valueOf(((uru) obj4).a.getAlpha());
            case 4:
                return new n5x0((gbw0) ((qr2) obj4).d.getValue());
            case 5:
                int i4 = ar3.l1;
                return ((PlayerAnalyticsComponent) m7m.d((ar3) obj4).a(fpf0.a(PlayerAnalyticsComponent.class))).z7();
            case 6:
                ((wx3) obj4).notifyDataSetChanged();
                return s3q0.a;
            case 7:
                return ((VideoColdStartComponent) ((k7m) m7m.f(((com.vk.libvideo.autoplay.b) obj4).d)).a(fpf0.a(VideoColdStartComponent.class))).Eb();
            case 8:
                int i5 = AvatarAnimatedStack.q;
                Paint paint = new Paint();
                paint.setColor(dhr0.t.c(R.attr.vk_ui_background_content));
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                return new np5(i2, (AvatarAnimatedStack) obj4, paint);
            case 9:
                return new tnp0(((p36) obj4).m);
            case 10:
                u440 u440Var = (u440) obj4;
                return new px1(u440Var.D7(), u440Var.i);
            case 11:
                ((vj6) obj4).h();
                return s3q0.a;
            case 12:
                return Long.valueOf(((mei0) obj4).d());
            case 13:
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.setup.g) obj4).f.b(f.c.a);
                return s3q0.a;
            case 14:
                c99.c0 c0Var = (c99.c0) obj4;
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                return (voipDataProvider != null ? voipDataProvider : null).d(c0Var.b);
            case 15:
                CameraUIView cameraUIView = (CameraUIView) obj4;
                float f = CameraUIView.w1;
                int i6 = (int) cameraUIView.Q(false).c;
                View findViewById = cameraUIView.y0.findViewById(R.id.qr_header_shadow);
                if (findViewById != null) {
                    f4m.t(i6, findViewById);
                }
                return s3q0.a;
            case 16:
                ChannelFragment channelFragment = (ChannelFragment) obj4;
                int i7 = ChannelFragment.a1;
                return new ham(channelFragment.wo(), (hza) channelFragment.W0.getValue());
            case 17:
                return i5s.a(new StringBuilder(), ((wgb) obj4).s, ": updateExpiredIfNeeded: started update history");
            case 18:
                ((aib) obj4).f.invoke();
                return s3q0.a;
            case 19:
                lpb lpbVar = (lpb) obj4;
                epb.e eVar = epb.e.b;
                lpbVar.getClass();
                xn50.a.c(lpbVar, eVar);
                return s3q0.a;
            case 20:
                int i8 = inc.l1;
                Bundle requireArguments = ((inc) obj4).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("clip", ClipVideoFile.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable5 = requireArguments.getParcelable("clip");
                    obj = (ClipVideoFile) (parcelable5 instanceof ClipVideoFile ? parcelable5 : null);
                }
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj;
                if (clipVideoFile != null) {
                    return new qow(clipVideoFile);
                }
                throw new IllegalArgumentException("Clip must be provided by input arguments");
            case 21:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj4;
                int i9 = ClipFeedListFragment.a2;
                return new i8e(((nbs) clipFeedListFragment.H0.getValue()).getLifecycle(), new vxc(clipFeedListFragment, i2), new wxc(clipFeedListFragment, i2));
            case 22:
                PaginatedGridListVh paginatedGridListVh = ((ClipSearchRootVh) obj4).G;
                if (paginatedGridListVh == null || (recyclerPaginatedView = paginatedGridListVh.n) == null) {
                    return null;
                }
                return recyclerPaginatedView;
            case 23:
                bpn0 bpn0Var = ((sdd) obj4).F;
                ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_TRENDS_FULLSCREEN;
                clipsFeatures.getClass();
                return new t1n(com.vk.toggle.b.A.a(clipsFeatures) ? new tdd(2, (wqc) bpn0Var.getValue(), wqc.class, "openTrendClip", "openTrendClip(Landroid/view/View;Lcom/vk/catalog2/common/dto/ui/UIBlockVideo;)V", 0) : new udd(2, (wqc) bpn0Var.getValue(), wqc.class, "openClip", "openClip(Landroid/view/View;Lcom/vk/catalog2/common/dto/ui/UIBlockVideo;)V", 0));
            case 24:
                int i10 = ClipsEntryPointsFragment.i0;
                return ((ClipsBlacklistsComponent) m7m.d((ClipsEntryPointsFragment) obj4).a(fpf0.a(ClipsBlacklistsComponent.class))).f4();
            case 25:
                String str = com.vk.clips.favorites.impl.ui.folders.renaming.b.m1;
                Bundle requireArguments2 = ((com.vk.clips.favorites.impl.ui.folders.renaming.b) obj4).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments2.getParcelable("params", ClipsFavoritesFolderRenamingParams.class);
                    obj2 = (Parcelable) parcelable2;
                } else {
                    Object parcelable6 = requireArguments2.getParcelable("params");
                    obj2 = (ClipsFavoritesFolderRenamingParams) (parcelable6 instanceof ClipsFavoritesFolderRenamingParams ? parcelable6 : null);
                }
                if (obj2 != null) {
                    return (ClipsFavoritesFolderRenamingParams) obj2;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 26:
                qcy<Object>[] qcyVarArr = kse.n1;
                Bundle requireArguments3 = ((kse) obj4).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable3 = requireArguments3.getParcelable("folder_input_params", ClipsPlaylistNamingLaunchParams.class);
                    obj3 = (Parcelable) parcelable3;
                } else {
                    Object parcelable7 = requireArguments3.getParcelable("folder_input_params");
                    obj3 = (ClipsPlaylistNamingLaunchParams) (parcelable7 instanceof ClipsPlaylistNamingLaunchParams ? parcelable7 : null);
                }
                ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams = (ClipsPlaylistNamingLaunchParams) obj3;
                if (clipsPlaylistNamingLaunchParams != null) {
                    return clipsPlaylistNamingLaunchParams;
                }
                throw new IllegalArgumentException("You must provide input params via bundle. See ClipsPlaylistNamingLaunchParams.kt");
            case 27:
                return new fyu(((ClipsViewerComponentImpl) obj4).b.getExperiments().I());
            case 28:
                int i11 = ClipsWrapperFragment.Q0;
                return (VkClientMultiAccountComponent) m7m.d((ClipsWrapperFragment) obj4).a(fpf0.a(VkClientMultiAccountComponent.class));
            default:
                iwf iwfVar = (iwf) obj4;
                r31 r31Var = new r31();
                fwf fwfVar = new fwf(r31Var, (yu0) iwfVar.f.getValue(), iwfVar.d, iwfVar.e);
                zws.a.a.getSTUB();
                del0 del0Var = iwfVar.a;
                mel0 mel0Var = iwfVar.b;
                z31.a.C4153a c4153a = z31.a.C4153a.a;
                return new ewj0(fwfVar, new mo6.b(del0Var, mel0Var), new vh0(new pa(iwfVar, 12), AdRequestEvent.RequestType.CLOSE), r31Var, new a41());
        }
    }
}
