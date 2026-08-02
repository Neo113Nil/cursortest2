package xsna;

import android.os.Bundle;
import android.util.LruCache;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.di.PostingSettingsComponent;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.scheduled_clips.b;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.search.integration.api.SearchTab;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vkontakte.android.R;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.UUID;
import one.video.exo.codecs.DecoderSupportInfo;
import xsna.iqh0;
import xsna.qfs;
import xsna.rxh;
import xsna.ugl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pce implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pce(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        NativeConfigurationOuterClass.FullscreenNavBarMode navBarMode_delegate$lambda$3;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = ClipsGridCommonClipsListFragment.q0;
                ((ide) ((ClipsGridCommonClipsListFragment) obj).getParentFragment()).I5();
                return s3q0.a;
            case 1:
                ((NewsFeedComponent) ((k7m) m7m.c(((ije) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 2:
                return (ClipsPlaylistsComponent) ((k7m) m7m.f((kue) obj)).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 3:
                return Integer.valueOf(ViewConfiguration.get(((s1f) obj).itemView.getContext()).getScaledMaximumFlingVelocity());
            case 4:
                return ((ClipsViewerComponentImpl) obj).i.Zb();
            case 5:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj;
                int i3 = ClipsWrapperFragment.Q0;
                return new ltf((VkClientMultiAccountComponent) clipsWrapperFragment.f0.getValue(), (ClipsInterestsComponent) clipsWrapperFragment.c0.getValue(), (SearchStatsLoggingInfo) clipsWrapperFragment.po().h.getValue(), (ClipsEntryPointsComponent) clipsWrapperFragment.g0.getValue(), ((UserProfileComponent) m7m.d(clipsWrapperFragment).mo408a(fpf0.a(UserProfileComponent.class))).m3(), new on(clipsWrapperFragment, 24));
            case 6:
                ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
                Bundle a = ((ClipsWrapperInputArguments) obj).a();
                aVar.getClass();
                if (a != null && a.getBoolean("ClipsWrapperFragment.open_with_default_tabs", false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                dw20 dw20Var = ((pog) obj).e;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 8:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) obj;
                kqh0 kqh0Var = (kqh0) communityProfileFragment.V.c.getValue();
                FragmentImpl fragmentImpl = communityProfileFragment.io().a;
                UserId ho = communityProfileFragment.ho();
                ContentTab contentTab = communityProfileFragment.f0;
                return kqh0Var.b(new iqh0.e(fragmentImpl, ho, contentTab instanceof ContentTab.Video ? SearchTab.VIDEOS : contentTab instanceof ContentTab.Wall ? SearchTab.WALL : SearchTab.WALL, null));
            case 9:
                fxc0.B().d((VideoFile) obj);
                return s3q0.a;
            case 10:
                return ((BridgeComponent) ((k7m) m7m.f((vvh) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 11:
                ((fyh) obj).i.c(rxh.e.a);
                return s3q0.a;
            case 12:
                ((com.vk.profile.core.scheduled_clips.h) obj).d.invoke(b.C1642b.b);
                return s3q0.a;
            case 13:
                return (TextView) ((s5i) obj).a.findViewById(R.id.nativeads_domain_chip);
            case 14:
                y6k y6kVar = (y6k) obj;
                y6kVar.j.k().z(y6kVar.k, y6kVar.q);
                return s3q0.a;
            case 15:
                qcy<Object>[] qcyVarArr = fck.t1;
                return ((PostingSettingsComponent) m7m.d((fck) obj).mo408a(fpf0.a(PostingSettingsComponent.class))).Nb().a();
            case 16:
                return ((DateTimePickerState) obj).d(com.vk.core.compose.component.datetime.h.d, com.vk.core.compose.component.datetime.h.a);
            case 17:
                return Boolean.valueOf(DecoderSupportInfo.b(((DecoderSupportInfo) obj).a, null));
            case 18:
                ugl.b bVar = ((ugl) obj).s;
                if (bVar != null) {
                    return bVar.b;
                }
                return null;
            case 19:
                UUID uuid = ((x5n) obj).b;
                if (uuid == null) {
                    return null;
                }
                LruCache<UUID, mzp0> lruCache = rzp0.a;
                return rzp0.e(uuid);
            case 20:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) obj;
                return new uq60(discoverSimilarFeedFragment, discoverSimilarFeedFragment.Y, discoverSimilarFeedFragment.eo().a.Y, discoverSimilarFeedFragment.eo().f);
            case 21:
                return (VkContentBadge) ((u1o) obj).findViewById(R.id.donut_post_video_support_badge);
            case 22:
                ((wio) obj).c.c(false);
                return s3q0.a;
            case 23:
                return (g3f0) ((mqp) obj).I.getValue();
            case 24:
                Peer peer = ((com.vk.folders.impl.configure.c) obj).p.r().a.c;
                peer.getClass();
                return String.valueOf(peer.Ab(Peer.Type.GROUP));
            case 25:
                qfs.a aVar2 = ((ufs) obj).e;
                qfs.this.l.h(aVar2.a);
                return s3q0.a;
            case 26:
                ((yis) obj).q6();
                return s3q0.a;
            case 27:
                navBarMode_delegate$lambda$3 = FullScreenWebViewDisplay.navBarMode_delegate$lambda$3((FullScreenWebViewDisplay) obj);
                return navBarMode_delegate$lambda$3;
            case 28:
                okt oktVar = (okt) obj;
                return new q6r(oktVar.h, oktVar.i);
            default:
                return ((GlobalSearchAllCatalogRootVh) obj).q;
        }
    }
}
