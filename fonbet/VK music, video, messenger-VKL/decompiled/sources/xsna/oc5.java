package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AuthorSelectionState.kt */
/* loaded from: classes4.dex */
public final class oc5 implements km50 {
    public final List<PostingAuthorUiModel> b;
    public final PostingAuthorUiModel c;

    public oc5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc5)) {
            return false;
        }
        oc5 oc5Var = (oc5) obj;
        return epx.f(this.b, oc5Var.b) && epx.f(this.c, oc5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        PostingAuthorUiModel postingAuthorUiModel = this.c;
        return hashCode + (postingAuthorUiModel == null ? 0 : postingAuthorUiModel.hashCode());
    }

    public final String toString() {
        return "AuthorSelectionState(authors=" + this.b + ", selectedAuthor=" + this.c + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oc5(List<? extends PostingAuthorUiModel> list, PostingAuthorUiModel postingAuthorUiModel) {
        this.b = list;
        this.c = postingAuthorUiModel;
    }

    public oc5(int i) {
        this(EmptyList.b, null);
    }
}
