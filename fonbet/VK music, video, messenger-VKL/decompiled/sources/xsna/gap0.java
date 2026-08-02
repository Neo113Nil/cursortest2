package xsna;

import xsna.rmw;

/* compiled from: TopshelfCardBackgroundState.kt */
/* loaded from: classes2.dex */
public final class gap0 {
    public final rmw.d a;

    public gap0(rmw.d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gap0) && this.a.equals(((gap0) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "StaticImage(image=" + this.a + ')';
    }
}
