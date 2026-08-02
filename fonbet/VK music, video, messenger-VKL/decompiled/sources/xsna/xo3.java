package xsna;

import com.vk.dto.articles.Article;

/* compiled from: ArticlePickerPatch.kt */
/* loaded from: classes5.dex */
public abstract class xo3 implements xl50 {

    /* compiled from: ArticlePickerPatch.kt */
    public static abstract class a extends xo3 {

        /* compiled from: ArticlePickerPatch.kt */
        /* renamed from: xsna.xo3$a$a, reason: collision with other inner class name */
        public static final class C4026a extends a {
            public final ewp b;

            public C4026a(ewp ewpVar) {
                this.b = ewpVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4026a) && epx.f(this.b, ((C4026a) obj).b);
            }

            public final int hashCode() {
                return this.b.a.hashCode();
            }

            public final String toString() {
                return "Error(throwable=" + this.b + ')';
            }
        }

        /* compiled from: ArticlePickerPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }

        /* compiled from: ArticlePickerPatch.kt */
        public static final class c extends a {
            public final wia0<Article> b;

            public c(wia0<Article> wia0Var) {
                this.b = wia0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(article=" + this.b + ')';
            }
        }
    }
}
