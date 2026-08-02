package xsna;

/* compiled from: EnqueueMsgTranslationCmd.kt */
/* loaded from: classes2.dex */
public abstract class gop0 {

    /* compiled from: EnqueueMsgTranslationCmd.kt */
    public static final class a extends gop0 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // xsna.gop0
        public final String a() {
            return this.a;
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
            return ho8.a(new StringBuilder("Auto(appLanguage="), this.a, ')');
        }
    }

    /* compiled from: EnqueueMsgTranslationCmd.kt */
    public static final class b extends gop0 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // xsna.gop0
        public final String a() {
            return this.a + '-' + this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Chosen(fromLanguage=");
            sb.append(this.a);
            sb.append(", toLanguage=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public abstract String a();
}
