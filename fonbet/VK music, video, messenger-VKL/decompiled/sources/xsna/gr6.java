package xsna;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.catalog.mvi.section.api.CatalogSearchStatInfo;
import com.vk.catalog2.common.ui.mvp.fragment.CatalogShowAllFragment;
import com.vk.catalog2.common.ui.mvp.video.AuthorsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistCatalogFragment;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoAdData;
import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.VideoWrapperActivity;
import com.vk.libvideo.api.UploadVideoAction;
import com.vk.libvideo.api.VideoUrlInfo;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.libvideo.api.pip2.VideoContainerFragmentEntry;
import com.vk.libvideo.api.pip2.VideoPipModeAction;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.pip.v2.PipTrigger;
import com.vk.libvideo.screen.VideoFragment;
import com.vk.libvideo.upload.api.VideoPublicationContext;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ad.VideoAdDialog;
import com.vk.video.playlist.common.di.PlaylistComponent;
import com.vk.video.playlist.playlistscreen.PlaylistScreenArgs;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vk.video.ui.edit.privacy.PrivacyEditVideoWatchFragment;
import com.vkontakte.android.actionlinks.SourceType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.o0r0;
import xsna.oap;

/* compiled from: BaseVideoRouter.kt */
/* loaded from: classes11.dex */
public final class gr6 implements ydt0 {
    public final bpn0 a;
    public final bpn0 b;
    public final Object c;
    public final Object d;
    public final Set<String> e;
    public final Set<String> f;
    public final Set<String> g;
    public final Object h;

