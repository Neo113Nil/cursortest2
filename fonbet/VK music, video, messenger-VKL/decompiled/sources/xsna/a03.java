package xsna;

/* compiled from: ApiResponseMock.kt */
/* loaded from: classes2.dex */
public interface a03 {

    /* compiled from: ApiResponseMock.kt */
    public static final class a implements a03 {
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
            return ho8.a(new StringBuilder("File(uri="), this.a, ')');
        }
    }

    /* compiled from: ApiResponseMock.kt */
    public static final class b implements a03 {
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
            return ho8.a(new StringBuilder("Text(body="), this.a, ')');
        }
    }
}
