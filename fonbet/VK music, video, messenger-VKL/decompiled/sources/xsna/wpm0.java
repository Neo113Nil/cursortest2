package xsna;

import xsna.us2;

/* compiled from: StringAnnotation.kt */
@vby
/* loaded from: classes11.dex */
public final class wpm0 implements us2.a {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof wpm0) {
            return epx.f(this.a, ((wpm0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return air.b(')', "StringAnnotation(value=", this.a);
    }
}
