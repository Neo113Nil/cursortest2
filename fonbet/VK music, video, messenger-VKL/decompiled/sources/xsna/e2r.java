package xsna;

import xsna.c2r;

/* compiled from: FeedPatch.kt */
/* loaded from: classes17.dex */
public final class e2r implements c2r.e {
    public final String b;

    public e2r(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2r) && epx.f(this.b, ((e2r) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Single(uniqueKey="), this.b, ')');
    }
}
