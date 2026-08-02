package defpackage;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class fx10 {
    public Boolean a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx10.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((fx10) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
