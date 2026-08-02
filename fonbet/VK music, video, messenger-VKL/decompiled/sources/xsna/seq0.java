package xsna;

import xsna.us2;

/* compiled from: UrlAnnotation.kt */
@ozl
/* loaded from: classes11.dex */
public final class seq0 implements us2.a {
    public final String a;

    public seq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof seq0) {
            return epx.f(this.a, ((seq0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
