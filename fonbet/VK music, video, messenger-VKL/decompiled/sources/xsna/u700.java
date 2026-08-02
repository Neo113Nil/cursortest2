package xsna;

/* compiled from: LottieCompositionSpec.kt */
/* loaded from: classes12.dex */
public interface u700 {

    /* compiled from: LottieCompositionSpec.kt */
    @vby
    public static final class a implements u700 {
        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Asset(assetName=null)";
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @vby
    public static final class b implements u700 {
        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ContentProvider(uri=null)";
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @vby
    public static final class c implements u700 {
        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "File(fileName=null)";
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @vby
    public static final class d implements u700 {
        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "JsonString(jsonString=null)";
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @vby
    public static final class e implements u700 {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.a == ((e) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return tgw.b(this.a, "RawRes(resId=", ")");
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @vby
    public static final class f implements u700 {
        public final String a;

        public final boolean equals(Object obj) {
            if (obj instanceof f) {
                return epx.f(this.a, ((f) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return zr.a("Url(url=", this.a, ")");
        }
    }
}
