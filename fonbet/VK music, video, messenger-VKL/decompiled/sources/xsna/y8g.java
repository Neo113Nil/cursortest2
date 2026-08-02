package xsna;

/* compiled from: ColorVariant.kt */
/* loaded from: classes4.dex */
public interface y8g {

    /* compiled from: ColorVariant.kt */
    public static final class a {
        public static final c a = new c(0);
    }

    /* compiled from: ColorVariant.kt */
    public static final class b implements y8g {
    }

    /* compiled from: ColorVariant.kt */
    public static final class c implements y8g {
        public final int a;
        public final int b;

        public c(int i) {
            this.a = i;
            this.b = i;
        }

        @Override // xsna.y8g
        public final int a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return tgw.b(this.a, "Simple(color=", ")");
        }
    }

    int a();
}
