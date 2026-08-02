package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;

/* compiled from: AuthorSelectionSideEffect.kt */
/* loaded from: classes4.dex */
public interface nc5 {

    /* compiled from: AuthorSelectionSideEffect.kt */
    public static final class a implements nc5 {
        public final PostingAuthorUiModel a;

        public a(PostingAuthorUiModel postingAuthorUiModel) {
            this.a = postingAuthorUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AuthorSelected(author=" + this.a + ')';
        }
    }

    /* compiled from: AuthorSelectionSideEffect.kt */
    public static final class b implements nc5 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1649296784;
        }

        public final String toString() {
            return "Dismiss";
        }
    }
}
