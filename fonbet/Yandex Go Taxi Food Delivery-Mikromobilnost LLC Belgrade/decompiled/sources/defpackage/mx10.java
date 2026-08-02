package defpackage;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class mx10 {
    public lx10 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mx10.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((mx10) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
