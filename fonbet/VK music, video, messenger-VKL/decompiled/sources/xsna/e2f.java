package xsna;

import java.util.List;

/* compiled from: ClipsSavedInterests.kt */
/* loaded from: classes18.dex */
public final class e2f {
    public final boolean a;
    public final boolean b;
    public final List<Integer> c;

    public e2f(boolean z, boolean z2, List<Integer> list) {
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2f)) {
            return false;
        }
        e2f e2fVar = (e2f) obj;
        return this.a == e2fVar.a && this.b == e2fVar.b && epx.f(this.c, e2fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsSavedInterests(needUpdate=");
        sb.append(this.a);
        sb.append(", nestedAvailable=");
        sb.append(this.b);
        sb.append(", interestsIds=");
        return ms9.a(')', sb, this.c);
    }
}
