package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.d;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.articles.api.preload.QueryParameters;
import com.vk.common.links.AwayLink;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.StereoRoomAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.dto.stereo.StereoRoom;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.poll.fragments.PollViewerFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedInteractionItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemTrackCode;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.voip.stereo.stub.common.di.VoipStereoRouterComponentStub;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioCuratorAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.BookingAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.NoteAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PostAttachment;
import com.vkontakte.android.attachments.SituationalThemeAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.WikiAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.gd60;

/* compiled from: NewsEntryClickController.kt */
/* loaded from: classes4.dex */
public class fa60 implements s980, w8i {
    public final bpn0 b = new bpn0(new k7z(this, 9));
    public final bpn0 c = new bpn0(new v100(this, 7));
    public final bpn0 d = new bpn0(new fr20(this, 4));
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final boolean l;
    public final Object m;

    public fa60() {
        z260 z260Var = new z260(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, z260Var);
        int i = 6;
        this.f = msy.a(lazyThreadSafetyMode, new w100(this, i));
        this.g = msy.a(lazyThreadSafetyMode, new a040(this, i));
        this.h = msy.a(lazyThreadSafetyMode, new p6y(this, 12));
        this.i = msy.a(lazyThreadSafetyMode, new dgm(this, 27));
        this.j = msy.a(lazyThreadSafetyMode, new n1(27));
        this.k = msy.a(lazyThreadSafetyMode, new hp30(this, 5));
        SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
        smbAdFeatures.getClass();
        this.l = com.vk.toggle.b.A.a(smbAdFeatures);
        this.m = msy.a(lazyThreadSafetyMode, new cvs(this, 24));
    }

