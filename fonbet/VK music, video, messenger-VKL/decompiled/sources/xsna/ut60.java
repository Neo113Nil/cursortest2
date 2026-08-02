package xsna;

import android.os.Bundle;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDebugInfoDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedMediaDiscoverActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedMediaDiscoverBlockFooterDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedMediaDiscoverBlockHeaderDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedMediaDiscoverCoverDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedMediaDiscoverItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.feed.core.models.DebugInfo;
import com.vk.feed.core.models.discover.DiscoverAction;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.discover.DiscoverSimilarClipsAction;
import com.vk.feed.core.models.discover.DiscoverSimilarPostsAction;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.data.network.dto.mappers.NewsfeedItemMapper;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.uij0;

/* compiled from: NewsfeedMediaDiscoverBlockDtoToDiscoverMediaBlockMapper.kt */
/* loaded from: classes4.dex */
public final class ut60 {
    public final NewsfeedItemMapper a;
    public final bpn0 b;

    public ut60(bpn0 bpn0Var, sv1 sv1Var, NewsfeedItemMapper newsfeedItemMapper, hn60 hn60Var) {
        this.a = newsfeedItemMapper;
        this.b = bpn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x010d, code lost:
    
        if (r5 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e1, code lost:
    
        if (r5 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0100, code lost:
    
        if (r5 == null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x035d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d5  */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DiscoverMediaBlock a(NewsfeedNewsfeedItemDto.NewsfeedMediaDiscoverBlockDto newsfeedMediaDiscoverBlockDto, LinkedHashMap linkedHashMap) {
        String i;
        String str;
        String g;
        Attachment a;
        NewsfeedMediaDiscoverActionDto d;
        DiscoverAction discoverAction;
        String str2;
        DebugInfo debugInfo;
        DiscoverAction discoverSimilarClipsAction;
        WallWallpostAttachmentDto d2;
        NewsfeedMediaDiscoverCoverDto.IconDto e;
        ArrayList arrayList = new ArrayList(newsfeedMediaDiscoverBlockDto.i().size());
        Iterator<NewsfeedMediaDiscoverItemDto> it = newsfeedMediaDiscoverBlockDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                String i2 = newsfeedMediaDiscoverBlockDto.k().i();
                int height = newsfeedMediaDiscoverBlockDto.getHeight();
                int width = newsfeedMediaDiscoverBlockDto.getWidth();
                NewsfeedMediaDiscoverBlockHeaderDto g2 = newsfeedMediaDiscoverBlockDto.g();
                String title = g2 != null ? g2.getTitle() : null;
                NewsfeedMediaDiscoverBlockFooterDto f = newsfeedMediaDiscoverBlockDto.f();
                String e2 = f != null ? f.e() : null;
                NewsfeedMediaDiscoverBlockFooterDto f2 = newsfeedMediaDiscoverBlockDto.f();
                DiscoverMediaBlock discoverMediaBlock = new DiscoverMediaBlock(i2, arrayList, height, width, title, e2, f2 != null ? f2.d() : null, new NewsEntry.TrackData(newsfeedMediaDiscoverBlockDto.r(), 0, 0L, false, false, null, null, 0, 254, null));
                Boolean j = newsfeedMediaDiscoverBlockDto.j();
                Boolean bool = Boolean.TRUE;
                discoverMediaBlock.c = epx.f(j, bool);
                discoverMediaBlock.e = epx.f(newsfeedMediaDiscoverBlockDto.l(), bool);
                NewsfeedItemWallpostFeedbackDto e3 = newsfeedMediaDiscoverBlockDto.e();
                discoverMediaBlock.g = e3 != null ? nn60.a(e3) : null;
                NewsfeedItemDebugInfoDto d3 = newsfeedMediaDiscoverBlockDto.d();
                discoverMediaBlock.h = d3 != null ? sv1.w(d3) : null;
                return discoverMediaBlock;
            }
            NewsfeedMediaDiscoverItemDto next = it.next();
            NewsEntry a2 = this.a.a(next.f(), linkedHashMap);
            NewsfeedNewsfeedItemDto f3 = next.f();
            if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedDzenStoryNewsBlockDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedDzenStoryNewsBlockDto) f3).j().i();
            } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedDzenTopStoriesBlockDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedDzenTopStoriesBlockDto) f3).o().i();
            } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedInfoBlockDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedInfoBlockDto) f3).d().i();
            } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemAchievementGameBlockDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedItemAchievementGameBlockDto) f3).d().i();
            } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemAdsBlockDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedItemAdsBlockDto) f3).d().i();
            } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemAnimatedBlockDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedItemAnimatedBlockDto) f3).d().i();
            } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemAppsCarouselDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedItemAppsCarouselDto) f3).l().i();
            } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemClipsAutoplayBlockDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedItemClipsAutoplayBlockDto) f3).d().i();
            } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemClipsChallengesBlockUmbrellaDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedItemClipsChallengesBlockUmbrellaDto) f3).d().i();
            } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemDigestDto) {
                i = ((NewsfeedNewsfeedItemDto.NewsfeedItemDigestDto) f3).p().i();
            } else {
                if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemExpertCardWidgetDto) {
                    NewsfeedNewsfeedItemDto.NewsfeedItemExpertCardWidgetDto.TypeDto d4 = ((NewsfeedNewsfeedItemDto.NewsfeedItemExpertCardWidgetDto) f3).d();
                    i = d4 != null ? d4.i() : null;
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemFeedbackPollDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemFeedbackPollDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemFriendsEntrypointsBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemFriendsEntrypointsBlockDto) f3).getType();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemFriendsRecommendBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemFriendsRecommendBlockDto) f3).getType();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemFriendsRecommendationsGroupsBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemFriendsRecommendationsGroupsBlockDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemMarketCarouselBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemMarketCarouselBlockDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemMarketItemDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemMarketItemDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemMusicSelectionsBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemMusicSelectionsBlockDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemPhotoDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemPhotoDto) f3).o().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemPhotoTagDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemPhotoTagDto) f3).o().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemPromoButtonDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemPromoButtonDto) f3).g().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecognizeBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemRecognizeBlockDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedAppBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedAppBlockDto) f3).o().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedArtistsBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedArtistsBlockDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedAudiosBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedAudiosBlockDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedChannelsBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedChannelsBlockDto) f3).g().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedGroupsBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemRecommendedGroupsBlockDto) f3).k().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemStoriesInterestingBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemStoriesInterestingBlockDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemTopicDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemTopicDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemUxpollBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemUxpollBlockDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemVideoDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemVideoDto) f3).B().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemVideoPostcardBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemVideoPostcardBlockDto) f3).d().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemVideosForYouBlockDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemVideosForYouBlockDto) f3).o().i();
                } else if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedItemWallpostDto) {
                    i = ((NewsfeedNewsfeedItemDto.NewsfeedItemWallpostDto) f3).o().i();
                } else {
                    if (f3 instanceof NewsfeedNewsfeedItemDto.NewsfeedMediaDiscoverBlockDto) {
                        i = ((NewsfeedNewsfeedItemDto.NewsfeedMediaDiscoverBlockDto) f3).k().i();
                    }
                    str = "";
                }
                int width2 = next.getWidth();
                int height2 = next.getHeight();
                NewsfeedMediaDiscoverCoverDto e4 = next.e();
                String i3 = (e4 != null || (e = e4.e()) == null) ? null : e.i();
                String title2 = next.getTitle();
                g = next.g();
                NewsfeedMediaDiscoverCoverDto e5 = next.e();
                a = (e5 != null || (d2 = e5.d()) == null) ? null : ((pax0) this.b.getValue()).a(d2, linkedHashMap);
                d = next.d();
                if (d == null) {
                    if (d instanceof NewsfeedMediaDiscoverActionDto.NewsfeedMediaDiscoverActionPostDto) {
                        NewsfeedMediaDiscoverActionDto.NewsfeedMediaDiscoverActionPostDto newsfeedMediaDiscoverActionPostDto = (NewsfeedMediaDiscoverActionDto.NewsfeedMediaDiscoverActionPostDto) d;
                        discoverSimilarClipsAction = new DiscoverSimilarPostsAction(newsfeedMediaDiscoverActionPostDto.d(), cqm0.a(newsfeedMediaDiscoverActionPostDto.e()));
                    } else {
                        if (!(d instanceof NewsfeedMediaDiscoverActionDto.NewsfeedMediaDiscoverActionClipDto)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        discoverSimilarClipsAction = new DiscoverSimilarClipsAction(((NewsfeedMediaDiscoverActionDto.NewsfeedMediaDiscoverActionClipDto) d).d());
                    }
                    discoverAction = discoverSimilarClipsAction;
                } else {
                    discoverAction = null;
                }
                List<String> i4 = next.i();
                if (g == null) {
                    uij0.a aVar = uij0.a.a;
                    ObsceneTextFilter obsceneTextFilter = ObsceneTextFilter.UNAVAILABLE;
                    LinksParserData.HashtagService hashtagService = LinksParserData.HashtagService.Posts;
                    LinksParserData linksParserData = new LinksParserData(43787, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, obsceneTextFilter == ObsceneTextFilter.ENABLED, 8188);
                    vdz vdzVar = new vdz(0);
                    ucp ucpVar = ucp.a;
                    str2 = ucp.i(xwk.d().a().o(g, linksParserData, vdzVar)).toString();
                } else {
                    str2 = null;
                }
                if (a instanceof VideoAttachment) {
                    String str3 = str2;
                    if (a instanceof PhotoAttachment) {
                        debugInfo = new PhotoDiscoverGridItem(str, a2, (PhotoAttachment) a, height2, width2, i3, title2, g, i4, discoverAction, str3);
                    }
                    if (r10 != null) {
                        arrayList.add(r10);
                    }
                } else {
                    debugInfo = new VideoDiscoverGridItem(str, a2, (VideoAttachment) a, height2, width2, i3, title2, g, i4, discoverAction, false, str2, 1024, null);
                }
                r10 = debugInfo;
                if (r10 != null) {
                }
            }
            str = i;
            int width22 = next.getWidth();
            int height22 = next.getHeight();
            NewsfeedMediaDiscoverCoverDto e42 = next.e();
            if (e42 != null) {
            }
            String title22 = next.getTitle();
            g = next.g();
            NewsfeedMediaDiscoverCoverDto e52 = next.e();
            if (e52 != null) {
            }
            d = next.d();
            if (d == null) {
            }
            List<String> i42 = next.i();
            if (g == null) {
            }
            if (a instanceof VideoAttachment) {
            }
            r10 = debugInfo;
            if (r10 != null) {
            }
        }
    }
}
