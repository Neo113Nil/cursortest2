package xsna;

/* compiled from: LibverifyAction.kt */
/* loaded from: classes6.dex */
public abstract class w2z {

    /* compiled from: LibverifyAction.kt */
    public static final class a extends w2z {
        public static final a a = new a();
    }

    /* compiled from: LibverifyAction.kt */
    public static final class b extends w2z {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("CheckCode(code="), this.a, ')');
        }
    }

    /* compiled from: LibverifyAction.kt */
    public static final class c extends w2z {
        public static final c a = new c();
    }

    /* compiled from: LibverifyAction.kt */
    public static final class d extends w2z {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Start(phoneHash="), this.a, ')');
        }
    }
}
