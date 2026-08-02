package xsna;

/* compiled from: ArticleEditorUpdateInteractor.kt */
/* loaded from: classes15.dex */
public abstract class r7q0 {

    /* compiled from: ArticleEditorUpdateInteractor.kt */
    public static final class a extends r7q0 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return epx.f(this.a, aVar.a);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(true) * 31;
            String str = this.a;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ArticleEditorMiniAppClosed(needUpdate=true, updatedLink="), this.a, ')');
        }
    }
}
