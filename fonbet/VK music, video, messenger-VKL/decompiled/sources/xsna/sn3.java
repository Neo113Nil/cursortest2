package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import kotlin.Pair;

/* compiled from: ArticleDisplayItemsFactory.kt */
/* loaded from: classes.dex */
public final class sn3 {
    public final hno a;

    public sn3(hno hnoVar) {
        this.a = hnoVar;
    }

    public static r74 c(NewsEntry newsEntry, NewsEntry newsEntry2, int i, ArticleAttachment articleAttachment) {
        r74 r74Var = new r74(i, articleAttachment, newsEntry, newsEntry2);
        r74Var.h = (ol60) j5g.a0(hp3.a(articleAttachment, new bp5(i, articleAttachment.Ab(), newsEntry2)));
        return r74Var;
    }

    public final r74 a(NewsEntry newsEntry, NewsEntry newsEntry2, int i, ArticleAttachment articleAttachment) {
        r74 r74Var = new r74(i, articleAttachment, newsEntry, newsEntry2);
        r74Var.h = (ol60) j5g.a0(this.a.a().x(new Pair(newsEntry, articleAttachment), new bp5(i, articleAttachment.Ab(), newsEntry2)));
        return r74Var;
    }

    public final r74 b(NewsEntry newsEntry, NewsEntry newsEntry2, int i, ArticleAttachment articleAttachment) {
        r74 r74Var = new r74(i, articleAttachment, newsEntry, newsEntry2);
        r74Var.h = (ol60) j5g.a0(this.a.d().x(new Pair(newsEntry, articleAttachment), new bp5(i, articleAttachment.Ab(), newsEntry2)));
        return r74Var;
    }
}
