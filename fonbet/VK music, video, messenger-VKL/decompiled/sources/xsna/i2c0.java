package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.post.AttachmentsMeta;
import com.vk.dto.newsfeed.entries.post.DonutBadgeInfo;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.AttachmentStyle;
import com.vk.feed.core.models.attachment.ChipAttachmentStyle;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.attachment.FullAttachmentStyle;
import com.vk.feed.core.models.attachment.OnMediaAttachmentStyle;
import com.vk.feed.core.models.attachment.UnderMediaAttachmentStyle;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.attachments.ActionButtonAttachment;
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
import com.vkontakte.android.attachments.GraffitiAttachment;
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
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.SituationalThemeAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import com.vkontakte.android.attachments.WikiAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: PostDisplayItemsHelper.kt */
/* loaded from: classes.dex */
public final class i2c0 {
    public final k2c0 a = new k2c0();
    public final owu b = new owu();
    public final ydo0 c = new ydo0();
    public final ro d = new ro();
    public final tu e;
    public final sn3 f;
    public final a7d0 g;
    public final bpn0 h;
    public final ktr i;
    public final bpn0 j;
    public final Object k;
    public final qen l;
    public final p7i m;

    /* compiled from: PostDisplayItemsHelper.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentsMeta.PrimaryMode.values().length];
            try {
                iArr[AttachmentsMeta.PrimaryMode.CAROUSEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentsMeta.PrimaryMode.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public i2c0(hno hnoVar, a2o a2oVar) {
        a6a0 a6a0Var = new a6a0();
        bdl bdlVar = new bdl(2);
        wuj wujVar = new wuj();
        this.e = new tu(a2oVar);
        sn3 sn3Var = new sn3(hnoVar);
        this.f = sn3Var;
        this.g = new a7d0(a6a0Var, bdlVar, wujVar, new vbk0(hnoVar), sn3Var);
        this.h = new bpn0(new uy2(this, 6));
        this.i = new ktr();
        this.j = new bpn0(new mb3(12));
        this.k = msy.a(LazyThreadSafetyMode.NONE, new bp(a2oVar, 6));
        this.l = new qen();
        this.m = new p7i();
        new bpn0(new jvg(7));
    }

    public static void g(List list, NewsEntry newsEntry, NewsEntry newsEntry2, ArrayList arrayList, PostInteract postInteract, String str) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EntryAttachment entryAttachment = (EntryAttachment) it.next();
            AttachmentStyle j = entryAttachment.j();
            if (j instanceof CompactAttachmentStyle) {
                Attachment nb = entryAttachment.nb();
                a2c0.m(nb, newsEntry, newsEntry2, postInteract, str);
                list.add(new k5i(newsEntry, newsEntry2, ((nb instanceof AudioAttachment) || (nb instanceof AudioArtistAttachment) || (nb instanceof AudioCuratorAttachment) || (nb instanceof AudioPlaylistAttachment) || (nb instanceof PodcastAttachment)) ? 194 : nb instanceof MarketAttachment ? a2c0.q((MarketAttachment) nb, true) : nb instanceof BookingAttachment ? 297 : PsExtractor.AUDIO_STREAM, nb, (CompactAttachmentStyle) j));
            }
        }
    }

    public static void i(List list, NewsEntry newsEntry, NewsEntry newsEntry2, ArrayList arrayList, boolean z, PostInteract postInteract, String str) {
        int size = arrayList.size();
        if (size != 0) {
            ol60 ol60Var = null;
            if (size != 1) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Attachment nb = ((EntryAttachment) it.next()).nb();
                    AudioAttachment audioAttachment = nb instanceof AudioAttachment ? (AudioAttachment) nb : null;
                    if (audioAttachment != null) {
                        arrayList2.add(audioAttachment);
                    }
                }
                if (arrayList2.size() < 2) {
                    return;
                }
                u880 u880Var = new u880(newsEntry, newsEntry2, 357, new OnMediaAttachmentStyle());
                AudioAttachment audioAttachment2 = (AudioAttachment) j5g.a0(arrayList2);
                if (audioAttachment2 != null) {
                    audioAttachment2.Db(str, postInteract);
                }
                u880Var.h = (ol60) j5g.Y(new bhu().k(0, new Pair(arrayList2, Boolean.valueOf(z)), null));
                list.add(u880Var);
                return;
            }
            EntryAttachment entryAttachment = (EntryAttachment) j5g.Y(arrayList);
            AttachmentStyle j = entryAttachment.j();
            OnMediaAttachmentStyle onMediaAttachmentStyle = j instanceof OnMediaAttachmentStyle ? (OnMediaAttachmentStyle) j : null;
            if (onMediaAttachmentStyle == null) {
                return;
            }
            Attachment nb2 = entryAttachment.nb();
            boolean z2 = nb2 instanceof AudioAttachment;
            Integer num = z2 ? 342 : nb2 instanceof AudioPlaylistAttachment ? 346 : null;
            if (num == null) {
                return;
            }
            if (z2) {
                ((AudioAttachment) nb2).Db(str, postInteract);
            } else if (nb2 instanceof AudioPlaylistAttachment) {
                ((AudioPlaylistAttachment) nb2).Eb(str, postInteract);
            }
            u880 u880Var2 = new u880(newsEntry, newsEntry2, num.intValue(), onMediaAttachmentStyle);
            if (z2) {
                ol60Var = (ol60) j5g.Y(new l370().G(0, new Pair(nb2, Boolean.valueOf(z)), null));
            } else if (nb2 instanceof AudioPlaylistAttachment) {
                ol60Var = (ol60) j5g.Y(new q6x().E(0, new Pair(nb2, Boolean.valueOf(z)), new db60(entryAttachment.i())));
            }
            u880Var2.h = ol60Var;
            list.add(u880Var2);
        }
    }

    public static void j(ArrayList arrayList, Post post, NewsEntry newsEntry) {
        SourcePhoto d;
        EntryHeader header = post.getHeader();
        List<Owner> e = (header == null || (d = header.d()) == null) ? null : d.e();
        if (e == null || e.size() <= 1) {
            u1c0 u1c0Var = new u1c0(post, newsEntry, 181);
            u1c0Var.h = (ol60) j5g.a0(new z6g0().a(post));
            arrayList.add(u1c0Var);
        } else {
            u1c0 u1c0Var2 = new u1c0(post, newsEntry, 330);
            u1c0Var2.h = (ol60) j5g.Y(new k9q0(19).A(post));
            arrayList.add(u1c0Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
    
        if (xsna.epx.f(r7 != null ? r7.getType() : null, "post_ads") != false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(ArrayList arrayList, NewsEntry newsEntry, NewsEntry newsEntry2, Attachment attachment, kso0 kso0Var, PostInteract postInteract, String str) {
        Object obj;
        String str2;
        String str3;
        Owner s;
        String Bb = newsEntry.Bb();
        if (Bb == null) {
            Bb = "";
        }
        if (!(attachment instanceof eso0)) {
            if ((attachment instanceof DocumentAttachment) && ((DocumentAttachment) attachment).Ib()) {
                arrayList.add(attachment);
                kso0Var.f(kso0Var.a() + 1);
                return;
            }
            return;
        }
        if (attachment instanceof VideoAttachment) {
            l490 l490Var = newsEntry2 instanceof l490 ? (l490) newsEntry2 : null;
            if (l490Var == null || (s = l490Var.s()) == null || (obj = s.getUid()) == null) {
                obj = 0;
            }
            if (obj.equals(0)) {
                str2 = null;
            } else {
                str2 = obj + '|' + Bb;
            }
            Post Jb = newsEntry instanceof Post ? (Post) newsEntry : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).Jb() : null;
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            if (videoAttachment.Jb().q0()) {
                if (str == null) {
                    str = "";
                }
                str = fz5.y(str, postInteract != null ? postInteract.b : null);
            } else if (postInteract != null && (str3 = postInteract.b) != null) {
                str = str3;
            }
            videoAttachment.Lb(str, postInteract, str2);
            if (newsEntry2 instanceof PromoPost) {
                videoAttachment.Nb((DeprecatedStatisticInterface) newsEntry2);
                videoAttachment.Jb().n8(true);
            }
            if (Jb == null || !Jb.Vb()) {
            }
            videoAttachment.Jb().n8(true);
            kso0Var.j(kso0Var.e() + 1);
        } else if ((attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) {
            if (kso0Var.b() == null) {
                kso0Var.g((PhotoAttachment) attachment);
            }
            kso0Var.h(kso0Var.c() + 1);
        }
        if (attachment instanceof VideoSnippetAttachment) {
            return;
        }
        arrayList.add(attachment);
    }

    public static boolean r(Post post, NewsEntry newsEntry) {
        if ((newsEntry instanceof PromoPost) && ((PromoPost) newsEntry).Fb(new bqt(18)) != null) {
            return false;
        }
        if (myc0.f(post.getText()) || post.ac() != null) {
            return true;
        }
        ArrayList<EntryAttachment> u = post.u();
        if (u != null && u.isEmpty()) {
            return false;
        }
        Iterator<T> it = u.iterator();
        while (it.hasNext()) {
            AttachmentStyle j = ((EntryAttachment) it.next()).j();
            if ((j instanceof ChipAttachmentStyle) && ((ChipAttachmentStyle) j).d()) {
                return true;
            }
        }
        return false;
    }

    public static ol60 s(int i, NewsEntry newsEntry, Attachment attachment, ol60 ol60Var) {
        if ((ol60Var instanceof k880) && (attachment instanceof AudioAttachment)) {
            k880 k880Var = (k880) ol60Var;
            ArrayList arrayList = new ArrayList(k880Var.j());
            MusicTrack musicTrack = ((AudioAttachment) attachment).f;
            int indexOf = arrayList.indexOf(musicTrack);
            if (indexOf != -1) {
                arrayList.set(indexOf, musicTrack);
            }
            return k880.i(k880Var, arrayList, 15358);
        }
        if ((ol60Var instanceof y880) && (attachment instanceof AudioAttachment)) {
            y880 y880Var = (y880) ol60Var;
            return (ol60) j5g.Y(new l370().G(y880Var.f(), new Pair((AudioAttachment) attachment, Boolean.valueOf(y880Var.i())), null));
        }
        if ((ol60Var instanceof t880) && (attachment instanceof AudioPlaylistAttachment)) {
            return t880.i((t880) ol60Var, ((AudioPlaylistAttachment) attachment).Db(), 7678);
        }
        if (ol60Var instanceof lad0) {
            v1c0 i2 = ((lad0) ol60Var).i();
            if ((attachment instanceof PollAttachment) && i == 293) {
                return yyp0.b((PollAttachment) attachment, i2, ol60Var);
            }
        } else {
            if (ol60Var instanceof ivj0) {
                return attachment instanceof PhotoAttachment ? ivj0.i((ivj0) ol60Var, (PhotoAttachment) attachment) : (ivj0) ol60Var;
            }
            if (ol60Var instanceof ocg0) {
                return attachment instanceof PhotoAttachment ? ocg0.i((ocg0) ol60Var, (PhotoAttachment) attachment) : (ocg0) ol60Var;
            }
            if (ol60Var instanceof jcg0) {
                return attachment instanceof PhotoAttachment ? jcg0.i((jcg0) ol60Var, (PhotoAttachment) attachment, 0, 0, 32763) : (jcg0) ol60Var;
            }
            if (attachment instanceof EventAttachment) {
                return yyp0.a(newsEntry, (EventAttachment) attachment);
            }
        }
        return null;
    }

    public static boolean t(r74 r74Var) {
        AttachmentStyle l;
        if (r74Var instanceof k5i) {
            int f = ((k5i) r74Var).f();
            return f == 342 || f == 346;
        }
        if (r74Var instanceof lsi) {
            return t(((lsi) r74Var).m());
        }
        Attachment k = r74Var.k();
        return (k instanceof PhotoAttachment) || (k instanceof VideoAttachment) || (k instanceof DocumentAttachment) || (k instanceof SnippetAttachment) || (k instanceof PrettyCardAttachment) || (l = r74Var.l()) == null || (l instanceof FullAttachmentStyle) || (l instanceof UnderMediaAttachmentStyle);
    }

    public static boolean u(u1c0 u1c0Var) {
        if ((u1c0Var instanceof a160) || (u1c0Var instanceof w84)) {
            return true;
        }
        return u1c0Var instanceof r74 ? t((r74) u1c0Var) : u1c0Var instanceof u880;
    }

    public static void v(List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EntryAttachment entryAttachment = (EntryAttachment) j5g.b0(i, list);
            if (entryAttachment != null) {
                AttachmentStyle j = entryAttachment.j();
                if (j instanceof CompactAttachmentStyle) {
                    arrayList2.add(entryAttachment);
                } else if (j instanceof OnMediaAttachmentStyle) {
                    arrayList3.add(entryAttachment);
                } else if (j instanceof UnderMediaAttachmentStyle) {
                    arrayList4.add(entryAttachment);
                } else if (!(j instanceof ChipAttachmentStyle)) {
                    arrayList.add(entryAttachment);
                } else if (!((ChipAttachmentStyle) j).d()) {
                    arrayList5.add(entryAttachment);
                }
            }
        }
    }

    public static /* synthetic */ void w(List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        v(list, arrayList, arrayList2, new ArrayList(), new ArrayList(), arrayList3);
    }

