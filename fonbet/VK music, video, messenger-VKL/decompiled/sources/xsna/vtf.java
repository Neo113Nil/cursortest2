package xsna;

import xsna.ttf;

/* compiled from: ClipsWrapperStatePatch.kt */
/* loaded from: classes17.dex */
public final class vtf implements ttf.b {
    public final boolean b;

    public vtf(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtf) && this.b == ((vtf) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ChangeMoreVisibility(isVisible="), this.b, ')');
    }
}
