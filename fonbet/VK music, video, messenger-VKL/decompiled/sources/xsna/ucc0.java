package xsna;

import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: PostingAuthorData.kt */
/* loaded from: classes4.dex */
public final class ucc0 {
    public final PostingAuthor a;
    public final List<PostingAuthor> b;
    public final List<PostingContentType> c;

    public ucc0(PostingAuthor postingAuthor, ListBuilder listBuilder, ListBuilder listBuilder2) {
        this.a = postingAuthor;
        this.b = listBuilder;
        this.c = listBuilder2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucc0)) {
            return false;
        }
        ucc0 ucc0Var = (ucc0) obj;
        return epx.f(this.a, ucc0Var.a) && epx.f(this.b, ucc0Var.b) && epx.f(this.c, ucc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingAuthorData(selectedAuthor=");
        sb.append(this.a);
        sb.append(", availableAuthors=");
        sb.append(this.b);
        sb.append(", contentTypes=");
        return ms9.a(')', sb, this.c);
    }
}
