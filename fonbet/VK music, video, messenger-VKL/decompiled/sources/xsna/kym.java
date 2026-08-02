package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: DigestListItemPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class kym extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 2;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        ImageSize Fb;
        NewsEntry newsEntry = u1c0Var.a;
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        if (post != null) {
            if (i == 0) {
                return post.o.f(iah0.a(24.0f));
            }
            if (i == 1) {
                Attachment Ib = post.Ib();
                if (Ib instanceof PhotoAttachment) {
                    ImageSize Cb = ((PhotoAttachment) Ib).l.y.Cb(iah0.a(48.0f), true, false);
                    if (Cb != null) {
                        return Cb.d.d;
                    }
                } else if (Ib instanceof VideoAttachment) {
                    ImageSize Cb2 = ((VideoAttachment) Ib).k.getImage().Cb(iah0.a(48.0f), true, false);
                    if (Cb2 != null) {
                        return Cb2.d.d;
                    }
                } else if (Ib instanceof SnippetAttachment) {
                    Photo photo = ((SnippetAttachment) Ib).p;
                    if (photo != null && (Fb = photo.Fb(iah0.a(48.0f), false)) != null) {
                        return Fb.d.d;
                    }
                } else if (Ib instanceof ArticleAttachment) {
                    return ((ArticleAttachment) Ib).f.f(iah0.a(48.0f));
                }
            }
        }
        return null;
    }
}
