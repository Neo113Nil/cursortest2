package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsFeedAnalyticContextHolder.kt */
/* loaded from: classes17.dex */
public final class y5e {
    public final String a;

    public y5e(ClipFeedTab clipFeedTab) {
        String str;
        if (clipFeedTab instanceof ClipFeedTab.Compilation) {
            str = "compilation:" + ((ClipFeedTab.Compilation) clipFeedTab).b;
        } else if (clipFeedTab instanceof ClipFeedTab.Music) {
            str = "music:" + ((ClipFeedTab.Music) clipFeedTab).d;
        } else if (clipFeedTab instanceof ClipFeedTab.Mask) {
            str = "mask:" + ((ClipFeedTab.Mask) clipFeedTab).c;
        } else if (clipFeedTab instanceof ClipFeedTab.MyClips) {
            str = "profile:" + ((ClipFeedTab.MyClips) clipFeedTab).b;
        } else if (clipFeedTab instanceof ClipFeedTab.Profile) {
            str = "profile:" + ((ClipFeedTab.Profile) clipFeedTab).c;
        } else if (clipFeedTab instanceof ClipFeedTab.Hashtag) {
            str = "hashtag";
        } else if (clipFeedTab instanceof ClipFeedTab.Place) {
            str = "place:" + ((ClipFeedTab.Place) clipFeedTab).b;
        } else {
            if (!(clipFeedTab instanceof ClipFeedTab.SingleClip) && !(clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) && !(clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) && !(clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock)) {
                if (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource) {
                    str = "shops_feed_clips";
                } else if (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource) {
                    str = "clips_tab_trends";
                } else if (!(clipFeedTab instanceof ClipFeedTab.SingleAdv)) {
                    if (clipFeedTab instanceof ClipFeedTab.CatalogClip) {
                        StringBuilder sb = new StringBuilder();
                        ClipFeedTab.CatalogClip catalogClip = (ClipFeedTab.CatalogClip) clipFeedTab;
                        sb.append(catalogClip.w());
                        sb.append('|');
                        sb.append(catalogClip.w());
                        str = sb.toString();
                    } else if (clipFeedTab instanceof ClipFeedTab.TopVideo) {
                        int i = x5e.$EnumSwitchMapping$0[((ClipFeedTab.TopVideo) clipFeedTab).b.ordinal()];
                        if (i == 1) {
                            str = "topVideo";
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "topVideoFromBlock";
                        }
                    } else if (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) {
                        str = "userSubscriptions";
                    } else if (clipFeedTab instanceof ClipFeedTab.Discover) {
                        str = "discover";
                    } else if (clipFeedTab instanceof ClipFeedTab.LivesTop) {
                        str = "livesTop";
                    } else if (clipFeedTab instanceof ClipFeedTab.LikedClips) {
                        str = "likedClips";
                    } else if (clipFeedTab instanceof ClipFeedTab.MusicTemplate) {
                        ClipFeedTab.MusicTemplate musicTemplate = (ClipFeedTab.MusicTemplate) clipFeedTab;
                        String str2 = musicTemplate.b;
                        int i2 = x5e.$EnumSwitchMapping$1[musicTemplate.d.ordinal()];
                        if (i2 == 1) {
                            str = go9.b("template_by_audio:", str2);
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = go9.b("template:", str2);
                        }
                    } else if (clipFeedTab instanceof ClipFeedTab.ProfileLives) {
                        str = "profileLives:" + ((ClipFeedTab.ProfileLives) clipFeedTab).b;
                    } else if (!(clipFeedTab instanceof ClipFeedTab.Search)) {
                        if (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) {
                            str = "discoverMedia:" + ((ClipFeedTab.NewsfeedDiscoverMedia) clipFeedTab).b.a1();
                        } else if (clipFeedTab instanceof ClipFeedTab.FavoriteFolder) {
                            str = "favoriteFolder:" + ((ClipFeedTab.FavoriteFolder) clipFeedTab).b;
                        } else if (clipFeedTab instanceof ClipFeedTab.Playlist) {
                            StringBuilder sb2 = new StringBuilder("playlist:");
                            ClipFeedTab.Playlist playlist = (ClipFeedTab.Playlist) clipFeedTab;
                            sb2.append(playlist.Z0().f);
                            sb2.append('_');
                            sb2.append(playlist.Z0().b);
                            str = sb2.toString();
                        } else if (clipFeedTab instanceof ClipFeedTab.CoauthorInvitations) {
                            str = "co_pending";
                        } else {
                            if (!(clipFeedTab instanceof ClipFeedTab.NewsMonotheme)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "newsMonotheme:" + ((ClipFeedTab.NewsMonotheme) clipFeedTab).b;
                        }
                    }
                }
            }
            str = "singleClip";
        }
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
