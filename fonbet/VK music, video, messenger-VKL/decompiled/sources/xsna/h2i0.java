package xsna;

/* compiled from: SectionUnavailableEvent.kt */
/* loaded from: classes2.dex */
public abstract class h2i0 extends sxp {

    /* compiled from: SectionUnavailableEvent.kt */
    public static final class a extends h2i0 {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SectionAvailable(section="), this.b, ')');
        }
    }

    /* compiled from: SectionUnavailableEvent.kt */
    public static final class b extends h2i0 {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SectionUnavailable(section="), this.b, ')');
        }
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }
}