    public final void a(List<u1c0> list, NewsEntry newsEntry, NewsEntry newsEntry2, ActionButtonAttachment actionButtonAttachment) {
        r74 r74Var;
        boolean Eb = actionButtonAttachment.Eb();
        tu tuVar = this.e;
        if (Eb) {
            tuVar.getClass();
            r74Var = new r74(364, actionButtonAttachment, newsEntry, newsEntry2);
            r74Var.h = (ol60) j5g.a0(new iwn((a2o) tuVar.a).a(actionButtonAttachment));
        } else if (actionButtonAttachment.Db()) {
            tuVar.getClass();
            r74Var = new r74(349, actionButtonAttachment, newsEntry, newsEntry2);
            r74Var.h = (ol60) j5g.a0(new vus().a(0, new Pair<>(newsEntry, actionButtonAttachment), null));
        } else if (actionButtonAttachment.Fb()) {
            tuVar.getClass();
            r74Var = new r74(368, actionButtonAttachment, newsEntry, newsEntry2);
            r74Var.h = (ol60) j5g.a0(new srv0().a(0, new Pair<>(newsEntry, actionButtonAttachment), null));
        } else {
            tuVar.getClass();
            r74Var = new r74(347, actionButtonAttachment, newsEntry, newsEntry2);
            r74Var.h = (ol60) j5g.a0(new sus().a(0, new Pair<>(newsEntry, actionButtonAttachment), null));
        }
        list.add(r74Var);
    }

