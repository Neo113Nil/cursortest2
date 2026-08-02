package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ca60;
import xsna.da60;
import xsna.qn60;
import xsna.svh0;

/* compiled from: UpdateAttachmentEditorAction.kt */
/* loaded from: classes4.dex */
public final class t7q0 implements qn60.b {
    public final pn60 a;
    public final Attachment b;

    /* compiled from: UpdateAttachmentEditorAction.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<NewsEntry, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(NewsEntry newsEntry) {
            t7q0 t7q0Var = (t7q0) this.receiver;
            List<? extends ol60> c = pn60.c(t7q0Var.a, newsEntry, null, null, 14);
            for (ol60 ol60Var : c) {
                Attachment attachment = t7q0Var.b;
                z1c0 z1c0Var = ol60Var instanceof z1c0 ? (z1c0) ol60Var : null;
                u1c0 u1c0Var = z1c0Var != null ? z1c0Var.h : null;
                ol60 ol60Var2 = u1c0Var != null ? u1c0Var.h : null;
                if ((ol60Var2 instanceof k880) && (attachment instanceof AudioAttachment)) {
                    k880 k880Var = (k880) ol60Var2;
                    if (k880Var.h.contains(((AudioAttachment) attachment).f)) {
                        u1c0Var.h = k880.i(k880Var, null, 15359);
                    }
                }
                if ((ol60Var2 instanceof t880) && (attachment instanceof AudioPlaylistAttachment)) {
                    t880 t880Var = (t880) ol60Var2;
                    if (epx.f(t880Var.h, ((AudioPlaylistAttachment) attachment).f)) {
                        u1c0Var.h = t880.i(t880Var, null, 7679);
                    }
                }
            }
            return c;
        }
    }

    public t7q0(Attachment attachment, pn60 pn60Var) {
        this.a = pn60Var;
        if (attachment instanceof VideoSnippetAttachment) {
            VideoSnippetAttachment videoSnippetAttachment = (VideoSnippetAttachment) attachment;
            attachment = videoSnippetAttachment.Pb(videoSnippetAttachment.k);
        } else if (attachment instanceof VideoAttachment) {
            attachment = new VideoAttachment(((VideoAttachment) attachment).k);
        }
        this.b = attachment;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Post post;
        int Jb;
        int T2;
        int Jb2;
        fsx0 fsx0Var;
        int T22;
        NewsEntryWithAttachments newsEntryWithAttachments;
        int Jb3;
        Attachment attachment = this.b;
        ArrayList o = e43.o(new ca60.a(attachment));
        if (attachment instanceof AudioAttachment) {
            o.add(new da60.a((AudioAttachment) attachment));
        }
        svh0.a[] aVarArr = (svh0.a[]) o.toArray(new svh0.a[0]);
        svh0.a[] aVarArr2 = (svh0.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        HashSet<Parcelable> hashSet = new HashSet();
        for (svh0.a aVar2 : aVarArr2) {
            HashSet c = aVar.c(aVar2);
            if (c != null) {
                hashSet.addAll(c);
            }
        }
        if (hashSet.isEmpty()) {
            hashSet = null;
        }
        if (hashSet == null) {
            return;
        }
        for (Parcelable parcelable : hashSet) {
            if ((parcelable instanceof NewsEntryWithAttachments) && (Jb3 = (newsEntryWithAttachments = (NewsEntryWithAttachments) parcelable).Jb(attachment)) >= 0) {
                newsEntryWithAttachments.Gb().get(Jb3).b = attachment;
            }
            if ((parcelable instanceof fsx0) && (T22 = (fsx0Var = (fsx0) parcelable).T2(attachment)) >= 0) {
                fsx0Var.V5(T22, attachment);
            }
            if (parcelable instanceof Post) {
                Post post2 = (Post) parcelable;
                Post post3 = post2.D;
                if (post3 != null && (Jb2 = post3.Jb(attachment)) >= 0) {
                    post3.Gb().get(Jb2).b = attachment;
                }
                Post post4 = post2.D;
                if (post4 != null && (T2 = post4.T2(attachment)) >= 0) {
                    post4.V5(T2, attachment);
                }
            }
            if ((parcelable instanceof PromoPost) && (post = ((PromoPost) parcelable).n) != null && (Jb = post.Jb(attachment)) >= 0) {
                post.Gb().get(Jb).b = attachment;
            }
        }
        aVar.f(hashSet, new a(1, this, t7q0.class, "transform", "transform(Lcom/vk/feed/core/models/news/NewsEntry;)Ljava/util/List;", 0));
    }
}
