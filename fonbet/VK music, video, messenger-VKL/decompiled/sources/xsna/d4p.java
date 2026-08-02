package xsna;

/* compiled from: EditorImageFileSaver.kt */
/* loaded from: classes4.dex */
public interface d4p {

    /* compiled from: EditorImageFileSaver.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return zr.a("FileInfo(absolutePath=", this.a, ")");
        }
    }
}
