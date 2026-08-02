package xsna;

import xsna.tlo0;

/* compiled from: ClipsGridBlockButton.kt */
/* loaded from: classes17.dex */
public final class yae {
    public final tlo0.f a;

    public yae(tlo0.f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yae) && this.a.equals(((yae) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return pr.b(new StringBuilder("ClipsGridBlockButton(title="), this.a, ')');
    }
}
