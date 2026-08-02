package xsna;

/* compiled from: AccountSettings.kt */
/* loaded from: classes5.dex */
public abstract class ls {

    /* compiled from: AccountSettings.kt */
    public static final class a extends ls {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

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
            return defpackage.q0.a(new StringBuilder("ClosedProfile(isClosed="), this.a, ')');
        }
    }
}
