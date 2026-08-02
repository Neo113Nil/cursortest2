package xsna;

/* compiled from: MessageTranslateScreenState.kt */
/* loaded from: classes6.dex */
public abstract class dop0 {

    /* compiled from: MessageTranslateScreenState.kt */
    public static final class a extends dop0 {
        public final CharSequence a;
        public final boolean b;

        public a(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
        }

        public static a a(a aVar, boolean z) {
            CharSequence charSequence = aVar.a;
            aVar.getClass();
            return new a(charSequence, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Translated(translatedText=");
            sb.append((Object) this.a);
            sb.append(", translateAudioPlaying=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: MessageTranslateScreenState.kt */
    public static final class b extends dop0 {
        public static final b a = new b();
    }

    /* compiled from: MessageTranslateScreenState.kt */
    public static final class c extends dop0 {
        public final onp0 a;

        public c(onp0 onp0Var) {
            this.a = onp0Var;
        }
    }
}
