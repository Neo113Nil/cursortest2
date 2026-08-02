package xsna;

/* compiled from: PickerRootPatch.kt */
/* loaded from: classes5.dex */
public abstract class lia0 implements xl50 {

    /* compiled from: PickerRootPatch.kt */
    public static final class a extends lia0 {
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
            return vu5.b(new StringBuilder("UpdatePositionTabSelected(position="), this.b, ')');
        }
    }
}
