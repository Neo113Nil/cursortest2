package xsna;

/* compiled from: ClipsWrapperTooltip.kt */
/* loaded from: classes17.dex */
public interface iuf {

    /* compiled from: ClipsWrapperTooltip.kt */
    public static final class a implements iuf {
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
            return ho8.a(new StringBuilder("AudioRestricted(text="), this.a, ')');
        }
    }
}