    public static void b(Context context, u1c0 u1c0Var, LinkAttachment linkAttachment) {
        Integer num;
        LaunchContext launchContext;
        NewsEntry newsEntry;
        NewsEntry.TrackData Cb;
        String str;
        String str2;
        String str3 = null;
        int i = 0;
        if (epx.f(u1c0Var != null ? u1c0Var.l : null, "fave") && (str2 = linkAttachment.f.b) != null) {
            qrq.a(u1c0Var.b, gnq.g(null, str2, false));
        }
        String str4 = linkAttachment.i;
        AwayLink awayLink = linkAttachment.f;
        if (TextUtils.isEmpty(str4)) {
            context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(awayLink.b, new StringBuilder("vklink://view/?"))));
            return;
        }
        if (u1c0Var == null || (str = u1c0Var.l) == null) {
            num = null;
        } else {
            int length = str.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                char charAt = str.charAt(i);
                if (Character.isDigit(charAt) || charAt == '-') {
                    break;
                } else {
                    i++;
                }
            }
            num = Integer.valueOf(i);
        }
        if (num != null) {
            launchContext = new LaunchContext(false, false, false, u1c0Var.l, null, null, null, u1c0Var.b.Cb().b, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108727);
        } else {
            if (u1c0Var != null && (newsEntry = u1c0Var.b) != null && (Cb = newsEntry.Cb()) != null) {
                str3 = Cb.b;
            }
            launchContext = new LaunchContext(false, false, false, null, null, null, null, str3, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108735);
        }
        hd60.a().V(context, awayLink.b, linkAttachment.i, awayLink.c, launchContext);
    }

    public static void c(Context context, MiniAppAttachment miniAppAttachment) {
        if (j8.d(context)) {
            return;
        }
        gd60 a = hd60.a();
        ApiApplication apiApplication = miniAppAttachment.f;
        gd60.J(a, context, apiApplication, "snippet", null, apiApplication.H, 4020);
    }

    public static void e(Context context, u1c0 u1c0Var, SituationalThemeAttachment situationalThemeAttachment) {
        String str;
        maz.c(xwk.d().e(), context, situationalThemeAttachment.i, LaunchContext.A, null, null, 24);
        bpn0 bpn0Var = vwj0.a;
        if (u1c0Var == null || (str = u1c0Var.l) == null) {
            str = "";
        }
        cxj0 cxj0Var = (cxj0) vwj0.a.getValue();
        x9y x9yVar = new x9y();
        x9yVar.o("event_type", "open");
        x9yVar.o("nav_screen", str);
        x9yVar.o("entry_point", "snippet");
        cxj0Var.a(Collections.singletonList(x9yVar));
    }

    public static /* synthetic */ void h(fa60 fa60Var, u1c0 u1c0Var) {
        fa60Var.g(u1c0Var, "click", AdsItemBlockAdStatPixelDto.TypeDto.CLICK);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f A[RETURN] */
    @Override // xsna.s980
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E8(Attachment attachment, NewsEntry newsEntry) {
        LinkButton linkButton;
        ArticleDonut.Placeholder placeholder;
        LinkButton linkButton2;
        Action action = null;
        r1 = null;
        r1 = null;
        Action action2 = null;
        action = null;
        if (attachment instanceof ArticleAttachment) {
            Article article = ((ArticleAttachment) attachment).f;
            if (article.d()) {
                ArticleDonut articleDonut = article.q;
                if (articleDonut != null && (placeholder = articleDonut.c) != null && (linkButton2 = placeholder.d) != null) {
                    action2 = linkButton2.c;
                }
                return action2 != null;
            }
            if (article.g() && (article.h != null || article.i != null)) {
            }
        } else {
            if (attachment instanceof NarrativeAttachment) {
                Narrative narrative = ((NarrativeAttachment) attachment).f;
                FaveEntry faveEntry = newsEntry instanceof FaveEntry ? (FaveEntry) newsEntry : null;
                if (faveEntry != null) {
                    gmq gmqVar = faveEntry.i.f;
                    Narrative narrative2 = gmqVar instanceof Narrative ? (Narrative) gmqVar : null;
                    if (narrative2 != null) {
                        narrative = narrative2;
                    }
                }
                return narrative.Ab();
            }
            if (attachment instanceof DocumentAttachment) {
                String str = ((DocumentAttachment) attachment).g;
                return (str == null || str.length() == 0) ? false : true;
            }
            if (!(attachment instanceof PodcastAttachment)) {
                return (attachment instanceof AlbumAttachment) || (attachment instanceof MarketAlbumAttachment) || (attachment instanceof AudioArtistAttachment) || (attachment instanceof AudioCuratorAttachment) || (attachment instanceof AudioPlaylistAttachment) || (attachment instanceof DonutLinkAttachment) || (attachment instanceof EventAttachment) || (attachment instanceof GeoAttachment) || (attachment instanceof SnippetAttachment) || (attachment instanceof LinkAttachment) || (attachment instanceof MarketAttachment) || (attachment instanceof MiniAppAttachment) || (attachment instanceof NoteAttachment) || (attachment instanceof PollAttachment) || (attachment instanceof SituationalThemeAttachment) || (attachment instanceof BookingAttachment) || (attachment instanceof WikiAttachment) || (attachment instanceof MarketLinkAttachment);
            }
            PodcastAttachment podcastAttachment = (PodcastAttachment) attachment;
            boolean Eb = podcastAttachment.Eb();
            MusicTrack musicTrack = podcastAttachment.f;
            if (Eb) {
                Episode episode = musicTrack.w;
                if (episode != null && (linkButton = episode.j) != null) {
                    action = linkButton.c;
                }
                return action != null;
            }
            if (musicTrack.B()) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.s980
    public final void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        PostInteract postInteract;
        String str;
        Context context = view.getContext();
        if (attachment instanceof DonutLinkAttachment) {
            DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) attachment;
            di60.w(donutLinkAttachment.l.c, context, null, null, null, null, 62);
            UserId userId = donutLinkAttachment.g;
            b.d dVar = new b.d("donut_click_pay");
            dVar.b("snippet_post", "source");
            dVar.b(userId, "owner_id");
            dVar.e();
            return;
        }
        if (!(attachment instanceof SnippetAttachment)) {
            if (attachment instanceof MiniAppAttachment) {
                c(context, (MiniAppAttachment) attachment);
                return;
            } else if (attachment instanceof SituationalThemeAttachment) {
                e(context, u1c0Var, (SituationalThemeAttachment) attachment);
                return;
            } else {
                Mg(view, u1c0Var, newsEntry, attachment);
                return;
            }
        }
        SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
        c6z c6zVar = newsEntry instanceof c6z ? (c6z) newsEntry : null;
        if (epx.f(u1c0Var != null ? u1c0Var.l : null, "fave")) {
            qrq.a(u1c0Var.b, snippetAttachment);
        }
        if (snippetAttachment.y != null) {
            gd60 a = hd60.a();
            Article article = snippetAttachment.y;
            String str2 = u1c0Var != null ? u1c0Var.l : null;
            a.q0(context, article, (r15 & 4) != 0 ? null : snippetAttachment, (r15 & 8) != 0 ? null : null, c6zVar != null ? c6zVar.r() : null, false);
            return;
        }
        if (snippetAttachment.q != null) {
            gd60 a2 = hd60.a();
            Article Jb = snippetAttachment.Jb();
            String str3 = u1c0Var != null ? u1c0Var.l : null;
            a2.q0(context, Jb, (r15 & 4) != 0 ? null : snippetAttachment, (r15 & 8) != 0 ? null : null, c6zVar != null ? c6zVar.r() : null, false);
            return;
        }
        if (snippetAttachment.A != null) {
            if (u1c0Var == null || (str = u1c0Var.l) == null) {
                str = "snippet";
            }
            gd60.J(hd60.a(), context, snippetAttachment.A, str, null, null, 4084);
            return;
        }
        String str4 = snippetAttachment.o;
        AwayLink awayLink = snippetAttachment.f;
        if (str4 != null && str4.length() != 0) {
            List a3 = n6j.a(0, BundleUtil.UNDERLINE_TAG, str4);
            if (a3.size() < 2) {
                L.l("item.previewPage.split('_').size < 2", str4);
                return;
            } else {
                i(u1c0Var, newsEntry);
                gd60.W(hd60.a(), context, cqm0.l((String) a3.get(0)), Integer.valueOf(Integer.parseInt((String) a3.get(1))), null, null, null, snippetAttachment.u, 56);
                return;
            }
        }
        if (u1c0Var != null && (postInteract = u1c0Var.m) != null) {
            postInteract.f = awayLink.b;
            postInteract.Cb(PostInteract.Type.snippet_button_action);
        }
        if (snippetAttachment.v == null) {
            if (TextUtils.isEmpty(snippetAttachment.l)) {
                return;
            }
            hd60.a().V(context, snippetAttachment.l, snippetAttachment.j, awayLink.c, new LaunchContext(false, false, false, u1c0Var != null ? u1c0Var.l : null, null, null, null, u1c0Var != null ? u1c0Var.c() : null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108727));
            return;
        }
        int i = u1c0Var != null ? u1c0Var.k : -1;
        gd60 a4 = hd60.a();
        int i2 = i;
        ButtonAction buttonAction = snippetAttachment.v;
        PostInteract postInteract2 = u1c0Var != null ? u1c0Var.m : null;
        Integer.valueOf(i2);
        a4.C(context, buttonAction, postInteract2, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.ng30] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [xsna.zcl] */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r44v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v74, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.s980
    public final void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        Post R;
        Flags flags;
        String str;
        NewsEntry.TrackData Cb;
        UserId o;
        UserId o2;
        NewsEntry.TrackData Cb2;
        String str2;
        LinkButton linkButton;
        Action action;
        Narrative narrative;
        PostInteract postInteract;
        String str3;
        String str4;
        UserId userId;
        PostInteract postInteract2;
        PostInteract postInteract3;
        String str5;
        PostInteract postInteract4;
        String str6;
        NewsEntry.TrackData Cb3;
        PostInteract postInteract5;
        Activity h;
        String str7;
        String str8;
        ArticleDonut.Placeholder placeholder;
        LinkButton linkButton2;
        Action action2;
        Context context = view.getContext();
        r12 = null;
        Long l = null;
        if (attachment instanceof AlbumAttachment) {
            tfa0.a.getClass();
            PhotoAlbum b = tfa0.b((AlbumAttachment) attachment);
            gd60 a = hd60.a();
            gd60.a aVar = gd60.a;
            a.z0(context, b, null);
            return;
        }
        if (attachment instanceof MarketAlbumAttachment) {
            GoodAlbum goodAlbum = ((MarketAlbumAttachment) attachment).f;
            if (goodAlbum == null) {
                return;
            }
            hd60.a().G0(context, goodAlbum);
            return;
        }
        if (attachment instanceof ArticleAttachment) {
            ArticleAttachment articleAttachment = (ArticleAttachment) attachment;
            Article article = articleAttachment.f;
            if (article.g() || article.d()) {
                c6z c6zVar = newsEntry instanceof c6z ? (c6z) newsEntry : null;
                if (article.d()) {
                    ArticleDonut articleDonut = article.q;
                    if (articleDonut != null && (placeholder = articleDonut.c) != null && (linkButton2 = placeholder.d) != null && (action2 = linkButton2.c) != null) {
                        di60.w(action2, context, null, null, null, null, 62);
                    }
                    UserId userId2 = article.c;
                    b.d dVar = new b.d("donut_click_pay");
                    dVar.b("article_attach_placeholder", "source");
                    dVar.b(userId2, "owner_id");
                    dVar.e();
                    h(this, u1c0Var);
                    return;
                }
                if (article.h == null) {
                    String str9 = article.i;
                    if (str9 != null) {
                        if (epx.f(u1c0Var != null ? u1c0Var.l : null, "fave")) {
                            qrq.a(u1c0Var.b, gnq.g(article.l, str9, article.n));
                        }
                        xwk.d().e().a(context, str9);
                        g(u1c0Var, "click_post_link", AdsItemBlockAdStatPixelDto.TypeDto.CLICK_POST_LINK);
                        return;
                    }
                    return;
                }
                QueryParameters queryParameters = new QueryParameters();
                LinkedHashMap linkedHashMap = queryParameters.b;
                if (u1c0Var != null && (str8 = u1c0Var.l) != null) {
                    linkedHashMap.put("ref", str8);
                }
                Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
                if (post != null && (str7 = post.L.b) != null) {
                    linkedHashMap.put("track_code", str7);
                }
                if (epx.f(u1c0Var != null ? u1c0Var.l : null, "fave")) {
                    qrq.a(u1c0Var.b, articleAttachment);
                }
                linkedHashMap.put("article_id", String.valueOf(article.b));
                hd60.a().q0(context, articleAttachment.f, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : queryParameters, c6zVar != null ? c6zVar.r() : null, false);
                h(this, u1c0Var);
                return;
            }
            return;
        }
        if (attachment instanceof AudioArtistAttachment) {
            AudioArtistAttachment audioArtistAttachment = (AudioArtistAttachment) attachment;
            hd60.a().p(context, audioArtistAttachment.f.b, audioArtistAttachment.h);
            return;
        }
        if (attachment instanceof AudioCuratorAttachment) {
            AudioCuratorAttachment audioCuratorAttachment = (AudioCuratorAttachment) attachment;
            hd60.a().s1(context, audioCuratorAttachment.f.b, audioCuratorAttachment.h);
            return;
        }
        if (attachment instanceof AudioPlaylistAttachment) {
            AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) attachment;
            hd60.a().d1(context, audioPlaylistAttachment.f, u1c0Var != null ? u1c0Var.b : null, MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment.g));
            return;
        }
        if (attachment instanceof DocumentAttachment) {
            DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
            String str10 = documentAttachment.g;
            if (str10 == null || str10.length() == 0 || (h = e3m.h(context)) == null) {
                return;
            }
            try {
                ((bvn) this.k.getValue()).c(h, documentAttachment.Jb());
                return;
            } catch (Exception e) {
                L.i(e);
                return;
            }
        }
        if (attachment instanceof DonutLinkAttachment) {
            DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) attachment;
            di60.w(donutLinkAttachment.m, context, null, null, null, null, 62);
            UserId userId3 = donutLinkAttachment.g;
            b.d dVar2 = new b.d("donut_snippet_click");
            dVar2.b("snippet_post", "source");
            dVar2.b(userId3, "owner_id");
            dVar2.e();
            return;
        }
        if (attachment instanceof EventAttachment) {
            hd60.a().s0(context, ((EventAttachment) attachment).f.b, u1c0Var != null ? u1c0Var.l : null, u1c0Var != null ? u1c0Var.c() : null);
            if (u1c0Var != null && (postInteract5 = u1c0Var.m) != null) {
                postInteract5.zb(PostInteract.Type.open_group);
            }
            h(this, u1c0Var);
            return;
        }
        if (attachment instanceof GeoAttachment) {
            GeoAttachment geoAttachment = (GeoAttachment) attachment;
            r14 = u1c0Var != null ? u1c0Var.k : 0;
            p4r p4rVar = (p4r) this.j.getValue();
            String str11 = (newsEntry == 0 || (Cb3 = newsEntry.Cb()) == null) ? null : Cb3.b;
            String Db = newsEntry != 0 ? newsEntry.Db() : null;
            String str12 = u1c0Var != null ? u1c0Var.l : null;
            p4rVar.getClass();
            p4r.e(r14, str11, Db, str12);
            if (geoAttachment.k > 0) {
                ((NewsFeedComponent) this.c.getValue()).l0().J(geoAttachment.k, context);
                return;
            } else {
                hd60.a().k1(context, geoAttachment);
                return;
            }
        }
        if (attachment instanceof SnippetAttachment) {
            SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
            c6z c6zVar2 = newsEntry instanceof c6z ? (c6z) newsEntry : null;
            if (epx.f(u1c0Var != null ? u1c0Var.l : null, "fave")) {
                qrq.a(u1c0Var.b, snippetAttachment);
            }
            Article article2 = snippetAttachment.y;
            AwayLink awayLink = snippetAttachment.f;
            if (article2 != null) {
                c6z c6zVar3 = c6zVar2;
                gd60 a2 = hd60.a();
                Article article3 = snippetAttachment.y;
                String str13 = u1c0Var != null ? u1c0Var.l : null;
                a2.q0(context, article3, (r15 & 4) != 0 ? null : snippetAttachment, (r15 & 8) != 0 ? null : null, c6zVar3 != null ? c6zVar3.r() : null, false);
                return;
            }
            c6z c6zVar4 = c6zVar2;
            if (snippetAttachment.q != null) {
                gd60 a3 = hd60.a();
                Article Jb = snippetAttachment.Jb();
                String str14 = u1c0Var != null ? u1c0Var.l : null;
                a3.q0(context, Jb, (r15 & 4) != 0 ? null : snippetAttachment, (r15 & 8) != 0 ? null : null, c6zVar4 != null ? c6zVar4.r() : null, false);
                return;
            }
            if (snippetAttachment.A != null) {
                if (u1c0Var == null || (str6 = u1c0Var.l) == null) {
                    str6 = "snippet";
                }
                gd60.J(hd60.a(), context, snippetAttachment.A, str6, null, null, 4084);
                return;
            }
            if (u1c0Var != null && (postInteract4 = u1c0Var.m) != null) {
                postInteract4.f = awayLink.b;
                postInteract4.Cb(PostInteract.Type.snippet_action);
            }
            hd60.a().V(context, awayLink.b, snippetAttachment.j, awayLink.c, new LaunchContext(false, false, false, u1c0Var != null ? u1c0Var.l : null, null, null, null, u1c0Var != null ? u1c0Var.c() : null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108727));
            return;
        }
        if (attachment instanceof LinkAttachment) {
            LinkAttachment linkAttachment = (LinkAttachment) attachment;
            if (!hd60.a().y0() && (str5 = linkAttachment.h) != null && myc0.f(str5)) {
                i(u1c0Var, newsEntry);
                List a4 = n6j.a(0, BundleUtil.UNDERLINE_TAG, linkAttachment.h);
                gd60.W(hd60.a(), context, cqm0.l((String) a4.get(0)), Integer.valueOf(Integer.parseInt((String) a4.get(1))), null, null, null, linkAttachment.k, 56);
            } else if (linkAttachment.m != null) {
                int i = u1c0Var != null ? u1c0Var.k : -1;
                gd60 a5 = hd60.a();
                int i2 = i;
                ButtonAction buttonAction = linkAttachment.m;
                PostInteract postInteract6 = u1c0Var != null ? u1c0Var.m : null;
                Integer.valueOf(i2);
                a5.C(context, buttonAction, postInteract6, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : null);
            } else {
                b(context, u1c0Var, linkAttachment);
            }
            int i3 = u1c0Var != null ? u1c0Var.k : -1;
            ((ng30) this.e.getValue()).b(new f59(u1c0Var != null ? u1c0Var.b : null, AdsintEventTypeDto.MRC_CLICK, i3));
            ((ng30) this.e.getValue()).b(new f59(u1c0Var != null ? u1c0Var.b : null, AdsintEventTypeDto.MRC_CLICK_POST_LINK, i3));
            PostInteract postInteract7 = linkAttachment.j;
            if (postInteract7 != null) {
                postInteract7.Db(PostInteract.Type.attached_link_click, linkAttachment.f.b);
            }
            DeprecatedStatisticInterface deprecatedStatisticInterface = linkAttachment.l;
            if (deprecatedStatisticInterface != null) {
                com.vkontakte.android.data.b.o(deprecatedStatisticInterface, "click_post_link");
                return;
            }
            return;
        }
        if (attachment instanceof MarketAttachment) {
            MarketAttachment marketAttachment = (MarketAttachment) attachment;
            if (u1c0Var != null && (postInteract3 = u1c0Var.m) != null) {
                postInteract3.Db(PostInteract.Type.snippet_action, "https://" + a0a.d + "/product" + marketAttachment.f.c + BundleUtil.UNDERLINE_TAG + marketAttachment.f.b);
            }
            String c = u1c0Var != null ? u1c0Var.c() : null;
            if (c == null || drm0.N(c)) {
                if (u1c0Var != null && (postInteract = u1c0Var.m) != null) {
                    str3 = postInteract.h;
                    str4 = str3;
                }
                str4 = null;
            } else {
                if (u1c0Var != null) {
                    str3 = u1c0Var.c();
                    str4 = str3;
                }
                str4 = null;
            }
            Post R2 = newsEntry != 0 ? di60.R(newsEntry) : null;
            sz00 sz00Var = (sz00) this.h.getValue();
            Good good = marketAttachment.f;
            long j = good.b;
            UserId userId4 = good.c;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = MarketAttachment.g;
            String str15 = (u1c0Var == null || (postInteract2 = u1c0Var.m) == null) ? null : postInteract2.c;
            boolean z = good.V;
            Integer valueOf = R2 != null ? Integer.valueOf(R2.n) : null;
            if (R2 != null && (userId = R2.m) != null) {
                l = Long.valueOf(userId.b);
            }
            sz00Var.d(context, new qz00(j, userId4, commonMarketStat$TypeRefSource, null, null, null, str15, str4, Boolean.valueOf(z), null, CommonMarketStat$TypeMarketContextContent.Type.POST, valueOf, l, 987640));
            return;
        }
        if (attachment instanceof MiniAppAttachment) {
            c(context, (MiniAppAttachment) attachment);
            return;
        }
        int i4 = 2;
        if (attachment instanceof NarrativeAttachment) {
            NarrativeAttachment narrativeAttachment = (NarrativeAttachment) attachment;
            Context context2 = view.getContext();
            boolean z2 = newsEntry instanceof FaveEntry;
            FaveEntry faveEntry = z2 ? (FaveEntry) newsEntry : null;
            if (faveEntry != null) {
                gmq gmqVar = faveEntry.i.f;
                narrative = gmqVar instanceof Narrative ? (Narrative) gmqVar : null;
                if (narrative == null) {
                    narrative = narrativeAttachment.f;
                }
            } else {
                narrative = narrativeAttachment.f;
            }
            boolean Ab = narrative.Ab();
            int i5 = narrative.b;
            if (Ab) {
                Activity h2 = e3m.h(context2);
                if (h2 != null) {
                    if (epx.f(u1c0Var != null ? u1c0Var.l : null, "fave")) {
                        qrq.a(u1c0Var.b, narrative);
                    }
                    ((StoryViewerComponent) this.b.getValue()).tb().h(h2, Collections.singletonList(new HighlightStoriesContainer(narrative, r14, i4, r12)), fsk.M(i5), null, (r42 & 16) != 0, z2 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.FAVE : MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_SNIPPET, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, u1c0Var != null ? u1c0Var.l : null, null, (r42 & 512) != 0 ? null : null, new q40(view, 26), (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : StoryViewerRouter.InOutAnimation.PointToFullScreen, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
                } else {
                    StoryViewerRouter.d(((StoryViewerComponent) this.b.getValue()).tb(), context2, Collections.singletonList(new HighlightStoriesContainer(narrative, r14, i4, r12)), null, MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_SNIPPET, null, null, null, null, null, 3956);
                }
                b.d dVar3 = new b.d("narrative_open");
                dVar3.b(narrative.c, "owner_id");
                dVar3.b(Integer.valueOf(i5), "narrative_id");
                dVar3.e();
                return;
            }
            return;
        }
        if (attachment instanceof NoteAttachment) {
            NoteAttachment noteAttachment = (NoteAttachment) attachment;
            i(u1c0Var, newsEntry);
            gd60.W(hd60.a(), context, noteAttachment.g, null, Integer.valueOf(noteAttachment.h), noteAttachment.f, null, null, 228);
            return;
        }
        if (attachment instanceof PodcastAttachment) {
            PodcastAttachment podcastAttachment = (PodcastAttachment) attachment;
            boolean Eb = podcastAttachment.Eb();
            MusicTrack musicTrack = podcastAttachment.f;
            if (!Eb) {
                if (musicTrack.B()) {
                    return;
                }
                hd60.a().z(context, musicTrack.c, musicTrack.b, u1c0Var != null ? u1c0Var.l : null, musicTrack.y, musicTrack.I);
                return;
            }
            Episode episode = musicTrack.w;
            if (episode != null && (linkButton = episode.j) != null && (action = linkButton.c) != null) {
                di60.w(action, context, null, null, null, null, 62);
            }
            UserId userId5 = musicTrack.c;
            b.d dVar4 = new b.d("donut_click_pay");
            dVar4.b("podcast_attach_placeholder", "source");
            dVar4.b(userId5, "owner_id");
            dVar4.e();
            return;
        }
        if (attachment instanceof PollAttachment) {
            Poll poll = ((PollAttachment) attachment).f;
            UserId userId6 = poll.c;
            int i6 = poll.b;
            if (u1c0Var == null || (str2 = u1c0Var.l) == null) {
                str2 = "poll";
            }
            new PollViewerFragment.a(userId6, false, false, str2, i6).k(context);
            return;
        }
        if (attachment instanceof SituationalThemeAttachment) {
            e(context, u1c0Var, (SituationalThemeAttachment) attachment);
            return;
        }
        if (attachment instanceof WikiAttachment) {
            WikiAttachment wikiAttachment = (WikiAttachment) attachment;
            i(u1c0Var, newsEntry);
            gd60.W(hd60.a(), context, wikiAttachment.h, Integer.valueOf(wikiAttachment.i), null, wikiAttachment.f, wikiAttachment.g, wikiAttachment.j, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            return;
        }
        if (attachment instanceof BookingAttachment) {
            gd60.Q0(hd60.a(), context, ((BookingAttachment) attachment).g, null, null, null, 24);
            p4r p4rVar2 = (p4r) this.j.getValue();
            String str16 = (newsEntry == 0 || (Cb2 = newsEntry.Cb()) == null) ? null : Cb2.b;
            str = str16 != null ? str16 : "";
            String Db2 = newsEntry != 0 ? newsEntry.Db() : null;
            if (newsEntry == 0 || (o2 = k9q0.o(newsEntry)) == null) {
                return;
            }
            r14 = u1c0Var != null ? u1c0Var.k : 0;
            p4rVar2.getClass();
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ONLINE_BOOKING, null, Long.valueOf(o2.b), null, null, null, 58, null), Integer.valueOf(r14), new MobileOfficialAppsFeedStat$TypeFeedInteractionItem(MobileOfficialAppsFeedStat$TypeFeedInteractionItem.Item.ONLINE_BOOKING_ATTACHMENT, new MobileOfficialAppsFeedStat$TypeFeedItemTrackCode(str, Db2), null, 4, null))).q();
            return;
        }
        if (attachment instanceof MarketLinkAttachment) {
            String str17 = ((MarketLinkAttachment) attachment).g;
            Long valueOf2 = (newsEntry == 0 || (o = k9q0.o(newsEntry)) == null) ? null : Long.valueOf(o.b);
            Integer valueOf3 = Integer.valueOf(di60.n(newsEntry));
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = CommonMarketStat$TypeRefSource.ATTACH_MARKET_LINK;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, valueOf2, null, null, null, 58, null);
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FEED;
            UiTrackingScreen b2 = UiTracker.j.b();
            SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b2 != null ? b2.a : null, commonMarketStat$TypeRefSource2, mobileOfficialAppsCoreNavStat$EventScreen, null, new MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem(null, null, null, null, valueOf3, 15, null), 48), 2);
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b3, uzp0Var.a).q();
            p4r p4rVar3 = (p4r) this.j.getValue();
            String str18 = (newsEntry == 0 || (Cb = newsEntry.Cb()) == null) ? null : Cb.b;
            str = str18 != null ? str18 : "";
            String Db3 = newsEntry != 0 ? newsEntry.Db() : null;
            UserId o3 = newsEntry != 0 ? k9q0.o(newsEntry) : null;
            r14 = u1c0Var != null ? u1c0Var.k : 0;
            p4rVar3.getClass();
            UiTracker uiTracker3 = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_MARKET_LINK, null, o3 != null ? Long.valueOf(o3.b) : null, null, null, null, 58, null), Integer.valueOf(r14), new MobileOfficialAppsFeedStat$TypeFeedInteractionItem(MobileOfficialAppsFeedStat$TypeFeedInteractionItem.Item.MARKET_LINK_ATTACHMENT, new MobileOfficialAppsFeedStat$TypeFeedItemTrackCode(str, Db3), null, 4, null))).q();
            gd60.Q0(hd60.a(), context, str17, null, null, null, 24);
            return;
        }
        if (attachment instanceof MarketMessageOwnerAttachment) {
            UserId userId7 = ((MarketMessageOwnerAttachment) attachment).f;
            if (userId7 != null) {
                long j2 = userId7.b;
                if (newsEntry == 0 || (R = di60.R(newsEntry)) == null) {
                    return;
                }
                SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_MESSAGE_TO_BC, Long.valueOf(di60.n(R)), Long.valueOf(j2), null, null, null, 56, null), new MobileOfficialAppsFeedStat$TypeFeedInteractionItem(MobileOfficialAppsFeedStat$TypeFeedInteractionItem.Item.MESSAGE_TO_BC_ATTACHMENT, new MobileOfficialAppsFeedStat$TypeFeedItemTrackCode(R.L.b, null, 2, null), null, 4, null), 2);
                UiTracker uiTracker4 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                uzp0 uzp0Var2 = UiTracker.h;
                uzp0Var2.getClass();
                new bjc(c3, b4, uzp0Var2.a).q();
                pyb pybVar = (pyb) this.i.getValue();
                Post R3 = di60.R(R);
                pyb.b(pybVar, context, null, j2, context.getString(R.string.market_message_to_owner_template), (R3 == null || (flags = R3.l) == null || !flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) ? Collections.singletonList(new PostAttachment(R)) : EmptyList.b, null, null, 33554354);
                return;
            }
            return;
        }
        if (attachment instanceof StereoRoomAttachment) {
            if (((StereoRoomAttachment) attachment).f.f == StereoRoom.Status.CLOSED) {
                VoipStereoRouterComponentStub.b.a a6 = ((k2x0) this.g.getValue()).a();
                xa4.L(context);
                a6.getClass();
                return;
            } else {
                VoipStereoRouterComponentStub.b.d c0 = ((k2x0) this.g.getValue()).c0();
                xa4.L(context);
                c0.getClass();
                return;
            }
        }
        if (attachment instanceof VideoAttachment) {
            NewsEntry newsEntry2 = u1c0Var != null ? u1c0Var.b : null;
            if (newsEntry2 != null) {
                ((ng30) this.e.getValue()).a(newsEntry2);
                return;
            }
            return;
        }
        if (attachment instanceof PhotoAttachment) {
            NewsEntry newsEntry3 = u1c0Var != null ? u1c0Var.b : null;
            if (newsEntry3 != null) {
                ((ng30) this.e.getValue()).a(newsEntry3);
                return;
            }
            return;
        }
        if (attachment instanceof AudioAttachment) {
            r12 = u1c0Var != null ? u1c0Var.b : 0;
            if (r12 != 0) {
                ((ng30) this.e.getValue()).a(r12);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(u1c0 u1c0Var, String str, AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
        NewsEntry newsEntry = u1c0Var != null ? u1c0Var.b : null;
        if (newsEntry instanceof PromoPost) {
            if (this.l) {
                ((hqa0) this.m.getValue()).a(((PromoPost) newsEntry).B.u6(typeDto));
            } else {
                com.vkontakte.android.data.b.o((DeprecatedStatisticInterface) newsEntry, str);
            }
            ((ng30) this.e.getValue()).b(new f59(newsEntry, AdsintEventTypeDto.MRC_CLICK, u1c0Var.k));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void i(u1c0 u1c0Var, NewsEntry newsEntry) {
        NewsEntry.TrackData Cb;
        int i = u1c0Var != null ? u1c0Var.k : 0;
        p4r p4rVar = (p4r) this.j.getValue();
        String str = (newsEntry == null || (Cb = newsEntry.Cb()) == null) ? null : Cb.b;
        String Db = newsEntry != null ? newsEntry.Db() : null;
        String str2 = u1c0Var != null ? u1c0Var.l : null;
        p4rVar.getClass();
        p4r.f(MobileOfficialAppsFeedStat$TypeFeedInteractionItem.Item.WIKI_ATTACHMENT_OPEN_BUTTON, str, Db, i, str2);
    }

    @Override // xsna.s980
    public final boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        Context context = view.getContext();
        if (!(attachment instanceof LinkAttachment)) {
            return false;
        }
        String str = ((LinkAttachment) attachment).f.b;
        s9j s9jVar = new s9j(this, context, u1c0Var, attachment);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(context.getString(R.string.vk_open));
        arrayList2.add("open");
        arrayList.add(context.getString(R.string.vk_copy));
        arrayList2.add("copy");
        new d.a(context).setTitle(str).b((CharSequence[]) arrayList.toArray(new String[0]), new ebz(arrayList2, s9jVar, context, str)).m();
        return true;
    }

    @Override // xsna.s980
    public void r8(NewsEntry newsEntry) {
    }

    @Override // xsna.hi60
    public void sa(NewsfeedExternalAction newsfeedExternalAction) {
    }

    @Override // xsna.s980
    public void U5(NewsEntry newsEntry, boolean z, int i) {
    }

    @Override // xsna.s980
    public void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
    }
}
