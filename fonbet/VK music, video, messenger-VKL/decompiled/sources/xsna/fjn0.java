package xsna;

import java.util.List;
import java.util.Locale;

/* compiled from: SupportedLanguagesGetCmd.kt */
/* loaded from: classes2.dex */
public final class fjn0 {
    public final Locale a;
    public final List<Locale> b;

    public fjn0(Locale locale, List<Locale> list) {
        this.a = locale;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjn0)) {
            return false;
        }
        fjn0 fjn0Var = (fjn0) obj;
        return epx.f(this.a, fjn0Var.a) && epx.f(this.b, fjn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SupportedLanguagesGetResult(originalLanguage=");
        sb.append(this.a);
        sb.append(", supportedTranslationPairs=");
        return ms9.a(')', sb, this.b);
    }
}