    public final void b(List<u1c0> list, NewsEntry newsEntry, NewsEntry newsEntry2, List<EntryAttachment> list2) {
        for (EntryAttachment entryAttachment : list2) {
            Attachment nb = entryAttachment.nb();
            if ((nb instanceof ActionButtonAttachment) && (entryAttachment.j() instanceof FullAttachmentStyle)) {
                a(list, newsEntry, newsEntry2, (ActionButtonAttachment) nb);
            }
        }
    }

    public final void c(ArrayList arrayList, NewsEntryWithAttachments newsEntryWithAttachments, NewsEntry newsEntry, String str, PostInteract postInteract, s1c0 s1c0Var) {
        if (!p6c0.f(newsEntryWithAttachments)) {
            e(arrayList, newsEntryWithAttachments.Gb(), newsEntryWithAttachments, newsEntry, str, postInteract, s1c0Var);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        w(newsEntryWithAttachments.Gb(), arrayList2, arrayList3, arrayList4);
        e(arrayList, y64.c(newsEntryWithAttachments), newsEntryWithAttachments, newsEntry, str, postInteract, s1c0Var);
        if (!y64.d(newsEntryWithAttachments).isEmpty()) {
            u1c0 u1c0Var = new u1c0(newsEntryWithAttachments, newsEntry, 78);
            u1c0Var.h = (ol60) j5g.a0(xa4.N(newsEntryWithAttachments));
            arrayList.add(u1c0Var);
        }
        h(arrayList, newsEntryWithAttachments, newsEntry, str, postInteract, s1c0Var);
        f(arrayList, newsEntryWithAttachments, newsEntry, arrayList4, postInteract, str);
    }

    public final boolean d(List list, NewsEntry newsEntry, NewsEntry newsEntry2, Attachment attachment, AttachmentStyle attachmentStyle, boolean z, PostInteract postInteract, String str, int i) {
        if (attachment instanceof AudioAttachment) {
            ((AudioAttachment) attachment).Db(str, postInteract);
            list.add(new r74(6, attachment, newsEntry, newsEntry2));
            return z;
        }
        if (attachment instanceof PendingDocumentAttachment) {
            if (!((PendingDocumentAttachment) attachment).Ib()) {
                list.add(new r74(79, attachment, newsEntry, newsEntry2));
                return z;
            }
        } else if (attachment instanceof DocumentAttachment) {
            if (!((DocumentAttachment) attachment).Ib()) {
                list.add(new r74(39, attachment, newsEntry, newsEntry2));
                return z;
            }
        } else {
            if (attachment instanceof PollAttachment) {
                list.add(new r74(40, attachment, newsEntry, newsEntry2));
                return z;
            }
            if (attachment instanceof MarketAttachment) {
                a2c0.e(list, (MarketAttachment) attachment, attachmentStyle, newsEntry, newsEntry2, i);
                return z;
            }
            if (attachment instanceof AudioPlaylistAttachment) {
                a2c0.c(list, (AudioPlaylistAttachment) attachment, newsEntry, newsEntry2, str, postInteract);
                return z;
            }
            if (attachment instanceof ArticleAttachment) {
                ArticleAttachment articleAttachment = (ArticleAttachment) attachment;
                Article Db = articleAttachment.Db();
                boolean z2 = Db.k() && Db.d();
                Article Db2 = articleAttachment.Db();
                boolean z3 = Db2.i() || Db2.j() || Db2.Q8() || !Db2.e();
                sn3 sn3Var = this.f;
                if (z2) {
                    list.add(sn3Var.a(newsEntry, newsEntry2, 344, articleAttachment));
                    return z;
                }
                if (!z3) {
                    list.add(sn3Var.b(newsEntry, newsEntry2, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, articleAttachment));
                    return z;
                }
                sn3Var.getClass();
                list.add(sn3.c(newsEntry, newsEntry2, 345, articleAttachment));
                return z;
            }
            if (attachment instanceof SnippetAttachment) {
                return a2c0.i(list, (SnippetAttachment) attachment, attachmentStyle, newsEntry, newsEntry2, i);
            }
            if (attachment instanceof VideoSnippetAttachment) {
                a2c0.k(list, (VideoSnippetAttachment) attachment, newsEntry, newsEntry2);
                return z;
            }
            if (attachment instanceof LinkAttachment) {
                a2c0.d(list, (LinkAttachment) attachment, newsEntry, newsEntry2, postInteract);
                return z;
            }
            if (attachment instanceof WikiAttachment) {
                a2c0.l(list, (WikiAttachment) attachment, newsEntry, newsEntry2);
                return z;
            }
            if (attachment instanceof NoteAttachment) {
                list.add(new r74(54, attachment, newsEntry, newsEntry2));
                return z;
            }
            if (attachment instanceof PrettyCardAttachment) {
                a2c0.h(list, (PrettyCardAttachment) attachment, newsEntry, newsEntry2, postInteract);
                return z;
            }
            if (attachment instanceof StickerAttachment) {
                a2c0.j(list, (StickerAttachment) attachment, newsEntry, newsEntry2);
                return z;
            }
            if (attachment instanceof GraffitiAttachment) {
                list.add(new r74(68, attachment, newsEntry, newsEntry2));
                return z;
            }
            if (attachment instanceof PodcastAttachment) {
                a2c0.g(list, (PodcastAttachment) attachment, newsEntry, newsEntry2);
                return z;
            }
            if (attachment instanceof NarrativeAttachment) {
                list.add(new r74(77, attachment, newsEntry, newsEntry2));
                return z;
            }
            if (attachment instanceof AudioArtistAttachment) {
                a2c0.a(list, (AudioArtistAttachment) attachment, newsEntry, newsEntry2, str);
                return z;
            }
            if (attachment instanceof AudioCuratorAttachment) {
                a2c0.b(list, (AudioCuratorAttachment) attachment, newsEntry, newsEntry2, str);
                return z;
            }
            if (attachment instanceof EventAttachment) {
                EventAttachment eventAttachment = (EventAttachment) attachment;
                r74 r74Var = new r74(81, eventAttachment, newsEntry, newsEntry2);
                r74Var.h = (ol60) j5g.a0(new zq70().L(0, new Pair(eventAttachment, newsEntry), null));
                list.add(r74Var);
                return z;
            }
            if (attachment instanceof MiniAppAttachment) {
                MiniAppAttachment miniAppAttachment = (MiniAppAttachment) attachment;
                list.add(new r74(352, miniAppAttachment, newsEntry, newsEntry2));
                r74 r74Var2 = new r74(351, miniAppAttachment, newsEntry, newsEntry2);
                r74Var2.h = (ol60) j5g.a0(lq20.a(miniAppAttachment));
                list.add(r74Var2);
                return z;
            }
            if (attachment instanceof DonutLinkAttachment) {
                list.add(new r74(148, attachment, newsEntry, newsEntry2));
                return z;
            }
            if (attachment instanceof SituationalThemeAttachment) {
                SituationalThemeAttachment situationalThemeAttachment = (SituationalThemeAttachment) attachment;
                list.add(new r74(situationalThemeAttachment.Db() ? 150 : 149, situationalThemeAttachment, newsEntry, newsEntry2));
                return z;
            }
            if (attachment instanceof BookingAttachment) {
                list.add(new r74(297, attachment, newsEntry, newsEntry2));
                return z;
            }
            if (attachment instanceof MarketLinkAttachment) {
                a2c0.f(list, (MarketLinkAttachment) attachment, newsEntry, newsEntry2);
                return z;
            }
            if (attachment instanceof MarketMessageOwnerAttachment) {
                list.add(new r74(PsExtractor.AUDIO_STREAM, attachment, newsEntry, newsEntry2));
            }
        }
        return z;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void e(java.util.List r28, java.util.List r29, com.vk.feed.core.models.news.NewsEntry r30, com.vk.feed.core.models.news.NewsEntry r31, java.lang.String r32, com.vkontakte.android.data.PostInteract r33, xsna.s1c0 r34) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.i2c0.e(java.util.List, java.util.List, com.vk.feed.core.models.news.NewsEntry, com.vk.feed.core.models.news.NewsEntry, java.lang.String, com.vkontakte.android.data.PostInteract, xsna.s1c0):void");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(List list, NewsEntry newsEntry, NewsEntry newsEntry2, ArrayList arrayList, PostInteract postInteract, String str) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EntryAttachment entryAttachment = (EntryAttachment) it.next();
            AttachmentStyle j = entryAttachment.j();
            if ((j instanceof ChipAttachmentStyle) && !((ChipAttachmentStyle) j).d()) {
                Attachment nb = entryAttachment.nb();
                a2c0.m(nb, newsEntry, newsEntry2, postInteract, str);
                if (nb instanceof PollAttachment) {
                    PollAttachment pollAttachment = (PollAttachment) nb;
                    r74 r74Var = new r74(343, pollAttachment, newsEntry, newsEntry2);
                    r74Var.h = (ol60) j5g.a0(new sua().A(0, new Triple(newsEntry, newsEntry2, pollAttachment)));
                    list.add(r74Var);
                } else if (nb instanceof ActionButtonAttachment) {
                    list.add(((fac) this.k.getValue()).a(newsEntry, newsEntry2, (ActionButtonAttachment) nb));
                }
            }
        }
    }