    /* compiled from: BaseVideoRouter.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final Activity a;
        public final VideoFile b;
        public final io2 c;
        public final boolean d;
        public final SearchStatsLoggingInfo e;
        public final String f;
        public final AdsDataProvider g;
        public final Boolean h;
        public final Boolean i;
        public final Boolean j;
        public final String k;

        public a(Activity activity, VideoFile videoFile, io2 io2Var, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, String str, AdsDataProvider adsDataProvider, Boolean bool, Boolean bool2, Boolean bool3, String str2) {
            this.a = activity;
            this.b = videoFile;
            this.c = io2Var;
            this.d = z;
            this.e = searchStatsLoggingInfo;
            this.f = str;
            this.g = adsDataProvider;
            this.h = bool;
            this.i = bool2;
            this.j = bool3;
            this.k = str2;
        }

        public final Activity a() {
            return this.a;
        }

        public final AdsDataProvider b() {
            return this.g;
        }

        public final Boolean c() {
            return this.i;
        }

        public final io2 d() {
            return this.c;
        }

        public final Boolean e() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k);
        }

        public final SearchStatsLoggingInfo f() {
            return this.e;
        }

        public final Boolean g() {
            return this.h;
        }

        public final boolean h() {
            return this.d;
        }

        public final int hashCode() {
            int b = jq.b(this.b, this.a.hashCode() * 31, 31);
            io2 io2Var = this.c;
            int b2 = qoy.b(qoy.b(qoy.b((b + (io2Var == null ? 0 : io2Var.hashCode())) * 31, 31, true), 31, false), 31, this.d);
            SearchStatsLoggingInfo searchStatsLoggingInfo = this.e;
            int hashCode = (b2 + (searchStatsLoggingInfo == null ? 0 : searchStatsLoggingInfo.hashCode())) * 31;
            String str = this.f;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AdsDataProvider adsDataProvider = this.g;
            int hashCode3 = (hashCode2 + (adsDataProvider == null ? 0 : adsDataProvider.hashCode())) * 31;
            Boolean bool = this.h;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.i;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 961;
            Boolean bool3 = this.j;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.k;
            return hashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String i() {
            return this.f;
        }

        public final VideoFile j() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SingleVideoDialogParams(activity=");
            sb.append(this.a);
            sb.append(", video=");
            sb.append(this.b);
            sb.append(", callback=");
            sb.append(this.c);
            sb.append(", playOnStart=true, overDialog=false, stopOnClose=");
            sb.append(this.d);
            sb.append(", searchStatsLoggingInfo=");
            sb.append(this.e);
            sb.append(", trackCode=");
            sb.append(this.f);
            sb.append(", adsDataProvider=");
            sb.append(this.g);
            sb.append(", showAnimated=");
            sb.append(this.h);
            sb.append(", byRotation=");
            sb.append(this.i);
            sb.append(", orientationListener=null, requirePortrait=");
            sb.append(this.j);
            sb.append(", referrer=");
            return ho8.a(sb, this.k, ')');
        }
    }

    public gr6(bpn0 bpn0Var, bpn0 bpn0Var2) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
        dr6 dr6Var = new dr6(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, dr6Var);
        this.d = msy.a(lazyThreadSafetyMode, new er6(0));
        this.e = rl3.y0(new String[]{com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_SEARCH), com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH), com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_VIDEO)});
        this.f = rl3.y0(new String[]{com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP), com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT)});
        this.g = Collections.singleton(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_VIDEO_RECOMMENDATIONS));
        this.h = msy.a(lazyThreadSafetyMode, new fr6(0));
    }

    public static boolean I(ww50 ww50Var) {
        FragmentImpl u = ww50Var.u();
        return epx.f(u != null ? ww50Var.x(u) : null, VideoCatalogFragment.class) || (u instanceof VideoCatalogFragment) || epx.f(u, CatalogShowAllFragment.class) || (u instanceof CatalogShowAllFragment);
    }

    public static boolean J(VideoFile videoFile, String str) {
        yg5 e;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        e = b.C1208b.a().e(videoFile, null);
        return e.t0() || epx.f(str, "IM".toLowerCase(Locale.ROOT)) || j5g.P(rl3.y0(new String[]{"video_from_pip", "video_from_discovery_to_pip", "video_from_feed_to_pip", "video_from_fullscreen_to_pip", "video_pip_new_intent"}), str);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    public static void K(gr6 gr6Var, Context context, VideoFile videoFile, String str, boolean z, boolean z2, String str2, int i) {
        io.reactivex.rxjava3.subjects.f<VideoPipModeAction> Lb;
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if (z2) {
            VideoPip2Component videoPip2Component = (VideoPip2Component) gr6Var.b.getValue();
            if (videoPip2Component == null || (Lb = videoPip2Component.Lb()) == null) {
                return;
            }
            Lb.onNext(new VideoPipModeAction.Minimize(2));
            return;
        }
        Bundle b2 = qr.b("track_code", str2, "ref_screen", str);
        b2.putString("ref_ctx", "");
        b2.putParcelable(X3.i.b, videoFile);
        b2.putBoolean("live_rec_on", z);
        b2.putBoolean("live_pip_2_container", true);
        b2.putBoolean("stop_on_dsm", true);
        ids0 ids0Var = (ids0) gr6Var.h.getValue();
        VideoContainerFragmentEntry.Type type = VideoContainerFragmentEntry.Type.Live;
        List H = gr6Var.H(context, videoFile, str);
        ids0Var.getClass();
        N(gr6Var, context, ids0.a(context, b2, type, H));
    }

    public static void M(a aVar) {
        yg5 e;
        if (aVar.j().W9()) {
            VideoPipStateHolder.a.getClass();
            VideoPipStateHolder.b();
            new VideoInteractiveFullscreenFragment.a(aVar.j(), false, aVar.h(), aVar.e()).y(aVar.a(), new xy80(aVar.a()), aVar.d());
            return;
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        e = b.C1208b.a().e(aVar.j(), null);
        com.vk.libvideo.ui.dialog.single.a aVar2 = new com.vk.libvideo.ui.dialog.single.a(aVar.a(), e, aVar.d(), true, false, aVar.h(), aVar.f());
        aVar2.a(aVar.b());
        aVar2.e(aVar.i());
        aVar2.b(null);
        aVar2.c(aVar.g());
        aVar2.f(aVar.c());
        aVar2.d();
    }

    public static void N(gr6 gr6Var, Context context, Intent intent) {
        try {
            context.startActivity(intent);
            Activity h = e3m.h(context);
            if (h != null) {
                h.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }

    public static VideoAlbum O(com.vk.dto.video.VideoAlbum videoAlbum) {
        VideoAlbum videoAlbum2 = new VideoAlbum(videoAlbum.Hb());
        videoAlbum2.b = videoAlbum.getId();
        videoAlbum2.f = videoAlbum.q();
        videoAlbum2.e = videoAlbum.getCount();
        videoAlbum2.h = videoAlbum.Fb();
        videoAlbum2.i = videoAlbum.getPrivacy();
        videoAlbum2.c = videoAlbum.getTitle();
        return videoAlbum2;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ydt0
    public final void A(Context context, oap<? extends Uri, UserId> oapVar, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, Boolean bool, SearchStatsLoggingInfo searchStatsLoggingInfo, String str4) {
        boolean z5;
        UserId userId;
        String str5;
        boolean z6;
        String str6;
        UserId userId2;
        ww50 v = s200.v(context);
        FragmentImpl p = v != null ? v.p(VideoCatalogFragment.class) : null;
        VideoCatalogFragment videoCatalogFragment = p instanceof VideoCatalogFragment ? (VideoCatalogFragment) p : null;
        if (z3 && videoCatalogFragment != null) {
            videoCatalogFragment.go();
            if (str4 != null) {
                videoCatalogFragment.ho(str4);
            }
            if (I(v)) {
                return;
            }
            v.Y(new Bundle());
            return;
        }
        ?? r7 = this.c;
        if (!z4 && v != null && !I(v) && !(v.u() instanceof DiscoverSearchFragment) && !(e3m.h(context) instanceof fuj0)) {
            if (oapVar != null) {
                if (oapVar instanceof oap.b) {
                    userId2 = (UserId) ((oap.b) oapVar).c();
                    z6 = z;
                    str6 = null;
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String uri = ((Uri) ((oap.a) oapVar).c()).toString();
                    z6 = ((Regex) r7.getValue()).a(uri) ? true : z;
                    str6 = uri;
                    userId2 = null;
                }
                str5 = str6;
                z5 = z6;
                userId = userId2;
            } else {
                z5 = z;
                userId = null;
                str5 = null;
            }
            v.Y(new gjt0(str, userId, searchStatsLoggingInfo, (str2 == null || drm0.N(str2)) ? null : str2, str3, z5, str5, z2, 40).a());
            return;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            D(context, true);
            return;
        }
        VideoCatalogFragment.a aVar = new VideoCatalogFragment.a();
        aVar.K(str);
        aVar.D(str3);
        aVar.C();
        aVar.B(z2);
        aVar.L(searchStatsLoggingInfo);
        aVar.y(z);
        if (str4 != null) {
            aVar.G(str4);
        }
        if (oapVar != null) {
            if (oapVar instanceof oap.b) {
                aVar.H((UserId) ((oap.b) oapVar).c());
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String uri2 = ((Uri) ((oap.a) oapVar).c()).toString();
                aVar.z(uri2, false);
                if (((Regex) r7.getValue()).a(uri2)) {
                    aVar.y(true);
                }
            }
        }
        if (str2 != null && !drm0.N(str2)) {
            aVar.M(str2);
        }
        if (bool != null) {
            aVar.F(bool.booleanValue());
        }
        aVar.e = true;
        aVar.k(context);
    }

    @Override // xsna.ydt0
    public final void B(Context context, VideoFile videoFile, String str, String str2) {
        G().a(str2 == null ? videoFile.r() : str2);
        Bundle bundle = new Bundle();
        bundle.putParcelable(X3.i.b, videoFile);
        bundle.putString("referrer", str);
        bundle.putBoolean("load_likes", videoFile.l1() == 0);
        bundle.putString("track_code", str2);
        Intent intent = new Intent(context, (Class<?>) VideoWrapperActivity.class);
        intent.putExtra("fragment_name", VideoEmbedFragment.class.getName());
        intent.putExtra("fragment_args", bundle);
        N(this, context, intent);
    }

    @Override // xsna.ydt0
    public final void C(Activity activity, com.vk.dto.video.VideoAlbum videoAlbum, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        l7m a2;
        PlaylistComponent playlistComponent;
        oab0 U;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_PLAYLIST_SCREEN;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            ComponentActivity componentActivity = activity instanceof ComponentActivity ? (ComponentActivity) activity : null;
            if (componentActivity == null || (a2 = m7m.a(componentActivity)) == null || (playlistComponent = (PlaylistComponent) a2.mo408a(fpf0.a(PlaylistComponent.class))) == null || (U = playlistComponent.U()) == null) {
                return;
            }
            U.a(activity, new PlaylistScreenArgs(videoAlbum.getId(), videoAlbum.q(), videoAlbum.r(), searchStatsLoggingInfo != null ? new CatalogSearchStatInfo(searchStatsLoggingInfo.zb(), null, 2, null) : null));
            return;
        }
        if (videoAlbum.getId() <= 0) {
            VideoAlbumFragment.Ro(O(videoAlbum), false).k(activity);
            return;
        }
        VideoPlaylistCatalogFragment.a aVar = new VideoPlaylistCatalogFragment.a(videoAlbum.q(), videoAlbum.getId());
        aVar.B(str);
        aVar.D(videoAlbum.r());
        aVar.C(searchStatsLoggingInfo);
        aVar.z(str2, false);
        aVar.k(activity);
    }

    @Override // xsna.ydt0
    public final void D(Context context, boolean z) {
        VideoOfflineFragment.b bVar = new VideoOfflineFragment.b();
        bVar.e = z;
        bVar.k(context);
    }

    @Override // xsna.ydt0
    public final void E(Context context, UserId userId) {
        p8t0 p8t0Var = (p8t0) this.a.getValue();
        if (p8t0Var != null) {
            p8t0Var.a(context, userId);
        }
    }

    @Override // xsna.ydt0
    public final void F(com.vk.dto.video.VideoAlbum videoAlbum, jbs jbsVar) {
        int i = VideoAlbumEditorFragment.l0;
        VideoAlbumEditorFragment.b.b(videoAlbum).i(jbsVar, 103);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zdt0 G() {
        return (zdt0) this.d.getValue();
    }

    public final List H(Context context, VideoFile videoFile, String str) {
        VideoPipStateHolder.a.getClass();
        if (!VideoPipStateHolder.e()) {
            return EmptyList.b;
        }
        if (videoFile.q0()) {
            return Collections.singletonList(PipTrigger.Other);
        }
        if (j5g.P(this.f, str)) {
            return EmptyList.b;
        }
        if (j5g.P(this.g, str)) {
            return EmptyList.b;
        }
        if (j5g.P(this.e, str)) {
            PipTrigger.Companion.getClass();
            return PipTrigger.a.a();
        }
        ww50 v = s200.v(context);
        if (v == null || !I(v)) {
            PipTrigger.Companion.getClass();
            return PipTrigger.a.a();
        }
        PipTrigger.Companion.getClass();
        return PipTrigger.a.a();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void L(Context context, VideoMinimizableScreenArgs videoMinimizableScreenArgs) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (j5g.P(this.f, videoMinimizableScreenArgs.d().C4()) && activity != null) {
            VideoPipStateHolder.a.getClass();
            if (!VideoPipStateHolder.d()) {
                VideoFile A = videoMinimizableScreenArgs.d().A();
                SearchStatsLoggingInfo d = videoMinimizableScreenArgs.d().d();
                String r = videoMinimizableScreenArgs.d().r();
                Boolean bool = Boolean.FALSE;
                M(new a(activity, A, null, true, d, r, null, bool, bool, null, videoMinimizableScreenArgs.d().C4()));
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("screen_args_key", videoMinimizableScreenArgs);
        ids0 ids0Var = (ids0) this.h.getValue();
        VideoContainerFragmentEntry.Type type = VideoContainerFragmentEntry.Type.Discovery;
        List H = H(context, videoMinimizableScreenArgs.d().A(), videoMinimizableScreenArgs.d().C4());
        ids0Var.getClass();
        N(this, context, ids0.a(context, bundle, type, H));
    }

    @Override // xsna.ydt0
    public final void a(FragmentActivity fragmentActivity, VideoAdData videoAdData, io2 io2Var) {
        new VideoAdDialog.a(videoAdData).y(fragmentActivity, io2Var);
    }

    @Override // xsna.ydt0
    public final void b(com.vk.dto.video.VideoAlbum videoAlbum, boolean z, jbs jbsVar) {
        VideoAlbum O = O(videoAlbum);
        if (z) {
            VideoAlbumFragment.Ro(O, true).i(jbsVar, 102);
        } else {
            VideoAlbumFragment.Ro(O, false).m(jbsVar);
        }
    }

    @Override // xsna.ydt0
    public final void c(Activity activity, UploadVideoAction uploadVideoAction, UserId userId, int i, String str) {
        VideoPublicationContext videoPublicationContext = new VideoPublicationContext(str, userId);
        VideoUploadFragment.a aVar = new VideoUploadFragment.a();
        aVar.y(uploadVideoAction, videoPublicationContext, i);
        aVar.k(activity);
    }

    @Override // xsna.ydt0
    public final void d(Context context, VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, Object obj, boolean z, String str3, boolean z2, long j, SearchStatsLoggingInfo searchStatsLoggingInfo, ReplyInfo replyInfo, VideoUrlInfo videoUrlInfo) {
        Activity h;
        G().a(str3 == null ? videoFile.r() : str3);
        if (!J(videoFile, str)) {
            if (videoFile.q0()) {
                K(this, context, videoFile, str, false, z2, null, 40);
                return;
            } else {
                L(context, VideoMinimizableScreenArgs.a.a(videoFile, new VideoFeedDialogParams.Discover(str, str3, searchStatsLoggingInfo, false, videoUrlInfo != null ? videoUrlInfo.d() : null, replyInfo, j, false, null, null, 896, null)));
                return;
            }
        }
        boolean f = epx.f(str, "IM".toLowerCase(Locale.ROOT));
        if (BuildInfo.t()) {
            VideoFragment.a aVar = new VideoFragment.a(videoFile);
            aVar.y(adsDataProvider);
            aVar.A(str);
            aVar.C(str3);
            aVar.B(obj instanceof DeprecatedStatisticInterface ? (DeprecatedStatisticInterface) obj : null);
            aVar.z(str2);
            aVar.D(z);
            aVar.E(z);
            aVar.F(z);
            aVar.k(context);
            return;
        }
        if (!videoFile.W9()) {
            if (!f || (h = e3m.h(context)) == null) {
                return;
            }
            l(h, videoFile, null, false, searchStatsLoggingInfo, str3, adsDataProvider, null, str);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(X3.i.b, videoFile);
        bundle.putString("referrer", str);
        bundle.putBoolean("load_likes", videoFile.l1() == 0);
        bundle.putString("track_code", str3);
        bundle.putBoolean("over_dlg", false);
        bundle.putBoolean("over_activity", true);
        Intent intent = new Intent(context, (Class<?>) VideoWrapperActivity.class);
        intent.putExtra("fragment_name", VideoInteractiveFullscreenFragment.class.getName());
        intent.putExtra("fragment_args", bundle);
        N(this, context, intent);
    }

    @Override // xsna.ydt0
    public final void g(Context context, VideoFile videoFile, String str, String str2) {
        zdt0 G = G();
        if (str2 == null) {
            str2 = videoFile.r();
        }
        G.a(str2);
        K(this, context, videoFile, str, false, false, null, 56);
    }

    @Override // xsna.ydt0
    public final void i(Activity activity, VideoFile videoFile, VideoFeedDialogParams videoFeedDialogParams) {
        G().a(videoFile.r());
        if (videoFile.q0()) {
            K(this, activity, videoFile, videoFeedDialogParams.zb(), false, false, null, 56);
        } else {
            L(activity, VideoMinimizableScreenArgs.a.a(videoFile, videoFeedDialogParams));
        }
    }

    @Override // xsna.ydt0
    public final void k(Context context, VideoFile videoFile, String str, AdsDataProvider adsDataProvider, String str2, Object obj, boolean z, izs izsVar, ReplyInfo replyInfo, String str3, boolean z2, boolean z3, boolean z4, boolean z5, long j, SearchStatsLoggingInfo searchStatsLoggingInfo, jcs0 jcs0Var, boolean z6, VideoTransitionSource videoTransitionSource) {
        if (jcs0Var == null) {
            G().a(str3 == null ? videoFile.r() : str3);
        }
        net0.c(context, videoFile, str, adsDataProvider, str2, obj, z, izsVar, replyInfo, str3, z2, z3, z4, z5, j, false, searchStatsLoggingInfo, jcs0Var, false, null, z6, null, videoTransitionSource, 5537792);
    }

    @Override // xsna.ydt0
    public final void l(Activity activity, VideoFile videoFile, io2 io2Var, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, String str, AdsDataProvider adsDataProvider, Boolean bool, String str2) {
        G().a(str == null ? videoFile.r() : str);
        VideoFeedDialogParams.Discover discover = new VideoFeedDialogParams.Discover(str2, str, searchStatsLoggingInfo, false, null, null, 0L, false, null, null, 1008, null);
        boolean P = j5g.P(this.f, str2);
        boolean P2 = j5g.P(this.e, str2);
        if (J(videoFile, str2) || P || P2) {
            M(new a(activity, videoFile, io2Var, z, searchStatsLoggingInfo, str, adsDataProvider, null, null, bool, str2));
        } else if (videoFile.q0()) {
            K(this, activity, videoFile, discover.zb(), false, false, null, 56);
        } else {
            L(activity, VideoMinimizableScreenArgs.a.a(videoFile, discover));
        }
    }

    @Override // xsna.ydt0
    public final void m(Context context, UserId userId, String str, String str2, String str3, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, String str4, String str5, String str6) {
        VideoCatalogFragment.a aVar = new VideoCatalogFragment.a();
        aVar.H(userId);
        aVar.K(str);
        aVar.F(z);
        aVar.N(str3);
        aVar.L(searchStatsLoggingInfo);
        aVar.M(str2);
        aVar.J(str4);
        aVar.I(str5);
        aVar.E(str6);
        aVar.k(context);
    }

    @Override // xsna.ydt0
    public final void n(Activity activity, VideoFile videoFile, boolean z, String str, String str2) {
        G().a(str2 == null ? videoFile.r() : str2);
        K(this, activity, videoFile, str, z, false, str2, 16);
    }

    @Override // xsna.ydt0
    public final void q(Context context, UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, izs<? super qs80, s3q0> izsVar) {
        net0.d(context, userId, mobileOfficialAppsCoreNavStat$EventScreen, izsVar);
    }

    @Override // xsna.ydt0
    public final void r(PrivacySetting privacySetting, jbs jbsVar) {
        PrivacyEditVideoWatchFragment.a aVar = new PrivacyEditVideoWatchFragment.a();
        aVar.y(MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS_PRIVACY_ALBUM);
        aVar.z(privacySetting);
        aVar.i(jbsVar, 103);
    }

    @Override // xsna.ydt0
    public final void t(Context context, VideoFile videoFile) {
        new ReactionsFragment.a(videoFile).k(context);
    }

    @Override // xsna.ydt0
    public final void v(Context context, String str, String str2, String str3) {
        AuthorsCatalogFragment.a aVar = new AuthorsCatalogFragment.a();
        aVar.C(str);
        aVar.B(str2);
        aVar.D(VideoCatalogId.ALL_SUBSCRIPTIONS);
        aVar.z(str3, false);
        aVar.k(context);
    }

    @Override // xsna.ydt0
    public final void w(int i, Context context, UserId userId) {
        zlz.a(i, context, userId);
    }

    @Override // xsna.ydt0
    public final void x(Context context, VideoFile videoFile, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2) {
        String str3;
        if (str == null) {
            str3 = fkq0.d(videoFile.I0()) ? "videos_user" : fkq0.b(videoFile.I0()) ? "videos_group" : "video";
        } else {
            str3 = str;
        }
        if (videoFile instanceof MusicVideoFile) {
            fl4.y(lyd.g(), context, videoFile, searchStatsLoggingInfo, 8);
            return;
        }
        Owner s = videoFile.s();
        if (s != null && (s.j() || s.k())) {
            xwk.e().m(context, fkq0.c(videoFile.getUid()) ? videoFile.getUid() : videoFile.I0(), new o0r0.a(false, str3, null, null, null, null, null, false, false, false, false, null, null, null, 65533));
            return;
        }
        String str4 = str3;
        String string = context.getString(fkq0.d(videoFile.I0()) ? com.vkontakte.android.R.string.user_videos : com.vkontakte.android.R.string.group_videos);
        yxs0 h = zm00.h(videoFile.M4());
        ydt0.y(this, context, videoFile.I0(), str4, string, null, searchStatsLoggingInfo, h != null ? h.a() : null, h != null ? h.b() : null, str2, 16);
    }

    @Override // xsna.ydt0
    public final void z(Context context, VideoFile videoFile, dz20 dz20Var) {
        qhp0.a().a(context, new b(context, videoFile), (fkq0.d(videoFile.I0()) && videoFile.t0()) ? videoFile.I0() : o25.a().c(), SourceType.Video, dz20Var);
    }

    /* compiled from: BaseVideoRouter.kt */
    /* loaded from: classes15.dex */
    public static final class b implements dm0 {
        public final /* synthetic */ VideoFile b;
        public final /* synthetic */ Context c;

        public b(Context context, VideoFile videoFile) {
            this.b = videoFile;
            this.c = context;
        }

        @Override // xsna.dm0
        public final void b(ActionLink actionLink) {
            VideoFile videoFile = this.b;
            rsg0.y0(new cgt0(videoFile.I0(), Integer.valueOf(videoFile.o0()), actionLink.e), null, null, 3).subscribe(new mf1(new com.vk.movika.sdk.base.logic.interactor.i(5, videoFile, actionLink), 3), new nf1(new yx0(this.c, 9), 7));
        }

        @Override // xsna.dm0
        public final void g(ArrayList arrayList) {
        }
    }
}
