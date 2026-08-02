package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingNavigationState;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class rjc0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final PostingContext b;
    public final PostEditingReason c;
    public final PostingNavigationState d;
    public final PostEditableData e;
    public final PostEditableData f;

    public rjc0(PostingContext postingContext, PostEditingReason postEditingReason, PostingNavigationState postingNavigationState, PostEditableData postEditableData, PostEditableData postEditableData2) {
        this.b = postingContext;
        this.c = postEditingReason;
        this.d = postingNavigationState;
        this.e = postEditableData;
        this.f = postEditableData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjc0)) {
            return false;
        }
        rjc0 rjc0Var = (rjc0) obj;
        return epx.f(this.b, rjc0Var.b) && epx.f(this.c, rjc0Var.c) && epx.f(this.d, rjc0Var.d) && epx.f(this.e, rjc0Var.e) && epx.f(this.f, rjc0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d.b)) * 31);
    }

    public final String toString() {
        return "EditableDataLoaded(context=" + this.b + ", editingReason=" + this.c + ", navigationState=" + this.d + ", data=" + this.e + ", snapshotEditableData=" + this.f + ')';
    }
}
