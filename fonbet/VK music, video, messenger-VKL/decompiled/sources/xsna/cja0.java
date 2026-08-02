package xsna;

/* compiled from: PickingAction.kt */
/* loaded from: classes17.dex */
public interface cja0 extends kj50 {

    /* compiled from: PickingAction.kt */
    public static final class a implements cja0 {
        public static final a b = new a();
    }

    /* compiled from: PickingAction.kt */
    public static final class b implements cja0 {
        public static final b b = new b();
    }

    /* compiled from: PickingAction.kt */
    public static final class c implements cja0 {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Pick(index="), this.b, ')');
        }
    }
}
