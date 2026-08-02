package defpackage;

import yads.i;

/* loaded from: classes7.dex */
public abstract class gk61 {
    public transient y081 a;
    public transient cw00 b;
    public transient kr71 c;

    public abstract kr71 a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gk61) {
            return ((i) this).a().equals(((i) ((gk61) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().c.hashCode();
    }

    public final String toString() {
        return a().c.toString();
    }
}
