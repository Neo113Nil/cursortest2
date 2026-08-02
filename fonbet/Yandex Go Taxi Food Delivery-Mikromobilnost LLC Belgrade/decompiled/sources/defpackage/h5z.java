package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class h5z {
    public final Locale a;

    public h5z(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h5z)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return jl40.l(this.a.toLanguageTag(), ((h5z) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
