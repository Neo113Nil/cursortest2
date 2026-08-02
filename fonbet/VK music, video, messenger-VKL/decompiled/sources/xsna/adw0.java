package xsna;

/* compiled from: VoipAdminChangeNameAction.kt */
/* loaded from: classes7.dex */
public abstract class adw0 implements kj50 {

    /* compiled from: VoipAdminChangeNameAction.kt */
    public static final class a extends adw0 {
        public static final a b = new a();
    }

    /* compiled from: VoipAdminChangeNameAction.kt */
    public static abstract class b extends adw0 {

        /* compiled from: VoipAdminChangeNameAction.kt */
        public static final class a extends b {
            public static final a b = new a();
        }

        /* compiled from: VoipAdminChangeNameAction.kt */
        /* renamed from: xsna.adw0$b$b, reason: collision with other inner class name */
        public static final class C2537b extends b {
            public final String b;

            public C2537b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2537b) && epx.f(this.b, ((C2537b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("NameChanged(name="), this.b, ')');
            }
        }
    }

    /* compiled from: VoipAdminChangeNameAction.kt */
    public static final class c extends adw0 {
        public static final c b = new c();
    }

    /* compiled from: VoipAdminChangeNameAction.kt */
    public static abstract class d extends adw0 {

        /* compiled from: VoipAdminChangeNameAction.kt */
        public static final class a extends d {
            public static final a b = new a();
        }
    }
}
