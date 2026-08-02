package xsna;

/* compiled from: BroadcastConfigViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class le8 {

    /* compiled from: BroadcastConfigViewEvent.kt */
    public static final class a extends le8 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ChangeOwner(ownerId="), this.a, ')');
        }
    }

    /* compiled from: BroadcastConfigViewEvent.kt */
    public static final class b extends le8 {
        public final ffw0 a;

        public b(ffw0 ffw0Var) {
            this.a = ffw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangePrivacy(privacy=" + this.a + ')';
        }
    }

    /* compiled from: BroadcastConfigViewEvent.kt */
    public static final class c extends le8 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ChangeTitle(title="), this.a, ')');
        }
    }

    /* compiled from: BroadcastConfigViewEvent.kt */
    public static final class d extends le8 {
        public static final d a = new d();
    }

    /* compiled from: BroadcastConfigViewEvent.kt */
    public static final class e extends le8 {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Reload(isCallRecord="), this.a, ')');
        }
    }

    /* compiled from: BroadcastConfigViewEvent.kt */
    public static final class f extends le8 {
        public static final f a = new f();
    }
}
