package defpackage;

import java.util.Map;

/* loaded from: classes9.dex */
public final class m5x implements j5x {
    public final Map a;

    public m5x(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5x) && this.a.equals(((m5x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("JasonObject(content="), this.a, ')');
    }
}
