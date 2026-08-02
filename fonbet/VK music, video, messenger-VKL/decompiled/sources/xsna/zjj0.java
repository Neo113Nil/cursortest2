package xsna;

/* compiled from: ShowcaseSliderStyle.kt */
/* loaded from: classes16.dex */
public interface zjj0 {

    /* compiled from: ShowcaseSliderStyle.kt */
    public static final class a implements zjj0 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // xsna.zjj0
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Large(withDescription="), this.a, ')');
        }
    }

    /* compiled from: ShowcaseSliderStyle.kt */
    public static final class b implements zjj0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // xsna.zjj0
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Medium(withDescription="), this.a, ')');
        }
    }

    boolean a();
}