    public final void h(ArrayList arrayList, NewsEntryWithAttachments newsEntryWithAttachments, NewsEntry newsEntry, String str, PostInteract postInteract, s1c0 s1c0Var) {
        if (newsEntryWithAttachments.Hb().zb() >= 0) {
            EntryAttachment entryAttachment = (EntryAttachment) j5g.k0(newsEntryWithAttachments.Gb());
            Attachment nb = entryAttachment != null ? entryAttachment.nb() : null;
            if ((nb instanceof GeoAttachment ? (GeoAttachment) nb : null) != null) {
                e(arrayList, Collections.singletonList(entryAttachment), newsEntryWithAttachments, newsEntry, str, postInteract, s1c0Var);
            }
        }
    }

    public final void k(ArrayList arrayList, u1c0 u1c0Var, u1c0 u1c0Var2, Post post, NewsEntry newsEntry, String str, PostInteract postInteract, s1c0 s1c0Var) {
        ArrayList arrayList2 = new ArrayList();
        if (!post.u().isEmpty() && post.Yb() == null) {
            boolean b = s1c0Var.b();
            if (!b && post.Hb().Ab() && post.Hb().Bb()) {
                c(arrayList2, post, newsEntry, str, postInteract, s1c0Var);
            } else if (!s1c0Var.e() || b || !post.Hb().Ab() || post.Hb().Bb()) {
                e(arrayList2, post.Gb(), post, newsEntry, str, postInteract, s1c0Var);
                s3q0 s3q0Var = s3q0.a;
            } else if (p6c0.f(post)) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                w(post.Gb(), arrayList3, arrayList4, arrayList5);
                List c = y64.c(post);
                List d = y64.d(post);
                e(arrayList2, c, post, newsEntry, str, postInteract, s1c0Var);
                h(arrayList2, post, newsEntry, str, postInteract, s1c0Var);
                f(arrayList2, post, newsEntry, arrayList5, postInteract, str);
                if (!d.isEmpty()) {
                    e(arrayList2, d, post, newsEntry, str, postInteract, s1c0Var);
                }
            } else {
                e(arrayList2, post.Gb(), post, newsEntry, str, postInteract, s1c0Var);
            }
        }
        if ((u1c0Var instanceof iko0) && !arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (u((u1c0) it.next())) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (u((u1c0) next)) {
                            arrayList6.add(next);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (!u((u1c0) next2)) {
                            arrayList7.add(next2);
                        }
                    }
                    arrayList.addAll(arrayList6);
                    if (u1c0Var != null) {
                        ol60 ol60Var = u1c0Var.h;
                        dio0 dio0Var = ol60Var instanceof dio0 ? (dio0) ol60Var : null;
                        if (dio0Var != null) {
                            u1c0Var.h = dio0.i(dio0Var, null, (int) (cn70.a() * 4.0f), (int) (cn70.a() * 8.0f), 16764927);
                        }
                    }
                    if (u1c0Var != null) {
                        arrayList.add(u1c0Var);
                    }
                    if (u1c0Var2 != null) {
                        arrayList.add(u1c0Var2);
                    }
                    arrayList.addAll(arrayList7);
                    return;
                }
            }
        }
        if (u1c0Var != null) {
            arrayList.add(u1c0Var);
        }
        if (u1c0Var2 != null) {
            arrayList.add(u1c0Var2);
        }
        arrayList.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080  */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(List<u1c0> list, s1c0 s1c0Var, e84 e84Var, List<EntryAttachment> list2) {
        kqm0 kqm0Var;
        int i;
        s1c0 s1c0Var2;
        ArrayList arrayList = (ArrayList) e84Var.c();
        if (arrayList.size() > 1) {
            ((lfu) this.j.getValue()).getClass();
            list.add(lfu.a(e84Var));
            return;
        }
        if (arrayList.size() == 1) {
            NewsEntry a2 = e84Var.a();
            NewsEntry b = e84Var.b();
            Attachment attachment = (Attachment) j5g.Y(e84Var.c());
            attachment.Cb();
            r74 r74Var = null;
            if (!s1c0Var.b() && b.zb() == 1 && (attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) {
                String str = ((PhotoAttachment) attachment).m;
                if (!TextUtils.isEmpty(str)) {
                    kqm0Var = new kqm0(a2, b, str);
                    qen qenVar = this.l;
                    qenVar.getClass();
                    if (!(attachment instanceof AlbumAttachment)) {
                        i = ((AlbumAttachment) attachment).l.Ib() ? 111 : 52;
                    } else if (attachment instanceof PhotoAttachment) {
                        Photo photo = ((PhotoAttachment) attachment).l;
                        if (photo.Hb()) {
                            i = 110;
                        } else {
                            if (photo.Ib()) {
                                i = 109;
                            }
                            i = 50;
                        }
                    } else {
                        if (!(attachment instanceof PendingPhotoAttachment)) {
                            if (attachment instanceof VideoAttachment) {
                                i = qen.a((VideoAttachment) attachment, a2, s1c0Var, ((Boolean) qenVar.a.getValue()).booleanValue() && s1c0Var.g());
                            } else if (attachment instanceof MarketAlbumAttachment) {
                                i = 53;
                            } else if (attachment instanceof DocumentAttachment) {
                                DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
                                i = (documentAttachment.x5() && documentAttachment.V0()) ? 7 : 11;
                            } else {
                                i = -1;
                            }
                        }
                        i = 50;
                    }
                    if (i == -1) {
                        s1c0Var2 = s1c0Var;
                        r74Var = p(this.i.b(a2, b, attachment, i, list2, s1c0Var2), s1c0Var2);
                    } else {
                        s1c0Var2 = s1c0Var;
                    }
                    if (r74Var != null) {
                        list.add(r74Var);
                    }
                    if (kqm0Var != null) {
                        list.add(new p890(a2, b, cn70.b(4)));
                        list.add(kqm0Var);
                    }
                    if (s1c0Var2.b() || !(attachment instanceof PhotoAttachment)) {
                    }
                    String str2 = ((PhotoAttachment) attachment).m;
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    if (a2 instanceof Post) {
                        if (epx.f(str2, ((Post) a2).getText())) {
                            return;
                        }
                        list.add(new kqm0(a2, b, str2));
                        return;
                    } else if (!(a2 instanceof PromoPost)) {
                        list.add(new kqm0(a2, b, str2));
                        return;
                    } else {
                        if (epx.f(str2, ((PromoPost) a2).Jb().getText())) {
                            return;
                        }
                        list.add(new kqm0(a2, b, str2));
                        return;
                    }
                }
            }
            kqm0Var = null;
            qen qenVar2 = this.l;
            qenVar2.getClass();
            if (!(attachment instanceof AlbumAttachment)) {
            }
            if (i == -1) {
            }
            if (r74Var != null) {
            }
            if (kqm0Var != null) {
            }
            if (s1c0Var2.b()) {
            }
        }
    }

    public final void n(List list, NewsEntry newsEntry, NewsEntry newsEntry2, ArrayList arrayList, PostInteract postInteract, String str) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EntryAttachment entryAttachment = (EntryAttachment) it.next();
            if (entryAttachment.j() instanceof UnderMediaAttachmentStyle) {
                Attachment nb = entryAttachment.nb();
                a2c0.m(nb, newsEntry, newsEntry2, postInteract, str);
                if (nb instanceof MiniAppAttachment) {
                    MiniAppAttachment miniAppAttachment = (MiniAppAttachment) nb;
                    r74 r74Var = new r74(351, miniAppAttachment, newsEntry, newsEntry2);
                    r74Var.h = (ol60) j5g.a0(lq20.a(miniAppAttachment));
                    list.add(r74Var);
                } else if (nb instanceof SituationalThemeAttachment) {
                    SituationalThemeAttachment situationalThemeAttachment = (SituationalThemeAttachment) nb;
                    r74 r74Var2 = new r74(351, situationalThemeAttachment, newsEntry, newsEntry2);
                    r74Var2.h = (ol60) j5g.a0(exj0.a(situationalThemeAttachment));
                    list.add(r74Var2);
                } else if (nb instanceof ActionButtonAttachment) {
                    a(list, newsEntry, newsEntry2, (ActionButtonAttachment) nb);
                } else if (nb instanceof DonutLinkAttachment) {
                    DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) nb;
                    r74 r74Var3 = new r74(351, donutLinkAttachment, newsEntry, newsEntry2);
                    r74Var3.h = (ol60) j5g.a0(q0o.a(donutLinkAttachment));
                    list.add(r74Var3);
                } else if (nb instanceof LinkAttachment) {
                    LinkAttachment linkAttachment = (LinkAttachment) nb;
                    r74 r74Var4 = new r74(351, linkAttachment, newsEntry, newsEntry2);
                    r74Var4.h = (ol60) j5g.a0(new cbz().a(0, new Pair<>(newsEntry2, linkAttachment), null));
                    list.add(r74Var4);
                } else if (nb instanceof BookingAttachment) {
                    BookingAttachment bookingAttachment = (BookingAttachment) nb;
                    r74 r74Var5 = new r74(351, bookingAttachment, newsEntry, newsEntry2);
                    r74Var5.h = (ol60) j5g.a0(f08.a(bookingAttachment));
                    list.add(r74Var5);
                } else if (nb instanceof MarketMessageOwnerAttachment) {
                    MarketMessageOwnerAttachment marketMessageOwnerAttachment = (MarketMessageOwnerAttachment) nb;
                    r74 r74Var6 = new r74(351, marketMessageOwnerAttachment, newsEntry, newsEntry2);
                    r74Var6.h = (ol60) j5g.a0(x710.a(marketMessageOwnerAttachment));
                    list.add(r74Var6);
                } else if (nb instanceof MarketLinkAttachment) {
                    MarketLinkAttachment marketLinkAttachment = (MarketLinkAttachment) nb;
                    r74 r74Var7 = new r74(351, marketLinkAttachment, newsEntry, newsEntry2);
                    r74Var7.h = (ol60) j5g.a0(p610.a(marketLinkAttachment));
                    list.add(r74Var7);
                }
            }
        }
    }

    public final ArrayList<u1c0> o(List<? extends Attachment> list, NewsEntry newsEntry, NewsEntry newsEntry2, String str, PostInteract postInteract, s1c0 s1c0Var) {
        ArrayList arrayList;
        ArrayList<u1c0> arrayList2;
        Attachment attachment;
        Attachment attachment2;
        i2c0 i2c0Var = this;
        List<? extends Attachment> list2 = list;
        ArrayList<u1c0> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        kso0 kso0Var = new kso0(0, 0, 0, null, null, 63);
        boolean z = false;
        int size = list2 != null ? list2.size() : 0;
        for (int i = 0; i < size; i++) {
            if (list2 != null && (attachment2 = (Attachment) j5g.b0(i, list2)) != null) {
                ArrayList arrayList5 = arrayList4;
                m(arrayList5, newsEntry, newsEntry2, attachment2, kso0Var, postInteract, str);
                arrayList4 = arrayList5;
            }
        }
        NewsEntryWithAttachments newsEntryWithAttachments = newsEntry instanceof NewsEntryWithAttachments ? (NewsEntryWithAttachments) newsEntry : null;
        NewsEntryWithAttachments.Cut Hb = newsEntryWithAttachments != null ? newsEntryWithAttachments.Hb() : null;
        boolean z2 = Hb != null && Hb.Ab();
        if (!z2 && !arrayList4.isEmpty()) {
            i2c0Var.l(arrayList3, s1c0Var, new e84(newsEntry, newsEntry2, arrayList4, s1c0Var.d(), str), EmptyList.b);
            kso0Var.i();
        }
        int i2 = 0;
        while (i2 < size) {
            if (list2 != null && (attachment = (Attachment) j5g.b0(i2, list2)) != null) {
                if (z2 && !kso0Var.d() && arrayList4.contains(attachment)) {
                    i2c0Var.l(arrayList3, s1c0Var, new e84((NewsEntryWithAttachments) newsEntry, newsEntry2, arrayList4, s1c0Var.d(), str), EmptyList.b);
                    kso0Var.i();
                } else {
                    boolean z3 = z;
                    int size2 = list2.size();
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    z = i2c0Var.d(arrayList2, newsEntry, newsEntry2, attachment, null, z3, postInteract, str, size2);
                    i2++;
                    i2c0Var = this;
                    arrayList3 = arrayList2;
                    arrayList4 = arrayList;
                    list2 = list;
                }
            }
            arrayList = arrayList4;
            arrayList2 = arrayList3;
            z = z;
            i2++;
            i2c0Var = this;
            arrayList3 = arrayList2;
            arrayList4 = arrayList;
            list2 = list;
        }
        ArrayList<u1c0> arrayList6 = arrayList3;
        a2c0.p(arrayList4, newsEntry, kso0Var);
        return arrayList6;
    }

    public final r74 p(r74 r74Var, s1c0 s1c0Var) {
        int f = r74Var.f();
        if (f != 303 && f != 336) {
            return r74Var;
        }
        owu owuVar = this.b;
        NewsEntry newsEntry = r74Var.b;
        return new lsi(r74Var, owuVar.b(newsEntry, newsEntry, s1c0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(Post post, NewsEntry newsEntry, PostInteract postInteract, String str, ArrayList arrayList, s1c0 s1c0Var) {
        u1c0 a2;
        NewsEntry newsEntry2;
        u1c0 u1c0Var;
        u1c0 u1c0Var2;
        Post post2;
        Post Zb;
        Post post3;
        Post post4;
        NewsEntry newsEntry3;
        int i;
        iko0 iko0Var;
        ArrayList<EntryAttachment> u;
        Post post5 = post;
        NewsEntry newsEntry4 = newsEntry;
        ej90 Wb = post5.Wb();
        if (Wb != null) {
            yiz.k(Wb, postInteract);
        }
        if (post5.Rb().zb(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) && !"kz".equals(ply.a())) {
            arrayList.add(new u1c0(post5, newsEntry4, 38));
        }
        BadgeItem Ob = post5.Ob();
        ydo0 ydo0Var = this.c;
        if (Ob != null) {
            DonutBadgeInfo Qb = post5.Qb();
            if (Qb != null) {
                if (drm0.N(Qb.d())) {
                    u1c0 u1c0Var3 = new u1c0(post5, newsEntry4, 394);
                    ol60 ol60Var = (ol60) j5g.a0(new m200().E(Qb));
                    if (ol60Var != null) {
                        u1c0Var3.h = ol60Var;
                    }
                    arrayList.add(u1c0Var3);
                } else {
                    u1c0 u1c0Var4 = new u1c0(post5, newsEntry4, 395);
                    ol60 ol60Var2 = (ol60) j5g.a0(new qv20().o(Qb));
                    if (ol60Var2 != null) {
                        u1c0Var4.h = ol60Var2;
                    }
                    arrayList.add(u1c0Var4);
                }
            }
        } else if (r(post, newsEntry)) {
            ydo0Var.getClass();
            if ("topic".equals(post5.getType())) {
                a2 = new u1c0(post5, newsEntry4, 69);
            } else if (post5.Yb() == null) {
                newsEntry4 = newsEntry;
                post5 = post;
                a2 = ydo0.a(post5, newsEntry4, new v1c0(post, newsEntry4, str, postInteract != null ? postInteract.b : null, postInteract, !s1c0Var.b()), false, s1c0Var.f(), postInteract);
            }
            if (post5.Rb().zb(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) || !"kz".equals(ply.a())) {
                newsEntry2 = newsEntry4;
                u1c0Var = a2;
                u1c0Var2 = null;
            } else {
                u1c0 u1c0Var5 = new u1c0(post5, newsEntry4, 38);
                newsEntry2 = newsEntry4;
                u1c0Var = a2;
                u1c0Var2 = u1c0Var5;
            }
            post2 = post5;
            k(arrayList, u1c0Var, u1c0Var2, post2, newsEntry2, str, postInteract, s1c0Var);
            NewsEntry newsEntry5 = newsEntry2;
            if (post2.Yb() != null) {
                arrayList.add(new u1c0(post2, newsEntry5, 75));
            }
            Zb = post2.Zb();
            if (Zb != null) {
                return;
            }
            ej90 Wb2 = Zb.Wb();
            if (Wb2 != null) {
                yiz.k(Wb2, postInteract);
            }
            if (s1c0Var.c() && ((u = post2.u()) == null || !u.isEmpty())) {
                Iterator<T> it = u.iterator();
                while (it.hasNext()) {
                    if (((EntryAttachment) it.next()).j() instanceof FullAttachmentStyle) {
                        this.d.getClass();
                        arrayList.add(new u1c0(Zb, newsEntry5, 97));
                        return;
                    }
                }
            }
            j(arrayList, Zb, newsEntry5);
            if (di60.z(Zb)) {
                u1c0 u1c0Var6 = new u1c0(356, Zb);
                u1c0Var6.h = (ol60) j5g.Y(new bis().x(Zb, null));
                arrayList.add(u1c0Var6);
            }
            if (Zb.Rb().zb(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) && !"kz".equals(ply.a())) {
                arrayList.add(new u1c0(post2, newsEntry5, 38));
            }
            boolean z = Zb.Yb() != null;
            if (z || !r(Zb, newsEntry5)) {
                post3 = Zb;
                post4 = post2;
                newsEntry3 = newsEntry5;
                i = 75;
                iko0Var = null;
            } else {
                post3 = Zb;
                i = 75;
                v1c0 v1c0Var = new v1c0(post2, newsEntry5, str, postInteract != null ? postInteract.b : null, postInteract, !s1c0Var.b());
                post4 = post2;
                boolean f = s1c0Var.f();
                ydo0Var.getClass();
                iko0Var = ydo0.a(post3, newsEntry, v1c0Var, true, f, postInteract);
                newsEntry3 = newsEntry;
            }
            Post post6 = post3;
            k(arrayList, iko0Var, (post3.Rb().zb(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) && "kz".equals(ply.a())) ? new u1c0(post4, newsEntry3, 38) : null, post6, newsEntry3, str, postInteract, s1c0Var);
            NewsEntry newsEntry6 = newsEntry3;
            if (z) {
                arrayList.add(new u1c0(post6, newsEntry6, i));
            }
            Post Zb2 = post6.Zb();
            if (Zb2 != null) {
                j(arrayList, Zb2, newsEntry6);
                return;
            }
            return;
        }
        a2 = null;
        if (post5.Rb().zb(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
        }
        newsEntry2 = newsEntry4;
        u1c0Var = a2;
        u1c0Var2 = null;
        post2 = post5;
        k(arrayList, u1c0Var, u1c0Var2, post2, newsEntry2, str, postInteract, s1c0Var);
        NewsEntry newsEntry52 = newsEntry2;
        if (post2.Yb() != null) {
        }
        Zb = post2.Zb();
        if (Zb != null) {
        }
    }
}
