package one.video.calls.sdk.upload;

import xsna.epx;
import xsna.zr;

/* loaded from: classes8.dex */
public interface d {

    public static final class a implements d {
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
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return zr.a("Error(reason=", this.a, ")");
        }
    }

    public static final class b implements d {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2019914456;
        }

        public final String toString() {
            return "Success";
        }
    }
}
