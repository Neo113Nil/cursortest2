package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class dkc0 implements ekc0 {
    public final HashSet a;

    public dkc0(HashSet hashSet) {
        this.a = hashSet;
    }

    public final Set a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkc0) && this.a.equals(((dkc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetArg(value=" + this.a + ')';
    }
}
