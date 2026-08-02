package xsna;

import android.graphics.Bitmap;

/* compiled from: CoverImageViewState.kt */
/* loaded from: classes7.dex */
public interface u2k {

    /* compiled from: CoverImageViewState.kt */
    public static final class a implements u2k {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 495868262;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: CoverImageViewState.kt */
    public static final class b implements u2k {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Local(path="), this.a, ')');
        }
    }

    /* compiled from: CoverImageViewState.kt */
    public static final class c implements u2k {
        public final Bitmap a;

        public c(Bitmap bitmap) {
            this.a = bitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return qr.c(new StringBuilder("Preview(bitmap="), this.a, ')');
        }
    }

    /* compiled from: CoverImageViewState.kt */
    public static final class d implements u2k {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Remote(url="), this.a, ')');
        }
    }
}
