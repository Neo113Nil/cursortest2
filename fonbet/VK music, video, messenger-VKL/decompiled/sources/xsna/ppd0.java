package xsna;

/* compiled from: ProductLabel.kt */
/* loaded from: classes18.dex */
public abstract class ppd0 {

    /* compiled from: ProductLabel.kt */
    public static final class a extends ppd0 {
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
            return ho8.a(new StringBuilder("OpenUrl(url="), this.a, ')');
        }
    }
}
