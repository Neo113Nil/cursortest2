package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.SharingDataType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PostAttachment;
import com.vkontakte.android.attachments.StoryAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.bbj0;
import xsna.c70;

/* compiled from: CommonShareDelegate.kt */
/* loaded from: classes7.dex */
public final class kmg {
    public static bbj0.a a(Context context, Object obj, String str, Peer peer) {
        peer.getClass();
        boolean z = !peer.Ab(Peer.Type.GROUP);
        if (obj instanceof ArticleAttachment) {
            bbj0.a.getClass();
            tbj0 a = bbj0.b.d.a(context);
            a.k = null;
            ArticleAttachment articleAttachment = (ArticleAttachment) obj;
            Article article = articleAttachment.f;
            a.i = article;
            a.c = z74.b.c(article);
            a.d = c70.a.c(articleAttachment.f);
            a.h = Integer.valueOf(SharingDataType.ARTICLE.ordinal());
            return a;
        }
        if (obj instanceof VideoAttachment) {
            bbj0.a.getClass();
            tbj0 a2 = bbj0.b.d.a(context);
            a2.k = null;
            VideoAttachment videoAttachment = (VideoAttachment) obj;
            a2.c = z74.b.f(videoAttachment.k, null);
            a2.d = c70.a.g(videoAttachment.k, z);
            a2.n = true;
            return a2;
        }
        if (obj instanceof PollAttachment) {
            bbj0.a.getClass();
            tbj0 a3 = bbj0.b.d.a(context);
            a3.k = null;
            a3.c = z74.b.e(((PollAttachment) obj).f);
            a3.d = c70.a.h();
            return a3;
        }
        if (obj instanceof PendingDocumentAttachment) {
            bbj0.a.getClass();
            tbj0 a4 = bbj0.b.d.a(context);
            a4.k = null;
            PendingDocumentAttachment pendingDocumentAttachment = (PendingDocumentAttachment) obj;
            a4.c = z74.a(pendingDocumentAttachment.Jb(), true);
            pendingDocumentAttachment.Jb();
            k70 k70Var = c70.a;
            c70.b bVar = new c70.b();
            bVar.b = false;
            bVar.c = false;
            bVar.k(false);
            a4.d = bVar.b();
            a4.h = Integer.valueOf(SharingDataType.DOCUMENT.ordinal());
            return a4;
        }
        if (obj instanceof DocumentAttachment) {
            bbj0.a.getClass();
            tbj0 a5 = bbj0.b.d.a(context);
            a5.k = null;
            DocumentAttachment documentAttachment = (DocumentAttachment) obj;
            a5.c = z74.a(documentAttachment.Jb(), false);
            documentAttachment.Jb();
            k70 k70Var2 = c70.a;
            c70.b bVar2 = new c70.b();
            bVar2.b = false;
            bVar2.c = false;
            bVar2.k(false);
            a5.d = bVar2.b();
            a5.h = Integer.valueOf(SharingDataType.DOCUMENT.ordinal());
            return a5;
        }
        if (obj instanceof StoryAttachment) {
            bbj0.a.getClass();
            tbj0 a6 = bbj0.b.d.a(context);
            a6.k = null;
            StoryAttachment storyAttachment = (StoryAttachment) obj;
            gu50 gu50Var = z74.a;
            StoryEntry storyEntry = storyAttachment.f;
            UserId userId = storyEntry.d;
            long j = storyEntry.c;
            String str2 = storyEntry.o;
            z74.b.getClass();
            AttachmentInfo.b j2 = s84.j(26, storyAttachment, userId, j, str2);
            Bundle bundle = j2.e;
            bundle.putString("authorName", "");
            bundle.putString("authorPhotoUrl", "");
            a6.c = j2.a();
            StoryEntry storyEntry2 = storyAttachment.f;
            k70 k70Var3 = c70.a;
            boolean z2 = com.vk.toggle.d.r().d;
            c70.b bVar3 = new c70.b();
            bVar3.k(storyEntry2.q && storyEntry2.D);
            bVar3.b = false;
            bVar3.c = false;
            bVar3.c(z2);
            a6.d = bVar3.b();
            return a6;
        }
        if (obj instanceof NarrativeAttachment) {
            bbj0.a.getClass();
            tbj0 a7 = bbj0.b.d.a(context);
            a7.k = null;
            Narrative narrative = ((NarrativeAttachment) obj).f;
            if (z74.a == null) {
                synchronized (z74.class) {
                    if (z74.a == null) {
                        z74.a = ((NarrativeComponent) j6i.b(m7m.f(new y74()), NarrativeComponent.class)).V7();
                    }
                }
            }
            NarrativeAttachment narrativeAttachment = new NarrativeAttachment(narrative);
            UserId userId2 = narrative.c;
            long j3 = narrative.b;
            z74.b.getClass();
            AttachmentInfo.b j4 = s84.j(15, narrativeAttachment, userId2, j3, null);
            j4.e.putString("link", z74.a.c(narrative));
            a7.c = j4.a();
            k70 k70Var4 = c70.a;
            c70.b bVar4 = new c70.b();
            bVar4.b = false;
            bVar4.c = false;
            a7.d = bVar4.b();
            a7.h = Integer.valueOf(SharingDataType.NARRATIVE.ordinal());
            return a7;
        }
        if (obj instanceof AudioAttachment) {
            bbj0.a.getClass();
            tbj0 a8 = bbj0.b.d.a(context);
            a8.k = null;
            AudioAttachment audioAttachment = (AudioAttachment) obj;
            a8.c = z74.g(audioAttachment.f);
            a8.d = c70.e(audioAttachment.f, Boolean.valueOf(z), Boolean.valueOf(z));
            return a8;
        }
        if (obj instanceof AudioPlaylistAttachment) {
            bbj0.a.getClass();
            tbj0 a9 = bbj0.b.d.a(context);
            a9.k = null;
            a9.c = z74.h(((AudioPlaylistAttachment) obj).f);
            a9.d = c70.a();
            return a9;
        }
        if (obj instanceof AudioArtistAttachment) {
            bbj0.a.getClass();
            tbj0 a10 = bbj0.b.d.a(context);
            a10.k = null;
            a10.c = z74.e(((AudioArtistAttachment) obj).f);
            a10.d = c70.g();
            a10.h = Integer.valueOf(SharingDataType.ARTIST.ordinal());
            return a10;
        }
        if (obj instanceof PhotoAttachment) {
            bbj0.a.getClass();
            tbj0 a11 = bbj0.b.d.a(context);
            a11.k = null;
            PhotoAttachment photoAttachment = (PhotoAttachment) obj;
            a11.c = z74.b.g(photoAttachment.l, str);
            a11.d = c70.a.e(photoAttachment.l, z);
            return a11;
        }
        if (obj instanceof LinkAttachment) {
            bbj0.a.getClass();
            tbj0 a12 = bbj0.b.d.a(context);
            a12.k = null;
            Bundle bundle2 = new Bundle();
            LinkAttachment linkAttachment = (LinkAttachment) obj;
            bundle2.putParcelable("attachments", new LinkAttachment(linkAttachment.f.b));
            bundle2.putString("link", linkAttachment.f.b);
            a12.c = new AttachmentInfo(11, 0L, 0L, null, bundle2);
            a12.d = c70.i(peer, linkAttachment.f.b);
            return a12;
        }
        if (obj instanceof MiniAppAttachment) {
            bbj0.a.getClass();
            tbj0 a13 = bbj0.b.d.a(context);
            a13.k = null;
            MiniAppAttachment miniAppAttachment = (MiniAppAttachment) obj;
            a13.c = z74.d(miniAppAttachment.f, miniAppAttachment.Db(), null);
            a13.d = c70.d(miniAppAttachment.f, null, miniAppAttachment.Db(), null);
            a13.h = Integer.valueOf(SharingDataType.MINI_APP.ordinal());
            return a13;
        }
        if (!(obj instanceof PostAttachment)) {
            return null;
        }
        bbj0.a.getClass();
        tbj0 a14 = bbj0.b.d.a(context);
        a14.k = null;
        PostAttachment postAttachment = (PostAttachment) obj;
        gu50 gu50Var2 = z74.a;
        UserId userId3 = postAttachment.f;
        long j5 = postAttachment.g;
        z74.b.getClass();
        a14.c = s84.j(31, postAttachment, userId3, j5, null).a();
        c70.b bVar5 = new c70.b();
        bVar5.l(true);
        bVar5.j(true);
        bVar5.k(true);
        a14.d = bVar5.b();
        return a14;
    }

