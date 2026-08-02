package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;

/* compiled from: PostingWithAuthorSideEffect.kt */
/* loaded from: classes4.dex */
public interface rqc0 {

    /* compiled from: PostingWithAuthorSideEffect.kt */
    public static final class a implements rqc0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 897333994;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: PostingWithAuthorSideEffect.kt */
    public static final class b implements rqc0 {
        public final vcc0 a;

        public b(vcc0 vcc0Var) {
            this.a = vcc0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenAuthorSelection(data=" + this.a + ')';
        }
    }

    /* compiled from: PostingWithAuthorSideEffect.kt */
    public static final class c implements rqc0 {
        public final PostingContentType a;
        public final PostingAuthorUiModel b;

        public c(PostingContentType postingContentType, PostingAuthorUiModel postingAuthorUiModel) {
            this.a = postingContentType;
            this.b = postingAuthorUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenPosting(contentType=" + this.a + ", author=" + this.b + ')';
        }
    }
}
