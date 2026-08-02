package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipFeedUtils.kt */
/* loaded from: classes17.dex */
public final class fzc {

    /* compiled from: ClipFeedUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipFeedTab.SingleClipWithDecoration.FeedType.values().length];
            try {
                iArr[ClipFeedTab.SingleClipWithDecoration.FeedType.RecomOnly.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipFeedTab.SingleClipWithDecoration.FeedType.SingleClipWithRecom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipFeedTab.MusicTemplate.IdType.values().length];
            try {
                iArr2[ClipFeedTab.MusicTemplate.IdType.AudioId.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClipFeedTab.MusicTemplate.IdType.ClipId.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean a(ClipFeedTab clipFeedTab) {
        return (clipFeedTab instanceof ClipFeedTab.ProfileLives) || (clipFeedTab instanceof ClipFeedTab.LivesTop) || (clipFeedTab instanceof ClipFeedTab.TopVideo);
    }

    public static final SchemeStat$TypeClipViewerItem.ScreenType b(ClipFeedTab clipFeedTab) {
        if ((clipFeedTab instanceof ClipFeedTab.Discover) || (clipFeedTab instanceof ClipFeedTab.TopVideo)) {
            return SchemeStat$TypeClipViewerItem.ScreenType.TOP;
        }
        if (clipFeedTab instanceof ClipFeedTab.Hashtag) {
            return SchemeStat$TypeClipViewerItem.ScreenType.HASHTAG;
        }
        if (clipFeedTab instanceof ClipFeedTab.SingleClip) {
            return SchemeStat$TypeClipViewerItem.ScreenType.SINGLE_CLIP;
        }
        if (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) {
            return SchemeStat$TypeClipViewerItem.ScreenType.SINGLE_CLIP;
        }
        if (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) {
            return SchemeStat$TypeClipViewerItem.ScreenType.SINGLE_CLIP;
        }
        if (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) {
            return SchemeStat$TypeClipViewerItem.ScreenType.SINGLE_CLIP;
        }
        if (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) {
            return SchemeStat$TypeClipViewerItem.ScreenType.SHOPS_FEED_CLIPS;
        }
        if (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) {
            return SchemeStat$TypeClipViewerItem.ScreenType.CLIPS_TAB_TRENDS;
        }
        if (clipFeedTab instanceof ClipFeedTab.Music) {
            return SchemeStat$TypeClipViewerItem.ScreenType.MUSIC;
        }
        if (clipFeedTab instanceof ClipFeedTab.Mask) {
            return SchemeStat$TypeClipViewerItem.ScreenType.MASK;
        }
        if (clipFeedTab instanceof ClipFeedTab.Compilation) {
            return SchemeStat$TypeClipViewerItem.ScreenType.COMPILATION;
        }
        if (clipFeedTab instanceof ClipFeedTab.Place) {
            return SchemeStat$TypeClipViewerItem.ScreenType.PLACE;
        }
        if ((clipFeedTab instanceof ClipFeedTab.MyClips) || (clipFeedTab instanceof ClipFeedTab.Profile)) {
            return SchemeStat$TypeClipViewerItem.ScreenType.PROFILE;
        }
        if (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) {
            return SchemeStat$TypeClipViewerItem.ScreenType.SUBSCRIPTIONS;
        }
        if (clipFeedTab instanceof ClipFeedTab.LikedClips) {
            return SchemeStat$TypeClipViewerItem.ScreenType.LIKES;
        }
        if (clipFeedTab instanceof ClipFeedTab.LivesTop) {
            return SchemeStat$TypeClipViewerItem.ScreenType.LIVES_TOP;
        }
        if (clipFeedTab instanceof ClipFeedTab.ProfileLives) {
            return SchemeStat$TypeClipViewerItem.ScreenType.LIVES_PROFILE;
        }
        if (clipFeedTab instanceof ClipFeedTab.CatalogClip) {
            return b(((ClipFeedTab.CatalogClip) clipFeedTab).Fb());
        }
        if ((clipFeedTab instanceof ClipFeedTab.Search) || (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) || (clipFeedTab instanceof ClipFeedTab.MusicTemplate) || (clipFeedTab instanceof ClipFeedTab.FavoriteFolder)) {
            return SchemeStat$TypeClipViewerItem.ScreenType.FAVORITES;
        }
        if (clipFeedTab instanceof ClipFeedTab.NewsMonotheme) {
            return SchemeStat$TypeClipViewerItem.ScreenType.CLIPS_MONOTOPIC;
        }
        if (clipFeedTab instanceof ClipFeedTab.Playlist) {
            return SchemeStat$TypeClipViewerItem.ScreenType.PROFILE;
        }
        if (clipFeedTab instanceof ClipFeedTab.SingleAdv) {
            return SchemeStat$TypeClipViewerItem.ScreenType.SINGLE_CLIP;
        }
        if (clipFeedTab instanceof ClipFeedTab.CoauthorInvitations) {
            return SchemeStat$TypeClipViewerItem.ScreenType.PROFILE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
