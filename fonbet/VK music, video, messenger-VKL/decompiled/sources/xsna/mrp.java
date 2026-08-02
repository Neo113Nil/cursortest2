package xsna;

import android.content.Context;
import com.vk.common.links.AwayLink;
import com.vk.common.links.LaunchContext;
import com.vk.dto.articles.AMP;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.contracts.modalcommon.ModalPostDestination;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.b;
import kotlin.Lazy;
import xsna.c9x0;
import xsna.gd60;
import xsna.qr80;

/* compiled from: EntryListRouter.kt */
/* loaded from: classes4.dex */
public final class mrp {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public mrp(Lazy<? extends StoryViewerComponent> lazy, Lazy<? extends NewsFeedComponent> lazy2, Lazy<? extends MarketComponent> lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public final NewsfeedRouter a() {
        return ((NewsFeedComponent) this.b.getValue()).l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Context context, NewsEntry newsEntry, String str, String str2, int i) {
        NewsEntry.TrackData Cb;
        if (newsEntry != null) {
            try {
                if (newsEntry.d) {
                    return;
                }
            } catch (Exception e) {
                L.C("vk", e);
                return;
            }
        }
        if (di60.C(newsEntry)) {
            return;
        }
        zcl zclVar = null;
        Integer valueOf = newsEntry != null ? Integer.valueOf(newsEntry.zb()) : null;
        if (valueOf != null && valueOf.intValue() == 11) {
            return;
        }
        if (valueOf.intValue() == 20) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == 29) {
            return;
        }
        if (valueOf.intValue() == 55) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == 30) {
            return;
        }
        if (valueOf.intValue() == 66) {
            return;
        }
        String str3 = (newsEntry == null || (Cb = newsEntry.Cb()) == null) ? null : Cb.b;
        if (newsEntry instanceof Post) {
            if (d(context, (Post) newsEntry, str)) {
                return;
            }
        } else {
            if (newsEntry instanceof Digest) {
                e(context, (Digest) newsEntry, str);
                return;
            }
            if (newsEntry instanceof FaveEntry) {
                gmq gmqVar = ((FaveEntry) newsEntry).i.f;
                if (epx.f(str2, "fave")) {
                    qrq.a(newsEntry, gmqVar);
                }
                if (gmqVar instanceof Good) {
                    f(context, (Good) gmqVar, str, str3);
                    return;
                }
                if (gmqVar instanceof FaveMarketItem) {
                    f(context, ((FaveMarketItem) gmqVar).b, str, str3);
                    return;
                }
                if (gmqVar instanceof Post) {
                    if (d(context, (Post) gmqVar, str)) {
                        return;
                    }
                } else {
                    if (gmqVar instanceof ArticleAttachment) {
                        hd60.a().q0(context, ((ArticleAttachment) gmqVar).f, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, str3, false);
                        return;
                    }
                    if (gmqVar instanceof SnippetAttachment) {
                        SnippetAttachment snippetAttachment = (SnippetAttachment) gmqVar;
                        AMP amp = snippetAttachment.q;
                        AwayLink awayLink = snippetAttachment.f;
                        if (amp == null) {
                            hd60.a().V(context, awayLink.b, snippetAttachment.j, awayLink.c, new LaunchContext(false, false, false, null, null, null, null, str3, awayLink.b, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108479));
                            return;
                        }
                        Article Jb = snippetAttachment.Jb();
                        if (Jb != null) {
                            hd60.a().q0(context, Jb, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, str3, false);
                            return;
                        }
                        return;
                    }
                    if (gmqVar instanceof VideoAttachment) {
                        hd60.a().A0(context, ((VideoAttachment) gmqVar).k, str, null, (r18 & 16) != 0 ? null : null, null, false, (r18 & 256) != 0 ? null : str3);
                        return;
                    }
                    if (gmqVar instanceof PodcastAttachment) {
                        gd60 a = hd60.a();
                        MusicTrack musicTrack = ((PodcastAttachment) gmqVar).f;
                        UserId userId = musicTrack.c;
                        int i2 = musicTrack.b;
                        String str4 = musicTrack.y;
                        gd60.a aVar = gd60.a;
                        a.z(context, userId, i2, str2, str4, null);
                        return;
                    }
                    if (gmqVar instanceof Narrative) {
                        Narrative narrative = (Narrative) gmqVar;
                        if (narrative.Ab()) {
                            StoryViewerRouter.d(((StoryViewerComponent) this.a.getValue()).tb(), context, e43.a(new HighlightStoriesContainer(narrative, 0, 2, zclVar)), null, MobileOfficialAppsConStoriesStat$ViewEntryPoint.FAVE, null, null, str3, null, null, 3892);
                            return;
                        }
                        return;
                    }
                }
            } else if (newsEntry instanceof PromoPost) {
                return;
            }
        }
        if (newsEntry != null) {
            NewsfeedRouter.E(a(), context, newsEntry, str2, str3, null, null, null, 112);
            PostInteract Ab = PostInteract.Ab(str2, newsEntry);
            if (Ab != null) {
                Ab.n = i;
                Ab.zb(PostInteract.Type.open);
            }
        }
    }

    public final void c(Context context, NewsEntry newsEntry, String str) {
        Integer num;
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            if (post.b0 != null) {
                num = post.u;
                a().b0(context, newsEntry, ModalPostDestination.COMMENTS, false, num, str, newsEntry.Cb().b, qr80.b.a);
            }
        }
        num = null;
        a().b0(context, newsEntry, ModalPostDestination.COMMENTS, false, num, str, newsEntry.Cb().b, qr80.b.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean d(Context context, Post post, String str) {
        boolean Tb = post.Tb();
        Integer num = post.v;
        int i = post.n;
        Integer num2 = post.u;
        UserId userId = post.m;
        if (!Tb) {
            String str2 = post.t;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1081306052:
                        if (str2.equals("market")) {
                            sz00 Ob = ((MarketComponent) this.c.getValue()).Ob();
                            UserId userId2 = post.m;
                            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = MarketAttachment.g;
                            StringBuilder sb = new StringBuilder();
                            sb.append(userId);
                            sb.append('_');
                            sb.append(i);
                            Ob.d(context, new qz00(i, userId2, commonMarketStat$TypeRefSource, null, null, null, sb.toString(), null, null, null, null, null, null, 1048056));
                            break;
                        }
                        break;
                    case 3446944:
                        if (str2.equals("post")) {
                            if (post.s.length() == 0 && post.z.size() == 1) {
                                Attachment Ib = post.Ib();
                                if (Ib instanceof VideoAttachment) {
                                    VideoAttachment videoAttachment = (VideoAttachment) Ib;
                                    if (g620.f().d(videoAttachment.k)) {
                                        hd60.a().A0(context, videoAttachment.k, str, null, (r18 & 16) != 0 ? null : null, null, false, (r18 & 256) != 0 ? null : null);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 108401386:
                        if (str2.equals("reply")) {
                            if (num2 != null && num != null) {
                                a().Y(post.n, num.intValue(), num2.intValue(), context, post.m);
                                break;
                            } else {
                                NewsfeedRouter a = a();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(userId);
                                sb2.append('_');
                                sb2.append(i);
                                a.N(context, sb2.toString(), num2 != null ? num2.toString() : null, c9x0.c.b, null, post.L.b);
                                break;
                            }
                        }
                        break;
                    case 110546223:
                        if (str2.equals("topic")) {
                            int i2 = post.E.e;
                            gd60 a2 = hd60.a();
                            UserId a3 = fkq0.a(userId);
                            gd60.a aVar = gd60.a;
                            a2.r(context, a3, i, i2 - (i2 % 20));
                            break;
                        }
                        break;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void e(Context context, Digest digest, String str) {
        if (digest.q.size() == 1) {
            Post post = (Post) digest.q.get(0);
            b.d dVar = new b.d("digest_post_open");
            dVar.b(digest.o, "track_code");
            dVar.b(post.Bb(), "post_id");
            dVar.e();
            d(context, post, str);
        }
    }

    public final void f(Context context, Good good, String str, String str2) {
        ((MarketComponent) this.c.getValue()).Ob().d(context, new qz00(good.b, good.c, epx.f(str != null ? cqm0.m(str) : null, "fave") ? CommonMarketStat$TypeRefSource.BOOKMARKS : CommonMarketStat$TypeRefSource.POST, null, null, null, null, str2, Boolean.valueOf(good.V), null, null, null, null, 1045496));
    }
}
