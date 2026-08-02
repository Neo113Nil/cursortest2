package xsna;

import android.net.Uri;

/* compiled from: HttpMultipartEntry.kt */
/* loaded from: classes15.dex */
public interface xjv {

    /* compiled from: HttpMultipartEntry.kt */
    public static final class a implements xjv {
        public Uri a;
        public String b;

        public final String a() {
            return this.b;
        }

        public final Uri b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "File{fileUri='" + this.a + "'}";
        }
    }

    /* compiled from: HttpMultipartEntry.kt */
    public static final class b implements xjv {
        public String a;

        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return epx.f(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return zr.a("Text{textValue='", this.a, "'}");
        }
    }
}
