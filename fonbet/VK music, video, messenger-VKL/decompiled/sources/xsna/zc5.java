package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import java.util.List;

/* compiled from: AuthorSelectionViewState.kt */
/* loaded from: classes4.dex */
public final class zc5 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: AuthorSelectionViewState.kt */
    public static final class a implements fm50<oc5> {
        public final yzt0<List<PostingAuthorUiModel>> a;
        public final yzt0<PostingAuthorUiModel> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(authors=");
            sb.append(this.a);
            sb.append(", selectedAuthor=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: AuthorSelectionViewState.kt */
    public static final class b implements fm50<oc5> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1970876238;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public zc5(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
