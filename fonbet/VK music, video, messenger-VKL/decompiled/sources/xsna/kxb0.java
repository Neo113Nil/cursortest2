package xsna;

/* compiled from: PopupSettingsAction.kt */
/* loaded from: classes6.dex */
public abstract class kxb0 implements kj50 {

    /* compiled from: PopupSettingsAction.kt */
    public static final class a extends kxb0 {
        public static final a b = new a();
    }

    /* compiled from: PopupSettingsAction.kt */
    public static final class b extends kxb0 {
        public static final b b = new b();
    }

    /* compiled from: PopupSettingsAction.kt */
    public static final class c extends kxb0 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetAnimationAutoplayOnGet(value="), this.b, ')');
        }
    }

    /* compiled from: PopupSettingsAction.kt */
    public static final class d extends kxb0 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetAnimationAutoplayOnSend(value="), this.b, ')');
        }
    }
}
