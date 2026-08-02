package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.feed.wrapper.presentation.state.ClipsWrapperCreateButton;
import kotlin.NoWhenBranchMatchedException;
import xsna.npf;

/* compiled from: ClipsWrapperButtonsMviStateMapper.kt */
/* loaded from: classes17.dex */
public final class rpf {
    public final zof a;
    public final boolean b;

    /* compiled from: ClipsWrapperButtonsMviStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsWrapperCreateButton.CreateButtonType.values().length];
            try {
                iArr[ClipsWrapperCreateButton.CreateButtonType.PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsWrapperCreateButton.CreateButtonType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rpf(zof zofVar, boolean z) {
        this.a = zofVar;
        this.b = z;
    }

    public final ClipsWrapperCreateButton.CreateButtonType a(ClipFeedTab clipFeedTab) {
        if ((clipFeedTab instanceof ClipFeedTab.TopVideo) || (clipFeedTab instanceof ClipFeedTab.Music) || (clipFeedTab instanceof ClipFeedTab.Mask) || (clipFeedTab instanceof ClipFeedTab.Compilation) || (clipFeedTab instanceof ClipFeedTab.Hashtag) || (clipFeedTab instanceof ClipFeedTab.Place) || (clipFeedTab instanceof ClipFeedTab.SingleClip) || (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) || (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.HashtagCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.CompilationCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.MaskCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.MusicCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.SearchCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.ProfileCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.UnknownCatalogClip) || (clipFeedTab instanceof ClipFeedTab.Profile) || (clipFeedTab instanceof ClipFeedTab.Search) || (clipFeedTab instanceof ClipFeedTab.LivesTop) || (clipFeedTab instanceof ClipFeedTab.ProfileLives) || (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) || (clipFeedTab instanceof ClipFeedTab.LikedClips) || (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) || (clipFeedTab instanceof ClipFeedTab.FavoriteFolder)) {
            return b();
        }
        if (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) {
            return ((ClipFeedTab.ClipsFromShopsSource) clipFeedTab).Fb() == ClipFeedTab.ClipsFromShopsSource.SourceType.TAB ? b() : ClipsWrapperCreateButton.CreateButtonType.NONE;
        }
        if (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) {
            return ((ClipFeedTab.ClipsFromTrendsSource) clipFeedTab).Fb() == ClipFeedTab.ClipsFromTrendsSource.SourceType.TAB ? b() : ClipsWrapperCreateButton.CreateButtonType.NONE;
        }
        if ((clipFeedTab instanceof ClipFeedTab.MusicTemplate) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.MusicTemplateCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingMusicCatalogClip) || (clipFeedTab instanceof ClipFeedTab.MyClips) || (clipFeedTab instanceof ClipFeedTab.Discover) || (clipFeedTab instanceof ClipFeedTab.Playlist) || (clipFeedTab instanceof ClipFeedTab.SingleAdv) || (clipFeedTab instanceof ClipFeedTab.CoauthorInvitations) || (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) || (clipFeedTab instanceof ClipFeedTab.NewsMonotheme) || clipFeedTab == null) {
            return ClipsWrapperCreateButton.CreateButtonType.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ClipsWrapperCreateButton.CreateButtonType b() {
        zof zofVar = this.a;
        boolean z = zofVar.f0().a;
        boolean z2 = this.b;
        if (z && !z2) {
            return ClipsWrapperCreateButton.CreateButtonType.NONE;
        }
        if (z2) {
            g620.f().h().getClass();
        }
        return zofVar.c() ? ClipsWrapperCreateButton.CreateButtonType.PLUS : ClipsWrapperCreateButton.CreateButtonType.NONE;
    }

    public final upf c(upf upfVar, zrf zrfVar) {
        wrf h = zrfVar.h();
        ClipsWrapperCreateButton.a aVar = null;
        ClipsWrapperCreateButton.CreateButtonType a2 = a(h != null ? h.c() : null);
        ClipsWrapperCreateButton clipsWrapperCreateButton = upfVar.b;
        if (epx.f(clipsWrapperCreateButton != null ? clipsWrapperCreateButton.getType() : null, a2)) {
            return upfVar;
        }
        int i = a.$EnumSwitchMapping$0[a2.ordinal()];
        if (i == 1) {
            aVar = new ClipsWrapperCreateButton.a(new npf.h.e(null, null, null));
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return upf.a(upfVar, aVar, false, 2);
    }
}
