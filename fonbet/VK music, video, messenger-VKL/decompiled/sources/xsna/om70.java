package xsna;

/* compiled from: NspkChooserViewAction.kt */
/* loaded from: classes2.dex */
public abstract class om70 implements kj50 {

    /* compiled from: NspkChooserViewAction.kt */
    public static final class a extends om70 {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnBankClick(id="), this.b, ')');
        }
    }

    /* compiled from: NspkChooserViewAction.kt */
    public static final class b extends om70 {
        public static final b b = new b();
    }

    /* compiled from: NspkChooserViewAction.kt */
    public static final class c extends om70 {
        public static final c b = new c();
    }
}
