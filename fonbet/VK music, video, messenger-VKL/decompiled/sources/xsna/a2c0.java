package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.music.Curator;
import com.vk.dto.music.PlaylistMeta;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.attachment.AttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.attachment.FullAttachmentStyle;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioCuratorAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import com.vkontakte.android.attachments.WikiAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;

/* compiled from: PostDisplayItemListExt.kt */
/* loaded from: classes4.dex */
public final class a2c0 {
    public static final void a(List<u1c0> list, AudioArtistAttachment audioArtistAttachment, NewsEntry newsEntry, NewsEntry newsEntry2, String str) {
        list.add(new r74(audioArtistAttachment.f.k ? 76 : 152, audioArtistAttachment, newsEntry, newsEntry2));
        audioArtistAttachment.h = str;
    }

    public static final void b(List<u1c0> list, AudioCuratorAttachment audioCuratorAttachment, NewsEntry newsEntry, NewsEntry newsEntry2, String str) {
        Image image;
        Curator curator = audioCuratorAttachment.f;
        list.add(new r74((curator == null || (image = curator.e) == null || image.b.isEmpty()) ? 144 : 143, audioCuratorAttachment, newsEntry, newsEntry2));
        audioCuratorAttachment.h = str;
    }

    public static final void c(List<u1c0> list, AudioPlaylistAttachment audioPlaylistAttachment, NewsEntry newsEntry, NewsEntry newsEntry2, String str, PostInteract postInteract) {
        PlaylistMeta playlistMeta = audioPlaylistAttachment.f.A;
        int i = (playlistMeta == null || !playlistMeta.b) ? 45 : 80;
        audioPlaylistAttachment.g = str;
        audioPlaylistAttachment.h = postInteract;
        list.add(new r74(i, audioPlaylistAttachment, newsEntry, newsEntry2));
    }

    public static final void d(List<u1c0> list, LinkAttachment linkAttachment, NewsEntry newsEntry, NewsEntry newsEntry2, PostInteract postInteract) {
        n(linkAttachment, newsEntry, postInteract);
        list.add(new r74(43, linkAttachment, newsEntry, newsEntry2));
    }

    public static final void e(List<u1c0> list, MarketAttachment marketAttachment, AttachmentStyle attachmentStyle, NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        List<EntryAttachment> Gb;
        NewsEntryWithAttachments newsEntryWithAttachments = newsEntry instanceof NewsEntryWithAttachments ? (NewsEntryWithAttachments) newsEntry : null;
        if (newsEntryWithAttachments != null && (Gb = newsEntryWithAttachments.Gb()) != null) {
            i = Gb.size();
        }
        list.add(new r74(q(marketAttachment, i > 1 && !(attachmentStyle instanceof FullAttachmentStyle)), marketAttachment, newsEntry, newsEntry2));
    }

    public static final void f(List<u1c0> list, MarketLinkAttachment marketLinkAttachment, NewsEntry newsEntry, NewsEntry newsEntry2) {
        list.add(new r74(PsExtractor.AUDIO_STREAM, marketLinkAttachment, newsEntry, newsEntry2));
    }

    public static final void g(List<u1c0> list, PodcastAttachment podcastAttachment, NewsEntry newsEntry, NewsEntry newsEntry2) {
        list.add(new r74((!podcastAttachment.f.B() || podcastAttachment.Eb()) ? 70 : 96, podcastAttachment, newsEntry, newsEntry2));
    }

