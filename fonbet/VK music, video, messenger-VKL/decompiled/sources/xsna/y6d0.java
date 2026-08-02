package xsna;

import com.vkontakte.android.R;
import kotlin.Triple;

/* compiled from: PrimaryArticlePlaceholderUiDto.kt */
/* loaded from: classes4.dex */
public final class y6d0 extends ol60 {
    public final String h;
    public final String i;
    public final boolean j;
    public final a k;
    public final b l;
    public final boolean m;
    public final ea60 n;

    /* compiled from: PrimaryArticlePlaceholderUiDto.kt */
    public static final class a {
        public final int a;
        public final Integer b;

        public a(int i, Integer num) {
            this.a = i;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(stateIconResId=");
            sb.append(this.a);
            sb.append(", stateTitleResId=");
            return uqi.b(sb, this.b, ')');
        }
    }

    /* compiled from: PrimaryArticlePlaceholderUiDto.kt */
    public static final class b {
        public final Triple<String, Integer, String> a;

        public b(Triple triple) {
            this.a = triple;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.article_protected_action) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OverlayContent(stateMessage=" + this.a + ", stateButtonTextResId=2131952306)";
        }
    }

    public y6d0(String str, String str2, boolean z, a aVar, b bVar, boolean z2, ea60 ea60Var) {
        super(345, 0, 0, 0, ea60Var);
        this.h = str;
        this.i = str2;
        this.j = z;
        this.k = aVar;
        this.l = bVar;
        this.m = z2;
        this.n = ea60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6d0)) {
            return false;
        }
        y6d0 y6d0Var = (y6d0) obj;
        return epx.f(this.h, y6d0Var.h) && epx.f(this.i, y6d0Var.i) && this.j == y6d0Var.j && epx.f(this.k, y6d0Var.k) && epx.f(this.l, y6d0Var.l) && this.m == y6d0Var.m && epx.f(this.n, y6d0Var.n);
    }

    public final int hashCode() {
        String str = this.h;
        int b2 = qoy.b(urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.i), 31, this.j);
        a aVar = this.k;
        int hashCode = (b2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.l;
        int b3 = qoy.b((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.m);
        ea60 ea60Var = this.n;
        return b3 + (ea60Var != null ? ea60Var.hashCode() : 0);
    }

    public final String toString() {
        return "PrimaryArticlePlaceholderUiDto(articleTitle=" + this.h + ", articleAuthorName=" + this.i + ", articleAuthorIsGroup=" + this.j + ", content=" + this.k + ", overlayContent=" + this.l + ", isArticleDisabled=" + this.m + ", testTag=" + this.n + ')';
    }
}
