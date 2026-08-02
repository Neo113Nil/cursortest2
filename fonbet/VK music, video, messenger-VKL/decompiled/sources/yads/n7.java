package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class n7 extends Throwable {
    public final String b;

    public n7(String str) {
        super(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7) && epx.f(this.b, ((n7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return xsna.zr.a("AdPresentationError(description=", this.b, ")");
    }
}
