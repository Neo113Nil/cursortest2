package xsna;

/* compiled from: DialogsFabNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class lpm implements vl50 {

    /* compiled from: DialogsFabNavigationEvent.kt */
    public static final class a extends lpm {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
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
            return defpackage.q0.a(new StringBuilder("CreateDialogEvent(needShowPersChanOnboarding="), this.a, ')');
        }
    }
}
