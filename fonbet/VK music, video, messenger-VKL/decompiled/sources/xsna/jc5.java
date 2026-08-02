package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import java.util.ArrayList;

/* compiled from: AuthorSelectionPatch.kt */
/* loaded from: classes4.dex */
public interface jc5 extends xl50 {

    /* compiled from: AuthorSelectionPatch.kt */
    public static final class a implements jc5 {
        public final ArrayList b;
        public final PostingAuthorUiModel c;

        public a(ArrayList arrayList, PostingAuthorUiModel postingAuthorUiModel) {
            this.b = arrayList;
            this.c = postingAuthorUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Init(authors=" + this.b + ", selectedAuthor=" + this.c + ')';
        }
    }
}
