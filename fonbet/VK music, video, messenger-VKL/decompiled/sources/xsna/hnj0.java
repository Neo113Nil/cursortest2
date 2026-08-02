package xsna;

/* compiled from: SilentModeBusEvent.kt */
/* loaded from: classes5.dex */
public abstract class hnj0 {

    /* compiled from: SilentModeBusEvent.kt */
    public static final class a extends hnj0 {
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
            return defpackage.q0.a(new StringBuilder("SilentModeMiniAppClosed(isEnabled="), this.a, ')');
        }
    }
}
