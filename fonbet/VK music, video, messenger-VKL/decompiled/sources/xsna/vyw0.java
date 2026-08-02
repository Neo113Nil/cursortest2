package xsna;

/* compiled from: VoipScreenShareAction.kt */
/* loaded from: classes7.dex */
public abstract class vyw0 implements kj50 {

    /* compiled from: VoipScreenShareAction.kt */
    public static final class a extends vyw0 {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FastScreenShareAction(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: VoipScreenShareAction.kt */
    public static final class b extends vyw0 {
        public static final b b = new b();
    }

    /* compiled from: VoipScreenShareAction.kt */
    public static final class c extends vyw0 {
        public static final c b = new c();
    }
}
