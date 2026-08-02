package xsna;

import java.util.Locale;

/* compiled from: TranslateMode.kt */
/* loaded from: classes6.dex */
public abstract class wnp0 {

    /* compiled from: TranslateMode.kt */
    public static final class a extends wnp0 {
        public static final a a = new a();
    }

    /* compiled from: TranslateMode.kt */
    public static final class b extends wnp0 {
        public final Locale a;
        public final Locale b;

        public b(Locale locale, Locale locale2) {
            this.a = locale;
            this.b = locale2;
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
            return "SelectedLanguage(originalLanguage=" + this.a + ", translatedLanguage=" + this.b + ')';
        }
    }
}
