package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.item.clip.subtitles.SdkSubtitlesConfigurationMode;
import com.vk.clips.viewer.api.domain.subs.ClipsSubsSetting;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsSubtitlesState.kt */
/* loaded from: classes17.dex */
public final class m5f {
    public final l5f a;
    public final vt5 b;
    public final qs9 c;

    /* compiled from: ClipsSubtitlesState.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsSubsSetting.values().length];
            try {
                iArr[ClipsSubsSetting.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsSubsSetting.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsSubsSetting.SOUND_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m5f(l5f l5fVar, vt5 vt5Var, qs9 qs9Var) {
        this.a = l5fVar;
        this.b = vt5Var;
        this.c = qs9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SdkSubtitlesConfigurationMode a() {
        boolean z;
        j1n0 j1n0Var = (j1n0) this.b.b;
        if (j1n0Var.b) {
            ClipFeedTab clipFeedTab = ((lyc) this.c.b).a;
            if ((clipFeedTab instanceof ClipFeedTab.TopVideo) || (clipFeedTab instanceof ClipFeedTab.SingleClip) || (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) || (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) || (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) || (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) || (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) || (clipFeedTab instanceof ClipFeedTab.Compilation) || (clipFeedTab instanceof ClipFeedTab.Discover) || (clipFeedTab instanceof ClipFeedTab.Hashtag) || (clipFeedTab instanceof ClipFeedTab.Mask) || (clipFeedTab instanceof ClipFeedTab.Music) || (clipFeedTab instanceof ClipFeedTab.Place) || (clipFeedTab instanceof ClipFeedTab.Profile) || (clipFeedTab instanceof ClipFeedTab.MyClips) || (clipFeedTab instanceof ClipFeedTab.LikedClips) || (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) || (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) || (clipFeedTab instanceof ClipFeedTab.Search) || (clipFeedTab instanceof ClipFeedTab.Playlist) || (clipFeedTab instanceof ClipFeedTab.CoauthorInvitations) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.CompilationCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.HashtagCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.MusicCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.MaskCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.SearchCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.ProfileCatalogClip) || (clipFeedTab instanceof ClipFeedTab.CatalogClip.UnknownCatalogClip) || (clipFeedTab instanceof ClipFeedTab.FavoriteFolder) || (clipFeedTab instanceof ClipFeedTab.NewsMonotheme)) {
                z = true;
                boolean z2 = !j1n0Var.a || com.vk.libvideo.autoplay.e.b();
                if (z) {
                    return SdkSubtitlesConfigurationMode.ALWAYS_DISABLED;
                }
                int i = a.$EnumSwitchMapping$0[this.a.a().ordinal()];
                if (i == 1) {
                    return SdkSubtitlesConfigurationMode.ALWAYS_DISABLED;
                }
                if (i == 2) {
                    return SdkSubtitlesConfigurationMode.ALWAYS_ENABLED;
                }
                if (i == 3) {
                    return z2 ? SdkSubtitlesConfigurationMode.ALWAYS_ENABLED : SdkSubtitlesConfigurationMode.ALWAYS_DISABLED;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(clipFeedTab instanceof ClipFeedTab.SingleAdv) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.MusicTemplateCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingHashtagCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.CatalogClip.TrendingMusicCatalogClip) && !(clipFeedTab instanceof ClipFeedTab.MusicTemplate) && !(clipFeedTab instanceof ClipFeedTab.ProfileLives) && !(clipFeedTab instanceof ClipFeedTab.LivesTop)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        z = false;
        if (j1n0Var.a) {
        }
        if (z) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5f)) {
            return false;
        }
        m5f m5fVar = (m5f) obj;
        return epx.f(this.a, m5fVar.a) && this.b.equals(m5fVar.b) && this.c.equals(m5fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ClipsSubtitlesState(repository=" + this.a + ", itemState=" + this.b + ", feedState=" + this.c + ')';
    }
}
