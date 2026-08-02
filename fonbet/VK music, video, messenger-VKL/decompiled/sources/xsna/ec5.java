package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import java.util.ArrayList;

/* compiled from: AuthorSelectionAction.kt */
/* loaded from: classes4.dex */
public interface ec5 extends kj50 {

    /* compiled from: AuthorSelectionAction.kt */
    public static final class a implements ec5 {
        public final PostingAuthorUiModel b;

        public a(PostingAuthorUiModel postingAuthorUiModel) {
            this.b = postingAuthorUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AuthorSelected(author=" + this.b + ')';
        }
    }

    /* compiled from: AuthorSelectionAction.kt */
    public static final class b implements ec5 {
        public final ArrayList b;
        public final PostingAuthorUiModel c;

        public b(ArrayList arrayList, PostingAuthorUiModel postingAuthorUiModel) {
            this.b = arrayList;
            this.c = postingAuthorUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Init(authors=" + this.b + ", selectedAuthor=" + this.c + ')';
        }
    }
}
