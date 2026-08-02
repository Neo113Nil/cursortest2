package xsna;

/* compiled from: VoiceRecognitionController.kt */
/* loaded from: classes7.dex */
public abstract class bcw0 {

    /* compiled from: VoiceRecognitionController.kt */
    public static final class a {
        public final String a;
        public final icw0 b;

        public a(String str, icw0 icw0Var) {
            this.a = str;
            this.b = icw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "VoiceSearchResult(result=" + this.a + ", sourceType=" + this.b + ')';
        }
    }

    public abstract void a(a aVar);

    public void b() {
    }
}