    public static void b(Context context, Object obj, boolean z, String str, boolean z2, Peer peer, int i) {
        um6 um6Var = null;
        if ((i & 8) != 0) {
            str = null;
        }
        String str2 = (i & 32) != 0 ? null : "MESSAGE_REPOST";
        if ((i & 64) != 0) {
            z2 = false;
        }
        if (!(obj instanceof Attachment)) {
            enj.q(R.string.share_unsupported, 0, context);
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(cqi.c(obj, "Unknown attach ")));
            return;
        }
        bbj0.a a = a(context, obj, str, peer);
        if (a != null) {
            um6Var = (um6) a;
            um6Var.m = z2;
            um6Var.u = peer;
            um6Var.t = str2;
        }
        if (um6Var != null) {
            um6Var.l = z;
            um6Var.c();
        } else {
            enj.q(R.string.share_unsupported, 0, context);
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(cqi.c(obj, "Unknown attach ")));
        }
    }

    public static void c(u90 u90Var, int i, Attachment attachment, boolean z) {
        Context B = u90Var.B();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        um6 um6Var = null;
        bbj0.a a = a(B, attachment, null, Peer.Unknown.e);
        if (a != null) {
            um6Var = (um6) a;
            um6Var.m = z;
        }
        if (um6Var != null) {
            um6Var.h(u90Var, i);
            return;
        }
        enj.q(R.string.share_unsupported, 0, u90Var.B());
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Unknown attach " + attachment));
    }
}
