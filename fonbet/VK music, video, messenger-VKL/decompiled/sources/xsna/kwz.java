package xsna;

import java.util.Locale;

/* compiled from: Locale.jvmAndAndroid.kt */
/* loaded from: classes11.dex */
public final class kwz {
    public final Locale a;

    public kwz(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kwz)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return epx.f(this.a.toLanguageTag(), ((kwz) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
