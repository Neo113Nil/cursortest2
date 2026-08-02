package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;

/* compiled from: PostingWithAuthorAction.kt */
/* loaded from: classes4.dex */
public interface kqc0 extends kj50 {

    /* compiled from: PostingWithAuthorAction.kt */
    public static final class a implements kqc0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1707391126;
        }

        public final String toString() {
            return "AuthorClicked";
        }
    }

    /* compiled from: PostingWithAuthorAction.kt */
    public static final class b implements kqc0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2144097277;
        }

        public final String toString() {
            return "AuthorTooltipDismissed";
        }
    }

    /* compiled from: PostingWithAuthorAction.kt */
    public static final class c implements kqc0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -33157306;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PostingWithAuthorAction.kt */
    public static final class d implements kqc0 {
        public final PostingContentType b;
        public final PostingAuthorUiModel c;

        public d(PostingContentType postingContentType, PostingAuthorUiModel postingAuthorUiModel) {
            this.b = postingContentType;
            this.c = postingAuthorUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "ContentTypeClicked(contentType=" + this.b + ", selectedAuthor=" + this.c + ')';
        }
    }

    /* compiled from: PostingWithAuthorAction.kt */
    public static final class e implements kqc0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 830394882;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: PostingWithAuthorAction.kt */
    public static final class f implements kqc0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -19508234;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: PostingWithAuthorAction.kt */
    public static final class g implements kqc0 {
    }
}
