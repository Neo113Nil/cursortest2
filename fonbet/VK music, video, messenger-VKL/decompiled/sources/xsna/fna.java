package xsna;

/* compiled from: ClipUploadItem.kt */
/* loaded from: classes17.dex */
public interface fna {

    /* compiled from: ClipUploadItem.kt */
    public static final class a implements fna {
        public final jai a;

        public a(jai jaiVar) {
            this.a = jaiVar;
        }
    }

    /* compiled from: ClipUploadItem.kt */
    @vby
    public static final class b implements fna {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a == ((b) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return uqi.a("DrawableWrapper(resId=", this.a, ')');
        }
    }

    /* compiled from: ClipUploadItem.kt */
    public static final class c implements fna {
        public final lq2 a;

        public c(lq2 lq2Var) {
            this.a = lq2Var;
        }
    }
}
