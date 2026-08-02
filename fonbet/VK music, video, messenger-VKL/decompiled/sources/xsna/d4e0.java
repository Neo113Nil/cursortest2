package xsna;

/* compiled from: Project.kt */
/* loaded from: classes6.dex */
public abstract class d4e0 {
    public final String a;

    /* compiled from: Project.kt */
    public static final class a extends d4e0 {
        public final String b;

        public a(String str) {
            super(str);
            this.b = str;
        }

        @Override // xsna.d4e0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Custom(projectId="), this.b, ')');
        }
    }

    /* compiled from: Project.kt */
    public static final class b extends d4e0 {
        public static final b b = new b("vk");
    }

    public d4e0(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