    public static final void h(List<u1c0> list, PrettyCardAttachment prettyCardAttachment, NewsEntry newsEntry, NewsEntry newsEntry2, PostInteract postInteract) {
        if (newsEntry2 instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) newsEntry2;
            prettyCardAttachment.Db(postInteract, promoPost.i, promoPost.j);
        }
        r74 r74Var = new r74(49, prettyCardAttachment, newsEntry, newsEntry2);
        r74Var.h = (ol60) j5g.a0(new h3d0().a(0, new Triple(newsEntry, newsEntry2, prettyCardAttachment)));
        list.add(r74Var);
    }

    public static final boolean i(List<u1c0> list, SnippetAttachment snippetAttachment, AttachmentStyle attachmentStyle, NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        int i2;
        List<EntryAttachment> Gb;
        boolean z = true;
        boolean z2 = !snippetAttachment.t;
        String Bb = newsEntry.Bb();
        if (Bb == null) {
            Bb = "";
        }
        snippetAttachment.u = "post?".concat(Bb);
        NewsEntryWithAttachments newsEntryWithAttachments = newsEntry instanceof NewsEntryWithAttachments ? (NewsEntryWithAttachments) newsEntry : null;
        if (newsEntryWithAttachments != null && (Gb = newsEntryWithAttachments.Gb()) != null) {
            i = Gb.size();
        }
        boolean z3 = i == 1 || (attachmentStyle instanceof FullAttachmentStyle);
        boolean z4 = i > 1 && !(attachmentStyle instanceof FullAttachmentStyle);
        if (snippetAttachment.Hb() && z3) {
            i2 = 268;
        } else if (snippetAttachment.Hb() && z4) {
            i2 = 269;
        } else if (snippetAttachment.Db() && z3) {
            i2 = 157;
        } else if (snippetAttachment.Db() && z4) {
            i2 = 158;
        } else if (snippetAttachment.B != null) {
            i2 = 191;
        } else {
            boolean z5 = snippetAttachment.t;
            i2 = z5 ? 83 : ((z5 || snippetAttachment.G == null) && !snippetAttachment.Eb()) ? 41 : 42;
        }
        r74 r74Var = new r74(i2, snippetAttachment, newsEntry, newsEntry2);
        if (!snippetAttachment.Eb() && (snippetAttachment.t || snippetAttachment.G == null)) {
            z = false;
        }
        if (di60.x(newsEntry2)) {
            com.vk.toggle.data.a b = com.vk.toggle.d.m.b();
            if ((b != null ? b.c : null) != null && z) {
                u1c0 u1c0Var = new u1c0(newsEntry, newsEntry2, Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE);
                u1c0Var.h = (ol60) j5g.a0(new skd().x(newsEntry2, null));
                r74Var = new lsi(r74Var, u1c0Var);
            }
        }
        list.add(r74Var);
        return z2;
    }

    public static final void j(List<u1c0> list, StickerAttachment stickerAttachment, NewsEntry newsEntry, NewsEntry newsEntry2) {
        list.add(new r74(stickerAttachment.V0() ? 67 : 66, stickerAttachment, newsEntry, newsEntry2));
    }

    public static final void k(List<u1c0> list, VideoSnippetAttachment videoSnippetAttachment, NewsEntry newsEntry, NewsEntry newsEntry2) {
        videoSnippetAttachment.k.n8(true);
        list.add(new r74(71, videoSnippetAttachment, newsEntry, newsEntry2));
        com.vk.toggle.data.a b = com.vk.toggle.d.m.b();
        if ((b != null ? b.c : null) == null || !di60.x(newsEntry2)) {
            list.add(new r74(72, videoSnippetAttachment, newsEntry, newsEntry2));
            return;
        }
        r74 r74Var = new r74(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, videoSnippetAttachment, newsEntry, newsEntry2);
        r74Var.h = (ol60) j5g.a0(new skd().x(newsEntry2, null));
        list.add(r74Var);
    }

    public static final void l(List<u1c0> list, WikiAttachment wikiAttachment, NewsEntry newsEntry, NewsEntry newsEntry2) {
        String Bb = newsEntry.Bb();
        if (Bb == null) {
            Bb = "";
        }
        wikiAttachment.j = "post?".concat(Bb);
        list.add(new r74(44, wikiAttachment, newsEntry, newsEntry2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f6, code lost:
    
        if (xsna.epx.f(r7 != null ? r7.t : null, "post_ads") != false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(Attachment attachment, NewsEntry newsEntry, NewsEntry newsEntry2, PostInteract postInteract, String str) {
        Object obj;
        String str2;
        String str3;
        Owner s;
        String Bb = newsEntry.Bb();
        if (Bb == null) {
            Bb = "";
        }
        if (attachment instanceof AudioAttachment) {
            AudioAttachment audioAttachment = (AudioAttachment) attachment;
            audioAttachment.h = str;
            audioAttachment.i = postInteract;
            return;
        }
        if (attachment instanceof AudioPlaylistAttachment) {
            AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) attachment;
            audioPlaylistAttachment.g = str;
            audioPlaylistAttachment.h = postInteract;
            return;
        }
        if (attachment instanceof SnippetAttachment) {
            ((SnippetAttachment) attachment).u = "post?".concat(Bb);
            return;
        }
        if (attachment instanceof VideoSnippetAttachment) {
            ((VideoSnippetAttachment) attachment).k.n8(true);
            return;
        }
        if (!(attachment instanceof VideoAttachment)) {
            if (attachment instanceof LinkAttachment) {
                n((LinkAttachment) attachment, newsEntry, postInteract);
                return;
            }
            if (attachment instanceof WikiAttachment) {
                ((WikiAttachment) attachment).j = "post?".concat(Bb);
                return;
            }
            if (attachment instanceof PrettyCardAttachment) {
                if (newsEntry2 instanceof PromoPost) {
                    PromoPost promoPost = (PromoPost) newsEntry2;
                    ((PrettyCardAttachment) attachment).Db(postInteract, promoPost.i, promoPost.j);
                    return;
                }
                return;
            }
            if (attachment instanceof AudioArtistAttachment) {
                ((AudioArtistAttachment) attachment).h = str;
                return;
            } else {
                if (attachment instanceof AudioCuratorAttachment) {
                    ((AudioCuratorAttachment) attachment).h = str;
                    return;
                }
                return;
            }
        }
        l490 l490Var = newsEntry2 instanceof l490 ? (l490) newsEntry2 : null;
        if (l490Var == null || (s = l490Var.s()) == null || (obj = s.b) == null) {
            obj = 0;
        }
        if (obj.equals(0)) {
            str2 = null;
        } else {
            str2 = obj + '|' + Bb;
        }
        Post post = newsEntry instanceof Post ? (Post) newsEntry : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).n : null;
        VideoAttachment videoAttachment = (VideoAttachment) attachment;
        if (videoAttachment.k.q0()) {
            if (str == null) {
                str = "";
            }
            String str4 = postInteract != null ? postInteract.b : null;
            if (str.length() != 0) {
                if (str.equals("wall_user")) {
                    str = CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE;
                } else if (str.equals("wall_group")) {
                    str = "club";
                }
            }
            if (str4 != null && str4.length() != 0 && str4.equals("feed_lives")) {
                str = "feed_lives";
            }
        } else if (postInteract != null && (str3 = postInteract.b) != null) {
            str = str3;
        }
        videoAttachment.Lb(str, postInteract, str2);
        if (newsEntry2 instanceof PromoPost) {
            videoAttachment.o = (DeprecatedStatisticInterface) newsEntry2;
            videoAttachment.k.n8(true);
        }
        if (post == null || !post.F) {
        }
        videoAttachment.k.n8(true);
        DeprecatedStatisticInterface deprecatedStatisticInterface = newsEntry2 instanceof DeprecatedStatisticInterface ? (DeprecatedStatisticInterface) newsEntry2 : null;
        yg5 yg5Var = videoAttachment.i;
        if (yg5Var == null || deprecatedStatisticInterface == null) {
            return;
        }
        Serializer.c<ShitAttachment> cVar = ShitAttachment.CREATOR;
        ShitAttachment.a.a(deprecatedStatisticInterface, yg5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(LinkAttachment linkAttachment, NewsEntry newsEntry, PostInteract postInteract) {
        String Bb = newsEntry.Bb();
        if (Bb == null) {
            Bb = "";
        }
        linkAttachment.l = newsEntry instanceof DeprecatedStatisticInterface ? (DeprecatedStatisticInterface) newsEntry : null;
        linkAttachment.j = postInteract;
        linkAttachment.k = "post?".concat(Bb);
    }

    public static final void o(ArrayList arrayList, NewsEntry newsEntry, kso0 kso0Var) {
        PhotoAttachment photoAttachment;
        if (kso0Var.a == 1 && (newsEntry instanceof Post) && (photoAttachment = kso0Var.d) != null) {
            photoAttachment.k = ((Post) newsEntry).n;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Attachment) it.next()).b = true;
        }
    }

    public static final void p(ArrayList arrayList, NewsEntry newsEntry, kso0 kso0Var) {
        if (arrayList.size() == 1) {
            o(arrayList, newsEntry, kso0Var);
        }
    }

    public static final int q(MarketAttachment marketAttachment, boolean z) {
        if (marketAttachment.f.Cb()) {
            return 245;
        }
        return z ? 238 : 46;
    }
}
